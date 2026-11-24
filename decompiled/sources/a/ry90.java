package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ry90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31302a;
    public final r b;

    public ry90(int i, r rVar) {
        this.f31302a = i;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry90)) {
            return false;
        }
        ry90 ry90Var = (ry90) obj;
        return this.f31302a == ry90Var.f31302a && this.b == ry90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f31302a) * 31);
    }

    public final String toString() {
        return "PlayerAbilityTreeBranchUiModel(branchImage=" + this.f31302a + ", branchSide=" + this.b + Separators.RPAREN;
    }
}
