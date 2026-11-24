package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y6l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1l0 f42104a;
    public final String b;
    public final y3d c;
    public final r1l0 d;

    public y6l0(z1l0 z1l0Var, String str, y3d y3dVar) {
        this.f42104a = z1l0Var;
        this.b = str;
        this.c = y3dVar;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.d = new r1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), s6t0.b().f33626a.getBackground(), str, null, y3dVar, null, null, null);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.d;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6l0)) {
            return false;
        }
        y6l0 y6l0Var = (y6l0) obj;
        return this.f42104a.equals(y6l0Var.f42104a) && this.b.equals(y6l0Var.b) && Intrinsics.d(this.c, y6l0Var.c);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f42104a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(this.f42104a.hashCode() * 31, 961, this.b);
        y3d y3dVar = this.c;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return (iB + iHashCode) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportCounter(title=");
        sb.append(this.f42104a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", iconResId=null, iconColor=");
        return hne.p(sb, this.c, ", badgeStyle=null)");
    }
}
