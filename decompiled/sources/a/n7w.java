package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23060a;
    public final double b;
    public final double c;

    public n7w(double d, double d2, long j) {
        this.f23060a = j;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7w)) {
            return false;
        }
        n7w n7wVar = (n7w) obj;
        return this.f23060a == n7wVar.f23060a && Double.compare(this.b, n7wVar.b) == 0 && Double.compare(this.c, n7wVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + brm0.d(this.b, Long.hashCode(this.f23060a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f23060a, "HistoryTransactionModel(date=", ", sumCut=");
        sbQ.append(this.b);
        return brm0.m(sbQ, this.c, ", sumOut=", Separators.RPAREN);
    }
}
