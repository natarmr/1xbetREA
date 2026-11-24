package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z59 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43804a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final hl90 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final String r;
    public final mdm s;

    public z59(long j, long j2, String str, long j3, String str2, boolean z, boolean z2, boolean z3, boolean z4, hl90 hl90Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str3, boolean z10, String str4, mdm mdmVar) {
        str.getClass();
        str2.getClass();
        this.f43804a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = hl90Var;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
        this.p = str3;
        this.q = z10;
        this.r = str4;
        this.s = mdmVar;
    }

    public static z59 a(z59 z59Var, String str, boolean z, boolean z2, boolean z3, boolean z4, hl90 hl90Var, boolean z5, boolean z6, String str2, String str3, int i) {
        long j = z59Var.f43804a;
        long j2 = z59Var.b;
        String str4 = z59Var.c;
        long j3 = z59Var.d;
        String str5 = (i & 16) != 0 ? z59Var.e : str;
        boolean z7 = (i & 32) != 0 ? z59Var.f : z;
        boolean z8 = (i & 64) != 0 ? z59Var.g : z2;
        boolean z9 = (i & 128) != 0 ? z59Var.h : z3;
        boolean z10 = (i & 256) != 0 ? z59Var.i : z4;
        hl90 hl90Var2 = (i & 512) != 0 ? z59Var.j : hl90Var;
        boolean z11 = (i & 1024) != 0 ? z59Var.k : true;
        String str6 = str5;
        boolean z12 = (i & 2048) != 0 ? z59Var.l : z5;
        boolean z13 = (i & 4096) != 0 ? z59Var.m : z6;
        boolean z14 = (i & 8192) != 0 ? z59Var.n : true;
        boolean z15 = (i & 16384) != 0 ? z59Var.o : false;
        String str7 = (32768 & i) != 0 ? z59Var.p : str2;
        boolean z16 = z59Var.q;
        String str8 = (i & 131072) != 0 ? z59Var.r : str3;
        mdm mdmVar = z59Var.s;
        z59Var.getClass();
        str4.getClass();
        str6.getClass();
        return new z59(j, j2, str4, j3, str6, z7, z8, z9, z10, hl90Var2, z11, z12, z13, z14, z15, str7, z16, str8, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z59)) {
            return false;
        }
        z59 z59Var = (z59) obj;
        return this.f43804a == z59Var.f43804a && this.b == z59Var.b && Intrinsics.d(this.c, z59Var.c) && this.d == z59Var.d && Intrinsics.d(this.e, z59Var.e) && this.f == z59Var.f && this.g == z59Var.g && this.h == z59Var.h && this.i == z59Var.i && this.j == z59Var.j && this.k == z59Var.k && this.l == z59Var.l && this.m == z59Var.m && this.n == z59Var.n && this.o == z59Var.o && this.p.equals(z59Var.p) && this.q == z59Var.q && this.r.equals(z59Var.r) && this.s.equals(z59Var.s);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f43804a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        hl90 hl90Var = this.j;
        return this.s.hashCode() + ua80.b(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iE + (hl90Var == null ? 0 : hl90Var.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f43804a, "BroadcastingVideoFullScreenState(gameId=", ", sportId=");
        kng0.z(sbQ, this.b, ", videoId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        brm0.C(this.e, ", isBroadcastingRun=", ", isUrlApply=", sbQ, this.f);
        ua80.u(", isControlPanelVisible=", ", isSoundEnabled=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", phoneActivationStatus=");
        sbQ.append(this.j);
        sbQ.append(", isVideoBroadcastLimitReached=");
        ua80.u(", isServiceError=", ", isNetworkAvailable=", sbQ, this.k, this.l);
        ua80.u(", isTimerRelevant=", ", shouldEndWatchingSession=", sbQ, this.m, this.n);
        f140.s(", broadcastSessionHost=", this.p, ", isNeedActivatedPhoneForStream=", sbQ, this.o);
        f140.s(", phoneNumber=", this.r, ", errorConfig=", sbQ, this.q);
        return cs0.m(sbQ, this.s, Separators.RPAREN);
    }
}
