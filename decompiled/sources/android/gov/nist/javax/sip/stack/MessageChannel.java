package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.javax.sip.address.Hop;
import android.javax.sip.header.ContactHeader;
import android.javax.sip.header.ServerHeader;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public abstract class MessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(MessageChannel.class);
    static ThreadLocal<String> messageTxId = new ThreadLocal<>();
    private SIPClientTransaction encapsulatedClientTransaction;
    protected transient MessageProcessor messageProcessor;
    protected int useCount;

    private static final boolean copyHeader(String str, String str2, StringBuilder sb) {
        int iIndexOf;
        int iIndexOf2 = str2.indexOf(str);
        if (iIndexOf2 == -1 || (iIndexOf = str2.indexOf(Separators.NEWLINE, iIndexOf2)) == -1) {
            return false;
        }
        sb.append(str2.subSequence(iIndexOf2 - 2, iIndexOf));
        return true;
    }

    private static final boolean copyViaHeaders(String str, StringBuilder sb) {
        int iIndexOf = str.indexOf("Via");
        boolean z = false;
        while (iIndexOf != -1) {
            int iIndexOf2 = str.indexOf(Separators.NEWLINE, iIndexOf);
            if (iIndexOf2 == -1) {
                return false;
            }
            sb.append(str.subSequence(iIndexOf - 2, iIndexOf2));
            iIndexOf = str.indexOf("Via", iIndexOf2);
            z = true;
        }
        return z;
    }

    public static String getKey(HostPort hostPort, String str) {
        String ipAddress = hostPort.getHost().getIpAddress();
        if (ipAddress == null) {
            ipAddress = hostPort.getHost().getHostname();
        }
        return (str + Separators.COLON + ipAddress.replaceAll("[\\[\\]]", "") + Separators.COLON + hostPort.getPort()).toLowerCase();
    }

    public abstract void close();

    public final String createBadReqRes(String str, ParseException parseException) {
        StringBuilder sb = new StringBuilder(512);
        sb.append("SIP/2.0 400 Bad Request (" + parseException.getLocalizedMessage() + ')');
        if (!copyViaHeaders(str, sb) || !copyHeader("CSeq", str, sb) || !copyHeader("Call-ID", str, sb) || !copyHeader("From", str, sb) || !copyHeader("To", str, sb)) {
            return null;
        }
        int iIndexOf = sb.indexOf("To");
        if (iIndexOf != -1 && sb.indexOf("tag", iIndexOf) == -1) {
            sb.append(";tag=badreq");
        }
        ServerHeader defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
        if (defaultServerHeader != null) {
            sb.append(Separators.NEWLINE + defaultServerHeader.toString());
        }
        int length = str.length();
        if (!(this instanceof UDPMessageChannel) || sb.length() + length + 45 < 1300) {
            sb.append(Separators.NEWLINE + new ContentType(CrashHianalyticsData.MESSAGE, "sipfrag").toString());
            sb.append(Separators.NEWLINE + new ContentLength(length).toString());
            sb.append("\r\n\r\n".concat(str));
        } else {
            sb.append(Separators.NEWLINE + new ContentLength(0).toString());
        }
        return sb.toString();
    }

    public SIPClientTransaction getEncapsulatedClientTransaction() {
        return this.encapsulatedClientTransaction;
    }

    public String getHost() {
        return getMessageProcessor().getIpAddress().getHostAddress();
    }

    public HostPort getHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getHost()));
        hostPort.setPort(getPort());
        return hostPort;
    }

    public abstract String getKey();

    public MessageProcessor getMessageProcessor() {
        return this.messageProcessor;
    }

    public abstract String getPeerAddress();

    public HostPort getPeerHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getPeerAddress()));
        hostPort.setPort(getPeerPort());
        return hostPort;
    }

    public abstract InetAddress getPeerInetAddress();

    public abstract InetAddress getPeerPacketSourceAddress();

    public abstract int getPeerPacketSourcePort();

    public abstract int getPeerPort();

    public abstract String getPeerProtocol();

    public int getPort() {
        MessageProcessor messageProcessor = this.messageProcessor;
        if (messageProcessor != null) {
            return messageProcessor.getPort();
        }
        return -1;
    }

    public String getRawIpSourceAddress() {
        try {
            return InetAddress.getByName(getPeerAddress()).getHostAddress();
        } catch (Exception e) {
            InternalErrorHandler.handleException(e);
            return null;
        }
    }

    public abstract SIPTransactionStack getSIPStack();

    public abstract String getTransport();

    public Via getViaHeader() {
        Via via = new Via();
        try {
            via.setTransport(getTransport());
        } catch (ParseException unused) {
        }
        via.setSentBy(getHostPort());
        return via;
    }

    public abstract String getViaHost();

    public HostPort getViaHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getViaHost()));
        hostPort.setPort(getViaPort());
        return hostPort;
    }

    public abstract int getViaPort();

    public abstract boolean isReliable();

    public abstract boolean isSecure();

    public void logMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i, long j) {
        if (logger.isLoggingEnabled(16)) {
            if (i == -1) {
                i = 5060;
            }
            getSIPStack().serverLogger.logMessage(sIPMessage, getHost() + Separators.COLON + getPort(), inetAddress.getHostAddress().toString() + Separators.COLON + i, true, j);
        }
    }

    public void logResponse(SIPResponse sIPResponse, long j, String str) {
        int peerPort = getPeerPort();
        if (peerPort == 0 && sIPResponse.getContactHeaders() != null) {
            peerPort = ((AddressImpl) ((ContactHeader) sIPResponse.getContactHeaders().getFirst()).getAddress()).getPort();
        }
        getSIPStack().serverLogger.logMessage(sIPResponse, getPeerAddress().toString() + Separators.COLON + peerPort, getHost() + Separators.COLON + getPort(), str, false, j);
    }

    public abstract void sendMessage(SIPMessage sIPMessage);

    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:51:0x010f, B:53:0x0118, B:56:0x0122, B:57:0x0129, B:58:0x012a), top: B:63:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.gov.nist.core.StackLogger] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.gov.nist.javax.sip.stack.MessageChannel] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void sendMessage(final SIPMessage sIPMessage, Hop hop) throws Throwable {
        SIPMessage sIPMessage2;
        ?? r12;
        MessageChannel messageChannel;
        SIPMessage sIPMessage3;
        int i;
        int port;
        SIPMessage sIPMessage4;
        MessageChannel messageChannel2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InetAddress byName = InetAddress.getByName(hop.getHost());
        int i2 = 16;
        i2 = 16;
        ?? r1 = 16;
        i2 = 16;
        i2 = 16;
        try {
            try {
                MessageProcessor[] messageProcessors = getSIPStack().getMessageProcessors();
                int length = messageProcessors.length;
                int i3 = 0;
                sIPMessage = sIPMessage;
                try {
                    while (i3 < length) {
                        try {
                            MessageProcessor messageProcessor = messageProcessors[i3];
                            if (messageProcessor.getIpAddress().equals(byName) && messageProcessor.getPort() == hop.getPort() && messageProcessor.getTransport().equalsIgnoreCase(hop.getTransport())) {
                                Object objCreateMessageChannel = messageProcessor.createMessageChannel(byName, hop.getPort());
                                if (objCreateMessageChannel instanceof RawMessageChannel) {
                                    final RawMessageChannel rawMessageChannel = (RawMessageChannel) objCreateMessageChannel;
                                    this.getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.MessageChannel.1
                                        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                                        public Object getThreadHash() {
                                            return sIPMessage.getCallId().getCallId();
                                        }

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            try {
                                                rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                            } catch (Exception e) {
                                                if (MessageChannel.logger.isLoggingEnabled(4)) {
                                                    MessageChannel.logger.logError("Error self routing message cause by: ", e);
                                                }
                                            }
                                        }
                                    });
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Self routing message");
                                    }
                                    messageTxId.remove();
                                    if (logger.isLoggingEnabled(i2)) {
                                        port = hop.getPort();
                                        messageChannel2 = this;
                                        sIPMessage4 = sIPMessage;
                                        messageChannel2.logMessage(sIPMessage4, byName, port, jCurrentTimeMillis);
                                        return;
                                    }
                                    return;
                                }
                            }
                            int i4 = i2;
                            i3++;
                            sIPMessage = sIPMessage;
                            this = this;
                            i2 = i4;
                        } catch (IOException e) {
                            e = e;
                            sIPMessage3 = sIPMessage;
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            sIPMessage3 = sIPMessage;
                            if (logger.isLoggingEnabled(4)) {
                                logger.logError("Error self routing message cause by: ", e);
                            }
                            throw new IOException("Error self routing message");
                        } catch (Throwable th) {
                            th = th;
                            int i5 = i2;
                            messageChannel = this;
                            sIPMessage3 = sIPMessage;
                            i = i5;
                            sIPMessage2 = sIPMessage3;
                            r1 = messageChannel;
                            r12 = i;
                            messageTxId.remove();
                            if (logger.isLoggingEnabled(r12)) {
                                r1.logMessage(sIPMessage2, byName, hop.getPort(), jCurrentTimeMillis);
                            }
                            throw th;
                        }
                    }
                    messageTxId.set(sIPMessage3.getTransactionId());
                    messageChannel.sendMessage(sIPMessage3.encodeAsBytes(messageChannel.getTransport()), byName, hop.getPort(), sIPMessage3 instanceof SIPRequest);
                    sIPMessage3.setRemoteAddress(byName);
                    sIPMessage3.setRemotePort(hop.getPort());
                    sIPMessage3.setLocalPort(messageChannel.getPort());
                    sIPMessage3.setLocalAddress(messageChannel.getMessageProcessor().getIpAddress());
                    messageTxId.remove();
                    if (logger.isLoggingEnabled(i == true ? 1 : 0)) {
                        port = hop.getPort();
                        sIPMessage4 = sIPMessage3;
                        messageChannel2 = messageChannel;
                        messageChannel2.logMessage(sIPMessage4, byName, port, jCurrentTimeMillis);
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    e = e3;
                    throw e;
                } catch (Exception e4) {
                    e = e4;
                    if (logger.isLoggingEnabled(4)) {
                        logger.logError("Error self routing message cause by: ", e);
                    }
                    throw new IOException("Error self routing message");
                } catch (Throwable th2) {
                    th = th2;
                    sIPMessage2 = sIPMessage3;
                    r1 = messageChannel;
                    r12 = i;
                    messageTxId.remove();
                    if (logger.isLoggingEnabled(r12)) {
                        r1.logMessage(sIPMessage2, byName, hop.getPort(), jCurrentTimeMillis);
                    }
                    throw th;
                }
                int i6 = i2;
                messageChannel = this;
                sIPMessage3 = sIPMessage;
                i = i6;
            } catch (Throwable th3) {
                th = th3;
                r12 = sIPMessage;
            }
        } catch (IOException e5) {
            throw e5;
        } catch (Exception e6) {
            e = e6;
        } catch (Throwable th4) {
            th = th4;
            sIPMessage2 = sIPMessage;
            r12 = i2;
            r1 = this;
        }
    }

    public abstract void sendMessage(byte[] bArr, InetAddress inetAddress, int i, boolean z);

    public void setEncapsulatedClientTransaction(SIPClientTransaction sIPClientTransaction) {
        this.encapsulatedClientTransaction = sIPClientTransaction;
    }

    public void uncache() {
    }

    public static String getKey(InetAddress inetAddress, int i, String str) {
        return (str + Separators.COLON + inetAddress.getHostAddress().replaceAll("[\\[\\]]", "") + Separators.COLON + i).toLowerCase();
    }

    public void sendMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrEncodeAsBytes = sIPMessage.encodeAsBytes(getTransport());
        messageTxId.set(sIPMessage.getTransactionId());
        try {
            sendMessage(bArrEncodeAsBytes, inetAddress, i, sIPMessage instanceof SIPRequest);
            messageTxId.remove();
            sIPMessage.setRemoteAddress(inetAddress);
            sIPMessage.setRemotePort(i);
            sIPMessage.setLocalPort(getPort());
            sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
            logMessage(sIPMessage, inetAddress, i, jCurrentTimeMillis);
        } catch (Throwable th) {
            messageTxId.remove();
            throw th;
        }
    }
}
