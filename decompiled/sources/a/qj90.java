package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qj90 implements rj90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f28827a;

    public qj90(ra10 ra10Var) {
        this.f28827a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj90) && this.f28827a.equals(((qj90) obj).f28827a);
    }

    public final int hashCode() {
        return this.f28827a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f28827a, Separators.RPAREN);
    }
}
