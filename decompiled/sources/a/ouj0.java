package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ouj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25881a;
    public final long b;
    public final String c;
    public final boolean d;
    public final List e;
    public final int f;
    public final int g;
    public final boolean h;
    public final List i;
    public final List j;
    public final long k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final ex4 q;
    public final String r;
    public final q4f s;
    public final boolean t;
    public final boolean u;
    public final Boolean v;
    public final String w;
    public final double x;
    public final vb9 y;

    public ouj0(long j, long j2, String str, boolean z, List list, int i, int i2, boolean z2, List list2, List list3, long j3, int i3, boolean z3, boolean z4, String str2, String str3, ex4 ex4Var, String str4, q4f q4fVar, boolean z5, boolean z6, Boolean bool, String str5, double d, vb9 vb9Var) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        str4.getClass();
        q4fVar.getClass();
        this.f25881a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = list;
        this.f = i;
        this.g = i2;
        this.h = z2;
        this.i = list2;
        this.j = list3;
        this.k = j3;
        this.l = i3;
        this.m = z3;
        this.n = z4;
        this.o = str2;
        this.p = str3;
        this.q = ex4Var;
        this.r = str4;
        this.s = q4fVar;
        this.t = z5;
        this.u = z6;
        this.v = bool;
        this.w = str5;
        this.x = d;
        this.y = vb9Var;
    }

    public static ouj0 a(ouj0 ouj0Var, String str) {
        long j = ouj0Var.f25881a;
        long j2 = ouj0Var.b;
        String str2 = ouj0Var.c;
        boolean z = ouj0Var.d;
        List list = ouj0Var.e;
        int i = ouj0Var.f;
        int i2 = ouj0Var.g;
        boolean z2 = ouj0Var.h;
        List list2 = ouj0Var.i;
        List list3 = ouj0Var.j;
        long j3 = ouj0Var.k;
        int i3 = ouj0Var.l;
        boolean z3 = ouj0Var.m;
        boolean z4 = ouj0Var.n;
        String str3 = ouj0Var.o;
        ex4 ex4Var = ouj0Var.q;
        String str4 = ouj0Var.r;
        q4f q4fVar = ouj0Var.s;
        boolean z5 = ouj0Var.t;
        boolean z6 = ouj0Var.u;
        Boolean bool = ouj0Var.v;
        String str5 = ouj0Var.w;
        double d = ouj0Var.x;
        vb9 vb9Var = ouj0Var.y;
        ouj0Var.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        str4.getClass();
        q4fVar.getClass();
        return new ouj0(j, j2, str2, z, list, i, i2, z2, list2, list3, j3, i3, z3, z4, str3, str, ex4Var, str4, q4fVar, z5, z6, bool, str5, d, vb9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouj0)) {
            return false;
        }
        ouj0 ouj0Var = (ouj0) obj;
        return this.f25881a == ouj0Var.f25881a && this.b == ouj0Var.b && Intrinsics.d(this.c, ouj0Var.c) && this.d == ouj0Var.d && Intrinsics.d(this.e, ouj0Var.e) && this.f == ouj0Var.f && this.g == ouj0Var.g && this.h == ouj0Var.h && Intrinsics.d(this.i, ouj0Var.i) && Intrinsics.d(this.j, ouj0Var.j) && this.k == ouj0Var.k && this.l == ouj0Var.l && this.m == ouj0Var.m && this.n == ouj0Var.n && Intrinsics.d(this.o, ouj0Var.o) && Intrinsics.d(this.p, ouj0Var.p) && Intrinsics.d(this.q, ouj0Var.q) && Intrinsics.d(this.r, ouj0Var.r) && this.s == ouj0Var.s && this.t == ouj0Var.t && this.u == ouj0Var.u && Intrinsics.d(this.v, ouj0Var.v) && Intrinsics.d(this.w, ouj0Var.w) && Double.compare(this.x, ouj0Var.x) == 0 && Intrinsics.d(this.y, ouj0Var.y);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(twn.a(this.l, rw2.b(dw9.a(dw9.a(brm0.e(twn.a(this.g, twn.a(this.f, dw9.a(brm0.e(ua80.b(rw2.b(Long.hashCode(this.f25881a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n);
        String str = this.o;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ex4 ex4Var = this.q;
        int iE2 = brm0.e(brm0.e(vqd.b(this.s, ua80.b((iHashCode2 + (ex4Var == null ? 0 : ex4Var.hashCode())) * 31, 31, this.r), 31), 31, this.t), 31, this.u);
        Boolean bool = this.v;
        int iHashCode3 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.w;
        int iD = brm0.d(this.x, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        vb9 vb9Var = this.y;
        return iD + (vb9Var != null ? vb9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25881a, "SimpleBetDataModel(balanceId=", ", bonusId=");
        kng0.z(sbQ, this.b, ", betSum=", this.c);
        esw0.l(sbQ, ", advancedBet=", this.d, ", betEventsModelList=", this.e);
        rw2.s(this.f, this.g, ", vid=", ", checkCF=", sbQ);
        esw0.l(sbQ, ", withLobby=", this.h, ", eventsIndexes=", this.i);
        sbQ.append(", groupSumms=");
        sbQ.append(this.j);
        sbQ.append(", expressNum=");
        ua80.v(sbQ, this.k, ", coefViewTypeId=", this.l);
        w6x.A(", vipBetSum=", ", approvedBet=", sbQ, this.m, this.n);
        f140.v(sbQ, ", promoCode=", this.o, ", betGuid=", this.p);
        sbQ.append(", autoBetParamsModel=");
        sbQ.append(this.q);
        sbQ.append(", couponCode=");
        sbQ.append(this.r);
        sbQ.append(", couponTypeModel=");
        sbQ.append(this.s);
        sbQ.append(", isExpressBoost=");
        sbQ.append(this.t);
        sbQ.append(", oneClick=");
        sbQ.append(this.u);
        sbQ.append(", isPowerBet=");
        sbQ.append(this.v);
        hne.B(sbQ, ", saleBetId=", this.w, ", antiExpressCoef=");
        sbQ.append(this.x);
        sbQ.append(", builderCoupon=");
        sbQ.append(this.y);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
