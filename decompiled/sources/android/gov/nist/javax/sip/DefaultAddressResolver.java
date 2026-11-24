package android.gov.nist.javax.sip;

import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import android.javax.sip.address.Hop;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAddressResolver implements AddressResolver {
    @Override // android.gov.nist.core.net.AddressResolver
    public Hop resolveAddress(Hop hop) {
        return hop.getPort() != -1 ? hop : new HopImpl(hop.getHost(), MessageProcessor.getDefaultPort(hop.getTransport()), hop.getTransport());
    }
}
