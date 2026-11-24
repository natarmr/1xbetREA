package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hm00 implements jm00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f13284a;

    public hm00(ra10 ra10Var) {
        this.f13284a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm00) && this.f13284a.equals(((hm00) obj).f13284a);
    }

    public final int hashCode() {
        return this.f13284a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f13284a, Separators.RPAREN);
    }
}
