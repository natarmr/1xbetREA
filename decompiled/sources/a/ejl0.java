package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ejl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjl0 f7917a;
    public final hjl0 b;

    public ejl0(hjl0 hjl0Var, hjl0 hjl0Var2) {
        this.f7917a = hjl0Var;
        this.b = hjl0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejl0)) {
            return false;
        }
        ejl0 ejl0Var = (ejl0) obj;
        return this.f7917a.equals(ejl0Var.f7917a) && this.b.equals(ejl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7917a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoOpponents(teamOneModel=" + this.f7917a + ", teamTwoModel=" + this.b + Separators.RPAREN;
    }
}
