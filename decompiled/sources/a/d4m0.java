package a;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class d4m0 implements bm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9o0 f5463a;
    public boolean b;
    public long c;
    public long d;
    public zx90 e = zx90.d;

    public d4m0(l9o0 l9o0Var) {
        this.f5463a = l9o0Var;
    }

    @Override // a.bm30
    public final void a(zx90 zx90Var) {
        if (this.b) {
            c(e());
        }
        this.e = zx90Var;
    }

    public final void c(long j) {
        this.c = j;
        if (this.b) {
            this.f5463a.getClass();
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // a.bm30
    public final zx90 d() {
        return this.e;
    }

    @Override // a.bm30
    public final long e() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        this.f5463a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        zx90 zx90Var = this.e;
        return (zx90Var.f45148a == 1.0f ? vtt0.M(jElapsedRealtime) : jElapsedRealtime * ((long) zx90Var.c)) + j;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        this.f5463a.getClass();
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }
}
