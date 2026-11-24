package android.gov.nist.javax.sip;

import android.javax.sip.Dialog;
import android.javax.sip.SipProvider;

/* JADX INFO: loaded from: classes.dex */
public interface DialogExt extends Dialog {
    void disableSequenceNumberValidation();

    Dialog getOriginalDialog();

    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    SipProvider getSipProvider();

    boolean isForked();

    void setBackToBackUserAgent();

    void setEarlyDialogTimeoutSeconds(int i);

    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);
}
