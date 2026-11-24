package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class unj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d270 f35964a;

    public unj(d270 d270Var) {
        this.f35964a = d270Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unj) && this.f35964a == ((unj) obj).f35964a;
    }

    public final int hashCode() {
        return this.f35964a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "OneXGamesPromoTabsType(hasBackStack=false, promoType=" + this.f35964a + Separators.RPAREN;
    }
}
