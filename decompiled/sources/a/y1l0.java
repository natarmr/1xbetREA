package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y1l0 implements f2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41861a;
    public final long b;
    public final String c;

    public y1l0(long j, String str, String str2) {
        str.getClass();
        this.f41861a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // a.f2l0
    public final String a() {
        return this.f41861a;
    }

    @Override // a.f2l0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1l0)) {
            return false;
        }
        y1l0 y1l0Var = (y1l0) obj;
        if (!Intrinsics.d(this.f41861a, y1l0Var.f41861a)) {
            return false;
        }
        long j = y1l0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, y1l0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f41861a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(iHashCode, 31, this.b);
        String str = this.c;
        return (iB + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return axq.n(b1j.n("Dynamic3Lines(titleText=", this.f41861a, ", titleColor=", y3d.i(this.b), ", subtitleText="), this.c, ", subtitleColor=null)");
    }
}
