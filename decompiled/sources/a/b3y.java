package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b3y implements e3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f1930a;

    public b3y(ra10 ra10Var) {
        this.f1930a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3y) && this.f1930a.equals(((b3y) obj).f1930a);
    }

    public final int hashCode() {
        return this.f1930a.hashCode();
    }

    public final String toString() {
        return h97.k("EmptyLottie(lottieConfig=", this.f1930a, Separators.RPAREN);
    }
}
