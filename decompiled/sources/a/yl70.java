package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yl70 extends im70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w05 f42826a;

    public yl70(w05 w05Var) {
        w05Var.getClass();
        this.f42826a = w05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl70) && this.f42826a == ((yl70) obj).f42826a;
    }

    public final int hashCode() {
        return this.f42826a.hashCode();
    }

    public final String toString() {
        return "AutoSpinAmountSet(amount=" + this.f42826a + Separators.RPAREN;
    }
}
