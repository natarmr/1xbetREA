package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class onr0 {
    public static final a8z[] A;
    public static final gnr0 Companion = new gnr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25561a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final String h;
    public final String i;
    public final Long j;
    public final List k;
    public final Double l;
    public final List m;
    public final List n;
    public final Long o;
    public final Integer p;
    public final Long q;
    public final Long r;
    public final String s;
    public final String t;
    public final Long u;
    public final Long v;
    public final Long w;
    public final Long x;
    public final Integer y;
    public final mnr0 z;

    static {
        wez wezVar = wez.f39042a;
        A = new a8z[]{null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new dfr0((byte) 14)), null, maz.a(wezVar, new dfr0((byte) 16)), maz.a(wezVar, new dfr0((byte) 17)), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ onr0(int i, Long l, Long l2, String str, String str2, String str3, Long l3, Long l4, String str4, String str5, Long l5, List list, Double d, List list2, List list3, Long l6, Integer num, Long l7, Long l8, String str6, String str7, Long l9, Long l10, Long l11, Long l12, Integer num2, mnr0 mnr0Var) {
        if ((i & 1) == 0) {
            this.f25561a = null;
        } else {
            this.f25561a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = d;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list3;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l7;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l8;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str6;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str7;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = l9;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = l10;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = l11;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = l12;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = num2;
        }
        if ((i & 33554432) == 0) {
            this.z = null;
        } else {
            this.z = mnr0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onr0)) {
            return false;
        }
        onr0 onr0Var = (onr0) obj;
        return Intrinsics.d(this.f25561a, onr0Var.f25561a) && Intrinsics.d(this.b, onr0Var.b) && Intrinsics.d(this.c, onr0Var.c) && Intrinsics.d(this.d, onr0Var.d) && Intrinsics.d(this.e, onr0Var.e) && Intrinsics.d(this.f, onr0Var.f) && Intrinsics.d(this.g, onr0Var.g) && Intrinsics.d(this.h, onr0Var.h) && Intrinsics.d(this.i, onr0Var.i) && Intrinsics.d(this.j, onr0Var.j) && Intrinsics.d(this.k, onr0Var.k) && Intrinsics.d(this.l, onr0Var.l) && Intrinsics.d(this.m, onr0Var.m) && Intrinsics.d(this.n, onr0Var.n) && Intrinsics.d(this.o, onr0Var.o) && Intrinsics.d(this.p, onr0Var.p) && Intrinsics.d(this.q, onr0Var.q) && Intrinsics.d(this.r, onr0Var.r) && Intrinsics.d(this.s, onr0Var.s) && Intrinsics.d(this.t, onr0Var.t) && Intrinsics.d(this.u, onr0Var.u) && Intrinsics.d(this.v, onr0Var.v) && Intrinsics.d(this.w, onr0Var.w) && Intrinsics.d(this.x, onr0Var.x) && Intrinsics.d(this.y, onr0Var.y) && Intrinsics.d(this.z, onr0Var.z);
    }

    public final int hashCode() {
        Long l = this.f25561a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l5 = this.j;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List list = this.k;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.l;
        int iHashCode12 = (iHashCode11 + (d == null ? 0 : d.hashCode())) * 31;
        List list2 = this.m;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.n;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l6 = this.o;
        int iHashCode15 = (iHashCode14 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num = this.p;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Long l7 = this.q;
        int iHashCode17 = (iHashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.r;
        int iHashCode18 = (iHashCode17 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str6 = this.s;
        int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.t;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l9 = this.u;
        int iHashCode21 = (iHashCode20 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.v;
        int iHashCode22 = (iHashCode21 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.w;
        int iHashCode23 = (iHashCode22 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.x;
        int iHashCode24 = (iHashCode23 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num2 = this.y;
        int iHashCode25 = (iHashCode24 + (num2 == null ? 0 : num2.hashCode())) * 31;
        mnr0 mnr0Var = this.z;
        return iHashCode25 + (mnr0Var != null ? mnr0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f25561a, this.b, "TotoGameResponse(gameNumber=", ", startDate=", ", gameName=");
        f140.v(sbO, this.c, ", periodName=", this.d, ", score=");
        h97.w(this.f, this.e, ", sportID=", ", bukGameID=", sbO);
        rz4.v(this.g, ", opponent1Name=", this.h, ", opponent2Name=", sbO);
        h97.w(this.j, this.i, ", period=", ", betsPercents=", sbO);
        sbO.append(this.k);
        sbO.append(", total=");
        sbO.append(this.l);
        sbO.append(", chosenOutcomes=");
        b1j.y(", chosenOutcomesTitle=", ", eventResults=", sbO, this.m, this.n);
        brm0.A(this.p, this.o, ", userEventResult=", ", opponentClId1=", sbO);
        cs0.A(sbO, this.q, ", opponentClId2=", this.r, ", opponentImg1=");
        f140.v(sbO, this.s, ", opponentImg2=", this.t, ", opponentCountryId1=");
        cs0.A(sbO, this.u, ", opponentCountryId2=", this.v, ", constID=");
        cs0.A(sbO, this.w, ", vidId=", this.x, ", typeId=");
        sbO.append(this.y);
        sbO.append(", eventParamsResponse=");
        sbO.append(this.z);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
