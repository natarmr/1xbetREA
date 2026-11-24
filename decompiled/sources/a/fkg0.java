package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lig0 f9690a;
    public final ekg0 b;

    public fkg0(lig0 lig0Var, ekg0 ekg0Var) {
        this.f9690a = lig0Var;
        this.b = ekg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkg0)) {
            return false;
        }
        fkg0 fkg0Var = (fkg0) obj;
        return this.f9690a == fkg0Var.f9690a && this.b == fkg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9690a.hashCode() * 31);
    }

    public final String toString() {
        return "RpsRoundResultModel(figure=" + this.f9690a + ", result=" + this.b + Separators.RPAREN;
    }
}
