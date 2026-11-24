package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class i8h {
    public static final h8h Companion = new h8h();
    public static final a8z[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f14337a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;

    static {
        wez wezVar = wez.f39042a;
        q = new a8z[]{null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new x3h((byte) 15)), maz.a(wezVar, new x3h((byte) 16)), maz.a(wezVar, new x3h((byte) 17)), maz.a(wezVar, new x3h((byte) 18)), maz.a(wezVar, new x3h((byte) 19))};
    }

    public /* synthetic */ i8h(int i, Long l, String str, String str2, Long l2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, List list2, List list3, List list4, List list5) {
        if ((i & 1) == 0) {
            this.f14337a = null;
        } else {
            this.f14337a = l;
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
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
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
            this.l = list;
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
            this.o = list4;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8h)) {
            return false;
        }
        i8h i8hVar = (i8h) obj;
        return Intrinsics.d(this.f14337a, i8hVar.f14337a) && Intrinsics.d(this.b, i8hVar.b) && Intrinsics.d(this.c, i8hVar.c) && Intrinsics.d(this.d, i8hVar.d) && Intrinsics.d(this.e, i8hVar.e) && Intrinsics.d(this.f, i8hVar.f) && Intrinsics.d(this.g, i8hVar.g) && Intrinsics.d(this.h, i8hVar.h) && Intrinsics.d(this.i, i8hVar.i) && Intrinsics.d(this.j, i8hVar.j) && Intrinsics.d(this.k, i8hVar.k) && Intrinsics.d(this.l, i8hVar.l) && Intrinsics.d(this.m, i8hVar.m) && Intrinsics.d(this.n, i8hVar.n) && Intrinsics.d(this.o, i8hVar.o) && Intrinsics.d(this.p, i8hVar.p);
    }

    public final int hashCode() {
        Long l = this.f14337a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
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
        List list = this.l;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.m;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.n;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.o;
        int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.p;
        return iHashCode15 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f14337a, "CyberMatchTeamPlayerResponse(id=", ", name=", this.b, ", image=");
        h97.w(this.d, this.c, ", heroId=", ", heroName=", sbS);
        f140.v(sbS, this.e, ", heroImage=", this.f, ", gpm=");
        rz4.y(sbS, this.g, ", xpm=", this.h, ", kills=");
        rz4.y(sbS, this.i, ", deaths=", this.j, ", assists=");
        cs0.z(sbS, this.k, ", items=", this.l, ", abilities=");
        b1j.y(", neutralItems=", ", supportItems=", sbS, this.m, this.n);
        return kng0.n(", killTargets=", Separators.RPAREN, sbS, this.o, this.p);
    }
}
