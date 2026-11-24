package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yw6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f43355a;
    public final epm0 b;

    public yw6(pz40 pz40Var, epm0 epm0Var) {
        this.f43355a = pz40Var;
        this.b = epm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yw6) {
            yw6 yw6Var = (yw6) obj;
            if (this.f43355a == yw6Var.f43355a && this.b.equals(yw6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43355a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldState(fieldValueState=" + this.f43355a + ", stepInputState=" + this.b + Separators.RPAREN;
    }
}
