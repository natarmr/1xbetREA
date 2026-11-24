package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vhc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kic0 f37423a;
    public final kic0 b;
    public final foc0 c;

    public vhc0(kic0 kic0Var, kic0 kic0Var2, foc0 foc0Var) {
        this.f37423a = kic0Var;
        this.b = kic0Var2;
        this.c = foc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhc0)) {
            return false;
        }
        vhc0 vhc0Var = (vhc0) obj;
        return this.f37423a.equals(vhc0Var.f37423a) && this.b.equals(vhc0Var.b) && this.c.equals(vhc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f37423a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PromoEntitiesModel(promoSlotGame=" + this.f37423a + ", promoLiveAggregatorGame=" + this.b + ", promoProduct=" + this.c + Separators.RPAREN;
    }
}
