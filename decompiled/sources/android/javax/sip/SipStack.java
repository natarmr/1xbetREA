package android.javax.sip;

import android.javax.sip.address.Router;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface SipStack {
    ListeningPoint createListeningPoint(int i, String str);

    ListeningPoint createListeningPoint(String str, int i, String str2);

    SipProvider createSipProvider(ListeningPoint listeningPoint);

    void deleteListeningPoint(ListeningPoint listeningPoint);

    void deleteSipProvider(SipProvider sipProvider);

    String getIPAddress();

    Iterator getListeningPoints();

    Router getRouter();

    Iterator getSipProviders();

    String getStackName();

    boolean isRetransmissionFilterActive();

    void start();

    void stop();
}
