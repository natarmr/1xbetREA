package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d5h0 {
    public static final w3h0 Companion = new w3h0();
    public static final a8z[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5506a;
    public final List b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final szm0 h;
    public final String i;
    public final nnq0 j;
    public final tbr k;
    public final String l;
    public final Boolean m;
    public final Boolean n;
    public final Integer o;
    public final l5h0 p;
    public final Map q;
    public final iso r;
    public final Integer s;

    static {
        wez wezVar = wez.f39042a;
        t = new a8z[]{null, maz.a(wezVar, new yxg0((byte) 9)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new yxg0((byte) 11)), null, null};
    }

    public /* synthetic */ d5h0(int i, String str, List list, Integer num, String str2, Integer num2, Integer num3, Integer num4, szm0 szm0Var, String str3, nnq0 nnq0Var, tbr tbrVar, String str4, Boolean bool, Boolean bool2, Integer num5, l5h0 l5h0Var, Map map, iso isoVar, Integer num6) {
        if ((i & 1) == 0) {
            this.f5506a = null;
        } else {
            this.f5506a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = szm0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = nnq0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = tbrVar;
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
            this.o = num5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l5h0Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = map;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = isoVar;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5h0)) {
            return false;
        }
        d5h0 d5h0Var = (d5h0) obj;
        return Intrinsics.d(this.f5506a, d5h0Var.f5506a) && Intrinsics.d(this.b, d5h0Var.b) && Intrinsics.d(this.c, d5h0Var.c) && Intrinsics.d(this.d, d5h0Var.d) && Intrinsics.d(this.e, d5h0Var.e) && Intrinsics.d(this.f, d5h0Var.f) && Intrinsics.d(this.g, d5h0Var.g) && Intrinsics.d(this.h, d5h0Var.h) && Intrinsics.d(this.i, d5h0Var.i) && Intrinsics.d(this.j, d5h0Var.j) && Intrinsics.d(this.k, d5h0Var.k) && Intrinsics.d(this.l, d5h0Var.l) && Intrinsics.d(this.m, d5h0Var.m) && Intrinsics.d(this.n, d5h0Var.n) && Intrinsics.d(this.o, d5h0Var.o) && Intrinsics.d(this.p, d5h0Var.p) && Intrinsics.d(this.q, d5h0Var.q) && Intrinsics.d(this.r, d5h0Var.r) && Intrinsics.d(this.s, d5h0Var.s);
    }

    public final int hashCode() {
        String str = this.f5506a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        szm0 szm0Var = this.h;
        int iHashCode8 = (iHashCode7 + (szm0Var == null ? 0 : szm0Var.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        nnq0 nnq0Var = this.j;
        int iHashCode10 = (iHashCode9 + (nnq0Var == null ? 0 : nnq0Var.hashCode())) * 31;
        tbr tbrVar = this.k;
        int iHashCode11 = (iHashCode10 + (tbrVar == null ? 0 : tbrVar.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.o;
        int iHashCode15 = (iHashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        l5h0 l5h0Var = this.p;
        int iHashCode16 = (iHashCode15 + (l5h0Var == null ? 0 : l5h0Var.hashCode())) * 31;
        Map map = this.q;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        iso isoVar = this.r;
        int iHashCode18 = (iHashCode17 + (isoVar == null ? 0 : isoVar.hashCode())) * 31;
        Integer num6 = this.s;
        return iHashCode18 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("ScoreResponse(fullScore=", this.f5506a, ", periodScores=", this.b, ", currentPeriod=");
        b1j.u(this.c, ", currentPeriodName=", this.d, ", scoreOpp1=", sbF);
        rz4.y(sbF, this.e, ", scoreOpp2=", this.f, ", serve=");
        sbF.append(this.g);
        sbF.append(", subScore=");
        sbF.append(this.h);
        sbF.append(", periodScoresStr=");
        sbF.append(this.i);
        sbF.append(", timer=");
        sbF.append(this.j);
        sbF.append(", fullScoreDetail=");
        sbF.append(this.k);
        sbF.append(", info=");
        sbF.append(this.l);
        sbF.append(", isBreak=");
        defpackage.c.j(sbF, this.m, ", hasCourseOfPlay=", this.n, ", periodsCount=");
        sbF.append(this.o);
        sbF.append(", statistic=");
        sbF.append(this.p);
        sbF.append(", tabloStats=");
        sbF.append(this.q);
        sbF.append(", extendedScore=");
        sbF.append(this.r);
        sbF.append(", gameStatus=");
        return dw9.q(sbF, this.s, Separators.RPAREN);
    }
}
