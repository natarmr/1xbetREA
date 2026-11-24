package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj80 f23623a;
    public final yvh0 b;

    public nj80(kj80 kj80Var, yvh0 yvh0Var) {
        this.f23623a = kj80Var;
        this.b = yvh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj80)) {
            return false;
        }
        nj80 nj80Var = (nj80) obj;
        return this.f23623a.equals(nj80Var.f23623a) && this.b.equals(nj80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23623a.hashCode() * 31);
    }

    public final String toString() {
        return "PageUiModel(pageType=" + this.f23623a + ", segmentControlSegmentModel=" + this.b + Separators.RPAREN;
    }
}
