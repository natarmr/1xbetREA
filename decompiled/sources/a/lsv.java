package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lsv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20600a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final String q;
    public final boolean r;

    public lsv(long j, boolean z, String str, String str2, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4, String str5, boolean z7, String str6, boolean z8, String str7, boolean z9) {
        str.getClass();
        str2.getClass();
        this.f20600a = j;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = i;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = z7;
        this.o = str6;
        this.p = z8;
        this.q = str7;
        this.r = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsv)) {
            return false;
        }
        lsv lsvVar = (lsv) obj;
        return znq0.e(this.f20600a, lsvVar.f20600a) && this.b == lsvVar.b && Intrinsics.d(this.c, lsvVar.c) && Intrinsics.d(this.d, lsvVar.d) && this.e == lsvVar.e && this.f == lsvVar.f && this.g == lsvVar.g && this.h == lsvVar.h && this.i == lsvVar.i && this.j == lsvVar.j && this.k.equals(lsvVar.k) && this.l.equals(lsvVar.l) && this.m.equals(lsvVar.m) && this.n == lsvVar.n && this.o.equals(lsvVar.o) && this.p == lsvVar.p && this.q.equals(lsvVar.q) && this.r == lsvVar.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.f, brm0.e(ua80.b(ua80.b(brm0.e(Long.hashCode(this.f20600a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("HeaderUiModel(date=", znq0.h(this.f20600a), ", promo=", this.b, ", typeName=");
        f140.v(sbU, this.c, ", number=", this.d, ", bellImageVisibility=");
        ua80.q(this.f, ", belImage=", ", moreImageVisibility=", sbU, this.e);
        ua80.u(", isLive=", ", autoSaleVisibility=", sbU, this.g, this.h);
        ua80.u(", paymentInfoVisibility=", ", autoSaleValue=", sbU, this.i, this.j);
        f140.v(sbU, this.k, ", paymentInfoTitle=", this.l, ", paymetInfoValue=");
        brm0.C(this.m, ", tagVisible=", ", tagText=", sbU, this.n);
        brm0.C(this.o, ", approvedBetIdVisible=", ", approvedBetIdTitle=", sbU, this.p);
        return defpackage.c.c(this.q, ", hasAutoSub=", Separators.RPAREN, sbU, this.r);
    }
}
