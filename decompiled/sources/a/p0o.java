package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p0o implements r0o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f26161a;

    public p0o(xdk0 xdk0Var) {
        this.f26161a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0o) && this.f26161a.equals(((p0o) obj).f26161a);
    }

    public final int hashCode() {
        return this.f26161a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnack(snackbarModel=", this.f26161a, Separators.RPAREN);
    }
}
