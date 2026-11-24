package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uhc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jic0 f35671a;
    public final jic0 b;
    public final eoc0 c;

    public uhc0(jic0 jic0Var, jic0 jic0Var2, eoc0 eoc0Var) {
        this.f35671a = jic0Var;
        this.b = jic0Var2;
        this.c = eoc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhc0)) {
            return false;
        }
        uhc0 uhc0Var = (uhc0) obj;
        return this.f35671a.equals(uhc0Var.f35671a) && this.b.equals(uhc0Var.b) && this.c.equals(uhc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f35671a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PromoEntitiesModel(promoSlotGame=" + this.f35671a + ", promoLiveAggregatorGame=" + this.b + ", promoProduct=" + this.c + Separators.RPAREN;
    }
}
