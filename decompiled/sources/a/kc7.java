package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kc7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f18045a;

    public kc7(xdk0 xdk0Var) {
        this.f18045a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc7) && this.f18045a.equals(((kc7) obj).f18045a);
    }

    public final int hashCode() {
        return this.f18045a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackBarModel=", this.f18045a, Separators.RPAREN);
    }
}
