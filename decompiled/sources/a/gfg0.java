package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class gfg0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11206a;
    public final String b;
    public final String c;
    public final int d;

    public gfg0(int i, long j, String str, String str2) {
        this.f11206a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfg0)) {
            return false;
        }
        gfg0 gfg0Var = (gfg0) obj;
        return this.f11206a == gfg0Var.f11206a && this.b.equals(gfg0Var.b) && this.c.equals(gfg0Var.c) && this.d == gfg0Var.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof gfg0) && (p6t0Var2 instanceof gfg0) && ((gfg0) p6t0Var).f11206a == ((gfg0) p6t0Var2).f11206a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f11206a) * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof gfg0) || !(p6t0Var2 instanceof gfg0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gfg0 gfg0Var = (gfg0) p6t0Var;
        gfg0 gfg0Var2 = (gfg0) p6t0Var2;
        k9x.G(linkedHashSet, new cfg0(gfg0Var.b), new cfg0(gfg0Var2.b));
        k9x.G(linkedHashSet, new dfg0(gfg0Var.c), new dfg0(gfg0Var2.c));
        k9x.G(linkedHashSet, new efg0(gfg0Var.d), new efg0(gfg0Var2.d));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("RoundNumber(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("RoundValue(value=", this.c, Separators.RPAREN);
        String strE = ua80.e(this.d, "SectorColor(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(this.f11206a, "RouletteRoundUiModel(id=", ", roundNumber=", strL);
        f140.v(sbO, ", roundValue=", strL2, ", sectorColor=", strE);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
