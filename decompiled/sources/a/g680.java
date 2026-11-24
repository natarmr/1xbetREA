package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f10750a;
    public final j43 b;

    public g680(j43 j43Var, j43 j43Var2) {
        this.f10750a = j43Var;
        this.b = j43Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g680)) {
            return false;
        }
        g680 g680Var = (g680) obj;
        return this.f10750a.equals(g680Var.f10750a) && this.b.equals(g680Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10750a.hashCode() * 31);
    }

    public final String toString() {
        return "OptionBetStateModel(maxCoefStateModel=" + this.f10750a + ", optionCoefStateModel=" + this.b + Separators.RPAREN;
    }
}
