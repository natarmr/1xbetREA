package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pvg0 implements rvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f27662a;

    public pvg0(xdk0 xdk0Var) {
        this.f27662a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvg0) && this.f27662a.equals(((pvg0) obj).f27662a);
    }

    public final int hashCode() {
        return this.f27662a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackBarModel=", this.f27662a, Separators.RPAREN);
    }
}
