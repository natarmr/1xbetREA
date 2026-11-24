package android.gov.nist.javax.sip.header;

import a.hny;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.Utils;
import android.javax.sip.ListeningPoint;

/* JADX INFO: loaded from: classes.dex */
public class Protocol extends SIPObject {
    private static final long serialVersionUID = 2216758055974073280L;
    protected String protocolName = "SIP";
    protected String protocolVersion = "2.0";
    protected String transport = ListeningPoint.UDP;

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(Utils.toUpperCase(this.protocolName));
        sb.append(Separators.SLASH);
        sb.append(this.protocolVersion);
        sb.append(Separators.SLASH);
        sb.append(this.transport.toUpperCase());
        return sb;
    }

    public String getProtocol() {
        return this.protocolName + '/' + this.protocolVersion;
    }

    public String getProtocolName() {
        return this.protocolName;
    }

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public String getTransport() {
        return this.transport;
    }

    public void setProtocol(String str) {
        int iIndexOf = str.indexOf(47);
        if (iIndexOf <= 0) {
            hny.j(0, "Missing '/' in protocol");
        } else {
            this.protocolName = str.substring(0, iIndexOf);
            this.protocolVersion = str.substring(iIndexOf + 1);
        }
    }

    public void setProtocolName(String str) {
        this.protocolName = str;
    }

    public void setProtocolVersion(String str) {
        this.protocolVersion = str;
    }

    public void setTransport(String str) {
        this.transport = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }
}
