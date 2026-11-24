package okhttp3.internal.http2;

import a.axq;
import a.bh1;
import a.c99;
import a.f99;
import a.u99;
import a.wqv;
import a.x8e;
import a.zt;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$schedule$2;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Builder", "ReaderRunnable", "Listener", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http2Connection implements Closeable, Lockable {
    public static final Settings A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Listener f46186a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final TaskRunner g;
    public final TaskQueue h;
    public final TaskQueue i;
    public final TaskQueue j;
    public final PushObserver k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final FlowControlListener q;
    public final Settings r;
    public Settings s;
    public final WindowCounter t;
    public long u;
    public long v;
    public final BufferedSocket w;
    public final Http2Writer x;
    public final ReaderRunnable y;
    public final LinkedHashSet z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TaskRunner f46187a;
        public BufferedSocket b;
        public String c;
        public Listener d;
        public final PushObserver e;
        public int f;
        public FlowControlListener g;

        public Builder(TaskRunner taskRunner) {
            taskRunner.getClass();
            this.f46187a = taskRunner;
            this.d = Listener.f46188a;
            this.e = PushObserver.f46199a;
            this.g = FlowControlListener.None.f46180a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "", "OKHTTP_CLIENT_WINDOW_SIZE", TokenNames.I, "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f46188a = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "Lokhttp3/internal/http2/Http2Connection$Listener;", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public void a(Http2Connection http2Connection, Settings settings) {
            settings.getClass();
        }

        public abstract void b(Http2Stream http2Stream);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Http2Reader f46189a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.f46189a = http2Reader;
        }

        public final void a(final boolean z, final int i, u99 u99Var, final int i2) throws EOFException {
            boolean z2;
            boolean z3;
            u99Var.getClass();
            final Http2Connection http2Connection = Http2Connection.this;
            Settings settings = Http2Connection.A;
            if (i != 0 && (i & 1) == 0) {
                final f99 f99Var = new f99();
                long j = i2;
                u99Var.h0(j);
                u99Var.Y(f99Var, j);
                TaskQueue.c(http2Connection.i, http2Connection.c + '[' + i + "] onData", 0L, new Function0(i, f99Var, i2, z) { // from class: okhttp3.internal.http2.a
                    public final /* synthetic */ int b;
                    public final /* synthetic */ f99 c;
                    public final /* synthetic */ int d;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Http2Connection http2Connection2 = this.f46201a;
                        int i3 = this.b;
                        f99 f99Var2 = this.c;
                        int i4 = this.d;
                        Settings settings2 = Http2Connection.A;
                        try {
                            ((PushObserver.Companion.PushObserverCancel) http2Connection2.k).getClass();
                            f99Var2.skip(i4);
                            http2Connection2.x.n(i3, ErrorCode.CANCEL);
                            synchronized (http2Connection2) {
                                http2Connection2.z.remove(Integer.valueOf(i3));
                            }
                        } catch (IOException unused) {
                        }
                        return Unit.f46060a;
                    }
                }, 6);
                return;
            }
            Http2Stream http2StreamC = http2Connection.c(i);
            if (http2StreamC == null) {
                Http2Connection.this.n(i, ErrorCode.PROTOCOL_ERROR);
                long j2 = i2;
                Http2Connection.this.k(j2);
                u99Var.skip(j2);
                return;
            }
            TimeZone timeZone = _UtilJvmKt.f46122a;
            Http2Stream.FramingSource framingSource = http2StreamC.h;
            long j3 = i2;
            framingSource.getClass();
            long j4 = j3;
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                if (j4 <= 0) {
                    TimeZone timeZone2 = _UtilJvmKt.f46122a;
                    http2Stream.b.k(j3);
                    Http2Stream http2Stream2 = Http2Stream.this;
                    http2Stream2.b.q.a(http2Stream2.c);
                    break;
                }
                synchronized (http2Stream) {
                    z2 = framingSource.b;
                    z3 = framingSource.d.b + j4 > framingSource.f46195a;
                }
                if (z3) {
                    u99Var.skip(j4);
                    Http2Stream.this.g(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    u99Var.skip(j4);
                    break;
                }
                long jY = u99Var.Y(framingSource.c, j4);
                if (jY == -1) {
                    c99.f();
                    return;
                }
                j4 -= jY;
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    try {
                        if (framingSource.e) {
                            framingSource.c.a();
                        } else {
                            f99 f99Var2 = framingSource.d;
                            boolean z4 = f99Var2.b == 0;
                            f99Var2.P(framingSource.c);
                            if (z4) {
                                http2Stream3.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                http2StreamC.k(Headers.b, true);
            }
        }

        public final void b(int i, List list, boolean z) {
            list.getClass();
            Http2Connection http2Connection = Http2Connection.this;
            Settings settings = Http2Connection.A;
            if (i != 0 && (i & 1) == 0) {
                TaskQueue.c(http2Connection.i, http2Connection.c + '[' + i + "] onHeaders", 0L, new b(http2Connection, i, list, z), 6);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream http2StreamC = http2Connection.c(i);
                if (http2StreamC != null) {
                    http2StreamC.k(_UtilJvmKt.h(list), z);
                    return;
                }
                if (http2Connection.f) {
                    return;
                }
                if (i <= http2Connection.d) {
                    return;
                }
                if (i % 2 == http2Connection.e % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, _UtilJvmKt.h(list));
                http2Connection.d = i;
                http2Connection.b.put(Integer.valueOf(i), http2Stream);
                TaskQueue.c(http2Connection.g.newQueue(), http2Connection.c + '[' + i + "] onStream", 0L, new wqv(http2Connection, http2Stream, (byte) 12), 6);
            }
        }

        public final void c(int i, int i2, boolean z) {
            Http2Connection http2Connection = Http2Connection.this;
            byte b = 1;
            if (!z) {
                TaskQueue.c(http2Connection.h, axq.n(new StringBuilder(), Http2Connection.this.c, " ping"), 0L, new x8e(b, i, i2, Http2Connection.this), 6);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (i == 1) {
                        http2Connection.m++;
                    } else if (i == 2) {
                        http2Connection.o++;
                    } else if (i == 3) {
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void g(int i, List list) {
            list.getClass();
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.z.contains(Integer.valueOf(i))) {
                    http2Connection.n(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.z.add(Integer.valueOf(i));
                TaskQueue.c(http2Connection.i, http2Connection.c + '[' + i + "] onRequest", 0L, new b(http2Connection, i, list), 6);
            }
        }

        public final void h(final int i, final ErrorCode errorCode) {
            final Http2Connection http2Connection = Http2Connection.this;
            Settings settings = Http2Connection.A;
            if (i == 0 || (i & 1) != 0) {
                Http2Stream http2StreamD = http2Connection.d(i);
                if (http2StreamD != null) {
                    synchronized (http2StreamD) {
                        if (http2StreamD.h() == null) {
                            http2StreamD.l = errorCode;
                            http2StreamD.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            TaskQueue.c(http2Connection.i, http2Connection.c + '[' + i + "] onReset", 0L, new Function0(i, errorCode) { // from class: okhttp3.internal.http2.c
                public final /* synthetic */ int b;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Http2Connection http2Connection2 = this.f46203a;
                    int i2 = this.b;
                    ((PushObserver.Companion.PushObserverCancel) http2Connection2.k).getClass();
                    synchronized (http2Connection2) {
                        http2Connection2.z.remove(Integer.valueOf(i2));
                    }
                    return Unit.f46060a;
                }
            }, 6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Throwable th;
            Http2Connection http2Connection = Http2Connection.this;
            Http2Reader http2Reader = this.f46189a;
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            IOException iOException = null;
            try {
                try {
                    try {
                        if (!http2Reader.a(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } while (http2Reader.a(false, this));
                        ErrorCode errorCode2 = ErrorCode.NO_ERROR;
                        try {
                            errorCode = ErrorCode.CANCEL;
                            http2Connection.a(errorCode2, errorCode, null);
                            this = errorCode2;
                        } catch (IOException e) {
                            iOException = e;
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            http2Connection.a(errorCode3, errorCode3, iOException);
                            this = errorCode3;
                        }
                        _UtilCommonKt.b(http2Reader);
                        return Unit.f46060a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e2) {
                    iOException = e2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            this = errorCode;
            http2Connection.a(this, errorCode, iOException);
            _UtilCommonKt.b(http2Reader);
            throw th;
        }
    }

    static {
        Settings settings = new Settings();
        settings.b(4, 65535);
        settings.b(5, 16384);
        A = settings;
    }

    public Http2Connection(Builder builder) {
        this.f46186a = builder.d;
        String str = builder.c;
        if (str == null) {
            Intrinsics.h("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        TaskRunner taskRunner = builder.f46187a;
        this.g = taskRunner;
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        this.h = taskQueueNewQueue;
        this.i = taskRunner.newQueue();
        this.j = taskRunner.newQueue();
        this.k = PushObserver.f46199a;
        this.q = builder.g;
        Settings settings = new Settings();
        settings.b(4, 16777216);
        this.r = settings;
        Settings settings2 = A;
        this.s = settings2;
        this.t = new WindowCounter(0);
        this.v = settings2.a();
        BufferedSocket bufferedSocket = builder.b;
        if (bufferedSocket == null) {
            Intrinsics.h("socket");
            throw null;
        }
        this.w = bufferedSocket;
        this.x = new Http2Writer(bufferedSocket.a());
        this.y = new ReaderRunnable(new Http2Reader(bufferedSocket.b()));
        this.z = new LinkedHashSet();
        int i = builder.f;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            String strConcat = str.concat(" ping");
            zt ztVar = new zt(this, nanos, (byte) 5);
            taskQueueNewQueue.getClass();
            taskQueueNewQueue.d(new TaskQueue$schedule$2(strConcat, ztVar), nanos);
        }
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        try {
            e(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new Http2Stream[0]);
                this.b.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.e(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.x.close();
        } catch (IOException unused3) {
        }
        try {
            this.w.cancel();
        } catch (IOException unused4) {
        }
        this.h.g();
        this.i.g();
        this.j.g();
    }

    public final Http2Stream c(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.b.get(Integer.valueOf(i));
        }
        return http2Stream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final Http2Stream d(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return http2Stream;
    }

    public final void e(ErrorCode errorCode) {
        synchronized (this.x) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.x.e(this.d, errorCode, _UtilCommonKt.f46121a);
            }
        }
    }

    public final void k(long j) {
        synchronized (this) {
            try {
                WindowCounter.b(this.t, j, 0L, 2);
                long jA = this.t.a();
                if (jA >= this.r.a() / 2) {
                    q(0, jA);
                    WindowCounter.b(this.t, 0L, jA, 1);
                }
                this.q.b(this.t);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(int i, boolean z, f99 f99Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.x.c(z, i, f99Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.u;
                            j3 = this.v;
                            if (j2 >= j3) {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.x.c);
                j4 = iMin;
                this.u += j4;
            }
            j -= j4;
            this.x.c(z && j == 0, i, f99Var, iMin);
        }
    }

    public final void n(int i, ErrorCode errorCode) {
        TaskQueue.c(this.h, this.c + '[' + i + "] writeSynReset", 0L, new bh1((Object) this, i, (Object) errorCode, (byte) 4), 6);
    }

    public final void q(final int i, final long j) {
        TaskQueue.c(this.h, this.c + '[' + i + "] windowUpdate", 0L, new Function0() { // from class: a.ltw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Http2Connection http2Connection = this.f20645a;
                int i2 = i;
                long j2 = j;
                Settings settings = Http2Connection.A;
                try {
                    http2Connection.x.q(i2, j2);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e);
                }
                return Unit.f46060a;
            }
        }, 6);
    }
}
