package android.gov.nist.javax.sip.address;

import android.javax.sip.address.Hop;
import android.javax.sip.address.Router;

/* JADX INFO: loaded from: classes.dex */
public interface RouterExt extends Router {
    void transactionTimeout(Hop hop);
}
