package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pnp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hop f27300a;
    public final boolean b;
    public final String c;
    public final f9h0 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final a4x i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final a4x m;
    public final j700 n;
    public final a4x o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final zmb t;
    public final ghq0 u;

    public pnp(hop hopVar, boolean z, String str, f9h0 f9h0Var, String str2, String str3, boolean z2, boolean z3, a4x a4xVar, boolean z4, int i, boolean z5, a4x a4xVar2, j700 j700Var, a4x a4xVar3, boolean z6, boolean z7, boolean z8, boolean z9, zmb zmbVar, ghq0 ghq0Var) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f27300a = hopVar;
        this.b = z;
        this.c = str;
        this.d = f9h0Var;
        this.e = str2;
        this.f = str3;
        this.g = z2;
        this.h = z3;
        this.i = a4xVar;
        this.j = z4;
        this.k = i;
        this.l = z5;
        this.m = a4xVar2;
        this.n = j700Var;
        this.o = a4xVar3;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = zmbVar;
        this.u = ghq0Var;
    }

    public static pnp a(pnp pnpVar, hop hopVar, boolean z, f9h0 f9h0Var, String str, boolean z2, boolean z3, a4x a4xVar, boolean z4, int i, a4x a4xVar2, boolean z5, boolean z6, boolean z7, boolean z8, zmb zmbVar, ghq0 ghq0Var, int i2) {
        hop hopVar2 = (i2 & 1) != 0 ? pnpVar.f27300a : hopVar;
        boolean z9 = (i2 & 2) != 0 ? pnpVar.b : z;
        String str2 = pnpVar.c;
        f9h0 f9h0Var2 = (i2 & 8) != 0 ? pnpVar.d : f9h0Var;
        String str3 = pnpVar.e;
        String str4 = (i2 & 32) != 0 ? pnpVar.f : str;
        boolean z10 = (i2 & 64) != 0 ? pnpVar.g : z2;
        boolean z11 = (i2 & 128) != 0 ? pnpVar.h : z3;
        a4x a4xVar3 = (i2 & 256) != 0 ? pnpVar.i : a4xVar;
        boolean z12 = (i2 & 512) != 0 ? pnpVar.j : z4;
        int i3 = (i2 & 1024) != 0 ? pnpVar.k : i;
        boolean z13 = pnpVar.l;
        a4x a4xVar4 = pnpVar.m;
        j700 j700Var = pnpVar.n;
        a4x a4xVar5 = (i2 & 16384) != 0 ? pnpVar.o : a4xVar2;
        boolean z14 = (32768 & i2) != 0 ? pnpVar.p : z5;
        boolean z15 = (65536 & i2) != 0 ? pnpVar.q : z6;
        boolean z16 = (131072 & i2) != 0 ? pnpVar.r : z7;
        boolean z17 = (262144 & i2) != 0 ? pnpVar.s : z8;
        zmb zmbVar2 = (524288 & i2) != 0 ? pnpVar.t : zmbVar;
        ghq0 ghq0Var2 = (i2 & 1048576) != 0 ? pnpVar.u : ghq0Var;
        pnpVar.getClass();
        str2.getClass();
        f9h0Var2.getClass();
        str3.getClass();
        a4xVar3.getClass();
        a4xVar4.getClass();
        a4xVar5.getClass();
        zmbVar2.getClass();
        ghq0Var2.getClass();
        return new pnp(hopVar2, z9, str2, f9h0Var2, str3, str4, z10, z11, a4xVar3, z12, i3, z13, a4xVar4, j700Var, a4xVar5, z14, z15, z16, z17, zmbVar2, ghq0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnp)) {
            return false;
        }
        pnp pnpVar = (pnp) obj;
        return Intrinsics.d(this.f27300a, pnpVar.f27300a) && this.b == pnpVar.b && Intrinsics.d(this.c, pnpVar.c) && this.d.equals(pnpVar.d) && Intrinsics.d(this.e, pnpVar.e) && this.f.equals(pnpVar.f) && this.g == pnpVar.g && this.h == pnpVar.h && Intrinsics.d(this.i, pnpVar.i) && this.j == pnpVar.j && this.k == pnpVar.k && this.l == pnpVar.l && Intrinsics.d(this.m, pnpVar.m) && this.n == pnpVar.n && Intrinsics.d(this.o, pnpVar.o) && this.p == pnpVar.p && this.q == pnpVar.q && this.r == pnpVar.r && this.s == pnpVar.s && this.t == pnpVar.t && this.u.equals(pnpVar.u);
    }

    public final int hashCode() {
        hop hopVar = this.f27300a;
        return this.u.hashCode() + ((this.t.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(cs0.b(this.o, (this.n.hashCode() + cs0.b(this.m, brm0.e(twn.a(this.k, brm0.e(cs0.b(this.i, brm0.e(brm0.e(ua80.b(ua80.b((this.d.hashCode() + ua80.b(brm0.e((hopVar == null ? 0 : hopVar.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31), 31, this.l), 31)) * 31, 31), 31, this.p), 31, this.q), 31, this.r), 31, this.s)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedsComposeScreenState(config=");
        sb.append(this.f27300a);
        sb.append(", navigationBarSearchViewExpanded=");
        sb.append(this.b);
        sb.append(", navigationBarTitle=");
        sb.append(this.c);
        sb.append(", initialScreenState=");
        sb.append(this.d);
        sb.append(", navigationBarSearchHint=");
        f140.v(sb, this.e, ", navigationBarSearchQuery=", this.f, ", enableSearchAutoFocus=");
        ua80.u(", timeFilterChipsVisible=", ", timeFilters=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", streamVisible=");
        sb.append(this.j);
        sb.append(", currentTab=");
        brm0.w(this.k, ", tabsVisible=", ", initIds=", sb, this.l);
        sb.append(this.m);
        sb.append(", initialScreenType=");
        sb.append(this.n);
        sb.append(", countriesList=");
        sb.append(this.o);
        sb.append(", toolbarButtonsClickable=");
        sb.append(this.p);
        sb.append(", multiselectSelected=");
        ua80.u(", streamSelected=", ", filtersSelected=", sb, this.q, this.r);
        sb.append(this.s);
        sb.append(", champSortType=");
        sb.append(this.t);
        sb.append(", timeFilterHolder=");
        sb.append(this.u);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
