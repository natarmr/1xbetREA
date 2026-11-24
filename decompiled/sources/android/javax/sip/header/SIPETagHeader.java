package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface SIPETagHeader extends Header {
    public static final String NAME = "SIP-ETag";

    String getETag();

    void setETag(String str);
}
