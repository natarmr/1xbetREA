package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4 f19034a;
    public final boolean b;

    public kx4(hx4 hx4Var, boolean z) {
        this.f19034a = hx4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx4)) {
            return false;
        }
        kx4 kx4Var = (kx4) obj;
        return this.f19034a.equals(kx4Var.f19034a) && this.b == kx4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f19034a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoBetTabKeyModel(autoBetState=" + this.f19034a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
