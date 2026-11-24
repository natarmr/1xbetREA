package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iv10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15422a;
    public final List b;
    public final cso c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final jzm0 h;
    public final int i;
    public final String j;
    public final cnq0 k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final nbr o;
    public final int p;
    public final String q;
    public final int r;
    public final int s;
    public final ffm0 t;

    public iv10(String str, List list, cso csoVar, int i, String str2, int i2, int i3, jzm0 jzm0Var, int i4, String str3, cnq0 cnq0Var, String str4, boolean z, boolean z2, nbr nbrVar, int i5, String str5, int i6, int i7, ffm0 ffm0Var) {
        list.getClass();
        this.f15422a = str;
        this.b = list;
        this.c = csoVar;
        this.d = i;
        this.e = str2;
        this.f = i2;
        this.g = i3;
        this.h = jzm0Var;
        this.i = i4;
        this.j = str3;
        this.k = cnq0Var;
        this.l = str4;
        this.m = z;
        this.n = z2;
        this.o = nbrVar;
        this.p = i5;
        this.q = str5;
        this.r = i6;
        this.s = i7;
        this.t = ffm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv10)) {
            return false;
        }
        iv10 iv10Var = (iv10) obj;
        return this.f15422a.equals(iv10Var.f15422a) && Intrinsics.d(this.b, iv10Var.b) && this.c.equals(iv10Var.c) && this.d == iv10Var.d && this.e.equals(iv10Var.e) && this.f == iv10Var.f && this.g == iv10Var.g && this.h.equals(iv10Var.h) && this.i == iv10Var.i && this.j.equals(iv10Var.j) && this.k.equals(iv10Var.k) && this.l.equals(iv10Var.l) && this.m == iv10Var.m && this.n == iv10Var.n && this.o.equals(iv10Var.o) && this.p == iv10Var.p && this.q.equals(iv10Var.q) && this.r == iv10Var.r && this.s == iv10Var.s && this.t.equals(iv10Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + twn.a(this.s, twn.a(this.r, ua80.b(twn.a(this.p, (this.o.hashCode() + brm0.e(brm0.e(ua80.b((this.k.hashCode() + ua80.b(twn.a(this.i, (this.h.hashCode() + twn.a(this.g, twn.a(this.f, ua80.b(twn.a(this.d, (this.c.hashCode() + dw9.a(this.f15422a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31), 31)) * 31, 31), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n)) * 31, 31), 31, this.q), 31), 31);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("MainGameScoresModel(fullScore=", this.f15422a, ", periodScores=", this.b, ", extendedScore=");
        sbF.append(this.c);
        sbF.append(", currentPeriod=");
        sbF.append(this.d);
        sbF.append(", currentPeriodName=");
        twn.w(this.f, this.e, ", scoreOpp1=", ", scoreOpp2=", sbF);
        sbF.append(this.g);
        sbF.append(", subScore=");
        sbF.append(this.h);
        sbF.append(", serve=");
        kng0.w(this.i, ", periodScoresStr=", this.j, ", timer=", sbF);
        sbF.append(this.k);
        sbF.append(", info=");
        sbF.append(this.l);
        sbF.append(", isBreak=");
        ua80.u(", hasCourseOfPlay=", ", fullScoreDetail=", sbF, this.m, this.n);
        sbF.append(this.o);
        sbF.append(", periodsCount=");
        sbF.append(this.p);
        sbF.append(", statusLineStr=");
        twn.w(this.r, this.q, ", stageTime=", ", gameStatus=", sbF);
        sbF.append(this.s);
        sbF.append(", statisticModel=");
        sbF.append(this.t);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
