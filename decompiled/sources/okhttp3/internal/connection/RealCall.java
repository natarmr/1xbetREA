package okhttp3.internal.connection;

import a.j04;
import a.jf4;
import a.w3d;
import android.javax.sip.header.SubscriptionStateHeader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\f\r\u000eR\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/EventListener;", "e", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "setEventListener$okhttp", "(Lokhttp3/EventListener;)V", "eventListener", "AsyncCall", "CallReference", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealCall implements Call, Cloneable, Lockable {
    public static final /* synthetic */ int u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f46144a;
    public final Request b;
    public final boolean c;
    public final RealConnectionPool d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public volatile EventListener eventListener;
    public final RealCall$timeout$1 f;
    public final AtomicBoolean g;
    public Object h;
    public ExchangeFinder i;
    public RealConnection j;
    public boolean k;
    public Exchange l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public volatile Exchange s;
    public final CopyOnWriteArrayList t;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AsyncCall implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f46145a;
        public volatile AtomicInteger b = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.f46145a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Dispatcher dispatcher;
            String strConcat = "OkHttp ".concat(RealCall.this.b.f46108a.h());
            RealCall realCall = RealCall.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strConcat);
            try {
                realCall.f.i();
                boolean z = false;
                try {
                    try {
                        try {
                            this.f46145a.h(realCall, realCall.d());
                            dispatcher = realCall.f46144a.f46105a;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Platform platform = Platform.f46208a;
                                Platform platform2 = Platform.f46208a;
                                StringBuilder sb = new StringBuilder("Callback failure for ");
                                StringBuilder sb2 = new StringBuilder(realCall.r ? "canceled " : "");
                                sb2.append(realCall.c ? "web socket" : "call");
                                sb2.append(" to ");
                                sb2.append(realCall.b.f46108a.h());
                                sb.append(sb2.toString());
                                platform2.k(4, sb.toString(), e);
                            } else {
                                this.f46145a.b(realCall, e);
                            }
                            dispatcher = realCall.f46144a.f46105a;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.f46145a.b(realCall, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            dispatcher = realCall.f46144a.f46105a;
                        }
                    } catch (Throwable th2) {
                        Dispatcher dispatcher2 = realCall.f46144a.f46105a;
                        dispatcher2.getClass();
                        Dispatcher.c(dispatcher2, null, null, this, 3);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                dispatcher.getClass();
                Dispatcher.c(dispatcher, null, null, this, 3);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f46146a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.f46146a = obj;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealCall$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(RealCall.class, EventListener.class, "e");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [a.fmq0, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        request.getClass();
        this.f46144a = okHttpClient;
        this.b = request;
        this.c = z;
        this.d = okHttpClient.E.f46084a;
        okHttpClient.d.getClass();
        EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f46094a;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        this.eventListener = eventListener$Companion$NONE$1;
        ?? r3 = new j04() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // a.j04
            public final void k() {
                this.n.cancel();
            }
        };
        r3.g(0L, TimeUnit.MILLISECONDS);
        this.f = r3;
        this.g = new AtomicBoolean();
        this.q = true;
        this.t = new CopyOnWriteArrayList();
        new AtomicReference(request.e);
    }

    public final void a(RealConnection realConnection) {
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.f46122a;
        if (this.j != null) {
            jf4.n("Check failed.");
        } else {
            this.j = realConnection;
            realConnection.q.add(new CallReference(this, this.h));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketG;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        RealConnection realConnection = this.j;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketG = g();
            }
            if (this.j == null) {
                if (socketG != null) {
                    _UtilJvmKt.c(socketG);
                }
                this.eventListener.k(this, realConnection);
            } else if (socketG != null) {
                jf4.n("Check failed.");
                return null;
            }
        }
        if (!this.k && j()) {
            interruptedIOException = new InterruptedIOException(SubscriptionStateHeader.TIMEOUT);
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        EventListener eventListener = this.eventListener;
        if (iOException == null) {
            eventListener.c(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        eventListener.d(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void c(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.q) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.s) != null) {
            exchange.c.cancel();
            exchange.f46140a.e(exchange, true, true, true, true, null);
        }
        this.l = null;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        if (this.r) {
            return;
        }
        this.r = true;
        Exchange exchange = this.s;
        if (exchange != null) {
            exchange.c.cancel();
        }
        Iterator it = this.t.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((RoutePlanner.Plan) it.next()).cancel();
        }
        this.eventListener.f(this);
    }

    public final Object clone() {
        return new RealCall(this.f46144a, this.b, this.c);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    public final Response d() {
        ArrayList arrayList = new ArrayList();
        w3d.u(arrayList, this.f46144a.b);
        arrayList.add(new RetryAndFollowUpInterceptor());
        arrayList.add(new BridgeInterceptor());
        arrayList.add(new CacheInterceptor());
        arrayList.add(ConnectInterceptor.f46136a);
        if (!this.c) {
            w3d.u(arrayList, this.f46144a.c);
        }
        arrayList.add(CallServerInterceptor.f46169a);
        Request request = this.b;
        OkHttpClient okHttpClient = this.f46144a;
        request.getClass();
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.w, okHttpClient.x, okHttpClient.y, okHttpClient.g, okHttpClient.u, okHttpClient.E, okHttpClient.j, okHttpClient.k, okHttpClient.t, okHttpClient.l, okHttpClient.n, okHttpClient.m, okHttpClient.e, okHttpClient.o, okHttpClient.p, okHttpClient.q, okHttpClient.v);
        boolean z = false;
        try {
            try {
                Response responseB = realInterceptorChain.b(this.b);
                if (this.r) {
                    _UtilCommonKt.b(responseB);
                    throw new IOException("Canceled");
                }
                f(null);
                return responseB;
            } catch (IOException e) {
                z = true;
                IOException iOExceptionF = f(e);
                iOExceptionF.getClass();
                throw iOExceptionF;
            }
        } catch (Throwable th) {
            if (!z) {
                f(null);
            }
            throw th;
        }
        if (!z) {
            f(null);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004d  */
    public final IOException e(Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        exchange.getClass();
        if (exchange.equals(this.s)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.m) {
                            if (z) {
                                this.m = false;
                            }
                            if (z2) {
                                this.n = false;
                            }
                            if (z4) {
                                this.o = false;
                            }
                            if (z3) {
                                this.p = false;
                            }
                            if (this.m) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.n) || ((z4 && this.o) || (z3 && this.p))) {
                            if (z) {
                                this.m = false;
                            }
                            if (z2) {
                                this.n = false;
                            }
                            if (z4) {
                                this.o = false;
                            }
                            if (z3) {
                                this.p = false;
                            }
                            if (this.m || this.n || this.o || this.p) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.q) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.s = null;
                RealConnection realConnection = this.j;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.n++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException f(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.q) {
                this.q = false;
                if (!this.m && !this.n && !this.o && !this.p) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket g() {
        RealConnection realConnection = this.j;
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.f46122a;
        ArrayList arrayList = realConnection.q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            jf4.n("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.r = System.nanoTime();
        RealConnectionPool realConnectionPool = this.d;
        TaskQueue taskQueue = realConnectionPool.b;
        ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.d;
        TimeZone timeZone2 = _UtilJvmKt.f46122a;
        if (!realConnection.k) {
            taskQueue.d(realConnectionPool.c, 0L);
            return null;
        }
        realConnection.k = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            taskQueue.a();
        }
        return realConnection.e;
    }

    @Override // okhttp3.Call
    public final Response k() {
        if (!this.g.compareAndSet(false, true)) {
            jf4.n("Already Executed");
            return null;
        }
        i();
        Platform platform = Platform.f46208a;
        this.h = Platform.f46208a.i();
        this.eventListener.e(this);
        try {
            Dispatcher dispatcher = this.f46144a.f46105a;
            synchronized (dispatcher) {
                dispatcher.f.add(this);
            }
            Response responseD = d();
            Dispatcher dispatcher2 = this.f46144a.f46105a;
            dispatcher2.getClass();
            Dispatcher.c(dispatcher2, null, this, null, 5);
            return responseD;
        } catch (Throwable th) {
            Dispatcher dispatcher3 = this.f46144a.f46105a;
            dispatcher3.getClass();
            Dispatcher.c(dispatcher3, null, this, null, 5);
            throw th;
        }
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Request getB() {
        return this.b;
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    @Override // okhttp3.Call
    public final void s0(Callback callback) {
        if (!this.g.compareAndSet(false, true)) {
            jf4.n("Already Executed");
            return;
        }
        Platform platform = Platform.f46208a;
        this.h = Platform.f46208a.i();
        this.eventListener.e(this);
        Dispatcher dispatcher = this.f46144a.f46105a;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        Dispatcher.c(dispatcher, asyncCall, null, null, 6);
    }
}
