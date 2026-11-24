package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bd2 implements fd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik00 f2379a;
    public final boolean b;

    public bd2(ik00 ik00Var, boolean z) {
        this.f2379a = ik00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd2)) {
            return false;
        }
        bd2 bd2Var = (bd2) obj;
        return this.f2379a.equals(bd2Var.f2379a) && this.b == bd2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f2379a.hashCode() * 31);
    }

    public final String toString() {
        return "LargeItemSpaceSeparator(liveResultUiState=" + this.f2379a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
