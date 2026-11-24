package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class efm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7726a;
    public final String b;

    public efm0(String str, String str2) {
        this.f7726a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efm0)) {
            return false;
        }
        efm0 efm0Var = (efm0) obj;
        return this.f7726a.equals(efm0Var.f7726a) && this.b.equals(efm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7726a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StatisticModel(id=", this.f7726a, ", value=", this.b, Separators.RPAREN);
    }
}
