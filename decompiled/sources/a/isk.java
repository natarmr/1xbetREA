package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class isk implements jsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f15307a;

    public isk(xdk0 xdk0Var) {
        this.f15307a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isk) && this.f15307a.equals(((isk) obj).f15307a);
    }

    public final int hashCode() {
        return this.f15307a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackbarMessage(model=", this.f15307a, Separators.RPAREN);
    }
}
