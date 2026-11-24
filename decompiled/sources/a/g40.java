package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f10638a;
    public final e40 b;

    public g40(double d, e40 e40Var) {
        e40Var.getClass();
        this.f10638a = d;
        this.b = e40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g40)) {
            return false;
        }
        g40 g40Var = (g40) obj;
        return Double.compare(this.f10638a, g40Var.f10638a) == 0 && this.b == g40Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f10638a) * 31);
    }

    public final String toString() {
        return "AdvanceStateModel(value=" + this.f10638a + ", advanceState=" + this.b + Separators.RPAREN;
    }
}
