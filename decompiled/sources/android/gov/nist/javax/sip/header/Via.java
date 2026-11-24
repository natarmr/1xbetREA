package android.gov.nist.javax.sip.header;

import a.hny;
import a.itt0;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.address.Hop;
import android.javax.sip.header.ViaHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class Via extends ParametersHeader implements ViaHeader, ViaHeaderExt {
    public static final String BRANCH = "branch";
    public static final String MADDR = "maddr";
    public static final String RECEIVED = "received";
    public static final String RPORT = "rport";
    public static final String TTL = "ttl";
    private static final long serialVersionUID = 5281728373401351378L;
    protected String comment;
    protected HostPort sentBy;
    protected Protocol sentProtocol;

    public Via() {
        super("Via");
        this.sentProtocol = new Protocol();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Via via = (Via) super.clone();
        Protocol protocol = this.sentProtocol;
        if (protocol != null) {
            via.sentProtocol = (Protocol) protocol.clone();
        }
        HostPort hostPort = this.sentBy;
        if (hostPort != null) {
            via.sentBy = (HostPort) hostPort.clone();
        }
        if (getRPort() != -1) {
            via.setParameter("rport", getRPort());
        }
        return via;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        this.sentProtocol.encode(sb);
        sb.append(Separators.SP);
        this.sentBy.encode(sb);
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        if (this.comment != null) {
            sb.append(Separators.SP);
            sb.append(Separators.LPAREN);
            sb.append(this.comment);
            sb.append(Separators.RPAREN);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViaHeader) {
            ViaHeader viaHeader = (ViaHeader) obj;
            if (getProtocol().equalsIgnoreCase(viaHeader.getProtocol()) && getTransport().equalsIgnoreCase(viaHeader.getTransport()) && getHost().equalsIgnoreCase(viaHeader.getHost()) && getPort() == viaHeader.getPort() && equalParameters(viaHeader)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getBranch() {
        return getParameter("branch");
    }

    public String getComment() {
        return this.comment;
    }

    public Hop getHop() {
        return new HopImpl(this.sentBy.getHost().getHostname(), this.sentBy.getPort(), this.sentProtocol.getTransport());
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getHost() {
        Host host;
        HostPort hostPort = this.sentBy;
        if (hostPort == null || (host = hostPort.getHost()) == null) {
            return null;
        }
        return host.getHostname();
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getMAddr() {
        return getParameter("maddr");
    }

    @Override // android.javax.sip.header.ViaHeader
    public int getPort() {
        HostPort hostPort = this.sentBy;
        if (hostPort == null) {
            return -1;
        }
        return hostPort.getPort();
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getProtocol() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getProtocol();
    }

    public String getProtocolVersion() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getProtocolVersion();
    }

    @Override // android.javax.sip.header.ViaHeader
    public int getRPort() {
        String parameter = getParameter("rport");
        if (parameter == null || parameter.equals("")) {
            return -1;
        }
        return Integer.valueOf(parameter).intValue();
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getReceived() {
        return getParameter("received");
    }

    public HostPort getSentBy() {
        return this.sentBy;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getSentByField() {
        HostPort hostPort = this.sentBy;
        if (hostPort != null) {
            return hostPort.encode();
        }
        return null;
    }

    public Protocol getSentProtocol() {
        return this.sentProtocol;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getSentProtocolField() {
        Protocol protocol = this.sentProtocol;
        if (protocol != null) {
            return protocol.encode();
        }
        return null;
    }

    @Override // android.javax.sip.header.ViaHeader
    public int getTTL() {
        return getParameterAsInt("ttl");
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getTransport() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getTransport();
    }

    public NameValueList getViaParms() {
        return this.parameters;
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    public boolean hasPort() {
        return getSentBy().hasPort();
    }

    public void removeComment() {
        this.comment = null;
    }

    public void removePort() {
        this.sentBy.removePort();
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setBranch(String str) {
        if (str == null || str.length() == 0) {
            hny.u("JAIN-SIP Exception, Via, setBranch(), the branch parameter is null or length 0.");
        } else {
            setParameter("branch", str);
        }
    }

    public void setComment(String str) {
        this.comment = str;
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setHost(String str) {
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        try {
            this.sentBy.setHost(new Host(str));
        } catch (Exception unused) {
            hny.u(" host parameter is null");
        }
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setMAddr(String str) {
        if (str == null) {
            hny.u("JAIN-SIP Exception, Via, setMAddr(), the mAddr parameter is null.");
            return;
        }
        Host host = new Host();
        host.setAddress(str);
        setParameter(new NameValue("maddr", host));
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setPort(int i) {
        if (i != -1 && (i < 1 || i > 65535)) {
            itt0.r("Port value out of range -1, [1..65535]");
            return;
        }
        HostPort hostPort = this.sentBy;
        if (hostPort == null) {
            hostPort = new HostPort();
            this.sentBy = hostPort;
        }
        hostPort.setPort(i);
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setProtocol(String str) {
        if (str == null) {
            hny.u("JAIN-SIP Exception, Via, setProtocol(), the protocol parameter is null.");
            return;
        }
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            protocol = new Protocol();
            this.sentProtocol = protocol;
        }
        protocol.setProtocol(str);
    }

    public void setProtocolVersion(String str) {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            protocol = new Protocol();
            this.sentProtocol = protocol;
        }
        protocol.setProtocolVersion(str);
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setRPort() {
        try {
            setParameter("rport", (String) null);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setReceived(String str) {
        if (str != null) {
            setParameter("received", str);
        } else {
            hny.u("JAIN-SIP Exception, Via, setReceived(), the received parameter is null.");
        }
    }

    public void setSentBy(HostPort hostPort) {
        this.sentBy = hostPort;
    }

    public void setSentProtocol(Protocol protocol) {
        this.sentProtocol = protocol;
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setTTL(int i) throws InvalidArgumentException {
        if (i >= 0 || i == -1) {
            setParameter(new NameValue("ttl", Integer.valueOf(i)));
        } else {
            itt0.r("JAIN-SIP Exception, Via, setTTL(), the ttl parameter is < 0");
        }
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setTransport(String str) {
        if (str == null) {
            hny.u("JAIN-SIP Exception, Via, setTransport(), the transport parameter is null.");
            return;
        }
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            protocol = new Protocol();
            this.sentProtocol = protocol;
        }
        protocol.setTransport(str);
    }

    public void setHost(Host host) {
        HostPort hostPort = this.sentBy;
        if (hostPort == null) {
            hostPort = new HostPort();
            this.sentBy = hostPort;
        }
        hostPort.setHost(host);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
