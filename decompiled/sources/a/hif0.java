package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hif0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f13110a;
    public final du90 b;

    public hif0(imm immVar, du90 du90Var) {
        this.f13110a = immVar;
        this.b = du90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hif0)) {
            return false;
        }
        hif0 hif0Var = (hif0) obj;
        return this.f13110a.equals(hif0Var.f13110a) && this.b.equals(hif0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13110a.hashCode() * 31);
    }

    public final String toString() {
        return "RemovePinCodeUiState(navigationBarUiModel=" + this.f13110a + ", pinModel=" + this.b + Separators.RPAREN;
    }
}
