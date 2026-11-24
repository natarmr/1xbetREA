package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class h94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f12659a;
    public final s74 b;

    public h94(imm immVar, s74 s74Var) {
        this.f12659a = immVar;
        this.b = s74Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h94)) {
            return false;
        }
        h94 h94Var = (h94) obj;
        return this.f12659a.equals(h94Var.f12659a) && this.b.equals(h94Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12659a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthHistoryUiState(navigationBarUiModel=" + this.f12659a + ", contentState=" + this.b + Separators.RPAREN;
    }
}
