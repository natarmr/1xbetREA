package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l1q0 {
    public final boolean A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19269a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final boolean k;
    public final cre l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public l1q0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, String str2, boolean z9, cre creVar, String str3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, String str4, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
        str2.getClass();
        creVar.getClass();
        this.f19269a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = str;
        this.j = str2;
        this.k = z9;
        this.l = creVar;
        this.m = str3;
        this.n = z10;
        this.o = z11;
        this.p = z12;
        this.q = z13;
        this.r = z14;
        this.s = z15;
        this.t = z16;
        this.u = z17;
        this.v = z18;
        this.w = str4;
        this.x = z19;
        this.y = z20;
        this.z = z21;
        this.A = z22;
        this.B = z23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1q0)) {
            return false;
        }
        l1q0 l1q0Var = (l1q0) obj;
        return this.f19269a == l1q0Var.f19269a && this.b == l1q0Var.b && this.c == l1q0Var.c && this.d == l1q0Var.d && this.e == l1q0Var.e && this.f == l1q0Var.f && this.g == l1q0Var.g && this.h == l1q0Var.h && this.i.equals(l1q0Var.i) && Intrinsics.d(this.j, l1q0Var.j) && this.k == l1q0Var.k && Intrinsics.d(this.l, l1q0Var.l) && this.m.equals(l1q0Var.m) && this.n == l1q0Var.n && this.o == l1q0Var.o && this.p == l1q0Var.p && this.q == l1q0Var.q && this.r == l1q0Var.r && this.s == l1q0Var.s && this.t == l1q0Var.t && this.u == l1q0Var.u && this.v == l1q0Var.v && this.w.equals(l1q0Var.w) && this.x == l1q0Var.x && this.y == l1q0Var.y && this.z == l1q0Var.z && this.A == l1q0Var.A && this.B == l1q0Var.B;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.B) + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b((this.l.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f19269a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TestSectionCommonItemsModel(testServerStage=", ", testServerGame=", ", luxuryServer=", this.f19269a, this.b);
        ua80.u(", testBanners=", ", testAggregator=", sbQ, this.c, this.d);
        ua80.u(", checkGeo=", ", marketNumberVisibility=", sbQ, this.e, this.f);
        ua80.u(", allowDebugIframe=", ", fakeLetters=", sbQ, this.g, this.h);
        f140.v(sbQ, this.i, ", appGuid=", this.j, ", isTestBuild=");
        sbQ.append(this.k);
        sbQ.append(", country=");
        sbQ.append(this.l);
        sbQ.append(", appVersion=");
        brm0.C(this.m, ", highlightDesignSystem=", ", sipCRMTest=", sbQ, this.n);
        ua80.u(", sipCRMV2Test=", ", showPushInfo=", sbQ, this.o, this.p);
        ua80.u(", testSpecialEvent=", ", newAppStartPartner=", sbQ, this.q, this.r);
        ua80.u(", dynamicThemeSwitchingEnable=", ", testDomainEnabled=", sbQ, this.s, this.t);
        ua80.u(", isTestToolsEnabled=", ", manualTestDomain=", sbQ, this.u, this.v);
        brm0.C(this.w, ", isTestRemoteConfigEnabled=", ", isFakeAppGuidEnabled=", sbQ, this.x);
        ua80.u(", logFailedEventParams=", ", internetEmulationEnabled=", sbQ, this.y, this.z);
        return ohs0.p(", multiplyStringsEnable=", Separators.RPAREN, sbQ, this.A, this.B);
    }
}
