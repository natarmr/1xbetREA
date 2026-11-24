package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ln00 extends qn00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f20322a;

    public ln00(ra10 ra10Var) {
        this.f20322a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln00) && this.f20322a.equals(((ln00) obj).f20322a);
    }

    public final int hashCode() {
        return this.f20322a.hashCode();
    }

    public final String toString() {
        return h97.k("NoConnection(lottieConfig=", this.f20322a, Separators.RPAREN);
    }
}
