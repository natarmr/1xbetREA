package a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class jq00 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16926a;
    public final kq00 b;
    public final long c;
    public iq00 d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ lhf0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq00(lhf0 lhf0Var, Looper looper, kq00 kq00Var, iq00 iq00Var, int i, long j) {
        super(looper);
        this.j = lhf0Var;
        this.b = kq00Var;
        this.d = iq00Var;
        this.f16926a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.b();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iq00 iq00Var = this.d;
            iq00Var.getClass();
            iq00Var.n(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        iq00 iq00Var = this.d;
        iq00Var.getClass();
        iq00Var.a(this.b, jElapsedRealtime, j, this.f);
        this.e = null;
        lhf0 lhf0Var = this.j;
        gff0 gff0Var = (gff0) lhf0Var.b;
        jq00 jq00Var = (jq00) lhf0Var.c;
        jq00Var.getClass();
        gff0Var.execute(jq00Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.j.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        iq00 iq00Var = this.d;
        iq00Var.getClass();
        if (this.h) {
            iq00Var.n(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                iq00Var.u(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                f1t0.R("LoadTask", "Unexpected exception handling load completed", e);
                this.j.d = new mq00(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        ejx ejxVarW = iq00Var.w(this.b, jElapsedRealtime, j, iOException, i3);
        int i4 = ejxVarW.f7928a;
        if (i4 == 3) {
            this.j.d = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long jMin = ejxVarW.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f - 1) * 1000, 5000);
            }
            lhf0 lhf0Var = this.j;
            x0x.K(((jq00) lhf0Var.c) == null);
            lhf0Var.c = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            f1t0.R("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new mq00(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            f1t0.R("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new mq00(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                f1t0.R("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
