package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f24898a;
    public final s8u0 b;

    public o9u0(imm immVar, s8u0 s8u0Var) {
        this.f24898a = immVar;
        this.b = s8u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9u0)) {
            return false;
        }
        o9u0 o9u0Var = (o9u0) obj;
        return this.f24898a.equals(o9u0Var.f24898a) && this.b.equals(o9u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24898a.hashCode() * 31);
    }

    public final String toString() {
        return "VerificationOptionsUiState(navigationBarModel=" + this.f24898a + ", contentUiState=" + this.b + Separators.RPAREN;
    }
}
