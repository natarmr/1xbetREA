package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ej70 extends oj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w05 f7894a;

    public ej70(w05 w05Var) {
        w05Var.getClass();
        this.f7894a = w05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej70) && this.f7894a == ((ej70) obj).f7894a;
    }

    public final int hashCode() {
        return this.f7894a.hashCode();
    }

    public final String toString() {
        return "AutoSpinAmountSet(amount=" + this.f7894a + Separators.RPAREN;
    }
}
