package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class caj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4014a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final j6d0 f;
    public final boolean g;
    public final boolean h;
    public final mrh0 i;
    public final baj0 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public caj0(boolean z, boolean z2, boolean z3, boolean z4, String str, j6d0 j6d0Var, boolean z5, boolean z6, mrh0 mrh0Var, baj0 baj0Var, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str2, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f4014a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = j6d0Var;
        this.g = z5;
        this.h = z6;
        this.i = mrh0Var;
        this.j = baj0Var;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.p = z12;
        this.q = z13;
        this.r = z14;
        this.s = str2;
        this.t = z15;
        this.u = z16;
        this.v = z17;
        this.w = z18;
        this.x = z19;
    }

    public static caj0 a(caj0 caj0Var, boolean z, boolean z2, boolean z3, j6d0 j6d0Var, boolean z4, boolean z5, mrh0 mrh0Var, baj0 baj0Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i) {
        boolean z19 = (i & 1) != 0 ? caj0Var.f4014a : z;
        boolean z20 = (i & 2) != 0 ? caj0Var.b : z2;
        boolean z21 = (i & 4) != 0 ? caj0Var.c : false;
        boolean z22 = (i & 8) != 0 ? caj0Var.d : z3;
        String str2 = caj0Var.e;
        j6d0 j6d0Var2 = (i & 32) != 0 ? caj0Var.f : j6d0Var;
        boolean z23 = (i & 64) != 0 ? caj0Var.g : z4;
        boolean z24 = (i & 128) != 0 ? caj0Var.h : z5;
        mrh0 mrh0Var2 = (i & 256) != 0 ? caj0Var.i : mrh0Var;
        baj0 baj0Var2 = (i & 512) != 0 ? caj0Var.j : baj0Var;
        caj0Var.getClass();
        boolean z25 = (i & 2048) != 0 ? caj0Var.k : z6;
        boolean z26 = (i & 4096) != 0 ? caj0Var.l : z7;
        boolean z27 = (i & 8192) != 0 ? caj0Var.m : z8;
        boolean z28 = (i & 16384) != 0 ? caj0Var.n : z9;
        boolean z29 = (32768 & i) != 0 ? caj0Var.o : z10;
        boolean z30 = (65536 & i) != 0 ? caj0Var.p : z11;
        boolean z31 = (131072 & i) != 0 ? caj0Var.q : z12;
        boolean z32 = (262144 & i) != 0 ? caj0Var.r : z13;
        String str3 = (524288 & i) != 0 ? caj0Var.s : str;
        boolean z33 = (1048576 & i) != 0 ? caj0Var.t : z14;
        boolean z34 = (2097152 & i) != 0 ? caj0Var.u : z15;
        boolean z35 = (4194304 & i) != 0 ? caj0Var.v : z16;
        boolean z36 = (8388608 & i) != 0 ? caj0Var.w : z17;
        boolean z37 = (i & 16777216) != 0 ? caj0Var.x : z18;
        caj0Var.getClass();
        mrh0Var2.getClass();
        return new caj0(z19, z20, z21, z22, str2, j6d0Var2, z23, z24, mrh0Var2, baj0Var2, z25, z26, z27, z28, z29, z30, z31, z32, str3, z33, z34, z35, z36, z37);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caj0)) {
            return false;
        }
        caj0 caj0Var = (caj0) obj;
        return this.f4014a == caj0Var.f4014a && this.b == caj0Var.b && this.c == caj0Var.c && this.d == caj0Var.d && this.e.equals(caj0Var.e) && Intrinsics.d(this.f, caj0Var.f) && this.g == caj0Var.g && this.h == caj0Var.h && this.i == caj0Var.i && Intrinsics.d(this.j, caj0Var.j) && this.k == caj0Var.k && this.l == caj0Var.l && this.m == caj0Var.m && this.n == caj0Var.n && this.o == caj0Var.o && this.p == caj0Var.p && this.q == caj0Var.q && this.r == caj0Var.r && this.s.equals(caj0Var.s) && this.t == caj0Var.t && this.u == caj0Var.u && this.v == caj0Var.v && this.w == caj0Var.w && this.x == caj0Var.x;
    }

    public final int hashCode() {
        int iB = ua80.b(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f4014a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        j6d0 j6d0Var = this.f;
        int iHashCode = (this.i.hashCode() + brm0.e(brm0.e((iB + (j6d0Var == null ? 0 : j6d0Var.hashCode())) * 31, 31, this.g), 31, this.h)) * 31;
        baj0 baj0Var = this.j;
        return Boolean.hashCode(this.x) + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (baj0Var != null ? baj0Var.hashCode() : 0)) * 31, 31, true), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SettingsStateModel(showLoader=", ", scrollToTop=", ", showShimmers=", this.f4014a, this.b);
        ua80.u(", isAuthorized=", ", appInfo=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", proxySettingsModel=");
        sbQ.append(this.f);
        sbQ.append(", needUpdateApp=");
        ua80.u(", profileInfoHasAuthenticator=", ", securityLevel=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", oneClickBetModel=");
        sbQ.append(this.j);
        sbQ.append(", securitySectionEnabled=true, isVerificationCompleted=");
        ua80.u(", isPayInBlock=", ", isPayOutBlock=", sbQ, this.k, this.l);
        ua80.u(", switchEnabled=", ", switchQrChecked=", sbQ, this.m, this.n);
        ua80.u(", switchGameCurrencyPopUpChecked=", ", profileInfoQrAuth=", sbQ, this.o, this.p);
        ua80.u(", shareAppEnabled=", ", cacheSize=", sbQ, this.q, this.r);
        brm0.C(this.s, ", cacheCleanEnable=", ", wrongTimeEnabled=", sbQ, this.t);
        ua80.u(", deleteAccountButtonVisible=", ", needToShowMailingWarning=", sbQ, this.u, this.v);
        return ohs0.p(", hasAuthenticator=", Separators.RPAREN, sbQ, this.w, this.x);
    }
}
