package a;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bmw0 {
    public static volatile jaw0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final syw0 f2856a;
    public final lfr b;
    public volatile long c;

    public bmw0(syw0 syw0Var) {
        s0x.H(syw0Var);
        this.f2856a = syw0Var;
        this.b = new lfr(this, syw0Var, false, (byte) 23);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            syw0 syw0Var = this.f2856a;
            syw0Var.S().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            syw0Var.r().g.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        jaw0 jaw0Var;
        if (d != null) {
            return d;
        }
        synchronized (bmw0.class) {
            try {
                if (d == null) {
                    d = new jaw0(this.f2856a.K().getMainLooper(), (byte) 1);
                }
                jaw0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jaw0Var;
    }
}
