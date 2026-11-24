package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19778a;
    public final String b;
    public final String c;

    public lc1(long j, String str, String str2) {
        this.f19778a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc1)) {
            return false;
        }
        lc1 lc1Var = (lc1) obj;
        return this.f19778a == lc1Var.f19778a && this.b.equals(lc1Var.b) && this.c.equals(lc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f19778a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f19778a, "AggregatorProduct(id=", ", name=", this.b), ", imgMob=", this.c, Separators.RPAREN);
    }
}
