package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w05 f190a;

    public a3t(w05 w05Var) {
        w05Var.getClass();
        this.f190a = w05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3t) && this.f190a == ((a3t) obj).f190a;
    }

    public final int hashCode() {
        return this.f190a.hashCode();
    }

    public final String toString() {
        return "ChangeAutoSpinAmount(autoSpinAmount=" + this.f190a + Separators.RPAREN;
    }
}
