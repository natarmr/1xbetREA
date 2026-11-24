package a;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class brd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9o0 f3075a;
    public boolean b;

    public brd() {
        this(l9o0.f19665a);
    }

    public final synchronized void a() {
        boolean z = false;
        while (!this.b) {
            try {
                this.f3075a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            this.f3075a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                a();
            } else {
                boolean z = false;
                while (!this.b && jElapsedRealtime < j2) {
                    try {
                        this.f3075a.getClass();
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    this.f3075a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public brd(l9o0 l9o0Var) {
        this.f3075a = l9o0Var;
    }
}
