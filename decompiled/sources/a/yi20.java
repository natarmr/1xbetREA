package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yi20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f42666a;

    public yi20(xdk0 xdk0Var) {
        this.f42666a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi20) && this.f42666a.equals(((yi20) obj).f42666a);
    }

    public final int hashCode() {
        return this.f42666a.hashCode();
    }

    public final String toString() {
        return cs0.k("RestrictionWarningSnackBarAction(snackBarModel=", this.f42666a, Separators.RPAREN);
    }
}
