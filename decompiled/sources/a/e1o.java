package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e1o implements f1o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f7044a;

    public e1o(xdk0 xdk0Var) {
        this.f7044a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1o) && this.f7044a.equals(((e1o) obj).f7044a);
    }

    public final int hashCode() {
        return this.f7044a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnackBar(errorSnackBarModel=", this.f7044a, Separators.RPAREN);
    }
}
