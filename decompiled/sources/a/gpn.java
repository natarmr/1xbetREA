package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gpn implements hpn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f11691a;

    public gpn(xdk0 xdk0Var) {
        this.f11691a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpn) && this.f11691a.equals(((gpn) obj).f11691a);
    }

    public final int hashCode() {
        return this.f11691a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackBarModel=", this.f11691a, Separators.RPAREN);
    }
}
