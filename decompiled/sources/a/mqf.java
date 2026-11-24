package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mqf {
    public static final lqf Companion = new lqf();
    public static final a8z[] r = {null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new dpf((byte) 2)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22222a;
    public final Float b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Float f;
    public final Integer g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final String k;
    public final Boolean l;
    public final Boolean m;
    public final Map n;
    public final Integer o;
    public final Integer p;
    public final Integer q;

    public /* synthetic */ mqf(int i, String str, Float f, Integer num, Integer num2, Integer num3, Float f2, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5, Map map, Integer num5, Integer num6, Integer num7) {
        if ((i & 1) == 0) {
            this.f22222a = null;
        } else {
            this.f22222a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = map;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num6;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = num7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqf)) {
            return false;
        }
        mqf mqfVar = (mqf) obj;
        return Intrinsics.d(this.f22222a, mqfVar.f22222a) && Intrinsics.d(this.b, mqfVar.b) && Intrinsics.d(this.c, mqfVar.c) && Intrinsics.d(this.d, mqfVar.d) && Intrinsics.d(this.e, mqfVar.e) && Intrinsics.d(this.f, mqfVar.f) && Intrinsics.d(this.g, mqfVar.g) && Intrinsics.d(this.h, mqfVar.h) && Intrinsics.d(this.i, mqfVar.i) && Intrinsics.d(this.j, mqfVar.j) && Intrinsics.d(this.k, mqfVar.k) && Intrinsics.d(this.l, mqfVar.l) && Intrinsics.d(this.m, mqfVar.m) && Intrinsics.d(this.n, mqfVar.n) && Intrinsics.d(this.o, mqfVar.o) && Intrinsics.d(this.p, mqfVar.p) && Intrinsics.d(this.q, mqfVar.q);
    }

    public final int hashCode() {
        String str = this.f22222a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f2 = this.f;
        int iHashCode6 = (iHashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.l;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.m;
        int iHashCode13 = (iHashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Map map = this.n;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num5 = this.o;
        int iHashCode15 = (iHashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.p;
        int iHashCode16 = (iHashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.q;
        return iHashCode16 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2PlayerStatisticResponse(playerName=");
        sb.append(this.f22222a);
        sb.append(", countMoney=");
        sb.append(this.b);
        sb.append(", countKills=");
        rz4.y(sb, this.c, ", countAssists=", this.d, ", countDeaths=");
        sb.append(this.e);
        sb.append(", playerRating=");
        sb.append(this.f);
        sb.append(", playerHealth=");
        brm0.z(this.h, this.g, ", hasHelmet=", ", hasKevlar=", sb);
        defpackage.c.j(sb, this.i, ", hasDefuse=", this.j, ", weaponName=");
        h97.v(this.l, this.k, ", hasBomb=", ", alive=", sb);
        sb.append(this.m);
        sb.append(", grenades=");
        sb.append(this.n);
        sb.append(", xPosition=");
        rz4.y(sb, this.o, ", yPosition=", this.p, ", zPosition=");
        return dw9.q(sb, this.q, Separators.RPAREN);
    }
}
