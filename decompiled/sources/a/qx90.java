package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qx90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29472a;
    public final int b;
    public final int c;
    public final int d;

    public qx90(int i, int i2, int i3, long j) {
        this.f29472a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx90)) {
            return false;
        }
        qx90 qx90Var = (qx90) obj;
        return this.f29472a == qx90Var.f29472a && this.b == qx90Var.b && this.c == qx90Var.c && this.d == qx90Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Long.hashCode(this.f29472a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f29472a, "PlayTreasureResult(userId=", ", bonusBalance=");
        rw2.s(this.c, this.d, ", rotationCount=", ", winPoints=", sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
