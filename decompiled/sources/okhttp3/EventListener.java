package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/EventListener;", "", "Factory", "Companion", "AggregateEventListener", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f46094a = new EventListener$Companion$NONE$1();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/EventListener$AggregateEventListener;", "Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AggregateEventListener extends EventListener {
        @Override // okhttp3.EventListener
        public final void A(Call call, Response response) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void B(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void C(Call call, IOException iOException) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void D(Call call, Response response) {
            call.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void E(Call call, Handshake handshake) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void F(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void a(Call call, Response response) {
            call.getClass();
            response.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void b(Call call, Response response) {
            call.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void c(RealCall realCall) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void d(RealCall realCall, IOException iOException) {
            iOException.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void e(RealCall realCall) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void f(RealCall realCall) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            inetSocketAddress.getClass();
            proxy.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
            inetSocketAddress.getClass();
            proxy.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            inetSocketAddress.getClass();
            proxy.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void j(Call call, Connection connection) {
            connection.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void k(Call call, Connection connection) {
            connection.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void l(RealCall realCall, Dispatcher dispatcher) {
            dispatcher.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void m(RealCall realCall, Dispatcher dispatcher) {
            dispatcher.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void n(RealCall realCall, String str, ArrayList arrayList) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void o(RealCall realCall, String str) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void p(Call call, Response response) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void q(Call call, HttpUrl httpUrl, List list) {
            list.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void r(RealCall realCall, HttpUrl httpUrl) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void s(Call call, long j) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void t(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void u(Call call, IOException iOException) {
            iOException.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void v(Call call, Request request) {
            request.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void w(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void x(Call call, long j) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void y(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void z(Call call, IOException iOException) {
            iOException.getClass();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/EventListener$Companion;", "", "Lokhttp3/EventListener;", "NONE", "Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/EventListener$Factory;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
    }

    public void A(Call call, Response response) {
    }

    public void B(Call call) {
    }

    public void D(Call call, Response response) {
        call.getClass();
    }

    public void E(Call call, Handshake handshake) {
    }

    public void F(Call call) {
    }

    public void a(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    public void b(Call call, Response response) {
        call.getClass();
    }

    public void d(RealCall realCall, IOException iOException) {
        iOException.getClass();
    }

    public void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    public void j(Call call, Connection connection) {
        connection.getClass();
    }

    public void k(Call call, Connection connection) {
        connection.getClass();
    }

    public void l(RealCall realCall, Dispatcher dispatcher) {
        dispatcher.getClass();
    }

    public void m(RealCall realCall, Dispatcher dispatcher) {
        dispatcher.getClass();
    }

    public void q(Call call, HttpUrl httpUrl, List list) {
        list.getClass();
    }

    public void s(Call call, long j) {
    }

    public void t(Call call) {
    }

    public void u(Call call, IOException iOException) {
        iOException.getClass();
    }

    public void v(Call call, Request request) {
        request.getClass();
    }

    public void w(Call call) {
    }

    public void x(Call call, long j) {
    }

    public void y(Call call) {
    }

    public void z(Call call, IOException iOException) {
        iOException.getClass();
    }

    public void c(RealCall realCall) {
    }

    public void e(RealCall realCall) {
    }

    public void f(RealCall realCall) {
    }

    public void C(Call call, IOException iOException) {
    }

    public void o(RealCall realCall, String str) {
    }

    public void p(Call call, Response response) {
    }

    public void r(RealCall realCall, HttpUrl httpUrl) {
    }

    public void n(RealCall realCall, String str, ArrayList arrayList) {
    }
}
