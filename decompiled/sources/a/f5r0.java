package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f5r0 implements g5r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f8977a;

    public f5r0(xdk0 xdk0Var) {
        this.f8977a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5r0) && this.f8977a.equals(((f5r0) obj).f8977a);
    }

    public final int hashCode() {
        return this.f8977a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnack(snackbarModel=", this.f8977a, Separators.RPAREN);
    }
}
