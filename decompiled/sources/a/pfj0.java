package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class pfj0 {
    public final boolean A;
    public final boolean B;
    public final tsh0 C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final sff0 G;
    public final v8d H;
    public final k0j0 I;
    public final boolean J;
    public final String K;
    public final int L;
    public final List M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final boolean R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26909a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final j6d0 j;
    public final boolean k;
    public final boolean l;
    public final jph0 m;
    public final baj0 n;
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

    public pfj0(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, String str6, j6d0 j6d0Var, boolean z4, boolean z5, jph0 jph0Var, baj0 baj0Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str7, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, tsh0 tsh0Var, String str8, boolean z19, boolean z20, sff0 sff0Var, v8d v8dVar, k0j0 k0j0Var, boolean z21, String str9, int i, List list, boolean z22, boolean z23, boolean z24, int i2, boolean z25) {
        this.f26909a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = j6d0Var;
        this.k = z4;
        this.l = z5;
        this.m = jph0Var;
        this.n = baj0Var;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
        this.t = z11;
        this.u = z12;
        this.v = z13;
        this.w = str7;
        this.x = z14;
        this.y = z15;
        this.z = z16;
        this.A = z17;
        this.B = z18;
        this.C = tsh0Var;
        this.D = str8;
        this.E = z19;
        this.F = z20;
        this.G = sff0Var;
        this.H = v8dVar;
        this.I = k0j0Var;
        this.J = z21;
        this.K = str9;
        this.L = i;
        this.M = list;
        this.N = z22;
        this.O = z23;
        this.P = z24;
        this.Q = i2;
        this.R = z25;
    }

    public static pfj0 a(pfj0 pfj0Var, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, j6d0 j6d0Var, boolean z3, boolean z4, jph0 jph0Var, baj0 baj0Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str7, boolean z13, boolean z14, boolean z15, boolean z16, int i, boolean z17, boolean z18, int i2, int i3, int i4) {
        boolean z19 = (i3 & 1) != 0 ? pfj0Var.f26909a : z;
        boolean z20 = (i3 & 2) != 0 ? pfj0Var.b : false;
        boolean z21 = (i3 & 4) != 0 ? pfj0Var.c : z2;
        String str8 = (i3 & 8) != 0 ? pfj0Var.d : str;
        String str9 = (i3 & 16) != 0 ? pfj0Var.e : str2;
        String str10 = (i3 & 32) != 0 ? pfj0Var.f : str3;
        String str11 = (i3 & 64) != 0 ? pfj0Var.g : str4;
        String str12 = (i3 & 128) != 0 ? pfj0Var.h : str5;
        String str13 = (i3 & 256) != 0 ? pfj0Var.i : str6;
        j6d0 j6d0Var2 = (i3 & 512) != 0 ? pfj0Var.j : j6d0Var;
        boolean z22 = (i3 & 1024) != 0 ? pfj0Var.k : z3;
        boolean z23 = (i3 & 2048) != 0 ? pfj0Var.l : z4;
        jph0 jph0Var2 = (i3 & 4096) != 0 ? pfj0Var.m : jph0Var;
        baj0 baj0Var2 = (i3 & 8192) != 0 ? pfj0Var.n : baj0Var;
        pfj0Var.getClass();
        boolean z24 = (i3 & 32768) != 0 ? pfj0Var.o : z5;
        boolean z25 = (i3 & 65536) != 0 ? pfj0Var.p : z6;
        boolean z26 = (i3 & 131072) != 0 ? pfj0Var.q : z7;
        boolean z27 = (262144 & i3) != 0 ? pfj0Var.r : z8;
        boolean z28 = (524288 & i3) != 0 ? pfj0Var.s : z9;
        boolean z29 = (1048576 & i3) != 0 ? pfj0Var.t : z10;
        boolean z30 = (2097152 & i3) != 0 ? pfj0Var.u : z11;
        boolean z31 = (4194304 & i3) != 0 ? pfj0Var.v : z12;
        String str14 = (8388608 & i3) != 0 ? pfj0Var.w : str7;
        boolean z32 = (16777216 & i3) != 0 ? pfj0Var.x : z13;
        boolean z33 = (33554432 & i3) != 0 ? pfj0Var.y : z14;
        boolean z34 = (67108864 & i3) != 0 ? pfj0Var.z : z15;
        boolean z35 = (i3 & 134217728) != 0 ? pfj0Var.A : z16;
        boolean z36 = pfj0Var.B;
        tsh0 tsh0Var = pfj0Var.C;
        String str15 = pfj0Var.D;
        boolean z37 = pfj0Var.E;
        boolean z38 = pfj0Var.F;
        sff0 sff0Var = pfj0Var.G;
        v8d v8dVar = pfj0Var.H;
        k0j0 k0j0Var = pfj0Var.I;
        boolean z39 = pfj0Var.J;
        pfj0Var.getClass();
        String str16 = pfj0Var.K;
        int i5 = (i4 & 128) != 0 ? pfj0Var.L : i;
        pfj0Var.getClass();
        List list = pfj0Var.M;
        boolean z40 = pfj0Var.N;
        pfj0Var.getClass();
        pfj0Var.getClass();
        pfj0Var.getClass();
        pfj0Var.getClass();
        boolean z41 = (i4 & 32768) != 0 ? pfj0Var.O : z17;
        boolean z42 = (i4 & 65536) != 0 ? pfj0Var.P : z18;
        int i6 = (i4 & 131072) != 0 ? pfj0Var.Q : i2;
        boolean z43 = pfj0Var.R;
        pfj0Var.getClass();
        pfj0Var.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        jph0Var2.getClass();
        return new pfj0(z19, z20, z21, str8, str9, str10, str11, str12, str13, j6d0Var2, z22, z23, jph0Var2, baj0Var2, z24, z25, z26, z27, z28, z29, z30, z31, str14, z32, z33, z34, z35, z36, tsh0Var, str15, z37, z38, sff0Var, v8dVar, k0j0Var, z39, str16, i5, list, z40, z41, z42, i6, z43);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pfj0) {
            pfj0 pfj0Var = (pfj0) obj;
            if (this.f26909a == pfj0Var.f26909a && this.b == pfj0Var.b && this.c == pfj0Var.c && this.d.equals(pfj0Var.d) && this.e.equals(pfj0Var.e) && this.f.equals(pfj0Var.f) && this.g.equals(pfj0Var.g) && this.h.equals(pfj0Var.h) && this.i.equals(pfj0Var.i) && Intrinsics.d(this.j, pfj0Var.j) && this.k == pfj0Var.k && this.l == pfj0Var.l && this.m.equals(pfj0Var.m) && Intrinsics.d(this.n, pfj0Var.n) && this.o == pfj0Var.o && this.p == pfj0Var.p && this.q == pfj0Var.q && this.r == pfj0Var.r && this.s == pfj0Var.s && this.t == pfj0Var.t && this.u == pfj0Var.u && this.v == pfj0Var.v && this.w.equals(pfj0Var.w) && this.x == pfj0Var.x && this.y == pfj0Var.y && this.z == pfj0Var.z && this.A == pfj0Var.A && this.B == pfj0Var.B && this.C == pfj0Var.C && this.D.equals(pfj0Var.D) && this.E == pfj0Var.E && this.F == pfj0Var.F && this.G.equals(pfj0Var.G) && this.H == pfj0Var.H && this.I.equals(pfj0Var.I) && this.J == pfj0Var.J && this.K.equals(pfj0Var.K) && this.L == pfj0Var.L && this.M.equals(pfj0Var.M) && this.N == pfj0Var.N && this.O == pfj0Var.O && this.P == pfj0Var.P && this.Q == pfj0Var.Q && this.R == pfj0Var.R) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f26909a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        j6d0 j6d0Var = this.j;
        int iHashCode = (this.m.hashCode() + brm0.e(brm0.e((iB + (j6d0Var == null ? 0 : j6d0Var.hashCode())) * 31, 31, this.k), 31, this.l)) * 31;
        baj0 baj0Var = this.n;
        return Boolean.hashCode(false) + brm0.e(twn.a(this.Q, brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_info_circle, twn.a(R.drawable.ic_glyph_edit, brm0.e(dw9.a(brm0.e(twn.a(this.L, ua80.b(brm0.e(brm0.e((this.I.hashCode() + ((this.H.hashCode() + cs0.c(this.G, brm0.e(brm0.e(ua80.b((this.C.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (baj0Var == null ? 0 : baj0Var.hashCode())) * 31, 31, true), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B)) * 31, 31, this.D), 31, this.E), 31, this.F), 31)) * 31)) * 31, 31, this.J), 31, false), 31, this.K), 31), 31, false), 31, this.M), 31, this.N), 31), 31), 961, false), 31, this.O), 31, this.P), 31), 31, this.R);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SettingsWidgetsStateModel(showLoader=", ", showShimmers=", ", isAuthorized=", this.f26909a, this.b);
        f140.s(", appInfo=", this.d, ", headerTitle=", sbQ, this.c);
        f140.v(sbQ, this.e, ", headerSubtitle=", this.f, ", balanceName=");
        f140.v(sbQ, this.g, ", balanceSum=", this.h, ", balanceCurrency=");
        sbQ.append(this.i);
        sbQ.append(", proxySettingsModel=");
        sbQ.append(this.j);
        sbQ.append(", needUpdateApp=");
        ua80.u(", profileInfoHasAuthenticator=", ", securityDataModel=", sbQ, this.k, this.l);
        sbQ.append(this.m);
        sbQ.append(", oneClickBetModel=");
        sbQ.append(this.n);
        sbQ.append(", securitySectionEnabled=true, isVerificationCompleted=");
        ua80.u(", isPayInBlock=", ", isPayOutBlock=", sbQ, this.o, this.p);
        ua80.u(", switchEnabled=", ", switchQrChecked=", sbQ, this.q, this.r);
        ua80.u(", switchGameCurrencyPopUpChecked=", ", profileInfoQrAuth=", sbQ, this.s, this.t);
        ua80.u(", shareAppEnabled=", ", cacheSize=", sbQ, this.u, this.v);
        brm0.C(this.w, ", cacheCleanEnable=", ", wrongTimeEnabled=", sbQ, this.x);
        ua80.u(", deleteAccountButtonVisible=", ", lastConnection=", sbQ, this.y, this.z);
        ua80.u(", newAccountLogonReg=", ", securitySettingsStyle=", sbQ, this.A, this.B);
        sbQ.append(this.C);
        sbQ.append(", paymentHost=");
        sbQ.append(this.D);
        sbQ.append(", allowedProxySettings=");
        ua80.u(", isNeedVerification=", ", remoteConfigModel=", sbQ, this.E, this.F);
        sbQ.append(this.G);
        sbQ.append(", commonConfig=");
        sbQ.append(this.H);
        sbQ.append(", settingsConfig=");
        sbQ.append(this.I);
        sbQ.append(", isBettingDisabled=");
        sbQ.append(this.J);
        sbQ.append(", isTestBuild=false, appNameAndVersion=");
        twn.w(this.L, this.K, ", coefTypeName=", ", demoMode=false, availableTheme=", sbQ);
        rz4.z(sbQ, ", gameCurrencyPopUpEnabled=", this.M, ", editIconRes=", this.N);
        axq.r(R.drawable.ic_glyph_edit, R.drawable.ic_glyph_info_circle, ", infoIconResId=", ", authenticatorChanged=false, lastBalanceManagementAction=null, qrChanged=", sbQ);
        ua80.u(", updated=", ", testCount=", sbQ, this.O, this.P);
        return ohs0.k(this.Q, ", hasAuthenticator=", ", isPrivacyOptionsFormAvailable=false)", sbQ, this.R);
    }
}
