package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vte implements r4f, t0m {
    public final String A;
    public final String B;
    public final boolean Y;
    public final long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38002a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final rse f1;
    public final long g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final String r;
    public final j0d s;
    public final boolean t;
    public final hel0 u;
    public final String v;
    public final yse w;
    public final cue x;
    public final String y;
    public final String z;

    public vte(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, j0d j0dVar, boolean z2, hel0 hel0Var, String str9, yse yseVar, cue cueVar, String str10, String str11, String str12, String str13, boolean z3, long j8, rse rseVar) {
        brm0.B(str4, str8, str13);
        this.f38002a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = i;
        this.q = i2;
        this.r = str8;
        this.s = j0dVar;
        this.t = z2;
        this.u = hel0Var;
        this.v = str9;
        this.w = yseVar;
        this.x = cueVar;
        this.y = str10;
        this.z = str11;
        this.A = str12;
        this.B = str13;
        this.Y = z3;
        this.Z = j8;
        this.f1 = rseVar;
    }

    @Override // a.t0m
    public final rse c() {
        return this.f1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vte)) {
            return false;
        }
        vte vteVar = (vte) obj;
        return this.f38002a == vteVar.f38002a && this.b == vteVar.b && this.c == vteVar.c && this.d == vteVar.d && this.e == vteVar.e && this.f == vteVar.f && this.g == vteVar.g && this.h == vteVar.h && this.i.equals(vteVar.i) && this.j.equals(vteVar.j) && this.k.equals(vteVar.k) && Intrinsics.d(this.l, vteVar.l) && this.m.equals(vteVar.m) && this.n.equals(vteVar.n) && this.o.equals(vteVar.o) && this.p == vteVar.p && this.q == vteVar.q && Intrinsics.d(this.r, vteVar.r) && this.s == vteVar.s && this.t == vteVar.t && this.u.equals(vteVar.u) && this.v.equals(vteVar.v) && this.w.equals(vteVar.w) && this.x.equals(vteVar.x) && this.y.equals(vteVar.y) && this.z.equals(vteVar.z) && this.A.equals(vteVar.A) && Intrinsics.d(this.B, vteVar.B) && this.Y == vteVar.Y && this.Z == vteVar.Z && this.f1 == vteVar.f1;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof vte) && (p6t0Var2 instanceof vte)) {
            vte vteVar = (vte) p6t0Var;
            vte vteVar2 = (vte) p6t0Var2;
            if (vteVar.f38002a == vteVar2.f38002a && vteVar.g == vteVar2.g && vteVar.b == vteVar2.b && vteVar.c == vteVar2.c && vteVar.e == vteVar2.e && vteVar.f == vteVar2.f) {
                return true;
            }
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof vte) && (p6t0Var2 instanceof vte)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1.hashCode() + rw2.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b((this.x.hashCode() + ((this.w.hashCode() + ua80.b((this.u.hashCode() + brm0.e((this.s.hashCode() + ua80.b(twn.a(this.q, twn.a(this.p, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f38002a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31), 31, this.r)) * 31, 31, this.t)) * 31, 31, this.v)) * 31)) * 31, 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.Y), 31, this.Z);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof vte) || !(p6t0Var2 instanceof vte)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        vte vteVar = (vte) p6t0Var;
        vte vteVar2 = (vte) p6t0Var2;
        k9x.G(linkedHashSet, new fte(vteVar.r), new fte(vteVar2.r));
        k9x.G(linkedHashSet, new pte(vteVar.i), new pte(vteVar2.i));
        k9x.G(linkedHashSet, new dte(vteVar.j), new dte(vteVar2.j));
        k9x.G(linkedHashSet, new tte(vteVar.k), new tte(vteVar2.k));
        k9x.G(linkedHashSet, new hte(vteVar.l), new hte(vteVar2.l));
        k9x.G(linkedHashSet, new lte(vteVar.n), new lte(vteVar2.n));
        k9x.G(linkedHashSet, new rte(vteVar.o), new rte(vteVar2.o));
        k9x.G(linkedHashSet, new qte(vteVar.p), new qte(vteVar2.p));
        k9x.G(linkedHashSet, new kte(vteVar.q), new kte(vteVar2.q));
        k9x.G(linkedHashSet, new ete(vteVar.s), new ete(vteVar2.s));
        k9x.G(linkedHashSet, new mte(vteVar.t), new mte(vteVar2.t));
        k9x.G(linkedHashSet, new ite(vteVar.h), new ite(vteVar2.h));
        k9x.G(linkedHashSet, new jte(vteVar.m), new jte(vteVar2.m));
        k9x.G(linkedHashSet, new ote(vteVar.w), new ote(vteVar2.w));
        k9x.G(linkedHashSet, new ste(vteVar.x), new ste(vteVar2.x));
        k9x.G(linkedHashSet, new cte(vteVar.y), new cte(vteVar2.y));
        k9x.G(linkedHashSet, new nte(vteVar.z), new nte(vteVar2.z));
        k9x.G(linkedHashSet, new gte(vteVar.A), new gte(vteVar2.A));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strD = defpackage.c.d("Live(value=", Separators.RPAREN, this.h);
        String strL = kng0.l("SubtitleText(value=", this.i, Separators.RPAREN);
        String strL2 = kng0.l("CaptionText(value=", this.j, Separators.RPAREN);
        String strL3 = kng0.l("TitleText(value=", this.k, Separators.RPAREN);
        String strL4 = kng0.l("ErrorText(value=", this.l, Separators.RPAREN);
        String strL5 = kng0.l("MarketHeaderText(value=", this.m, Separators.RPAREN);
        String strL6 = kng0.l("MarketTitleText(value=", this.n, Separators.RPAREN);
        String strL7 = kng0.l("TagText(value=", this.o, Separators.RPAREN);
        String strE = ua80.e(this.p, "TagColor(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.q, "MarketStyle(value=", Separators.RPAREN);
        String strL8 = kng0.l("CoefTextValue(value=", this.r, Separators.RPAREN);
        String str = "CoefDynamic(value=" + this.s + Separators.RPAREN;
        String strD2 = defpackage.c.d("MoveActionVisible(value=", Separators.RPAREN, this.t);
        String str2 = "ScorePayload(value=" + this.w + Separators.RPAREN;
        String str3 = "TeamsPayload(value=" + this.x + Separators.RPAREN;
        String strL9 = kng0.l("AutoSubText(value=", this.y, Separators.RPAREN);
        String strL10 = kng0.l("OptionBetText(value=", this.z, Separators.RPAREN);
        String strL11 = kng0.l("EachWayText(value=", this.A, Separators.RPAREN);
        StringBuilder sbQ = kng0.q(this.f38002a, "CouponCardSimpleUiModel(eventId=", ", eventType=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", eventMainGameId=", this.c, ", eventGameId=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", eventSportId=", this.e, ", subSportId=");
        sbQ.append(this.f);
        kng0.A(sbQ, ", gameId=", this.g, ", live=");
        f140.v(sbQ, strD, ", subtitleText=", strL, ", captionText=");
        f140.v(sbQ, strL2, ", titleText=", strL3, ", errorText=");
        f140.v(sbQ, strL4, ", marketHeaderText=", strL5, ", marketTitleText=");
        f140.v(sbQ, strL6, ", tagText=", strL7, ", tagColor=");
        f140.v(sbQ, strE, ", marketStyle=", strE2, ", coefTextValue=");
        f140.v(sbQ, strL8, ", coefDynamic=", str, ", moveActionVisible=");
        sbQ.append(strD2);
        sbQ.append(", sportIcon=");
        sbQ.append(this.u);
        sbQ.append(", couponCardStyle=");
        f140.v(sbQ, this.v, ", score=", str2, ", teams=");
        f140.v(sbQ, str3, ", autoSubText=", strL9, ", optionBetText=");
        f140.v(sbQ, strL10, ", eachWayText=", strL11, ", liveTagText=");
        brm0.C(this.B, ", isRtlSupportEnabled=", ", marketId=", sbQ, this.Y);
        sbQ.append(this.Z);
        sbQ.append(", couponSeparatorStyle=");
        sbQ.append(this.f1);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
