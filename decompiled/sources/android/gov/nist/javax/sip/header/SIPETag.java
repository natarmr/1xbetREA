package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.SIPETagHeader;

/* JADX INFO: loaded from: classes.dex */
public class SIPETag extends SIPHeader implements SIPETagHeader, ExtensionHeader {
    private static final long serialVersionUID = 3837543366074322107L;
    protected String entityTag;

    public SIPETag(String str) {
        this();
        setETag(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.entityTag);
        return sb;
    }

    @Override // android.javax.sip.header.SIPETagHeader
    public String getETag() {
        return this.entityTag;
    }

    @Override // android.javax.sip.header.SIPETagHeader
    public void setETag(String str) {
        if (str != null) {
            this.entityTag = str;
        } else {
            hny.u("JAIN-SIP Exception,SIP-ETag, setETag(), the etag parameter is null");
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) {
        setETag(str);
    }

    public SIPETag() {
        super("SIP-ETag");
    }
}
