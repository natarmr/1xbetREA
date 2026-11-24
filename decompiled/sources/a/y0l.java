package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class y0l {
    public static final x0l Companion = new x0l();
    public static final a8z[] t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41811a;
    public final String b;
    public final Integer c;
    public final List d;
    public final Integer e;
    public final Integer f;
    public final Double g;
    public final Boolean h;
    public final Double i;
    public final List j;
    public final List k;
    public final List l;
    public final Integer m;
    public final List n;
    public final rk10 o;
    public final Long p;
    public final Double q;
    public final Integer r;
    public final Double s;

    static {
        wez wezVar = wez.f39042a;
        t = new a8z[]{null, null, null, maz.a(wezVar, new rtj((byte) 16)), null, null, null, null, null, maz.a(wezVar, new rtj((byte) 17)), maz.a(wezVar, new rtj((byte) 18)), maz.a(wezVar, new rtj((byte) 19)), null, maz.a(wezVar, new rtj((byte) 20)), null, null, null, null, null};
    }

    public /* synthetic */ y0l(int i, Integer num, String str, Integer num2, List list, Integer num3, Integer num4, Double d, Boolean bool, Double d2, List list2, List list3, List list4, Integer num5, List list5, rk10 rk10Var, Long l, Double d3, Integer num6, Double d4) {
        if ((i & 1) == 0) {
            this.f41811a = null;
        } else {
            this.f41811a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = rk10Var;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = d3;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num6;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = d4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0l)) {
            return false;
        }
        y0l y0lVar = (y0l) obj;
        return Intrinsics.d(this.f41811a, y0lVar.f41811a) && Intrinsics.d(this.b, y0lVar.b) && Intrinsics.d(this.c, y0lVar.c) && Intrinsics.d(this.d, y0lVar.d) && Intrinsics.d(this.e, y0lVar.e) && Intrinsics.d(this.f, y0lVar.f) && Intrinsics.d(this.g, y0lVar.g) && Intrinsics.d(this.h, y0lVar.h) && Intrinsics.d(this.i, y0lVar.i) && Intrinsics.d(this.j, y0lVar.j) && Intrinsics.d(this.k, y0lVar.k) && Intrinsics.d(this.l, y0lVar.l) && Intrinsics.d(this.m, y0lVar.m) && Intrinsics.d(this.n, y0lVar.n) && Intrinsics.d(this.o, y0lVar.o) && Intrinsics.d(this.p, y0lVar.p) && Intrinsics.d(this.q, y0lVar.q) && Intrinsics.d(this.r, y0lVar.r) && Intrinsics.d(this.s, y0lVar.s);
    }

    public final int hashCode() {
        Integer num = this.f41811a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d = this.g;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d2 = this.i;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List list2 = this.j;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.k;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.l;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num5 = this.m;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list5 = this.n;
        int iHashCode14 = (iHashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        rk10 rk10Var = this.o;
        int iHashCode15 = (iHashCode14 + (rk10Var == null ? 0 : rk10Var.hashCode())) * 31;
        Long l = this.p;
        int iHashCode16 = (iHashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        Double d3 = this.q;
        int iHashCode17 = (iHashCode16 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num6 = this.r;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d4 = this.s;
        return iHashCode18 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f41811a, "DominoResponse(opponent=", ", gameId=", this.b, ", actionNumber=");
        cs0.z(sbN, this.c, ", playerBones=", this.d, ", gameStatus=");
        rz4.y(sbN, this.e, ", fish=", this.f, ", betSum=");
        sbN.append(this.g);
        sbN.append(", rC=");
        sbN.append(this.h);
        sbN.append(", winSum=");
        sbN.append(this.i);
        sbN.append(", firstDouble=");
        sbN.append(this.j);
        sbN.append(", endgeValues=");
        b1j.y(", bonesOnTable=", ", yourAction=", sbN, this.k, this.l);
        cs0.z(sbN, this.m, ", opponentBones=", this.n, ", bonusInfo=");
        sbN.append(this.o);
        sbN.append(", accountId=");
        sbN.append(this.p);
        sbN.append(", balanceNew=");
        sbN.append(this.q);
        sbN.append(", bonesTableCount=");
        sbN.append(this.r);
        sbN.append(", coeff=");
        sbN.append(this.s);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
