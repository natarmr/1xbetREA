package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2l0 f5598a;
    public final int b;
    public final int c;
    public final String d;
    public final uf5 e;
    public final t1l0 f;
    public final e3l0 g;

    public d7l0(a2l0 a2l0Var, int i, int i2, String str, uf5 uf5Var, int i3) {
        uf5 uf5Var2 = (i3 & 64) != 0 ? null : uf5Var;
        this.f5598a = a2l0Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = uf5Var2;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.f = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, null, uf5Var2, 192);
        this.g = new e3l0(i, new kpe(), i2, null);
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
        if (!(obj instanceof d7l0)) {
            return false;
        }
        d7l0 d7l0Var = (d7l0) obj;
        return this.f5598a.equals(d7l0Var.f5598a) && this.b == d7l0Var.b && this.c == d7l0Var.c && Intrinsics.d(this.d, d7l0Var.d) && Intrinsics.d(this.e, d7l0Var.e);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f5598a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, this.f5598a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 29791;
        uf5 uf5Var = this.e;
        return iHashCode + (uf5Var != null ? uf5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithActionIcon(title=");
        sb.append(this.f5598a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", actionIconResId=");
        kng0.w(this.c, ", iconUrl=", this.d, ", iconResId=null, iconColor=null, badgeStyle=", sb);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
