package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xqb implements yqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f41308a;

    public xqb(ra10 ra10Var) {
        this.f41308a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqb) && this.f41308a.equals(((xqb) obj).f41308a);
    }

    public final int hashCode() {
        return this.f41308a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f41308a, Separators.RPAREN);
    }
}
