package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m7l0 implements s7l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2l0 f21325a;
    public final int b;
    public final String c;
    public final uf5 d;
    public final boolean e;
    public final boolean f;
    public final t1l0 g;
    public final a3l0 h;

    public m7l0(a2l0 a2l0Var, int i, String str, uf5 uf5Var, boolean z, boolean z2, int i2) {
        uf5 uf5Var2 = (i2 & 32) != 0 ? null : uf5Var;
        this.f21325a = a2l0Var;
        this.b = i;
        this.c = str;
        this.d = uf5Var2;
        this.e = z;
        this.f = z2;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.g = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, null, uf5Var2, 192);
        this.h = new a3l0(new fpe(null, false, 3), i, z, z2);
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
        if (!(obj instanceof m7l0)) {
            return false;
        }
        m7l0 m7l0Var = (m7l0) obj;
        return this.f21325a.equals(m7l0Var.f21325a) && this.b == m7l0Var.b && Intrinsics.d(this.c, m7l0Var.c) && Intrinsics.d(this.d, m7l0Var.d) && this.e == m7l0Var.e && this.f == m7l0Var.f;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f21325a;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f21325a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 29791;
        uf5 uf5Var = this.d;
        return Boolean.hashCode(this.f) + brm0.e((iHashCode + (uf5Var != null ? uf5Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithListCheckbox(title=");
        sb.append(this.f21325a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconResId=null, iconColor=null, badgeStyle=");
        sb.append(this.d);
        sb.append(", active=");
        return ohs0.p(", enabled=", Separators.RPAREN, sb, this.e, this.f);
    }
}
