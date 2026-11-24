package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class id1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvc0 f14560a;

    public id1(fvc0 fvc0Var) {
        this.f14560a = fvc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id1) && this.f14560a.equals(((id1) obj).f14560a);
    }

    public final int hashCode() {
        return this.f14560a.hashCode();
    }

    public final String toString() {
        return "OnOpenPromoScreen(promoTypeToOpen=" + this.f14560a + Separators.RPAREN;
    }
}
