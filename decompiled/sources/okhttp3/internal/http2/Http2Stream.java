package okhttp3.internal.http2;

import a.axq;
import a.bdv;
import a.c99;
import a.emk0;
import a.f99;
import a.fmq0;
import a.h97;
import a.j04;
import a.jf4;
import a.njk0;
import a.ohq;
import a.s5k0;
import android.javax.sip.header.SubscriptionStateHeader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/concurrent/Lockable;", "La/njk0;", "FramingSource", "FramingSink", "Companion", "StreamTimeout", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http2Stream implements Lockable, njk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46193a;
    public final Http2Connection b;
    public final WindowCounter c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final FramingSource h;
    public final FramingSink i;
    public final StreamTimeout j;
    public final StreamTimeout k;
    public ErrorCode l;
    public IOException m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "", "EMIT_BUFFER_SIZE", "J", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "La/s5k0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FramingSink implements s5k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46194a;
        public final f99 b = new f99();
        public boolean c;

        public FramingSink(boolean z) {
            this.f46194a = z;
        }

        @Override // a.s5k0
        public final void F0(f99 f99Var, long j) throws SocketTimeoutException {
            TimeZone timeZone = _UtilJvmKt.f46122a;
            f99 f99Var2 = this.b;
            f99Var2.F0(f99Var, j);
            while (f99Var2.b >= 16384) {
                a(false);
            }
        }

        public final void a(boolean z) throws SocketTimeoutException {
            long jMin;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.k.i();
                while (http2Stream.d >= http2Stream.e && !this.f46194a && !this.c && http2Stream.h() == null) {
                    try {
                        try {
                            http2Stream.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        http2Stream.k.l();
                        throw th;
                    }
                }
                http2Stream.k.l();
                http2Stream.d();
                jMin = Math.min(http2Stream.e - http2Stream.d, this.b.b);
                http2Stream.d += jMin;
                z2 = z && jMin == this.b.b;
            }
            Http2Stream.this.k.i();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.b.l(http2Stream2.f46193a, z2, this.b, jMin);
            } finally {
                Http2Stream.this.k.l();
            }
        }

        @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f46122a;
            synchronized (http2Stream) {
                if (this.c) {
                    return;
                }
                boolean z = http2Stream.h() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.i.f46194a) {
                    if (this.b.b > 0) {
                        while (this.b.b > 0) {
                            a(true);
                        }
                    } else if (z) {
                        http2Stream2.b.l(http2Stream2.f46193a, true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.c = true;
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.b.x.flush();
                Http2Stream.this.c();
            }
        }

        @Override // a.s5k0, java.io.Flushable
        public final void flush() throws SocketTimeoutException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f46122a;
            synchronized (http2Stream) {
                http2Stream.d();
            }
            while (this.b.b > 0) {
                a(false);
                Http2Stream.this.b.x.flush();
            }
        }

        @Override // a.s5k0
        public final fmq0 h() {
            return Http2Stream.this.k;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "La/emk0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FramingSource implements emk0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46195a;
        public boolean b;
        public final f99 c = new f99();
        public final f99 d = new f99();
        public boolean e;

        public FramingSource(long j, boolean z) {
            this.f46195a = j;
            this.b = z;
        }

        @Override // a.emk0
        public final long Y(f99 f99Var, long j) throws Throwable {
            boolean z;
            Throwable streamResetException;
            long j2;
            long jY;
            f99Var.getClass();
            long j3 = 0;
            if (j < 0) {
                c99.s(h97.h(j, "byteCount < 0: "));
                return 0L;
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.b.getClass();
                    FramingSink framingSink = http2Stream.i;
                    z = true;
                    boolean z2 = framingSink.c || framingSink.f46194a;
                    if (z2) {
                        http2Stream.j.i();
                    }
                    try {
                        if (http2Stream.h() == null || this.b) {
                            streamResetException = null;
                        } else {
                            streamResetException = http2Stream.m;
                            if (streamResetException == null) {
                                ErrorCode errorCodeH = http2Stream.h();
                                errorCodeH.getClass();
                                streamResetException = new StreamResetException(errorCodeH);
                            }
                        }
                        if (this.e) {
                            throw new IOException("stream closed");
                        }
                        f99 f99Var2 = this.d;
                        long j4 = f99Var2.b;
                        if (j4 > j3) {
                            jY = f99Var2.Y(f99Var, Math.min(j, j4));
                            WindowCounter.b(http2Stream.c, jY, 0L, 2);
                            long jA = http2Stream.c.a();
                            if (streamResetException == null) {
                                j2 = j3;
                                if (jA >= http2Stream.b.r.a() / 2) {
                                    http2Stream.b.q(http2Stream.f46193a, jA);
                                    WindowCounter.b(http2Stream.c, 0L, jA, 1);
                                }
                            } else {
                                j2 = j3;
                            }
                            z = false;
                        } else {
                            j2 = j3;
                            if (this.b || streamResetException != null) {
                                z = false;
                            } else {
                                try {
                                    http2Stream.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            jY = -1;
                        }
                        if (z2) {
                            http2Stream.j.l();
                        }
                    } catch (Throwable th) {
                        if (z2) {
                            http2Stream.j.l();
                        }
                        throw th;
                    }
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.b.q.a(http2Stream2.c);
                if (!z) {
                    if (jY != -1) {
                        return jY;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j3 = j2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.e = true;
                f99 f99Var = this.d;
                j = f99Var.b;
                f99Var.a();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                TimeZone timeZone = _UtilJvmKt.f46122a;
                http2Stream2.b.k(j);
            }
            Http2Stream.this.c();
        }

        @Override // a.emk0
        public final fmq0 h() {
            return Http2Stream.this.j;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "La/j04;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class StreamTimeout extends j04 {
        public StreamTimeout() {
        }

        @Override // a.j04
        public final void k() {
            Http2Stream.this.g(ErrorCode.CANCEL);
            Http2Connection http2Connection = Http2Stream.this.b;
            synchronized (http2Connection) {
                long j = http2Connection.o;
                long j2 = http2Connection.n;
                if (j < j2) {
                    return;
                }
                http2Connection.n = j2 + 1;
                http2Connection.p = System.nanoTime() + 1000000000;
                TaskQueue.c(http2Connection.h, axq.n(new StringBuilder(), http2Connection.c, " ping"), 0L, new bdv(http2Connection, (byte) 26), 6);
            }
        }

        public final void l() throws SocketTimeoutException {
            if (j()) {
                throw new SocketTimeoutException(SubscriptionStateHeader.TIMEOUT);
            }
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        http2Connection.getClass();
        this.f46193a = i;
        this.b = http2Connection;
        this.c = new WindowCounter(i);
        this.e = http2Connection.s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.h = new FramingSource(http2Connection.r.a(), z2);
        this.i = new FramingSink(z);
        this.j = new StreamTimeout();
        this.k = new StreamTimeout();
        if (headers == null) {
            if (i()) {
                return;
            }
            jf4.n("remotely-initiated streams should have headers");
            throw null;
        }
        if (i()) {
            jf4.n("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(headers);
    }

    @Override // a.njk0
    public final s5k0 a() {
        return this.i;
    }

    @Override // a.njk0
    public final emk0 b() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void c() {
        boolean z;
        boolean zJ;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        synchronized (this) {
            try {
                FramingSource framingSource = this.h;
                if (framingSource.b || !framingSource.e) {
                    z = false;
                } else {
                    FramingSink framingSink = this.i;
                    if (framingSink.f46194a || framingSink.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zJ = j();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(ErrorCode.CANCEL, null);
        } else {
            if (zJ) {
                return;
            }
            this.b.d(this.f46193a);
        }
    }

    @Override // a.njk0
    public final void cancel() {
        g(ErrorCode.CANCEL);
    }

    public final void d() throws IOException {
        FramingSink framingSink = this.i;
        if (framingSink.c) {
            ohq.l("stream closed");
            return;
        }
        if (framingSink.f46194a) {
            ohq.l("stream finished");
            return;
        }
        if (h() != null) {
            IOException iOException = this.m;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeH = h();
            errorCodeH.getClass();
            throw new StreamResetException(errorCodeH);
        }
    }

    public final void e(ErrorCode errorCode, IOException iOException) {
        if (f(errorCode, iOException)) {
            this.b.x.n(this.f46193a, errorCode);
        }
    }

    public final boolean f(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.l = errorCode;
            this.m = iOException;
            notifyAll();
            if (this.h.b && this.i.f46194a) {
                return false;
            }
            this.b.d(this.f46193a);
            return true;
        }
    }

    public final void g(ErrorCode errorCode) {
        if (f(errorCode, null)) {
            this.b.n(this.f46193a, errorCode);
        }
    }

    public final ErrorCode h() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.l;
        }
        return errorCode;
    }

    public final boolean i() {
        boolean z = (this.f46193a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                FramingSource framingSource = this.h;
                if (framingSource.b || framingSource.e) {
                    FramingSink framingSink = this.i;
                    if ((framingSink.f46194a || framingSink.c) && this.g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Headers headers, boolean z) {
        boolean zJ;
        headers.getClass();
        TimeZone timeZone = _UtilJvmKt.f46122a;
        synchronized (this) {
            try {
                if (this.g && headers.b(":status") == null && headers.b(":method") == null) {
                    this.h.getClass();
                } else {
                    this.g = true;
                    this.f.add(headers);
                }
                if (z) {
                    this.h.b = true;
                }
                zJ = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zJ) {
            return;
        }
        this.b.d(this.f46193a);
    }
}
