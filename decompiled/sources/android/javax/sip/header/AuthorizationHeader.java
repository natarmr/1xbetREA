package android.javax.sip.header;

import android.javax.sip.address.URI;

/* JADX INFO: loaded from: classes.dex */
public interface AuthorizationHeader extends Parameters, Header {
    public static final String NAME = "Authorization";

    String getAlgorithm();

    String getCNonce();

    String getNonce();

    int getNonceCount();

    String getOpaque();

    String getQop();

    String getRealm();

    String getResponse();

    String getScheme();

    URI getURI();

    String getUsername();

    void setAlgorithm(String str);

    void setCNonce(String str);

    void setNonce(String str);

    void setNonceCount(int i);

    void setOpaque(String str);

    void setQop(String str);

    void setRealm(String str);

    void setResponse(String str);

    void setScheme(String str);

    void setURI(URI uri);

    void setUsername(String str);
}
