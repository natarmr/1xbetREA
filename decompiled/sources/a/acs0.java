package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class acs0 implements Serializable {
    public static final zbs0 Companion = new zbs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f644a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final long k;
    public final String l;
    public final String m;
    public final long n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final boolean t;
    public final String u;
    public final String v;
    public final String w;
    public final Boolean x;

    public acs0(long j, long j2, long j3, boolean z, long j4, String str, String str2, String str3, long j5, String str4, long j6, String str5, String str6, long j7, String str7, String str8, String str9, String str10, String str11, boolean z2, String str12, String str13, String str14, Boolean bool) {
        ohs0.z(str, str2, str3, str4, str5);
        ohs0.z(str6, str7, str8, str9, str10);
        str11.getClass();
        str12.getClass();
        this.f644a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j5;
        this.j = str4;
        this.k = j6;
        this.l = str5;
        this.m = str6;
        this.n = j7;
        this.o = str7;
        this.p = str8;
        this.q = str9;
        this.r = str10;
        this.s = str11;
        this.t = z2;
        this.u = str12;
        this.v = str13;
        this.w = str14;
        this.x = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acs0)) {
            return false;
        }
        acs0 acs0Var = (acs0) obj;
        return this.f644a == acs0Var.f644a && this.b == acs0Var.b && this.c == acs0Var.c && this.d == acs0Var.d && this.e == acs0Var.e && Intrinsics.d(this.f, acs0Var.f) && Intrinsics.d(this.g, acs0Var.g) && Intrinsics.d(this.h, acs0Var.h) && this.i == acs0Var.i && Intrinsics.d(this.j, acs0Var.j) && this.k == acs0Var.k && Intrinsics.d(this.l, acs0Var.l) && Intrinsics.d(this.m, acs0Var.m) && this.n == acs0Var.n && Intrinsics.d(this.o, acs0Var.o) && Intrinsics.d(this.p, acs0Var.p) && Intrinsics.d(this.q, acs0Var.q) && Intrinsics.d(this.r, acs0Var.r) && Intrinsics.d(this.s, acs0Var.s) && this.t == acs0Var.t && Intrinsics.d(this.u, acs0Var.u) && Intrinsics.d(this.v, acs0Var.v) && Intrinsics.d(this.w, acs0Var.w) && Intrinsics.d(this.x, acs0Var.x);
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(brm0.e(rw2.b(rw2.b(Long.hashCode(this.f644a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
        String str = this.v;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.w;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.x;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f644a, "TrackGameInfo(id=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", live=");
        rw2.v(this.e, ", champId=", sbQ, this.d);
        f140.v(sbQ, ", champName=", this.f, ", matchName=", this.g);
        hne.B(sbQ, ", fullName=", this.h, ", timeStart=");
        kng0.z(sbQ, this.i, ", sportName=", this.j);
        kng0.A(sbQ, ", teamOneId=", this.k, ", teamOneName=");
        f140.v(sbQ, this.l, ", teamOneImageNew=", this.m, ", teamTwoId=");
        kng0.z(sbQ, this.n, ", teamTwoName=", this.o);
        f140.v(sbQ, ", teamTwoImageNew=", this.p, ", matchScore=", this.q);
        f140.v(sbQ, ", periodStr=", this.r, ", vid=", this.s);
        hne.u(", isFinished=", ", statGameId=", this.u, sbQ, this.t);
        f140.v(sbQ, ", teamOneSecondImage=", this.v, ", teamTwoSecondImage=", this.w);
        sbQ.append(", homeAwayFlag=");
        sbQ.append(this.x);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public /* synthetic */ acs0(int i, long j, long j2, long j3, boolean z, long j4, String str, String str2, String str3, long j5, String str4, long j6, String str5, String str6, long j7, String str7, String str8, String str9, String str10, String str11, boolean z2, String str12, String str13, String str14, Boolean bool) {
        if (16777215 != (i & 16777215)) {
            m2x.I(i, 16777215, ybs0.f42354a.getDescriptor());
            throw null;
        }
        this.f644a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j5;
        this.j = str4;
        this.k = j6;
        this.l = str5;
        this.m = str6;
        this.n = j7;
        this.o = str7;
        this.p = str8;
        this.q = str9;
        this.r = str10;
        this.s = str11;
        this.t = z2;
        this.u = str12;
        this.v = str13;
        this.w = str14;
        this.x = bool;
    }
}
