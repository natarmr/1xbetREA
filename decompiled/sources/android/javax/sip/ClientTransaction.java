package android.javax.sip;

import android.javax.sip.message.Request;

/* JADX INFO: loaded from: classes5.dex */
public interface ClientTransaction extends Transaction {
    Request createAck();

    Request createCancel();

    void sendRequest();
}
