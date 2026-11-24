package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kf9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ubs0 f18186a;
    public final kye b;

    public kf9(ubs0 ubs0Var, kye kyeVar) {
        this.f18186a = ubs0Var;
        this.b = kyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf9)) {
            return false;
        }
        kf9 kf9Var = (kf9) obj;
        return this.f18186a.equals(kf9Var.f18186a) && this.b.equals(kf9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18186a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonsLaneUiModel(trackCouponInteractionUiModel=" + this.f18186a + ", couponInteractionUiModel=" + this.b + Separators.RPAREN;
    }
}
