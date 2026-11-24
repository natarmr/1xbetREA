package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gnn implements hnn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f11597a;

    public final boolean equals(Object obj) {
        if (obj instanceof gnn) {
            return this.f11597a.equals(((gnn) obj).f11597a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11597a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackBarModel=", this.f11597a, Separators.RPAREN);
    }
}
