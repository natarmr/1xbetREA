package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zl0 implements am0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44557a;

    public zl0(mdm mdmVar) {
        this.f44557a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl0) && this.f44557a.equals(((zl0) obj).f44557a);
    }

    public final int hashCode() {
        return this.f44557a.hashCode();
    }

    public final String toString() {
        return b1j.j("AggregatorFavoritesLottieUiModel(config=", this.f44557a, Separators.RPAREN);
    }
}
