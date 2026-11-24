package android.gov.nist.javax.sip.header;

import android.javax.sip.address.Address;
import android.javax.sip.header.Parameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface AddressParameters extends Parameters {
    Address getAddress();

    Map<String, Map.Entry<String, String>> getParameters();

    void setAddress(Address address);
}
