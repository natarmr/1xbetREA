package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f6832a;
    public final vw6 b;

    public dx6(a8q0 a8q0Var, vw6 vw6Var) {
        this.f6832a = a8q0Var;
        this.b = vw6Var;
    }

    public static dx6 a(dx6 dx6Var, a8q0 a8q0Var, vw6 vw6Var, int i) {
        if ((i & 1) != 0) {
            a8q0Var = dx6Var.f6832a;
        }
        if ((i & 2) != 0) {
            vw6Var = dx6Var.b;
        }
        dx6Var.getClass();
        return new dx6(a8q0Var, vw6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx6)) {
            return false;
        }
        dx6 dx6Var = (dx6) obj;
        return this.f6832a.equals(dx6Var.f6832a) && this.b.equals(dx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6832a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldStateModel(fieldState=" + this.f6832a + ", betFieldParamsStateModel=" + this.b + Separators.RPAREN;
    }
}
