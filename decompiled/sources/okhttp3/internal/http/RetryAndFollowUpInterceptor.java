package okhttp3.internal.http;

import a.e9d0;
import a.iun;
import a.jf4;
import a.tjo;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.header.WarningHeader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.SequentialExchangeFinder;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "", "MAX_FOLLOW_UPS", TokenNames.I, "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x0164  */
    /* JADX WARN: Code duplicated, block: B:114:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static Request b(Response response, Exchange exchange, RealInterceptorChain realInterceptorChain) throws ProtocolException {
        String strB;
        Request request;
        HttpUrl.Builder builder;
        HttpUrl httpUrlA;
        Request.Builder builderA;
        int i;
        RequestBody requestBody;
        Response response2;
        Route route = exchange != null ? exchange.c().c : null;
        int i2 = response.d;
        Request request2 = response.f46111a;
        String str = request2.b;
        boolean z = false;
        if (i2 == 307 || i2 == 308) {
            if (realInterceptorChain.f46172a.f46144a.h) {
                strB = response.f.b("Location");
                if (strB == null) {
                    strB = null;
                }
                request = response.f46111a;
                if (strB != null) {
                    HttpUrl httpUrl = request.f46108a;
                    httpUrl.getClass();
                    try {
                        builder = new HttpUrl.Builder();
                        builder.b(httpUrl, strB);
                    } catch (IllegalArgumentException unused) {
                        builder = null;
                    }
                    if (builder != null) {
                        httpUrlA = builder.a();
                    } else {
                        httpUrlA = null;
                    }
                    if (httpUrlA != null && (Intrinsics.d(httpUrlA.f46100a, request.f46108a.f46100a) || realInterceptorChain.f46172a.f46144a.i)) {
                        builderA = request.a();
                        if (HttpMethod.a(str)) {
                            i = response.d;
                            if (i == 303) {
                                z = !str.equals("PROPFIND");
                            } else if (i != 307 && i != 308 && !str.equals("PROPFIND") && !str.equals("QUERY")) {
                                z = true;
                            }
                            if (z) {
                                builderA.b("GET", null);
                                builderA.c.d("Transfer-Encoding");
                                builderA.c.d("Content-Length");
                                builderA.c.d("Content-Type");
                            } else {
                                builderA.b(str, request.d);
                            }
                        }
                        if (!_UtilJvmKt.a(request.f46108a, httpUrlA)) {
                            builderA.c.d("Authorization");
                        }
                        builderA.f46109a = httpUrlA;
                        return new Request(builderA);
                    }
                }
            }
        } else {
            if (i2 == 401) {
                return realInterceptorChain.i.d(route, response);
            }
            if (i2 == 421) {
                RequestBody requestBody2 = request2.d;
                if ((requestBody2 == null || !requestBody2.c()) && exchange != null && !Intrinsics.d(exchange.b.b().getJ().i.d, exchange.c.getB().getK().f46114a.i.d)) {
                    RealConnection realConnectionC = exchange.c();
                    synchronized (realConnectionC) {
                        realConnectionC.l = true;
                    }
                    return response.f46111a;
                }
            } else if (i2 == 503) {
                Response response3 = response.k;
                if ((response3 == null || response3.d != 503) && d(response, Integer.MAX_VALUE) == 0) {
                    return response.f46111a;
                }
            } else {
                if (i2 == 407) {
                    route.getClass();
                    if (route.b.type() == Proxy.Type.HTTP) {
                        return realInterceptorChain.p.d(route, response);
                    }
                    e9d0.j("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    return null;
                }
                if (i2 != 408) {
                    switch (i2) {
                        case 300:
                        case 301:
                        case 302:
                        case WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS /* 303 */:
                            if (realInterceptorChain.f46172a.f46144a.h) {
                                strB = response.f.b("Location");
                                if (strB == null) {
                                    strB = null;
                                }
                                request = response.f46111a;
                                if (strB != null) {
                                    HttpUrl httpUrl2 = request.f46108a;
                                    httpUrl2.getClass();
                                    builder = new HttpUrl.Builder();
                                    builder.b(httpUrl2, strB);
                                    if (builder != null) {
                                        httpUrlA = builder.a();
                                    } else {
                                        httpUrlA = null;
                                    }
                                    if (httpUrlA != null) {
                                        builderA = request.a();
                                        if (HttpMethod.a(str)) {
                                            i = response.d;
                                            if (i == 303) {
                                                z = !str.equals("PROPFIND");
                                            } else if (i != 307) {
                                                z = true;
                                            }
                                            if (z) {
                                                builderA.b("GET", null);
                                                builderA.c.d("Transfer-Encoding");
                                                builderA.c.d("Content-Length");
                                                builderA.c.d("Content-Type");
                                            } else {
                                                builderA.b(str, request.d);
                                            }
                                        }
                                        if (!_UtilJvmKt.a(request.f46108a, httpUrlA)) {
                                            builderA.c.d("Authorization");
                                        }
                                        builderA.f46109a = httpUrlA;
                                        return new Request(builderA);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (realInterceptorChain.r && (((requestBody = request2.d) == null || !requestBody.c()) && (((response2 = response.k) == null || response2.d != 408) && d(response, 0) <= 0))) {
                    return response.f46111a;
                }
            }
        }
        return null;
    }

    public static boolean c(IOException iOException, RealCall realCall, RealInterceptorChain realInterceptorChain, Request request) {
        RequestBody requestBody;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!realInterceptorChain.r) {
            return false;
        }
        if ((!z && (((requestBody = request.d) != null && requestBody.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Exchange exchange = realCall.s;
        if (exchange == null || !exchange.d) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.i;
        exchangeFinder.getClass();
        RoutePlanner routePlannerB = exchangeFinder.b();
        Exchange exchange2 = realCall.s;
        return routePlannerB.a(exchange2 != null ? exchange2.c() : null);
    }

    public static int d(Response response, int i) {
        String strB = response.f.b("Retry-After");
        if (strB == null) {
            strB = null;
        }
        if (strB == null) {
            return i;
        }
        if (!new Regex("\\d+").g(strB)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws Throwable {
        List list;
        boolean z;
        boolean z2;
        Response responseA;
        boolean z3;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Request request = realInterceptorChain.e;
        RealCall realCall = realInterceptorChain.f46172a;
        List listR0 = iun.f15405a;
        boolean z4 = false;
        boolean z5 = true;
        Request requestB = request;
        int i = 0;
        boolean z6 = true;
        Response response = null;
        while (true) {
            requestB.getClass();
            if (realCall.l != null) {
                jf4.n("Check failed.");
                return null;
            }
            synchronized (realCall) {
                if (realCall.n) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (realCall.m || realCall.p || realCall.o) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (z6) {
                List list2 = listR0;
                OkHttpClient okHttpClient = realCall.f46144a;
                TaskRunner taskRunner = okHttpClient.D;
                RealConnectionPool realConnectionPool = realInterceptorChain.k.f46084a;
                int i2 = realInterceptorChain.g;
                int i3 = realInterceptorChain.h;
                int i4 = realInterceptorChain.f;
                int i5 = okHttpClient.z;
                z = realInterceptorChain.r;
                boolean z7 = okHttpClient.f;
                HttpUrl httpUrl = requestB.f46108a;
                httpUrl.getClass();
                if (httpUrl.f()) {
                    SSLSocketFactory sSLSocketFactory2 = realInterceptorChain.t;
                    HostnameVerifier hostnameVerifier2 = realInterceptorChain.n;
                    certificatePinner = realInterceptorChain.j;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    certificatePinner = null;
                }
                String str = httpUrl.d;
                int i6 = httpUrl.e;
                Dns dns = realInterceptorChain.m;
                SocketFactory socketFactory = realInterceptorChain.s;
                Authenticator authenticator = realInterceptorChain.p;
                Proxy proxy = realInterceptorChain.o;
                OkHttpClient okHttpClient2 = realInterceptorChain.f46172a.f46144a;
                list = list2;
                RealRoutePlanner realRoutePlanner = new RealRoutePlanner(taskRunner, realConnectionPool, i2, i3, i4, i2, i5, z, z7, new Address(str, i6, dns, socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, authenticator, proxy, okHttpClient2.s, okHttpClient2.r, realInterceptorChain.q), realCall.f46144a.C, realCall, requestB);
                OkHttpClient okHttpClient3 = realCall.f46144a;
                realCall.i = okHttpClient3.f ? new FastFallbackExchangeFinder(realRoutePlanner, okHttpClient3.D) : new SequentialExchangeFinder(realRoutePlanner);
            } else {
                list = listR0;
            }
            try {
                if (realCall.r) {
                    throw new IOException("Canceled");
                }
                try {
                    Response.Builder builderC = realInterceptorChain.b(requestB).c();
                    builderC.f46112a = requestB;
                    if (response != null) {
                        try {
                            responseA = UnreadableResponseBodyKt.a(response);
                        } catch (Throwable th) {
                            th = th;
                            z2 = true;
                        }
                    } else {
                        responseA = null;
                    }
                    builderC.k = responseA;
                    Response responseA2 = builderC.a();
                    requestB = b(responseA2, realCall.l, realInterceptorChain);
                    if (requestB == null) {
                        try {
                            realCall.eventListener.p(realCall, responseA2);
                            realCall.c(false);
                            return responseA2;
                        } catch (Throwable th2) {
                            th = th2;
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                        RequestBody requestBody = requestB.d;
                        if (requestBody == null || !requestBody.c()) {
                            _UtilCommonKt.b(responseA2.g);
                            int i7 = i + 1;
                            EventListener eventListener = realCall.eventListener;
                            if (i7 > 20) {
                                eventListener.p(realCall, responseA2);
                                throw new ProtocolException("Too many follow-up requests: " + i7);
                            }
                            eventListener.p(realCall, responseA2);
                            z = true;
                            realCall.c(true);
                            response = responseA2;
                            i = i7;
                            z4 = false;
                            z6 = true;
                            z5 = true;
                            listR0 = list;
                        } else {
                            try {
                                realCall.eventListener.p(realCall, responseA2);
                                realCall.c(false);
                                return responseA2;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                    z2 = z3;
                } catch (IOException e) {
                    try {
                        z = true;
                        boolean zC = c(e, realCall, realInterceptorChain, requestB);
                        realCall.eventListener.C(realCall, e);
                        if (!zC) {
                            byte[] bArr = _UtilCommonKt.f46121a;
                            list.getClass();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                tjo.a(e, (Exception) it.next());
                            }
                            throw e;
                        }
                        listR0 = CollectionsKt.r0(list, e);
                        realCall.c(true);
                        z6 = false;
                        z4 = false;
                        z5 = true;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                realCall.c(z2);
                throw th;
            } catch (Throwable th5) {
                th = th5;
                z = true;
            }
            z2 = z;
            realCall.c(z2);
            throw th;
        }
    }
}
