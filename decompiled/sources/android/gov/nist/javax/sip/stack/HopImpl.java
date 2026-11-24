package android.gov.nist.javax.sip.stack;

import a.axq;
import a.jf4;
import android.gov.nist.core.Separators;
import android.javax.sip.ListeningPoint;
import android.javax.sip.address.Hop;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class HopImpl implements Hop, Serializable {
    protected boolean defaultRoute;
    protected String host;
    protected int port;
    protected String transport;
    protected boolean uriRoute;

    public HopImpl(String str) {
        String strSubstring;
        if (str == null) {
            jf4.o("Null arg!");
            throw null;
        }
        int iIndexOf = str.indexOf(93);
        int iIndexOf2 = str.indexOf(58, iIndexOf);
        int iIndexOf3 = str.indexOf(47, iIndexOf2);
        if (iIndexOf2 > 0) {
            this.host = str.substring(0, iIndexOf2);
            if (iIndexOf3 > 0) {
                strSubstring = str.substring(iIndexOf2 + 1, iIndexOf3);
                this.transport = str.substring(iIndexOf3 + 1);
            } else {
                strSubstring = str.substring(iIndexOf2 + 1);
                this.transport = ListeningPoint.UDP;
            }
            try {
                this.port = Integer.parseInt(strSubstring);
            } catch (NumberFormatException unused) {
                jf4.o("Bad port spec");
                throw null;
            }
        } else {
            if (iIndexOf3 > 0) {
                this.host = str.substring(0, iIndexOf3);
                String strSubstring2 = str.substring(iIndexOf3 + 1);
                this.transport = strSubstring2;
                this.port = strSubstring2.equalsIgnoreCase(ListeningPoint.TLS) ? 5061 : 5060;
            } else {
                this.host = str;
                this.transport = ListeningPoint.UDP;
                this.port = 5060;
            }
        }
        String str2 = this.host;
        if (str2 == null || str2.length() == 0) {
            jf4.o("no host!");
            throw null;
        }
        this.host = this.host.trim();
        this.transport = this.transport.trim();
        if (iIndexOf <= 0 || this.host.charAt(0) == '[') {
            return;
        }
        jf4.o("Bad IPv6 reference spec");
        throw null;
    }

    @Override // android.javax.sip.address.Hop
    public String getHost() {
        return this.host;
    }

    @Override // android.javax.sip.address.Hop
    public int getPort() {
        return this.port;
    }

    @Override // android.javax.sip.address.Hop
    public String getTransport() {
        return this.transport;
    }

    public boolean isURIRoute() {
        return this.uriRoute;
    }

    public void setURIRouteFlag() {
        this.uriRoute = true;
    }

    @Override // android.javax.sip.address.Hop
    public String toString() {
        return this.host + Separators.COLON + this.port + Separators.SLASH + this.transport;
    }

    public HopImpl(String str, int i, String str2) {
        this.host = str;
        if (str.indexOf(Separators.COLON) >= 0 && this.host.indexOf("[") < 0) {
            this.host = axq.n(new StringBuilder("["), this.host, "]");
        }
        this.port = i;
        this.transport = str2;
    }
}
