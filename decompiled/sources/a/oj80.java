package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oj80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lj80 f25348a;
    public final yvh0 b;

    public oj80(lj80 lj80Var, yvh0 yvh0Var) {
        yvh0Var.getClass();
        this.f25348a = lj80Var;
        this.b = yvh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj80)) {
            return false;
        }
        oj80 oj80Var = (oj80) obj;
        return this.f25348a.equals(oj80Var.f25348a) && Intrinsics.d(this.b, oj80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25348a.hashCode() * 31);
    }

    public final String toString() {
        return "PageUiModel(pageType=" + this.f25348a + ", segmentControlSegmentModel=" + this.b + Separators.RPAREN;
    }
}
