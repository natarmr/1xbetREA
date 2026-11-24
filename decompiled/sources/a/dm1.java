package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6304a;
    public final int b;
    public final int c;
    public final boolean d;

    public dm1(int i, int i2, int i3, boolean z) {
        this.f6304a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm1)) {
            return false;
        }
        dm1 dm1Var = (dm1) obj;
        return this.f6304a == dm1Var.f6304a && this.b == dm1Var.b && this.c == dm1Var.c && this.d == dm1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f6304a) * 31, 31), 31);
    }

    public final String toString() {
        return ohs0.k(this.c, ", afterAuth=", Separators.RPAREN, dw9.t("GiftsScreen(bonusesCount=", this.f6304a, ", freeSpinsCount=", ", giftTypeId=", this.b), this.d);
    }
}
