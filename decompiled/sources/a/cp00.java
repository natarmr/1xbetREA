package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cp00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4723a;
    public final iy3 b;
    public final hh3 c;
    public final List d;
    public final ne5 e;
    public final boolean f;
    public final oc5 g;
    public final oc5 h;
    public final String i;
    public final Set j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public cp00(String str, iy3 iy3Var, hh3 hh3Var, List list, ne5 ne5Var, boolean z, oc5 oc5Var, oc5 oc5Var2, String str2, Set set, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        set.getClass();
        this.f4723a = str;
        this.b = iy3Var;
        this.c = hh3Var;
        this.d = list;
        this.e = ne5Var;
        this.f = z;
        this.g = oc5Var;
        this.h = oc5Var2;
        this.i = str2;
        this.j = set;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
    }

    public static cp00 a(cp00 cp00Var, iy3 iy3Var, ArrayList arrayList, ne5 ne5Var, oc5 oc5Var, String str, Set set, boolean z, boolean z2, int i) {
        String str2 = cp00Var.f4723a;
        iy3 iy3Var2 = (i & 2) != 0 ? cp00Var.b : iy3Var;
        hh3 hh3Var = cp00Var.c;
        List list = (i & 8) != 0 ? cp00Var.d : arrayList;
        ne5 ne5Var2 = (i & 16) != 0 ? cp00Var.e : ne5Var;
        boolean z3 = (i & 32) != 0 ? cp00Var.f : false;
        oc5 oc5Var2 = cp00Var.g;
        oc5 oc5Var3 = (i & 128) != 0 ? cp00Var.h : oc5Var;
        String str3 = (i & 256) != 0 ? cp00Var.i : str;
        Set set2 = (i & 512) != 0 ? cp00Var.j : set;
        boolean z4 = (i & 1024) != 0 ? cp00Var.k : z;
        boolean z5 = (i & 2048) != 0 ? cp00Var.l : z2;
        cp00Var.getClass();
        boolean z6 = cp00Var.m;
        boolean z7 = cp00Var.n;
        boolean z8 = cp00Var.o;
        boolean z9 = z5;
        boolean z10 = cp00Var.p;
        cp00Var.getClass();
        str2.getClass();
        iy3Var2.getClass();
        set2.getClass();
        return new cp00(str2, iy3Var2, hh3Var, list, ne5Var2, z3, oc5Var2, oc5Var3, str3, set2, z4, z9, z6, z7, z8, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp00)) {
            return false;
        }
        cp00 cp00Var = (cp00) obj;
        return Intrinsics.d(this.f4723a, cp00Var.f4723a) && this.b.equals(cp00Var.b) && this.c.equals(cp00Var.c) && this.d.equals(cp00Var.d) && Intrinsics.d(this.e, cp00Var.e) && this.f == cp00Var.f && Intrinsics.d(this.g, cp00Var.g) && Intrinsics.d(this.h, cp00Var.h) && Intrinsics.d(this.i, cp00Var.i) && Intrinsics.d(this.j, cp00Var.j) && this.k == cp00Var.k && this.l == cp00Var.l && this.m == cp00Var.m && this.n == cp00Var.n && this.o == cp00Var.o && this.p == cp00Var.p;
    }

    public final int hashCode() {
        int iA = dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f4723a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ne5 ne5Var = this.e;
        int iE = brm0.e((iA + (ne5Var == null ? 0 : ne5Var.hashCode())) * 31, 31, this.f);
        oc5 oc5Var = this.g;
        int iHashCode = (iE + (oc5Var == null ? 0 : oc5Var.hashCode())) * 31;
        oc5 oc5Var2 = this.h;
        int iHashCode2 = (iHashCode + (oc5Var2 == null ? 0 : oc5Var2.hashCode())) * 31;
        String str = this.i;
        return Boolean.hashCode(this.p) + brm0.e(brm0.e(brm0.e(twn.a(1357, brm0.e(brm0.e(ohs0.g(this.j, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.k), 31, this.l), 31), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadState(appVersionName=");
        sb.append(this.f4723a);
        sb.append(", aspectRatio=");
        sb.append(this.b);
        sb.append(", settingModel=");
        sb.append(this.c);
        sb.append(", loadingSteps=");
        sb.append(this.d);
        sb.append(", backgroundVideoUriModel=");
        sb.append(this.e);
        sb.append(", isLoadingResources=");
        sb.append(this.f);
        sb.append(", backgroundImageUrlsModel=");
        sb.append(this.g);
        sb.append(", imageUrlsToPreload=");
        sb.append(this.h);
        sb.append(", appUpdateImageUrlToPreload=");
        sb.append(this.i);
        sb.append(", eventsOnEnd=");
        sb.append(this.j);
        sb.append(", isPlayerReady=");
        ua80.u(", isAppBlocked=", ", projectId=1357, isTabletDevice=", sb, this.k, this.l);
        ua80.u(", isSmallDevice=", ", isPartnerLogoVisible=", sb, this.m, this.n);
        return ohs0.p(", isCompanyLogoVisible=", Separators.RPAREN, sb, this.o, this.p);
    }
}
