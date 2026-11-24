package android.gov.nist.javax.sip.stack;

import a.hny;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.header.Via;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.ListeningPoint;
import java.net.InetAddress;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public abstract class MessageProcessor {
    protected static final String IN6_ADDR_ANY = "::0";
    protected static final String IN_ADDR_ANY = "0.0.0.0";
    private static StackLogger logger = CommonLogger.getLogger(MessageProcessor.class);
    private InetAddress ipAddress;
    private ListeningPointImpl listeningPoint;
    private int port;
    private String savedIpAddress;
    private String sentBy;
    private HostPort sentByHostPort;
    private boolean sentBySet;
    protected SIPTransactionStack sipStack;
    protected String transport;

    public MessageProcessor(InetAddress inetAddress, int i, String str, SIPTransactionStack sIPTransactionStack) {
        this(str);
        initialize(inetAddress, i, sIPTransactionStack);
    }

    public static int getDefaultPort(String str) {
        return str.equalsIgnoreCase(ListeningPoint.TLS) ? 5061 : 5060;
    }

    public abstract MessageChannel createMessageChannel(HostPort hostPort);

    public abstract MessageChannel createMessageChannel(InetAddress inetAddress, int i);

    public abstract int getDefaultTargetPort();

    public InetAddress getIpAddress() {
        return this.ipAddress;
    }

    public ListeningPointImpl getListeningPoint() {
        if (this.listeningPoint == null && logger.isLoggingEnabled()) {
            logger.logError("getListeningPoint" + this + " returning null listeningpoint");
        }
        return this.listeningPoint;
    }

    public abstract int getMaximumMessageSize();

    public int getPort() {
        return this.port;
    }

    public abstract SIPTransactionStack getSIPStack();

    public String getSavedIpAddress() {
        return this.savedIpAddress;
    }

    public String getSentBy() {
        HostPort hostPort;
        String str = this.sentBy;
        if (str != null || (hostPort = this.sentByHostPort) == null) {
            return str;
        }
        String string = hostPort.toString();
        this.sentBy = string;
        return string;
    }

    public String getTransport() {
        return this.transport;
    }

    public Via getViaHeader() {
        try {
            Via via = new Via();
            HostPort hostPort = this.sentByHostPort;
            if (hostPort != null) {
                via.setSentBy(hostPort);
                via.setTransport(getTransport());
                return via;
            }
            Host host = new Host();
            host.setHostname(getIpAddress().getHostAddress());
            via.setHost(host);
            via.setPort(getPort());
            via.setTransport(getTransport());
            return via;
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
            return null;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public abstract boolean inUse();

    public final void initialize(InetAddress inetAddress, int i, SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
        this.savedIpAddress = inetAddress.getHostAddress();
        this.ipAddress = inetAddress;
        this.port = i;
        HostPort hostPort = new HostPort();
        this.sentByHostPort = hostPort;
        hostPort.setHost(new Host(inetAddress.getHostAddress()));
        this.sentByHostPort.setPort(i);
    }

    public abstract boolean isSecure();

    public boolean isSentBySet() {
        return this.sentBySet;
    }

    public void setIpAddress(InetAddress inetAddress) {
        this.sentByHostPort.setHost(new Host(inetAddress.getHostAddress()));
        this.ipAddress = inetAddress;
    }

    public void setListeningPoint(ListeningPointImpl listeningPointImpl) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setListeningPoint" + this + " listeningPoint = " + listeningPointImpl);
        }
        if (listeningPointImpl.getPort() != getPort()) {
            InternalErrorHandler.handleException("lp mismatch with provider", logger);
        }
        this.listeningPoint = listeningPointImpl;
    }

    public void setSentBy(String str) throws ParseException {
        int iIndexOf = str.indexOf(Separators.COLON);
        if (iIndexOf == -1) {
            HostPort hostPort = new HostPort();
            this.sentByHostPort = hostPort;
            hostPort.setHost(new Host(str));
        } else {
            HostPort hostPort2 = new HostPort();
            this.sentByHostPort = hostPort2;
            hostPort2.setHost(new Host(str.substring(0, iIndexOf)));
            try {
                this.sentByHostPort.setPort(Integer.parseInt(str.substring(iIndexOf + 1)));
            } catch (NumberFormatException unused) {
                hny.j(iIndexOf, "Bad format encountered at ");
                return;
            }
        }
        this.sentBySet = true;
        this.sentBy = str;
    }

    public abstract void start();

    public abstract void stop();

    public MessageProcessor(String str) {
        this.transport = str;
    }
}
