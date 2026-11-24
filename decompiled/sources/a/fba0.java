package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fba0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9249a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public fba0(long j, String str, String str2, String str3, List list) {
        this.f9249a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fba0)) {
            return false;
        }
        fba0 fba0Var = (fba0) obj;
        return this.f9249a == fba0Var.f9249a && this.b.equals(fba0Var.b) && this.c.equals(fba0Var.c) && this.d.equals(fba0Var.d) && this.e.equals(fba0Var.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof fba0) && (p6t0Var2 instanceof fba0) && ((fba0) p6t0Var).f9249a == ((fba0) p6t0Var2).f9249a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f9249a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof fba0) || !(p6t0Var2 instanceof fba0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        fba0 fba0Var = (fba0) p6t0Var;
        fba0 fba0Var2 = (fba0) p6t0Var2;
        k9x.G(linkedHashSet, new dba0(fba0Var.b), new dba0(fba0Var2.b));
        k9x.G(linkedHashSet, new cba0(fba0Var.c), new cba0(fba0Var2.c));
        k9x.G(linkedHashSet, new bba0(fba0Var.d), new bba0(fba0Var2.d));
        k9x.G(linkedHashSet, new eba0(fba0Var.e), new eba0(fba0Var2.e));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("PlayerName(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("HeroName(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("HeroImage(value=", this.d, Separators.RPAREN);
        String strR = twn.r(this.e, "StatisticsCells(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(this.f9249a, "PlayerStatisticUiModel(playerId=", ", playerName=", strL);
        f140.v(sbO, ", heroName=", strL2, ", heroImage=", strL3);
        return rw2.o(sbO, ", statisticsCells=", strR, Separators.RPAREN);
    }
}
