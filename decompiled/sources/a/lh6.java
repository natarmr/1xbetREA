package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lh6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20039a;
    public final int b;
    public final int c;
    public final int d;
    public final ArrayList e;

    public lh6(long j, int i, int i2, int i3, ArrayList arrayList) {
        this.f20039a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh6)) {
            return false;
        }
        lh6 lh6Var = (lh6) obj;
        return this.f20039a == lh6Var.f20039a && this.b == lh6Var.b && this.c == lh6Var.c && this.d == lh6Var.d && this.e.equals(lh6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f20039a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f20039a, "BetBuilderGameEventsGroupModel(gameId=", ", gameVid=");
        rw2.s(this.c, this.d, ", gameType=", ", period=", sbQ);
        sbQ.append(", selections=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
