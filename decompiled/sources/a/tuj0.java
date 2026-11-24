package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tuj0 implements wuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f34554a;

    public tuj0(xdk0 xdk0Var) {
        this.f34554a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuj0) && this.f34554a.equals(((tuj0) obj).f34554a);
    }

    public final int hashCode() {
        return this.f34554a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnackBar(snackBarModel=", this.f34554a, Separators.RPAREN);
    }
}
