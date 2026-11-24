package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y0p extends z0p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41819a;
    public final float b;
    public final float c;
    public final long d;
    public final float e;
    public final zx7 f;
    public final long g;

    public y0p(String str, float f, float f2, long j, float f3, zx7 zx7Var, long j2) {
        str.getClass();
        this.f41819a = str;
        this.b = f;
        this.c = f2;
        this.d = j;
        this.e = f3;
        this.f = zx7Var;
        this.g = j2;
    }

    @Override // a.z0p
    public final long a() {
        return this.g;
    }

    @Override // a.z0p
    public final u12 b() {
        return this.f;
    }

    @Override // a.z0p
    public final boolean c() {
        return false;
    }

    @Override // a.z0p
    public final float d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0p)) {
            return false;
        }
        y0p y0pVar = (y0p) obj;
        if (!Intrinsics.d(this.f41819a, y0pVar.f41819a) || !ycl.b(this.b, y0pVar.b) || !ycl.b(this.c, y0pVar.c)) {
            return false;
        }
        long j = y0pVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && ycl.b(this.e, y0pVar.e) && this.f.equals(y0pVar.f) && h2t0.a(this.g, y0pVar.g);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(defpackage.c.a(this.f41819a.hashCode() * 31, this.b, 31), this.c, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(false) + rw2.b((this.f.hashCode() + defpackage.c.a(rw2.b(iA, 31, this.d), this.e, 31)) * 31, 31, this.g);
    }

    public final String toString() {
        String strC = ycl.c(this.b);
        String strC2 = ycl.c(this.c);
        String strI = y3d.i(this.d);
        String strC3 = ycl.c(this.e);
        String strI2 = y3d.i(this.g);
        StringBuilder sbN = b1j.n("TextCell(text=", this.f41819a, ", startTextPadding=", strC, ", endTextPadding=");
        f140.v(sbN, strC2, ", textColor=", strI, ", width=");
        sbN.append(strC3);
        sbN.append(", contentAlignment=");
        sbN.append(this.f);
        sbN.append(", backgroundColor=");
        return axq.n(sbN, strI2, ", needBorders=false)");
    }
}
