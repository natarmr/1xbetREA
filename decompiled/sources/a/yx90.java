package a;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yx90 {
    public static final vn30 u = new vn30(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bmq0 f43410a;
    public final vn30 b;
    public final long c;
    public final long d;
    public final int e;
    public final dlo f;
    public final boolean g;
    public final dcs0 h;
    public final ucs0 i;
    public final List j;
    public final vn30 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final zx90 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public yx90(bmq0 bmq0Var, vn30 vn30Var, long j, long j2, int i, dlo dloVar, boolean z, dcs0 dcs0Var, ucs0 ucs0Var, List list, vn30 vn30Var2, boolean z2, int i2, int i3, zx90 zx90Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.f43410a = bmq0Var;
        this.b = vn30Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = dloVar;
        this.g = z;
        this.h = dcs0Var;
        this.i = ucs0Var;
        this.j = list;
        this.k = vn30Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = zx90Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static yx90 k(ucs0 ucs0Var) {
        zlq0 zlq0Var = bmq0.f2849a;
        dcs0 dcs0Var = dcs0.d;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        zx90 zx90Var = zx90.d;
        vn30 vn30Var = u;
        return new yx90(zlq0Var, vn30Var, -9223372036854775807L, 0L, 1, null, false, dcs0Var, ucs0Var, rcf0Var, vn30Var, false, 1, 0, zx90Var, 0L, 0L, 0L, 0L, false);
    }

    public final yx90 a() {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final yx90 b(boolean z) {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yx90 c(vn30 vn30Var) {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, vn30Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yx90 d(vn30 vn30Var, long j, long j2, long j3, long j4, dcs0 dcs0Var, ucs0 ucs0Var, List list) {
        return new yx90(this.f43410a, vn30Var, j2, j3, this.e, this.f, this.g, dcs0Var, ucs0Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final yx90 e(int i, int i2, boolean z) {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yx90 f(dlo dloVar) {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, dloVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yx90 g(zx90 zx90Var) {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, zx90Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final yx90 h(int i) {
        return new yx90(this.f43410a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final yx90 i(boolean z) {
        return new yx90(this.f43410a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final yx90 j(bmq0 bmq0Var) {
        return new yx90(bmq0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return vtt0.M(vtt0.Y(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.f45148a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
