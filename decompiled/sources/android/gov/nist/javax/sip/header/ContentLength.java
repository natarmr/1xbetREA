package android.gov.nist.javax.sip.header;

import a.itt0;
import android.javax.sip.header.ContentLengthHeader;

/* JADX INFO: loaded from: classes.dex */
public class ContentLength extends SIPHeader implements ContentLengthHeader {
    public static final String NAME_LOWER = "Content-Length".toLowerCase();
    private static final long serialVersionUID = 1187190542411037027L;
    protected int contentLength;

    public ContentLength() {
        super("Content-Length");
        this.contentLength = -1;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof ContentLengthHeader) && getContentLength() == ((ContentLengthHeader) obj).getContentLength();
    }

    @Override // android.javax.sip.header.ContentLengthHeader
    public int getContentLength() {
        return this.contentLength;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        return obj instanceof ContentLength;
    }

    @Override // android.javax.sip.header.ContentLengthHeader
    public void setContentLength(int i) {
        if (i >= 0) {
            this.contentLength = i;
        } else {
            itt0.r("JAIN-SIP Exception, ContentLength, setContentLength(), the contentLength parameter is <0");
        }
    }

    public ContentLength(int i) {
        super("Content-Length");
        this.contentLength = i;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        int i = this.contentLength;
        if (i < 0) {
            sb.append("0");
            return sb;
        }
        sb.append(i);
        return sb;
    }
}
