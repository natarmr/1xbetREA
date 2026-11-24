package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k9d0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17911a;
    public final boolean b;

    public k9d0(boolean z, long j) {
        this.f17911a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9d0)) {
            return false;
        }
        k9d0 k9d0Var = (k9d0) obj;
        return this.f17911a == k9d0Var.f17911a && this.b == k9d0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f17911a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f17911a, "AggregatorSingleGame(id=", ", needTransfer=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
