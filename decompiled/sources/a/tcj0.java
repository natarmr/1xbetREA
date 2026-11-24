package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tcj0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final tsh0 D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final sff0 H;
    public final v8d I;
    public final k0j0 J;
    public final boolean K;
    public final String L;
    public final int M;
    public final List N;
    public final boolean O;
    public final int P;
    public final boolean Q;
    public final hh5 R;
    public final boolean S;
    public final boolean T;
    public final int U;
    public final boolean V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33722a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final j6d0 k;
    public final boolean l;
    public final boolean m;
    public final mrh0 n;
    public final baj0 o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public tcj0(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, j6d0 j6d0Var, boolean z5, boolean z6, mrh0 mrh0Var, baj0 baj0Var, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str7, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, tsh0 tsh0Var, String str8, boolean z20, boolean z21, sff0 sff0Var, v8d v8dVar, k0j0 k0j0Var, boolean z22, String str9, int i, List list, boolean z23, int i2, boolean z24, hh5 hh5Var, boolean z25, boolean z26, int i3, boolean z27) {
        this.f33722a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = z4;
        this.k = j6d0Var;
        this.l = z5;
        this.m = z6;
        this.n = mrh0Var;
        this.o = baj0Var;
        this.p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
        this.t = z11;
        this.u = z12;
        this.v = z13;
        this.w = z14;
        this.x = str7;
        this.y = z15;
        this.z = z16;
        this.A = z17;
        this.B = z18;
        this.C = z19;
        this.D = tsh0Var;
        this.E = str8;
        this.F = z20;
        this.G = z21;
        this.H = sff0Var;
        this.I = v8dVar;
        this.J = k0j0Var;
        this.K = z22;
        this.L = str9;
        this.M = i;
        this.N = list;
        this.O = z23;
        this.P = i2;
        this.Q = z24;
        this.R = hh5Var;
        this.S = z25;
        this.T = z26;
        this.U = i3;
        this.V = z27;
    }

    public static tcj0 a(tcj0 tcj0Var, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, j6d0 j6d0Var, boolean z4, boolean z5, mrh0 mrh0Var, baj0 baj0Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str5, boolean z14, boolean z15, boolean z16, boolean z17, int i, boolean z18, hh5 hh5Var, boolean z19, boolean z20, int i2, int i3, int i4) {
        boolean z21 = (i3 & 1) != 0 ? tcj0Var.f33722a : z;
        boolean z22 = (i3 & 2) != 0 ? tcj0Var.b : false;
        boolean z23 = (i3 & 4) != 0 ? tcj0Var.c : z2;
        String str6 = (i3 & 8) != 0 ? tcj0Var.d : str;
        String str7 = tcj0Var.e;
        String str8 = tcj0Var.f;
        String str9 = (i3 & 64) != 0 ? tcj0Var.g : str2;
        String str10 = (i3 & 128) != 0 ? tcj0Var.h : str3;
        String str11 = (i3 & 256) != 0 ? tcj0Var.i : str4;
        boolean z24 = (i3 & 512) != 0 ? tcj0Var.j : z3;
        j6d0 j6d0Var2 = (i3 & 1024) != 0 ? tcj0Var.k : j6d0Var;
        boolean z25 = (i3 & 2048) != 0 ? tcj0Var.l : z4;
        boolean z26 = (i3 & 4096) != 0 ? tcj0Var.m : z5;
        mrh0 mrh0Var2 = (i3 & 8192) != 0 ? tcj0Var.n : mrh0Var;
        baj0 baj0Var2 = (i3 & 16384) != 0 ? tcj0Var.o : baj0Var;
        tcj0Var.getClass();
        boolean z27 = (i3 & 65536) != 0 ? tcj0Var.p : z6;
        boolean z28 = (i3 & 131072) != 0 ? tcj0Var.q : z7;
        boolean z29 = (i3 & 262144) != 0 ? tcj0Var.r : z8;
        boolean z30 = (524288 & i3) != 0 ? tcj0Var.s : z9;
        boolean z31 = (1048576 & i3) != 0 ? tcj0Var.t : z10;
        boolean z32 = (2097152 & i3) != 0 ? tcj0Var.u : z11;
        boolean z33 = (4194304 & i3) != 0 ? tcj0Var.v : z12;
        boolean z34 = (8388608 & i3) != 0 ? tcj0Var.w : z13;
        String str12 = (16777216 & i3) != 0 ? tcj0Var.x : str5;
        boolean z35 = (33554432 & i3) != 0 ? tcj0Var.y : z14;
        boolean z36 = (67108864 & i3) != 0 ? tcj0Var.z : z15;
        boolean z37 = (134217728 & i3) != 0 ? tcj0Var.A : z16;
        boolean z38 = (i3 & 268435456) != 0 ? tcj0Var.B : z17;
        boolean z39 = tcj0Var.C;
        tsh0 tsh0Var = tcj0Var.D;
        String str13 = tcj0Var.E;
        boolean z40 = tcj0Var.F;
        boolean z41 = tcj0Var.G;
        sff0 sff0Var = tcj0Var.H;
        v8d v8dVar = tcj0Var.I;
        k0j0 k0j0Var = tcj0Var.J;
        boolean z42 = tcj0Var.K;
        tcj0Var.getClass();
        String str14 = tcj0Var.L;
        int i5 = (i4 & 256) != 0 ? tcj0Var.M : i;
        tcj0Var.getClass();
        List list = tcj0Var.N;
        boolean z43 = tcj0Var.O;
        int i6 = tcj0Var.P;
        tcj0Var.getClass();
        boolean z44 = (i4 & 16384) != 0 ? tcj0Var.Q : z18;
        hh5 hh5Var2 = (32768 & i4) != 0 ? tcj0Var.R : hh5Var;
        boolean z45 = (i4 & 65536) != 0 ? tcj0Var.S : z19;
        boolean z46 = (i4 & 131072) != 0 ? tcj0Var.T : z20;
        int i7 = (i4 & 262144) != 0 ? tcj0Var.U : i2;
        boolean z47 = tcj0Var.V;
        tcj0Var.getClass();
        tcj0Var.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        mrh0Var2.getClass();
        return new tcj0(z21, z22, z23, str6, str7, str8, str9, str10, str11, z24, j6d0Var2, z25, z26, mrh0Var2, baj0Var2, z27, z28, z29, z30, z31, z32, z33, z34, str12, z35, z36, z37, z38, z39, tsh0Var, str13, z40, z41, sff0Var, v8dVar, k0j0Var, z42, str14, i5, list, z43, i6, z44, hh5Var2, z45, z46, i7, z47);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tcj0) {
            tcj0 tcj0Var = (tcj0) obj;
            if (this.f33722a == tcj0Var.f33722a && this.b == tcj0Var.b && this.c == tcj0Var.c && this.d.equals(tcj0Var.d) && this.e.equals(tcj0Var.e) && this.f.equals(tcj0Var.f) && this.g.equals(tcj0Var.g) && this.h.equals(tcj0Var.h) && this.i.equals(tcj0Var.i) && this.j == tcj0Var.j && Intrinsics.d(this.k, tcj0Var.k) && this.l == tcj0Var.l && this.m == tcj0Var.m && this.n == tcj0Var.n && Intrinsics.d(this.o, tcj0Var.o) && this.p == tcj0Var.p && this.q == tcj0Var.q && this.r == tcj0Var.r && this.s == tcj0Var.s && this.t == tcj0Var.t && this.u == tcj0Var.u && this.v == tcj0Var.v && this.w == tcj0Var.w && this.x.equals(tcj0Var.x) && this.y == tcj0Var.y && this.z == tcj0Var.z && this.A == tcj0Var.A && this.B == tcj0Var.B && this.C == tcj0Var.C && this.D == tcj0Var.D && this.E.equals(tcj0Var.E) && this.F == tcj0Var.F && this.G == tcj0Var.G && this.H.equals(tcj0Var.H) && this.I == tcj0Var.I && this.J.equals(tcj0Var.J) && this.K == tcj0Var.K && this.L.equals(tcj0Var.L) && this.M == tcj0Var.M && this.N.equals(tcj0Var.N) && this.O == tcj0Var.O && this.P == tcj0Var.P && this.Q == tcj0Var.Q && this.R == tcj0Var.R && this.S == tcj0Var.S && this.T == tcj0Var.T && this.U == tcj0Var.U && this.V == tcj0Var.V) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f33722a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        j6d0 j6d0Var = this.k;
        int iHashCode = (this.n.hashCode() + brm0.e(brm0.e((iE + (j6d0Var == null ? 0 : j6d0Var.hashCode())) * 31, 31, this.l), 31, this.m)) * 31;
        baj0 baj0Var = this.o;
        int iE2 = brm0.e(twn.a(R.drawable.ic_glyph_info_circle, twn.a(this.P, brm0.e(dw9.a(brm0.e(twn.a(this.M, ua80.b(brm0.e(brm0.e((this.J.hashCode() + ((this.I.hashCode() + cs0.c(this.H, brm0.e(brm0.e(ua80.b((this.D.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (baj0Var == null ? 0 : baj0Var.hashCode())) * 31, 31, true), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C)) * 31, 31, this.E), 31, this.F), 31, this.G), 31)) * 31)) * 31, 31, this.K), 31, false), 31, this.L), 31), 31, false), 31, this.N), 31, this.O), 31), 31), 31, this.Q);
        hh5 hh5Var = this.R;
        return Boolean.hashCode(false) + brm0.e(twn.a(this.U, brm0.e(brm0.e((iE2 + (hh5Var == null ? 0 : hh5Var.hashCode())) * 31, 31, this.S), 31, this.T), 31), 31, this.V);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SettingsTabsStetModel(showLoader=", ", showShimmers=", ", isAuthorized=", this.f33722a, this.b);
        f140.s(", appInfo=", this.d, ", headerTitle=", sbQ, this.c);
        f140.v(sbQ, this.e, ", headerSubtitle=", this.f, ", balanceName=");
        f140.v(sbQ, this.g, ", balanceSum=", this.h, ", currency=");
        brm0.C(this.i, ", showLoadingBalance=", ", proxySettingsModel=", sbQ, this.j);
        sbQ.append(this.k);
        sbQ.append(", needUpdateApp=");
        sbQ.append(this.l);
        sbQ.append(", profileInfoHasAuthenticator=");
        sbQ.append(this.m);
        sbQ.append(", securityLevel=");
        sbQ.append(this.n);
        sbQ.append(", oneClickBetModel=");
        sbQ.append(this.o);
        sbQ.append(", securitySectionEnabled=true, isVerificationCompleted=");
        sbQ.append(this.p);
        sbQ.append(", isPayInBlock=");
        ua80.u(", isPayOutBlock=", ", switchEnabled=", sbQ, this.q, this.r);
        ua80.u(", switchQrChecked=", ", switchGameCurrencyPopUpChecked=", sbQ, this.s, this.t);
        ua80.u(", profileInfoQrAuth=", ", shareAppEnabled=", sbQ, this.u, this.v);
        f140.s(", cacheSize=", this.x, ", cacheCleanEnable=", sbQ, this.w);
        ua80.u(", wrongTimeEnabled=", ", deleteAccountButtonVisible=", sbQ, this.y, this.z);
        ua80.u(", lastConnection=", ", newAccountLogonReg=", sbQ, this.A, this.B);
        sbQ.append(this.C);
        sbQ.append(", securitySettingsStyle=");
        sbQ.append(this.D);
        sbQ.append(", paymentHost=");
        brm0.C(this.E, ", allowedProxySettings=", ", isNeedVerification=", sbQ, this.F);
        sbQ.append(this.G);
        sbQ.append(", remoteConfigModel=");
        sbQ.append(this.H);
        sbQ.append(", commonConfig=");
        sbQ.append(this.I);
        sbQ.append(", settingsConfig=");
        sbQ.append(this.J);
        sbQ.append(", isBettingDisabled=");
        f140.s(", isTestBuild=false, appNameAndVersion=", this.L, ", coefTypeName=", sbQ, this.K);
        ohs0.v(this.M, ", demoMode=false, availableTheme=", ", gameCurrencyPopUpEnabled=", sbQ, this.N);
        ua80.q(this.P, ", editIconRes=", ", infoIconRes=", sbQ, this.O);
        brm0.w(R.drawable.ic_glyph_info_circle, ", authenticatorChanged=", ", lastBalanceManagementAction=", sbQ, this.Q);
        sbQ.append(this.R);
        sbQ.append(", qrChanged=");
        sbQ.append(this.S);
        sbQ.append(", updated=");
        ua80.q(this.U, ", testCount=", ", hasAuthenticator=", sbQ, this.T);
        return rw2.p(sbQ, this.V, ", isPrivacyOptionsFormAvailable=false)");
    }
}
