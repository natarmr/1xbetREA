package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h6h0 {
    public static final d6h0 Companion = new d6h0();
    public static final a8z[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12529a;
    public final List b;
    public final iso c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final m380 h;
    public final Integer i;
    public final String j;
    public final rnq0 k;
    public final String l;
    public final Boolean m;
    public final Boolean n;
    public final Map o;
    public final xfm0 p;
    public final q3h0 q;
    public final Integer r;
    public final q3h0 s;
    public final Integer t;

    static {
        ufm0 ufm0Var = xfm0.Companion;
        wez wezVar = wez.f39042a;
        u = new a8z[]{null, maz.a(wezVar, new yxg0((byte) 16)), null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new yxg0((byte) 18)), null, null, null, null, null};
    }

    public /* synthetic */ h6h0(int i, String str, List list, iso isoVar, Integer num, String str2, Integer num2, Integer num3, m380 m380Var, Integer num4, String str3, rnq0 rnq0Var, String str4, Boolean bool, Boolean bool2, Map map, xfm0 xfm0Var, q3h0 q3h0Var, Integer num5, q3h0 q3h0Var2, Integer num6) {
        if ((i & 1) == 0) {
            this.f12529a = null;
        } else {
            this.f12529a = str;
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
            this.h = m380Var;
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
            this.k = rnq0Var;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool;
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
            this.p = xfm0Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = q3h0Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num5;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = q3h0Var2;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6h0)) {
            return false;
        }
        h6h0 h6h0Var = (h6h0) obj;
        return Intrinsics.d(this.f12529a, h6h0Var.f12529a) && Intrinsics.d(this.b, h6h0Var.b) && Intrinsics.d(this.c, h6h0Var.c) && Intrinsics.d(this.d, h6h0Var.d) && Intrinsics.d(this.e, h6h0Var.e) && Intrinsics.d(this.f, h6h0Var.f) && Intrinsics.d(this.g, h6h0Var.g) && Intrinsics.d(this.h, h6h0Var.h) && Intrinsics.d(this.i, h6h0Var.i) && Intrinsics.d(this.j, h6h0Var.j) && Intrinsics.d(this.k, h6h0Var.k) && Intrinsics.d(this.l, h6h0Var.l) && Intrinsics.d(this.m, h6h0Var.m) && Intrinsics.d(this.n, h6h0Var.n) && Intrinsics.d(this.o, h6h0Var.o) && Intrinsics.d(this.p, h6h0Var.p) && Intrinsics.d(this.q, h6h0Var.q) && Intrinsics.d(this.r, h6h0Var.r) && Intrinsics.d(this.s, h6h0Var.s) && Intrinsics.d(this.t, h6h0Var.t);
    }

    public final int hashCode() {
        String str = this.f12529a;
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
        m380 m380Var = this.h;
        int iHashCode8 = (iHashCode7 + (m380Var == null ? 0 : m380Var.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        rnq0 rnq0Var = this.k;
        int iHashCode11 = (iHashCode10 + (rnq0Var == null ? 0 : rnq0Var.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map map = this.o;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        xfm0 xfm0Var = this.p;
        int iHashCode16 = (iHashCode15 + (xfm0Var == null ? 0 : xfm0Var.hashCode())) * 31;
        q3h0 q3h0Var = this.q;
        int iHashCode17 = (iHashCode16 + (q3h0Var == null ? 0 : q3h0Var.hashCode())) * 31;
        Integer num5 = this.r;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        q3h0 q3h0Var2 = this.s;
        int iHashCode19 = (iHashCode18 + (q3h0Var2 == null ? 0 : q3h0Var2.hashCode())) * 31;
        Integer num6 = this.t;
        return iHashCode19 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("ScoresResponse(fullScore=", this.f12529a, ", periodScores=", this.b, ", extendedScore=");
        sbF.append(this.c);
        sbF.append(", currentPeriod=");
        sbF.append(this.d);
        sbF.append(", currentPeriodName=");
        axq.x(this.f, this.e, ", scoreOpp1=", ", scoreOpp2=", sbF);
        sbF.append(this.g);
        sbF.append(", subScore=");
        sbF.append(this.h);
        sbF.append(", serve=");
        b1j.u(this.i, ", periodScoresStr=", this.j, ", timer=", sbF);
        sbF.append(this.k);
        sbF.append(", info=");
        sbF.append(this.l);
        sbF.append(", isBreak=");
        defpackage.c.j(sbF, this.m, ", hasCourseOfPlay=", this.n, ", tabloStats=");
        sbF.append(this.o);
        sbF.append(", statistic=");
        sbF.append(this.p);
        sbF.append(", fullScoreDetail=");
        sbF.append(this.q);
        sbF.append(", periodsCount=");
        sbF.append(this.r);
        sbF.append(", points=");
        sbF.append(this.s);
        sbF.append(", gameStatus=");
        sbF.append(this.t);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
