package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ouf0 implements quf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f25874a;

    public ouf0(ra10 ra10Var) {
        this.f25874a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouf0) && this.f25874a.equals(((ouf0) obj).f25874a);
    }

    public final int hashCode() {
        return this.f25874a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f25874a, Separators.RPAREN);
    }
}
