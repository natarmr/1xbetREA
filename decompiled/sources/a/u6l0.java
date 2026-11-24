package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u6l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1l0 f35141a;
    public final String b;
    public final uf5 c;
    public final boolean d;
    public final boolean e;
    public final r1l0 f;
    public final d3l0 g;

    public u6l0(y1l0 y1l0Var, String str, uf5 uf5Var, boolean z, boolean z2, int i) {
        uf5 uf5Var2 = (i & 16) != 0 ? null : uf5Var;
        this.f35141a = y1l0Var;
        this.b = str;
        this.c = uf5Var2;
        this.d = z;
        this.e = z2;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.f = new r1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), s6t0.b().f33626a.getBackground(), str, null, null, uf5Var2, null, null);
        this.g = new d3l0(z, z2);
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
        if (!(obj instanceof u6l0)) {
            return false;
        }
        u6l0 u6l0Var = (u6l0) obj;
        return this.f35141a.equals(u6l0Var.f35141a) && Intrinsics.d(this.b, u6l0Var.b) && Intrinsics.d(this.c, u6l0Var.c) && this.d == u6l0Var.d && this.e == u6l0Var.e;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f35141a;
    }

    public final int hashCode() {
        int iHashCode = this.f35141a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 29791;
        uf5 uf5Var = this.c;
        return Boolean.hashCode(this.e) + brm0.e((iHashCode2 + (uf5Var != null ? uf5Var.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithListCheckbox(title=");
        sb.append(this.f35141a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", iconResId=null, iconColor=null, badgeStyle=");
        sb.append(this.c);
        sb.append(", active=");
        sb.append(this.d);
        sb.append(", enabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
