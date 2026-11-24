package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vd20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f37212a;

    public vd20(xdk0 xdk0Var) {
        this.f37212a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd20) && this.f37212a.equals(((vd20) obj).f37212a);
    }

    public final int hashCode() {
        return this.f37212a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowConnectionError(snackBarModel=", this.f37212a, Separators.RPAREN);
    }
}
