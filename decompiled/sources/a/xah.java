package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40554a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final long g;
    public final int h;
    public final long i;
    public final String j;
    public final long k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public xah(int i, int i2, int i3, int i4, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        str3.getClass();
        this.f40554a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = j;
        this.h = i4;
        this.i = j2;
        this.j = str4;
        this.k = j3;
        this.l = str5;
        this.m = z;
        this.n = z2;
    }

    public static xah a(xah xahVar, String str, String str2, String str3, boolean z, int i) {
        String str4 = (i & 1) != 0 ? xahVar.f40554a : str;
        String str5 = (i & 2) != 0 ? xahVar.b : str2;
        int i2 = xahVar.c;
        int i3 = xahVar.d;
        int i4 = xahVar.e;
        String str6 = xahVar.f;
        long j = xahVar.g;
        int i5 = xahVar.h;
        long j2 = xahVar.i;
        String str7 = xahVar.j;
        long j3 = xahVar.k;
        String str8 = (i & 8192) != 0 ? xahVar.l : str3;
        boolean z2 = (i & 16384) != 0 ? xahVar.m : z;
        boolean z3 = xahVar.n;
        str6.getClass();
        return new xah(i2, i3, i4, i5, j, j2, j3, str4, str5, str6, str7, str8, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xah)) {
            return false;
        }
        xah xahVar = (xah) obj;
        return this.f40554a.equals(xahVar.f40554a) && this.b.equals(xahVar.b) && this.c == xahVar.c && this.d == xahVar.d && this.e == xahVar.e && Intrinsics.d(this.f, xahVar.f) && this.g == xahVar.g && this.h == xahVar.h && this.i == xahVar.i && this.j.equals(xahVar.j) && this.k == xahVar.k && this.l.equals(xahVar.l) && this.m == xahVar.m && this.n == xahVar.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + brm0.e(ua80.b(rw2.b(twn.a(2, ua80.b(rw2.b(twn.a(this.h, rw2.b(ua80.b(brm0.e(twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f40554a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, true), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberRealTopChampsModel(champImageUrl=", this.f40554a, ", champImageUrlTablet=", this.b, ", countryId=");
        axq.r(this.c, this.d, ", liveGamesCount=", ", lineGamesCount=", sbN);
        kng0.w(this.e, ", topChamp=true, champName=", this.f, ", champId=", sbN);
        ua80.v(sbN, this.g, ", globalChampId=", this.h);
        kng0.A(sbN, ", sportId=", this.i, ", sportName=");
        defpackage.c.i(sbN, this.k, this.j, ", maxTopChamps=2, subSportId=");
        w6x.z(", sportIcon=", this.l, ", favourite=", sbN, this.m);
        return f140.n(sbN, ", live=", this.n, Separators.RPAREN);
    }
}
