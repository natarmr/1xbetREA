package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qc20 implements zc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f28468a;

    public qc20(xdk0 xdk0Var) {
        this.f28468a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc20) && this.f28468a.equals(((qc20) obj).f28468a);
    }

    public final int hashCode() {
        return this.f28468a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBarMessage(snackBarModel=", this.f28468a, Separators.RPAREN);
    }
}
