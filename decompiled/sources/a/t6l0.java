package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t6l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1l0 f33423a;
    public final int b;
    public final String c;
    public final uf5 d;
    public final r1l0 e;
    public final r2l0 f;

    public t6l0(y1l0 y1l0Var, int i, String str, uf5 uf5Var, int i2) {
        uf5 uf5Var2 = (i2 & 32) != 0 ? null : uf5Var;
        this.f33423a = y1l0Var;
        this.b = i;
        this.c = str;
        this.d = uf5Var2;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.e = new r1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), s6t0.b().f33626a.getBackground(), str, null, null, uf5Var2, null, null);
        this.f = new r2l0(i);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.e;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6l0)) {
            return false;
        }
        t6l0 t6l0Var = (t6l0) obj;
        return this.f33423a.equals(t6l0Var.f33423a) && this.b == t6l0Var.b && Intrinsics.d(this.c, t6l0Var.c) && Intrinsics.d(this.d, t6l0Var.d);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f33423a;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f33423a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 29791;
        uf5 uf5Var = this.d;
        return iHashCode + (uf5Var != null ? uf5Var.hashCode() : 0);
    }

    public final String toString() {
        return "ChampionshipCounterWithActionIcon(title=" + this.f33423a + ", actionIconResId=" + this.b + ", iconUrl=" + this.c + ", iconResId=null, iconColor=null, badgeStyle=" + this.d + Separators.RPAREN;
    }
}
