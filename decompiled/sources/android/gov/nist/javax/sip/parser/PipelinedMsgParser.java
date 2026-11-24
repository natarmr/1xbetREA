package android.gov.nist.javax.sip.parser;

import a.ohq;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel;
import android.gov.nist.javax.sip.stack.QueuedMessageDispatchBase;
import android.gov.nist.javax.sip.stack.SIPEventInterceptor;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class PipelinedMsgParser implements Runnable {
    private static final String CRLF = "\r\n";
    private static StackLogger logger = CommonLogger.getLogger(PipelinedMsgParser.class);
    private static int uid = 0;
    boolean isRunning;
    private int maxMessageSize;
    private ConcurrentHashMap<String, CallIDOrderingStructure> messagesOrderingMap;
    private Thread mythread;
    private Pipeline rawInputStream;
    protected SIPMessageListener sipMessageListener;
    private SIPTransactionStack sipStack;
    private int sizeCounter;
    private MessageParser smp;

    public class CallIDOrderingStructure {
        private Semaphore semaphore = new Semaphore(1, true);
        private Queue<SIPMessage> messagesForCallID = new ConcurrentLinkedQueue();

        public CallIDOrderingStructure() {
        }

        public Queue<SIPMessage> getMessagesForCallID() {
            return this.messagesForCallID;
        }

        public Semaphore getSemaphore() {
            return this.semaphore;
        }
    }

    public class Dispatch implements Runnable, QueuedMessageDispatchBase {
        CallIDOrderingStructure callIDOrderingStructure;
        String callId;
        long time = System.currentTimeMillis();

        public Dispatch(CallIDOrderingStructure callIDOrderingStructure, String str) {
            this.callIDOrderingStructure = callIDOrderingStructure;
            this.callId = str;
        }

        @Override // android.gov.nist.javax.sip.stack.QueuedMessageDispatchBase
        public long getReceptionTime() {
            return this.time;
        }

        @Override // java.lang.Runnable
        public void run() {
            Semaphore semaphore = this.callIDOrderingStructure.getSemaphore();
            Queue<SIPMessage> messagesForCallID = this.callIDOrderingStructure.getMessagesForCallID();
            if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                PipelinedMsgParser.this.sipStack.sipEventInterceptor.beforeMessage(messagesForCallID.peek());
            }
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                PipelinedMsgParser.logger.logError("Semaphore acquisition for callId " + this.callId + " interrupted", e);
            }
            SIPMessage sIPMessagePoll = messagesForCallID.poll();
            if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                PipelinedMsgParser.logger.logDebug("semaphore acquired for message " + sIPMessagePoll);
            }
            try {
                try {
                    PipelinedMsgParser.this.sipMessageListener.processMessage(sIPMessagePoll);
                    if (messagesForCallID.size() <= 0) {
                        PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                        if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                            PipelinedMsgParser.logger.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                        }
                    }
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        PipelinedMsgParser.logger.logDebug("releasing semaphore for message " + sIPMessagePoll);
                    }
                    semaphore.release();
                    if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                        synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                            PipelinedMsgParser.this.messagesOrderingMap.notify();
                        }
                    }
                    if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                        PipelinedMsgParser.this.sipStack.sipEventInterceptor.afterMessage(sIPMessagePoll);
                    }
                } catch (Exception e2) {
                    PipelinedMsgParser.logger.logError("Error occured processing message", e2);
                    if (messagesForCallID.size() <= 0) {
                        PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                        if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                            PipelinedMsgParser.logger.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                        }
                    }
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        PipelinedMsgParser.logger.logDebug("releasing semaphore for message " + sIPMessagePoll);
                    }
                    semaphore.release();
                    if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                        synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                            PipelinedMsgParser.this.messagesOrderingMap.notify();
                        }
                    }
                    if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                    }
                }
                if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                    PipelinedMsgParser.logger.logDebug("dispatch task done on " + sIPMessagePoll + " threadname " + PipelinedMsgParser.this.mythread.getName());
                }
            } catch (Throwable th) {
                if (messagesForCallID.size() <= 0) {
                    PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        PipelinedMsgParser.logger.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                    }
                }
                if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                    PipelinedMsgParser.logger.logDebug("releasing semaphore for message " + sIPMessagePoll);
                }
                semaphore.release();
                if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                    synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                        PipelinedMsgParser.this.messagesOrderingMap.notify();
                    }
                }
                if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                    PipelinedMsgParser.this.sipStack.sipEventInterceptor.afterMessage(sIPMessagePoll);
                }
                throw th;
            }
        }
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, SIPMessageListener sIPMessageListener, Pipeline pipeline, boolean z, int i) {
        this();
        this.sipStack = sIPTransactionStack;
        this.smp = sIPTransactionStack.getMessageParserFactory().createMessageParser(sIPTransactionStack);
        this.sipMessageListener = sIPMessageListener;
        this.rawInputStream = pipeline;
        this.maxMessageSize = i;
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setName("PipelineThread-" + getNewUid());
    }

    private void cleanMessageOrderingMap() {
        this.messagesOrderingMap.clear();
        synchronized (this.messagesOrderingMap) {
            this.messagesOrderingMap.notifyAll();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("cleaned the messagesOrderingMap " + this + " threadname " + this.mythread.getName());
        }
    }

    private static synchronized int getNewUid() {
        int i;
        i = uid;
        uid = i + 1;
        return i;
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i = 1024;
        byte[] bArr = new byte[1024];
        byte[] bArr2 = new byte[2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                ohq.l("End of stream");
                return null;
            }
            int i5 = i4 & 255;
            char c = (char) i5;
            if (this.maxMessageSize > 0) {
                int i6 = this.sizeCounter - 1;
                this.sizeCounter = i6;
                if (i6 <= 0) {
                    ohq.l("Max size exceeded!");
                    return null;
                }
            }
            if (c != '\r') {
                bArr[i2] = (byte) i5;
                i2++;
            } else if (i2 == 0) {
                bArr2[i3] = 13;
                i3++;
            }
            if (c == '\n') {
                if (i2 == 1 && i3 > 0) {
                    bArr2[i3] = 10;
                    i3++;
                }
                return (i2 != 1 || i3 <= 0) ? new String(bArr, 0, i2, "UTF-8") : new String(bArr2, 0, i3, "UTF-8");
            }
            if (i2 == i) {
                int i7 = i + 1024;
                byte[] bArr3 = new byte[i7];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                i = i7;
                bArr = bArr3;
            }
        }
    }

    public Object clone() {
        PipelinedMsgParser pipelinedMsgParser = new PipelinedMsgParser();
        pipelinedMsgParser.rawInputStream = this.rawInputStream;
        pipelinedMsgParser.sipMessageListener = this.sipMessageListener;
        new Thread(pipelinedMsgParser).setName("PipelineThread");
        return pipelinedMsgParser;
    }

    public void close() {
        this.isRunning = false;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Closing pipelinedmsgparser " + this + " threadname " + this.mythread.getName());
        }
        try {
            this.rawInputStream.close();
        } catch (IOException unused) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Couldn't close the rawInputStream " + this + " threadname " + this.mythread.getName() + " already closed ? " + this.rawInputStream.isClosed());
            }
        }
        if (PostParseExecutorServices.getPostParseExecutor() != null) {
            cleanMessageOrderingMap();
            synchronized (this.mythread) {
                this.mythread.notifyAll();
                this.mythread.interrupt();
            }
        }
    }

    public void processInput() {
        this.mythread.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        String line;
        String line2;
        byte[] bytes;
        Pipeline pipeline = this.rawInputStream;
        StackLogger stackLogger = logger;
        try {
            this.isRunning = true;
            while (this.isRunning) {
                this.sizeCounter = this.maxMessageSize;
                StringBuilder sb = new StringBuilder();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Starting to parse.");
                }
                int i = 0;
                while (true) {
                    boolean z = false;
                    while (true) {
                        try {
                            line = readLine(pipeline);
                            if (!line.equals(Separators.RETURN)) {
                                if (!"\r\n".equals(line)) {
                                    break;
                                }
                                if (z) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("KeepAlive Double CRLF received, sending single CRLF as defined per RFC 5626 Section 4.4.1");
                                        logger.logDebug("~~~ setting isPreviousLineCRLF=false");
                                    }
                                    try {
                                        this.sipMessageListener.sendSingleCLRF();
                                    } catch (Exception e) {
                                        logger.logError("A problem occured while trying to send a single CLRF in response to a double CLRF", e);
                                    }
                                } else {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Received CRLF");
                                    }
                                    SIPMessageListener sIPMessageListener = this.sipMessageListener;
                                    if (sIPMessageListener != null && (sIPMessageListener instanceof ConnectionOrientedMessageChannel)) {
                                        ((ConnectionOrientedMessageChannel) sIPMessageListener).cancelPingKeepAliveTimeoutTaskIfStarted();
                                    }
                                    z = true;
                                }
                            } else if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Discarding blank line");
                            }
                        } catch (IOException unused) {
                            if (PostParseExecutorServices.getPostParseExecutor() != null && this.isRunning) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("waiting for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                }
                                synchronized (this.messagesOrderingMap) {
                                    try {
                                        this.messagesOrderingMap.wait(64000L);
                                    } catch (InterruptedException unused2) {
                                    }
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("got notified for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                    }
                                }
                            }
                            this.rawInputStream.stopTimer();
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("thread ending for threadname " + this.mythread.getName());
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logStackTrace(32);
                            }
                            cleanMessageOrderingMap();
                            if (pipeline.isClosed()) {
                                return;
                            }
                        }
                    }
                }
                sb.append(line);
                this.rawInputStream.startTimer();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Reading Input stream.");
                }
                int length = 0;
                do {
                    try {
                        try {
                            line2 = readLine(pipeline);
                            length += line2.length();
                            int i2 = this.maxMessageSize;
                            if (i2 > 0 && length > i2 / 2) {
                                throw new IOException("Pre-content-length headers size exceeded. The size of the message of the headers prior to Content-Length is too large. This must be an invalid message. Limit is MAX_MESSAGE_SIZE/2=" + (this.maxMessageSize / 2));
                            }
                            sb.append(line2);
                        } catch (IOException e2) {
                            InternalErrorHandler.handleException(e2);
                            return;
                        }
                    } catch (IOException unused3) {
                        if (PostParseExecutorServices.getPostParseExecutor() != null && this.isRunning) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("waiting for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                            }
                            synchronized (this.messagesOrderingMap) {
                                try {
                                    this.messagesOrderingMap.wait(64000L);
                                } catch (InterruptedException unused4) {
                                }
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("got notified for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                }
                            }
                        }
                        this.rawInputStream.stopTimer();
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("thread ending for threadname " + this.mythread.getName());
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logStackTrace(32);
                        }
                        cleanMessageOrderingMap();
                        if (pipeline.isClosed()) {
                            return;
                        }
                        pipeline.close();
                    }
                } while (!line2.trim().equals(""));
                this.rawInputStream.stopTimer();
                sb.append(line2);
                try {
                    if (stackLogger.isLoggingEnabled(32)) {
                        stackLogger.logDebug("About to parse : " + sb.toString());
                    }
                    try {
                        bytes = sb.toString().getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused5) {
                        bytes = sb.toString().getBytes();
                    }
                    SIPMessage sIPMessage = this.smp.parseSIPMessage(bytes, false, false, this.sipMessageListener);
                    if (sIPMessage == null) {
                        this.rawInputStream.stopTimer();
                    } else {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Completed parsing message");
                        }
                        String headerAsFormattedString = sIPMessage.getHeaderAsFormattedString("Content-Length");
                        if (headerAsFormattedString.length() > 30) {
                            throw new RuntimeException("Bad content lenght header " + headerAsFormattedString);
                        }
                        ContentLength contentLength = (ContentLength) sIPMessage.getContentLength();
                        int contentLength2 = contentLength != null ? contentLength.getContentLength() : 0;
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Content length = " + contentLength2);
                        }
                        int i3 = this.maxMessageSize;
                        if (i3 > 0 && contentLength2 > i3) {
                            throw new RuntimeException("Max content size Exceeded! :" + contentLength2 + " allowed max size is " + this.maxMessageSize);
                        }
                        if (contentLength2 == 0) {
                            sIPMessage.removeContent();
                        } else if (i3 == 0 || contentLength2 < this.sizeCounter) {
                            byte[] bArr = new byte[contentLength2];
                            while (i < contentLength2) {
                                this.rawInputStream.startTimer();
                                try {
                                    try {
                                        int i4 = pipeline.read(bArr, i, contentLength2 - i);
                                        Pipeline pipeline2 = this.rawInputStream;
                                        if (i4 <= 0) {
                                            pipeline2.stopTimer();
                                            break;
                                        } else {
                                            i += i4;
                                            pipeline2.stopTimer();
                                        }
                                    } catch (IOException e3) {
                                        stackLogger.logError("Exception Reading Content", e3);
                                        this.rawInputStream.stopTimer();
                                    }
                                } catch (Throwable th) {
                                    this.rawInputStream.stopTimer();
                                    throw th;
                                }
                            }
                            sIPMessage.setMessageContent(bArr);
                        }
                        if (this.sipMessageListener != null) {
                            try {
                                if (PostParseExecutorServices.getPostParseExecutor() == null) {
                                    SIPEventInterceptor sIPEventInterceptor = this.sipStack.sipEventInterceptor;
                                    if (sIPEventInterceptor != null) {
                                        sIPEventInterceptor.beforeMessage(sIPMessage);
                                    }
                                    this.sipMessageListener.processMessage(sIPMessage);
                                    SIPEventInterceptor sIPEventInterceptor2 = this.sipStack.sipEventInterceptor;
                                    if (sIPEventInterceptor2 != null) {
                                        sIPEventInterceptor2.afterMessage(sIPMessage);
                                    }
                                } else {
                                    String callId = sIPMessage.getCallId().getCallId();
                                    CallIDOrderingStructure callIDOrderingStructure = this.messagesOrderingMap.get(callId);
                                    if (callIDOrderingStructure == null) {
                                        callIDOrderingStructure = new CallIDOrderingStructure();
                                        CallIDOrderingStructure callIDOrderingStructurePutIfAbsent = this.messagesOrderingMap.putIfAbsent(callId, callIDOrderingStructure);
                                        if (callIDOrderingStructurePutIfAbsent != null) {
                                            callIDOrderingStructure = callIDOrderingStructurePutIfAbsent;
                                        } else if (stackLogger.isLoggingEnabled(32)) {
                                            stackLogger.logDebug("new CallIDOrderingStructure added for message " + sIPMessage);
                                        }
                                    }
                                    callIDOrderingStructure.getMessagesForCallID().offer(sIPMessage);
                                    PostParseExecutorServices.getPostParseExecutor().execute(new Dispatch(callIDOrderingStructure, callId));
                                }
                            } catch (Exception unused6) {
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (ParseException e4) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Detected a parsing issue " + sb.toString() + Separators.SP + e4.getMessage());
                    }
                }
            }
            cleanMessageOrderingMap();
            if (pipeline.isClosed()) {
                return;
            }
            pipeline.close();
        } catch (Throwable th2) {
            try {
                cleanMessageOrderingMap();
                if (!pipeline.isClosed()) {
                    pipeline.close();
                }
            } catch (IOException e5) {
                InternalErrorHandler.handleException(e5);
            }
            throw th2;
        }
    }

    public void setMessageListener(SIPMessageListener sIPMessageListener) {
        this.sipMessageListener = sIPMessageListener;
    }

    public PipelinedMsgParser() {
        this.smp = null;
        this.messagesOrderingMap = new ConcurrentHashMap<>();
        this.isRunning = false;
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, SIPMessageListener sIPMessageListener, Pipeline pipeline, int i) {
        this(sIPTransactionStack, sIPMessageListener, pipeline, false, i);
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, Pipeline pipeline) {
        this(sIPTransactionStack, null, pipeline, false, 0);
    }
}
