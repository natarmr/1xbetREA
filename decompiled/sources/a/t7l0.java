package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2l0 f33474a;
    public final int b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final Integer f;
    public final u1m g;
    public final t1l0 h;
    public final t2l0 i;

    public t7l0(c2l0 c2l0Var, int i, String str, Integer num, boolean z, Integer num2, u1m u1mVar, int i2) {
        String str2 = (i2 & 4) != 0 ? null : str;
        Integer num3 = (i2 & 8) != 0 ? null : num;
        Integer num4 = (i2 & 128) != 0 ? null : num2;
        u1m u1mVar2 = (i2 & 256) != 0 ? null : u1mVar;
        this.f33474a = c2l0Var;
        this.b = i;
        this.c = str2;
        this.d = num3;
        this.e = z;
        this.f = num4;
        this.g = u1mVar2;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.h = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str2, num3, null, null, num4 != null ? new gpe(s6t0.b().f33626a.getBackgroundContent()) : null, num4);
        this.i = new t2l0(i, new yb(), z, u1mVar2);
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
        if (!(obj instanceof t7l0)) {
            return false;
        }
        t7l0 t7l0Var = (t7l0) obj;
        return this.f33474a.equals(t7l0Var.f33474a) && this.b == t7l0Var.b && Intrinsics.d(this.c, t7l0Var.c) && Intrinsics.d(this.d, t7l0Var.d) && this.e == t7l0Var.e && Intrinsics.d(this.f, t7l0Var.f) && this.g == t7l0Var.g;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f33474a;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f33474a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iE = brm0.e((iHashCode + (num == null ? 0 : num.hashCode())) * 29791, 31, this.e);
        Integer num2 = this.f;
        int iHashCode2 = (iE + (num2 == null ? 0 : num2.hashCode())) * 31;
        u1m u1mVar = this.g;
        return iHashCode2 + (u1mVar != null ? u1mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterWithAccordion(title=");
        sb.append(this.f33474a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        axq.x(this.d, this.c, ", iconResId=", ", iconColor=null, badgeStyle=null, expanded=", sb);
        sb.append(this.e);
        sb.append(", iconCounterValue=");
        sb.append(this.f);
        sb.append(", customBadgeStyle=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
