package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jrb0 implements nrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f16996a;

    public jrb0(ra10 ra10Var) {
        this.f16996a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrb0) && this.f16996a.equals(((jrb0) obj).f16996a);
    }

    public final int hashCode() {
        return this.f16996a.hashCode();
    }

    public final String toString() {
        return h97.k("Empty(lottieConfig=", this.f16996a, Separators.RPAREN);
    }
}
