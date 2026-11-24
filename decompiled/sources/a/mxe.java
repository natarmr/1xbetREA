package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mxe implements oxe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j43 f22550a;

    public mxe(j43 j43Var) {
        this.f22550a = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxe) && this.f22550a.equals(((mxe) obj).f22550a);
    }

    public final int hashCode() {
        return this.f22550a.hashCode();
    }

    public final String toString() {
        return "Visible(animatedCoefficientModel=" + this.f22550a + Separators.RPAREN;
    }
}
