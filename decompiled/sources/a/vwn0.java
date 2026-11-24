package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vwn0 implements utn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38161a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final twn0 n;
    public final String o;
    public final String p;
    public final String q;
    public final fzc r;
    public final boolean s;

    public vwn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, twn0 twn0Var, String str13, String str14, String str15, fzc fzcVar, boolean z) {
        brm0.B(str7, str8, str10);
        this.f38161a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = twn0Var;
        this.o = str13;
        this.p = str14;
        this.q = str15;
        this.r = fzcVar;
        this.s = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwn0)) {
            return false;
        }
        vwn0 vwn0Var = (vwn0) obj;
        return this.f38161a == vwn0Var.f38161a && this.b.equals(vwn0Var.b) && this.c.equals(vwn0Var.c) && this.d.equals(vwn0Var.d) && this.e.equals(vwn0Var.e) && this.f.equals(vwn0Var.f) && this.g.equals(vwn0Var.g) && Intrinsics.d(this.h, vwn0Var.h) && Intrinsics.d(this.i, vwn0Var.i) && this.j.equals(vwn0Var.j) && Intrinsics.d(this.k, vwn0Var.k) && this.l.equals(vwn0Var.l) && this.m.equals(vwn0Var.m) && this.n.equals(vwn0Var.n) && this.o.equals(vwn0Var.o) && this.p.equals(vwn0Var.p) && this.q.equals(vwn0Var.q) && this.r == vwn0Var.r && this.s == vwn0Var.s;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof vwn0) || !(p6t0Var2 instanceof vwn0)) {
            return false;
        }
        vwn0 vwn0Var = (vwn0) p6t0Var;
        vwn0 vwn0Var2 = (vwn0) p6t0Var2;
        return vwn0Var.f38161a == vwn0Var2.f38161a && Intrinsics.d(vwn0Var.i, vwn0Var2.i) && Intrinsics.d(vwn0Var.k, vwn0Var2.k) && vwn0Var.j.equals(vwn0Var2.j);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + ((this.r.hashCode() + ua80.b(ua80.b(ua80.b((this.n.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f38161a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.p), 31, this.q)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof vwn0) || !(p6t0Var2 instanceof vwn0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        vwn0 vwn0Var = (vwn0) p6t0Var;
        vwn0 vwn0Var2 = (vwn0) p6t0Var2;
        k9x.G(linkedHashSet, new pwn0(vwn0Var.l), new pwn0(vwn0Var2.l));
        k9x.G(linkedHashSet, new rwn0(vwn0Var.m), new rwn0(vwn0Var2.m));
        k9x.G(linkedHashSet, vwn0Var.n, vwn0Var2.n);
        k9x.G(linkedHashSet, new swn0(vwn0Var.p), new swn0(vwn0Var2.p));
        k9x.G(linkedHashSet, new qwn0(vwn0Var.r), new qwn0(vwn0Var2.r));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Coef(value=", this.l, Separators.RPAREN);
        String strL2 = kng0.l("PossibleWin(value=", this.m, Separators.RPAREN);
        String strL3 = kng0.l("InfoText(value=", this.o, Separators.RPAREN);
        String strL4 = kng0.l("Score(value=", this.p, Separators.RPAREN);
        String str = "CoefColor(coefColorType=" + this.r + Separators.RPAREN;
        StringBuilder sbR = vqd.r(this.f38161a, "SwipexMiniCardTwoTeamUiModel(id=", ", champTitle=", this.b, ", sportName=");
        f140.v(sbR, this.c, ", firstTeamIcon=", this.d, ", secondTeamIcon=");
        f140.v(sbR, this.e, ", firstTeamName=", this.f, ", secondTeamName=");
        f140.v(sbR, this.g, ", marketLabel=", this.h, ", market=");
        f140.v(sbR, this.i, ", subGameName=", this.j, ", betResult=");
        f140.v(sbR, this.k, ", coef=", strL, ", possibleWin=");
        sbR.append(strL2);
        sbR.append(", timer=");
        sbR.append(this.n);
        sbR.append(", infoText=");
        f140.v(sbR, strL3, ", score=", strL4, ", backgroundUrl=");
        f140.v(sbR, this.q, ", coefColor=", str, ", isNewRtl=");
        return rw2.p(sbR, this.s, Separators.RPAREN);
    }
}
