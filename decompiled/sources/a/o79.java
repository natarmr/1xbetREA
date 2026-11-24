package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o79 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24775a;
    public final long b;
    public final int c;
    public final long d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final w3w0 k;
    public final w3w0 l;
    public final boolean m;
    public final boolean n;
    public final String o;

    public o79(long j, long j2, int i, long j3, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, w3w0 w3w0Var, w3w0 w3w0Var2, boolean z5, boolean z6, String str3) {
        this.f24775a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = w3w0Var;
        this.l = w3w0Var2;
        this.m = z5;
        this.n = z6;
        this.o = str3;
    }

    public static o79 a(o79 o79Var, boolean z, boolean z2, boolean z3, boolean z4, w3w0 w3w0Var, w3w0 w3w0Var2, boolean z5, String str, int i) {
        long j = o79Var.f24775a;
        long j2 = o79Var.b;
        int i2 = o79Var.c;
        long j3 = o79Var.d;
        String str2 = o79Var.e;
        String str3 = o79Var.f;
        boolean z6 = (i & 64) != 0 ? o79Var.g : z;
        boolean z7 = (i & 128) != 0 ? o79Var.h : z2;
        boolean z8 = (i & 256) != 0 ? o79Var.i : z3;
        boolean z9 = (i & 512) != 0 ? o79Var.j : z4;
        w3w0 w3w0Var3 = (i & 1024) != 0 ? o79Var.k : w3w0Var;
        boolean z10 = z6;
        w3w0 w3w0Var4 = (i & 2048) != 0 ? o79Var.l : w3w0Var2;
        boolean z11 = (i & 4096) != 0 ? o79Var.m : z5;
        boolean z12 = (i & 8192) != 0 ? o79Var.n : false;
        String str4 = (i & 16384) != 0 ? o79Var.o : str;
        o79Var.getClass();
        return new o79(j, j2, i2, j3, str2, str3, z10, z7, z8, z9, w3w0Var3, w3w0Var4, z11, z12, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o79)) {
            return false;
        }
        o79 o79Var = (o79) obj;
        return this.f24775a == o79Var.f24775a && this.b == o79Var.b && this.c == o79Var.c && this.d == o79Var.d && this.e.equals(o79Var.e) && this.f.equals(o79Var.f) && this.g == o79Var.g && this.h == o79Var.h && this.i == o79Var.i && this.j == o79Var.j && this.k == o79Var.k && this.l == o79Var.l && this.m == o79Var.m && this.n == o79Var.n && this.o.equals(o79Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(brm0.e((this.l.hashCode() + ((this.k.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(rw2.b(twn.a(this.c, rw2.b(Long.hashCode(this.f24775a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f24775a, "BroadcastingZoneFullScreenState(gameId=", ", sportId=");
        ua80.v(sbQ, this.b, ", zoneId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        f140.v(sbQ, this.e, ", lang=", this.f, ", isBroadcastingRun=");
        ua80.u(", isUrlApply=", ", isControlPanelVisible=", sbQ, this.g, this.h);
        ua80.u(", isError=", ", zoneFormatType=", sbQ, this.i, this.j);
        sbQ.append(this.k);
        sbQ.append(", pageZoneFormatType=");
        sbQ.append(this.l);
        sbQ.append(", zoneFormatChangeAvailable=");
        ua80.u(", shouldEndWatchingSession=", ", broadcastSessionHost=", sbQ, this.m, this.n);
        return axq.n(sbQ, this.o, Separators.RPAREN);
    }
}
