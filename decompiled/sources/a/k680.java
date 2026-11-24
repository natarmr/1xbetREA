package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f17756a;
    public final j43 b;

    public k680(j43 j43Var, j43 j43Var2) {
        this.f17756a = j43Var;
        this.b = j43Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k680)) {
            return false;
        }
        k680 k680Var = (k680) obj;
        return this.f17756a.equals(k680Var.f17756a) && this.b.equals(k680Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17756a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionBetUiState(maxCoefAnimatedModel=" + this.f17756a + ", optionCoefAnimatedModel=" + this.b + Separators.RPAREN;
    }
}
