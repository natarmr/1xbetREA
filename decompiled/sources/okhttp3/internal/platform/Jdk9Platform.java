package okhttp3.internal.platform;

import a.qg9;
import android.javax.sip.ListeningPoint;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Jdk9Platform extends Platform {
    public static final Integer c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt.toIntOrNull(property) : null;
        c = intOrNull;
        if (intOrNull != null) {
            intOrNull.getClass();
        } else {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(SSLSocket sSLSocket, String str, List list, qg9 qg9Var) {
        list.getClass();
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String h(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext m() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = c;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance(ListeningPoint.TLS);
            sSLContext2.getClass();
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance(ListeningPoint.TLS);
        }
        sSLContext.getClass();
        return sSLContext;
    }
}
