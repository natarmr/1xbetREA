package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6260a;

    public dl4(String str) {
        this.f6260a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl4) && this.f6260a.equals(((dl4) obj).f6260a);
    }

    public final int hashCode() {
        return this.f6260a.hashCode();
    }

    public final String toString() {
        return kng0.l("AuthOfferUiState(imageUrl=", this.f6260a, Separators.RPAREN);
    }
}
