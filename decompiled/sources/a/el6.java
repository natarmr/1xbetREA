package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class el6 {
    public static final dl6 Companion = new dl6();
    public static final a8z[] y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7982a;
    public final List b;
    public final hh6 c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final xl6 h;
    public final Integer i;
    public final String j;
    public final gm6 k;
    public final String l;
    public final Boolean m;
    public final Boolean n;
    public final Map o;
    public final kh6 p;
    public final Integer q;
    public final kh6 r;
    public final rk6 s;
    public final ul6 t;
    public final String u;
    public final Integer v;
    public final Integer w;
    public final List x;

    static {
        wez wezVar = wez.f39042a;
        y = new a8z[]{null, maz.a(wezVar, new lg6((byte) 6)), null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new lg6((byte) 7)), null, null, null, null, null, null, null, null, maz.a(wezVar, new lg6((byte) 8))};
    }

    public /* synthetic */ el6(int i, String str, List list, hh6 hh6Var, Integer num, String str2, Integer num2, Integer num3, xl6 xl6Var, Integer num4, String str3, gm6 gm6Var, String str4, Boolean bool, Boolean bool2, Map map, kh6 kh6Var, Integer num5, kh6 kh6Var2, rk6 rk6Var, ul6 ul6Var, String str5, Integer num6, Integer num7, List list2) {
        if ((i & 1) == 0) {
            this.f7982a = null;
        } else {
            this.f7982a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hh6Var;
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
            this.h = xl6Var;
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
            this.k = gm6Var;
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
            this.p = kh6Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num5;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = kh6Var2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = rk6Var;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = ul6Var;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = str5;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = num6;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = num7;
        }
        if ((i & 8388608) == 0) {
            this.x = null;
        } else {
            this.x = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el6)) {
            return false;
        }
        el6 el6Var = (el6) obj;
        return Intrinsics.d(this.f7982a, el6Var.f7982a) && Intrinsics.d(this.b, el6Var.b) && Intrinsics.d(this.c, el6Var.c) && Intrinsics.d(this.d, el6Var.d) && Intrinsics.d(this.e, el6Var.e) && Intrinsics.d(this.f, el6Var.f) && Intrinsics.d(this.g, el6Var.g) && Intrinsics.d(this.h, el6Var.h) && Intrinsics.d(this.i, el6Var.i) && Intrinsics.d(this.j, el6Var.j) && Intrinsics.d(this.k, el6Var.k) && Intrinsics.d(this.l, el6Var.l) && Intrinsics.d(this.m, el6Var.m) && Intrinsics.d(this.n, el6Var.n) && Intrinsics.d(this.o, el6Var.o) && Intrinsics.d(this.p, el6Var.p) && Intrinsics.d(this.q, el6Var.q) && Intrinsics.d(this.r, el6Var.r) && Intrinsics.d(this.s, el6Var.s) && Intrinsics.d(this.t, el6Var.t) && Intrinsics.d(this.u, el6Var.u) && Intrinsics.d(this.v, el6Var.v) && Intrinsics.d(this.w, el6Var.w) && Intrinsics.d(this.x, el6Var.x);
    }

    public final int hashCode() {
        String str = this.f7982a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        hh6 hh6Var = this.c;
        int iHashCode3 = (iHashCode2 + (hh6Var == null ? 0 : hh6Var.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        xl6 xl6Var = this.h;
        int iHashCode8 = (iHashCode7 + (xl6Var == null ? 0 : xl6Var.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        gm6 gm6Var = this.k;
        int iHashCode11 = (iHashCode10 + (gm6Var == null ? 0 : gm6Var.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map map = this.o;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        kh6 kh6Var = this.p;
        int iHashCode16 = (iHashCode15 + (kh6Var == null ? 0 : kh6Var.hashCode())) * 31;
        Integer num5 = this.q;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        kh6 kh6Var2 = this.r;
        int iHashCode18 = (iHashCode17 + (kh6Var2 == null ? 0 : kh6Var2.hashCode())) * 31;
        rk6 rk6Var = this.s;
        int iHashCode19 = (iHashCode18 + (rk6Var == null ? 0 : rk6Var.hashCode())) * 31;
        ul6 ul6Var = this.t;
        int iHashCode20 = (iHashCode19 + (ul6Var == null ? 0 : ul6Var.hashCode())) * 31;
        String str5 = this.u;
        int iHashCode21 = (iHashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num6 = this.v;
        int iHashCode22 = (iHashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.w;
        int iHashCode23 = (iHashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List list2 = this.x;
        return iHashCode23 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("BetBuilderScoreResponse(fullScore=", this.f7982a, ", periodScores=", this.b, ", extendedScore=");
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
        sbF.append(", fullScoreDetail=");
        sbF.append(this.p);
        sbF.append(", periodsCount=");
        sbF.append(this.q);
        sbF.append(", points=");
        sbF.append(this.r);
        sbF.append(", penalty=");
        sbF.append(this.s);
        sbF.append(", statistic=");
        sbF.append(this.t);
        sbF.append(", statusLineStr=");
        axq.x(this.v, this.u, ", stageTime=", ", gameStatus=", sbF);
        sbF.append(this.w);
        sbF.append(", inningsStat=");
        sbF.append(this.x);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
