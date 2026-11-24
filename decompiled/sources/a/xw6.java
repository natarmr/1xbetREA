package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f41594a;
    public final dpm0 b;

    public xw6(pz40 pz40Var, dpm0 dpm0Var) {
        this.f41594a = pz40Var;
        this.b = dpm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xw6) {
            xw6 xw6Var = (xw6) obj;
            if (this.f41594a == xw6Var.f41594a && this.b.equals(xw6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41594a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldState(fieldValueState=" + this.f41594a + ", stepInputState=" + this.b + Separators.RPAREN;
    }
}
