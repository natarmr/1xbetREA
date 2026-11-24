package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ele extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w05 f7992a;

    public ele(w05 w05Var) {
        w05Var.getClass();
        this.f7992a = w05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ele) && this.f7992a == ((ele) obj).f7992a;
    }

    public final int hashCode() {
        return this.f7992a.hashCode();
    }

    public final String toString() {
        return "AutoSpinValueCommand(amount=" + this.f7992a + Separators.RPAREN;
    }
}
