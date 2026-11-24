package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f29615a;
    public final i060 b;

    public r060(imm immVar, i060 i060Var) {
        this.f29615a = immVar;
        this.b = i060Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r060)) {
            return false;
        }
        r060 r060Var = (r060) obj;
        return this.f29615a.equals(r060Var.f29615a) && this.b.equals(r060Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29615a.hashCode() * 31);
    }

    public final String toString() {
        return "NoTabsDashboardFiltersUiState(header=" + this.f29615a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
