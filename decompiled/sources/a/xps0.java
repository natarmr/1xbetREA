package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xps0 implements zps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41283a;
    public final int b;

    public xps0(int i, int i2) {
        this.f41283a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xps0)) {
            return false;
        }
        xps0 xps0Var = (xps0) obj;
        return this.f41283a == xps0Var.f41283a && this.b == xps0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f41283a) * 31);
    }

    public final String toString() {
        return ohs0.m("OpenTreasure(treasureId=", this.f41283a, ", winPoints=", Separators.RPAREN, this.b);
    }
}
