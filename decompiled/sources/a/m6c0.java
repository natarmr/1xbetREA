package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m6c0 implements r6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f21263a;

    public m6c0(xdk0 xdk0Var) {
        this.f21263a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6c0) && this.f21263a.equals(((m6c0) obj).f21263a);
    }

    public final int hashCode() {
        return this.f21263a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowInternetConnectionError(snackBarModel=", this.f21263a, Separators.RPAREN);
    }
}
