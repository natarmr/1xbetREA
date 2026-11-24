package android.javax.sip.address;

import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public interface TelURL extends URI, Parameters {
    String getIsdnSubAddress();

    String getPhoneContext();

    String getPhoneNumber();

    String getPostDial();

    boolean isGlobal();

    void setGlobal(boolean z);

    void setIsdnSubAddress(String str);

    void setPhoneContext(String str);

    void setPhoneNumber(String str);

    void setPostDial(String str);

    @Override // android.javax.sip.address.URI
    String toString();
}
