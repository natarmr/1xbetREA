package android.gov.nist.javax.sip.stack;

import a.b1j;
import a.kng0;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.javax.sip.IOExceptionEvent;
import android.javax.sip.SipListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class UDPMessageProcessor extends MessageProcessor implements Runnable {
    private static final int HIGHWAT = 5000;
    private static final int LOWAT = 2500;
    private static final int MAX_EXCEPTIONS_TO_REPORT = 10;
    private static StackLogger logger = CommonLogger.getLogger(UDPMessageProcessor.class);
    BlockingQueueDispatchAuditor congestionAuditor;
    private int exceptionsReportedCounter;
    protected boolean isRunning;
    private int maxMessageSize;
    protected LinkedList messageChannels;
    protected BlockingQueue<DatagramQueuedMessageDispatch> messageQueue;
    private int port;
    protected DatagramSocket sock;
    protected int threadPoolSize;

    public class SocketIOExceptionEvent extends IOExceptionEvent {
        private static final long serialVersionUID = 778500971662697296L;
        private final String msg;

        public SocketIOExceptionEvent(String str) {
            super(UDPMessageProcessor.this, UDPMessageProcessor.this.sock.getLocalAddress().getHostAddress(), UDPMessageProcessor.this.port, UDPMessageProcessor.this.transport);
            this.msg = str;
        }

        @Override // java.util.EventObject
        public String toString() {
            return this.msg;
        }
    }

    public UDPMessageProcessor(InetAddress inetAddress, SIPTransactionStack sIPTransactionStack, int i) throws IOException {
        super(inetAddress, i, ParameterNames.UDP, sIPTransactionStack);
        Integer num = SipStackImpl.MAX_DATAGRAM_SIZE;
        this.maxMessageSize = num.intValue();
        this.sipStack = sIPTransactionStack;
        if (sIPTransactionStack.getMaxMessageSize() < num.intValue() && sIPTransactionStack.getMaxMessageSize() > 0) {
            this.maxMessageSize = sIPTransactionStack.getMaxMessageSize();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Max Message size is " + this.maxMessageSize);
        }
        this.messageQueue = new LinkedBlockingQueue();
        if (sIPTransactionStack.getStackCongestionControlTimeout() > 0) {
            BlockingQueueDispatchAuditor blockingQueueDispatchAuditor = new BlockingQueueDispatchAuditor(this.messageQueue);
            this.congestionAuditor = blockingQueueDispatchAuditor;
            blockingQueueDispatchAuditor.setTimeout(sIPTransactionStack.getStackCongestionControlTimeout());
            this.congestionAuditor.start(2000);
        }
        this.port = i;
        try {
            DatagramSocket datagramSocketCreateDatagramSocket = sIPTransactionStack.getNetworkLayer().createDatagramSocket(i, inetAddress);
            this.sock = datagramSocketCreateDatagramSocket;
            datagramSocketCreateDatagramSocket.setReceiveBufferSize(sIPTransactionStack.getReceiveUdpBufferSize());
            this.sock.setSendBufferSize(sIPTransactionStack.getSendUdpBufferSize());
            if (sIPTransactionStack.getThreadAuditor() != null && sIPTransactionStack.getThreadAuditor().isEnabled()) {
                this.sock.setSoTimeout((int) sIPTransactionStack.getThreadAuditor().getPingIntervalInMillisecs());
            }
            if (!inetAddress.getHostAddress().equals("0.0.0.0") && !inetAddress.getHostAddress().equals("::0")) {
                return;
            }
            super.setIpAddress(this.sock.getLocalAddress());
        } catch (Exception e) {
            BlockingQueueDispatchAuditor blockingQueueDispatchAuditor2 = this.congestionAuditor;
            if (blockingQueueDispatchAuditor2 != null) {
                blockingQueueDispatchAuditor2.stop();
            }
            throw new IOException(e);
        }
    }

    private void reportSockeException(Exception exc) {
        int i = this.exceptionsReportedCounter;
        if (i < 10) {
            int i2 = i + 1;
            this.exceptionsReportedCounter = i2;
            boolean z = i2 == 10;
            String simpleName = exc.getClass().getSimpleName();
            String hostAddress = this.sock.getLocalAddress().getHostAddress();
            int port = getPort();
            String message = exc.getMessage();
            String str = z ? "(Flooding checker active, no more socket IO-exceptions will be reported)" : "";
            StringBuilder sbN = b1j.n("Caught '", simpleName, "' on UDP receive socket on ", hostAddress, Separators.COLON);
            kng0.w(port, ", message '", message, "'. Trying to ignore it ... ", sbN);
            sbN.append(str);
            String string = sbN.toString();
            logger.logWarning(string);
            logger.logException(exc);
            SipListener sipListener = this.sipStack.getSipListener();
            if (sipListener != null) {
                sipListener.processIOException(new SocketIOExceptionEvent(string));
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(HostPort hostPort) {
        return new UDPMessageChannel(hostPort.getInetAddress(), hostPort.getPort(), this.sipStack, this);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getDefaultTargetPort() {
        return 5060;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getMaximumMessageSize() {
        return this.sipStack.getReceiveUdpBufferSize();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getPort() {
        return this.port;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public String getTransport() {
        return ParameterNames.UDP;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean inUse() {
        return !this.messageQueue.isEmpty();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean isSecure() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        SIPTransactionStack sIPTransactionStack;
        this.messageChannels = new LinkedList();
        SIPTransactionStack sIPTransactionStack2 = this.sipStack;
        if (sIPTransactionStack2.threadPoolSize != -1) {
            int i = 0;
            while (true) {
                sIPTransactionStack = this.sipStack;
                if (i >= sIPTransactionStack.threadPoolSize) {
                    break;
                }
                this.messageChannels.add(new UDPMessageChannel(this.sipStack, this, ((SipStackImpl) this.sipStack).getStackName() + "-UDPMessageChannelThread-" + i));
                i++;
            }
            sIPTransactionStack2 = sIPTransactionStack;
        }
        ThreadAuditor.ThreadHandle threadHandleAddCurrentThread = sIPTransactionStack2.getThreadAuditor() != null ? this.sipStack.getThreadAuditor().addCurrentThread() : null;
        while (this.isRunning) {
            if (threadHandleAddCurrentThread != null) {
                try {
                    threadHandleAddCurrentThread.ping();
                } catch (SocketException e) {
                    if (!this.isRunning) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("UDPMessageProcessor: Stopping");
                            return;
                        }
                        return;
                    }
                    reportSockeException(e);
                } catch (SocketTimeoutException unused) {
                } catch (IOException e2) {
                    reportSockeException(e2);
                } catch (Exception e3) {
                    reportSockeException(e3);
                }
            }
            int i2 = this.maxMessageSize;
            DatagramPacket datagramPacket = new DatagramPacket(new byte[i2], i2);
            this.sock.receive(datagramPacket);
            if (this.sipStack.threadPoolSize != -1) {
                this.messageQueue.offer(new DatagramQueuedMessageDispatch(datagramPacket, System.currentTimeMillis()));
            } else {
                new UDPMessageChannel(this.sipStack, this, datagramPacket);
            }
            this.exceptionsReportedCounter = 0;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void start() {
        this.isRunning = true;
        Thread thread = new Thread(this);
        thread.setDaemon(true);
        thread.setName("MessageProcessorThread-UDP-" + getIpAddress().getHostAddress() + '/' + getPort());
        thread.setPriority(this.sipStack.getThreadPriority());
        thread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void stop() {
        BlockingQueueDispatchAuditor blockingQueueDispatchAuditor;
        this.isRunning = false;
        this.sock.close();
        Iterator it = this.messageChannels.iterator();
        while (it.hasNext()) {
            ((MessageChannel) it.next()).close();
        }
        if (this.sipStack.getStackCongestionControlTimeout() <= 0 || (blockingQueueDispatchAuditor = this.congestionAuditor) == null) {
            return;
        }
        blockingQueueDispatchAuditor.stop();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(InetAddress inetAddress, int i) {
        return new UDPMessageChannel(inetAddress, i, this.sipStack, this);
    }
}
