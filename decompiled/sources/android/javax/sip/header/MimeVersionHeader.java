package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface MimeVersionHeader extends Header {
    public static final String NAME = "MIME-Version";

    int getMajorVersion();

    int getMinorVersion();

    void setMajorVersion(int i);

    void setMinorVersion(int i);
}
