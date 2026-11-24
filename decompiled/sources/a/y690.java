package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y690 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x690 f42086a;
    public final long b;
    public final boolean c;

    public y690(x690 x690Var, long j, boolean z) {
        this.f42086a = x690Var;
        this.b = j;
        this.c = z;
    }

    public static y690 a(y690 y690Var, x690 x690Var, long j, boolean z, int i) {
        if ((i & 1) != 0) {
            x690Var = y690Var.f42086a;
        }
        if ((i & 2) != 0) {
            j = y690Var.b;
        }
        if ((i & 4) != 0) {
            z = y690Var.c;
        }
        y690Var.getClass();
        return new y690(x690Var, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y690)) {
            return false;
        }
        y690 y690Var = (y690) obj;
        return this.f42086a == y690Var.f42086a && this.b == y690Var.b && this.c == y690Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f42086a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentConsultantState(uiState=");
        sb.append(this.f42086a);
        sb.append(", paymentRefreshLimit=");
        sb.append(this.b);
        return f140.n(sb, ", reloadButtonEnabled=", this.c, Separators.RPAREN);
    }
}
