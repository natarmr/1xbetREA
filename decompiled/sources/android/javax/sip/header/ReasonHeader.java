package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface ReasonHeader extends Parameters, Header {
    public static final String NAME = "Reason";

    int getCause();

    String getProtocol();

    String getText();

    void setCause(int i);

    void setProtocol(String str);

    void setText(String str);
}
