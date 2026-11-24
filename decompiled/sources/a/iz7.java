package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15623a;
    public final boolean b;
    public final int c;

    public /* synthetic */ iz7(int i, int i2) {
        this((i2 & 4) != 0 ? 0 : i, false, (i2 & 2) == 0);
    }

    public static iz7 a(iz7 iz7Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = iz7Var.f15623a;
        }
        boolean z2 = iz7Var.b;
        if ((i2 & 4) != 0) {
            i = iz7Var.c;
        }
        iz7Var.getClass();
        return new iz7(i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz7)) {
            return false;
        }
        iz7 iz7Var = (iz7) obj;
        return this.f15623a == iz7Var.f15623a && this.b == iz7Var.b && this.c == iz7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f15623a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, f140.q("BigPigDiceState(areRolling=", ", areLanded=", ", landedThrowNumber=", this.f15623a, this.b));
    }

    public iz7(int i, boolean z, boolean z2) {
        this.f15623a = z;
        this.b = z2;
        this.c = i;
    }
}
