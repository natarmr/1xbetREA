package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface SubjectHeader extends Header {
    public static final String NAME = "Subject";

    String getSubject();

    void setSubject(String str);
}
