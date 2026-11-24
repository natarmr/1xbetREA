package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class uuj0 implements xuj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f36303a;

    public uuj0(xdk0 xdk0Var) {
        this.f36303a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uuj0) && this.f36303a.equals(((uuj0) obj).f36303a);
    }

    public final int hashCode() {
        return this.f36303a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnackbar(snackbarModel=", this.f36303a, Separators.RPAREN);
    }
}
