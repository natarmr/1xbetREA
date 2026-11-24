package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zb20 implements yc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f44094a;

    public zb20(xdk0 xdk0Var) {
        this.f44094a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb20) && this.f44094a.equals(((zb20) obj).f44094a);
    }

    public final int hashCode() {
        return this.f44094a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowErrorSnack(snackBarModel=", this.f44094a, Separators.RPAREN);
    }
}
