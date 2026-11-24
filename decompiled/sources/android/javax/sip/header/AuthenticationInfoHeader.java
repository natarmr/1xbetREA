package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface AuthenticationInfoHeader extends Parameters, Header {
    public static final String NAME = "Authentication-Info";

    String getCNonce();

    String getNextNonce();

    int getNonceCount();

    String getQop();

    String getResponse();

    void setCNonce(String str);

    void setNextNonce(String str);

    void setNonceCount(int i);

    void setQop(String str);

    void setResponse(String str);
}
