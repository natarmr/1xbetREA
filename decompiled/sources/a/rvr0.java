package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rvr0 implements tvr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f31185a;

    public rvr0(xdk0 xdk0Var) {
        this.f31185a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvr0) && this.f31185a.equals(((rvr0) obj).f31185a);
    }

    public final int hashCode() {
        return this.f31185a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackbarModel=", this.f31185a, Separators.RPAREN);
    }
}
