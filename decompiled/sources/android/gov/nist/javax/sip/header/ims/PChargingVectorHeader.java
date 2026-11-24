package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface PChargingVectorHeader extends Header, Parameters {
    public static final String NAME = "P-Charging-Vector";

    String getICID();

    String getICIDGeneratedAt();

    String getOriginatingIOI();

    String getTerminatingIOI();

    void setICID(String str);

    void setICIDGeneratedAt(String str);

    void setOriginatingIOI(String str);

    void setTerminatingIOI(String str);
}
