package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class dx20 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6826a;
    public final long b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;

    public dx20(int i, int i2, int i3, long j, String str, String str2, boolean z) {
        this.f6826a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx20)) {
            return false;
        }
        dx20 dx20Var = (dx20) obj;
        return this.f6826a.equals(dx20Var.f6826a) && this.b == dx20Var.b && this.c.equals(dx20Var.c) && this.d == dx20Var.d && this.e == dx20Var.e && this.f == dx20Var.f && this.g == dx20Var.g;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof dx20) && (p6t0Var2 instanceof dx20) && ((dx20) p6t0Var).b == ((dx20) p6t0Var2).b;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, twn.a(this.e, brm0.e(ua80.b(rw2.b(this.f6826a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof dx20) || !(p6t0Var2 instanceof dx20)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        dx20 dx20Var = (dx20) p6t0Var;
        dx20 dx20Var2 = (dx20) p6t0Var2;
        k9x.G(linkedHashSet, new zw20(dx20Var.f6826a), new zw20(dx20Var2.f6826a));
        k9x.G(linkedHashSet, new yw20(dx20Var.c), new yw20(dx20Var2.c));
        k9x.G(linkedHashSet, new bx20(dx20Var.d), new bx20(dx20Var2.d));
        k9x.G(linkedHashSet, new ax20(dx20Var.e), new ax20(dx20Var2.e));
        k9x.G(linkedHashSet, new xw20(dx20Var.g), new xw20(dx20Var2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("GraphName(value=", this.f6826a, Separators.RPAREN);
        String strL2 = kng0.l("CoefText(value=", this.c, Separators.RPAREN);
        String strD = defpackage.c.d("IsActive(value=", Separators.RPAREN, this.d);
        String strE = ua80.e(this.e, "GraphNameColor(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.f, "GraphCoefColor(value=", Separators.RPAREN);
        String strE3 = ua80.e(this.g, "BackgroundColorByPosition(value=", Separators.RPAREN);
        StringBuilder sbO = f140.o(this.b, "MarketStatisticButtonUiModel(graphName=", strL, ", graphId=");
        f140.v(sbO, ", coefText=", strL2, ", isActive=", strD);
        f140.v(sbO, ", graphNameColor=", strE, ", graphCoefColor=", strE2);
        return rw2.o(sbO, ", backgroundColorByPosition=", strE3, Separators.RPAREN);
    }
}
