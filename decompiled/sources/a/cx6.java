package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f5109a;
    public final uw6 b;

    public cx6(a8q0 a8q0Var, uw6 uw6Var) {
        this.f5109a = a8q0Var;
        this.b = uw6Var;
    }

    public static cx6 a(cx6 cx6Var, a8q0 a8q0Var, uw6 uw6Var, int i) {
        if ((i & 1) != 0) {
            a8q0Var = cx6Var.f5109a;
        }
        if ((i & 2) != 0) {
            uw6Var = cx6Var.b;
        }
        cx6Var.getClass();
        return new cx6(a8q0Var, uw6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx6)) {
            return false;
        }
        cx6 cx6Var = (cx6) obj;
        return this.f5109a.equals(cx6Var.f5109a) && this.b.equals(cx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5109a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldStateModel(fieldState=" + this.f5109a + ", betFieldParamsStateModel=" + this.b + Separators.RPAREN;
    }
}
