package android.gov.nist.javax.sip.header;

import a.hne;
import android.gov.nist.core.Separators;
import android.javax.sip.header.Header;

/* JADX INFO: loaded from: classes.dex */
public abstract class SIPHeader extends SIPObject implements SIPHeaderNames, Header, HeaderExt {
    protected String headerName;

    public SIPHeader(String str) {
        this.headerName = str.intern();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        hne.B(sb, this.headerName, Separators.COLON, Separators.SP);
        encodeBody(sb);
        sb.append(Separators.NEWLINE);
        return sb;
    }

    public abstract StringBuilder encodeBody(StringBuilder sb);

    public String getHeaderName() {
        return this.headerName;
    }

    public String getHeaderValue() {
        return encodeBody(new StringBuilder()).toString();
    }

    public String getName() {
        return this.headerName;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderExt
    public String getValue() {
        return getHeaderValue();
    }

    public int hashCode() {
        return this.headerName.hashCode();
    }

    public boolean isHeaderList() {
        return false;
    }

    public void setHeaderName(String str) {
        this.headerName = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.javax.sip.header.Header
    public final String toString() {
        return encode();
    }

    public SIPHeader() {
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }
}
