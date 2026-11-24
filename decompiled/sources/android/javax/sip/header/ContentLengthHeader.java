package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface ContentLengthHeader extends Header {
    public static final String NAME = "Content-Length";

    int getContentLength();

    void setContentLength(int i);
}
