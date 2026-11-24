package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37194a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final y6p0 h;
    public final y6p0 i;
    public final int j;
    public final int k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final String q;

    static {
        y6p0 y6p0Var = y6p0.e;
        y6p0 y6p0Var2 = y6p0.e;
        new vcm0("", 0L, "", 0L, "", "0", "0", y6p0Var2, y6p0Var2, 0, 0, false, "", false, false, "0", "0");
    }

    public vcm0(String str, long j, String str2, long j2, String str3, String str4, String str5, y6p0 y6p0Var, y6p0 y6p0Var2, int i, int i2, boolean z, String str6, boolean z2, boolean z3, String str7, String str8) {
        ohs0.z(str, str2, str3, str4, str5);
        y6p0Var.getClass();
        y6p0Var2.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.f37194a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = y6p0Var;
        this.i = y6p0Var2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = str6;
        this.n = z2;
        this.o = z3;
        this.p = str7;
        this.q = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcm0)) {
            return false;
        }
        vcm0 vcm0Var = (vcm0) obj;
        return Intrinsics.d(this.f37194a, vcm0Var.f37194a) && this.b == vcm0Var.b && Intrinsics.d(this.c, vcm0Var.c) && this.d == vcm0Var.d && Intrinsics.d(this.e, vcm0Var.e) && Intrinsics.d(this.f, vcm0Var.f) && Intrinsics.d(this.g, vcm0Var.g) && Intrinsics.d(this.h, vcm0Var.h) && Intrinsics.d(this.i, vcm0Var.i) && this.j == vcm0Var.j && this.k == vcm0Var.k && this.l == vcm0Var.l && Intrinsics.d(this.m, vcm0Var.m) && this.n == vcm0Var.n && this.o == vcm0Var.o && Intrinsics.d(this.p, vcm0Var.p) && Intrinsics.d(this.q, vcm0Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ua80.b(brm0.e(brm0.e(ua80.b(brm0.e(twn.a(this.k, twn.a(this.j, (this.i.hashCode() + ((this.h.hashCode() + ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(rw2.b(this.f37194a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "StatisticHeaderDataModel(gameId=", this.f37194a, ", sportId=");
        hne.B(sbO, ", gameTitle=", this.c, ", eventDateInSecondsUnixTime=");
        kng0.z(sbO, this.d, ", score=", this.e);
        f140.v(sbO, ", scoreTeamOne=", this.f, ", scoreTeamTwo=", this.g);
        sbO.append(", teamOne=");
        sbO.append(this.h);
        sbO.append(", teamTwo=");
        sbO.append(this.i);
        rw2.s(this.j, this.k, ", redCardTeamOne=", ", redCardTeamTwo=", sbO);
        hne.u(", forceShowScore=", ", tournamentTitle=", this.m, sbO, this.l);
        w6x.A(", finished=", ", live=", sbO, this.n, this.o);
        f140.v(sbO, ", stringScoreOne=", this.p, ", stringScoreTwo=", this.q);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
