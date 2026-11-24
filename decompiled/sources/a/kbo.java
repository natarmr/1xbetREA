package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kbo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18023a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final List o;

    public kbo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, long j, int i, boolean z2, List list) {
        ohs0.z(str, str2, str3, str4, str7);
        str8.getClass();
        list.getClass();
        this.f18023a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = z;
        this.j = str9;
        this.k = str10;
        this.l = j;
        this.m = i;
        this.n = z2;
        this.o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbo)) {
            return false;
        }
        kbo kboVar = (kbo) obj;
        return Intrinsics.d(this.f18023a, kboVar.f18023a) && Intrinsics.d(this.b, kboVar.b) && Intrinsics.d(this.c, kboVar.c) && Intrinsics.d(this.d, kboVar.d) && this.e.equals(kboVar.e) && this.f.equals(kboVar.f) && Intrinsics.d(this.g, kboVar.g) && Intrinsics.d(this.h, kboVar.h) && this.i == kboVar.i && this.j.equals(kboVar.j) && this.k.equals(kboVar.k) && this.l == kboVar.l && this.m == kboVar.m && this.n == kboVar.n && Intrinsics.d(this.o, kboVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(twn.a(this.m, rw2.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f18023a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("EventCardModel(team1Name=", this.f18023a, ", team1Image=", this.b, ", team2Name=");
        f140.v(sbN, this.c, ", team2Image=", this.d, ", teamOneBottomImage=");
        f140.v(sbN, this.e, ", teamTwoBottomImage=", this.f, ", score1=");
        f140.v(sbN, this.g, ", score2=", this.h, ", scoreVs=");
        f140.s(", seeding1=", this.j, ", seeding2=", sbN, this.i);
        defpackage.c.i(sbN, this.l, this.k, ", dateStart=");
        dw9.v(this.m, ", winner=", ", is24HourFormat=", sbN, this.n);
        return ohs0.s(sbN, ", scores=", this.o, Separators.RPAREN);
    }
}
