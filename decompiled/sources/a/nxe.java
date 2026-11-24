package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nxe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f24279a;

    public nxe(j43 j43Var) {
        this.f24279a = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxe) && this.f24279a.equals(((nxe) obj).f24279a);
    }

    public final int hashCode() {
        return this.f24279a.hashCode();
    }

    public final String toString() {
        return "Visible(animatedCoefficientModel=" + this.f24279a + Separators.RPAREN;
    }
}
