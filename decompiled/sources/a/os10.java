package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class os10 implements ss10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f25763a;

    public os10(j43 j43Var) {
        this.f25763a = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os10) && this.f25763a.equals(((os10) obj).f25763a);
    }

    public final int hashCode() {
        return this.f25763a.hashCode();
    }

    public final String toString() {
        return "Coef(animatedCoefficientModel=" + this.f25763a + Separators.RPAREN;
    }
}
