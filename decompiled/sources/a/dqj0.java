package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dqj0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wui0 f6519a;
    public final boolean b;

    public dqj0(wui0 wui0Var, boolean z) {
        this.f6519a = wui0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqj0)) {
            return false;
        }
        dqj0 dqj0Var = (dqj0) obj;
        return this.f6519a == dqj0Var.f6519a && this.b == dqj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f6519a.hashCode() * 31);
    }

    public final String toString() {
        return "ShimmerCellUiModel(position=" + this.f6519a + ", long=" + this.b + Separators.RPAREN;
    }
}
