package okhttp3.internal.connection;

import a.iun;
import a.u99;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/Lockable;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {
    public final TaskRunner b;
    public final Route c;
    public final Socket d;
    public final Socket e;
    public final Handshake f;
    public final Protocol g;
    public final BufferedSocket h;
    public final int i;
    public Http2Connection j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final ArrayList q;
    public long r;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "", "IDLE_CONNECTION_HEALTHY_NS", "J", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool realConnectionPool, Route route, Socket socket, Socket socket2, Handshake handshake, Protocol protocol, BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1, int i) {
        taskRunner.getClass();
        route.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        bufferedSocketKt$asBufferedSocket$1.getClass();
        this.b = taskRunner;
        this.c = route;
        this.d = socket;
        this.e = socket2;
        this.f = handshake;
        this.g = protocol;
        this.h = bufferedSocketKt$asBufferedSocket$1;
        this.i = i;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, Route route, IOException iOException) {
        route.getClass();
        iOException.getClass();
        if (route.b.type() != Proxy.Type.DIRECT) {
            Address address = route.f46114a;
            address.h.connectFailed(address.i.i(), route.b.address(), iOException);
        }
        RouteDatabase routeDatabase = okHttpClient.C;
        synchronized (routeDatabase) {
            routeDatabase.f46150a.add(route);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void a(Http2Connection http2Connection, Settings settings) {
        settings.getClass();
        synchronized (this) {
            this.p = (settings.f46200a & 8) != 0 ? settings.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.e(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c() {
        synchronized (this) {
            this.k = true;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.c(this.d);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Route getC() {
        return this.c;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f(RealCall realCall, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.j != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                d(realCall.f46144a, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        this.k = true;
                        this.m++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.r) {
                    this.k = true;
                    this.m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(Address address, List list) {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        if (this.q.size() < this.p && !this.k) {
            Route route = this.c;
            Address address2 = route.f46114a;
            Address address3 = route.f46114a;
            boolean zA = address2.a(address);
            HttpUrl httpUrl = address.i;
            String str = httpUrl.d;
            if (zA) {
                if (!Intrinsics.d(str, address3.i.d)) {
                    if (this.j != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Route route2 = (Route) it.next();
                            Proxy.Type type = route2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && route.b.type() == type2 && Intrinsics.d(route.c, route2.c)) {
                                if (address.d != OkHostnameVerifier.f46222a) {
                                    break;
                                }
                                TimeZone timeZone2 = _UtilJvmKt.f46122a;
                                HttpUrl httpUrl2 = address3.i;
                                if (httpUrl.e != httpUrl2.e) {
                                    break;
                                }
                                boolean zD = Intrinsics.d(str, httpUrl2.d);
                                Handshake handshake = this.f;
                                if (!zD) {
                                    if (!this.l && handshake != null) {
                                        List listA = handshake.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!OkHostnameVerifier.c((X509Certificate) obj, str)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    CertificatePinner certificatePinner = address.e;
                                    certificatePinner.getClass();
                                    handshake.getClass();
                                    List listA2 = handshake.a();
                                    str.getClass();
                                    listA2.getClass();
                                    Set set = certificatePinner.f46079a;
                                    iun iunVar = iun.f15405a;
                                    Iterator it2 = set.iterator();
                                    if (!it2.hasNext()) {
                                        iunVar.getClass();
                                        return true;
                                    }
                                    ((CertificatePinner.Pin) it2.next()).getClass();
                                    c.x(null, "**.", false);
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h(boolean z) {
        long j;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.j;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f) {
                    return false;
                }
                return http2Connection.o >= http2Connection.n || jNanoTime < http2Connection.p;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        u99 u99VarB = this.h.b();
        socket.getClass();
        u99VarB.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !u99VarB.v0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void i() throws SocketException {
        this.r = System.nanoTime();
        Protocol protocol = this.g;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            Object obj = ConnectionListener.f46139a;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.f46180a;
            }
            Http2Connection.Builder builder = new Http2Connection.Builder(this.b);
            BufferedSocket bufferedSocket = this.h;
            String str = this.c.f46114a.i.d;
            bufferedSocket.getClass();
            str.getClass();
            builder.b = bufferedSocket;
            builder.c = _UtilJvmKt.b + ' ' + str;
            builder.d = this;
            builder.f = this.i;
            builder.g = flowControlListener;
            Http2Connection http2Connection = new Http2Connection(builder);
            this.j = http2Connection;
            Settings settings = Http2Connection.A;
            this.p = (settings.f46200a & 8) != 0 ? settings.b[3] : Integer.MAX_VALUE;
            Http2Writer http2Writer = http2Connection.x;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.d(">> CONNECTION " + Http2.f46185a.f(), new Object[0]));
                    }
                    http2Writer.f46196a.N0(Http2.f46185a);
                    http2Writer.f46196a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Writer http2Writer2 = http2Connection.x;
            Settings settings2 = http2Connection.r;
            http2Writer2.getClass();
            settings2.getClass();
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.d) {
                        throw new IOException("closed");
                    }
                    http2Writer2.d(0, Integer.bitCount(settings2.f46200a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & settings2.f46200a) == 0) {
                            z = false;
                        }
                        if (z) {
                            http2Writer2.f46196a.writeShort(i);
                            http2Writer2.f46196a.writeInt(settings2.b[i]);
                        }
                    }
                    http2Writer2.f46196a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = http2Connection.r.a();
            if (iA != 65535) {
                http2Connection.x.q(0, iA - 65535);
            }
            TaskQueue.c(http2Connection.g.newQueue(), http2Connection.c, 0L, http2Connection.y, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.c;
        sb.append(route.f46114a.i.d);
        sb.append(':');
        sb.append(route.f46114a.i.e);
        sb.append(", proxy=");
        sb.append(route.b);
        sb.append(" hostAddress=");
        sb.append(route.c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f;
        sb.append(handshake != null ? handshake.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
