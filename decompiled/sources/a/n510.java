package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class n510 {
    public static final m510 Companion = new m510();
    public static final a8z[] s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22921a;
    public final Long b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final List q;
    public final List r;

    static {
        wez wezVar = wez.f39042a;
        s = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new t010((byte) 16)), maz.a(wezVar, new t010((byte) 17))};
    }

    public /* synthetic */ n510(int i, Long l, Long l2, String str, String str2, Boolean bool, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, List list, List list2) {
        if ((i & 1) == 0) {
            this.f22921a = null;
        } else {
            this.f22921a = l;
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
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num9;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num10;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n510)) {
            return false;
        }
        n510 n510Var = (n510) obj;
        return Intrinsics.d(this.f22921a, n510Var.f22921a) && Intrinsics.d(this.b, n510Var.b) && Intrinsics.d(this.c, n510Var.c) && Intrinsics.d(this.d, n510Var.d) && Intrinsics.d(this.e, n510Var.e) && Intrinsics.d(this.f, n510Var.f) && Intrinsics.d(this.g, n510Var.g) && Intrinsics.d(this.h, n510Var.h) && Intrinsics.d(this.i, n510Var.i) && Intrinsics.d(this.j, n510Var.j) && Intrinsics.d(this.k, n510Var.k) && Intrinsics.d(this.l, n510Var.l) && Intrinsics.d(this.m, n510Var.m) && Intrinsics.d(this.n, n510Var.n) && Intrinsics.d(this.o, n510Var.o) && Intrinsics.d(this.p, n510Var.p) && Intrinsics.d(this.q, n510Var.q) && Intrinsics.d(this.r, n510Var.r);
    }

    public final int hashCode() {
        Long l = this.f22921a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.k;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.l;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.m;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.n;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.o;
        int iHashCode15 = (iHashCode14 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.p;
        int iHashCode16 = (iHashCode15 + (num10 == null ? 0 : num10.hashCode())) * 31;
        List list = this.q;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.r;
        return iHashCode17 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f22921a, this.b, "LolStatisticMatchesMatchTeamResponse(id=", ", feedId=", ", name=");
        f140.v(sbO, this.c, ", imageS3=", this.d, ", isWinner=");
        defpackage.c.h(this.e, ", side=", this.f, ", kills=", sbO);
        rz4.y(sbO, this.g, ", deaths=", this.h, ", assists=");
        rz4.y(sbO, this.i, ", elderDrakeKills=", this.j, ", towerKills=");
        rz4.y(sbO, this.k, ", inhibitorKills=", this.l, ", heraldKills=");
        rz4.y(sbO, this.m, ", baronKills=", this.n, ", dragonKills=");
        rz4.y(sbO, this.o, ", goldEarned=", this.p, ", bans=");
        return kng0.n(", players=", Separators.RPAREN, sbO, this.q, this.r);
    }
}
