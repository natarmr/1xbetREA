package android.javax.sip.address;

import android.javax.sip.header.Parameters;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface SipURI extends URI, Parameters {
    String getHeader(String str);

    Iterator getHeaderNames();

    String getHost();

    String getMAddrParam();

    String getMethodParam();

    int getPort();

    int getTTLParam();

    String getTransportParam();

    String getUser();

    String getUserParam();

    String getUserPassword();

    boolean hasLrParam();

    boolean isSecure();

    void removePort();

    void setHeader(String str, String str2);

    void setHost(String str);

    void setLrParam();

    void setMAddrParam(String str);

    void setMethodParam(String str);

    void setPort(int i);

    void setSecure(boolean z);

    void setTTLParam(int i);

    void setTransportParam(String str);

    void setUser(String str);

    void setUserParam(String str);

    void setUserPassword(String str);

    @Override // android.javax.sip.address.URI
    String toString();
}
