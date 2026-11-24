package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gw4 implements jw4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f12007a;

    public gw4(xdk0 xdk0Var) {
        this.f12007a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw4) && this.f12007a.equals(((gw4) obj).f12007a);
    }

    public final int hashCode() {
        return this.f12007a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnackbar(snackbarModel=", this.f12007a, Separators.RPAREN);
    }
}
