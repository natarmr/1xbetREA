package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class y5x implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42068a;
    public final ArrayList b;
    public final String c;
    public final m5x d;
    public final m5x e;
    public final boolean f;
    public final wnq0 g;

    public y5x(ArrayList arrayList, ArrayList arrayList2, String str, m5x m5xVar, m5x m5xVar2, boolean z, wnq0 wnq0Var) {
        this.f42068a = arrayList;
        this.b = arrayList2;
        this.c = str;
        this.d = m5xVar;
        this.e = m5xVar2;
        this.f = z;
        this.g = wnq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5x)) {
            return false;
        }
        y5x y5xVar = (y5x) obj;
        return this.f42068a.equals(y5xVar.f42068a) && this.b.equals(y5xVar.b) && this.c.equals(y5xVar.c) && this.d.equals(y5xVar.d) && this.e.equals(y5xVar.e) && this.f == y5xVar.f && this.g.equals(y5xVar.g);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof y5x) && (p6t0Var2 instanceof y5x);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "INDIAN_POKER_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.g.hashCode() + brm0.e((this.e.hashCode() + ((this.d.hashCode() + ua80.b(twn.g(this.b, twn.g(this.f42068a, -2079393425, 31), 31), 31, this.c)) * 31)) * 31, 31, this.f)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof y5x) || !(p6t0Var2 instanceof y5x)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y5x y5xVar = (y5x) p6t0Var;
        y5x y5xVar2 = (y5x) p6t0Var2;
        k9x.G(linkedHashSet, new r5x(y5xVar.f42068a), new r5x(y5xVar2.f42068a));
        k9x.G(linkedHashSet, new u5x(y5xVar.b), new u5x(y5xVar2.b));
        k9x.G(linkedHashSet, new t5x(y5xVar.c), new t5x(y5xVar2.c));
        k9x.G(linkedHashSet, new s5x(y5xVar.d), new s5x(y5xVar2.d));
        k9x.G(linkedHashSet, new v5x(y5xVar.e), new v5x(y5xVar2.e));
        k9x.G(linkedHashSet, new w5x(y5xVar.g), new w5x(y5xVar2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("FirstPlayerCards(value=", Separators.RPAREN, this.f42068a);
        String strO2 = hne.o("SecondPlayerCards(value=", Separators.RPAREN, this.b);
        String strL = kng0.l("MatchStatusText(value=", this.c, Separators.RPAREN);
        String str = "FirstPlayerCombination(value=" + this.d + Separators.RPAREN;
        String str2 = "SecondPlayerCombination(value=" + this.e + Separators.RPAREN;
        String str3 = "Timer(value=" + this.g + Separators.RPAREN;
        StringBuilder sbN = b1j.n("IndianPokerUiModel(key=INDIAN_POKER_KEY, firstPlayerCards=", strO, ", secondPlayerCards=", strO2, ", matchStatusText=");
        f140.v(sbN, strL, ", firstPlayerCombination=", str, ", secondPlayerCombination=");
        brm0.C(str2, ", supportRtl=", ", timerUiModel=", sbN, this.f);
        return axq.n(sbN, str3, ", fixedTime=false)");
    }
}
