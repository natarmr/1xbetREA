package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.address.Hop;

/* JADX INFO: loaded from: classes.dex */
public interface AckSendingStrategy {
    Hop getLastHop();

    void send(SIPRequest sIPRequest);
}
