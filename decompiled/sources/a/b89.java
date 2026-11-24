package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b89 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2146a;
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

    public b89(long j, long j2, int i, long j3, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, w3w0 w3w0Var, boolean z6, boolean z7, String str3) {
        this.f2146a = j;
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

    public static b89 a(b89 b89Var, boolean z, boolean z2, boolean z3, boolean z4, w3w0 w3w0Var, boolean z5, int i) {
        long j = b89Var.f2146a;
        long j2 = b89Var.b;
        int i2 = b89Var.c;
        long j3 = b89Var.d;
        String str = b89Var.e;
        boolean z6 = (i & 32) != 0 ? b89Var.f : z;
        boolean z7 = (i & 64) != 0 ? b89Var.g : false;
        boolean z8 = (i & 128) != 0 ? b89Var.h : z2;
        boolean z9 = (i & 256) != 0 ? b89Var.i : z3;
        boolean z10 = (i & 512) != 0 ? b89Var.j : z4;
        boolean z11 = z9;
        String str2 = b89Var.k;
        boolean z12 = z6;
        w3w0 w3w0Var2 = (i & 2048) != 0 ? b89Var.l : w3w0Var;
        boolean z13 = (i & 4096) != 0 ? b89Var.m : z5;
        boolean z14 = (i & 8192) != 0 ? b89Var.n : false;
        String str3 = b89Var.o;
        b89Var.getClass();
        return new b89(j, j2, i2, j3, str, z12, z7, z8, z11, z10, str2, w3w0Var2, z13, z14, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b89)) {
            return false;
        }
        b89 b89Var = (b89) obj;
        return this.f2146a == b89Var.f2146a && this.b == b89Var.b && this.c == b89Var.c && this.d == b89Var.d && this.e.equals(b89Var.e) && this.f == b89Var.f && this.g == b89Var.g && this.h == b89Var.h && this.i == b89Var.i && this.j == b89Var.j && this.k.equals(b89Var.k) && this.l == b89Var.l && this.m == b89Var.m && this.n == b89Var.n && this.o.equals(b89Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(brm0.e((this.l.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(twn.a(this.c, rw2.b(Long.hashCode(this.f2146a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f2146a, "BroadcastingZoneLandscapeStateModel(gameId=", ", sportId=");
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
