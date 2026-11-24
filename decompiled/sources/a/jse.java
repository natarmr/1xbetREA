package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jse implements r4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17047a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final int n;
    public final String o;
    public final int p;
    public final String q;
    public final String r;
    public final String s;

    public jse(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, int i, String str, int i2, String str2, String str3, int i3, String str4, int i4, String str5, String str6, String str7) {
        str5.getClass();
        this.f17047a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = z;
        this.i = i;
        this.j = str;
        this.k = i2;
        this.l = str2;
        this.m = str3;
        this.n = i3;
        this.o = str4;
        this.p = i4;
        this.q = str5;
        this.r = str6;
        this.s = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jse)) {
            return false;
        }
        jse jseVar = (jse) obj;
        return this.f17047a == jseVar.f17047a && this.b == jseVar.b && this.c == jseVar.c && this.d == jseVar.d && this.e == jseVar.e && this.f == jseVar.f && this.g == jseVar.g && this.h == jseVar.h && this.i == jseVar.i && this.j.equals(jseVar.j) && this.k == jseVar.k && this.l.equals(jseVar.l) && this.m.equals(jseVar.m) && this.n == jseVar.n && this.o.equals(jseVar.o) && this.p == jseVar.p && Intrinsics.d(this.q, jseVar.q) && this.r.equals(jseVar.r) && this.s.equals(jseVar.s);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return p6t0Var2.getClass() == p6t0Var.getClass();
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof jse) && (p6t0Var2 instanceof jse)) {
            return p6t0Var.equals(p6t0Var2);
        }
        return false;
    }

    public final int hashCode() {
        return this.s.hashCode() + ua80.b(ua80.b(twn.a(this.p, ua80.b(twn.a(this.n, ua80.b(ua80.b(twn.a(this.k, ua80.b(twn.a(this.i, brm0.e(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f17047a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31), 31, this.l), 31, this.m), 31), 31, this.o), 31), 31, this.q), 31, this.r);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof jse) || !(p6t0Var2 instanceof jse)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jse jseVar = (jse) p6t0Var;
        jse jseVar2 = (jse) p6t0Var2;
        k9x.G(linkedHashSet, new gse(jseVar.j), new gse(jseVar2.j));
        k9x.G(linkedHashSet, new hse(jseVar.k), new hse(jseVar2.k));
        k9x.G(linkedHashSet, new fse(jseVar.l), new fse(jseVar2.l));
        k9x.G(linkedHashSet, new cse(jseVar.m), new cse(jseVar2.m));
        k9x.G(linkedHashSet, new dse(jseVar.n), new dse(jseVar2.n));
        k9x.G(linkedHashSet, new ese(jseVar.p), new ese(jseVar2.p));
        k9x.G(linkedHashSet, new bse(jseVar.q), new bse(jseVar2.q));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("TitleText(value=", this.j, Separators.RPAREN);
        String strE = ua80.e(this.k, "TitleTextStyle(value=", Separators.RPAREN);
        String strL2 = kng0.l("TagText(value=", this.l, Separators.RPAREN);
        String strL3 = kng0.l("MarketDescriptionText(value=", this.m, Separators.RPAREN);
        String strE2 = ua80.e(this.n, "MarketDescriptionTextStyle(value=", Separators.RPAREN);
        String strE3 = ua80.e(this.p, "MarketStyle(value=", Separators.RPAREN);
        String strL4 = kng0.l("CoefTextValue(value=", this.q, Separators.RPAREN);
        StringBuilder sbQ = kng0.q(this.f17047a, "CouponBonusUiModel(eventId=", ", eventType=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", eventMainGameId=", this.c, ", eventGameId=");
        sbQ.append(this.d);
        kng0.A(sbQ, ", eventSportId=", this.e, ", subSportId=");
        sbQ.append(this.f);
        kng0.A(sbQ, ", gameId=", this.g, ", live=");
        ua80.q(this.i, ", bonusIconRes=", ", titleText=", sbQ, this.h);
        f140.v(sbQ, strL, ", titleTextStyle=", strE, ", tagText=");
        f140.v(sbQ, strL2, ", marketDescriptionText=", strL3, ", marketDescriptionTextStyle=");
        f140.v(sbQ, strE2, ", marketHeaderText=", this.o, ", marketStyle=");
        f140.v(sbQ, strE3, ", coefTextValue=", strL4, ", couponCardStyle=");
        return ua80.m(sbQ, this.r, ", couponSeparatorStyle=", this.s, Separators.RPAREN);
    }
}
