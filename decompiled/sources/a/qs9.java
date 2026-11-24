package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qs9 implements us9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f29248a;

    public qs9(ra10 ra10Var) {
        this.f29248a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs9) && this.f29248a.equals(((qs9) obj).f29248a);
    }

    public final int hashCode() {
        return this.f29248a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f29248a, Separators.RPAREN);
    }
}
