package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19580a;
    public final double b;
    public final double c;

    public l7w(double d, double d2, long j) {
        this.f19580a = j;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7w)) {
            return false;
        }
        l7w l7wVar = (l7w) obj;
        return this.f19580a == l7wVar.f19580a && Double.compare(this.b, l7wVar.b) == 0 && Double.compare(this.c, l7wVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + brm0.d(this.b, Long.hashCode(this.f19580a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f19580a, "HistoryTransactionItemModel(date=", ", sumCut=");
        sbQ.append(this.b);
        return brm0.m(sbQ, this.c, ", sumOut=", Separators.RPAREN);
    }
}
