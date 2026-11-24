package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dkr0 {
    public static final a8z[] A;
    public static final ckr0 Companion = new ckr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6247a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Integer h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final Double m;
    public final List n;
    public final Long o;
    public final Integer p;
    public final Long q;
    public final Long r;
    public final String s;
    public final String t;
    public final Integer u;
    public final Long v;
    public final Long w;
    public final Long x;
    public final Long y;
    public final Long z;

    static {
        wez wezVar = wez.f39042a;
        A = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new dfr0((byte) 5)), null, maz.a(wezVar, new dfr0((byte) 6)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ dkr0(int i, Integer num, Long l, Long l2, String str, String str2, String str3, Long l3, Integer num2, String str4, String str5, String str6, List list, Double d, List list2, Long l4, Integer num3, Long l5, Long l6, String str7, String str8, Integer num4, Long l7, Long l8, Long l9, Long l10, Long l11) {
        if ((i & 1) == 0) {
            this.f6247a = null;
        } else {
            this.f6247a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = d;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l5;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l6;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str7;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str8;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = num4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = l7;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = l8;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = l9;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = l10;
        }
        if ((i & 33554432) == 0) {
            this.z = null;
        } else {
            this.z = l11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkr0)) {
            return false;
        }
        dkr0 dkr0Var = (dkr0) obj;
        return Intrinsics.d(this.f6247a, dkr0Var.f6247a) && Intrinsics.d(this.b, dkr0Var.b) && Intrinsics.d(this.c, dkr0Var.c) && Intrinsics.d(this.d, dkr0Var.d) && Intrinsics.d(this.e, dkr0Var.e) && Intrinsics.d(this.f, dkr0Var.f) && Intrinsics.d(this.g, dkr0Var.g) && Intrinsics.d(this.h, dkr0Var.h) && Intrinsics.d(this.i, dkr0Var.i) && Intrinsics.d(this.j, dkr0Var.j) && Intrinsics.d(this.k, dkr0Var.k) && Intrinsics.d(this.l, dkr0Var.l) && Intrinsics.d(this.m, dkr0Var.m) && Intrinsics.d(this.n, dkr0Var.n) && Intrinsics.d(this.o, dkr0Var.o) && Intrinsics.d(this.p, dkr0Var.p) && Intrinsics.d(this.q, dkr0Var.q) && Intrinsics.d(this.r, dkr0Var.r) && Intrinsics.d(this.s, dkr0Var.s) && Intrinsics.d(this.t, dkr0Var.t) && Intrinsics.d(this.u, dkr0Var.u) && Intrinsics.d(this.v, dkr0Var.v) && Intrinsics.d(this.w, dkr0Var.w) && Intrinsics.d(this.x, dkr0Var.x) && Intrinsics.d(this.y, dkr0Var.y) && Intrinsics.d(this.z, dkr0Var.z);
    }

    public final int hashCode() {
        Integer num = this.f6247a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.l;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.m;
        int iHashCode13 = (iHashCode12 + (d == null ? 0 : d.hashCode())) * 31;
        List list2 = this.n;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l4 = this.o;
        int iHashCode15 = (iHashCode14 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num3 = this.p;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l5 = this.q;
        int iHashCode17 = (iHashCode16 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.r;
        int iHashCode18 = (iHashCode17 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str7 = this.s;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.t;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.u;
        int iHashCode21 = (iHashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l7 = this.v;
        int iHashCode22 = (iHashCode21 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.w;
        int iHashCode23 = (iHashCode22 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.x;
        int iHashCode24 = (iHashCode23 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.y;
        int iHashCode25 = (iHashCode24 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.z;
        return iHashCode25 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f6247a, this.b, "TotoBetGameResponse(gameNumber=", ", startDate=", ", champId=");
        rz4.v(this.c, ", champName=", this.d, ", gameName=", sbM);
        f140.v(sbM, this.e, ", score=", this.f, ", sportId=");
        brm0.A(this.h, this.g, ", bukGameId=", ", opponent1Name=", sbM);
        f140.v(sbM, this.i, ", opponent2Name=", this.j, ", period=");
        cs0.y(this.k, ", betsPercents=", ", total=", sbM, this.l);
        sbM.append(this.m);
        sbM.append(", chosenOutcomes=");
        sbM.append(this.n);
        sbM.append(", eventResults=");
        brm0.A(this.p, this.o, ", userEventResult=", ", opponentClId1=", sbM);
        cs0.A(sbM, this.q, ", opponentClId2=", this.r, ", opponentImg1=");
        f140.v(sbM, this.s, ", opponentImg2=", this.t, ", champCountryId=");
        cs0.w(this.u, this.v, ", opponentCountryId1=", ", opponentCountryId2=", sbM);
        cs0.A(sbM, this.w, ", constId=", this.x, ", vidId=");
        sbM.append(this.y);
        sbM.append(", typeId=");
        sbM.append(this.z);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
