package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class um3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3 f35902a;
    public final tm3 b;
    public final an3 c;
    public final oc5 d;
    public final boolean e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public um3(iy3 iy3Var, tm3 tm3Var, an3 an3Var, oc5 oc5Var, boolean z, String str, Integer num, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f35902a = iy3Var;
        this.b = tm3Var;
        this.c = an3Var;
        this.d = oc5Var;
        this.e = z;
        this.f = str;
        this.g = num;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
        this.p = z10;
        this.q = z11;
    }

    public static um3 a(um3 um3Var, iy3 iy3Var, an3 an3Var, oc5 oc5Var, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        iy3 iy3Var2 = (i & 1) != 0 ? um3Var.f35902a : iy3Var;
        tm3 tm3Var = um3Var.b;
        an3 an3Var2 = (i & 4) != 0 ? um3Var.c : an3Var;
        oc5 oc5Var2 = (i & 8) != 0 ? um3Var.d : oc5Var;
        boolean z6 = um3Var.e;
        String str = um3Var.f;
        Integer num2 = (i & 64) != 0 ? um3Var.g : num;
        boolean z7 = um3Var.h;
        boolean z8 = (i & 256) != 0 ? um3Var.i : z;
        boolean z9 = (i & 512) != 0 ? um3Var.j : z2;
        boolean z10 = (i & 1024) != 0 ? um3Var.k : z3;
        boolean z11 = (i & 2048) != 0 ? um3Var.l : z4;
        boolean z12 = (i & 4096) != 0 ? um3Var.m : z5;
        boolean z13 = (i & 8192) != 0 ? um3Var.n : true;
        boolean z14 = (i & 16384) != 0 ? um3Var.o : true;
        boolean z15 = (32768 & i) != 0 ? um3Var.p : true;
        boolean z16 = (i & 65536) != 0 ? um3Var.q : true;
        um3Var.getClass();
        iy3Var2.getClass();
        return new um3(iy3Var2, tm3Var, an3Var2, oc5Var2, z6, str, num2, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um3)) {
            return false;
        }
        um3 um3Var = (um3) obj;
        return this.f35902a.equals(um3Var.f35902a) && this.b.equals(um3Var.b) && Intrinsics.d(this.c, um3Var.c) && Intrinsics.d(this.d, um3Var.d) && this.e == um3Var.e && this.f.equals(um3Var.f) && Intrinsics.d(this.g, um3Var.g) && this.h == um3Var.h && this.i == um3Var.i && this.j == um3Var.j && this.k == um3Var.k && this.l == um3Var.l && this.m == um3Var.m && this.n == um3Var.n && this.o == um3Var.o && this.p == um3Var.p && this.q == um3Var.q;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f35902a.hashCode() * 31)) * 31;
        an3 an3Var = this.c;
        int iHashCode2 = (iHashCode + (an3Var == null ? 0 : an3Var.hashCode())) * 31;
        oc5 oc5Var = this.d;
        int iB = ua80.b(brm0.e((iHashCode2 + (oc5Var == null ? 0 : oc5Var.hashCode())) * 31, 31, this.e), 31, this.f);
        Integer num = this.g;
        return Boolean.hashCode(this.q) + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iB + (num != null ? num.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppUpdateStateModel(aspectRatio=");
        sb.append(this.f35902a);
        sb.append(", settingsModel=");
        sb.append(this.b);
        sb.append(", appUpdateBackgroundUriModel=");
        sb.append(this.c);
        sb.append(", backgroundImageUrlsModel=");
        sb.append(this.d);
        sb.append(", hasWhatsNewEnable=");
        f140.s(", applicationId=", this.f, ", downloadProgress=", sb, this.e);
        sb.append(this.g);
        sb.append(", isForceUpdate=");
        sb.append(this.h);
        sb.append(", downloadApkIsError=");
        ua80.u(", downloadApkIsProgress=", ", isWhatsNewLoading=", sb, this.i, this.j);
        ua80.u(", isFullExternal=", ", isInternetConnected=", sb, this.k, this.l);
        ua80.u(", isPlayerReady=", ", isUpdateStarted=", sb, this.m, this.n);
        ua80.u(", isBackgroundResolved=", ", isBackgroundImagesResolved=", sb, this.o, this.p);
        return rw2.p(sb, this.q, Separators.RPAREN);
    }
}
