package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.javax.sip.header.ExtensionHeader;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionHeaderImpl extends SIPHeader implements ExtensionHeader {
    private static final long serialVersionUID = -8693922839612081849L;
    protected String value;

    public ExtensionHeaderImpl() {
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuffer stringBuffer = new StringBuffer(this.headerName);
        stringBuffer.append(": ");
        stringBuffer.append(this.value);
        stringBuffer.append(Separators.NEWLINE);
        return stringBuffer.toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(encodeBody());
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public String getHeaderValue() {
        String str = this.value;
        if (str != null) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder(encode());
            while (sb.length() > 0 && sb.charAt(0) != ':') {
                sb.deleteCharAt(0);
            }
            sb.deleteCharAt(0);
            String strTrim = sb.toString().trim();
            this.value = strTrim;
            return strTrim;
        } catch (Exception unused) {
            return null;
        }
    }

    public void setName(String str) {
        this.headerName = str;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) {
        this.value = str;
    }

    public ExtensionHeaderImpl(String str) {
        super(str);
    }

    public String encodeBody() {
        return getHeaderValue();
    }
}
