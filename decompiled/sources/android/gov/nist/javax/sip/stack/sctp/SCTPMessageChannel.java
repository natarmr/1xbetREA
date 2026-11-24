package android.gov.nist.javax.sip.stack.sctp;

import a.b1j;
import a.csj;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.gov.nist.javax.sip.stack.ServerRequestInterface;
import android.gov.nist.javax.sip.stack.ServerResponseInterface;
import com.huawei.hms.android.HwBuildEx;
import com.sun.nio.sctp.MessageInfo;
import com.sun.nio.sctp.NotificationHandler;
import com.sun.nio.sctp.SctpChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
final class SCTPMessageChannel extends MessageChannel implements ParseExceptionListener, Comparable<SCTPMessageChannel> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static StackLogger logger = CommonLogger.getLogger(SCTPMessageChannel.class);
    private final SctpChannel channel;
    private final SelectionKey key;
    private final MessageInfo messageInfo;
    private InetSocketAddress peerAddress;
    private InetSocketAddress peerSrcAddress;
    private final SCTPMessageProcessor processor;
    private long rxTime;
    private final ByteBuffer rxBuffer = ByteBuffer.allocateDirect(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    private final StringMsgParser parser = new StringMsgParser();

    public SCTPMessageChannel(SCTPMessageProcessor sCTPMessageProcessor, SctpChannel sctpChannel) {
        this.processor = sCTPMessageProcessor;
        this.messageProcessor = sCTPMessageProcessor;
        SocketAddress socketAddress = (SocketAddress) sctpChannel.getRemoteAddresses().iterator().next();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        this.peerAddress = inetSocketAddress;
        this.peerSrcAddress = inetSocketAddress;
        MessageInfo messageInfoCreateOutgoing = MessageInfo.createOutgoing(socketAddress, 0);
        this.messageInfo = messageInfoCreateOutgoing;
        messageInfoCreateOutgoing.unordered(true);
        this.channel = sctpChannel;
        sctpChannel.configureBlocking(false);
        this.key = sCTPMessageProcessor.registerChannel(this, sctpChannel);
    }

    private void processMessage(SIPMessage sIPMessage, long j) {
        boolean z;
        boolean zPassToListener;
        SIPTransactionStack sIPStack = this.processor.getSIPStack();
        sIPMessage.setRemoteAddress(this.peerAddress.getAddress());
        sIPMessage.setRemotePort(getPeerPort());
        sIPMessage.setLocalPort(getPort());
        sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
        if (!(sIPMessage instanceof SIPRequest)) {
            SIPResponse sIPResponse = (SIPResponse) sIPMessage;
            try {
                sIPResponse.checkHeaders();
                ServerResponseInterface serverResponseInterfaceNewSIPServerResponse = sIPStack.newSIPServerResponse(sIPResponse, this);
                if (serverResponseInterfaceNewSIPServerResponse == null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("null sipServerResponse as could not acquire semaphore or the valve dropped the message.");
                        return;
                    }
                    return;
                }
                try {
                    if (!(serverResponseInterfaceNewSIPServerResponse instanceof SIPClientTransaction) || ((SIPClientTransaction) serverResponseInterfaceNewSIPServerResponse).checkFromTag(sIPResponse)) {
                        serverResponseInterfaceNewSIPServerResponse.processResponse(sIPResponse, this);
                        if (z) {
                            if (zPassToListener) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    if (logger.isLoggingEnabled()) {
                        logger.logError("Dropping response message with invalid tag >>> " + sIPResponse);
                    }
                    if (z) {
                        if (zPassToListener) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } finally {
                    if (serverResponseInterfaceNewSIPServerResponse instanceof SIPTransaction) {
                        SIPTransaction sIPTransaction = (SIPTransaction) serverResponseInterfaceNewSIPServerResponse;
                        if (!sIPTransaction.passToListener()) {
                            sIPTransaction.releaseSem();
                        }
                    }
                }
            } catch (ParseException unused) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Dropping Badly formatted response message >>> " + sIPResponse);
                    return;
                }
                return;
            }
        }
        SIPRequest sIPRequest = (SIPRequest) sIPMessage;
        if (logger.isLoggingEnabled(16)) {
            sIPStack.getServerLogger().logMessage(sIPMessage, getPeerHostPort().toString(), getHost() + Separators.COLON + getPort(), false, j);
        }
        ServerRequestInterface serverRequestInterfaceNewSIPServerRequest = sIPStack.newSIPServerRequest(sIPRequest, this);
        if (serverRequestInterfaceNewSIPServerRequest == null) {
            if (logger.isLoggingEnabled()) {
                logger.logWarning("Null request interface returned -- dropping request");
                return;
            }
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("About to process " + sIPRequest.getFirstLine() + Separators.SLASH + serverRequestInterfaceNewSIPServerRequest);
        }
        try {
            serverRequestInterfaceNewSIPServerRequest.processRequest(sIPRequest, this);
            if ((serverRequestInterfaceNewSIPServerRequest instanceof SIPTransaction) && !((SIPServerTransaction) serverRequestInterfaceNewSIPServerRequest).passToListener()) {
                ((SIPTransaction) serverRequestInterfaceNewSIPServerRequest).releaseSem();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Done processing " + sIPRequest.getFirstLine() + Separators.SLASH + serverRequestInterfaceNewSIPServerRequest);
            }
        } catch (Throwable th) {
            if (!(serverRequestInterfaceNewSIPServerRequest instanceof SIPTransaction) || ((SIPServerTransaction) serverRequestInterfaceNewSIPServerRequest).passToListener()) {
                throw th;
            }
            ((SIPTransaction) serverRequestInterfaceNewSIPServerRequest).releaseSem();
            throw th;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void close() {
        try {
            try {
                this.key.cancel();
                this.channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            this.processor.removeChannel(this);
        }
    }

    public void closeNoRemove() {
        try {
            this.key.cancel();
            this.channel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(SCTPMessageChannel sCTPMessageChannel) {
        return hashCode() - sCTPMessageChannel.hashCode();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getKey() {
        return MessageChannel.getKey(getPeerInetAddress(), getPeerPort(), getTransport());
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerAddress() {
        return this.peerAddress.getHostString();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerInetAddress() {
        return this.peerAddress.getAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerPacketSourceAddress() {
        return this.peerSrcAddress.getAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPacketSourcePort() {
        return this.peerSrcAddress.getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPort() {
        return this.peerAddress.getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerProtocol() {
        return "sctp";
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public SIPTransactionStack getSIPStack() {
        return this.processor.getSIPStack();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return "sctp";
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getViaHost() {
        return this.processor.getSavedIpAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getViaPort() {
        return this.processor.getPort();
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) throws ParseException {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Parsing Exception: ", parseException);
        }
        if (cls == null || !(cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            sIPMessage.addUnparsed(str);
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logError("BAD MESSAGE!" + str2);
        }
        String string = sIPMessage.toString();
        if (string.startsWith("SIP/") || string.startsWith("ACK ") || this.channel == null) {
            throw parseException;
        }
        if (logger.isLoggingEnabled(4)) {
            logger.logError("Malformed mandatory headers: closing socket! :" + this.channel.toString());
        }
        try {
            this.channel.close();
            throw parseException;
        } catch (IOException e) {
            if (!logger.isLoggingEnabled(4)) {
                throw parseException;
            }
            logger.logError("Exception while closing socket! :" + this.channel.toString() + Separators.COLON + e.toString());
            throw parseException;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isReliable() {
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    public void readMessages() {
        if (this.rxTime == 0) {
            this.rxTime = System.currentTimeMillis();
        }
        MessageInfo messageInfoReceive = this.channel.receive(this.rxBuffer, (Object) null, (NotificationHandler) null);
        if (messageInfoReceive == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SCTP read-event but no message");
                return;
            }
            return;
        }
        if (messageInfoReceive.bytes() == -1) {
            logger.logWarning("SCTP peer closed, closing too...");
            close();
            return;
        }
        if (!messageInfoReceive.isComplete()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SCTP incomplete message; bytes=" + messageInfoReceive.bytes());
                return;
            }
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SCTP message now complete; bytes=" + messageInfoReceive.bytes());
        }
        int iPosition = this.rxBuffer.position();
        byte[] bArr = new byte[iPosition];
        this.rxBuffer.flip();
        this.rxBuffer.get(bArr);
        this.rxBuffer.compact();
        try {
            processMessage(this.parser.parseSIPMessage(bArr, true, true, this), this.rxTime);
            this.rxTime = 0L;
        } catch (ParseException e) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                StringBuilder sbM = b1j.m(iPosition, "Invalid message bytes=", Separators.COLON);
                sbM.append(new String(bArr));
                stackLogger.logDebug(sbM.toString(), e);
            }
            close();
            csj.c("Error parsing incoming SCTP message", e);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i, boolean z) {
        int iSend = this.channel.send(ByteBuffer.wrap(bArr), this.messageInfo);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SCTP bytes sent:" + iSend);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void uncache() {
        this.processor.removeChannel(this);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(SIPMessage sIPMessage) {
        sendMessage(sIPMessage.encodeAsBytes(getTransport()), getPeerInetAddress(), getPeerPort(), false);
    }

    public SCTPMessageChannel(SCTPMessageProcessor sCTPMessageProcessor, InetSocketAddress inetSocketAddress) {
        this.processor = sCTPMessageProcessor;
        this.messageProcessor = sCTPMessageProcessor;
        this.peerAddress = inetSocketAddress;
        this.peerSrcAddress = inetSocketAddress;
        MessageInfo messageInfoCreateOutgoing = MessageInfo.createOutgoing(inetSocketAddress, 0);
        this.messageInfo = messageInfoCreateOutgoing;
        messageInfoCreateOutgoing.unordered(true);
        SctpChannel sctpChannelOpen = SctpChannel.open(inetSocketAddress, 1, 1);
        this.channel = sctpChannelOpen;
        sctpChannelOpen.configureBlocking(false);
        this.key = sCTPMessageProcessor.registerChannel(this, sctpChannelOpen);
    }
}
