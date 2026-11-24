package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ewj0 implements hwj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f8530a;

    public ewj0(xdk0 xdk0Var) {
        this.f8530a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewj0) && this.f8530a.equals(((ewj0) obj).f8530a);
    }

    public final int hashCode() {
        return this.f8530a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowNoInternetMessage(snackBarModel=", this.f8530a, Separators.RPAREN);
    }
}
