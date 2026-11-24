package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a8l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2l0 f432a;
    public final int b;
    public final String c;
    public final y3d d;
    public final boolean e;
    public final boolean f;
    public final t1l0 g;
    public final u2l0 h;

    public a8l0(d2l0 d2l0Var, int i, String str, y3d y3dVar, boolean z, boolean z2) {
        this.f432a = d2l0Var;
        this.b = i;
        this.c = str;
        this.d = y3dVar;
        this.e = z;
        this.f = z2;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.g = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, y3dVar, null, 192);
        this.h = new u2l0(mpe.f22175a, i, z, z2, null);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.g;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8l0)) {
            return false;
        }
        a8l0 a8l0Var = (a8l0) obj;
        return this.f432a.equals(a8l0Var.f432a) && this.b == a8l0Var.b && this.c.equals(a8l0Var.c) && Intrinsics.d(this.d, a8l0Var.d) && this.e == a8l0Var.e && this.f == a8l0Var.f;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f432a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(twn.a(this.b, this.f432a.hashCode() * 31, 31), 961, this.c);
        y3d y3dVar = this.d;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return brm0.e(brm0.e((iB + iHashCode) * 961, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportCounterWithListCheckbox(title=");
        sb.append(this.f432a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconResId=null, iconColor=");
        sb.append(this.d);
        sb.append(", badgeStyle=null, active=");
        return ohs0.p(", enabled=", ", customBadgeStyle=null)", sb, this.e, this.f);
    }
}
