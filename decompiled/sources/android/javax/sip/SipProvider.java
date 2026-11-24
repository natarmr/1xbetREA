package android.javax.sip;

import android.javax.sip.header.CallIdHeader;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public interface SipProvider {
    void addListeningPoint(ListeningPoint listeningPoint);

    void addSipListener(SipListener sipListener);

    ListeningPoint getListeningPoint();

    ListeningPoint getListeningPoint(String str);

    ListeningPoint[] getListeningPoints();

    CallIdHeader getNewCallId();

    ClientTransaction getNewClientTransaction(Request request);

    Dialog getNewDialog(Transaction transaction);

    ServerTransaction getNewServerTransaction(Request request);

    SipStack getSipStack();

    void removeListeningPoint(ListeningPoint listeningPoint);

    void removeSipListener(SipListener sipListener);

    void sendRequest(Request request);

    void sendResponse(Response response);

    void setAutomaticDialogSupportEnabled(boolean z);

    void setListeningPoint(ListeningPoint listeningPoint);
}
