package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m920 implements p920 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f21394a;

    public m920(xdk0 xdk0Var) {
        this.f21394a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m920) && this.f21394a.equals(((m920) obj).f21394a);
    }

    public final int hashCode() {
        return this.f21394a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowConnectionError(snackBarModel=", this.f21394a, Separators.RPAREN);
    }
}
