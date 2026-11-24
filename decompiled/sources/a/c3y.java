package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c3y implements e3y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f3701a;

    public c3y(ra10 ra10Var) {
        this.f3701a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3y) && this.f3701a.equals(((c3y) obj).f3701a);
    }

    public final int hashCode() {
        return this.f3701a.hashCode();
    }

    public final String toString() {
        return h97.k("ErrorLottie(lottieConfig=", this.f3701a, Separators.RPAREN);
    }
}
