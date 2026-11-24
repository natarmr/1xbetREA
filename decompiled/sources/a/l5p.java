package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class l5p {
    public static final k5p Companion = new k5p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19469a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Long g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Boolean l;
    public final Long m;
    public final Boolean n;

    public /* synthetic */ l5p(int i, Long l, String str, Long l2, Long l3, String str2, String str3, Long l4, Boolean bool, Integer num, Integer num2, Boolean bool2, Boolean bool3, Long l5, Boolean bool4) {
        if ((i & 1) == 0) {
            this.f19469a = null;
        } else {
            this.f19469a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
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
            this.g = l4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5p)) {
            return false;
        }
        l5p l5pVar = (l5p) obj;
        return Intrinsics.d(this.f19469a, l5pVar.f19469a) && Intrinsics.d(this.b, l5pVar.b) && Intrinsics.d(this.c, l5pVar.c) && Intrinsics.d(this.d, l5pVar.d) && Intrinsics.d(this.e, l5pVar.e) && Intrinsics.d(this.f, l5pVar.f) && Intrinsics.d(this.g, l5pVar.g) && Intrinsics.d(this.h, l5pVar.h) && Intrinsics.d(this.i, l5pVar.i) && Intrinsics.d(this.j, l5pVar.j) && Intrinsics.d(this.k, l5pVar.k) && Intrinsics.d(this.l, l5pVar.l) && Intrinsics.d(this.m, l5pVar.m) && Intrinsics.d(this.n, l5pVar.n);
    }

    public final int hashCode() {
        Long l = this.f19469a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l5 = this.m;
        int iHashCode13 = (iHashCode12 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool4 = this.n;
        return iHashCode13 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f19469a, "FavoriteChampResponse(id=", ", name=", this.b, ", sportId=");
        cs0.A(sbS, this.c, ", subSportId=", this.d, ", sportName=");
        f140.v(sbS, this.e, ", image=", this.f, ", country=");
        sbS.append(this.g);
        sbS.append(", isCyber=");
        sbS.append(this.h);
        sbS.append(", cyberType=");
        rz4.y(sbS, this.i, ", gamesCount=", this.j, ", top=");
        defpackage.c.j(sbS, this.k, ", new=", this.l, ", globalChampId=");
        sbS.append(this.m);
        sbS.append(", hasLiveGame=");
        sbS.append(this.n);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
