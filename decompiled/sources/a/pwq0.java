package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pwq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27723a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final hao0 l;
    public final boolean m;

    public pwq0(boolean z, boolean z2, boolean z3, boolean z4, String str, List list, boolean z5, boolean z6, boolean z7, boolean z8, int i, hao0 hao0Var, boolean z9) {
        list.getClass();
        this.f27723a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = list;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = i;
        this.l = hao0Var;
        this.m = z9;
    }

    public static pwq0 a(pwq0 pwq0Var, boolean z, String str, List list, boolean z2, boolean z3, boolean z4, boolean z5, int i, hao0 hao0Var, boolean z6, int i2) {
        boolean z7 = pwq0Var.f27723a;
        boolean z8 = pwq0Var.b;
        boolean z9 = pwq0Var.c;
        boolean z10 = (i2 & 8) != 0 ? pwq0Var.d : z;
        String str2 = (i2 & 16) != 0 ? pwq0Var.e : str;
        List list2 = (i2 & 32) != 0 ? pwq0Var.f : list;
        boolean z11 = (i2 & 64) != 0 ? pwq0Var.g : z2;
        boolean z12 = (i2 & 128) != 0 ? pwq0Var.h : z3;
        boolean z13 = (i2 & 256) != 0 ? pwq0Var.i : z4;
        boolean z14 = (i2 & 512) != 0 ? pwq0Var.j : z5;
        int i3 = (i2 & 1024) != 0 ? pwq0Var.k : i;
        hao0 hao0Var2 = (i2 & 2048) != 0 ? pwq0Var.l : hao0Var;
        boolean z15 = (i2 & 4096) != 0 ? pwq0Var.m : z6;
        pwq0Var.getClass();
        str2.getClass();
        list2.getClass();
        return new pwq0(z7, z8, z9, z10, str2, list2, z11, z12, z13, z14, i3, hao0Var2, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwq0)) {
            return false;
        }
        pwq0 pwq0Var = (pwq0) obj;
        return this.f27723a == pwq0Var.f27723a && this.b == pwq0Var.b && this.c == pwq0Var.c && this.d == pwq0Var.d && this.e.equals(pwq0Var.e) && Intrinsics.d(this.f, pwq0Var.f) && this.g == pwq0Var.g && this.h == pwq0Var.h && this.i == pwq0Var.i && this.j == pwq0Var.j && this.k == pwq0Var.k && Intrinsics.d(this.l, pwq0Var.l) && this.m == pwq0Var.m;
    }

    public final int hashCode() {
        int iA = twn.a(this.k, brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(ua80.b(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f27723a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
        hao0 hao0Var = this.l;
        return Boolean.hashCode(this.m) + ((iA + (hao0Var == null ? 0 : hao0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ToolbarUiState(showChooseBetSystem=", ", showMakeBetSettings=", ", showRemoveCoupon=", this.f27723a, this.b);
        ua80.u(", authorized=", ", title=", sbQ, this.c, this.d);
        cs0.y(this.e, ", couponTypesUiModelList=", ", canChooseCouponType=", sbQ, this.f);
        ua80.u(", hasActions=", ", needToInflateMenu=", sbQ, this.g, this.h);
        ua80.u(", iconTitleVisible=", ", menuId=", sbQ, this.i, this.j);
        sbQ.append(this.k);
        sbQ.append(", systemTypeUiModel=");
        sbQ.append(this.l);
        sbQ.append(", hasCustomCouponTypeMenu=");
        return rw2.p(sbQ, this.m, Separators.RPAREN);
    }
}
