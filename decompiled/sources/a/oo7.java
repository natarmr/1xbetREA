package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class oo7 {
    public static final no7 Companion = new no7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25580a;
    public final double b;

    public /* synthetic */ oo7(double d, int i, int i2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, mo7.f22121a.getDescriptor());
            throw null;
        }
        this.f25580a = i2;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo7)) {
            return false;
        }
        oo7 oo7Var = (oo7) obj;
        return this.f25580a == oo7Var.f25580a && Double.compare(this.b, oo7Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.f25580a) * 31);
    }

    public final String toString() {
        return "BetUserRequest(typeBet=" + this.f25580a + ", sumBet=" + this.b + Separators.RPAREN;
    }

    public oo7(double d, int i) {
        this.f25580a = i;
        this.b = d;
    }
}
