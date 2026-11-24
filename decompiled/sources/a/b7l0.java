package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b7l0 implements b8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2l0 f2116a;
    public final int b;
    public final int c;
    public final String d;
    public final uf5 e;
    public final boolean f;
    public final t1l0 g;
    public final e3l0 h;

    public b7l0(a2l0 a2l0Var, int i, int i2, String str, uf5 uf5Var, boolean z) {
        this.f2116a = a2l0Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = uf5Var;
        this.f = z;
        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
        pz40 pz40Var = s6t0.f31722a;
        this.g = new t1l0(p1l0Var, new y3d(s6t0.b().f33626a.getSecondary()), str, null, null, uf5Var, 192);
        this.h = new e3l0(i, new lpe(z), i2, null);
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
        if (!(obj instanceof b7l0)) {
            return false;
        }
        b7l0 b7l0Var = (b7l0) obj;
        return this.f2116a.equals(b7l0Var.f2116a) && this.b == b7l0Var.b && this.c == b7l0Var.c && Intrinsics.d(this.d, b7l0Var.d) && Intrinsics.d(this.e, b7l0Var.e) && this.f == b7l0Var.f;
    }

    @Override // a.b8l0
    public final f2l0 getTitle() {
        return this.f2116a;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, twn.a(this.b, this.f2116a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 29791;
        uf5 uf5Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (uf5Var != null ? uf5Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipCounterAccordionWithActionIcon(title=");
        sb.append(this.f2116a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", actionIconResId=");
        kng0.w(this.c, ", iconUrl=", this.d, ", iconResId=null, iconColor=null, badgeStyle=", sb);
        sb.append(this.e);
        sb.append(", expanded=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
