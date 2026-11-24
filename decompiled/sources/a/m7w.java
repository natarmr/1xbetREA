package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21339a;
    public final double b;
    public final double c;
    public final double d;
    public final boolean e;

    public m7w(long j, double d, double d2, double d3, boolean z) {
        this.f21339a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7w)) {
            return false;
        }
        m7w m7wVar = (m7w) obj;
        return this.f21339a == m7wVar.f21339a && Double.compare(this.b, m7wVar.b) == 0 && Double.compare(this.c, m7wVar.c) == 0 && Double.compare(this.d, m7wVar.d) == 0 && this.e == m7wVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f21339a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f21339a, "HistoryTransactionItemUiModel(date=", ", sumCut=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", sumOut=", ", couponSum=");
        rz4.x(sbQ, this.d, ", is24HourFormat=", this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
