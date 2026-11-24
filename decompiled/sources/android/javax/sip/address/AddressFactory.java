package android.javax.sip.address;

/* JADX INFO: loaded from: classes.dex */
public interface AddressFactory {
    Address createAddress(URI uri);

    Address createAddress(String str);

    Address createAddress(String str, URI uri);

    SipURI createSipURI(String str, String str2);

    TelURL createTelURL(String str);

    URI createURI(String str);
}
