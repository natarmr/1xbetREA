package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class u8n0 {
    public static final t8n0 Companion = new t8n0();
    public static final a8z[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35239a;
    public final List b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final iso h;
    public final q9n0 i;
    public final String j;
    public final dan0 k;
    public final o7n0 l;
    public final String m;
    public final Boolean n;
    public final Boolean o;
    public final Integer p;
    public final l5h0 q;
    public final Map r;
    public final String s;
    public final Integer t;

    static {
        j5h0 j5h0Var = l5h0.Companion;
        wez wezVar = wez.f39042a;
        u = new a8z[]{null, maz.a(wezVar, new a7n0((byte) 6)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new a7n0((byte) 7)), null, null};
    }

    public /* synthetic */ u8n0(int i, String str, List list, Integer num, String str2, Integer num2, Integer num3, Integer num4, iso isoVar, q9n0 q9n0Var, String str3, dan0 dan0Var, o7n0 o7n0Var, String str4, Boolean bool, Boolean bool2, Integer num5, l5h0 l5h0Var, Map map, String str5, Integer num6) {
        if ((i & 1) == 0) {
            this.f35239a = null;
        } else {
            this.f35239a = str;
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
            this.h = isoVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = q9n0Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = dan0Var;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = o7n0Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num5;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l5h0Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = map;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str5;
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
        if (!(obj instanceof u8n0)) {
            return false;
        }
        u8n0 u8n0Var = (u8n0) obj;
        return Intrinsics.d(this.f35239a, u8n0Var.f35239a) && Intrinsics.d(this.b, u8n0Var.b) && Intrinsics.d(this.c, u8n0Var.c) && Intrinsics.d(this.d, u8n0Var.d) && Intrinsics.d(this.e, u8n0Var.e) && Intrinsics.d(this.f, u8n0Var.f) && Intrinsics.d(this.g, u8n0Var.g) && Intrinsics.d(this.h, u8n0Var.h) && Intrinsics.d(this.i, u8n0Var.i) && Intrinsics.d(this.j, u8n0Var.j) && Intrinsics.d(this.k, u8n0Var.k) && Intrinsics.d(this.l, u8n0Var.l) && Intrinsics.d(this.m, u8n0Var.m) && Intrinsics.d(this.n, u8n0Var.n) && Intrinsics.d(this.o, u8n0Var.o) && Intrinsics.d(this.p, u8n0Var.p) && Intrinsics.d(this.q, u8n0Var.q) && Intrinsics.d(this.r, u8n0Var.r) && Intrinsics.d(this.s, u8n0Var.s) && Intrinsics.d(this.t, u8n0Var.t);
    }

    public final int hashCode() {
        String str = this.f35239a;
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
        iso isoVar = this.h;
        int iHashCode8 = (iHashCode7 + (isoVar == null ? 0 : isoVar.hashCode())) * 31;
        q9n0 q9n0Var = this.i;
        int iHashCode9 = (iHashCode8 + (q9n0Var == null ? 0 : q9n0Var.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dan0 dan0Var = this.k;
        int iHashCode11 = (iHashCode10 + (dan0Var == null ? 0 : dan0Var.hashCode())) * 31;
        o7n0 o7n0Var = this.l;
        int iHashCode12 = (iHashCode11 + (o7n0Var == null ? 0 : o7n0Var.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.o;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.p;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        l5h0 l5h0Var = this.q;
        int iHashCode17 = (iHashCode16 + (l5h0Var == null ? 0 : l5h0Var.hashCode())) * 31;
        Map map = this.r;
        int iHashCode18 = (iHashCode17 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.s;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num6 = this.t;
        return iHashCode19 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("SubscriptionScoresResponse(fullScore=", this.f35239a, ", periodScores=", this.b, ", currentPeriod=");
        b1j.u(this.c, ", currentPeriodName=", this.d, ", scoreOpp1=", sbF);
        rz4.y(sbF, this.e, ", scoreOpp2=", this.f, ", serve=");
        sbF.append(this.g);
        sbF.append(", extendedScore=");
        sbF.append(this.h);
        sbF.append(", subScore=");
        sbF.append(this.i);
        sbF.append(", periodScoresStr=");
        sbF.append(this.j);
        sbF.append(", timer=");
        sbF.append(this.k);
        sbF.append(", fullScoreDetail=");
        sbF.append(this.l);
        sbF.append(", info=");
        h97.v(this.n, this.m, ", isBreak=", ", hasCourseOfPlay=", sbF);
        h97.u(this.o, this.p, ", periodsCount=", ", statistic=", sbF);
        sbF.append(this.q);
        sbF.append(", tabloStats=");
        sbF.append(this.r);
        sbF.append(", statusLineStr=");
        return vqd.l(this.t, this.s, ", gameStatus=", Separators.RPAREN, sbF);
    }
}
