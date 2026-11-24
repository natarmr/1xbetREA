package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class jch {
    public static final ich Companion = new ich();
    public static final a8z[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16276a;
    public final List b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final vgh h;
    public final String i;
    public final bih j;
    public final jog k;
    public final String l;
    public final Boolean m;
    public final Boolean n;
    public final Integer o;
    public final Long p;
    public final edy q;
    public final l5h0 r;
    public final Map s;

    static {
        wez wezVar = wez.f39042a;
        t = new a8z[]{null, maz.a(wezVar, new x3h((byte) 29)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new gch((byte) 0))};
    }

    public /* synthetic */ jch(int i, String str, List list, Integer num, String str2, Integer num2, Integer num3, Integer num4, vgh vghVar, String str3, bih bihVar, jog jogVar, String str4, Boolean bool, Boolean bool2, Integer num5, Long l, edy edyVar, l5h0 l5h0Var, Map map) {
        if ((i & 1) == 0) {
            this.f16276a = null;
        } else {
            this.f16276a = str;
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
            this.h = vghVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bihVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = jogVar;
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
            this.p = l;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = edyVar;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l5h0Var;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jch)) {
            return false;
        }
        jch jchVar = (jch) obj;
        return Intrinsics.d(this.f16276a, jchVar.f16276a) && Intrinsics.d(this.b, jchVar.b) && Intrinsics.d(this.c, jchVar.c) && Intrinsics.d(this.d, jchVar.d) && Intrinsics.d(this.e, jchVar.e) && Intrinsics.d(this.f, jchVar.f) && Intrinsics.d(this.g, jchVar.g) && Intrinsics.d(this.h, jchVar.h) && Intrinsics.d(this.i, jchVar.i) && Intrinsics.d(this.j, jchVar.j) && Intrinsics.d(this.k, jchVar.k) && Intrinsics.d(this.l, jchVar.l) && Intrinsics.d(this.m, jchVar.m) && Intrinsics.d(this.n, jchVar.n) && Intrinsics.d(this.o, jchVar.o) && Intrinsics.d(this.p, jchVar.p) && Intrinsics.d(this.q, jchVar.q) && Intrinsics.d(this.r, jchVar.r) && Intrinsics.d(this.s, jchVar.s);
    }

    public final int hashCode() {
        String str = this.f16276a;
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
        vgh vghVar = this.h;
        int iHashCode8 = (iHashCode7 + (vghVar == null ? 0 : vghVar.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        bih bihVar = this.j;
        int iHashCode10 = (iHashCode9 + (bihVar == null ? 0 : bihVar.hashCode())) * 31;
        jog jogVar = this.k;
        int iHashCode11 = (iHashCode10 + (jogVar == null ? 0 : jogVar.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.o;
        int iHashCode15 = (iHashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.p;
        int iHashCode16 = (iHashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        edy edyVar = this.q;
        int iHashCode17 = (iHashCode16 + (edyVar == null ? 0 : edyVar.f7643a.hashCode())) * 31;
        l5h0 l5h0Var = this.r;
        int iHashCode18 = (iHashCode17 + (l5h0Var == null ? 0 : l5h0Var.hashCode())) * 31;
        Map map = this.s;
        return iHashCode18 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("CyberScoreResponse(fullScore=", this.f16276a, ", periodScores=", this.b, ", currentPeriod=");
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
        cs0.w(this.o, this.p, ", stageTime=", ", statisticJson=", sbF);
        sbF.append(this.q);
        sbF.append(", statistic=");
        sbF.append(this.r);
        sbF.append(", tabloStats=");
        sbF.append(this.s);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
