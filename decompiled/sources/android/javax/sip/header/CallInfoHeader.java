package android.javax.sip.header;

import android.javax.sip.address.URI;

/* JADX INFO: loaded from: classes.dex */
public interface CallInfoHeader extends Parameters, Header {
    public static final String NAME = "Call-Info";

    URI getInfo();

    String getPurpose();

    void setInfo(URI uri);

    void setPurpose(String str);
}
