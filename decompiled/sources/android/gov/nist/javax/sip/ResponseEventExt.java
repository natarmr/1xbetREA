package android.gov.nist.javax.sip;

import android.javax.sip.Dialog;
import android.javax.sip.ResponseEvent;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public class ResponseEventExt extends ResponseEvent {
    private boolean isForked;
    private boolean isRetransmission;
    private ClientTransactionExt m_originalTransaction;
    private String remoteIpAddress;
    private int remotePort;

    public ResponseEventExt(Object obj, ClientTransactionExt clientTransactionExt, Dialog dialog, Response response) {
        super(obj, clientTransactionExt, dialog, response);
        this.m_originalTransaction = clientTransactionExt;
    }

    public ClientTransactionExt getOriginalTransaction() {
        return this.m_originalTransaction;
    }

    public String getRemoteIpAddress() {
        return this.remoteIpAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public boolean isForkedResponse() {
        return this.isForked;
    }

    public boolean isRetransmission() {
        return this.isRetransmission;
    }

    public void setForkedResponse(boolean z) {
        this.isForked = z;
    }

    public void setOriginalTransaction(ClientTransactionExt clientTransactionExt) {
        this.m_originalTransaction = clientTransactionExt;
    }

    public void setRemoteIpAddress(String str) {
        this.remoteIpAddress = str;
    }

    public void setRemotePort(int i) {
        this.remotePort = i;
    }

    public void setRetransmission(boolean z) {
        this.isRetransmission = z;
    }
}
