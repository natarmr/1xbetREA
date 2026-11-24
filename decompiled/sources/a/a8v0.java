package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a8v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f447a;

    public a8v0(imm immVar) {
        this.f447a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8v0) && this.f447a.equals(((a8v0) obj).f447a);
    }

    public final int hashCode() {
        return this.f447a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f447a, "WeightClassRatingToolbarUiModel(navigationBarUiModel=", Separators.RPAREN);
    }
}
