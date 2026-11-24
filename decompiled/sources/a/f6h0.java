package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f6h0 {
    public static final b6h0 Companion = new b6h0();
    public static final a8z[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9010a;
    public final List b;
    public final iso c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final rzm0 h;
    public final Integer i;
    public final String j;
    public final String k;
    public final Boolean l;
    public final rnq0 m;
    public final Boolean n;
    public final Map o;
    public final q3h0 p;
    public final k5h0 q;
    public final Integer r;
    public final String s;

    static {
        wez wezVar = wez.f39042a;
        t = new a8z[]{null, maz.a(wezVar, new yxg0((byte) 15)), null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new yxg0((byte) 17)), null, null, null, null};
    }

    public /* synthetic */ f6h0(int i, String str, List list, iso isoVar, Integer num, String str2, Integer num2, Integer num3, rzm0 rzm0Var, Integer num4, String str3, String str4, Boolean bool, rnq0 rnq0Var, Boolean bool2, Map map, q3h0 q3h0Var, k5h0 k5h0Var, Integer num5, String str5) {
        if ((i & 1) == 0) {
            this.f9010a = null;
        } else {
            this.f9010a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = isoVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = rzm0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = rnq0Var;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = map;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = q3h0Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = k5h0Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num5;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6h0)) {
            return false;
        }
        f6h0 f6h0Var = (f6h0) obj;
        return Intrinsics.d(this.f9010a, f6h0Var.f9010a) && Intrinsics.d(this.b, f6h0Var.b) && Intrinsics.d(this.c, f6h0Var.c) && Intrinsics.d(this.d, f6h0Var.d) && Intrinsics.d(this.e, f6h0Var.e) && Intrinsics.d(this.f, f6h0Var.f) && Intrinsics.d(this.g, f6h0Var.g) && Intrinsics.d(this.h, f6h0Var.h) && Intrinsics.d(this.i, f6h0Var.i) && Intrinsics.d(this.j, f6h0Var.j) && Intrinsics.d(this.k, f6h0Var.k) && Intrinsics.d(this.l, f6h0Var.l) && Intrinsics.d(this.m, f6h0Var.m) && Intrinsics.d(this.n, f6h0Var.n) && Intrinsics.d(this.o, f6h0Var.o) && Intrinsics.d(this.p, f6h0Var.p) && Intrinsics.d(this.q, f6h0Var.q) && Intrinsics.d(this.r, f6h0Var.r) && Intrinsics.d(this.s, f6h0Var.s);
    }

    public final int hashCode() {
        String str = this.f9010a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        iso isoVar = this.c;
        int iHashCode3 = (iHashCode2 + (isoVar == null ? 0 : isoVar.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        rzm0 rzm0Var = this.h;
        int iHashCode8 = (iHashCode7 + (rzm0Var == null ? 0 : rzm0Var.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.l;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        rnq0 rnq0Var = this.m;
        int iHashCode13 = (iHashCode12 + (rnq0Var == null ? 0 : rnq0Var.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map map = this.o;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        q3h0 q3h0Var = this.p;
        int iHashCode16 = (iHashCode15 + (q3h0Var == null ? 0 : q3h0Var.hashCode())) * 31;
        k5h0 k5h0Var = this.q;
        int iHashCode17 = (iHashCode16 + (k5h0Var == null ? 0 : k5h0Var.hashCode())) * 31;
        Integer num5 = this.r;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.s;
        return iHashCode18 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("ScoresResponse(fullScore=", this.f9010a, ", periodScores=", this.b, ", extendedScore=");
        sbF.append(this.c);
        sbF.append(", currentPeriod=");
        sbF.append(this.d);
        sbF.append(", currentPeriodName=");
        axq.x(this.f, this.e, ", scoreOpp1=", ", serve=", sbF);
        sbF.append(this.g);
        sbF.append(", subScore=");
        sbF.append(this.h);
        sbF.append(", scoreOpp2=");
        b1j.u(this.i, ", periodScoresStr=", this.j, ", info=", sbF);
        h97.v(this.l, this.k, ", isBreak=", ", timer=", sbF);
        sbF.append(this.m);
        sbF.append(", hasCourseOfPlay=");
        sbF.append(this.n);
        sbF.append(", tabloStats=");
        sbF.append(this.o);
        sbF.append(", fullScoreDetail=");
        sbF.append(this.p);
        sbF.append(", statistic=");
        sbF.append(this.q);
        sbF.append(", periodsCount=");
        sbF.append(this.r);
        sbF.append(", statusLineStr=");
        return axq.n(sbF, this.s, Separators.RPAREN);
    }
}
