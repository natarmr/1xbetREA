package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.ContentEncodingHeader;

/* JADX INFO: loaded from: classes.dex */
public class ContentEncoding extends SIPHeader implements ContentEncodingHeader {
    private static final long serialVersionUID = 2034230276579558857L;
    protected String contentEncoding;

    public ContentEncoding(String str) {
        super("Content-Encoding");
        this.contentEncoding = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.contentEncoding);
        return sb;
    }

    @Override // android.javax.sip.header.Encoding
    public String getEncoding() {
        return this.contentEncoding;
    }

    @Override // android.javax.sip.header.Encoding
    public void setEncoding(String str) {
        if (str != null) {
            this.contentEncoding = str;
        } else {
            hny.u("JAIN-SIP Exception,  encoding is null");
        }
    }

    public ContentEncoding() {
        super("Content-Encoding");
    }
}
