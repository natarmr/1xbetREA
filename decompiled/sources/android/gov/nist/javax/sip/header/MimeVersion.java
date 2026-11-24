package android.gov.nist.javax.sip.header;

import a.itt0;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.MimeVersionHeader;

/* JADX INFO: loaded from: classes.dex */
public class MimeVersion extends SIPHeader implements MimeVersionHeader {
    private static final long serialVersionUID = -7951589626435082068L;
    protected int majorVersion;
    protected int minorVersion;

    public MimeVersion() {
        super("MIME-Version");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Integer.toString(this.majorVersion));
        sb.append(Separators.DOT);
        sb.append(Integer.toString(this.minorVersion));
        return sb;
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public int getMajorVersion() {
        return this.majorVersion;
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public int getMinorVersion() {
        return this.minorVersion;
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public void setMajorVersion(int i) throws InvalidArgumentException {
        if (i >= 0) {
            this.majorVersion = i;
        } else {
            itt0.r("JAIN-SIP Exception, MimeVersion, setMajorVersion(), the majorVersion parameter is null");
        }
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public void setMinorVersion(int i) throws InvalidArgumentException {
        if (i >= 0) {
            this.minorVersion = i;
        } else {
            itt0.r("JAIN-SIP Exception, MimeVersion, setMinorVersion(), the minorVersion parameter is null");
        }
    }
}
