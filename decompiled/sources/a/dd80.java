package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5884a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final hc80 h;
    public final ed80 i;
    public final mdm j;
    public final mdm k;
    public final mdm l;
    public final boolean m;

    public dd80(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, hc80 hc80Var, ed80 ed80Var, mdm mdmVar, mdm mdmVar2, mdm mdmVar3, boolean z7) {
        this.f5884a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = hc80Var;
        this.i = ed80Var;
        this.j = mdmVar;
        this.k = mdmVar2;
        this.l = mdmVar3;
        this.m = z7;
    }

    public static dd80 a(dd80 dd80Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, hc80 hc80Var, ed80 ed80Var, boolean z7, int i) {
        String str = dd80Var.f5884a;
        boolean z8 = (i & 2) != 0 ? dd80Var.b : z;
        boolean z9 = (i & 4) != 0 ? dd80Var.c : z2;
        boolean z10 = (i & 8) != 0 ? dd80Var.d : z3;
        boolean z11 = (i & 16) != 0 ? dd80Var.e : z4;
        boolean z12 = (i & 32) != 0 ? dd80Var.f : z5;
        boolean z13 = (i & 64) != 0 ? dd80Var.g : z6;
        hc80 hc80Var2 = (i & 128) != 0 ? dd80Var.h : hc80Var;
        ed80 ed80Var2 = (i & 256) != 0 ? dd80Var.i : ed80Var;
        mdm mdmVar = dd80Var.j;
        mdm mdmVar2 = dd80Var.k;
        mdm mdmVar3 = dd80Var.l;
        boolean z14 = (i & 4096) != 0 ? dd80Var.m : z7;
        dd80Var.getClass();
        hc80Var2.getClass();
        return new dd80(str, z8, z9, z10, z11, z12, z13, hc80Var2, ed80Var2, mdmVar, mdmVar2, mdmVar3, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd80)) {
            return false;
        }
        dd80 dd80Var = (dd80) obj;
        return this.f5884a.equals(dd80Var.f5884a) && this.b == dd80Var.b && this.c == dd80Var.c && this.d == dd80Var.d && this.e == dd80Var.e && this.f == dd80Var.f && this.g == dd80Var.g && this.h.equals(dd80Var.h) && Intrinsics.d(this.i, dd80Var.i) && this.j.equals(dd80Var.j) && this.k.equals(dd80Var.k) && this.l.equals(dd80Var.l) && this.m == dd80Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(this.f5884a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
        ed80 ed80Var = this.i;
        return Boolean.hashCode(this.m) + f140.d(this.l, f140.d(this.k, f140.d(this.j, (iHashCode + (ed80Var == null ? 0 : ed80Var.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("OtherState(screenName=", this.f5884a, ", showRefreshing=", this.b, ", scrollToTop=");
        ua80.u(", canScrollUp=", ", authorized=", sbU, this.c, this.d);
        ua80.u(", recommendedGamesFirstRequest=", ", showConnectionError=", sbU, this.e, this.f);
        sbU.append(this.g);
        sbU.append(", gameModel=");
        sbU.append(this.h);
        sbU.append(", config=");
        sbU.append(this.i);
        sbU.append(", lottieConfigConnectionError=");
        sbU.append(this.j);
        sbU.append(", lottieConfigEmptyWithGames=");
        sbU.append(this.k);
        sbU.append(", lottieConfigDataError=");
        sbU.append(this.l);
        sbU.append(", connected=");
        return rw2.p(sbU, this.m, Separators.RPAREN);
    }
}
