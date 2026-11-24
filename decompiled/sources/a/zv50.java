package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zv50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr5 f45041a;
    public final ykg0 b;
    public final boolean c;
    public final nk80 d;
    public final String e;
    public final oo5 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public zv50(kr5 kr5Var, ykg0 ykg0Var, boolean z, nk80 nk80Var, String str, oo5 oo5Var, boolean z2, boolean z3, boolean z4, List list, int i, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        kr5Var.getClass();
        list.getClass();
        this.f45041a = kr5Var;
        this.b = ykg0Var;
        this.c = z;
        this.d = nk80Var;
        this.e = str;
        this.f = oo5Var;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = list;
        this.k = i;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = z9;
    }

    public static zv50 a(zv50 zv50Var, kr5 kr5Var, ykg0 ykg0Var, nk80 nk80Var, boolean z, List list, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        kr5 kr5Var2 = (i2 & 1) != 0 ? zv50Var.f45041a : kr5Var;
        ykg0 ykg0Var2 = (i2 & 2) != 0 ? zv50Var.b : ykg0Var;
        boolean z6 = (i2 & 4) != 0 ? zv50Var.c : false;
        nk80 nk80Var2 = (i2 & 8) != 0 ? zv50Var.d : nk80Var;
        String str = zv50Var.e;
        oo5 oo5Var = zv50Var.f;
        boolean z7 = zv50Var.g;
        boolean z8 = (i2 & 128) != 0 ? zv50Var.h : true;
        boolean z9 = (i2 & 256) != 0 ? zv50Var.i : z;
        List list2 = (i2 & 512) != 0 ? zv50Var.j : list;
        int i3 = (i2 & 1024) != 0 ? zv50Var.k : i;
        boolean z10 = (i2 & 2048) != 0 ? zv50Var.l : z2;
        boolean z11 = (i2 & 4096) != 0 ? zv50Var.m : z3;
        boolean z12 = (i2 & 8192) != 0 ? zv50Var.n : true;
        boolean z13 = (i2 & 16384) != 0 ? zv50Var.o : z4;
        boolean z14 = (i2 & 32768) != 0 ? zv50Var.p : z5;
        zv50Var.getClass();
        kr5Var2.getClass();
        list2.getClass();
        return new zv50(kr5Var2, ykg0Var2, z6, nk80Var2, str, oo5Var, z7, z8, z9, list2, i3, z10, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv50)) {
            return false;
        }
        zv50 zv50Var = (zv50) obj;
        return Intrinsics.d(this.f45041a, zv50Var.f45041a) && this.b.equals(zv50Var.b) && this.c == zv50Var.c && this.d.equals(zv50Var.d) && this.e.equals(zv50Var.e) && this.f == zv50Var.f && this.g == zv50Var.g && this.h == zv50Var.h && this.i == zv50Var.i && Intrinsics.d(this.j, zv50Var.j) && this.k == zv50Var.k && this.l == zv50Var.l && this.m == zv50Var.m && this.n == zv50Var.n && this.o == zv50Var.o && this.p == zv50Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.k, dw9.a(brm0.e(brm0.e(brm0.e((this.f.hashCode() + ua80.b((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f45041a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsPagerState(banner=");
        sb.append(this.f45041a);
        sb.append(", rule=");
        sb.append(this.b);
        sb.append(", isLoadingShowing=");
        sb.append(this.c);
        sb.append(", lottieModel=");
        sb.append(this.d);
        sb.append(", bannerName=");
        sb.append(this.e);
        sb.append(", actionType=");
        sb.append(this.f);
        sb.append(", showConfirmButton=");
        ua80.u(", authenticatorBanner=", ", bannerCollapsed=", sb, this.g, this.h);
        vqd.y(sb, ", tabs=", this.j, ", currentTabIndex=", this.i);
        brm0.w(this.k, ", takingPart=", ", showTakingPartDialog=", sb, this.l);
        ua80.u(", showAuthenticatorDialog=", ", hasAuthenticator=", sb, this.m, this.n);
        return ohs0.p(", showAuthorizationDialog=", Separators.RPAREN, sb, this.o, this.p);
    }
}
