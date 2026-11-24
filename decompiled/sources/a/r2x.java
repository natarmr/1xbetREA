package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r2x {
    public static int k;
    public static final art l = new art();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29760a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final p4u0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public r2x(String str, float f, float f2, float f3, float f4, p4u0 p4u0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.f29760a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = p4u0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2x)) {
            return false;
        }
        r2x r2xVar = (r2x) obj;
        if (!Intrinsics.d(this.f29760a, r2xVar.f29760a) || !ycl.b(this.b, r2xVar.b) || !ycl.b(this.c, r2xVar.c) || this.d != r2xVar.d || this.e != r2xVar.e || !this.f.equals(r2xVar.f)) {
            return false;
        }
        long j = r2xVar.g;
        int i = y3d.h;
        return h2t0.a(this.g, j) && this.h == r2xVar.h && this.i == r2xVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + defpackage.c.a(defpackage.c.a(defpackage.c.a(defpackage.c.a(this.f29760a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(this.i) + twn.a(this.h, rw2.b(iHashCode, 31, this.g), 31);
    }
}
