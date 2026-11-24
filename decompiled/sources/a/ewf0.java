package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ewf0 implements hwf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f8523a;

    public ewf0(ra10 ra10Var) {
        this.f8523a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewf0) && this.f8523a.equals(((ewf0) obj).f8523a);
    }

    public final int hashCode() {
        return this.f8523a.hashCode();
    }

    public final String toString() {
        return h97.k("ErrorState(lottieConfig=", this.f8523a, Separators.RPAREN);
    }
}
