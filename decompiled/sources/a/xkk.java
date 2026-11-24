package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class xkk implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkk f41031a;
    public final jkk b;
    public final gkk c;
    public final okk d;
    public final vkk e;
    public final boolean f;

    public xkk(jkk jkkVar, jkk jkkVar2, gkk gkkVar, okk okkVar, vkk vkkVar, boolean z) {
        this.f41031a = jkkVar;
        this.b = jkkVar2;
        this.c = gkkVar;
        this.d = okkVar;
        this.e = vkkVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkk)) {
            return false;
        }
        xkk xkkVar = (xkk) obj;
        return this.f41031a.equals(xkkVar.f41031a) && this.b.equals(xkkVar.b) && this.c.equals(xkkVar.c) && this.d.equals(xkkVar.d) && this.e.equals(xkkVar.e) && this.f == xkkVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof xkk) && (p6t0Var2 instanceof xkk);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "DICE_POKER_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.f41031a.hashCode() + 1626623455) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof xkk) || !(p6t0Var2 instanceof xkk)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xkk xkkVar = (xkk) p6t0Var;
        xkk xkkVar2 = (xkk) p6t0Var2;
        k9x.G(linkedHashSet, new rkk(xkkVar.f41031a), new rkk(xkkVar2.f41031a));
        k9x.G(linkedHashSet, new tkk(xkkVar.b), new tkk(xkkVar2.b));
        k9x.G(linkedHashSet, new skk(xkkVar.c), new skk(xkkVar2.c));
        k9x.G(linkedHashSet, new ukk(xkkVar.d), new ukk(xkkVar2.d));
        k9x.G(linkedHashSet, xkkVar.e, xkkVar2.e);
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String str = "FirstPlayerRoll(value=" + this.f41031a + Separators.RPAREN;
        String str2 = "SecondPlayerRoll(value=" + this.b + Separators.RPAREN;
        String str3 = "MatchResult(value=" + this.c + Separators.RPAREN;
        String str4 = "Status(value=" + this.d + Separators.RPAREN;
        StringBuilder sbN = b1j.n("DicePokerUiModel(key=DICE_POKER_KEY, firstPlayerRoll=", str, ", secondPlayerRoll=", str2, ", matchResult=");
        f140.v(sbN, str3, ", status=", str4, ", timer=");
        sbN.append(this.e);
        sbN.append(", supportRtl=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
