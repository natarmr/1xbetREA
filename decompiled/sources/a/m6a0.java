package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m6a0 implements q6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21260a;
    public final boolean b;

    public m6a0(boolean z, long j) {
        this.f21260a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6a0)) {
            return false;
        }
        m6a0 m6a0Var = (m6a0) obj;
        return this.f21260a == m6a0Var.f21260a && this.b == m6a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f21260a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f21260a, "OnMarketGroupHeaderClick(marketGroupId=", ", isExpanded=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
