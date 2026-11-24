package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ed2 implements fd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik00 f7596a;
    public final boolean b;

    public ed2(ik00 ik00Var, boolean z) {
        this.f7596a = ik00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed2)) {
            return false;
        }
        ed2 ed2Var = (ed2) obj;
        return this.f7596a.equals(ed2Var.f7596a) && this.b == ed2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f7596a.hashCode() * 31);
    }

    public final String toString() {
        return "SmallItemLineSeparator(liveResultUiState=" + this.f7596a + ", isRefreshing=" + this.b + Separators.RPAREN;
    }
}
