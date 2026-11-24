package okhttp3;

import a.emk0;
import a.hny;
import a.itt0;
import a.jf4;
import a.njk0;
import a.s5k0;
import a.w3d;
import a.zt;
import android.javax.sip.header.SubscriptionStateHeader;
import com.huawei.hms.android.HwBuildEx;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$schedule$2;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.RealWebSocket.WriterTask;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    public static final List F = _UtilJvmKt.k(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List G = _UtilJvmKt.k(new ConnectionSpec[]{ConnectionSpec.g, ConnectionSpec.h});
    public final char A;
    public final short B;
    public final RouteDatabase C;
    public final TaskRunner D;
    public final ConnectionPool E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dispatcher f46105a;
    public final List b;
    public final List c;
    public final itt0 d;
    public final boolean e;
    public final boolean f;
    public final Authenticator g;
    public final boolean h;
    public final boolean i;
    public final CookieJar j;
    public final Dns$Companion$SYSTEM$1 k;
    public final Proxy l;
    public final ProxySelector m;
    public final Authenticator n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final CertificatePinner u;
    public final CertificateChainCleaner v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public int A;
        public char B;
        public short C;
        public RouteDatabase D;
        public TaskRunner E;
        public ConnectionPool b;
        public itt0 e;
        public boolean f;
        public boolean g;
        public Authenticator h;
        public boolean i;
        public boolean j;
        public CookieJar k;
        public Dns$Companion$SYSTEM$1 l;
        public Proxy m;
        public ProxySelector n;
        public Authenticator o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List s;
        public List t;
        public HostnameVerifier u;
        public CertificatePinner v;
        public CertificateChainCleaner w;
        public int x;
        public int y;
        public int z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Dispatcher f46106a = new Dispatcher();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public Builder() {
            TimeZone timeZone = _UtilJvmKt.f46122a;
            this.e = new itt0();
            this.f = true;
            this.g = true;
            Authenticator authenticator = Authenticator.e1;
            this.h = authenticator;
            this.i = true;
            this.j = true;
            this.k = CookieJar.f46088a;
            this.l = Dns.f46091a;
            this.o = authenticator;
            Platform platform = Platform.f46208a;
            Platform.f46208a.getClass();
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.p = socketFactory;
            this.s = OkHttpClient.G;
            this.t = OkHttpClient.F;
            this.u = OkHostnameVerifier.f46222a;
            this.v = CertificatePinner.c;
            this.x = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            this.y = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            this.z = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            this.B = (char) 60000;
            this.C = (short) 1024;
        }

        public final void a(long j) {
            TimeUnit.SECONDS.getClass();
            this.x = _UtilJvmKt.b(j, SubscriptionStateHeader.TIMEOUT);
        }

        public final void b(long j) {
            TimeUnit.SECONDS.getClass();
            this.y = _UtilJvmKt.b(j, SubscriptionStateHeader.TIMEOUT);
        }

        public final void c(long j) {
            TimeUnit.SECONDS.getClass();
            this.z = _UtilJvmKt.b(j, SubscriptionStateHeader.TIMEOUT);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [int, short] */
    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector;
        SSLSocketFactory socketFactory;
        X509TrustManager x509TrustManagerN;
        CertificateChainCleaner certificateChainCleanerC;
        this.f46105a = builder.f46106a;
        this.b = _UtilJvmKt.j(builder.c);
        this.c = _UtilJvmKt.j(builder.d);
        this.d = builder.e;
        this.e = builder.f;
        this.f = builder.g;
        this.g = builder.h;
        this.h = builder.i;
        this.i = builder.j;
        this.j = builder.k;
        this.k = builder.l;
        Proxy proxy = builder.m;
        this.l = proxy;
        if (proxy != null) {
            proxySelector = NullProxySelector.f46216a;
        } else {
            proxySelector = builder.n;
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = NullProxySelector.f46216a;
            }
        }
        this.m = proxySelector;
        this.n = builder.o;
        this.o = builder.p;
        List list = builder.s;
        this.r = list;
        this.s = builder.t;
        this.t = builder.u;
        this.w = builder.x;
        this.x = builder.y;
        this.y = builder.z;
        this.z = builder.A;
        this.A = builder.B;
        this.B = builder.C;
        RouteDatabase routeDatabase = builder.D;
        this.C = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        TaskRunner taskRunner = builder.E;
        this.D = taskRunner == null ? TaskRunner.INSTANCE : taskRunner;
        ConnectionPool connectionPool = builder.b;
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            builder.b = connectionPool;
        }
        this.E = connectionPool;
        if (list != null && list.isEmpty()) {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = CertificatePinner.c;
            socketFactory = null;
            certificateChainCleanerC = null;
            x509TrustManagerN = null;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.p = null;
                this.v = null;
                this.q = null;
                this.u = CertificatePinner.c;
                socketFactory = null;
                certificateChainCleanerC = null;
                x509TrustManagerN = null;
                break;
            }
            if (((ConnectionSpec) it.next()).f46085a) {
                socketFactory = builder.q;
                if (socketFactory != null) {
                    this.p = socketFactory;
                    certificateChainCleanerC = builder.w;
                    certificateChainCleanerC.getClass();
                    this.v = certificateChainCleanerC;
                    x509TrustManagerN = builder.r;
                    x509TrustManagerN.getClass();
                    this.q = x509TrustManagerN;
                    CertificatePinner certificatePinner = builder.v;
                    certificatePinner.getClass();
                    this.u = Intrinsics.d(certificatePinner.b, certificateChainCleanerC) ? certificatePinner : new CertificatePinner(certificatePinner.f46079a, certificateChainCleanerC);
                    break;
                }
                Platform platform = Platform.f46208a;
                Platform.f46208a.getClass();
                x509TrustManagerN = Platform.n();
                this.q = x509TrustManagerN;
                Platform platform2 = Platform.f46208a;
                platform2.getClass();
                try {
                    SSLContext sSLContextM = platform2.m();
                    sSLContextM.init(null, new TrustManager[]{x509TrustManagerN}, null);
                    socketFactory = sSLContextM.getSocketFactory();
                    socketFactory.getClass();
                    this.p = socketFactory;
                    certificateChainCleanerC = Platform.f46208a.c(x509TrustManagerN);
                    this.v = certificateChainCleanerC;
                    CertificatePinner certificatePinner2 = builder.v;
                    certificatePinner2.getClass();
                    this.u = Intrinsics.d(certificatePinner2.b, certificateChainCleanerC) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f46079a, certificateChainCleanerC);
                    break;
                } catch (GeneralSecurityException e) {
                    throw new AssertionError("No System TLS: " + e, e);
                }
            }
        }
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            hny.t(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            hny.t(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f46085a) {
                    if (socketFactory == null) {
                        jf4.n("sslSocketFactory == null");
                        throw null;
                    }
                    if (certificateChainCleanerC == null) {
                        jf4.n("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerN != null) {
                        return;
                    }
                    jf4.n("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (socketFactory != null) {
            jf4.n("Check failed.");
            throw null;
        }
        if (certificateChainCleanerC != null) {
            jf4.n("Check failed.");
            throw null;
        }
        if (x509TrustManagerN != null) {
            jf4.n("Check failed.");
            throw null;
        }
        if (Intrinsics.d(this.u, CertificatePinner.c)) {
            return;
        }
        jf4.n("Check failed.");
        throw null;
    }

    @Override // okhttp3.Call.Factory
    public final RealCall a(Request request) {
        request.getClass();
        return new RealCall(this, request, false);
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [int, short] */
    public final Builder b() {
        Builder builder = new Builder();
        builder.f46106a = this.f46105a;
        builder.b = this.E;
        w3d.u(builder.c, this.b);
        w3d.u(builder.d, this.c);
        builder.e = this.d;
        builder.f = this.e;
        builder.g = this.f;
        builder.h = this.g;
        builder.i = this.h;
        builder.j = this.i;
        builder.k = this.j;
        builder.l = this.k;
        builder.m = this.l;
        builder.n = this.m;
        builder.o = this.n;
        builder.p = this.o;
        builder.q = this.p;
        builder.r = this.q;
        builder.s = this.r;
        builder.t = this.s;
        builder.u = this.t;
        builder.v = this.u;
        builder.w = this.v;
        builder.x = this.w;
        builder.y = this.x;
        builder.z = this.y;
        builder.A = this.z;
        builder.B = this.A;
        builder.C = this.B;
        builder.D = this.C;
        builder.E = this.D;
        return builder;
    }

    public final RealWebSocket c(Request request, WebSocketListener webSocketListener) {
        final RealWebSocket realWebSocket = new RealWebSocket(this.D, request, webSocketListener, new Random(), this.z, this.B, this.A);
        if (request.c.b("Sec-WebSocket-Extensions") != null) {
            RealWebSocket.j(realWebSocket, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return realWebSocket;
        }
        Builder builderB = b();
        builderB.e = new itt0();
        List list = RealWebSocket.x;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
            hny.v(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return null;
        }
        if (arrayList.contains(protocol) && arrayList.size() > 1) {
            hny.v(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return null;
        }
        if (arrayList.contains(Protocol.HTTP_1_0)) {
            hny.v(arrayList, "protocols must not contain http/1.0: ");
            return null;
        }
        if (arrayList.contains(null)) {
            jf4.o("protocols must not contain null");
            return null;
        }
        arrayList.remove(Protocol.SPDY_3);
        if (!arrayList.equals(builderB.t)) {
            builderB.D = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        builderB.t = listUnmodifiableList;
        OkHttpClient okHttpClient = new OkHttpClient(builderB);
        Request.Builder builderA = request.a();
        builderA.a("Upgrade", "websocket");
        builderA.a("Connection", "Upgrade");
        builderA.a("Sec-WebSocket-Key", realWebSocket.g);
        builderA.a("Sec-WebSocket-Version", "13");
        builderA.a("Sec-WebSocket-Extensions", "permessage-deflate");
        final Request request2 = new Request(builderA);
        RealCall realCall = new RealCall(okHttpClient, request2, true);
        realWebSocket.h = realCall;
        realCall.s0(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public final void b(Call call, IOException iOException) {
                RealWebSocket.j(realWebSocket, iOException, null, 6);
            }

            @Override // okhttp3.Callback
            public final void h(Call call, Response response) {
                emk0 emk0VarB;
                s5k0 s5k0VarA;
                int iIntValue;
                String strF0;
                try {
                    njk0 njk0VarI = realWebSocket.i(response);
                    Headers headers = response.f;
                    int size = headers.size();
                    int i = 0;
                    int i2 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    Integer intOrNull = null;
                    Integer intOrNull2 = null;
                    while (i2 < size) {
                        if (_HeadersCommonKt.c(headers, i2).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String strE = _HeadersCommonKt.e(headers, i2);
                            int i3 = i;
                            while (i3 < strE.length()) {
                                headers = headers;
                                int iG = _UtilCommonKt.g(strE, ',', i3, i, 4);
                                int iF = _UtilCommonKt.f(strE, ';', i3, iG);
                                int iJ = _UtilCommonKt.j(i3, iF, strE);
                                String strSubstring = strE.substring(iJ, _UtilCommonKt.k(iJ, iF, strE));
                                i3 = iF + 1;
                                if (strSubstring.equalsIgnoreCase("permessage-deflate")) {
                                    if (z) {
                                        z4 = true;
                                    }
                                    while (true) {
                                        i3 = i3;
                                        while (true) {
                                            if (i3 >= iG) {
                                                break;
                                            }
                                            int iF2 = _UtilCommonKt.f(strE, ';', i3, iG);
                                            int iF3 = _UtilCommonKt.f(strE, '=', i3, iF2);
                                            int iJ2 = _UtilCommonKt.j(i3, iF3, strE);
                                            String strSubstring2 = strE.substring(iJ2, _UtilCommonKt.k(iJ2, iF3, strE));
                                            if (iF3 < iF2) {
                                                int iJ3 = _UtilCommonKt.j(iF3 + 1, iF2, strE);
                                                strF0 = StringsKt.f0(strE.substring(iJ3, _UtilCommonKt.k(iJ3, iF2, strE)));
                                            } else {
                                                strF0 = null;
                                            }
                                            i3 = iF2 + 1;
                                            if (strSubstring2.equalsIgnoreCase("client_max_window_bits")) {
                                                if (intOrNull != null) {
                                                    z4 = true;
                                                }
                                                intOrNull = strF0 != null ? StringsKt.toIntOrNull(strF0) : null;
                                                if (intOrNull != null) {
                                                }
                                                z4 = true;
                                            } else if (strSubstring2.equalsIgnoreCase("client_no_context_takeover")) {
                                                if (z2) {
                                                    z4 = true;
                                                }
                                                if (strF0 != null) {
                                                    z4 = true;
                                                }
                                                z2 = true;
                                            } else {
                                                if (strSubstring2.equalsIgnoreCase("server_max_window_bits")) {
                                                    if (intOrNull2 != null) {
                                                        z4 = true;
                                                    }
                                                    intOrNull2 = strF0 != null ? StringsKt.toIntOrNull(strF0) : null;
                                                    if (intOrNull2 != null) {
                                                    }
                                                } else if (strSubstring2.equalsIgnoreCase("server_no_context_takeover")) {
                                                    if (z3) {
                                                        z4 = true;
                                                    }
                                                    if (strF0 != null) {
                                                        z4 = true;
                                                    }
                                                    z3 = true;
                                                }
                                                z4 = true;
                                            }
                                        }
                                    }
                                    i = 0;
                                    z = true;
                                } else {
                                    i3 = i3;
                                    i = 0;
                                    z4 = true;
                                }
                            }
                        }
                        i2++;
                        headers = headers;
                        i = 0;
                    }
                    realWebSocket.d = new WebSocketExtensions(z, intOrNull, z2, intOrNull2, z3, z4);
                    if (z4 || intOrNull != null || (intOrNull2 != null && (8 > (iIntValue = intOrNull2.intValue()) || iIntValue >= 16))) {
                        RealWebSocket realWebSocket2 = realWebSocket;
                        synchronized (realWebSocket2) {
                            realWebSocket2.p.clear();
                            realWebSocket2.f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    String str = _UtilJvmKt.b + " WebSocket " + request2.f46108a.h();
                    RealWebSocket realWebSocket3 = realWebSocket;
                    BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = new BufferedSocketKt$asBufferedSocket$1(njk0VarI);
                    WebSocketExtensions webSocketExtensions = realWebSocket3.d;
                    webSocketExtensions.getClass();
                    synchronized (realWebSocket3) {
                        try {
                            realWebSocket3.m = str;
                            realWebSocket3.n = bufferedSocketKt$asBufferedSocket$1;
                            realWebSocket3.k = new WebSocketWriter(bufferedSocketKt$asBufferedSocket$1.c, realWebSocket3.b, webSocketExtensions.f46231a, webSocketExtensions.c, realWebSocket3.e);
                            realWebSocket3.i = realWebSocket3.new WriterTask();
                            long j = realWebSocket3.c;
                            byte b = 6;
                            if (j != 0) {
                                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                                TaskQueue taskQueue = realWebSocket3.l;
                                zt ztVar = new zt(realWebSocket3, nanos, b);
                                taskQueue.getClass();
                                taskQueue.d(new TaskQueue$schedule$2(str + " ping", ztVar), nanos);
                            }
                            if (!realWebSocket3.p.isEmpty()) {
                                realWebSocket3.l();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    realWebSocket3.j = new WebSocketReader(bufferedSocketKt$asBufferedSocket$1.b, realWebSocket3, webSocketExtensions.f46231a, webSocketExtensions.e);
                    RealWebSocket realWebSocket4 = realWebSocket;
                    try {
                        realWebSocket4.f46227a.e(realWebSocket4, response);
                        while (realWebSocket4.s == -1) {
                            WebSocketReader webSocketReader = realWebSocket4.j;
                            webSocketReader.getClass();
                            webSocketReader.a();
                        }
                    } catch (Exception e) {
                        RealWebSocket.j(realWebSocket4, e, null, 6);
                    } finally {
                        realWebSocket4.k();
                    }
                } catch (IOException e2) {
                    RealWebSocket.j(realWebSocket, e2, response, 4);
                    _UtilCommonKt.b(response);
                    njk0 njk0Var = response.h;
                    if (njk0Var != null && (s5k0VarA = njk0Var.a()) != null) {
                        _UtilCommonKt.b(s5k0VarA);
                    }
                    njk0 njk0Var2 = response.h;
                    if (njk0Var2 == null || (emk0VarB = njk0Var2.b()) == null) {
                        return;
                    }
                    _UtilCommonKt.b(emk0VarB);
                }
            }
        });
        return realWebSocket;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
