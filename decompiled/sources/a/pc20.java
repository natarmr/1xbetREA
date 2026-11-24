package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pc20 implements xc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f26738a;

    public pc20(xdk0 xdk0Var) {
        this.f26738a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc20) && this.f26738a.equals(((pc20) obj).f26738a);
    }

    public final int hashCode() {
        return this.f26738a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBarMessage(snackBarModel=", this.f26738a, Separators.RPAREN);
    }
}
