package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n97 {
    public static final l97 Companion = new l97();
    public static final a8z[] R;
    public final Integer A;
    public final Double B;
    public final Double C;
    public final Double D;
    public final Boolean E;
    public final Double F;
    public final Integer G;
    public final Double H;
    public final Integer I;
    public final Boolean J;
    public final Double K;
    public final Double L;
    public final Double M;
    public final Double N;
    public final Double O;
    public final Double P;
    public final Double Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23125a;
    public final Double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Double h;
    public final Integer i;
    public final String j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final String n;
    public final String o;
    public final List p;
    public final pxu q;
    public final ivg0 r;
    public final Boolean s;
    public final Boolean t;
    public final Boolean u;
    public final String v;
    public final Long w;
    public final Long x;
    public final String y;
    public final Boolean z;

    static {
        gvg0 gvg0Var = ivg0.Companion;
        R = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new t07((byte) 10)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ n97(int i, int i2, Long l, Double d, String str, String str2, String str3, String str4, Long l2, Double d2, Integer num, String str5, Boolean bool, Integer num2, Integer num3, String str6, String str7, List list, pxu pxuVar, ivg0 ivg0Var, Boolean bool2, Boolean bool3, Boolean bool4, String str8, Long l3, Long l4, String str9, Boolean bool5, Integer num4, Double d3, Double d4, Double d5, Boolean bool6, Double d6, Integer num5, Double d7, Integer num6, Boolean bool7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, Double d14) {
        if ((i & 1) == 0) {
            this.f23125a = null;
        } else {
            this.f23125a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str6;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str7;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = pxuVar;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = ivg0Var;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool2;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = bool3;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str8;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = l3;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = l4;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = str9;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = bool5;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = num4;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = d3;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = d4;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = d5;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = bool6;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = d6;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = num5;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = d7;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = num6;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = bool7;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = d8;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = d9;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = d10;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = d11;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = d12;
        }
        if ((i2 & 512) == 0) {
            this.P = null;
        } else {
            this.P = d13;
        }
        if ((i2 & 1024) == 0) {
            this.Q = null;
        } else {
            this.Q = d14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n97)) {
            return false;
        }
        n97 n97Var = (n97) obj;
        return Intrinsics.d(this.f23125a, n97Var.f23125a) && Intrinsics.d(this.b, n97Var.b) && Intrinsics.d(this.c, n97Var.c) && Intrinsics.d(this.d, n97Var.d) && Intrinsics.d(this.e, n97Var.e) && Intrinsics.d(this.f, n97Var.f) && Intrinsics.d(this.g, n97Var.g) && Intrinsics.d(this.h, n97Var.h) && Intrinsics.d(this.i, n97Var.i) && Intrinsics.d(this.j, n97Var.j) && Intrinsics.d(this.k, n97Var.k) && Intrinsics.d(this.l, n97Var.l) && Intrinsics.d(this.m, n97Var.m) && Intrinsics.d(this.n, n97Var.n) && Intrinsics.d(this.o, n97Var.o) && Intrinsics.d(this.p, n97Var.p) && Intrinsics.d(this.q, n97Var.q) && Intrinsics.d(this.r, n97Var.r) && Intrinsics.d(this.s, n97Var.s) && Intrinsics.d(this.t, n97Var.t) && Intrinsics.d(this.u, n97Var.u) && Intrinsics.d(this.v, n97Var.v) && Intrinsics.d(this.w, n97Var.w) && Intrinsics.d(this.x, n97Var.x) && Intrinsics.d(this.y, n97Var.y) && Intrinsics.d(this.z, n97Var.z) && Intrinsics.d(this.A, n97Var.A) && Intrinsics.d(this.B, n97Var.B) && Intrinsics.d(this.C, n97Var.C) && Intrinsics.d(this.D, n97Var.D) && Intrinsics.d(this.E, n97Var.E) && Intrinsics.d(this.F, n97Var.F) && Intrinsics.d(this.G, n97Var.G) && Intrinsics.d(this.H, n97Var.H) && Intrinsics.d(this.I, n97Var.I) && Intrinsics.d(this.J, n97Var.J) && Intrinsics.d(this.K, n97Var.K) && Intrinsics.d(this.L, n97Var.L) && Intrinsics.d(this.M, n97Var.M) && Intrinsics.d(this.N, n97Var.N) && Intrinsics.d(this.O, n97Var.O) && Intrinsics.d(this.P, n97Var.P) && Intrinsics.d(this.Q, n97Var.Q);
    }

    public final int hashCode() {
        Long l = this.f23125a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d2 = this.h;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.m;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.n;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.p;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        pxu pxuVar = this.q;
        int iHashCode17 = (iHashCode16 + (pxuVar == null ? 0 : pxuVar.hashCode())) * 31;
        ivg0 ivg0Var = this.r;
        int iHashCode18 = (iHashCode17 + (ivg0Var == null ? 0 : ivg0Var.hashCode())) * 31;
        Boolean bool2 = this.s;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.t;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.u;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str8 = this.v;
        int iHashCode22 = (iHashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l3 = this.w;
        int iHashCode23 = (iHashCode22 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.x;
        int iHashCode24 = (iHashCode23 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str9 = this.y;
        int iHashCode25 = (iHashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool5 = this.z;
        int iHashCode26 = (iHashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.A;
        int iHashCode27 = (iHashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d3 = this.B;
        int iHashCode28 = (iHashCode27 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.C;
        int iHashCode29 = (iHashCode28 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.D;
        int iHashCode30 = (iHashCode29 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Boolean bool6 = this.E;
        int iHashCode31 = (iHashCode30 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Double d6 = this.F;
        int iHashCode32 = (iHashCode31 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num5 = this.G;
        int iHashCode33 = (iHashCode32 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d7 = this.H;
        int iHashCode34 = (iHashCode33 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num6 = this.I;
        int iHashCode35 = (iHashCode34 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool7 = this.J;
        int iHashCode36 = (iHashCode35 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Double d8 = this.K;
        int iHashCode37 = (iHashCode36 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.L;
        int iHashCode38 = (iHashCode37 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.M;
        int iHashCode39 = (iHashCode38 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.N;
        int iHashCode40 = (iHashCode39 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.O;
        int iHashCode41 = (iHashCode40 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.P;
        int iHashCode42 = (iHashCode41 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.Q;
        return iHashCode42 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetInfo(betId=");
        sb.append(this.f23125a);
        sb.append(", coef=");
        sb.append(this.b);
        sb.append(", coefString=");
        f140.v(sb, this.c, ", currency=", this.d, ", optionMaxCfView=");
        f140.v(sb, this.e, ", optionLowerCfView=", this.f, ", date=");
        sb.append(this.g);
        sb.append(", betSum=");
        sb.append(this.h);
        sb.append(", betTypeId=");
        b1j.u(this.i, ", betTypeName=", this.j, ", byPromoCode=", sb);
        h97.u(this.k, this.l, ", betCoeffType=", ", coefType=", sb);
        b1j.u(this.m, ", organizer=", this.n, ", qrLink=", sb);
        cs0.y(this.o, ", eventList=", ", taxBet=", sb, this.p);
        sb.append(this.q);
        sb.append(", saleInfo=");
        sb.append(this.r);
        sb.append(", canSell=");
        defpackage.c.j(sb, this.s, ", canPrint=", this.t, ", canAutoSell=");
        defpackage.c.h(this.u, ", autobetId=", this.v, ", autobetDate=", sb);
        cs0.A(sb, this.w, ", autoBetStatus=", this.x, ", cancelation=");
        h97.v(this.z, this.y, ", dropOnScoreChange=", ", betStatus=", sb);
        hne.z(sb, this.A, ", winSum=", this.B, ", betSumAfterSale=");
        vqd.w(sb, this.C, ", possibleWinSum=", this.D, ", eachWayBet=");
        sb.append(this.E);
        sb.append(", payoutSum=");
        sb.append(this.F);
        sb.append(", payoutType=");
        hne.z(sb, this.G, ", possiblePayoutSum=", this.H, ", systemType=");
        brm0.z(this.J, this.I, ", hasSaleTransactions=", ", sumOut=", sb);
        vqd.w(sb, this.K, ", oldSaleSum=", this.L, ", prepaymentSum=");
        vqd.w(sb, this.M, ", prepaymentSumTo=", this.N, ", prepaymentSumClosed=");
        vqd.w(sb, this.O, ", autoSaleSum=", this.P, ", maxPayout=");
        sb.append(this.Q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
