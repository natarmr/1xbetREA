package android.gov.nist.javax.sip.header;

import a.hny;
import a.itt0;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.AcceptEncodingHeader;

/* JADX INFO: loaded from: classes.dex */
public final class AcceptEncoding extends ParametersHeader implements AcceptEncodingHeader {
    private static final long serialVersionUID = -1476807565552873525L;
    protected String contentCoding;

    public AcceptEncoding() {
        super("Accept-Encoding");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.contentCoding;
        if (str != null) {
            sb.append(str);
        }
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            sb.append(this.parameters.encode());
        }
        return sb;
    }

    @Override // android.javax.sip.header.Encoding
    public String getEncoding() {
        return this.contentCoding;
    }

    @Override // android.javax.sip.header.AcceptEncodingHeader
    public float getQValue() {
        return getParameterAsFloat("q");
    }

    @Override // android.javax.sip.header.Encoding
    public void setEncoding(String str) {
        if (str != null) {
            this.contentCoding = str;
        } else {
            hny.u(" encoding parameter is null");
        }
    }

    @Override // android.javax.sip.header.AcceptEncodingHeader
    public void setQValue(float f) throws InvalidArgumentException {
        double d = f;
        if (d < 0.0d || d > 1.0d) {
            itt0.r("qvalue out of range!");
        } else {
            super.setParameter("q", f);
        }
    }

    public String encodeBody() {
        return encode(new StringBuilder()).toString();
    }
}
