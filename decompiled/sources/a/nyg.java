package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nyg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24328a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final String f;
    public final long g;
    public final int h;
    public final long i;
    public final String j;
    public final int k;
    public final long l;
    public final boolean m;
    public final String n;

    public nyg(int i, int i2, int i3, int i4, long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        str3.getClass();
        this.f24328a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = str3;
        this.g = j;
        this.h = i3;
        this.i = j2;
        this.j = str4;
        this.k = i4;
        this.l = j3;
        this.m = z2;
        this.n = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyg)) {
            return false;
        }
        nyg nygVar = (nyg) obj;
        return this.f24328a.equals(nygVar.f24328a) && this.b.equals(nygVar.b) && this.c == nygVar.c && this.d == nygVar.d && this.e == nygVar.e && Intrinsics.d(this.f, nygVar.f) && this.g == nygVar.g && this.h == nygVar.h && this.i == nygVar.i && this.j.equals(nygVar.j) && this.k == nygVar.k && this.l == nygVar.l && this.m == nygVar.m && this.n.equals(nygVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + brm0.e(rw2.b(twn.a(this.k, ua80.b(rw2.b(twn.a(this.h, rw2.b(ua80.b(brm0.e(twn.a(this.d, twn.a(this.c, ua80.b(this.f24328a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberGamesChampsModel(champImageUrl=", this.f24328a, ", champImageUrlTablet=", this.b, ", countryId=");
        axq.r(this.c, this.d, ", gamesCount=", ", topChamp=", sbN);
        f140.s(", champName=", this.f, ", champId=", sbN, this.e);
        ua80.v(sbN, this.g, ", globalChampId=", this.h);
        kng0.A(sbN, ", sportId=", this.i, ", sportName=");
        twn.w(this.k, this.j, ", maxTopChamps=", ", subSportId=", sbN);
        hne.t(this.l, ", live=", sbN, this.m);
        return rw2.o(sbN, ", sportIcon=", this.n, Separators.RPAREN);
    }
}
