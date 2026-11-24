package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class exo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8589a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final String q;
    public final String r;
    public final int s;
    public final String t;

    public exo0(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, String str5, String str6, boolean z4, String str7, String str8, String str9, boolean z5, String str10, boolean z6, String str11, String str12, int i, String str13) {
        ohs0.z(str, str3, str5, str7, str9);
        str11.getClass();
        this.f8589a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = z3;
        this.h = str5;
        this.i = str6;
        this.j = z4;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = z5;
        this.o = str10;
        this.p = z6;
        this.q = str11;
        this.r = str12;
        this.s = i;
        this.t = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exo0)) {
            return false;
        }
        exo0 exo0Var = (exo0) obj;
        return this.f8589a == exo0Var.f8589a && Intrinsics.d(this.b, exo0Var.b) && this.c.equals(exo0Var.c) && Intrinsics.d(this.d, exo0Var.d) && this.e.equals(exo0Var.e) && this.f == exo0Var.f && this.g == exo0Var.g && Intrinsics.d(this.h, exo0Var.h) && this.i.equals(exo0Var.i) && this.j == exo0Var.j && Intrinsics.d(this.k, exo0Var.k) && this.l.equals(exo0Var.l) && Intrinsics.d(this.m, exo0Var.m) && this.n == exo0Var.n && this.o.equals(exo0Var.o) && this.p == exo0Var.p && Intrinsics.d(this.q, exo0Var.q) && this.r.equals(exo0Var.r) && this.s == exo0Var.s && this.t.equals(exo0Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + twn.a(this.s, ua80.b(ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f8589a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("TaxUiModel(taxExciseVisible=", ", taxExciseTitle=", this.b, this.f8589a, ", taxExciseValue=");
        f140.v(sbQ, this.c, ", vatTaxTitle=", this.d, ", vatTaxValue=");
        brm0.C(this.e, ", vatTaxVisible=", ", stakeAfterTaxVisible=", sbQ, this.f);
        f140.s(", stakeAfterTaxTitle=", this.h, ", stakeAfterTaxValue=", sbQ, this.g);
        brm0.C(this.i, ", taxVisible=", ", taxTitle=", sbQ, this.j);
        f140.v(sbQ, this.k, ", taxValue=", this.l, ", taxFeeTitle=");
        brm0.C(this.m, ", taxFeeVisible=", ", taxFeeValue=", sbQ, this.n);
        brm0.C(this.o, ", betWinVisible=", ", betWinTitle=", sbQ, this.p);
        f140.v(sbQ, this.q, ", betWinText=", this.r, ", betWinColor=");
        return rw2.k(this.s, ", winGrossValue=", this.t, Separators.RPAREN, sbQ);
    }
}
