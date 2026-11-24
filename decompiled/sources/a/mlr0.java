package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mlr0 implements plr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f22007a;

    public mlr0(ra10 ra10Var) {
        this.f22007a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlr0) && this.f22007a.equals(((mlr0) obj).f22007a);
    }

    public final int hashCode() {
        return this.f22007a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f22007a, Separators.RPAREN);
    }
}
