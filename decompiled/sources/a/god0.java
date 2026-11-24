package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class god0 implements jod0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f11626a;
    public final String b;

    public god0(String str, double d) {
        this.f11626a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof god0)) {
            return false;
        }
        god0 god0Var = (god0) obj;
        return Double.compare(this.f11626a, god0Var.f11626a) == 0 && this.b.equals(god0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f11626a) * 31);
    }

    public final String toString() {
        StringBuilder sbS = vqd.s("ShowEnabledSnack(bet=", this.f11626a, ", currencySymbol=", this.b);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
