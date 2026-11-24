package android.gov.nist.javax.sip.header.ims;

import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface SecurityAgreeHeader extends Parameters, Header {
    String getAlgorithm();

    String getEncryptionAlgorithm();

    String getMode();

    int getPortClient();

    int getPortServer();

    float getPreference();

    String getProtocol();

    int getSPIClient();

    int getSPIServer();

    String getSecurityMechanism();

    void setAlgorithm(String str);

    void setEncryptionAlgorithm(String str);

    void setMode(String str);

    void setPortClient(int i);

    void setPortServer(int i);

    void setPreference(float f);

    void setProtocol(String str);

    void setSPIClient(int i);

    void setSPIServer(int i);

    void setSecurityMechanism(String str);
}
