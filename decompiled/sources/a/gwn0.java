package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gwn0 implements utn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12035a;
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
    public final String n;
    public final String o;
    public final String p;
    public final ewn0 q;
    public final String r;
    public final String s;
    public final fzc t;
    public final boolean u;

    public gwn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ewn0 ewn0Var, String str16, String str17, fzc fzcVar, boolean z) {
        brm0.B(str9, str10, str12);
        this.f12035a = i;
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
        this.n = str13;
        this.o = str14;
        this.p = str15;
        this.q = ewn0Var;
        this.r = str16;
        this.s = str17;
        this.t = fzcVar;
        this.u = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwn0)) {
            return false;
        }
        gwn0 gwn0Var = (gwn0) obj;
        return this.f12035a == gwn0Var.f12035a && this.b.equals(gwn0Var.b) && this.c.equals(gwn0Var.c) && this.d.equals(gwn0Var.d) && this.e.equals(gwn0Var.e) && this.f.equals(gwn0Var.f) && this.g.equals(gwn0Var.g) && this.h.equals(gwn0Var.h) && this.i.equals(gwn0Var.i) && Intrinsics.d(this.j, gwn0Var.j) && Intrinsics.d(this.k, gwn0Var.k) && this.l.equals(gwn0Var.l) && Intrinsics.d(this.m, gwn0Var.m) && this.n.equals(gwn0Var.n) && this.o.equals(gwn0Var.o) && this.p.equals(gwn0Var.p) && this.q.equals(gwn0Var.q) && this.r.equals(gwn0Var.r) && this.s.equals(gwn0Var.s) && this.t == gwn0Var.t && this.u == gwn0Var.u;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof gwn0) || !(p6t0Var2 instanceof gwn0)) {
            return false;
        }
        gwn0 gwn0Var = (gwn0) p6t0Var;
        gwn0 gwn0Var2 = (gwn0) p6t0Var2;
        return gwn0Var.f12035a == gwn0Var2.f12035a && Intrinsics.d(gwn0Var.k, gwn0Var2.k) && Intrinsics.d(gwn0Var.m, gwn0Var2.m) && gwn0Var.l.equals(gwn0Var2.l);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + ((this.t.hashCode() + ua80.b(ua80.b((this.q.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f12035a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31, 31, this.r), 31, this.s)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof gwn0) || !(p6t0Var2 instanceof gwn0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        gwn0 gwn0Var = (gwn0) p6t0Var;
        gwn0 gwn0Var2 = (gwn0) p6t0Var2;
        k9x.G(linkedHashSet, new awn0(gwn0Var.n), new awn0(gwn0Var2.n));
        k9x.G(linkedHashSet, new cwn0(gwn0Var.o), new cwn0(gwn0Var2.o));
        k9x.G(linkedHashSet, gwn0Var.q, gwn0Var2.q);
        k9x.G(linkedHashSet, new dwn0(gwn0Var.s), new dwn0(gwn0Var2.s));
        k9x.G(linkedHashSet, new bwn0(gwn0Var.t), new bwn0(gwn0Var2.t));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Coef(value=", this.n, Separators.RPAREN);
        String strL2 = kng0.l("PossibleWin(value=", this.o, Separators.RPAREN);
        String strL3 = kng0.l("InfoText(value=", this.r, Separators.RPAREN);
        String strL4 = kng0.l("Score(value=", this.s, Separators.RPAREN);
        String str = "CoefColor(coefColorType=" + this.t + Separators.RPAREN;
        StringBuilder sbR = vqd.r(this.f12035a, "SwipexMiniCardMultiTeamUiModel(id=", ", champTitle=", this.b, ", sportName=");
        f140.v(sbR, this.c, ", firstTeamFirstIcon=", this.d, ", firstTeamSecondIcon=");
        f140.v(sbR, this.e, ", secondTeamFirstIcon=", this.f, ", secondTeamSecondIcon=");
        f140.v(sbR, this.g, ", firstTeamName=", this.h, ", secondTeamName=");
        f140.v(sbR, this.i, ", marketLabel=", this.j, ", market=");
        f140.v(sbR, this.k, ", subGameName=", this.l, ", betResult=");
        f140.v(sbR, this.m, ", coef=", strL, ", possibleWin=");
        f140.v(sbR, strL2, ", backgroundUrl=", this.p, ", timer=");
        sbR.append(this.q);
        sbR.append(", infoText=");
        sbR.append(strL3);
        sbR.append(", score=");
        f140.v(sbR, strL4, ", coefColor=", str, ", isNewRtl=");
        return rw2.p(sbR, this.u, Separators.RPAREN);
    }
}
