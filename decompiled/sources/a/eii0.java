package a;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.HandshakeCertificates;

/* JADX INFO: loaded from: classes2.dex */
public final class eii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn00 f7862a;
    public final int b;
    public final n0o0 c = maz.b(new gei0(this));

    public eii0(zn00 zn00Var, int i) {
        this.f7862a = zn00Var;
        this.b = i;
    }

    public static void b(OkHttpClient.Builder builder, e6d0 e6d0Var) {
        Proxy proxy;
        Proxy.Type type;
        e6d0Var.getClass();
        String str = e6d0Var.c;
        int i = e6d0Var.d;
        dtg0 dtg0Var = new dtg0();
        if (dtg0Var != builder.n) {
            builder.D = null;
        }
        builder.n = dtg0Var;
        if (e6d0Var.f7278a) {
            if (!StringsKt.W(str) && i > 0) {
                if (str != null && str.length() != 0) {
                    try {
                        new Dns.Request(str, -1);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                Proxy proxy2 = Proxy.NO_PROXY;
                if (!Intrinsics.d(proxy2, builder.m)) {
                    builder.D = null;
                }
                builder.m = proxy2;
                return;
            }
            if (StringsKt.W(str) || i <= 0) {
                proxy = null;
            } else {
                int iOrdinal = e6d0Var.b.ordinal();
                if (iOrdinal == 0) {
                    type = Proxy.Type.HTTP;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    type = Proxy.Type.SOCKS;
                }
                proxy = new Proxy(type, InetSocketAddress.createUnresolved(str, i));
            }
            ex60 ex60Var = (StringsKt.W(e6d0Var.e) && StringsKt.W(e6d0Var.f)) ? null : new ex60(e6d0Var, (byte) 29);
            if (ex60Var != null) {
                if (ex60Var != builder.o) {
                    builder.D = null;
                }
                builder.o = ex60Var;
            }
            if (!Intrinsics.d(proxy, builder.m)) {
                builder.D = null;
            }
            builder.m = proxy;
        }
    }

    public final void a(OkHttpClient.Builder builder) {
        if (this.b <= 25) {
            HandshakeCertificates handshakeCertificates = (HandshakeCertificates) this.c.getValue();
            handshakeCertificates.getClass();
            Platform platform = Platform.f46208a;
            SSLContext sSLContextM = Platform.f46208a.m();
            sSLContextM.init(new KeyManager[]{handshakeCertificates.f46237a}, new TrustManager[]{handshakeCertificates.b}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContextM.getSocketFactory();
            socketFactory.getClass();
            X509TrustManager x509TrustManager = ((HandshakeCertificates) this.c.getValue()).b;
            if (!socketFactory.equals(builder.q) || !x509TrustManager.equals(builder.r)) {
                builder.D = null;
            }
            builder.q = socketFactory;
            builder.w = Platform.f46208a.c(x509TrustManager);
            builder.r = x509TrustManager;
        }
    }
}
