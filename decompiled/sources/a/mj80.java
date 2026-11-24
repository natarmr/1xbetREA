package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj80 f21884a;
    public final yvh0 b;

    public mj80(jj80 jj80Var, yvh0 yvh0Var) {
        this.f21884a = jj80Var;
        this.b = yvh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj80)) {
            return false;
        }
        mj80 mj80Var = (mj80) obj;
        return this.f21884a.equals(mj80Var.f21884a) && this.b.equals(mj80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21884a.hashCode() * 31);
    }

    public final String toString() {
        return "PageUiModel(pageType=" + this.f21884a + ", segmentControlSegmentModel=" + this.b + Separators.RPAREN;
    }
}
