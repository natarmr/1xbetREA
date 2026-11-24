package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class lv10 {
    public static final kv10 Companion = new kv10();
    public static final a8z[] u = {null, maz.a(wez.f39042a, new gf10(29)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20700a;
    public final List b;
    public final hso c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final qzm0 h;
    public final Integer i;
    public final String j;
    public final pnq0 k;
    public final String l;
    public final Boolean m;
    public final Boolean n;
    public final sbr o;
    public final Integer p;
    public final String q;
    public final Integer r;
    public final Integer s;
    public final vfm0 t;

    public /* synthetic */ lv10(int i, String str, List list, hso hsoVar, Integer num, String str2, Integer num2, Integer num3, qzm0 qzm0Var, Integer num4, String str3, pnq0 pnq0Var, String str4, Boolean bool, Boolean bool2, sbr sbrVar, Integer num5, String str5, Integer num6, Integer num7, vfm0 vfm0Var) {
        if ((i & 1) == 0) {
            this.f20700a = null;
        } else {
            this.f20700a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hsoVar;
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
            this.h = qzm0Var;
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
            this.k = pnq0Var;
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
            this.o = sbrVar;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num5;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str5;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num6;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = num7;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = vfm0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv10)) {
            return false;
        }
        lv10 lv10Var = (lv10) obj;
        return Intrinsics.d(this.f20700a, lv10Var.f20700a) && Intrinsics.d(this.b, lv10Var.b) && Intrinsics.d(this.c, lv10Var.c) && Intrinsics.d(this.d, lv10Var.d) && Intrinsics.d(this.e, lv10Var.e) && Intrinsics.d(this.f, lv10Var.f) && Intrinsics.d(this.g, lv10Var.g) && Intrinsics.d(this.h, lv10Var.h) && Intrinsics.d(this.i, lv10Var.i) && Intrinsics.d(this.j, lv10Var.j) && Intrinsics.d(this.k, lv10Var.k) && Intrinsics.d(this.l, lv10Var.l) && Intrinsics.d(this.m, lv10Var.m) && Intrinsics.d(this.n, lv10Var.n) && Intrinsics.d(this.o, lv10Var.o) && Intrinsics.d(this.p, lv10Var.p) && Intrinsics.d(this.q, lv10Var.q) && Intrinsics.d(this.r, lv10Var.r) && Intrinsics.d(this.s, lv10Var.s) && Intrinsics.d(this.t, lv10Var.t);
    }

    public final int hashCode() {
        String str = this.f20700a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        hso hsoVar = this.c;
        int iHashCode3 = (iHashCode2 + (hsoVar == null ? 0 : hsoVar.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        qzm0 qzm0Var = this.h;
        int iHashCode8 = (iHashCode7 + (qzm0Var == null ? 0 : qzm0Var.hashCode())) * 31;
        Integer num4 = this.i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        pnq0 pnq0Var = this.k;
        int iHashCode11 = (iHashCode10 + (pnq0Var == null ? 0 : pnq0Var.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        sbr sbrVar = this.o;
        int iHashCode15 = (iHashCode14 + (sbrVar == null ? 0 : sbrVar.hashCode())) * 31;
        Integer num5 = this.p;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str5 = this.q;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num6 = this.r;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.s;
        int iHashCode19 = (iHashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31;
        vfm0 vfm0Var = this.t;
        return iHashCode19 + (vfm0Var != null ? vfm0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("MainGameScoresResponse(fullScore=", this.f20700a, ", periodScores=", this.b, ", extendedScore=");
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
        defpackage.c.j(sbF, this.m, ", hasCourseOfPlay=", this.n, ", fullScoreDetail=");
        sbF.append(this.o);
        sbF.append(", periodsCount=");
        sbF.append(this.p);
        sbF.append(", statusLineStr=");
        axq.x(this.r, this.q, ", stageTime=", ", gameStatus=", sbF);
        sbF.append(this.s);
        sbF.append(", statistic=");
        sbF.append(this.t);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
