package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class beu implements eeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f2468a;

    public beu(ra10 ra10Var) {
        this.f2468a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof beu) && this.f2468a.equals(((beu) obj).f2468a);
    }

    public final int hashCode() {
        return this.f2468a.hashCode();
    }

    public final String toString() {
        return h97.k("Empty(lottieConfig=", this.f2468a, Separators.RPAREN);
    }
}
