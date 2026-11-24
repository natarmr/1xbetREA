package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41101a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final List f;
    public final mdm g;
    public final mdm h;
    public final mdm i;
    public final ym2 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public xm2(boolean z, boolean z2, boolean z3, List list, List list2, List list3, mdm mdmVar, mdm mdmVar2, mdm mdmVar3, ym2 ym2Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        b1j.B(list, list2, list3);
        this.f41101a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = mdmVar;
        this.h = mdmVar2;
        this.i = mdmVar3;
        this.j = ym2Var;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = z10;
    }

    public static xm2 a(xm2 xm2Var, boolean z, boolean z2, boolean z3, List list, List list2, ym2 ym2Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        boolean z10 = (i & 1) != 0 ? xm2Var.f41101a : z;
        boolean z11 = (i & 2) != 0 ? xm2Var.b : z2;
        boolean z12 = (i & 4) != 0 ? xm2Var.c : z3;
        List list3 = (i & 8) != 0 ? xm2Var.d : list;
        xm2Var.getClass();
        List list4 = (i & 32) != 0 ? xm2Var.e : list2;
        List list5 = xm2Var.f;
        mdm mdmVar = xm2Var.g;
        mdm mdmVar2 = xm2Var.h;
        mdm mdmVar3 = xm2Var.i;
        ym2 ym2Var2 = (i & 1024) != 0 ? xm2Var.j : ym2Var;
        boolean z13 = (i & 2048) != 0 ? xm2Var.k : z4;
        boolean z14 = (i & 4096) != 0 ? xm2Var.l : z5;
        boolean z15 = xm2Var.m;
        boolean z16 = (i & 16384) != 0 ? xm2Var.n : z6;
        boolean z17 = (32768 & i) != 0 ? xm2Var.o : z7;
        boolean z18 = (65536 & i) != 0 ? xm2Var.p : z8;
        boolean z19 = (i & 131072) != 0 ? xm2Var.q : z9;
        xm2Var.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        return new xm2(z10, z11, z12, list3, list4, list5, mdmVar, mdmVar2, mdmVar3, ym2Var2, z13, z14, z15, z16, z17, z18, z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm2)) {
            return false;
        }
        xm2 xm2Var = (xm2) obj;
        return this.f41101a == xm2Var.f41101a && this.b == xm2Var.b && this.c == xm2Var.c && Intrinsics.d(this.d, xm2Var.d) && Intrinsics.d(this.e, xm2Var.e) && Intrinsics.d(this.f, xm2Var.f) && this.g.equals(xm2Var.g) && this.h.equals(xm2Var.h) && this.i.equals(xm2Var.i) && Intrinsics.d(this.j, xm2Var.j) && this.k == xm2Var.k && this.l == xm2Var.l && this.m == xm2Var.m && this.n == xm2Var.n && this.o == xm2Var.o && this.p == xm2Var.p && this.q == xm2Var.q;
    }

    public final int hashCode() {
        int iD = f140.d(this.i, f140.d(this.h, f140.d(this.g, dw9.a(dw9.a(brm0.e(dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f41101a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, this.e), 31, this.f), 31), 31), 31);
        ym2 ym2Var = this.j;
        return Boolean.hashCode(this.q) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iD + (ym2Var != null ? ym2Var.hashCode() : 0)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AltViewedContainerState(isLoading=", ", isShowError=", ", viewedGamesLoadingError=", this.f41101a, this.b);
        vqd.y(sbQ, ", viewedGames=", this.d, ", showGamesUM=false, recommendGames=", this.c);
        b1j.y(", specialEventList=", ", lottieConfigConnectionError=", sbQ, this.e, this.f);
        sbQ.append(this.g);
        sbQ.append(", lottieConfigEmptyWithGames=");
        sbQ.append(this.h);
        sbQ.append(", lottieConfigDataError=");
        sbQ.append(this.i);
        sbQ.append(", recommendConfig=");
        sbQ.append(this.j);
        sbQ.append(", favoriteGamesFirstRequest=");
        ua80.u(", recommendedGamesFirstRequest=", ", isTablet=", sbQ, this.k, this.l);
        ua80.u(", scrollTop=", ", canScrollUp=", sbQ, this.m, this.n);
        ua80.u(", isRefreshing=", ", connected=", sbQ, this.o, this.p);
        return rw2.p(sbQ, this.q, Separators.RPAREN);
    }
}
