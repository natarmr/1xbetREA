package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class stn0 implements utn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32780a;
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
    public final qtn0 q;
    public final String r;
    public final String s;
    public final fzc t;
    public final boolean u;

    public stn0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, qtn0 qtn0Var, String str16, String str17, fzc fzcVar, boolean z) {
        brm0.B(str9, str10, str11);
        this.f32780a = i;
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
        this.q = qtn0Var;
        this.r = str16;
        this.s = str17;
        this.t = fzcVar;
        this.u = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stn0)) {
            return false;
        }
        stn0 stn0Var = (stn0) obj;
        return this.f32780a == stn0Var.f32780a && this.b.equals(stn0Var.b) && this.c.equals(stn0Var.c) && this.d.equals(stn0Var.d) && this.e.equals(stn0Var.e) && this.f.equals(stn0Var.f) && this.g.equals(stn0Var.g) && this.h.equals(stn0Var.h) && this.i.equals(stn0Var.i) && Intrinsics.d(this.j, stn0Var.j) && Intrinsics.d(this.k, stn0Var.k) && Intrinsics.d(this.l, stn0Var.l) && this.m.equals(stn0Var.m) && this.n.equals(stn0Var.n) && this.o.equals(stn0Var.o) && this.p.equals(stn0Var.p) && this.q.equals(stn0Var.q) && this.r.equals(stn0Var.r) && this.s.equals(stn0Var.s) && this.t == stn0Var.t && this.u == stn0Var.u;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof stn0) || !(p6t0Var2 instanceof stn0)) {
            return false;
        }
        stn0 stn0Var = (stn0) p6t0Var;
        stn0 stn0Var2 = (stn0) p6t0Var2;
        return stn0Var.f32780a == stn0Var2.f32780a && Intrinsics.d(stn0Var.k, stn0Var2.k) && Intrinsics.d(stn0Var.l, stn0Var2.l) && stn0Var.m.equals(stn0Var2.m);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + ((this.t.hashCode() + ua80.b(ua80.b((this.q.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f32780a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31, 31, this.r), 31, this.s)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof stn0) || !(p6t0Var2 instanceof stn0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        stn0 stn0Var = (stn0) p6t0Var;
        stn0 stn0Var2 = (stn0) p6t0Var2;
        k9x.G(linkedHashSet, new ltn0(stn0Var.n), new ltn0(stn0Var2.n));
        k9x.G(linkedHashSet, new otn0(stn0Var.o), new otn0(stn0Var2.o));
        k9x.G(linkedHashSet, stn0Var.q, stn0Var2.q);
        k9x.G(linkedHashSet, new ntn0(stn0Var.p), new ntn0(stn0Var2.p));
        k9x.G(linkedHashSet, new ptn0(stn0Var.r), new ptn0(stn0Var2.r));
        k9x.G(linkedHashSet, new mtn0(stn0Var.t), new mtn0(stn0Var2.t));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Coef(value=", this.n, Separators.RPAREN);
        String strL2 = kng0.l("PossibleWin(value=", this.o, Separators.RPAREN);
        String strL3 = kng0.l("InfoText(value=", this.p, Separators.RPAREN);
        String strL4 = kng0.l("Score(value=", this.r, Separators.RPAREN);
        String str = "CoefColor(coefColorType=" + this.t + Separators.RPAREN;
        StringBuilder sbR = vqd.r(this.f32780a, "SwipexCardTwoTeamUiModel(id=", ", champTitle=", this.b, ", sportName=");
        f140.v(sbR, this.c, ", sportIconUrl=", this.d, ", reserveSportIconUrl=");
        f140.v(sbR, this.e, ", firstTeamIcon=", this.f, ", secondTeamIcon=");
        f140.v(sbR, this.g, ", firstTeamName=", this.h, ", secondTeamName=");
        f140.v(sbR, this.i, ", marketLabel=", this.j, ", market=");
        f140.v(sbR, this.k, ", betResult=", this.l, ", subGameName=");
        f140.v(sbR, this.m, ", coef=", strL, ", possibleWin=");
        f140.v(sbR, strL2, ", infoText=", strL3, ", timer=");
        sbR.append(this.q);
        sbR.append(", score=");
        sbR.append(strL4);
        sbR.append(", backgroundUrl=");
        f140.v(sbR, this.s, ", coefColor=", str, ", isNewRtl=");
        return rw2.p(sbR, this.u, Separators.RPAREN);
    }
}
