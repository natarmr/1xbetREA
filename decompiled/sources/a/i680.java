package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class i680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f14228a;
    public final j43 b;

    public i680(j43 j43Var, j43 j43Var2) {
        this.f14228a = j43Var;
        this.b = j43Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i680)) {
            return false;
        }
        i680 i680Var = (i680) obj;
        return this.f14228a.equals(i680Var.f14228a) && this.b.equals(i680Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14228a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionBetUiState(maxCoefAnimatedModel=" + this.f14228a + ", optionCoefAnimatedModel=" + this.b + Separators.RPAREN;
    }
}
