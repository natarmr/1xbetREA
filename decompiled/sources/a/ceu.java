package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ceu implements eeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f4230a;

    public ceu(ra10 ra10Var) {
        this.f4230a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ceu) && this.f4230a.equals(((ceu) obj).f4230a);
    }

    public final int hashCode() {
        return this.f4230a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f4230a, Separators.RPAREN);
    }
}
