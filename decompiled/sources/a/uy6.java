package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uy6 implements wy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf40 f36475a;

    public uy6(uf40 uf40Var) {
        this.f36475a = uf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy6) && this.f36475a.equals(((uy6) obj).f36475a);
    }

    public final int hashCode() {
        return this.f36475a.hashCode();
    }

    public final String toString() {
        return "TotoBetGameInfoUiModel(middleLaneUiModel=" + this.f36475a + Separators.RPAREN;
    }
}
