package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vqj0 {
    public static final uqj0 Companion = new uqj0();
    public static final a8z[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37858a;
    public final List b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Long k;
    public final Integer l;
    public final Integer m;
    public final List n;
    public final Integer o;
    public final List p;
    public final String q;
    public final Long r;
    public final Long s;
    public final String t;
    public final String u;

    static {
        wez wezVar = wez.f39042a;
        v = new a8z[]{null, maz.a(wezVar, new hwi0((byte) 14)), null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new hwi0((byte) 15)), null, maz.a(wezVar, new hwi0((byte) 16)), null, null, null, null, null};
    }

    public /* synthetic */ vqj0(int i, String str, List list, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Integer num7, Integer num8, List list2, Integer num9, List list3, String str4, Long l2, Long l3, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f37858a = null;
        } else {
            this.f37858a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
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
            this.h = num4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num8;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num9;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str4;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l3;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str5;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqj0)) {
            return false;
        }
        vqj0 vqj0Var = (vqj0) obj;
        return Intrinsics.d(this.f37858a, vqj0Var.f37858a) && Intrinsics.d(this.b, vqj0Var.b) && Intrinsics.d(this.c, vqj0Var.c) && Intrinsics.d(this.d, vqj0Var.d) && Intrinsics.d(this.e, vqj0Var.e) && Intrinsics.d(this.f, vqj0Var.f) && Intrinsics.d(this.g, vqj0Var.g) && Intrinsics.d(this.h, vqj0Var.h) && Intrinsics.d(this.i, vqj0Var.i) && Intrinsics.d(this.j, vqj0Var.j) && Intrinsics.d(this.k, vqj0Var.k) && Intrinsics.d(this.l, vqj0Var.l) && Intrinsics.d(this.m, vqj0Var.m) && Intrinsics.d(this.n, vqj0Var.n) && Intrinsics.d(this.o, vqj0Var.o) && Intrinsics.d(this.p, vqj0Var.p) && Intrinsics.d(this.q, vqj0Var.q) && Intrinsics.d(this.r, vqj0Var.r) && Intrinsics.d(this.s, vqj0Var.s) && Intrinsics.d(this.t, vqj0Var.t) && Intrinsics.d(this.u, vqj0Var.u);
    }

    public final int hashCode() {
        String str = this.f37858a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.k;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num7 = this.l;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.m;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List list2 = this.n;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num9 = this.o;
        int iHashCode15 = (iHashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        List list3 = this.p;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.q;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.r;
        int iHashCode18 = (iHashCode17 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.s;
        int iHashCode19 = (iHashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.t;
        int iHashCode20 = (iHashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.u;
        return iHashCode20 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("ShortGameInfoResponse(id=", this.f37858a, ", gameStatistics=", this.b, ", team1=");
        f140.v(sbF, this.c, ", team2=", this.d, ", score1=");
        rz4.y(sbF, this.e, ", score2=", this.f, ", subScore1=");
        rz4.y(sbF, this.g, ", subScore2=", this.h, ", redCards1=");
        rz4.y(sbF, this.i, ", redCards2=", this.j, ", dateStart=");
        brm0.A(this.l, this.k, ", status=", ", subStatus=", sbF);
        cs0.z(sbF, this.m, ", referees=", this.n, ", winner=");
        cs0.z(sbF, this.o, ", periods=", this.p, ", tournamentTitle=");
        h97.w(this.r, this.q, ", champId=", ", globalChampId=", sbF);
        rz4.v(this.s, ", stringScore1=", this.t, ", stringScore2=", sbF);
        return axq.n(sbF, this.u, Separators.RPAREN);
    }
}
