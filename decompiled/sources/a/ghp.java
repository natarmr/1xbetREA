package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ghp {
    public static final ghp u = new ghp(false, false, false, false, false, false, false, false, false, false, false, false, false, false, z0q0.g, false, false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11311a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final z0q0 o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public ghp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, z0q0 z0q0Var, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        z0q0Var.getClass();
        this.f11311a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
        this.o = z0q0Var;
        this.p = z15;
        this.q = z16;
        this.r = z17;
        this.s = z18;
        this.t = z19;
    }

    public static ghp a(ghp ghpVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i) {
        boolean z20 = (i & 1) != 0 ? ghpVar.f11311a : z;
        boolean z21 = (i & 2) != 0 ? ghpVar.b : z2;
        boolean z22 = (i & 4) != 0 ? ghpVar.c : z3;
        boolean z23 = (i & 8) != 0 ? ghpVar.d : z4;
        boolean z24 = (i & 16) != 0 ? ghpVar.e : z5;
        boolean z25 = (i & 32) != 0 ? ghpVar.f : z6;
        boolean z26 = (i & 64) != 0 ? ghpVar.g : z7;
        boolean z27 = (i & 128) != 0 ? ghpVar.h : z8;
        boolean z28 = (i & 256) != 0 ? ghpVar.i : z9;
        boolean z29 = (i & 512) != 0 ? ghpVar.j : z10;
        boolean z30 = (i & 1024) != 0 ? ghpVar.k : z11;
        boolean z31 = (i & 2048) != 0 ? ghpVar.l : z12;
        boolean z32 = (i & 4096) != 0 ? ghpVar.m : z13;
        boolean z33 = (i & 8192) != 0 ? ghpVar.n : z14;
        z0q0 z0q0Var = ghpVar.o;
        boolean z34 = (i & 32768) != 0 ? ghpVar.p : z15;
        boolean z35 = (i & 65536) != 0 ? ghpVar.q : z16;
        boolean z36 = (i & 131072) != 0 ? ghpVar.r : z17;
        boolean z37 = (i & 262144) != 0 ? ghpVar.s : z18;
        boolean z38 = (i & 524288) != 0 ? ghpVar.t : z19;
        ghpVar.getClass();
        z0q0Var.getClass();
        return new ghp(z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z0q0Var, z34, z35, z36, z37, z38);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghp)) {
            return false;
        }
        ghp ghpVar = (ghp) obj;
        return this.f11311a == ghpVar.f11311a && this.b == ghpVar.b && this.c == ghpVar.c && this.d == ghpVar.d && this.e == ghpVar.e && this.f == ghpVar.f && this.g == ghpVar.g && this.h == ghpVar.h && this.i == ghpVar.i && this.j == ghpVar.j && this.k == ghpVar.k && this.l == ghpVar.l && this.m == ghpVar.m && this.n == ghpVar.n && Intrinsics.d(this.o, ghpVar.o) && this.p == ghpVar.p && this.q == ghpVar.q && this.r == ghpVar.r && this.s == ghpVar.s && this.t == ghpVar.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + brm0.e(brm0.e(brm0.e(brm0.e((this.o.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f11311a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FeatureTogglesModel(testServerStage=", ", testServerTestGame=", ", luxuryServer=", this.f11311a, this.b);
        ua80.u(", onlyTestBanners=", ", aggregatorTestFlagInRequests=", sbQ, this.c, this.d);
        ua80.u(", checkGeo=", ", showParsingNumberCoefficients=", sbQ, this.e, this.f);
        ua80.u(", allowDebugIframe=", ", sipCRMTest=", sbQ, this.g, this.h);
        ua80.u(", sipCRMV2Test=", ", showPushInfo=", sbQ, this.i, this.j);
        ua80.u(", highlightDesignSystem=", ", specialEvent=", sbQ, this.k, this.l);
        ua80.u(", startScreenPartnersLogoAvailable=", ", testConsultant=", sbQ, this.m, this.n);
        sbQ.append(this.o);
        sbQ.append(", testDomainEnabled=");
        sbQ.append(this.p);
        sbQ.append(", isTestToolsEnabled=");
        ua80.u(", isTestRemoteConfigEnabled=", ", internetEmulationEnabled=", sbQ, this.q, this.r);
        return ohs0.p(", logFailedEventParams=", Separators.RPAREN, sbQ, this.s, this.t);
    }
}
