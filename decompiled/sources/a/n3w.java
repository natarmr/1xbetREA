package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n3w implements Serializable {
    public static final n3w Q1 = new n3w("", "", s77.UNSETTLED, 0, 0.0d, "", "", "", "", 0, 0.0d, e4f.b, 0.0d, 0.0d, 0.0d, 0.0d, lb90.f19744a, 0.0d, 0.0d, false, "", 0.0d, false, "", 0, 0, 0, 0.0d, false, 0.0d, false, q4f.b, v21.NONE, r21.NONE, false, false, "", "", 0.0d, false, 0.0d, "", false, false, false, false, false, false, false, 0.0d, hxu.h, mob0.f, 0, "", uoy.UNKNOWN, 0, 0.0d, 0.0d, false, false, iun.f15405a, an6.g, ozc.POSSIBLE_PAYOUT, "", 0, "");
    public final int A;
    public final mob0 A1;
    public final double B;
    public final long B1;
    public final String C1;
    public final uoy D1;
    public final long E1;
    public final double F1;
    public final double G1;
    public final boolean H1;
    public final boolean I1;
    public final List J1;
    public final an6 K1;
    public final ozc L1;
    public final String M1;
    public final long N1;
    public final String O1;
    public final boolean P1;
    public final boolean Y;
    public final double Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22868a;
    public final String b;
    public final s77 c;
    public final long d;
    public final double e;
    public final String f;
    public final boolean f1;
    public final String g;
    public final q4f g1;
    public final String h;
    public final v21 h1;
    public final String i;
    public final r21 i1;
    public final long j;
    public final boolean j1;
    public final double k;
    public final boolean k1;
    public final e4f l;
    public final String l1;
    public final double m;
    public final String m1;
    public final double n;
    public final double n1;
    public final double o;
    public final boolean o1;
    public final double p;
    public final double p1;
    public final lb90 q;
    public final String q1;
    public final double r;
    public final boolean r1;
    public final double s;
    public final boolean s1;
    public final boolean t;
    public final boolean t1;
    public final String u;
    public final boolean u1;
    public final double v;
    public final boolean v1;
    public final boolean w;
    public final boolean w1;
    public final String x;
    public final boolean x1;
    public final int y;
    public final double y1;
    public final int z;
    public final hxu z1;

    public n3w(String str, String str2, s77 s77Var, long j, double d, String str3, String str4, String str5, String str6, long j2, double d2, e4f e4fVar, double d3, double d4, double d5, double d6, lb90 lb90Var, double d7, double d8, boolean z, String str7, double d9, boolean z2, String str8, int i, int i2, int i3, double d10, boolean z3, double d11, boolean z4, q4f q4fVar, v21 v21Var, r21 r21Var, boolean z5, boolean z6, String str9, String str10, double d12, boolean z7, double d13, String str11, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, double d14, hxu hxuVar, mob0 mob0Var, long j3, String str12, uoy uoyVar, long j4, double d15, double d16, boolean z15, boolean z16, List list, an6 an6Var, ozc ozcVar, String str13, long j5, String str14) {
        str.getClass();
        str2.getClass();
        s77Var.getClass();
        str3.getClass();
        str4.getClass();
        str7.getClass();
        str8.getClass();
        str10.getClass();
        hxuVar.getClass();
        mob0Var.getClass();
        list.getClass();
        this.f22868a = str;
        this.b = str2;
        this.c = s77Var;
        this.d = j;
        this.e = d;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = j2;
        this.k = d2;
        this.l = e4fVar;
        this.m = d3;
        this.n = d4;
        this.o = d5;
        this.p = d6;
        this.q = lb90Var;
        this.r = d7;
        this.s = d8;
        this.t = z;
        this.u = str7;
        this.v = d9;
        this.w = z2;
        this.x = str8;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = d10;
        this.Y = z3;
        this.Z = d11;
        this.f1 = z4;
        this.g1 = q4fVar;
        this.h1 = v21Var;
        this.i1 = r21Var;
        this.j1 = z5;
        this.k1 = z6;
        this.l1 = str9;
        this.m1 = str10;
        this.n1 = d12;
        this.o1 = z7;
        this.p1 = d13;
        this.q1 = str11;
        this.r1 = z8;
        this.s1 = z9;
        this.t1 = z10;
        this.u1 = z11;
        this.v1 = z12;
        this.w1 = z13;
        this.x1 = z14;
        this.y1 = d14;
        this.z1 = hxuVar;
        this.A1 = mob0Var;
        this.B1 = j3;
        this.C1 = str12;
        this.D1 = uoyVar;
        this.E1 = j4;
        this.F1 = d15;
        this.G1 = d16;
        this.H1 = z15;
        this.I1 = z16;
        this.J1 = list;
        this.K1 = an6Var;
        this.L1 = ozcVar;
        this.M1 = str13;
        this.N1 = j5;
        this.O1 = str14;
        boolean z17 = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((su6) it.next()).s1) {
                    z17 = true;
                    break;
                }
            }
        }
        this.P1 = z17;
    }

    public static n3w d(n3w n3wVar, String str, double d, String str2, String str3, long j, e4f e4fVar, double d2, double d3, String str4, String str5, q4f q4fVar, boolean z, String str6, hxu hxuVar, List list, int i, int i2) {
        s77 s77Var = s77.JACKPOT;
        String str7 = (i & 1) != 0 ? n3wVar.f22868a : str;
        String str8 = n3wVar.b;
        if ((i & 4) != 0) {
            s77Var = n3wVar.c;
        }
        s77 s77Var2 = s77Var;
        long j2 = n3wVar.d;
        double d4 = (i & 16) != 0 ? n3wVar.e : d;
        String str9 = (i & 32) != 0 ? n3wVar.f : str2;
        String str10 = (i & 64) != 0 ? n3wVar.g : str3;
        String str11 = n3wVar.h;
        String str12 = n3wVar.i;
        long j3 = (i & 512) != 0 ? n3wVar.j : j;
        double d5 = n3wVar.k;
        e4f e4fVar2 = (i & 2048) != 0 ? n3wVar.l : e4fVar;
        double d6 = (i & 4096) != 0 ? n3wVar.m : 0.0d;
        double d7 = n3wVar.n;
        double d8 = (i & 16384) != 0 ? n3wVar.o : d2;
        double d9 = (32768 & i) != 0 ? n3wVar.p : d3;
        lb90 lb90Var = n3wVar.q;
        double d10 = n3wVar.r;
        double d11 = n3wVar.s;
        boolean z2 = n3wVar.t;
        String str13 = (i & 1048576) != 0 ? n3wVar.u : str4;
        double d12 = n3wVar.v;
        boolean z3 = n3wVar.w;
        String str14 = (i & 8388608) != 0 ? n3wVar.x : str5;
        int i3 = (i & 16777216) != 0 ? n3wVar.y : 1;
        int i4 = (i & 33554432) != 0 ? n3wVar.z : 1;
        int i5 = n3wVar.A;
        double d13 = n3wVar.B;
        boolean z4 = n3wVar.Y;
        double d14 = n3wVar.Z;
        boolean z5 = n3wVar.f1;
        n3wVar.getClass();
        n3wVar.getClass();
        q4f q4fVar2 = (i2 & 2) != 0 ? n3wVar.g1 : q4fVar;
        v21 v21Var = n3wVar.h1;
        r21 r21Var = n3wVar.i1;
        boolean z6 = (i2 & 16) != 0 ? n3wVar.j1 : z;
        boolean z7 = n3wVar.k1;
        String str15 = n3wVar.l1;
        String str16 = (i2 & 128) != 0 ? n3wVar.m1 : str6;
        double d15 = n3wVar.n1;
        boolean z8 = n3wVar.o1;
        double d16 = n3wVar.p1;
        String str17 = n3wVar.q1;
        boolean z9 = n3wVar.r1;
        boolean z10 = n3wVar.s1;
        boolean z11 = n3wVar.t1;
        boolean z12 = n3wVar.u1;
        boolean z13 = n3wVar.v1;
        boolean z14 = n3wVar.w1;
        boolean z15 = n3wVar.x1;
        double d17 = n3wVar.y1;
        hxu hxuVar2 = (i2 & 1048576) != 0 ? n3wVar.z1 : hxuVar;
        mob0 mob0Var = n3wVar.A1;
        long j4 = n3wVar.B1;
        String str18 = n3wVar.C1;
        uoy uoyVar = n3wVar.D1;
        long j5 = n3wVar.E1;
        double d18 = n3wVar.F1;
        double d19 = n3wVar.G1;
        boolean z16 = n3wVar.H1;
        boolean z17 = n3wVar.I1;
        n3wVar.getClass();
        List list2 = (i2 & Integer.MIN_VALUE) != 0 ? n3wVar.J1 : list;
        an6 an6Var = n3wVar.K1;
        ozc ozcVar = n3wVar.L1;
        String str19 = n3wVar.M1;
        long j6 = n3wVar.N1;
        String str20 = n3wVar.O1;
        n3wVar.getClass();
        str7.getClass();
        str8.getClass();
        s77Var2.getClass();
        str9.getClass();
        str10.getClass();
        str13.getClass();
        str14.getClass();
        str16.getClass();
        hxuVar2.getClass();
        mob0Var.getClass();
        list2.getClass();
        return new n3w(str7, str8, s77Var2, j2, d4, str9, str10, str11, str12, j3, d5, e4fVar2, d6, d7, d8, d9, lb90Var, d10, d11, z2, str13, d12, z3, str14, i3, i4, i5, d13, z4, d14, z5, q4fVar2, v21Var, r21Var, z6, z7, str15, str16, d15, z8, d16, str17, z9, z10, z11, z12, z13, z14, z15, d17, hxuVar2, mob0Var, j4, str18, uoyVar, j5, d18, d19, z16, z17, list2, an6Var, ozcVar, str19, j6, str20);
    }

    public final boolean a() {
        return this.H1 && this.n > 0.0d && this.p1 > 0.0d && this.l == e4f.j;
    }

    public final boolean b() {
        if (this.Z <= 0.0d) {
            return false;
        }
        e4f e4fVar = e4f.f;
        e4f e4fVar2 = this.l;
        if (e4fVar2 != e4fVar) {
            return e4fVar2 == e4f.c && this.c == s77.SALE;
        }
        return true;
    }

    public final boolean e() {
        e4f e4fVar = e4f.f;
        e4f e4fVar2 = this.l;
        if (e4fVar2 == e4fVar || e4fVar2 == e4f.e) {
            return this.G1 > 0.0d || this.F1 > 0.0d;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3w)) {
            return false;
        }
        n3w n3wVar = (n3w) obj;
        return Intrinsics.d(this.f22868a, n3wVar.f22868a) && Intrinsics.d(this.b, n3wVar.b) && this.c == n3wVar.c && this.d == n3wVar.d && Double.compare(this.e, n3wVar.e) == 0 && Intrinsics.d(this.f, n3wVar.f) && Intrinsics.d(this.g, n3wVar.g) && this.h.equals(n3wVar.h) && this.i.equals(n3wVar.i) && this.j == n3wVar.j && Double.compare(this.k, n3wVar.k) == 0 && this.l == n3wVar.l && Double.compare(this.m, n3wVar.m) == 0 && Double.compare(this.n, n3wVar.n) == 0 && Double.compare(this.o, n3wVar.o) == 0 && Double.compare(this.p, n3wVar.p) == 0 && this.q == n3wVar.q && Double.compare(this.r, n3wVar.r) == 0 && Double.compare(this.s, n3wVar.s) == 0 && this.t == n3wVar.t && Intrinsics.d(this.u, n3wVar.u) && Double.compare(this.v, n3wVar.v) == 0 && this.w == n3wVar.w && Intrinsics.d(this.x, n3wVar.x) && this.y == n3wVar.y && this.z == n3wVar.z && this.A == n3wVar.A && Double.compare(this.B, n3wVar.B) == 0 && this.Y == n3wVar.Y && Double.compare(this.Z, n3wVar.Z) == 0 && this.f1 == n3wVar.f1 && this.g1 == n3wVar.g1 && this.h1 == n3wVar.h1 && this.i1 == n3wVar.i1 && this.j1 == n3wVar.j1 && this.k1 == n3wVar.k1 && this.l1.equals(n3wVar.l1) && Intrinsics.d(this.m1, n3wVar.m1) && Double.compare(this.n1, n3wVar.n1) == 0 && this.o1 == n3wVar.o1 && Double.compare(this.p1, n3wVar.p1) == 0 && this.q1.equals(n3wVar.q1) && this.r1 == n3wVar.r1 && this.s1 == n3wVar.s1 && this.t1 == n3wVar.t1 && this.u1 == n3wVar.u1 && this.v1 == n3wVar.v1 && this.w1 == n3wVar.w1 && this.x1 == n3wVar.x1 && Double.compare(this.y1, n3wVar.y1) == 0 && Intrinsics.d(this.z1, n3wVar.z1) && Intrinsics.d(this.A1, n3wVar.A1) && this.B1 == n3wVar.B1 && this.C1.equals(n3wVar.C1) && this.D1 == n3wVar.D1 && this.E1 == n3wVar.E1 && Double.compare(this.F1, n3wVar.F1) == 0 && Double.compare(this.G1, n3wVar.G1) == 0 && this.H1 == n3wVar.H1 && this.I1 == n3wVar.I1 && Double.compare(0.0d, 0.0d) == 0 && Intrinsics.d(this.J1, n3wVar.J1) && this.K1 == n3wVar.K1 && this.L1 == n3wVar.L1 && this.M1.equals(n3wVar.M1) && this.N1 == n3wVar.N1 && this.O1.equals(n3wVar.O1);
    }

    public final String f() {
        return dw9.o(this.j, this.f22868a);
    }

    public final int hashCode() {
        return this.O1.hashCode() + rw2.b(ua80.b((this.L1.hashCode() + ((this.K1.hashCode() + dw9.a(brm0.d(0.0d, brm0.e(brm0.e(brm0.d(this.G1, brm0.d(this.F1, rw2.b(twn.d(this.D1, ua80.b(rw2.b((this.A1.hashCode() + ((this.z1.hashCode() + brm0.d(this.y1, brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.d(this.p1, brm0.e(brm0.d(this.n1, ua80.b(ua80.b(brm0.e(brm0.e((this.i1.hashCode() + ((this.h1.hashCode() + vqd.b(this.g1, brm0.e(brm0.e(brm0.e(brm0.d(this.Z, brm0.e(brm0.d(this.B, twn.a(this.A, twn.a(this.z, twn.a(this.y, ua80.b(brm0.e(brm0.d(this.v, ua80.b(brm0.e(brm0.d(this.s, brm0.d(this.r, (this.q.hashCode() + brm0.d(this.p, brm0.d(this.o, brm0.d(this.n, brm0.d(this.m, (this.l.hashCode() + brm0.d(this.k, rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.d(this.e, rw2.b((this.c.hashCode() + ua80.b(this.f22868a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31)) * 31, 31), 31), 31), 31)) * 31, 31), 31), 31, this.t), 31, this.u), 31), 31, this.w), 31, this.x), 31), 31), 31), 31), 31, this.Y), 31), 31, this.f1), 31, false), 31, false), 31)) * 31)) * 31, 31, this.j1), 31, this.k1), 31, this.l1), 31, this.m1), 31), 31, this.o1), 31), 31, this.q1), 31, this.r1), 31, this.s1), 31, this.t1), 31, this.u1), 31, this.v1), 31, this.w1), 31, this.x1), 31)) * 31)) * 31, 31, this.B1), 31, this.C1), 31), 31, this.E1), 31), 31), 31, this.H1), 31, this.I1), 31), 31, this.J1)) * 31)) * 31, 31, this.M1), 31, this.N1);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HistoryItemModel(betId=", this.f22868a, ", autoBetId=", this.b, ", betHistoryType=");
        sbN.append(this.c);
        sbN.append(", sportId=");
        sbN.append(this.d);
        ohs0.A(sbN, this.e, ", coefficient=", ", coefficientString=");
        f140.v(sbN, this.f, ", currencySymbol=", this.g, ", optionMaxCfView=");
        f140.v(sbN, this.h, ", optionLowerCfView=", this.i, ", date=");
        sbN.append(this.j);
        ohs0.A(sbN, this.k, ", oldSum=", ", status=");
        sbN.append(this.l);
        sbN.append(", saleSum=");
        sbN.append(this.m);
        ohs0.A(sbN, this.n, ", outSum=", ", betSum=");
        sbN.append(this.o);
        ohs0.A(sbN, this.p, ", winSum=", ", payoutType=");
        sbN.append(this.q);
        sbN.append(", payoutSum=");
        sbN.append(this.r);
        ohs0.A(sbN, this.s, ", possiblePayoutSum=", ", isLive=");
        f140.s(", eventName=", this.u, ", possibleWin=", sbN, this.t);
        rz4.x(sbN, this.v, ", eachWayBet=", this.w);
        axq.s(this.y, ", betTitle=", this.x, ", betCount=", sbN);
        rw2.s(this.z, this.A, ", eventCount=", ", finishedBetCount=", sbN);
        ohs0.A(sbN, this.B, ", prepaymentSumClosed=", ", isAutoSaleOrder=");
        sbN.append(this.Y);
        sbN.append(", autoSaleSum=");
        sbN.append(this.Z);
        sbN.append(", isApproved=");
        sbN.append(this.f1);
        sbN.append(", isDropOnScoreChange=false, exceptionTextCanceled=false, couponType=");
        sbN.append(this.g1);
        sbN.append(", gameType=");
        sbN.append(this.h1);
        sbN.append(", betType=");
        sbN.append(this.i1);
        w6x.A(", subscribed=", ", isSaleAvailable=", sbN, this.j1, this.k1);
        f140.v(sbN, ", champName=", this.l1, ", couponTypeName=", this.m1);
        ohs0.A(sbN, this.n1, ", availableBetSum=", ", dropOnScoreChange=");
        sbN.append(this.o1);
        sbN.append(", oldSaleSum=");
        sbN.append(this.p1);
        w6x.z(", cancellationReason=", this.q1, ", possibleGainEnabled=", sbN, this.r1);
        w6x.A(", promo=", ", canSell=", sbN, this.s1, this.t1);
        w6x.A(", canPrint=", ", optionBet=", sbN, this.u1, this.v1);
        w6x.A(", canAutoSell=", ", advanceBet=", sbN, this.w1, this.x1);
        ohs0.A(sbN, this.y1, ", maxPayout=", ", taxBet=");
        sbN.append(this.z1);
        sbN.append(", powerBetModel=");
        sbN.append(this.A1);
        sbN.append(", gameId=");
        kng0.z(sbN, this.B1, ", gameName=", this.C1);
        sbN.append(", kind=");
        sbN.append(this.D1);
        sbN.append(", eventTypeSmallGroupId=");
        sbN.append(this.E1);
        ohs0.A(sbN, this.F1, ", prepaymentSumTo=", ", prepaymentSum=");
        rz4.x(sbN, this.G1, ", hasSaleTransactions=", this.H1);
        esw0.l(sbN, ", hasOrder=", this.I1, ", antiExpressCoef=0.0, eventsList=", this.J1);
        sbN.append(", betCoeffType=");
        sbN.append(this.K1);
        sbN.append(", coefType=");
        sbN.append(this.L1);
        hne.B(sbN, ", organizer=", this.M1, ", betApproveId=");
        kng0.z(sbN, this.N1, ", qrLink=", this.O1);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
