package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ags0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f841a;
    public final long b;
    public final int c;
    public final double d;
    public final String e;
    public final String f;

    public ags0(double d, int i, long j, long j2, String str, String str2) {
        this.f841a = j;
        this.b = j2;
        this.c = i;
        this.d = d;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ags0)) {
            return false;
        }
        ags0 ags0Var = (ags0) obj;
        return this.f841a == ags0Var.f841a && this.b == ags0Var.b && this.c == ags0Var.c && Double.compare(this.d, ags0Var.d) == 0 && this.e.equals(ags0Var.e) && this.f.equals(ags0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, twn.a(this.c, rw2.b(Long.hashCode(this.f841a) * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f841a, "TransactionModel(id=", ", dateTime=");
        ua80.v(sbQ, this.b, ", idMove=", this.c);
        ohs0.A(sbQ, this.d, ", sum=", ", message=");
        return ua80.m(sbQ, this.e, ", currencySymbol=", this.f, Separators.RPAREN);
    }
}
