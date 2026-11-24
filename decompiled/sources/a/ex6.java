package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ex6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f8562a;
    public final ww6 b;

    public ex6(a8q0 a8q0Var, ww6 ww6Var) {
        this.f8562a = a8q0Var;
        this.b = ww6Var;
    }

    public static ex6 a(ex6 ex6Var, a8q0 a8q0Var, ww6 ww6Var, int i) {
        if ((i & 1) != 0) {
            a8q0Var = ex6Var.f8562a;
        }
        if ((i & 2) != 0) {
            ww6Var = ex6Var.b;
        }
        ex6Var.getClass();
        return new ex6(a8q0Var, ww6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex6)) {
            return false;
        }
        ex6 ex6Var = (ex6) obj;
        return this.f8562a.equals(ex6Var.f8562a) && this.b.equals(ex6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8562a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldStateModel(fieldState=" + this.f8562a + ", betFieldParamsStateModel=" + this.b + Separators.RPAREN;
    }
}
