package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rc20 implements ad20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f30219a;

    public rc20(xdk0 xdk0Var) {
        this.f30219a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rc20) && this.f30219a.equals(((rc20) obj).f30219a);
    }

    public final int hashCode() {
        return this.f30219a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBarMessage(snackBarModel=", this.f30219a, Separators.RPAREN);
    }
}
