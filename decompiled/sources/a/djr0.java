package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class djr0 implements ijr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f6201a;

    public djr0(ra10 ra10Var) {
        this.f6201a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djr0) && this.f6201a.equals(((djr0) obj).f6201a);
    }

    public final int hashCode() {
        return this.f6201a.hashCode();
    }

    public final String toString() {
        return h97.k("Empty(lottieConfig=", this.f6201a, Separators.RPAREN);
    }
}
