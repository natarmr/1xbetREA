package okhttp3.internal.connection;

import a.e9d0;
import a.emk0;
import a.f99;
import a.jf4;
import a.njk0;
import a.nwq;
import a.owq;
import a.s5k0;
import a.zae0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Exchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealCall f46140a;
    public final ExchangeFinder b;
    public final ExchangeCodec c;
    public boolean d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "La/nwq;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RequestBodySink extends nwq {
        public final long b;
        public final boolean c;
        public boolean d;
        public long e;
        public boolean f;
        public boolean g;
        public final /* synthetic */ Exchange h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, s5k0 s5k0Var, long j, boolean z) {
            super(s5k0Var);
            s5k0Var.getClass();
            this.h = exchange;
            this.b = j;
            this.c = z;
            this.f = z;
        }

        @Override // a.nwq, a.s5k0
        public final void F0(f99 f99Var, long j) throws IOException {
            if (this.g) {
                jf4.n("closed");
                return;
            }
            long j2 = this.b;
            if (j2 != -1 && this.e + j > j2) {
                throw new ProtocolException("expected " + this.b + " bytes but received " + (this.e + j));
            }
            try {
                if (this.f) {
                    this.f = false;
                    this.h.f46140a.eventListener.t(this.h.f46140a);
                }
                this.f24246a.F0(f99Var, j);
                this.e += j;
            } catch (IOException e) {
                IOException iOExceptionA = a(e);
                iOExceptionA.getClass();
                throw iOExceptionA;
            }
        }

        public final IOException a(IOException iOException) {
            if (this.d) {
                return iOException;
            }
            this.d = true;
            return Exchange.a(this.h, this.e, this.c, iOException, 4);
        }

        @Override // a.nwq, a.s5k0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.g) {
                return;
            }
            this.g = true;
            long j = this.b;
            if (j != -1 && this.e != j) {
                e9d0.j("unexpected end of stream");
                return;
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                IOException iOExceptionA = a(e);
                iOExceptionA.getClass();
                throw iOExceptionA;
            }
        }

        @Override // a.nwq, a.s5k0, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                IOException iOExceptionA = a(e);
                iOExceptionA.getClass();
                throw iOExceptionA;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "La/owq;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ResponseBodySource extends owq {
        public final long b;
        public final boolean c;
        public long d;
        public boolean e;
        public boolean f;
        public boolean g;
        public final /* synthetic */ Exchange h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, emk0 emk0Var, long j, boolean z) {
            super(emk0Var);
            emk0Var.getClass();
            this.h = exchange;
            this.b = j;
            this.c = z;
            this.e = true;
            if (j == 0) {
                a(null);
            }
        }

        @Override // a.owq, a.emk0
        public final long Y(f99 f99Var, long j) throws IOException {
            f99Var.getClass();
            if (this.g) {
                jf4.n("closed");
                return 0L;
            }
            try {
                long jY = this.f25976a.Y(f99Var, j);
                if (this.e) {
                    this.e = false;
                    this.h.f46140a.eventListener.y(this.h.f46140a);
                }
                if (jY == -1) {
                    a(null);
                    return -1L;
                }
                long j2 = this.d + jY;
                long j3 = this.b;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.b + " bytes but received " + j2);
                }
                this.d = j2;
                if (this.h.c.f()) {
                    a(null);
                }
                return jY;
            } catch (IOException e) {
                IOException iOExceptionA = a(e);
                iOExceptionA.getClass();
                throw iOExceptionA;
            }
        }

        public final IOException a(IOException iOException) {
            if (this.f) {
                return iOException;
            }
            this.f = true;
            if (iOException == null && this.e) {
                this.e = false;
                this.h.f46140a.eventListener.y(this.h.f46140a);
            }
            return Exchange.a(this.h, this.d, this.c, iOException, 8);
        }

        @Override // a.owq, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.g) {
                return;
            }
            this.g = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                IOException iOExceptionA = a(e);
                iOExceptionA.getClass();
                throw iOExceptionA;
            }
        }
    }

    public Exchange(RealCall realCall, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        exchangeFinder.getClass();
        this.f46140a = realCall;
        this.b = exchangeFinder;
        this.c = exchangeCodec;
    }

    public static IOException a(Exchange exchange, long j, boolean z, IOException iOException, int i) {
        boolean z2 = false;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        if (iOException != null) {
            exchange.f(iOException);
        }
        if (z4) {
            EventListener eventListener = exchange.f46140a.eventListener;
            if (iOException != null) {
                eventListener.u(exchange.f46140a, iOException);
            } else {
                eventListener.s(exchange.f46140a, j);
            }
        }
        if (z3) {
            EventListener eventListener2 = exchange.f46140a.eventListener;
            if (iOException != null) {
                eventListener2.z(exchange.f46140a, iOException);
            } else {
                eventListener2.x(exchange.f46140a, j);
            }
        }
        boolean z5 = z3;
        RealCall realCall = exchange.f46140a;
        boolean z6 = z4 && !z;
        boolean z7 = (z5 == 0 || z) ? false : true;
        if (z4 && z) {
            z2 = true;
        }
        return realCall.e(exchange, z6, z7, z5 && z, z2, iOException);
    }

    public final s5k0 b(Request request) {
        request.getClass();
        RequestBody requestBody = request.d;
        requestBody.getClass();
        long jA = requestBody.a();
        this.f46140a.eventListener.t(this.f46140a);
        return new RequestBodySink(this, this.c.d(request, jA), jA, false);
    }

    public final RealConnection c() {
        ExchangeCodec.Carrier carrierJ = this.c.getB();
        RealConnection realConnection = carrierJ instanceof RealConnection ? (RealConnection) carrierJ : null;
        if (realConnection != null) {
            return realConnection;
        }
        jf4.n("no connection for CONNECT tunnels");
        return null;
    }

    public final RealResponseBody d(Response response) throws IOException {
        Exchange exchange;
        try {
            String strB = response.f.b("Content-Type");
            if (strB == null) {
                strB = null;
            }
            long jC = this.c.c(response);
            exchange = this;
            try {
                return new RealResponseBody(strB, jC, new zae0(new ResponseBodySource(exchange, this.c.b(response), jC, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                exchange.f46140a.eventListener.z(exchange.f46140a, iOException);
                exchange.f(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            exchange = this;
        }
    }

    public final Response.Builder e(boolean z) throws IOException {
        try {
            Response.Builder builderG = this.c.g(z);
            if (builderG == null) {
                return builderG;
            }
            builderG.n = this;
            return builderG;
        } catch (IOException e) {
            this.f46140a.eventListener.z(this.f46140a, e);
            f(e);
            throw e;
        }
    }

    public final void f(IOException iOException) {
        this.d = true;
        this.c.getB().f(this.f46140a, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.internal.connection.Exchange$upgradeToSocket$1] */
    public final Exchange$upgradeToSocket$1 g() throws SocketException {
        RealCall realCall = this.f46140a;
        if (realCall.k) {
            jf4.n("Check failed.");
            return null;
        }
        realCall.k = true;
        realCall.f.j();
        synchronized (realCall) {
            if (realCall.s == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.o || realCall.p) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.m) {
                throw new IllegalStateException("Check failed.");
            }
            if (!realCall.n) {
                throw new IllegalStateException("Check failed.");
            }
            realCall.n = false;
            realCall.o = true;
            realCall.p = true;
        }
        ExchangeCodec.Carrier carrierJ = this.c.getB();
        carrierJ.getClass();
        RealConnection realConnection = (RealConnection) carrierJ;
        realConnection.e.setSoTimeout(0);
        realConnection.c();
        return new njk0() { // from class: okhttp3.internal.connection.Exchange$upgradeToSocket$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Exchange.RequestBodySink f46141a;
            public final Exchange.ResponseBodySource b;

            {
                ExchangeCodec exchangeCodec = this.c.c;
                this.f46141a = new Exchange.RequestBodySink(this.c, exchangeCodec.i().a(), -1L, true);
                this.b = new Exchange.ResponseBodySource(this.c, exchangeCodec.i().b(), -1L, true);
            }

            @Override // a.njk0
            public final s5k0 a() {
                return this.f46141a;
            }

            @Override // a.njk0
            public final emk0 b() {
                return this.b;
            }

            @Override // a.njk0
            public final void cancel() {
                this.c.c.cancel();
            }
        };
    }

    public final void h(Request request) throws IOException {
        request.getClass();
        try {
            this.f46140a.eventListener.w(this.f46140a);
            this.c.e(request);
            this.f46140a.eventListener.v(this.f46140a, request);
        } catch (IOException e) {
            this.f46140a.eventListener.u(this.f46140a, e);
            f(e);
            throw e;
        }
    }
}
