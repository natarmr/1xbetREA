package android.gov.nist.javax.sip;

import android.javax.sip.SipProvider;
import android.javax.sip.Transaction;
import java.security.cert.Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface TransactionExt extends Transaction {
    List<String> extractCertIdentities();

    String getCipherSuite();

    String getHost();

    Certificate[] getLocalCertificates();

    String getPeerAddress();

    Certificate[] getPeerCertificates();

    int getPeerPort();

    int getPort();

    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    SipProvider getSipProvider();

    int getTimerD();

    int getTimerT2();

    int getTimerT4();

    String getTransport();

    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    void setTimerD(int i);

    void setTimerT2(int i);

    void setTimerT4(int i);
}
