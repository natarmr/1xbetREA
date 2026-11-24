package okhttp3.internal.http;

import a.c99;
import a.jf4;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealCall f46172a;
    public final ArrayList b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public final Authenticator i;
    public final CertificatePinner j;
    public final ConnectionPool k;
    public final CookieJar l;
    public final Dns m;
    public final HostnameVerifier n;
    public final Proxy o;
    public final Authenticator p;
    public final ProxySelector q;
    public final boolean r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final CertificateChainCleaner v;
    public int w;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner) {
        request.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.f46172a = realCall;
        this.b = arrayList;
        this.c = i;
        this.d = exchange;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = authenticator;
        this.j = certificatePinner;
        this.k = connectionPool;
        this.l = cookieJar;
        this.m = dns;
        this.n = hostnameVerifier;
        this.o = proxy;
        this.p = authenticator2;
        this.q = proxySelector;
        this.r = z;
        this.s = socketFactory;
        this.t = sSLSocketFactory;
        this.u = x509TrustManager;
        this.v = certificateChainCleaner;
    }

    public static RealInterceptorChain a(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        int i3 = (i2 & 1) != 0 ? realInterceptorChain.c : i;
        Exchange exchange2 = (i2 & 2) != 0 ? realInterceptorChain.d : exchange;
        Request request2 = (i2 & 4) != 0 ? realInterceptorChain.e : request;
        int i4 = realInterceptorChain.f;
        int i5 = realInterceptorChain.g;
        int i6 = realInterceptorChain.h;
        Authenticator authenticator = realInterceptorChain.i;
        CertificatePinner certificatePinner = realInterceptorChain.j;
        ConnectionPool connectionPool = realInterceptorChain.k;
        CookieJar cookieJar = realInterceptorChain.l;
        Dns dns = realInterceptorChain.m;
        HostnameVerifier hostnameVerifier = realInterceptorChain.n;
        Proxy proxy = realInterceptorChain.o;
        Authenticator authenticator2 = realInterceptorChain.p;
        ProxySelector proxySelector = realInterceptorChain.q;
        boolean z = realInterceptorChain.r;
        SocketFactory socketFactory = realInterceptorChain.s;
        SSLSocketFactory sSLSocketFactory = realInterceptorChain.t;
        X509TrustManager x509TrustManager = realInterceptorChain.u;
        CertificateChainCleaner certificateChainCleaner = realInterceptorChain.v;
        request2.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new RealInterceptorChain(realInterceptorChain.f46172a, realInterceptorChain.b, i3, exchange2, request2, i4, i5, i6, authenticator, certificatePinner, connectionPool, cookieJar, dns, hostnameVerifier, proxy, authenticator2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, certificateChainCleaner);
    }

    public final Response b(Request request) {
        request.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            jf4.n("Check failed.");
            return null;
        }
        this.w++;
        Exchange exchange = this.d;
        if (exchange != null) {
            if (!exchange.b.b().b(request.f46108a)) {
                c99.t(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.w != 1) {
                c99.t(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        RealInterceptorChain realInterceptorChainA = a(this, i2, null, request, 2097146);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseA = interceptor.a(realInterceptorChainA);
        if (responseA == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange == null || i2 >= arrayList.size() || realInterceptorChainA.w == 1) {
            return responseA;
        }
        c99.t(interceptor, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
