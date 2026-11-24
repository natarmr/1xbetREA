package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lnc0 implements onc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f20338a;

    public lnc0(xdk0 xdk0Var) {
        this.f20338a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnc0) && this.f20338a.equals(((lnc0) obj).f20338a);
    }

    public final int hashCode() {
        return this.f20338a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowNoInternetMessage(snackBarModel=", this.f20338a, Separators.RPAREN);
    }
}
