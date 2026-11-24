package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class h40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12411a;
    public final f40 b;

    public h40(double d, f40 f40Var) {
        f40Var.getClass();
        this.f12411a = d;
        this.b = f40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return Double.compare(this.f12411a, h40Var.f12411a) == 0 && this.b == h40Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f12411a) * 31);
    }

    public final String toString() {
        return "AdvanceStateModel(value=" + this.f12411a + ", advanceState=" + this.b + Separators.RPAREN;
    }
}
