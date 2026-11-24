package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.address.URI;
import android.javax.sip.header.Header;
import android.javax.sip.header.HeaderAddress;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface PAssociatedURIHeader extends HeaderAddress, Parameters, Header {
    public static final String NAME = "P-Associated-URI";

    URI getAssociatedURI();

    void setAssociatedURI(URI uri);
}
