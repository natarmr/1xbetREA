package okhttp3.logging;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "Factory", "Companion", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggingEventListener extends EventListener {
    public long b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Companion;", "", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Factory implements EventListener.Factory {
    }

    @Override // okhttp3.EventListener
    public final void A(Call call, Response response) {
        G("responseHeadersEnd: " + response);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void B(Call call) {
        G("responseHeadersStart");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void D(Call call, Response response) {
        call.getClass();
        G("satisfactionFailure: " + response);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void E(Call call, Handshake handshake) {
        G("secureConnectEnd: " + handshake);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void F(Call call) {
        G("secureConnectStart");
        throw null;
    }

    public final void G(String str) {
        long jNanoTime = (System.nanoTime() - this.b) / 1000000;
        StringBuilder sb = new StringBuilder("[");
        sb.append(jNanoTime);
        sb.append(" ms] ");
        sb.append(str);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void a(Call call, Response response) {
        call.getClass();
        response.getClass();
        G("cacheConditionalHit: " + response);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void b(Call call, Response response) {
        call.getClass();
        G("cacheHit: " + response);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void c(RealCall realCall) {
        G("callEnd");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void d(RealCall realCall, IOException iOException) {
        iOException.getClass();
        G("callFailed: " + iOException);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void e(RealCall realCall) {
        this.b = System.nanoTime();
        G("callStart: " + realCall.b);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void f(RealCall realCall) {
        G("canceled");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        inetSocketAddress.getClass();
        proxy.getClass();
        G("connectEnd: " + protocol);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        inetSocketAddress.getClass();
        proxy.getClass();
        G("connectFailed: null " + iOException);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        inetSocketAddress.getClass();
        proxy.getClass();
        G("connectStart: " + inetSocketAddress + ' ' + proxy);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void j(Call call, Connection connection) {
        connection.getClass();
        G("connectionAcquired: " + connection);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void k(Call call, Connection connection) {
        connection.getClass();
        G("connectionReleased");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void l(RealCall realCall, Dispatcher dispatcher) {
        int size;
        dispatcher.getClass();
        StringBuilder sb = new StringBuilder("dispatcherQueueEnd: ");
        sb.append(realCall);
        sb.append(" queuedCallsCount=");
        synchronized (dispatcher) {
            size = dispatcher.d.size();
        }
        sb.append(size);
        G(sb.toString());
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void m(RealCall realCall, Dispatcher dispatcher) {
        int size;
        dispatcher.getClass();
        StringBuilder sb = new StringBuilder("dispatcherQueueStart: ");
        sb.append(realCall);
        sb.append(" queuedCallsCount=");
        synchronized (dispatcher) {
            size = dispatcher.d.size();
        }
        sb.append(size);
        G(sb.toString());
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void n(RealCall realCall, String str, ArrayList arrayList) {
        G("dnsEnd: " + arrayList);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void o(RealCall realCall, String str) {
        G("dnsStart: ".concat(str));
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void q(Call call, HttpUrl httpUrl, List list) {
        list.getClass();
        G("proxySelectEnd: " + list);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void r(RealCall realCall, HttpUrl httpUrl) {
        G("proxySelectStart: " + httpUrl);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void s(Call call, long j) {
        G("requestBodyEnd: byteCount=" + j);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void t(Call call) {
        G("requestBodyStart");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void u(Call call, IOException iOException) {
        iOException.getClass();
        G("requestFailed: " + iOException);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void v(Call call, Request request) {
        request.getClass();
        G("requestHeadersEnd");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void w(Call call) {
        G("requestHeadersStart");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void x(Call call, long j) {
        G("responseBodyEnd: byteCount=" + j);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void y(Call call) {
        G("responseBodyStart");
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void z(Call call, IOException iOException) {
        iOException.getClass();
        G("responseFailed: " + iOException);
        throw null;
    }
}
