package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.SipStack;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public interface SIPMessageValve {
    void destroy();

    void init(SipStack sipStack);

    boolean processRequest(SIPRequest sIPRequest, MessageChannel messageChannel);

    boolean processResponse(Response response, MessageChannel messageChannel);
}
