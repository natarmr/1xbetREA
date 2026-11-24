package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ptc0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zuc0 f27558a;
    public final gtc0 b;
    public final String c;
    public final int d;
    public final o0x e;
    public final o0x f;
    public final o0x g;

    public ptc0(zuc0 zuc0Var, gtc0 gtc0Var, String str, o0x o0xVar, itc0 itc0Var) {
        int i = gtc0Var.b;
        m0x m0xVarY = j0x.y(false);
        o0x o0xVar2 = itc0Var.f15348a;
        zuc0Var.getClass();
        str.getClass();
        this.f27558a = zuc0Var;
        this.b = gtc0Var;
        this.c = str;
        this.d = i;
        this.e = o0xVar;
        this.f = o0xVar2;
        this.g = m0xVarY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptc0)) {
            return false;
        }
        ptc0 ptc0Var = (ptc0) obj;
        return this.f27558a == ptc0Var.f27558a && this.b == ptc0Var.b && Intrinsics.d(this.c, ptc0Var.c) && this.d == ptc0Var.d && this.e.equals(ptc0Var.e) && Intrinsics.d(this.f, ptc0Var.f) && this.g.equals(ptc0Var.g);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return axq.f(p6t0Var, p6t0Var2).equals(p6t0Var2.getClass());
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        int iD = w6x.d(this.e, twn.a(this.d, ua80.b((this.b.hashCode() + (this.f27558a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
        o0x o0xVar = this.f;
        return this.g.hashCode() + (((o0xVar == null ? 0 : o0xVar.hashCode()) + iD) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof ptc0) || !(p6t0Var2 instanceof ptc0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ptc0 ptc0Var = (ptc0) p6t0Var;
        ptc0 ptc0Var2 = (ptc0) p6t0Var2;
        k9x.G(linkedHashSet, new ktc0(ptc0Var.f27558a), new ktc0(ptc0Var2.f27558a));
        k9x.G(linkedHashSet, new ntc0(ptc0Var.b), new ntc0(ptc0Var2.b));
        k9x.G(linkedHashSet, new ltc0(ptc0Var.c), new ltc0(ptc0Var2.c));
        k9x.G(linkedHashSet, new mtc0(ptc0Var.d), new mtc0(ptc0Var2.d));
        k9x.G(linkedHashSet, new jtc0(ptc0Var.e), new jtc0(ptc0Var2.e));
        k9x.G(linkedHashSet, new itc0(ptc0Var.f), new itc0(ptc0Var2.f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String str = "Style(value=" + this.f27558a + Separators.RPAREN;
        String str2 = "Type(value=" + this.b + Separators.RPAREN;
        String strL = kng0.l("Subtitle(value=", this.c, Separators.RPAREN);
        String strE = ua80.e(this.d, "Title(value=", Separators.RPAREN);
        String str3 = "StartIcon(value=" + this.e + Separators.RPAREN;
        String str4 = "EndIcon(value=" + this.f + Separators.RPAREN;
        StringBuilder sbN = b1j.n("PromoSimpleUiItem(style=", str, ", type=", str2, ", subtitle=");
        f140.v(sbN, strL, ", title=", strE, ", startIcon=");
        f140.v(sbN, str3, ", endIcon=", str4, ", placeholder=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
