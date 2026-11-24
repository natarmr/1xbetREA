package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class czs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5238a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;

    public czs(long j, long j2, String str, long j3, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str3) {
        this.f5238a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = str3;
    }

    public static czs a(czs czsVar, long j, long j2, String str, long j3, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, int i) {
        long j4 = (i & 1) != 0 ? czsVar.f5238a : j;
        long j5 = (i & 2) != 0 ? czsVar.b : j2;
        String str4 = (i & 4) != 0 ? czsVar.c : str;
        long j6 = (i & 8) != 0 ? czsVar.d : j3;
        String str5 = (i & 16) != 0 ? czsVar.e : str2;
        boolean z8 = (i & 32) != 0 ? czsVar.f : z;
        boolean z9 = (i & 64) != 0 ? czsVar.g : z2;
        boolean z10 = (i & 128) != 0 ? czsVar.h : z3;
        boolean z11 = (i & 256) != 0 ? czsVar.i : z4;
        czsVar.getClass();
        boolean z12 = (i & 1024) != 0 ? czsVar.j : z5;
        boolean z13 = (i & 2048) != 0 ? czsVar.k : z6;
        boolean z14 = czsVar.l;
        boolean z15 = (i & 8192) != 0 ? czsVar.m : z7;
        boolean z16 = (i & 16384) != 0 ? czsVar.n : false;
        String str6 = (i & 32768) != 0 ? czsVar.o : str3;
        czsVar.getClass();
        str4.getClass();
        str5.getClass();
        return new czs(j4, j5, str4, j6, str5, z8, z9, z10, z11, z12, z13, z14, z15, z16, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czs)) {
            return false;
        }
        czs czsVar = (czs) obj;
        return this.f5238a == czsVar.f5238a && this.b == czsVar.b && this.c.equals(czsVar.c) && this.d == czsVar.d && this.e.equals(czsVar.e) && this.f == czsVar.f && this.g == czsVar.g && this.h == czsVar.h && this.i == czsVar.i && this.j == czsVar.j && this.k == czsVar.k && this.l == czsVar.l && this.m == czsVar.m && this.n == czsVar.n && this.o.equals(czsVar.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f5238a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 961, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f5238a, "GameVideoWindowScreenStateModel(gameId=", ", sportId=");
        kng0.z(sbQ, this.b, ", videoId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        brm0.C(this.e, ", isBroadcastingRun=", ", isUrlApply=", sbQ, this.f);
        ua80.u(", isControlPanelVisible=", ", isSoundEnable=", sbQ, this.g, this.h);
        ua80.u(", phoneActivationStatus=null, isVideoBroadcastLimitReached=", ", isTimerRelevant=", sbQ, this.i, this.j);
        ua80.u(", isNeedActivatedPhoneForStream=", ", isServiceError=", sbQ, this.k, this.l);
        ua80.u(", shouldEndWatchingSession=", ", broadcastSessionHost=", sbQ, this.m, this.n);
        return axq.n(sbQ, this.o, Separators.RPAREN);
    }
}
