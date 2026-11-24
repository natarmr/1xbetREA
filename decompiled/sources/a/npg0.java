package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class npg0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpg0 f23913a;
    public final ArrayList b;
    public final ArrayList c;
    public final uog0 d;
    public final uog0 e;
    public final List f;
    public final String g;

    public npg0(kpg0 kpg0Var, ArrayList arrayList, ArrayList arrayList2, uog0 uog0Var, uog0 uog0Var2, List list, String str) {
        list.getClass();
        this.f23913a = kpg0Var;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = uog0Var;
        this.e = uog0Var2;
        this.f = list;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npg0)) {
            return false;
        }
        npg0 npg0Var = (npg0) obj;
        return this.f23913a.equals(npg0Var.f23913a) && this.b.equals(npg0Var.b) && this.c.equals(npg0Var.c) && this.d.equals(npg0Var.d) && this.e.equals(npg0Var.e) && Intrinsics.d(this.f, npg0Var.f) && this.g.equals(npg0Var.g);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof npg0) && (p6t0Var2 instanceof npg0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "RUSSIAN_LOTTO_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a((this.e.hashCode() + ((this.d.hashCode() + twn.g(this.c, twn.g(this.b, (this.f23913a.hashCode() - 661119776) * 31, 31), 31)) * 31)) * 31, 31, this.f);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof npg0) || !(p6t0Var2 instanceof npg0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        npg0 npg0Var = (npg0) p6t0Var;
        npg0 npg0Var2 = (npg0) p6t0Var2;
        k9x.G(linkedHashSet, npg0Var.f23913a, npg0Var2.f23913a);
        k9x.G(linkedHashSet, new hpg0(npg0Var.b), new hpg0(npg0Var2.b));
        k9x.G(linkedHashSet, new jpg0(npg0Var.c), new jpg0(npg0Var2.c));
        k9x.G(linkedHashSet, new gpg0(npg0Var.d), new gpg0(npg0Var2.d));
        k9x.G(linkedHashSet, new ipg0(npg0Var.e), new ipg0(npg0Var2.e));
        k9x.G(linkedHashSet, new fpg0(npg0Var.f), new fpg0(npg0Var2.f));
        k9x.G(linkedHashSet, new lpg0(npg0Var.g), new lpg0(npg0Var2.g));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("FirstPlayerNumberParams(value=", Separators.RPAREN, this.b);
        String strO2 = hne.o("SecondPlayerNumberParams(value=", Separators.RPAREN, this.c);
        String str = "FirstPlayerCounterfoilParams(value=" + this.d + Separators.RPAREN;
        String str2 = "SecondPlayerCounterfoilParams(value=" + this.e + Separators.RPAREN;
        String strR = twn.r(this.f, "BarrelNums(value=", Separators.RPAREN);
        String strL = kng0.l("WinnerText(value=", this.g, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("RussianLottoUiModel(key=RUSSIAN_LOTTO_KEY, timeBeforeStart=");
        sb.append(this.f23913a);
        sb.append(", firstPlayerNumberParams=");
        sb.append(strO);
        sb.append(", secondPlayerNumberParams=");
        f140.v(sb, strO2, ", firstPlayerCounterfoilParams=", str, ", secondPlayerCounterfoilParams=");
        f140.v(sb, str2, ", barrelNums=", strR, ", winnerText=");
        return axq.n(sb, strL, Separators.RPAREN);
    }
}
