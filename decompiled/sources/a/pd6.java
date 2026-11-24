package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pd6 {
    public static final od6 Companion = new od6();
    public static final a8z[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f26793a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final List i;
    public final String j;
    public final Long k;
    public final List l;
    public final String m;
    public final Boolean n;
    public final String o;
    public final Integer p;
    public final Integer q;

    static {
        wez wezVar = wez.f39042a;
        r = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new o85((byte) 26)), null, null, maz.a(wezVar, new o85((byte) 27)), null, null, null, null, null};
    }

    public /* synthetic */ pd6(int i, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, Long l5, List list, String str4, Long l6, List list2, String str5, Boolean bool, String str6, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f26793a = null;
        } else {
            this.f26793a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd6)) {
            return false;
        }
        pd6 pd6Var = (pd6) obj;
        return Intrinsics.d(this.f26793a, pd6Var.f26793a) && Intrinsics.d(this.b, pd6Var.b) && Intrinsics.d(this.c, pd6Var.c) && Intrinsics.d(this.d, pd6Var.d) && Intrinsics.d(this.e, pd6Var.e) && Intrinsics.d(this.f, pd6Var.f) && Intrinsics.d(this.g, pd6Var.g) && Intrinsics.d(this.h, pd6Var.h) && Intrinsics.d(this.i, pd6Var.i) && Intrinsics.d(this.j, pd6Var.j) && Intrinsics.d(this.k, pd6Var.k) && Intrinsics.d(this.l, pd6Var.l) && Intrinsics.d(this.m, pd6Var.m) && Intrinsics.d(this.n, pd6Var.n) && Intrinsics.d(this.o, pd6Var.o) && Intrinsics.d(this.p, pd6Var.p) && Intrinsics.d(this.q, pd6Var.q);
    }

    public final int hashCode() {
        Long l = this.f26793a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.h;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l6 = this.k;
        int iHashCode11 = (iHashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.p;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.q;
        return iHashCode16 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f26793a, this.b, "BetAlternativeInfoResponse(sport=", ", champId=", ", globalChampId=");
        cs0.A(sbO, this.c, ", gameId=", this.d, ", champImage=");
        f140.v(sbO, this.e, ", champName=", this.f, ", gameName=");
        h97.w(this.h, this.g, ", opp1Id=", ", opp1Images=", sbO);
        h97.y(", opp1Name=", this.j, ", opp2Id=", sbO, this.i);
        twn.z(sbO, this.k, ", opp2Images=", this.l, ", opp2Name=");
        h97.v(this.n, this.m, ", isFinished=", ", score=", sbO);
        axq.x(this.p, this.o, ", oppNumber=", ", teamNumber=", sbO);
        return dw9.q(sbO, this.q, Separators.RPAREN);
    }
}
