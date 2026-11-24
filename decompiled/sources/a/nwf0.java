package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nwf0 implements owf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f24231a;

    public nwf0(swp0 swp0Var) {
        this.f24231a = swp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwf0) && this.f24231a.equals(((nwf0) obj).f24231a);
    }

    public final int hashCode() {
        return this.f24231a.hashCode();
    }

    public final String toString() {
        return "SingleAccount(temporaryToken=" + this.f24231a + Separators.RPAREN;
    }
}
