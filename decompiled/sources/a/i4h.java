package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class i4h {
    public static final h4h Companion = new h4h();
    public static final a8z[] r = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new x3h(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f14145a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Float h;
    public final Float i;
    public final Float j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final Integer o;
    public final Integer p;
    public final List q;

    public /* synthetic */ i4h(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, Float f, Float f2, Float f3, Integer num, Integer num2, String str7, String str8, Integer num3, Integer num4, List list) {
        if ((i & 1) == 0) {
            this.f14145a = null;
        } else {
            this.f14145a = l;
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
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = f2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num3;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num4;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4h)) {
            return false;
        }
        i4h i4hVar = (i4h) obj;
        return Intrinsics.d(this.f14145a, i4hVar.f14145a) && Intrinsics.d(this.b, i4hVar.b) && Intrinsics.d(this.c, i4hVar.c) && Intrinsics.d(this.d, i4hVar.d) && Intrinsics.d(this.e, i4hVar.e) && Intrinsics.d(this.f, i4hVar.f) && Intrinsics.d(this.g, i4hVar.g) && Intrinsics.d(this.h, i4hVar.h) && Intrinsics.d(this.i, i4hVar.i) && Intrinsics.d(this.j, i4hVar.j) && Intrinsics.d(this.k, i4hVar.k) && Intrinsics.d(this.l, i4hVar.l) && Intrinsics.d(this.m, i4hVar.m) && Intrinsics.d(this.n, i4hVar.n) && Intrinsics.d(this.o, i4hVar.o) && Intrinsics.d(this.p, i4hVar.p) && Intrinsics.d(this.q, i4hVar.q);
    }

    public final int hashCode() {
        Long l = this.f14145a;
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
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.h;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.i;
        int iHashCode9 = (iHashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.j;
        int iHashCode10 = (iHashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.o;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.p;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.q;
        return iHashCode16 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f14145a, "CyberLolPlayersResponse(id=", ", type=", this.b, ", name=");
        f140.v(sbS, this.c, ", realName=", this.d, ", country=");
        f140.v(sbS, this.e, ", countryImageS3=", this.f, ", role=");
        sbS.append(this.g);
        sbS.append(", kda=");
        sbS.append(this.h);
        sbS.append(", kp=");
        vqd.x(sbS, this.i, ", vspm=", this.j, ", dmg=");
        rz4.y(sbS, this.k, ", gold=", this.l, ", image=");
        f140.v(sbS, this.m, ", playerImageS3=", this.n, ", wins=");
        rz4.y(sbS, this.o, ", loses=", this.p, ", heroes=");
        return dw9.r(sbS, this.q, Separators.RPAREN);
    }
}
