package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class twi0 {
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
    public final boolean R;
    public final int S;
    public final boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34651a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
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

    public twi0(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, String str6, List list, j6d0 j6d0Var, boolean z4, boolean z5, mrh0 mrh0Var, baj0 baj0Var, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str7, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, tsh0 tsh0Var, String str8, boolean z19, boolean z20, sff0 sff0Var, v8d v8dVar, k0j0 k0j0Var, boolean z21, String str9, int i, List list2, boolean z22, int i2, boolean z23, boolean z24, int i3, boolean z25) {
        list.getClass();
        this.f34651a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = list;
        this.k = j6d0Var;
        this.l = z4;
        this.m = z5;
        this.n = mrh0Var;
        this.o = baj0Var;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = z12;
        this.w = z13;
        this.x = str7;
        this.y = z14;
        this.z = z15;
        this.A = z16;
        this.B = z17;
        this.C = z18;
        this.D = tsh0Var;
        this.E = str8;
        this.F = z19;
        this.G = z20;
        this.H = sff0Var;
        this.I = v8dVar;
        this.J = k0j0Var;
        this.K = z21;
        this.L = str9;
        this.M = i;
        this.N = list2;
        this.O = z22;
        this.P = i2;
        this.Q = z23;
        this.R = z24;
        this.S = i3;
        this.T = z25;
    }

    public static twi0 a(twi0 twi0Var, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, j6d0 j6d0Var, boolean z3, boolean z4, mrh0 mrh0Var, baj0 baj0Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str7, boolean z13, boolean z14, boolean z15, boolean z16, int i, boolean z17, boolean z18, int i2, int i3, int i4) {
        boolean z19 = (i3 & 1) != 0 ? twi0Var.f34651a : z;
        boolean z20 = (i3 & 2) != 0 ? twi0Var.b : false;
        boolean z21 = (i3 & 4) != 0 ? twi0Var.c : z2;
        String str8 = (i3 & 8) != 0 ? twi0Var.d : str;
        String str9 = (i3 & 16) != 0 ? twi0Var.e : str2;
        String str10 = (i3 & 32) != 0 ? twi0Var.f : str3;
        String str11 = (i3 & 64) != 0 ? twi0Var.g : str4;
        String str12 = (i3 & 128) != 0 ? twi0Var.h : str5;
        String str13 = (i3 & 256) != 0 ? twi0Var.i : str6;
        List list = (i3 & 512) != 0 ? twi0Var.j : arrayList;
        j6d0 j6d0Var2 = (i3 & 1024) != 0 ? twi0Var.k : j6d0Var;
        boolean z22 = (i3 & 2048) != 0 ? twi0Var.l : z3;
        boolean z23 = (i3 & 4096) != 0 ? twi0Var.m : z4;
        mrh0 mrh0Var2 = (i3 & 8192) != 0 ? twi0Var.n : mrh0Var;
        baj0 baj0Var2 = (i3 & 16384) != 0 ? twi0Var.o : baj0Var;
        twi0Var.getClass();
        boolean z24 = (i3 & 65536) != 0 ? twi0Var.p : z5;
        boolean z25 = (i3 & 131072) != 0 ? twi0Var.q : z6;
        boolean z26 = (i3 & 262144) != 0 ? twi0Var.r : z7;
        boolean z27 = (524288 & i3) != 0 ? twi0Var.s : z8;
        boolean z28 = (1048576 & i3) != 0 ? twi0Var.t : z9;
        boolean z29 = (2097152 & i3) != 0 ? twi0Var.u : z10;
        boolean z30 = (4194304 & i3) != 0 ? twi0Var.v : z11;
        boolean z31 = (8388608 & i3) != 0 ? twi0Var.w : z12;
        String str14 = (16777216 & i3) != 0 ? twi0Var.x : str7;
        boolean z32 = (33554432 & i3) != 0 ? twi0Var.y : z13;
        boolean z33 = (67108864 & i3) != 0 ? twi0Var.z : z14;
        boolean z34 = (134217728 & i3) != 0 ? twi0Var.A : z15;
        boolean z35 = (i3 & 268435456) != 0 ? twi0Var.B : z16;
        boolean z36 = twi0Var.C;
        tsh0 tsh0Var = twi0Var.D;
        String str15 = twi0Var.E;
        boolean z37 = twi0Var.F;
        boolean z38 = twi0Var.G;
        sff0 sff0Var = twi0Var.H;
        v8d v8dVar = twi0Var.I;
        k0j0 k0j0Var = twi0Var.J;
        boolean z39 = twi0Var.K;
        twi0Var.getClass();
        String str16 = twi0Var.L;
        int i5 = (i4 & 256) != 0 ? twi0Var.M : i;
        twi0Var.getClass();
        List list2 = twi0Var.N;
        boolean z40 = twi0Var.O;
        int i6 = twi0Var.P;
        twi0Var.getClass();
        twi0Var.getClass();
        twi0Var.getClass();
        boolean z41 = (i4 & 65536) != 0 ? twi0Var.Q : z17;
        boolean z42 = (i4 & 131072) != 0 ? twi0Var.R : z18;
        int i7 = (i4 & 262144) != 0 ? twi0Var.S : i2;
        boolean z43 = twi0Var.T;
        twi0Var.getClass();
        twi0Var.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        list.getClass();
        mrh0Var2.getClass();
        return new twi0(z19, z20, z21, str8, str9, str10, str11, str12, str13, list, j6d0Var2, z22, z23, mrh0Var2, baj0Var2, z24, z25, z26, z27, z28, z29, z30, z31, str14, z32, z33, z34, z35, z36, tsh0Var, str15, z37, z38, sff0Var, v8dVar, k0j0Var, z39, str16, i5, list2, z40, i6, z41, z42, i7, z43);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof twi0) {
            twi0 twi0Var = (twi0) obj;
            if (this.f34651a == twi0Var.f34651a && this.b == twi0Var.b && this.c == twi0Var.c && this.d.equals(twi0Var.d) && this.e.equals(twi0Var.e) && this.f.equals(twi0Var.f) && this.g.equals(twi0Var.g) && this.h.equals(twi0Var.h) && this.i.equals(twi0Var.i) && Intrinsics.d(this.j, twi0Var.j) && Intrinsics.d(this.k, twi0Var.k) && this.l == twi0Var.l && this.m == twi0Var.m && this.n == twi0Var.n && Intrinsics.d(this.o, twi0Var.o) && this.p == twi0Var.p && this.q == twi0Var.q && this.r == twi0Var.r && this.s == twi0Var.s && this.t == twi0Var.t && this.u == twi0Var.u && this.v == twi0Var.v && this.w == twi0Var.w && this.x.equals(twi0Var.x) && this.y == twi0Var.y && this.z == twi0Var.z && this.A == twi0Var.A && this.B == twi0Var.B && this.C == twi0Var.C && this.D == twi0Var.D && this.E.equals(twi0Var.E) && this.F == twi0Var.F && this.G == twi0Var.G && this.H.equals(twi0Var.H) && this.I == twi0Var.I && this.J.equals(twi0Var.J) && this.K == twi0Var.K && this.L.equals(twi0Var.L) && this.M == twi0Var.M && this.N.equals(twi0Var.N) && this.O == twi0Var.O && this.P == twi0Var.P && this.Q == twi0Var.Q && this.R == twi0Var.R && this.S == twi0Var.S && this.T == twi0Var.T) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f34651a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        j6d0 j6d0Var = this.k;
        int iHashCode = (this.n.hashCode() + brm0.e(brm0.e((iA + (j6d0Var == null ? 0 : j6d0Var.hashCode())) * 31, 31, this.l), 31, this.m)) * 31;
        baj0 baj0Var = this.o;
        return Boolean.hashCode(false) + brm0.e(twn.a(this.S, brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_info_circle, twn.a(this.P, brm0.e(dw9.a(brm0.e(twn.a(this.M, ua80.b(brm0.e(brm0.e((this.J.hashCode() + ((this.I.hashCode() + cs0.c(this.H, brm0.e(brm0.e(ua80.b((this.D.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (baj0Var == null ? 0 : baj0Var.hashCode())) * 31, 31, true), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C)) * 31, 31, this.E), 31, this.F), 31, this.G), 31)) * 31)) * 31, 31, this.K), 31, false), 31, this.L), 31), 31, false), 31, this.N), 31, this.O), 31), 31), 961, false), 31, this.Q), 31, this.R), 31), 31, this.T);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("SettingsAccordionStateModel(showLoader=", ", showShimmers=", ", isAuthorized=", this.f34651a, this.b);
        f140.s(", appInfo=", this.d, ", headerTitle=", sbQ, this.c);
        f140.v(sbQ, this.e, ", headerSubtitle=", this.f, ", balanceName=");
        f140.v(sbQ, this.g, ", balanceSum=", this.h, ", balanceCurrency=");
        cs0.y(this.i, ", expandedGroups=", ", proxySettingsModel=", sbQ, this.j);
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
        ua80.q(this.P, ", editIconRes=", ", infoIconResId=", sbQ, this.O);
        brm0.w(R.drawable.ic_glyph_info_circle, ", authenticatorChanged=false, lastBalanceManagementAction=null, qrChanged=", ", updated=", sbQ, this.Q);
        ua80.q(this.S, ", testCount=", ", hasAuthenticator=", sbQ, this.R);
        return rw2.p(sbQ, this.T, ", isPrivacyOptionsFormAvailable=false)");
    }
}
