package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vps0 implements zps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37822a;
    public final int b;

    public vps0(int i, int i2) {
        this.f37822a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vps0)) {
            return false;
        }
        vps0 vps0Var = (vps0) obj;
        return this.f37822a == vps0Var.f37822a && this.b == vps0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f37822a) * 31);
    }

    public final String toString() {
        return ohs0.m("GameResult(treasureId=", this.f37822a, ", winPoints=", Separators.RPAREN, this.b);
    }
}
