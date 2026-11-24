package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fw4 implements iw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f10241a;

    public fw4(xdk0 xdk0Var) {
        this.f10241a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw4) && this.f10241a.equals(((fw4) obj).f10241a);
    }

    public final int hashCode() {
        return this.f10241a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnackBar(snackBarModel=", this.f10241a, Separators.RPAREN);
    }
}
