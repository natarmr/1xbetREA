package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.SIPIfMatchHeader;

/* JADX INFO: loaded from: classes.dex */
public class SIPIfMatch extends SIPHeader implements SIPIfMatchHeader, ExtensionHeader {
    private static final long serialVersionUID = 3833745477828359730L;
    protected String entityTag;

    public SIPIfMatch(String str) {
        this();
        setETag(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.entityTag);
        return sb;
    }

    @Override // android.javax.sip.header.SIPIfMatchHeader
    public String getETag() {
        return this.entityTag;
    }

    @Override // android.javax.sip.header.SIPIfMatchHeader
    public void setETag(String str) {
        if (str != null) {
            this.entityTag = str;
        } else {
            hny.u("JAIN-SIP Exception,SIP-If-Match, setETag(), the etag parameter is null");
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) {
        setETag(str);
    }

    public SIPIfMatch() {
        super("SIP-If-Match");
    }
}
