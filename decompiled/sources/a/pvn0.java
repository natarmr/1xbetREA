package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pvn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wrv f27670a;
    public final fvn0 b;

    public pvn0(wrv wrvVar, fvn0 fvn0Var) {
        this.f27670a = wrvVar;
        this.b = fvn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvn0)) {
            return false;
        }
        pvn0 pvn0Var = (pvn0) obj;
        return this.f27670a.equals(pvn0Var.f27670a) && this.b.equals(pvn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27670a.f39664a.hashCode() * 31);
    }

    public final String toString() {
        return "SwipexFilterUiState(headerState=" + this.f27670a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
