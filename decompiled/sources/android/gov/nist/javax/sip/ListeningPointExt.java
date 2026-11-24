package android.gov.nist.javax.sip;

import android.javax.sip.ListeningPoint;
import android.javax.sip.header.ContactHeader;
import android.javax.sip.header.ViaHeader;

/* JADX INFO: loaded from: classes.dex */
public interface ListeningPointExt extends ListeningPoint {
    public static final String WS = "WS";
    public static final String WSS = "WSS";

    ContactHeader createContactHeader();

    ViaHeader createViaHeader();

    void sendHeartbeat(String str, int i);
}
