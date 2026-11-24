package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class iyh0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15589a;
    public final ArrayList b;
    public final vxh0 c;
    public final pxh0 d;
    public final pxh0 e;
    public final gyh0 f;
    public final boolean g;

    public iyh0(ArrayList arrayList, ArrayList arrayList2, vxh0 vxh0Var, pxh0 pxh0Var, pxh0 pxh0Var2, gyh0 gyh0Var, boolean z) {
        this.f15589a = arrayList;
        this.b = arrayList2;
        this.c = vxh0Var;
        this.d = pxh0Var;
        this.e = pxh0Var2;
        this.f = gyh0Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyh0)) {
            return false;
        }
        iyh0 iyh0Var = (iyh0) obj;
        return this.f15589a.equals(iyh0Var.f15589a) && this.b.equals(iyh0Var.b) && this.c.equals(iyh0Var.c) && this.d.equals(iyh0Var.d) && this.e.equals(iyh0Var.e) && this.f.equals(iyh0Var.f) && this.g == iyh0Var.g;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof iyh0) && (p6t0Var2 instanceof iyh0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SEKA_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + twn.g(this.b, twn.g(this.f15589a, 94195800, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof iyh0) || !(p6t0Var2 instanceof iyh0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        iyh0 iyh0Var = (iyh0) p6t0Var;
        iyh0 iyh0Var2 = (iyh0) p6t0Var2;
        k9x.G(linkedHashSet, new byh0(iyh0Var.f15589a), new byh0(iyh0Var2.f15589a));
        k9x.G(linkedHashSet, new eyh0(iyh0Var.b), new eyh0(iyh0Var2.b));
        k9x.G(linkedHashSet, new dyh0(iyh0Var.c), new dyh0(iyh0Var2.c));
        k9x.G(linkedHashSet, new cyh0(iyh0Var.d), new cyh0(iyh0Var2.d));
        k9x.G(linkedHashSet, new fyh0(iyh0Var.e), new fyh0(iyh0Var2.e));
        k9x.G(linkedHashSet, iyh0Var.f, iyh0Var2.f);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("FirstPlayerCards(value=", Separators.RPAREN, this.f15589a);
        String strO2 = hne.o("SecondPlayerCards(value=", Separators.RPAREN, this.b);
        String str = "MatchStatusText(value=" + this.c + Separators.RPAREN;
        String str2 = "FirstPlayerCardsSum(value=" + this.d + Separators.RPAREN;
        String str3 = "SecondPlayerCardsSum(value=" + this.e + Separators.RPAREN;
        StringBuilder sbN = b1j.n("SekaUiModel(key=SEKA_KEY, firstPlayerCards=", strO, ", secondPlayerCards=", strO2, ", matchStatusText=");
        f140.v(sbN, str, ", firstPlayerCardSum=", str2, ", secondPlayerCardSum=");
        sbN.append(str3);
        sbN.append(", timer=");
        sbN.append(this.f);
        sbN.append(", supportRtl=");
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
