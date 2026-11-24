package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uhm f3069a;

    public bra(uhm uhmVar) {
        this.f3069a = uhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bra) && this.f3069a.equals(((bra) obj).f3069a);
    }

    public final int hashCode() {
        return this.f3069a.hashCode();
    }

    public final String toString() {
        return "CardsHeaderContainerUiStateModel(headerModel=" + this.f3069a + Separators.RPAREN;
    }
}
