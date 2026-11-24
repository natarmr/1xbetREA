package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class heu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12941a;
    public final int b;

    public heu0(int i, int i2) {
        this.f12941a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heu0)) {
            return false;
        }
        heu0 heu0Var = (heu0) obj;
        return this.f12941a == heu0Var.f12941a && this.b == heu0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f12941a) * 31);
    }

    public final String toString() {
        return ohs0.m("VictoryIndicatorUiModel(winsCount=", this.f12941a, ", totalCount=", Separators.RPAREN, this.b);
    }
}
