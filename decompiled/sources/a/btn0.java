package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class btn0 implements utn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3189a;
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
    public final String q;
    public final String r;
    public final String s;
    public final zsn0 t;
    public final String u;
    public final fzc v;
    public final boolean w;

    public btn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, zsn0 zsn0Var, String str19, fzc fzcVar, boolean z) {
        brm0.B(str11, str12, str13);
        this.f3189a = i;
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
        this.q = str16;
        this.r = str17;
        this.s = str18;
        this.t = zsn0Var;
        this.u = str19;
        this.v = fzcVar;
        this.w = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btn0)) {
            return false;
        }
        btn0 btn0Var = (btn0) obj;
        return this.f3189a == btn0Var.f3189a && this.b.equals(btn0Var.b) && this.c.equals(btn0Var.c) && this.d.equals(btn0Var.d) && this.e.equals(btn0Var.e) && this.f.equals(btn0Var.f) && this.g.equals(btn0Var.g) && this.h.equals(btn0Var.h) && this.i.equals(btn0Var.i) && this.j.equals(btn0Var.j) && this.k.equals(btn0Var.k) && Intrinsics.d(this.l, btn0Var.l) && Intrinsics.d(this.m, btn0Var.m) && Intrinsics.d(this.n, btn0Var.n) && this.o.equals(btn0Var.o) && this.p.equals(btn0Var.p) && this.q.equals(btn0Var.q) && this.r.equals(btn0Var.r) && this.s.equals(btn0Var.s) && this.t.equals(btn0Var.t) && this.u.equals(btn0Var.u) && this.v == btn0Var.v && this.w == btn0Var.w;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof btn0) || !(p6t0Var2 instanceof btn0)) {
            return false;
        }
        btn0 btn0Var = (btn0) p6t0Var;
        btn0 btn0Var2 = (btn0) p6t0Var2;
        return btn0Var.f3189a == btn0Var2.f3189a && Intrinsics.d(btn0Var.m, btn0Var2.m) && Intrinsics.d(btn0Var.n, btn0Var2.n) && btn0Var.o.equals(btn0Var2.o);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + ((this.v.hashCode() + ua80.b((this.t.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f3189a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s)) * 31, 31, this.u)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof btn0) || !(p6t0Var2 instanceof btn0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        btn0 btn0Var = (btn0) p6t0Var;
        btn0 btn0Var2 = (btn0) p6t0Var2;
        k9x.G(linkedHashSet, new usn0(btn0Var.p), new usn0(btn0Var2.p));
        k9x.G(linkedHashSet, new xsn0(btn0Var.q), new xsn0(btn0Var2.q));
        k9x.G(linkedHashSet, btn0Var.t, btn0Var2.t);
        k9x.G(linkedHashSet, new wsn0(btn0Var.s), new wsn0(btn0Var2.s));
        k9x.G(linkedHashSet, new ysn0(btn0Var.u), new ysn0(btn0Var2.u));
        k9x.G(linkedHashSet, new vsn0(btn0Var.v), new vsn0(btn0Var2.v));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Coef(value=", this.p, Separators.RPAREN);
        String strL2 = kng0.l("PossibleWin(value=", this.q, Separators.RPAREN);
        String strL3 = kng0.l("InfoText(value=", this.s, Separators.RPAREN);
        String strL4 = kng0.l("Score(value=", this.u, Separators.RPAREN);
        String str = "CoefColor(coefColorType=" + this.v + Separators.RPAREN;
        StringBuilder sbR = vqd.r(this.f3189a, "SwipexCardMultiTeamUiModel(id=", ", champTitle=", this.b, ", sportName=");
        f140.v(sbR, this.c, ", sportIconUrl=", this.d, ", reserveSportIconUrl=");
        f140.v(sbR, this.e, ", firstTeamFirstIcon=", this.f, ", firstTeamSecondIcon=");
        f140.v(sbR, this.g, ", secondTeamFirstIcon=", this.h, ", secondTeamSecondIcon=");
        f140.v(sbR, this.i, ", firstTeamName=", this.j, ", secondTeamName=");
        f140.v(sbR, this.k, ", marketLabel=", this.l, ", market=");
        f140.v(sbR, this.m, ", betResult=", this.n, ", subGameName=");
        f140.v(sbR, this.o, ", coef=", strL, ", possibleWin=");
        f140.v(sbR, strL2, ", backgroundUrl=", this.r, ", infoText=");
        sbR.append(strL3);
        sbR.append(", timer=");
        sbR.append(this.t);
        sbR.append(", score=");
        f140.v(sbR, strL4, ", coefColor=", str, ", isNewRtl=");
        return rw2.p(sbR, this.w, Separators.RPAREN);
    }
}
