package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q7l0 implements s7l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2l0 f28256a;
    public final int b;
    public final String c;
    public final Integer d;
    public final y3d e;
    public final t1l0 f;
    public final z2l0 g;

    public q7l0(b2l0 b2l0Var, int i, String str, Integer num, y3d y3dVar, int i2) {
        String str2 = (i2 & 4) != 0 ? null : str;
        Integer num2 = (i2 & 8) != 0 ? null : num;
        y3d y3dVar2 = (i2 & 16) != 0 ? null : y3dVar;
        this.f28256a = b2l0Var;
        this.b = i;
        this.c = str2;
        this.d = num2;
        this.e = y3dVar2;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.f = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str2, num2, y3dVar2, null, 192);
        this.g = new z2l0(new fpe(new y3d(s6t0.b().f33626a.getSecondary()), false, 2), i, s6t0.b().f33626a.getSecondary());
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.f;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7l0)) {
            return false;
        }
        q7l0 q7l0Var = (q7l0) obj;
        return this.f28256a.equals(q7l0Var.f28256a) && this.b == q7l0Var.b && Intrinsics.d(this.c, q7l0Var.c) && Intrinsics.d(this.d, q7l0Var.d) && Intrinsics.d(this.e, q7l0Var.e);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f28256a;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f28256a.hashCode() * 31, 31);
        int iHashCode = 0;
        String str = this.c;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        y3d y3dVar = this.e;
        if (y3dVar != null) {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return (iHashCode3 + iHashCode) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportCounter(title=");
        sb.append(this.f28256a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        axq.x(this.d, this.c, ", iconResId=", ", iconColor=", sb);
        return hne.p(sb, this.e, ", badgeStyle=null)");
    }
}
