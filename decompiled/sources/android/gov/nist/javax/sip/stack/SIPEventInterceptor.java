package android.gov.nist.javax.sip.stack;

import android.javax.sip.SipStack;
import android.javax.sip.message.Message;

/* JADX INFO: loaded from: classes.dex */
public interface SIPEventInterceptor {
    void afterMessage(Message message);

    void beforeMessage(Message message);

    void destroy();

    void init(SipStack sipStack);
}
