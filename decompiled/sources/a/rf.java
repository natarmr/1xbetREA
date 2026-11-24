package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rf extends tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f30361a;

    public rf(ra10 ra10Var) {
        this.f30361a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf) && this.f30361a.equals(((rf) obj).f30361a);
    }

    public final int hashCode() {
        return this.f30361a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f30361a, Separators.RPAREN);
    }
}
