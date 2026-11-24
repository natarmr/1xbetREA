package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k7l0 implements s7l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2l0 f17828a;
    public final int b;
    public final String c;
    public final Integer d;
    public final uf5 e;
    public final boolean f;
    public final Integer g;
    public final t1l0 h;
    public final x2l0 i;

    public k7l0(a2l0 a2l0Var, int i, String str, Integer num, uf5 uf5Var, boolean z, Integer num2, int i2) {
        String str2 = (i2 & 4) != 0 ? null : str;
        Integer num3 = (i2 & 8) != 0 ? null : num;
        uf5 uf5Var2 = (i2 & 32) != 0 ? null : uf5Var;
        Integer num4 = (i2 & 128) != 0 ? null : num2;
        this.f17828a = a2l0Var;
        this.b = i;
        this.c = str2;
        this.d = num3;
        this.e = uf5Var2;
        this.f = z;
        this.g = num4;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.h = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str2, num3, null, uf5Var2, num4 != null ? new gpe(s6t0.b().f33626a.getBackgroundContent()) : null, num4);
        this.i = new x2l0(new fpe(null, false, 3), i, new zb(null, null, 7), z);
    }

    @Override // a.b8l0
    public final u1l0 a() {
        return this.h;
    }

    @Override // a.b8l0
    public final g3l0 b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7l0)) {
            return false;
        }
        k7l0 k7l0Var = (k7l0) obj;
        return this.f17828a.equals(k7l0Var.f17828a) && this.b == k7l0Var.b && Intrinsics.d(this.c, k7l0Var.c) && Intrinsics.d(this.d, k7l0Var.d) && Intrinsics.d(this.e, k7l0Var.e) && this.f == k7l0Var.f && Intrinsics.d(this.g, k7l0Var.g);
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f17828a;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f17828a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        uf5 uf5Var = this.e;
        int iE = brm0.e((iHashCode2 + (uf5Var == null ? 0 : uf5Var.hashCode())) * 31, 31, this.f);
        Integer num2 = this.g;
        return iE + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithAccordion(title=");
        sb.append(this.f17828a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        axq.x(this.d, this.c, ", iconResId=", ", iconColor=null, badgeStyle=", sb);
        sb.append(this.e);
        sb.append(", expanded=");
        sb.append(this.f);
        sb.append(", iconCounterValue=");
        return dw9.q(sb, this.g, Separators.RPAREN);
    }
}
