package android.javax.sip.header;

import android.javax.sip.address.URI;

/* JADX INFO: loaded from: classes.dex */
public interface WWWAuthenticateHeader extends Parameters, Header {
    public static final String NAME = "WWW-Authenticate";

    String getAlgorithm();

    String getDomain();

    String getNonce();

    String getOpaque();

    String getQop();

    String getRealm();

    String getScheme();

    URI getURI();

    boolean isStale();

    void setAlgorithm(String str);

    void setDomain(String str);

    void setNonce(String str);

    void setOpaque(String str);

    void setQop(String str);

    void setRealm(String str);

    void setScheme(String str);

    void setStale(boolean z);

    void setURI(URI uri);
}
