package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cjj0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zij0 f4463a;
    public final wij0 b;
    public final ArrayList c;
    public final List d;
    public final xij0 e;
    public final String f;
    public final ajj0 g;

    public cjj0(zij0 zij0Var, wij0 wij0Var, ArrayList arrayList, List list, xij0 xij0Var, String str, ajj0 ajj0Var) {
        this.f4463a = zij0Var;
        this.b = wij0Var;
        this.c = arrayList;
        this.d = list;
        this.e = xij0Var;
        this.f = str;
        this.g = ajj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjj0)) {
            return false;
        }
        cjj0 cjj0Var = (cjj0) obj;
        return this.f4463a.equals(cjj0Var.f4463a) && this.b.equals(cjj0Var.b) && this.c.equals(cjj0Var.c) && this.d.equals(cjj0Var.d) && this.e.equals(cjj0Var.e) && this.f.equals(cjj0Var.f) && this.g.equals(cjj0Var.g);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof cjj0) && (p6t0Var2 instanceof cjj0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SETTOE_MEZZO_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b((this.e.hashCode() + dw9.a(twn.g(this.c, (this.b.hashCode() + ((this.f4463a.hashCode() + rw2.b(-1792541856, 31, 0L)) * 31)) * 31, 31), 31, this.d)) * 31, 31, this.f);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof cjj0) || !(p6t0Var2 instanceof cjj0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cjj0 cjj0Var = (cjj0) p6t0Var;
        cjj0 cjj0Var2 = (cjj0) p6t0Var2;
        k9x.G(linkedHashSet, cjj0Var.f4463a, cjj0Var2.f4463a);
        k9x.G(linkedHashSet, cjj0Var.b, cjj0Var2.b);
        k9x.G(linkedHashSet, new yij0(cjj0Var.c), new yij0(cjj0Var2.c));
        k9x.G(linkedHashSet, new vij0(cjj0Var.d), new vij0(cjj0Var2.d));
        k9x.G(linkedHashSet, cjj0Var.e, cjj0Var2.e);
        k9x.G(linkedHashSet, new uij0(cjj0Var.f), new uij0(cjj0Var2.f));
        k9x.G(linkedHashSet, cjj0Var.g, cjj0Var2.g);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strO = hne.o("PlayerCardList(value=", Separators.RPAREN, this.c);
        String strR = twn.r(this.d, "DealerCardList(value=", Separators.RPAREN);
        String strL = kng0.l("Background(value=", this.f, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("SettoeMezzoUiModel(key=SETTOE_MEZZO_KEY, id=0, playerNameAndScore=");
        sb.append(this.f4463a);
        sb.append(", dealerNameAndScore=");
        sb.append(this.b);
        sb.append(", playerCardList=");
        f140.v(sb, strO, ", dealerCardList=", strR, ", matchDescription=");
        sb.append(this.e);
        sb.append(", background=");
        sb.append(strL);
        sb.append(", timer=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
