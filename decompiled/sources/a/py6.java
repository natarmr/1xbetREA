package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class py6 implements wy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf40 f27792a;

    public py6(uf40 uf40Var) {
        this.f27792a = uf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py6) && this.f27792a.equals(((py6) obj).f27792a);
    }

    public final int hashCode() {
        return this.f27792a.hashCode();
    }

    public final String toString() {
        return "FinBetsBetGameInfoUiModel(middleLaneUiModel=" + this.f27792a + Separators.RPAREN;
    }
}
