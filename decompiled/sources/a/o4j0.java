package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class o4j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24639a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public o4j0(boolean z, double d, String str, String str2, String str3, String str4) {
        this.f24639a = z;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4j0)) {
            return false;
        }
        o4j0 o4j0Var = (o4j0) obj;
        return this.f24639a == o4j0Var.f24639a && Double.compare(this.b, o4j0Var.b) == 0 && this.c.equals(o4j0Var.c) && this.d.equals(o4j0Var.d) && this.e.equals(o4j0Var.e) && this.f.equals(o4j0Var.f);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof o4j0) && (p6t0Var2 instanceof o4j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(brm0.d(this.b, Boolean.hashCode(this.f24639a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof o4j0) || !(p6t0Var2 instanceof o4j0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4j0 o4j0Var = (o4j0) p6t0Var;
        o4j0 o4j0Var2 = (o4j0) p6t0Var2;
        k9x.G(linkedHashSet, new k4j0(o4j0Var.f24639a), new k4j0(o4j0Var2.f24639a));
        k9x.G(linkedHashSet, new j4j0(o4j0Var.c), new j4j0(o4j0Var2.c));
        k9x.G(linkedHashSet, new l4j0(o4j0Var.d), new l4j0(o4j0Var2.d));
        k9x.G(linkedHashSet, new m4j0(o4j0Var.e), new m4j0(o4j0Var2.e));
        k9x.G(linkedHashSet, new i4j0(o4j0Var.f), new i4j0(o4j0Var2.f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strD = defpackage.c.d("QuickBetsToggleChangeState(value=", Separators.RPAREN, this.f24639a);
        String strL = kng0.l("FirstValue(value=", this.c, Separators.RPAREN);
        String strL2 = kng0.l("SecondValue(value=", this.d, Separators.RPAREN);
        String strL3 = kng0.l("ThirdValue(value=", this.e, Separators.RPAREN);
        String strL4 = kng0.l("Description(value=", this.f, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("SettingsMakeBetQuickBetsUiModel(quickBetsToggleChangeState=");
        sb.append(strD);
        sb.append(", minValue=");
        sb.append(this.b);
        f140.v(sb, ", firstValue=", strL, ", secondValue=", strL2);
        f140.v(sb, ", thirdValue=", strL3, ", description=", strL4);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
