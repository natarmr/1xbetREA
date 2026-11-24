package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ny6 implements wy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf40 f24315a;

    public ny6(uf40 uf40Var) {
        this.f24315a = uf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny6) && this.f24315a.equals(((ny6) obj).f24315a);
    }

    public final int hashCode() {
        return this.f24315a.hashCode();
    }

    public final String toString() {
        return "BetConstructorBetGameInfoUiModel(middleLaneUiModel=" + this.f24315a + Separators.RPAREN;
    }
}
