package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31426a;
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

    public s0t(long j, long j2, int i, long j3, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, w3w0 w3w0Var, boolean z6, boolean z7, String str3) {
        this.f31426a = j;
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

    public static s0t a(s0t s0tVar, boolean z, boolean z2, boolean z3, boolean z4, w3w0 w3w0Var, boolean z5, boolean z6, int i) {
        long j = s0tVar.f31426a;
        long j2 = s0tVar.b;
        int i2 = s0tVar.c;
        long j3 = s0tVar.d;
        String str = s0tVar.e;
        boolean z7 = (i & 32) != 0 ? s0tVar.f : z;
        boolean z8 = (i & 64) != 0 ? s0tVar.g : false;
        boolean z9 = (i & 128) != 0 ? s0tVar.h : z2;
        boolean z10 = (i & 256) != 0 ? s0tVar.i : z3;
        boolean z11 = (i & 512) != 0 ? s0tVar.j : z4;
        String str2 = s0tVar.k;
        boolean z12 = z7;
        w3w0 w3w0Var2 = (i & 2048) != 0 ? s0tVar.l : w3w0Var;
        boolean z13 = (i & 4096) != 0 ? s0tVar.m : z5;
        boolean z14 = (i & 8192) != 0 ? s0tVar.n : z6;
        String str3 = s0tVar.o;
        s0tVar.getClass();
        return new s0t(j, j2, i2, j3, str, z12, z8, z9, z10, z11, str2, w3w0Var2, z13, z14, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0t)) {
            return false;
        }
        s0t s0tVar = (s0t) obj;
        return this.f31426a == s0tVar.f31426a && this.b == s0tVar.b && this.c == s0tVar.c && this.d == s0tVar.d && this.e.equals(s0tVar.e) && this.f == s0tVar.f && this.g == s0tVar.g && this.h == s0tVar.h && this.i == s0tVar.i && this.j == s0tVar.j && this.k.equals(s0tVar.k) && this.l == s0tVar.l && this.m == s0tVar.m && this.n == s0tVar.n && this.o.equals(s0tVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(brm0.e((this.l.hashCode() + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(twn.a(this.c, rw2.b(Long.hashCode(this.f31426a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f31426a, "GameZoneStateModel(gameId=", ", sportId=");
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
