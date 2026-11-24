package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z170 f111a;

    public a270(z170 z170Var) {
        this.f111a = z170Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a270) && this.f111a == ((a270) obj).f111a;
    }

    public final int hashCode() {
        return this.f111a.hashCode();
    }

    public final String toString() {
        return "OneXGamesPromoShimmerUiModel(type=" + this.f111a + Separators.RPAREN;
    }
}
