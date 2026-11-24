package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15752a;
    public final long b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final w3w0 l;
    public final boolean m;
    public final boolean n;
    public final String o;

    public j1t(long j, long j2, int i, long j3, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, w3w0 w3w0Var, boolean z6, boolean z7, String str3) {
        this.f15752a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = str2;
        this.l = w3w0Var;
        this.m = z6;
        this.n = z7;
        this.o = str3;
    }

    public static j1t a(j1t j1tVar, long j, long j2, int i, long j3, String str, boolean z, boolean z2, boolean z3, w3w0 w3w0Var, boolean z4, String str2, int i2) {
        long j4 = (i2 & 1) != 0 ? j1tVar.f15752a : j;
        long j5 = (i2 & 2) != 0 ? j1tVar.b : j2;
        int i3 = (i2 & 4) != 0 ? j1tVar.c : i;
        long j6 = (i2 & 8) != 0 ? j1tVar.d : j3;
        String str3 = (i2 & 16) != 0 ? j1tVar.e : str;
        boolean z5 = (i2 & 32) != 0 ? j1tVar.f : z;
        boolean z6 = (i2 & 64) != 0 ? j1tVar.g : false;
        boolean z7 = (i2 & 128) != 0 ? j1tVar.h : z2;
        boolean z8 = (i2 & 256) != 0 ? j1tVar.i : true;
        boolean z9 = (i2 & 512) != 0 ? j1tVar.j : z3;
        String str4 = j1tVar.k;
        w3w0 w3w0Var2 = (i2 & 2048) != 0 ? j1tVar.l : w3w0Var;
        boolean z10 = (i2 & 4096) != 0 ? j1tVar.m : z4;
        boolean z11 = (i2 & 8192) != 0 ? j1tVar.n : false;
        String str5 = (i2 & 16384) != 0 ? j1tVar.o : str2;
        j1tVar.getClass();
        return new j1t(j4, j5, i3, j6, str3, z5, z6, z7, z8, z9, str4, w3w0Var2, z10, z11, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1t)) {
            return false;
        }
        j1t j1tVar = (j1t) obj;
        return this.f15752a == j1tVar.f15752a && this.b == j1tVar.b && this.c == j1tVar.c && this.d == j1tVar.d && this.e.equals(j1tVar.e) && this.f == j1tVar.f && this.g == j1tVar.g && this.h == j1tVar.h && this.i == j1tVar.i && this.j == j1tVar.j && this.k.equals(j1tVar.k) && this.l == j1tVar.l && this.m == j1tVar.m && this.n == j1tVar.n && this.o.equals(j1tVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(brm0.e((this.l.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(twn.a(this.c, rw2.b(Long.hashCode(this.f15752a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15752a, "GameZoneWindowScreenStateModel(gameId=", ", sportId=");
        ua80.v(sbQ, this.b, ", zoneId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        brm0.C(this.e, ", isBroadcastingRun=", ", isLoad=", sbQ, this.f);
        ua80.u(", isUrlApply=", ", isError=", sbQ, this.g, this.h);
        ua80.u(", isControlPanelVisible=", ", lang=", sbQ, this.i, this.j);
        sbQ.append(this.k);
        sbQ.append(", zoneFormatType=");
        sbQ.append(this.l);
        sbQ.append(", zoneFormatChangeAvailable=");
        ua80.u(", shouldEndWatchingSession=", ", broadcastSessionHost=", sbQ, this.m, this.n);
        return axq.n(sbQ, this.o, Separators.RPAREN);
    }
}
