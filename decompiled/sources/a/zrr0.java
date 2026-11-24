package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zrr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypq0 f44871a;
    public final apq0 b;

    public zrr0(ypq0 ypq0Var, apq0 apq0Var) {
        this.f44871a = ypq0Var;
        this.b = apq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrr0)) {
            return false;
        }
        zrr0 zrr0Var = (zrr0) obj;
        return this.f44871a.equals(zrr0Var.f44871a) && this.b.equals(zrr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44871a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoJackpotTirageUiModel(tirageHeaderUiModel=" + this.f44871a + ", tirageCardUiModel=" + this.b + Separators.RPAREN;
    }
}
