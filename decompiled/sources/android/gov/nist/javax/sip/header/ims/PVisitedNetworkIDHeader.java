package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Token;
import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface PVisitedNetworkIDHeader extends Parameters, Header {
    public static final String NAME = "P-Visited-Network-ID";

    String getVisitedNetworkID();

    void setVisitedNetworkID(Token token);

    void setVisitedNetworkID(String str);
}
