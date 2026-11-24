package android.javax.sip;

import android.javax.sip.message.Request;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface Transaction extends Serializable {
    Object getApplicationData();

    String getBranchId();

    Dialog getDialog();

    Request getRequest();

    int getRetransmitTimer();

    TransactionState getState();

    void setApplicationData(Object obj);

    void setRetransmitTimer(int i);

    void terminate();
}
