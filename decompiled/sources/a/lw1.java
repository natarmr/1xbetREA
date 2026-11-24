package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lw1 implements nw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20739a;
    public final tw1 b;

    public lw1(long j, tw1 tw1Var) {
        this.f20739a = j;
        this.b = tw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw1)) {
            return false;
        }
        lw1 lw1Var = (lw1) obj;
        return this.f20739a == lw1Var.f20739a && this.b.equals(lw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f20739a) * 31);
    }

    public final String toString() {
        return "Stage(stageId=" + this.f20739a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
