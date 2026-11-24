package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2l0 f12581a;
    public final String b;
    public final y3d c;
    public final t1l0 d;

    public h7l0(b2l0 b2l0Var, String str, y3d y3dVar) {
        this.f12581a = b2l0Var;
        this.b = str;
        this.c = y3dVar;
        p1l0 p1l0Var = p1l0.SPORT_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.d = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, y3dVar, null, 192);
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
        if (!(obj instanceof h7l0)) {
            return false;
        }
        h7l0 h7l0Var = (h7l0) obj;
        return this.f12581a.equals(h7l0Var.f12581a) && this.b.equals(h7l0Var.b) && Intrinsics.d(this.c, h7l0Var.c);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f12581a;
    }

    public final int hashCode() {
        int iHashCode;
        int iB = ua80.b(this.f12581a.hashCode() * 31, 961, this.b);
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
        StringBuilder sb = new StringBuilder("ResultSport(title=");
        sb.append(this.f12581a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", iconResId=null, iconColor=");
        return hne.p(sb, this.c, ", badgeStyle=null)");
    }
}
