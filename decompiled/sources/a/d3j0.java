package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5405a;
    public final boolean b;

    public d3j0(double d, boolean z) {
        this.f5405a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3j0)) {
            return false;
        }
        d3j0 d3j0Var = (d3j0) obj;
        return Double.compare(this.f5405a, d3j0Var.f5405a) == 0 && this.b == d3j0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.f5405a) * 31);
    }

    public final String toString() {
        return "SettingsMakeBetDefaultBetSumStateModel(editedSum=" + this.f5405a + ", isDefaultBetToggleEnabled=" + this.b + Separators.RPAREN;
    }
}
