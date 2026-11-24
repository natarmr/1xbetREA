package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class v410 {
    public static final u410 Companion = new u410();
    public static final a8z[] s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36757a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final List n;
    public final List o;
    public final k510 p;
    public final c510 q;
    public final c510 r;

    static {
        b510 b510Var = c510.Companion;
        wez wezVar = wez.f39042a;
        s = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new t010((byte) 13)), maz.a(wezVar, new t010((byte) 14)), null, null, null};
    }

    public /* synthetic */ v410(int i, Long l, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, List list, List list2, k510 k510Var, c510 c510Var, c510 c510Var2) {
        if ((i & 1) == 0) {
            this.f36757a = null;
        } else {
            this.f36757a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
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
            this.n = list;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list2;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = k510Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = c510Var;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = c510Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v410)) {
            return false;
        }
        v410 v410Var = (v410) obj;
        return Intrinsics.d(this.f36757a, v410Var.f36757a) && Intrinsics.d(this.b, v410Var.b) && Intrinsics.d(this.c, v410Var.c) && Intrinsics.d(this.d, v410Var.d) && Intrinsics.d(this.e, v410Var.e) && Intrinsics.d(this.f, v410Var.f) && Intrinsics.d(this.g, v410Var.g) && Intrinsics.d(this.h, v410Var.h) && Intrinsics.d(this.i, v410Var.i) && Intrinsics.d(this.j, v410Var.j) && Intrinsics.d(this.k, v410Var.k) && Intrinsics.d(this.l, v410Var.l) && Intrinsics.d(this.m, v410Var.m) && Intrinsics.d(this.n, v410Var.n) && Intrinsics.d(this.o, v410Var.o) && Intrinsics.d(this.p, v410Var.p) && Intrinsics.d(this.q, v410Var.q) && Intrinsics.d(this.r, v410Var.r);
    }

    public final int hashCode() {
        Long l = this.f36757a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
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
        List list = this.n;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.o;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k510 k510Var = this.p;
        int iHashCode16 = (iHashCode15 + (k510Var == null ? 0 : k510Var.hashCode())) * 31;
        c510 c510Var = this.q;
        int iHashCode17 = (iHashCode16 + (c510Var == null ? 0 : c510Var.hashCode())) * 31;
        c510 c510Var2 = this.r;
        return iHashCode17 + (c510Var2 != null ? c510Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f36757a, "LolStatisticMatchesMatchTeamPlayerResponse(id=", ", name=", this.b, ", imageS3=");
        f140.v(sbS, this.c, ", heroName=", this.d, ", heroImageS3=");
        f140.v(sbS, this.e, ", position=", this.f, ", level=");
        rz4.y(sbS, this.g, ", kills=", this.h, ", deaths=");
        rz4.y(sbS, this.i, ", assists=", this.j, ", totalDamageDealt=");
        rz4.y(sbS, this.k, ", totalDamageTaken=", this.l, ", minionsKilled=");
        cs0.z(sbS, this.m, ", spells=", this.n, ", items=");
        sbS.append(this.o);
        sbS.append(", trinket=");
        sbS.append(this.p);
        sbS.append(", primaryRunes=");
        sbS.append(this.q);
        sbS.append(", subRunes=");
        sbS.append(this.r);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
