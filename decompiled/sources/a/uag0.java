package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uag0 implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35327a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public yjj0 o;
    public boolean p;
    public int q;
    public long r;
    public z5z s;
    public w6k t;
    public k6z u;
    public p4 v;
    public a4d w;
    public int x;
    public x1x y;

    public uag0() {
        long j = hfv.f12988a;
        this.h = j;
        this.i = j;
        this.m = 8.0f;
        this.n = ils0.b;
        this.o = jd8.n;
        this.q = 0;
        this.r = 9205357640488583168L;
        this.s = z5z.c;
        this.t = hic.g();
        this.u = k6z.f17794a;
        this.x = 3;
    }

    public final void C(float f) {
        if (this.g == f) {
            return;
        }
        this.f35327a |= 32;
        this.g = f;
    }

    public final void D(yjj0 yjj0Var) {
        if (Intrinsics.d(this.o, yjj0Var)) {
            return;
        }
        this.f35327a |= 8192;
        this.o = yjj0Var;
    }

    public final void F(long j) {
        long j2 = this.i;
        int i = y3d.h;
        if (h2t0.a(j2, j)) {
            return;
        }
        this.f35327a |= 128;
        this.i = j;
    }

    public final void G(long j) {
        if (ils0.a(this.n, j)) {
            return;
        }
        this.f35327a |= 4096;
        this.n = j;
    }

    public final void H(float f) {
        if (this.e == f) {
            return;
        }
        this.f35327a |= 8;
        this.e = f;
    }

    public final void I(float f) {
        if (this.f == f) {
            return;
        }
        this.f35327a |= 16;
        this.f = f;
    }

    public final void a() {
        w(1.0f);
        y(1.0f);
        b(1.0f);
        H(0.0f);
        I(0.0f);
        C(0.0f);
        long j = hfv.f12988a;
        c(j);
        F(j);
        m(0.0f);
        n(0.0f);
        v(0.0f);
        if (this.m != 8.0f) {
            this.f35327a |= 2048;
            this.m = 8.0f;
        }
        G(ils0.b);
        D(jd8.n);
        g(false);
        j(null);
        if (!Intrinsics.d(this.w, null)) {
            this.f35327a |= 262144;
            this.w = null;
        }
        e(3);
        h(0);
        z5z z5zVar = z5z.c;
        if (!Intrinsics.d(this.s, z5zVar)) {
            this.f35327a |= 1048576;
            this.s = z5zVar;
        }
        this.r = 9205357640488583168L;
        this.y = null;
        this.f35327a = 0;
    }

    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.f35327a |= 4;
        this.d = f;
    }

    public final void c(long j) {
        long j2 = this.h;
        int i = y3d.h;
        if (h2t0.a(j2, j)) {
            return;
        }
        this.f35327a |= 64;
        this.h = j;
    }

    public final void e(int i) {
        if (this.x == i) {
            return;
        }
        this.f35327a |= 524288;
        this.x = i;
    }

    public final void g(boolean z) {
        if (this.p != z) {
            this.f35327a |= 16384;
            this.p = z;
        }
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.t.getDensity();
    }

    public final void h(int i) {
        if (this.q == i) {
            return;
        }
        this.f35327a |= 32768;
        this.q = i;
    }

    public final void j(p4 p4Var) {
        if (Intrinsics.d(this.v, p4Var)) {
            return;
        }
        this.f35327a |= 131072;
        this.v = p4Var;
    }

    public final void m(float f) {
        if (this.j == f) {
            return;
        }
        this.f35327a |= 256;
        this.j = f;
    }

    public final void n(float f) {
        if (this.k == f) {
            return;
        }
        this.f35327a |= 512;
        this.k = f;
    }

    public final void v(float f) {
        if (this.l == f) {
            return;
        }
        this.f35327a |= 1024;
        this.l = f;
    }

    @Override // a.w6k
    public final float v0() {
        return this.t.v0();
    }

    public final void w(float f) {
        if (this.b == f) {
            return;
        }
        this.f35327a |= 1;
        this.b = f;
    }

    public final void y(float f) {
        if (this.c == f) {
            return;
        }
        this.f35327a |= 2;
        this.c = f;
    }
}
