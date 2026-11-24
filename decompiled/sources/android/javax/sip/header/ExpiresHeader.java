package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface ExpiresHeader extends Header {
    public static final String NAME = "Expires";

    int getExpires();

    void setExpires(int i);
}
