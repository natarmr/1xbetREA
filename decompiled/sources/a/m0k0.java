package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0k0 implements Serializable {
    public final boolean A;
    public final long B;
    public final long Y;
    public final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20959a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean f1;
    public final long g;
    public final boolean g1;
    public final String h;
    public final boolean h1;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final long w;
    public final boolean x;
    public final long y;
    public final long z;

    public m0k0(long j, String str, long j2, String str2, String str3, String str4, long j3, String str5, String str6, String str7, int i, String str8, int i2, int i3, String str9, String str10, int i4, int i5, String str11, String str12, String str13, String str14, long j4, boolean z, long j5, long j6, boolean z2, long j7, long j8, String str15, boolean z3, boolean z4, boolean z5) {
        ohs0.z(str, str2, str3, str5, str6);
        ohs0.z(str8, str11, str12, str13, str14);
        str15.getClass();
        this.f20959a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = j3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = i;
        this.l = str8;
        this.m = i2;
        this.n = i3;
        this.o = str9;
        this.p = str10;
        this.q = i4;
        this.r = i5;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = str14;
        this.w = j4;
        this.x = z;
        this.y = j5;
        this.z = j6;
        this.A = z2;
        this.B = j7;
        this.Y = j8;
        this.Z = str15;
        this.f1 = z3;
        this.g1 = z4;
        this.h1 = z5;
    }

    public static m0k0 a(m0k0 m0k0Var, String str, long j, int i) {
        long j2 = m0k0Var.f20959a;
        String str2 = m0k0Var.b;
        long j3 = m0k0Var.c;
        String str3 = m0k0Var.d;
        String str4 = m0k0Var.e;
        String str5 = m0k0Var.f;
        long j4 = m0k0Var.g;
        String str6 = m0k0Var.h;
        String str7 = m0k0Var.i;
        String str8 = m0k0Var.j;
        int i2 = m0k0Var.k;
        String str9 = m0k0Var.l;
        int i3 = m0k0Var.m;
        int i4 = m0k0Var.n;
        String str10 = m0k0Var.o;
        String str11 = m0k0Var.p;
        int i5 = m0k0Var.q;
        int i6 = m0k0Var.r;
        String str12 = m0k0Var.s;
        if ((i & 524288) != 0) {
            str = m0k0Var.t;
        }
        String str13 = m0k0Var.u;
        String str14 = m0k0Var.v;
        long j5 = m0k0Var.w;
        boolean z = m0k0Var.x;
        long j6 = m0k0Var.y;
        long j7 = m0k0Var.z;
        boolean z2 = m0k0Var.A;
        long j8 = m0k0Var.B;
        if ((i & 268435456) != 0) {
            j = m0k0Var.Y;
        }
        String str15 = m0k0Var.Z;
        boolean z3 = m0k0Var.f1;
        boolean z4 = m0k0Var.g1;
        boolean z5 = m0k0Var.h1;
        ohs0.z(str2, str3, str4, str5, str6);
        ohs0.z(str7, str8, str9, str10, str11);
        str12.getClass();
        str.getClass();
        str13.getClass();
        str14.getClass();
        str15.getClass();
        return new m0k0(j2, str2, j3, str3, str4, str5, j4, str6, str7, str8, i2, str9, i3, i4, str10, str11, i5, i6, str12, str, str13, str14, j5, z, j6, j7, z2, j8, j, str15, z3, z4, z5);
    }

    public final String b() {
        String str = this.h;
        return ohs0.n(this.d, str.length() > 0 ? kng0.k(" - ", str) : "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0k0)) {
            return false;
        }
        m0k0 m0k0Var = (m0k0) obj;
        return this.f20959a == m0k0Var.f20959a && Intrinsics.d(this.b, m0k0Var.b) && this.c == m0k0Var.c && Intrinsics.d(this.d, m0k0Var.d) && Intrinsics.d(this.e, m0k0Var.e) && Intrinsics.d(this.f, m0k0Var.f) && this.g == m0k0Var.g && Intrinsics.d(this.h, m0k0Var.h) && Intrinsics.d(this.i, m0k0Var.i) && Intrinsics.d(this.j, m0k0Var.j) && this.k == m0k0Var.k && Intrinsics.d(this.l, m0k0Var.l) && this.m == m0k0Var.m && this.n == m0k0Var.n && Intrinsics.d(this.o, m0k0Var.o) && Intrinsics.d(this.p, m0k0Var.p) && this.q == m0k0Var.q && this.r == m0k0Var.r && Intrinsics.d(this.s, m0k0Var.s) && Intrinsics.d(this.t, m0k0Var.t) && Intrinsics.d(this.u, m0k0Var.u) && Intrinsics.d(this.v, m0k0Var.v) && this.w == m0k0Var.w && this.x == m0k0Var.x && this.y == m0k0Var.y && this.z == m0k0Var.z && this.A == m0k0Var.A && this.B == m0k0Var.B && this.Y == m0k0Var.Y && Intrinsics.d(this.Z, m0k0Var.Z) && this.f1 == m0k0Var.f1 && this.g1 == m0k0Var.g1 && this.h1 == m0k0Var.h1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h1) + brm0.e(brm0.e(ua80.b(rw2.b(rw2.b(brm0.e(rw2.b(rw2.b(brm0.e(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.r, twn.a(this.q, ua80.b(ua80.b(twn.a(this.n, twn.a(this.m, ua80.b(twn.a(this.k, ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(Long.hashCode(this.f20959a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31), 31), 31, this.o), 31, this.p), 31), 31), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.Y), 31, this.Z), 31, this.f1), 31, this.g1);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f20959a, "SingleBetGame(sportId=", ", sportName=", this.b);
        kng0.A(sbO, ", teamOneId=", this.c, ", teamOneName=");
        f140.v(sbO, this.d, ", teamOneFirstImage=", this.e, ", teamOneSecondImage=");
        defpackage.c.i(sbO, this.g, this.f, ", teamTwoId=");
        f140.v(sbO, ", teamTwoName=", this.h, ", teamTwoFirstImage=", this.i);
        axq.s(this.k, ", teamTwoSecondImage=", this.j, ", playersNumber=", sbO);
        axq.s(this.m, ", matchScore=", this.l, ", firstScore=", sbO);
        w6x.w(this.n, ", secondScore=", ", firstSubScore=", this.o, sbO);
        axq.s(this.q, ", secondSubScore=", this.p, ", firstRedCards=", sbO);
        w6x.w(this.r, ", secondRedCards=", ", champName=", this.s, sbO);
        f140.v(sbO, ", fullName=", this.t, ", periodStr=", this.u);
        hne.B(sbO, ", vid=", this.v, ", subGameId=");
        hne.t(this.w, ", live=", sbO, this.x);
        kng0.A(sbO, ", timeStart=", this.y, ", champId=");
        hne.t(this.z, ", isFinished=", sbO, this.A);
        kng0.A(sbO, ", subSportId=", this.B, ", gameId=");
        kng0.z(sbO, this.Y, ", statGameId=", this.Z);
        w6x.A(", isHighlight=", ", homeAwayFlag=", sbO, this.f1, this.g1);
        return f140.n(sbO, ", is1xCyberGame=", this.h1, Separators.RPAREN);
    }

    public /* synthetic */ m0k0(long j, String str, long j2, String str2, String str3, String str4, long j3, String str5, String str6, String str7, int i, String str8, int i2, int i3, String str9, String str10, int i4, int i5, String str11, String str12, String str13, String str14, long j4, boolean z, long j5, long j6, boolean z2, long j7, long j8, String str15, boolean z3, boolean z4, boolean z5, int i6, int i7) {
        this(j, str, j2, str2, str3, str4, j3, str5, str6, str7, i, str8, i2, i3, str9, str10, i4, i5, str11, str12, str13, str14, j4, z, j5, j6, z2, j7, (i6 & 268435456) != 0 ? j4 : j8, str15, z3, z4, (i7 & 1) != 0 ? false : z5);
    }
}
