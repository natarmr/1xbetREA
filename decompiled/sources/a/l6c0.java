package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class l6c0 implements s6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f19501a;

    public l6c0(xdk0 xdk0Var) {
        this.f19501a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6c0) && this.f19501a.equals(((l6c0) obj).f19501a);
    }

    public final int hashCode() {
        return this.f19501a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnackbar(snackbarModel=", this.f19501a, Separators.RPAREN);
    }
}
