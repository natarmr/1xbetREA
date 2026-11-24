package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f15972a;
    public final j43 b;

    public j680(j43 j43Var, j43 j43Var2) {
        this.f15972a = j43Var;
        this.b = j43Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j680)) {
            return false;
        }
        j680 j680Var = (j680) obj;
        return this.f15972a.equals(j680Var.f15972a) && this.b.equals(j680Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15972a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionBetUiState(maxCoefAnimatedModel=" + this.f15972a + ", optionCoefAnimatedModel=" + this.b + Separators.RPAREN;
    }
}
