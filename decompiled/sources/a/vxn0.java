package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38209a;
    public final a4x b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final he m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final bpn0 q;

    public vxn0(a4x a4xVar, a4x a4xVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, String str4, he heVar, boolean z7, boolean z8, boolean z9, bpn0 bpn0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f38209a = a4xVar;
        this.b = a4xVar2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = heVar;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = bpn0Var;
    }

    public static vxn0 a(vxn0 vxn0Var, a4x a4xVar, a4x a4xVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, String str3, String str4, he heVar, boolean z7, boolean z8, boolean z9, bpn0 bpn0Var, int i) {
        a4x a4xVar3 = (i & 1) != 0 ? vxn0Var.f38209a : a4xVar;
        a4x a4xVar4 = (i & 2) != 0 ? vxn0Var.b : a4xVar2;
        boolean z10 = (i & 4) != 0 ? vxn0Var.c : z;
        boolean z11 = (i & 8) != 0 ? vxn0Var.d : z2;
        boolean z12 = (i & 16) != 0 ? vxn0Var.e : z3;
        boolean z13 = (i & 32) != 0 ? vxn0Var.f : z4;
        boolean z14 = (i & 64) != 0 ? vxn0Var.g : z5;
        boolean z15 = (i & 128) != 0 ? vxn0Var.h : z6;
        String str5 = (i & 256) != 0 ? vxn0Var.i : str;
        String str6 = (i & 512) != 0 ? vxn0Var.j : str2;
        String str7 = (i & 1024) != 0 ? vxn0Var.k : str3;
        String str8 = (i & 2048) != 0 ? vxn0Var.l : str4;
        he heVar2 = (i & 4096) != 0 ? vxn0Var.m : heVar;
        boolean z16 = (i & 8192) != 0 ? vxn0Var.n : z7;
        a4x a4xVar5 = a4xVar3;
        boolean z17 = (i & 16384) != 0 ? vxn0Var.o : z8;
        boolean z18 = (i & 32768) != 0 ? vxn0Var.p : z9;
        bpn0 bpn0Var2 = (i & 65536) != 0 ? vxn0Var.q : bpn0Var;
        vxn0Var.getClass();
        a4xVar5.getClass();
        a4xVar4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new vxn0(a4xVar5, a4xVar4, z10, z11, z12, z13, z14, z15, str5, str6, str7, str8, heVar2, z16, z17, z18, bpn0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxn0)) {
            return false;
        }
        vxn0 vxn0Var = (vxn0) obj;
        return Intrinsics.d(this.f38209a, vxn0Var.f38209a) && Intrinsics.d(this.b, vxn0Var.b) && this.c == vxn0Var.c && this.d == vxn0Var.d && this.e == vxn0Var.e && this.f == vxn0Var.f && this.g == vxn0Var.g && this.h == vxn0Var.h && this.i.equals(vxn0Var.i) && this.j.equals(vxn0Var.j) && this.k.equals(vxn0Var.k) && this.l.equals(vxn0Var.l) && this.m == vxn0Var.m && this.n == vxn0Var.n && this.o == vxn0Var.o && this.p == vxn0Var.p && this.q == vxn0Var.q;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.m.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(cs0.b(this.b, this.f38209a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o), 31, this.p);
        bpn0 bpn0Var = this.q;
        return iE + (bpn0Var == null ? 0 : bpn0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("SwipexStateModel(cardList=", this.f38209a, ", filters=", this.b, ", filtersLoading=");
        ua80.u(", forceUpdate=", ", loading=", sbQ, this.c, this.d);
        ua80.u(", showOnboarding=", ", allCardsSwiped=", sbQ, this.e, this.f);
        ua80.u(", showLottie=", ", betSum=", sbQ, this.g, this.h);
        f140.v(sbQ, this.i, ", balanceValue=", this.j, ", currencySymbol=");
        f140.v(sbQ, this.k, ", replenishPlaceHolder=", this.l, ", accountControlStyle=");
        sbQ.append(this.m);
        sbQ.append(", showWaitDialog=");
        sbQ.append(this.n);
        sbQ.append(", hasConnection=");
        ua80.u(", isLottieTimerRunning=", ", suspendProcessSwipeType=", sbQ, this.o, this.p);
        sbQ.append(this.q);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
