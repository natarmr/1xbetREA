package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a4v0 implements b4v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f241a;

    public a4v0(ra10 ra10Var) {
        this.f241a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4v0) && this.f241a.equals(((a4v0) obj).f241a);
    }

    public final int hashCode() {
        return this.f241a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f241a, Separators.RPAREN);
    }
}
