package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d1l0 implements f1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f5314a;
    public final oe b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final mdm g;

    public d1l0(pzu pzuVar, oe oeVar, String str, boolean z, boolean z2, boolean z3, mdm mdmVar) {
        this.f5314a = pzuVar;
        this.b = oeVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = mdmVar;
    }

    @Override // a.f1l0
    public final oe a() {
        return this.b;
    }

    @Override // a.f1l0
    public final boolean b() {
        return this.f;
    }

    @Override // a.f1l0
    public final boolean c() {
        return this.e;
    }

    @Override // a.f1l0
    public final String d() {
        return this.c;
    }

    @Override // a.i1l0
    public final pzu e() {
        return this.f5314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1l0) {
            d1l0 d1l0Var = (d1l0) obj;
            if (this.f5314a == d1l0Var.f5314a && this.b.equals(d1l0Var.b) && this.c.equals(d1l0Var.c) && this.d == d1l0Var.d && this.e == d1l0Var.e && this.f == d1l0Var.f && this.g.equals(d1l0Var.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.f1l0
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(brm0.e(brm0.e(ua80.b((this.b.hashCode() + (this.f5314a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty(strings=");
        sb.append(this.f5314a);
        sb.append(", accountInfoState=");
        sb.append(this.b);
        sb.append(", transferSumInput=");
        brm0.C(this.c, ", isTransferButtonEnabled=", ", isTransferLoading=", sb, this.d);
        ua80.u(", isSwipeRefreshing=", ", emptyConfig=", sb, this.e, this.f);
        return cs0.m(sb, this.g, Separators.RPAREN);
    }
}
