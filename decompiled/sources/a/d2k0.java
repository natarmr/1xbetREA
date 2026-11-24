package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d2k0 implements e2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f5360a;

    public d2k0(xdk0 xdk0Var) {
        this.f5360a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2k0) && this.f5360a.equals(((d2k0) obj).f5360a);
    }

    public final int hashCode() {
        return this.f5360a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackBarModel=", this.f5360a, Separators.RPAREN);
    }
}
