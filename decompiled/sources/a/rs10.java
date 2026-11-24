package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rs10 implements ss10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os10 f31013a;
    public final qs10 b;

    public rs10(os10 os10Var, qs10 qs10Var) {
        this.f31013a = os10Var;
        this.b = qs10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs10)) {
            return false;
        }
        rs10 rs10Var = (rs10) obj;
        return this.f31013a.equals(rs10Var.f31013a) && this.b.equals(rs10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31013a.f25763a.hashCode() * 31);
    }

    public final String toString() {
        return "SystemAndCoef(coefState=" + this.f31013a + ", systemState=" + this.b + Separators.RPAREN;
    }
}
