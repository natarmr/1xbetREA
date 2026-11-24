package android.javax.sip.header;

import android.javax.sip.address.URI;

/* JADX INFO: loaded from: classes.dex */
public interface ErrorInfoHeader extends Parameters, Header {
    public static final String NAME = "Error-Info";

    URI getErrorInfo();

    String getErrorMessage();

    void setErrorInfo(URI uri);

    void setErrorMessage(String str);
}
