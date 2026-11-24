package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dqh0 implements iqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6516a;
    public final boolean b;
    public final int c;
    public final int d;

    public dqh0(int i, int i2, String str, boolean z) {
        this.f6516a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqh0)) {
            return false;
        }
        dqh0 dqh0Var = (dqh0) obj;
        return this.f6516a.equals(dqh0Var.f6516a) && this.b == dqh0Var.b && this.c == dqh0Var.c && this.d == dqh0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, brm0.e(this.f6516a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", completeProgress=", Separators.RPAREN, brm0.u("Gift(title=", this.f6516a, ", isPromoAvailable=", this.b, ", currentProgress="));
    }
}
