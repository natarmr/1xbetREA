package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class plj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27184a;
    public final boolean b;

    public plj(boolean z, long j) {
        this.f27184a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plj)) {
            return false;
        }
        plj pljVar = (plj) obj;
        return this.f27184a == pljVar.f27184a && this.b == pljVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + brm0.e(Long.hashCode(this.f27184a) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f27184a, "AggregatorSingleGame(id=", ", hasBackStack=false, needTransfer=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
