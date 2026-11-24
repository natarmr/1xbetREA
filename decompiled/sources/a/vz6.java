package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38285a;
    public final int b;

    public vz6(int i, int i2) {
        this.f38285a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz6)) {
            return false;
        }
        vz6 vz6Var = (vz6) obj;
        return this.f38285a == vz6Var.f38285a && this.b == vz6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f38285a) * 31);
    }

    public final String toString() {
        return ohs0.m("UpdatePositions(balancePosition=", this.f38285a, ", gamePosition=", Separators.RPAREN, this.b);
    }
}
