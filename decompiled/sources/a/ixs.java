package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ixs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15558a;
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
    public final Throwable m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final String s;

    public ixs(long j, long j2, String str, long j3, String str2, boolean z, boolean z2, boolean z3, boolean z4, hl90 hl90Var, boolean z5, boolean z6, Throwable th, boolean z7, boolean z8, String str3, boolean z9, boolean z10, String str4) {
        str.getClass();
        this.f15558a = j;
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
        this.m = th;
        this.n = z7;
        this.o = z8;
        this.p = str3;
        this.q = z9;
        this.r = z10;
        this.s = str4;
    }

    public static ixs a(ixs ixsVar, long j, String str, boolean z, boolean z2, boolean z3, boolean z4, hl90 hl90Var, boolean z5, boolean z6, Throwable th, boolean z7, String str2, boolean z8, boolean z9, int i) {
        long j2 = (i & 1) != 0 ? ixsVar.f15558a : j;
        long j3 = ixsVar.b;
        String str3 = ixsVar.c;
        long j4 = ixsVar.d;
        String str4 = (i & 16) != 0 ? ixsVar.e : str;
        boolean z10 = (i & 32) != 0 ? ixsVar.f : z;
        boolean z11 = (i & 64) != 0 ? ixsVar.g : z2;
        boolean z12 = (i & 128) != 0 ? ixsVar.h : z3;
        boolean z13 = (i & 256) != 0 ? ixsVar.i : z4;
        hl90 hl90Var2 = (i & 512) != 0 ? ixsVar.j : hl90Var;
        boolean z14 = (i & 1024) != 0 ? ixsVar.k : z5;
        boolean z15 = (i & 2048) != 0 ? ixsVar.l : z6;
        Throwable th2 = (i & 4096) != 0 ? ixsVar.m : th;
        boolean z16 = ixsVar.n;
        boolean z17 = (i & 16384) != 0 ? ixsVar.o : z7;
        String str5 = (32768 & i) != 0 ? ixsVar.p : str2;
        boolean z18 = (65536 & i) != 0 ? ixsVar.q : z8;
        boolean z19 = (i & 131072) != 0 ? ixsVar.r : z9;
        String str6 = ixsVar.s;
        ixsVar.getClass();
        str3.getClass();
        str4.getClass();
        return new ixs(j2, j3, str3, j4, str4, z10, z11, z12, z13, hl90Var2, z14, z15, th2, z16, z17, str5, z18, z19, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixs)) {
            return false;
        }
        ixs ixsVar = (ixs) obj;
        return this.f15558a == ixsVar.f15558a && this.b == ixsVar.b && Intrinsics.d(this.c, ixsVar.c) && this.d == ixsVar.d && this.e.equals(ixsVar.e) && this.f == ixsVar.f && this.g == ixsVar.g && this.h == ixsVar.h && this.i == ixsVar.i && this.j == ixsVar.j && this.k == ixsVar.k && this.l == ixsVar.l && Intrinsics.d(this.m, ixsVar.m) && this.n == ixsVar.n && this.o == ixsVar.o && this.p.equals(ixsVar.p) && this.q == ixsVar.q && this.r == ixsVar.r && this.s.equals(ixsVar.s);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(rw2.b(ua80.b(rw2.b(Long.hashCode(this.f15558a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        hl90 hl90Var = this.j;
        int iE2 = brm0.e(brm0.e((iE + (hl90Var == null ? 0 : hl90Var.hashCode())) * 31, 31, this.k), 31, this.l);
        Throwable th = this.m;
        return this.s.hashCode() + brm0.e(brm0.e(ua80.b(brm0.e(brm0.e((iE2 + (th != null ? th.hashCode() : 0)) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f15558a, "GameVideoStateModel(gameId=", ", sportId=");
        kng0.z(sbQ, this.b, ", videoId=", this.c);
        kng0.A(sbQ, ", subSportId=", this.d, ", url=");
        brm0.C(this.e, ", isBroadcastingRun=", ", isUrlApply=", sbQ, this.f);
        ua80.u(", isControlPanelVisible=", ", isSoundEnable=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", phoneActivationStatus=");
        sbQ.append(this.j);
        sbQ.append(", isVideoBroadcastLimitReached=");
        ua80.u(", isUrlLoading=", ", urlThrowable=", sbQ, this.k, this.l);
        sbQ.append(this.m);
        sbQ.append(", isNeedActivatedPhoneForStream=");
        sbQ.append(this.n);
        sbQ.append(", isTimerRelevant=");
        f140.s(", phoneNumber=", this.p, ", isDialogShowing=", sbQ, this.o);
        ua80.u(", shouldEndWatchingSession=", ", broadcastSessionHost=", sbQ, this.q, this.r);
        return axq.n(sbQ, this.s, Separators.RPAREN);
    }
}
