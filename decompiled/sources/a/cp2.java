package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cp2 implements ep2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f4724a;

    public cp2(ra10 ra10Var) {
        this.f4724a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp2) && this.f4724a.equals(((cp2) obj).f4724a);
    }

    public final int hashCode() {
        return this.f4724a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f4724a, Separators.RPAREN);
    }
}
