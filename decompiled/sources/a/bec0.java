package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2443a;
    public final ydc0 b;
    public final a4x c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final mdm i;
    public final mdm j;
    public final boolean k;
    public final List l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final kdc0 p;

    public bec0(a4x a4xVar, ydc0 ydc0Var, a4x a4xVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, mdm mdmVar, mdm mdmVar2, boolean z6, List list, String str, boolean z7, boolean z8, kdc0 kdc0Var) {
        a4xVar.getClass();
        a4xVar2.getClass();
        list.getClass();
        str.getClass();
        this.f2443a = a4xVar;
        this.b = ydc0Var;
        this.c = a4xVar2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = mdmVar;
        this.j = mdmVar2;
        this.k = z6;
        this.l = list;
        this.m = str;
        this.n = z7;
        this.o = z8;
        this.p = kdc0Var;
    }

    public static bec0 a(bec0 bec0Var, a4x a4xVar, ydc0 ydc0Var, a4x a4xVar2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, boolean z6, kdc0 kdc0Var, int i) {
        a4x a4xVar3 = (i & 1) != 0 ? bec0Var.f2443a : a4xVar;
        ydc0 ydc0Var2 = (i & 2) != 0 ? bec0Var.b : ydc0Var;
        a4x a4xVar4 = (i & 4) != 0 ? bec0Var.c : a4xVar2;
        boolean z7 = (i & 8) != 0 ? bec0Var.d : z;
        boolean z8 = (i & 16) != 0 ? bec0Var.e : z2;
        boolean z9 = (i & 32) != 0 ? bec0Var.f : z3;
        boolean z10 = (i & 64) != 0 ? bec0Var.g : z4;
        boolean z11 = (i & 128) != 0 ? bec0Var.h : z5;
        mdm mdmVar = bec0Var.i;
        mdm mdmVar2 = bec0Var.j;
        boolean z12 = bec0Var.k;
        List list2 = (i & 2048) != 0 ? bec0Var.l : list;
        String str = bec0Var.m;
        boolean z13 = (i & 8192) != 0 ? bec0Var.n : z6;
        boolean z14 = (i & 16384) != 0 ? bec0Var.o : true;
        kdc0 kdc0Var2 = (i & 32768) != 0 ? bec0Var.p : kdc0Var;
        bec0Var.getClass();
        a4xVar3.getClass();
        a4xVar4.getClass();
        list2.getClass();
        str.getClass();
        return new bec0(a4xVar3, ydc0Var2, a4xVar4, z7, z8, z9, z10, z11, mdmVar, mdmVar2, z12, list2, str, z13, z14, kdc0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bec0)) {
            return false;
        }
        bec0 bec0Var = (bec0) obj;
        return Intrinsics.d(this.f2443a, bec0Var.f2443a) && this.b == bec0Var.b && Intrinsics.d(this.c, bec0Var.c) && this.d == bec0Var.d && this.e == bec0Var.e && this.f == bec0Var.f && this.g == bec0Var.g && this.h == bec0Var.h && this.i.equals(bec0Var.i) && this.j.equals(bec0Var.j) && this.k == bec0Var.k && Intrinsics.d(this.l, bec0Var.l) && Intrinsics.d(this.m, bec0Var.m) && this.n == bec0Var.n && this.o == bec0Var.o && this.p.equals(bec0Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + brm0.e(brm0.e(ua80.b(dw9.a(brm0.e(f140.d(this.j, f140.d(this.i, brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(cs0.b(this.c, (this.b.hashCode() + (this.f2443a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeListInternalState(allPromoCodes=");
        sb.append(this.f2443a);
        sb.append(", selectedFilter=");
        sb.append(this.b);
        sb.append(", chips=");
        sb.append(this.c);
        sb.append(", showShimmers=");
        sb.append(this.d);
        sb.append(", showError=");
        ua80.u(", isRefreshing=", ", connectionAvailable=", sb, this.e, this.f);
        ua80.u(", showErrorOnFailure=", ", errorEmptyConfig=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", emptyConfig=");
        sb.append(this.j);
        sb.append(", hasPromoRecommends=");
        vqd.y(sb, ", recommendations=", this.l, ", recommendationHeaderTitle=", this.k);
        brm0.C(this.m, ", scrollToTop=", ", contentLoaded=", sb, this.n);
        sb.append(this.o);
        sb.append(", accountInfo=");
        sb.append(this.p);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
