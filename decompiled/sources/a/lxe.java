package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lxe implements pxe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f20811a;

    public lxe(j43 j43Var) {
        this.f20811a = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxe) && this.f20811a.equals(((lxe) obj).f20811a);
    }

    public final int hashCode() {
        return this.f20811a.hashCode();
    }

    public final String toString() {
        return "Visible(animatedCoefficientModel=" + this.f20811a + Separators.RPAREN;
    }
}
