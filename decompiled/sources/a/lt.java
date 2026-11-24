package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f20605a;
    public final du90 b;

    public lt(imm immVar, du90 du90Var) {
        this.f20605a = immVar;
        this.b = du90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return this.f20605a.equals(ltVar.f20605a) && this.b.equals(ltVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20605a.hashCode() * 31);
    }

    public final String toString() {
        return "AddPinCodeUiState(navigationBarUiModel=" + this.f20605a + ", pinModel=" + this.b + Separators.RPAREN;
    }
}
