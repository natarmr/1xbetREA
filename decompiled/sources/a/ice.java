package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ice implements kce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f14533a;

    public ice(ra10 ra10Var) {
        this.f14533a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ice) && this.f14533a.equals(((ice) obj).f14533a);
    }

    public final int hashCode() {
        return this.f14533a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f14533a, Separators.RPAREN);
    }
}
