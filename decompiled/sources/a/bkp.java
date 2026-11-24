package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bkp implements ekp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f2759a;

    public bkp(xdk0 xdk0Var) {
        this.f2759a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkp) && this.f2759a.equals(((bkp) obj).f2759a);
    }

    public final int hashCode() {
        return this.f2759a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackbar(snackbarModel=", this.f2759a, Separators.RPAREN);
    }
}
