package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public interface PChargingFunctionAddressesHeader extends Parameters, Header {
    public static final String NAME = "P-Charging-Function-Addresses";

    void addChargingCollectionFunctionAddress(String str);

    void addEventChargingFunctionAddress(String str);

    ListIterator getChargingCollectionFunctionAddresses();

    ListIterator getEventChargingFunctionAddresses();

    void removeChargingCollectionFunctionAddress(String str);

    void removeEventChargingFunctionAddress(String str);

    void setChargingCollectionFunctionAddress(String str);

    void setEventChargingFunctionAddress(String str);
}
