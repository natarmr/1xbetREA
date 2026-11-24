package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iie f2682a;
    public final th1 b;
    public final Set c;
    public final Set d;
    public final uzb0 e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final long j;
    public final int k;
    public final boolean l;

    public bj1(iie iieVar, th1 th1Var, Set set, Set set2, uzb0 uzb0Var, boolean z, boolean z2, String str, String str2, long j, int i, boolean z3) {
        set.getClass();
        set2.getClass();
        uzb0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f2682a = iieVar;
        this.b = th1Var;
        this.c = set;
        this.d = set2;
        this.e = uzb0Var;
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = i;
        this.l = z3;
    }

    public static bj1 a(bj1 bj1Var, iie iieVar, Set set, Set set2, uzb0 uzb0Var, boolean z, String str, String str2, boolean z2, int i) {
        iie iieVar2 = (i & 1) != 0 ? bj1Var.f2682a : iieVar;
        th1 th1Var = bj1Var.b;
        Set set3 = (i & 4) != 0 ? bj1Var.c : set;
        Set set4 = (i & 8) != 0 ? bj1Var.d : set2;
        uzb0 uzb0Var2 = (i & 16) != 0 ? bj1Var.e : uzb0Var;
        boolean z3 = bj1Var.f;
        boolean z4 = (i & 64) != 0 ? bj1Var.g : z;
        String str3 = (i & 128) != 0 ? bj1Var.h : str;
        String str4 = (i & 256) != 0 ? bj1Var.i : str2;
        long j = bj1Var.j;
        int i2 = bj1Var.k;
        boolean z5 = (i & 2048) != 0 ? bj1Var.l : z2;
        bj1Var.getClass();
        set3.getClass();
        set4.getClass();
        uzb0Var2.getClass();
        str3.getClass();
        str4.getClass();
        return new bj1(iieVar2, th1Var, set3, set4, uzb0Var2, z3, z4, str3, str4, j, i2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return this.f2682a.equals(bj1Var.f2682a) && this.b == bj1Var.b && Intrinsics.d(this.c, bj1Var.c) && Intrinsics.d(this.d, bj1Var.d) && this.e == bj1Var.e && this.f == bj1Var.f && this.g == bj1Var.g && Intrinsics.d(this.h, bj1Var.h) && Intrinsics.d(this.i, bj1Var.i) && this.j == bj1Var.j && this.k == bj1Var.k && this.l == bj1Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + twn.a(this.k, rw2.b(ua80.b(ua80.b(brm0.e(brm0.e((this.e.hashCode() + ohs0.g(this.d, ohs0.g(this.c, (this.b.hashCode() + (this.f2682a.hashCode() * 31)) * 31, 31), 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorProvidersState(contentState=");
        sb.append(this.f2682a);
        sb.append(", aggregatorProviderStyle=");
        sb.append(this.b);
        sb.append(", checkedSet=");
        sb.append(this.c);
        sb.append(", selectedItems=");
        sb.append(this.d);
        sb.append(", sortType=");
        sb.append(this.e);
        sb.append(", hasAggregatorBrandsFullInfo=");
        sb.append(this.f);
        sb.append(", isSearchActive=");
        f140.s(", searchFieldQuery=", this.h, ", filterQuery=", sb, this.g);
        defpackage.c.i(sb, this.j, this.i, ", partitionId=");
        dw9.v(this.k, ", lottieTypeId=", ", isDarkTheme=", sb, this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
