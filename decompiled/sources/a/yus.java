package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43284a;
    public final String b;
    public final long c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final long q;
    public final px7 r;
    public final boolean s;

    public yus(long j, String str, long j2, boolean z, long j3, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j4, px7 px7Var, boolean z10) {
        this.f43284a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = j4;
        this.r = px7Var;
        this.s = z10;
    }

    public static yus a(yus yusVar, long j, String str, long j2, boolean z, long j3, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j4, px7 px7Var, boolean z9, int i) {
        long j5 = (i & 1) != 0 ? yusVar.f43284a : j;
        String str5 = (i & 2) != 0 ? yusVar.b : str;
        long j6 = (i & 4) != 0 ? yusVar.c : j2;
        boolean z10 = (i & 8) != 0 ? yusVar.d : z;
        long j7 = (i & 16) != 0 ? yusVar.e : j3;
        String str6 = (i & 32) != 0 ? yusVar.f : str2;
        String str7 = (i & 64) != 0 ? yusVar.g : str3;
        String str8 = (i & 128) != 0 ? yusVar.h : str4;
        boolean z11 = (i & 256) != 0 ? yusVar.i : z2;
        boolean z12 = (i & 512) != 0 ? yusVar.j : z3;
        boolean z13 = yusVar.k;
        long j8 = j5;
        boolean z14 = (i & 2048) != 0 ? yusVar.l : z4;
        boolean z15 = (i & 4096) != 0 ? yusVar.m : z5;
        boolean z16 = z14;
        boolean z17 = (i & 8192) != 0 ? yusVar.n : z6;
        boolean z18 = (i & 16384) != 0 ? yusVar.o : z7;
        boolean z19 = (i & 32768) != 0 ? yusVar.p : z8;
        boolean z20 = z18;
        long j9 = (i & 65536) != 0 ? yusVar.q : j4;
        px7 px7Var2 = (i & 131072) != 0 ? yusVar.r : px7Var;
        boolean z21 = (i & 262144) != 0 ? yusVar.s : z9;
        yusVar.getClass();
        str6.getClass();
        px7Var2.getClass();
        return new yus(j8, str5, j6, z10, j7, str6, str7, str8, z11, z12, z13, z16, z15, z17, z20, z19, j9, px7Var2, z21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yus)) {
            return false;
        }
        yus yusVar = (yus) obj;
        return this.f43284a == yusVar.f43284a && this.b.equals(yusVar.b) && this.c == yusVar.c && this.d == yusVar.d && this.e == yusVar.e && this.f.equals(yusVar.f) && this.g.equals(yusVar.g) && this.h.equals(yusVar.h) && this.i == yusVar.i && this.j == yusVar.j && this.k == yusVar.k && this.l == yusVar.l && this.m == yusVar.m && this.n == yusVar.n && this.o == yusVar.o && this.p == yusVar.p && this.q == yusVar.q && this.r.equals(yusVar.r) && this.s == yusVar.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + ((this.r.hashCode() + rw2.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(brm0.e(rw2.b(ua80.b(Long.hashCode(this.f43284a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43284a, "GameToolbarStateModel(gameId=", ", statGameId=", this.b);
        kng0.A(sbO, ", constId=", this.c, ", live=");
        rw2.v(this.e, ", sportId=", sbO, this.d);
        f140.v(sbO, ", sportName=", this.f, ", champName=", this.g);
        w6x.z(", extraInfo=", this.h, ", quickBetEnabled=", sbO, this.i);
        w6x.A(", menuButtonEnabled=", ", quickBetAvailable=", sbO, this.j, this.k);
        w6x.A(", hasMarketsGraph=", ", statisticAvailable=", sbO, this.l, this.m);
        w6x.A(", filterAvailable=", ", duelAvailable=", sbO, this.n, this.o);
        rz4.A(sbO, ", subscriptionAvailable=", this.p, ", currentSubGameId=");
        sbO.append(this.q);
        sbO.append(", bettingStateModel=");
        sbO.append(this.r);
        return f140.n(sbO, ", hasBetsByPlayers=", this.s, Separators.RPAREN);
    }
}
