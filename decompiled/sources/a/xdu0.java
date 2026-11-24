package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class xdu0 implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40714a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final udu0 k;
    public final String l;

    public xdu0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, udu0 udu0Var, String str11) {
        this.f40714a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = udu0Var;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdu0)) {
            return false;
        }
        xdu0 xdu0Var = (xdu0) obj;
        return this.f40714a.equals(xdu0Var.f40714a) && this.b.equals(xdu0Var.b) && this.c.equals(xdu0Var.c) && this.d.equals(xdu0Var.d) && this.e.equals(xdu0Var.e) && this.f.equals(xdu0Var.f) && this.g.equals(xdu0Var.g) && this.h.equals(xdu0Var.h) && this.i.equals(xdu0Var.i) && this.j.equals(xdu0Var.j) && this.k.equals(xdu0Var.k) && this.l.equals(xdu0Var.l);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof xdu0) && (p6t0Var2 instanceof xdu0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "VICTORY_FORMULA_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(1485654567, 31, this.f40714a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof xdu0) || !(p6t0Var2 instanceof xdu0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xdu0 xdu0Var = (xdu0) p6t0Var;
        xdu0 xdu0Var2 = (xdu0) p6t0Var2;
        k9x.G(linkedHashSet, new kdu0(xdu0Var.f40714a), new kdu0(xdu0Var2.f40714a));
        k9x.G(linkedHashSet, new mdu0(xdu0Var.b), new mdu0(xdu0Var2.b));
        k9x.G(linkedHashSet, new ndu0(xdu0Var.c), new ndu0(xdu0Var2.c));
        k9x.G(linkedHashSet, new pdu0(xdu0Var.d), new pdu0(xdu0Var2.d));
        k9x.G(linkedHashSet, new rdu0(xdu0Var.e), new rdu0(xdu0Var2.e));
        k9x.G(linkedHashSet, new sdu0(xdu0Var.f), new sdu0(xdu0Var2.f));
        k9x.G(linkedHashSet, new ldu0(xdu0Var.g), new ldu0(xdu0Var2.g));
        k9x.G(linkedHashSet, new qdu0(xdu0Var.h), new qdu0(xdu0Var2.h));
        k9x.G(linkedHashSet, new odu0(xdu0Var.i), new odu0(xdu0Var2.i));
        k9x.G(linkedHashSet, new tdu0(xdu0Var.j), new tdu0(xdu0Var2.j));
        k9x.G(linkedHashSet, xdu0Var.k, xdu0Var2.k);
        k9x.G(linkedHashSet, new vdu0(xdu0Var.l), new vdu0(xdu0Var2.l));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("FirstPlayerFirstNumber(value=", this.f40714a, Separators.RPAREN);
        String strL2 = kng0.l("FirstPlayerSecondNumber(value=", this.b, Separators.RPAREN);
        String strL3 = kng0.l("FirstPlayerThirdNumber(value=", this.c, Separators.RPAREN);
        String strL4 = kng0.l("SecondPlayerFirstNumber(value=", this.d, Separators.RPAREN);
        String strL5 = kng0.l("SecondPlayerSecondNumber(value=", this.e, Separators.RPAREN);
        String strL6 = kng0.l("SecondPlayerThirdNumber(value=", this.f, Separators.RPAREN);
        String strL7 = kng0.l("FirstPlayerFormula(value=", this.g, Separators.RPAREN);
        String strL8 = kng0.l("SecondPlayerFormula(value=", this.h, Separators.RPAREN);
        String strL9 = kng0.l("FirstPlayerTotal(value=", this.i, Separators.RPAREN);
        String strL10 = kng0.l("SecondPlayerTotal(value=", this.j, Separators.RPAREN);
        String strL11 = kng0.l("WinnerText(value=", this.l, Separators.RPAREN);
        StringBuilder sbN = b1j.n("VictoryFormulaLiveUiModel(key=VICTORY_FORMULA_KEY, firstPlayerFirstNumber=", strL, ", firstPlayerSecondNumber=", strL2, ", firstPlayerThirdNumber=");
        f140.v(sbN, strL3, ", secondPlayerFirstNumber=", strL4, ", secondPlayerSecondNumber=");
        f140.v(sbN, strL5, ", secondPlayerThirdNumber=", strL6, ", firstPlayerFormula=");
        f140.v(sbN, strL7, ", secondPlayerFormula=", strL8, ", firstPlayerTotal=");
        f140.v(sbN, strL9, ", secondPlayerTotal=", strL10, ", timerValue=");
        sbN.append(this.k);
        sbN.append(", winnerText=");
        sbN.append(strL11);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
