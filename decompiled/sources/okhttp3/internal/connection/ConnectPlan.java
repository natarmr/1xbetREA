package okhttp3.internal.connection;

import a.axq;
import a.fmq0;
import a.gl5;
import a.iun;
import a.jf4;
import a.kk0;
import a.ntm0;
import a.ohq;
import a.pmi;
import a.qg9;
import a.r950;
import a.twn;
import a.vqd;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.ech.EchUntrustedException;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateBlocklist;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f46137a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final RealCall i;
    public final RealRoutePlanner j;
    public final Route k;
    public final List l;
    public final int m;
    public final Request n;
    public final int o;
    public final boolean p;
    public final EchRetryPlan q;
    public volatile boolean r;
    public Socket s;
    public Socket t;
    public Handshake u;
    public Protocol v;
    public BufferedSocketKt$asBufferedSocket$1 w;
    public RealConnection x;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan$Companion;", "", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "", "MAX_TUNNEL_ATTEMPTS", TokenNames.I, "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46138a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46138a = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List list, int i6, Request request, int i7, boolean z2, EchRetryPlan echRetryPlan) {
        taskRunner.getClass();
        route.getClass();
        this.f46137a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = realCall;
        this.j = realRoutePlanner;
        this.k = route;
        this.l = list;
        this.m = i6;
        this.n = request;
        this.o = i7;
        this.p = z2;
        this.q = echRetryPlan;
    }

    public static ConnectPlan k(ConnectPlan connectPlan, Route route, int i, Request request, int i2, boolean z, EchRetryPlan echRetryPlan, int i3) {
        return new ConnectPlan(connectPlan.f46137a, connectPlan.b, connectPlan.c, connectPlan.d, connectPlan.e, connectPlan.f, connectPlan.g, connectPlan.h, connectPlan.i, connectPlan.j, (i3 & 1) != 0 ? connectPlan.k : route, connectPlan.l, (i3 & 2) != 0 ? connectPlan.m : i, (i3 & 4) != 0 ? connectPlan.n : request, (i3 & 8) != 0 ? connectPlan.o : i2, (i3 & 16) != 0 ? connectPlan.p : z, (i3 & 32) != 0 ? connectPlan.q : echRetryPlan);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan a() {
        return new ConnectPlan(this.f46137a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: b */
    public final RealConnection getF46149a() {
        RouteDatabase routeDatabase = this.i.f46144a.C;
        Route route = this.k;
        synchronized (routeDatabase) {
            route.getClass();
            routeDatabase.f46150a.remove(route);
        }
        RealConnection realConnection = this.x;
        realConnection.getClass();
        this.k.getClass();
        ReusePlan reusePlanE = this.j.e(this, this.l);
        if (reusePlanE != null) {
            return reusePlanE.f46149a;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.b;
            TimeZone timeZone = _UtilJvmKt.f46122a;
            realConnectionPool.d.add(realConnection);
            realConnectionPool.b.d(realConnectionPool.c, 0L);
            this.i.a(realConnection);
        }
        this.i.eventListener.j(this.i, realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c() {
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        this.r = true;
        Socket socket = this.s;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult d() throws Throwable {
        Socket socket = this.s;
        if (socket == null) {
            jf4.o("TCP not connected");
            return null;
        }
        if (isReady()) {
            jf4.n("already connected");
            return null;
        }
        List list = this.k.f46114a.k;
        this.i.t.add(this);
        boolean z = false;
        try {
            try {
                if (this.n != null) {
                    RoutePlanner.ConnectResult connectResultJ = j();
                    if (connectResultJ.b != null || connectResultJ.c != null) {
                        this.i.t.remove(this);
                        Socket socket2 = this.t;
                        if (socket2 != null) {
                            _UtilJvmKt.c(socket2);
                        }
                        _UtilJvmKt.c(socket);
                        return connectResultJ;
                    }
                }
                Address address = this.k.f46114a;
                if (address.c != null) {
                    BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = this.w;
                    if (bufferedSocketKt$asBufferedSocket$1 == null) {
                        Intrinsics.h("socket");
                        throw null;
                    }
                    if (bufferedSocketKt$asBufferedSocket$1.b.b.v0()) {
                        BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$2 = this.w;
                        if (bufferedSocketKt$asBufferedSocket$2 == null) {
                            Intrinsics.h("socket");
                            throw null;
                        }
                        if (bufferedSocketKt$asBufferedSocket$2.c.b.v0()) {
                            this.i.eventListener.F(this.i);
                            Address address2 = this.k.f46114a;
                            SSLSocketFactory sSLSocketFactory = address2.c;
                            HttpUrl httpUrl = address2.i;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, httpUrl.d, httpUrl.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ConnectPlan connectPlanN = n(list, sSLSocket);
                            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(connectPlanN.o);
                            connectionSpec.a(sSLSocket, connectPlanN.p);
                            try {
                                i(sSLSocket, connectionSpec);
                                this.i.eventListener.E(this.i, this.u);
                            } catch (SSLException e) {
                                connectPlanN.m(list, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.t = socket;
                List list2 = address.j;
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.v = protocol;
                TaskRunner taskRunner = this.f46137a;
                RealConnectionPool realConnectionPool = this.b;
                Route route = this.k;
                Socket socket3 = this.t;
                socket3.getClass();
                Handshake handshake = this.u;
                Protocol protocol2 = this.v;
                protocol2.getClass();
                BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$3 = this.w;
                if (bufferedSocketKt$asBufferedSocket$3 == null) {
                    Intrinsics.h("socket");
                    throw null;
                }
                RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, socket, socket3, handshake, protocol2, bufferedSocketKt$asBufferedSocket$3, this.g);
                this.x = realConnection;
                realConnection.i();
                EventListener eventListener = this.i.eventListener;
                RealCall realCall = this.i;
                Route route2 = this.k;
                eventListener.g(realCall, route2.c, route2.b, this.v);
                try {
                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                    this.i.t.remove(this);
                    return connectResult;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    EventListener eventListener2 = this.i.eventListener;
                    RealCall realCall2 = this.i;
                    Route route3 = this.k;
                    eventListener2.h(realCall2, route3.c, route3.b, e);
                    this.k.getClass();
                    RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e);
                    this.i.t.remove(this);
                    if (!z) {
                        Socket socket4 = this.t;
                        if (socket4 != null) {
                            _UtilJvmKt.c(socket4);
                        }
                        _UtilJvmKt.c(socket);
                    }
                    return connectResult2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.i.t.remove(this);
                    if (!z) {
                        Socket socket5 = this.t;
                        if (socket5 != null) {
                            _UtilJvmKt.c(socket5);
                        }
                        _UtilJvmKt.c(socket);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Route getK() {
        return this.k;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f(RealCall realCall, IOException iOException) {
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        Socket socket;
        Socket socket2;
        if (this.s != null) {
            jf4.n("TCP already connected");
            return null;
        }
        this.i.t.add(this);
        boolean z = false;
        try {
            try {
                EventListener eventListener = this.i.eventListener;
                RealCall realCall = this.i;
                Route route = this.k;
                eventListener.i(realCall, route.c, route.b);
                this.k.getClass();
                h();
                z = true;
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                this.i.t.remove(this);
                return connectResult;
            } catch (IOException e) {
                Route route2 = this.k;
                if (route2.f46114a.g == null && route2.b.type() != Proxy.Type.DIRECT) {
                    Address address = this.k.f46114a;
                    address.h.connectFailed(address.i.i(), this.k.b.address(), e);
                }
                EventListener eventListener2 = this.i.eventListener;
                RealCall realCall2 = this.i;
                Route route3 = this.k;
                eventListener2.h(realCall2, route3.c, route3.b, e);
                this.k.getClass();
                RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e, 2);
                this.i.t.remove(this);
                if (!z && (socket = this.s) != null) {
                    _UtilJvmKt.c(socket);
                }
                return connectResult2;
            }
        } catch (Throwable th) {
            this.i.t.remove(this);
            if (!z && (socket2 = this.s) != null) {
                _UtilJvmKt.c(socket2);
            }
            throw th;
        }
    }

    public final void h() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.k.b.type();
        int i = type == null ? -1 : WhenMappings.f46138a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.k.f46114a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.k.b);
        }
        this.s = socketCreateSocket;
        if (this.r) {
            ohq.l("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            Platform platform = Platform.f46208a;
            Platform.f46208a.f(socketCreateSocket, this.k.c, this.e);
            try {
                this.w = new BufferedSocketKt$asBufferedSocket$1(new pmi(socketCreateSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.d(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Protocol protocolA;
        Address address = this.k.f46114a;
        try {
            if (connectionSpec.b) {
                Platform platform = Platform.f46208a;
                Platform.f46208a.e(sSLSocket, address.i.d, address.j, this.k.d);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            Handshake handshakeA = Handshake.Companion.a(session);
            HostnameVerifier hostnameVerifier = address.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(address.i.d, session)) {
                List listA = handshakeA.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.i.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(address.i.d);
                sb.append(" not verified:\n            |    certificate: ");
                CertificatePinner certificatePinner = CertificatePinner.c;
                qg9 qg9Var = qg9.d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                encoded.getClass();
                sb.append("sha256/".concat(gl5.m(encoded).d("SHA-256").a()));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(CollectionsKt.q0(OkHostnameVerifier.a(x509Certificate, 7), OkHostnameVerifier.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(ntm0.d(sb.toString()));
            }
            Set set = CertificateBlocklist.f46221a;
            List<Certificate> listA2 = handshakeA.a();
            if (listA2 == null || !listA2.isEmpty()) {
                for (Certificate certificate : listA2) {
                    CertificatePinner certificatePinner2 = CertificatePinner.c;
                    certificate.getClass();
                    qg9 qg9Var2 = qg9.d;
                    byte[] encoded2 = ((X509Certificate) certificate).getPublicKey().getEncoded();
                    encoded2.getClass();
                    if (CertificateBlocklist.f46221a.contains(gl5.m(encoded2).d("SHA-256"))) {
                        throw new SSLPeerUnverifiedException("Hostname " + address.i.d + " not verified (blocklisted by OkHttp)");
                    }
                }
            }
            CertificatePinner certificatePinner3 = address.e;
            certificatePinner3.getClass();
            this.u = new Handshake(handshakeA.f46097a, handshakeA.b, handshakeA.c, new kk0(certificatePinner3, handshakeA, address, (byte) 19));
            address.i.d.getClass();
            Set set2 = certificatePinner3.f46079a;
            iun iunVar = iun.f15405a;
            Iterator it = set2.iterator();
            String strH = null;
            if (it.hasNext()) {
                ((CertificatePinner.Pin) it.next()).getClass();
                c.x(null, "**.", false);
                throw null;
            }
            iunVar.getClass();
            if (connectionSpec.b) {
                Platform platform2 = Platform.f46208a;
                strH = Platform.f46208a.h(sSLSocket);
            }
            this.t = sSLSocket;
            this.w = new BufferedSocketKt$asBufferedSocket$1(new pmi(sSLSocket));
            if (strH != null) {
                Protocol.b.getClass();
                protocolA = Protocol.Companion.a(strH);
            } else {
                protocolA = Protocol.HTTP_1_1;
            }
            this.v = protocolA;
            Platform platform3 = Platform.f46208a;
            Platform.f46208a.getClass();
        } catch (Throwable th) {
            Platform platform4 = Platform.f46208a;
            Platform.f46208a.getClass();
            _UtilJvmKt.c(sSLSocket);
            throw th;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean isReady() {
        return this.v != null;
    }

    public final RoutePlanner.ConnectResult j() throws IOException {
        Request request;
        Request request2 = this.n;
        request2.getClass();
        Route route = this.k;
        String str = "CONNECT " + _UtilJvmKt.i(route.f46114a.i, true) + " HTTP/1.1";
        while (true) {
            BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = this.w;
            if (bufferedSocketKt$asBufferedSocket$1 == null) {
                Intrinsics.h("socket");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocketKt$asBufferedSocket$1);
            BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$2 = this.w;
            if (bufferedSocketKt$asBufferedSocket$2 == null) {
                Intrinsics.h("socket");
                throw null;
            }
            fmq0 fmq0VarH = bufferedSocketKt$asBufferedSocket$2.b.f44063a.h();
            long j = this.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fmq0VarH.g(j, timeUnit);
            BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$3 = this.w;
            if (bufferedSocketKt$asBufferedSocket$3 == null) {
                Intrinsics.h("socket");
                throw null;
            }
            bufferedSocketKt$asBufferedSocket$3.c.f42292a.h().g(this.d, timeUnit);
            http1ExchangeCodec.m(request2.c, str);
            http1ExchangeCodec.a();
            Response.Builder builderG = http1ExchangeCodec.g(false);
            builderG.getClass();
            builderG.f46112a = request2;
            Response responseA = builderG.a();
            int i = responseA.d;
            http1ExchangeCodec.l(responseA);
            if (i == 200) {
                request = null;
                break;
            }
            if (i != 407) {
                ohq.l(twn.m(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            Request requestD = route.f46114a.f.d(route, responseA);
            if (requestD == null) {
                ohq.l("Failed to authenticate with proxy");
                return null;
            }
            String strB = responseA.f.b("Connection");
            if (strB == null) {
                strB = null;
            }
            if ("close".equalsIgnoreCase(strB)) {
                request = requestD;
                break;
            }
            request2 = requestD;
        }
        if (request == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6);
        }
        Socket socket = this.s;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
        int i2 = this.m + 1;
        if (i2 < 21) {
            EventListener eventListener = this.i.eventListener;
            RealCall realCall = this.i;
            Route route2 = this.k;
            eventListener.g(realCall, route2.c, route2.b, null);
            return new RoutePlanner.ConnectResult(this, k(this, null, i2, request, 0, false, null, 57), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        EventListener eventListener2 = this.i.eventListener;
        RealCall realCall2 = this.i;
        Route route3 = this.k;
        eventListener2.h(realCall2, route3.c, route3.b, protocolException);
        this.k.getClass();
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public final ConnectPlan l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        boolean z;
        int i = this.o;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(i2);
            connectionSpec.getClass();
            if (connectionSpec.f46085a) {
                String[] strArr2 = connectionSpec.d;
                if (strArr2 == null) {
                    strArr = connectionSpec.c;
                    if (strArr != null) {
                    }
                    if (i != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return k(this, null, 0, null, i2, z, null, 39);
                }
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                r950 r950Var = r950.f30062a;
                r950Var.getClass();
                if (_UtilCommonKt.h(strArr2, enabledProtocols, r950Var)) {
                    strArr = connectionSpec.c;
                    if (strArr != null || _UtilCommonKt.h(strArr, sSLSocket.getEnabledCipherSuites(), CipherSuite.c)) {
                        if (i != -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return k(this, null, 0, null, i2, z, null, 39);
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final ConnectPlan m(List list, SSLSocket sSLSocket, SSLException sSLException) throws EchUntrustedException {
        list.getClass();
        if (this.q != null) {
            return null;
        }
        Platform platform = Platform.f46208a;
        EchRetryPlan echRetryPlanG = Platform.f46208a.g(sSLException);
        if (echRetryPlanG != null) {
            HostnameVerifier hostnameVerifier = this.k.f46114a.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(echRetryPlanG.f46168a, sSLSocket.getSession())) {
                throw new EchUntrustedException(axq.n(new StringBuilder("public_name '"), echRetryPlanG.f46168a, "' not verified"), sSLException);
            }
            Route route = this.k;
            return k(this, new Route(route.f46114a, route.b, route.c, echRetryPlanG.b), 0, null, 0, false, echRetryPlanG, 30);
        }
        if (!this.h) {
            return null;
        }
        if (((sSLException instanceof SSLHandshakeException) && (sSLException.getCause() instanceof CertificateException)) || (sSLException instanceof SSLPeerUnverifiedException)) {
            return null;
        }
        return l(list, sSLSocket);
    }

    public final ConnectPlan n(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.o != -1) {
            return this;
        }
        ConnectPlan connectPlanL = l(list, sSLSocket);
        if (connectPlanL != null) {
            return connectPlanL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        vqd.y(sb, ", modes=", list, ", supported protocols=", this.p);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }
}
