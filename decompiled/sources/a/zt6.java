package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zt6 {
    public static final yt6 Companion = new yt6();
    public static final a8z[] I;
    public final boolean A;
    public final String B;
    public final boolean C;
    public final int D;
    public final boolean E;
    public final String F;
    public final int G;
    public final yb9 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44940a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final int g;
    public final int h;
    public final boolean i;
    public final List j;
    public final List k;
    public final long l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final String r;
    public final String s;
    public final String t;
    public final boolean u;
    public final String v;
    public final String w;
    public final double x;
    public final boolean y;
    public final boolean z;

    static {
        xb9 xb9Var = yb9.Companion;
        wez wezVar = wez.f39042a;
        I = new a8z[]{null, null, null, null, null, maz.a(wezVar, new lg6((byte) 14)), null, null, null, maz.a(wezVar, new lg6((byte) 15)), maz.a(wezVar, new lg6((byte) 16)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public zt6(int i, int i2, long j, long j2, String str, String str2, boolean z, List list, int i3, int i4, boolean z2, List list2, List list3, long j3, int i5, int i6, boolean z3, boolean z4, int i7, String str3, String str4, String str5, boolean z5, String str6, String str7, double d, boolean z6, boolean z7, boolean z8, String str8, boolean z9, int i8, boolean z10, String str9, int i9, yb9 yb9Var) {
        if ((3 != (i2 & 3)) || (-1 != i)) {
            int[] iArr = {i, i2};
            int[] iArr2 = {-1, 3};
            ugi0 descriptor = xt6.f41449a.getDescriptor();
            descriptor.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = iArr2[i10] & (~iArr[i10]);
                if (i11 != 0) {
                    for (int i12 = 0; i12 < 32; i12++) {
                        if ((i11 & 1) != 0) {
                            arrayList.add(descriptor.e((i10 * 32) + i12));
                        }
                        i11 >>>= 1;
                    }
                }
            }
            throw new bh40(descriptor.h(), arrayList);
        }
        this.f44940a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = list;
        this.g = i3;
        this.h = i4;
        this.i = z2;
        this.j = list2;
        this.k = list3;
        this.l = j3;
        this.m = i5;
        this.n = i6;
        this.o = z3;
        this.p = z4;
        this.q = i7;
        this.r = str3;
        this.s = str4;
        this.t = str5;
        this.u = z5;
        this.v = str6;
        this.w = str7;
        this.x = d;
        this.y = z6;
        this.z = z7;
        this.A = z8;
        this.B = str8;
        this.C = z9;
        this.D = i8;
        this.E = z10;
        this.F = str9;
        this.G = i9;
        this.H = yb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt6)) {
            return false;
        }
        zt6 zt6Var = (zt6) obj;
        return this.f44940a == zt6Var.f44940a && this.b == zt6Var.b && Intrinsics.d(this.c, zt6Var.c) && Intrinsics.d(this.d, zt6Var.d) && this.e == zt6Var.e && Intrinsics.d(this.f, zt6Var.f) && this.g == zt6Var.g && this.h == zt6Var.h && this.i == zt6Var.i && Intrinsics.d(this.j, zt6Var.j) && Intrinsics.d(this.k, zt6Var.k) && this.l == zt6Var.l && this.m == zt6Var.m && this.n == zt6Var.n && this.o == zt6Var.o && this.p == zt6Var.p && this.q == zt6Var.q && Intrinsics.d(this.r, zt6Var.r) && Intrinsics.d(this.s, zt6Var.s) && Intrinsics.d(this.t, zt6Var.t) && this.u == zt6Var.u && Intrinsics.d(this.v, zt6Var.v) && Intrinsics.d(this.w, zt6Var.w) && Double.compare(this.x, zt6Var.x) == 0 && this.y == zt6Var.y && this.z == zt6Var.z && this.A == zt6Var.A && Intrinsics.d(this.B, zt6Var.B) && this.C == zt6Var.C && this.D == zt6Var.D && this.E == zt6Var.E && Intrinsics.d(this.F, zt6Var.F) && this.G == zt6Var.G && Intrinsics.d(this.H, zt6Var.H);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.q, brm0.e(brm0.e(twn.a(this.n, twn.a(this.m, rw2.b(dw9.a(dw9.a(brm0.e(twn.a(this.h, twn.a(this.g, dw9.a(brm0.e(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f44940a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31), 31, this.o), 31, this.p), 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
        String str = this.v;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.w;
        int iA = twn.a(this.G, ua80.b(brm0.e(twn.a(this.D, brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.d(this.x, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31), 31, this.E), 31, this.F), 31);
        yb9 yb9Var = this.H;
        return iA + (yb9Var != null ? yb9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f44940a, "BetDataRequest(userId=", ", userBonusId=");
        kng0.z(sbQ, this.b, ", appGUID=", this.c);
        w6x.z(", betSum=", this.d, ", advanceBet=", sbQ, this.e);
        sbQ.append(", betEvents=");
        sbQ.append(this.f);
        sbQ.append(", vid=");
        sbQ.append(this.g);
        dw9.v(this.h, ", checkCF=", ", withLobby=", sbQ, this.i);
        hne.v(", eventsIndexes=", ", groupSumms=", sbQ, this.j, this.k);
        kng0.A(sbQ, ", expressNum=", this.l, ", refId=");
        axq.r(this.m, this.n, ", type=", ", noWait=", sbQ);
        ua80.u(", vipBetSum=", ", source=", sbQ, this.o, this.p);
        kng0.w(this.q, ", date=", this.r, ", sign=", sbQ);
        f140.v(sbQ, this.s, ", lng=", this.t, ", approvedBet=");
        f140.s(", betGuid=", this.v, ", promoCode=", sbQ, this.u);
        hne.A(sbQ, this.w, ", autoBetCf=", this.x);
        w6x.A(", dropOnScoreChange=", ", fromLineToLive=", sbQ, this.y, this.z);
        hne.u(", calcSystemsMin=", ", couponCode=", this.B, sbQ, this.A);
        cs0.v(this.D, ", isExpressBoost=", ", oneClickBet=", sbQ, this.C);
        hne.u(", isPowerBet=", ", saleBetId=", this.F, sbQ, this.E);
        sbQ.append(", specialTypes=");
        sbQ.append(this.G);
        sbQ.append(", builderCoupon=");
        sbQ.append(this.H);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public zt6(long j, long j2, String str, String str2, boolean z, ArrayList arrayList, int i, int i2, boolean z2, List list, ArrayList arrayList2, long j3, int i3, boolean z3, String str3, String str4, String str5, boolean z4, String str6, String str7, double d, boolean z5, boolean z6, boolean z7, String str8, boolean z8, int i4, boolean z9, String str9, int i5, yb9 yb9Var) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str8.getClass();
        this.f44940a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = arrayList;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = list;
        this.k = arrayList2;
        this.l = j3;
        this.m = 1;
        this.n = i3;
        this.o = true;
        this.p = z3;
        this.q = 22;
        this.r = str3;
        this.s = str4;
        this.t = str5;
        this.u = z4;
        this.v = str6;
        this.w = str7;
        this.x = d;
        this.y = z5;
        this.z = z6;
        this.A = z7;
        this.B = str8;
        this.C = z8;
        this.D = i4;
        this.E = z9;
        this.F = str9;
        this.G = i5;
        this.H = yb9Var;
    }
}
