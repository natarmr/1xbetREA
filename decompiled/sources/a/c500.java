package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c500 implements d500 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f3747a;

    public c500(ra10 ra10Var) {
        this.f3747a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c500) && this.f3747a.equals(((c500) obj).f3747a);
    }

    public final int hashCode() {
        return this.f3747a.hashCode();
    }

    public final String toString() {
        return h97.k("Lottie(lottieConfig=", this.f3747a, Separators.RPAREN);
    }
}
