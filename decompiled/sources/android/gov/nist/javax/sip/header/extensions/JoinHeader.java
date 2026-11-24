package android.gov.nist.javax.sip.header.extensions;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface JoinHeader extends Parameters, Header {
    public static final String NAME = "Join";

    String getCallId();

    String getFromTag();

    String getToTag();

    void setCallId(String str);

    void setFromTag(String str);

    void setToTag(String str);
}
