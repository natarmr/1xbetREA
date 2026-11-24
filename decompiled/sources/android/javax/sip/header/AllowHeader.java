package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface AllowHeader extends Header {
    public static final String NAME = "Allow";

    String getMethod();

    void setMethod(String str);
}
