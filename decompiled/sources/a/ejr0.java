package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ejr0 implements ijr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f7922a;

    public ejr0(ra10 ra10Var) {
        this.f7922a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejr0) && this.f7922a.equals(((ejr0) obj).f7922a);
    }

    public final int hashCode() {
        return this.f7922a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f7922a, Separators.RPAREN);
    }
}
