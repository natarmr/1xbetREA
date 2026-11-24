package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class le8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19888a;
    public final int b;
    public final int c;

    public le8(int i, int i2, int i3) {
        this.f19888a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le8)) {
            return false;
        }
        le8 le8Var = (le8) obj;
        return this.f19888a == le8Var.f19888a && this.b == le8Var.b && this.c == le8Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f19888a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("BonusGameModel(rotationCount=", this.f19888a, ", winPoints=", ", promoPoints=", this.b));
    }
}
