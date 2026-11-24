package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24808a;
    public final double b;
    public final double c;
    public final double d;
    public final yeg0 e;
    public final List f;
    public final esr g;

    public o80(long j, double d, double d2, double d3, yeg0 yeg0Var, ArrayList arrayList, int i) {
        j = (i & 1) != 0 ? 0L : j;
        d = (i & 2) != 0 ? 0.0d : d;
        d2 = (i & 4) != 0 ? 0.0d : d2;
        d3 = (i & 8) != 0 ? 0.0d : d3;
        yeg0Var = (i & 16) != 0 ? yeg0.b : yeg0Var;
        List list = (i & 32) != 0 ? iun.f15405a : arrayList;
        esr esrVar = esr.NOTHING;
        list.getClass();
        this.f24808a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = yeg0Var;
        this.f = list;
        this.g = esrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o80)) {
            return false;
        }
        o80 o80Var = (o80) obj;
        return this.f24808a == o80Var.f24808a && Double.compare(this.b, o80Var.b) == 0 && Double.compare(this.c, o80Var.c) == 0 && Double.compare(this.d, o80Var.d) == 0 && this.e == o80Var.e && this.f.equals(o80Var.f) && this.g == o80Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a((this.e.hashCode() + brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f24808a) * 31, 31), 31), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f24808a, "AfricanRouletteGameModel(accountId=", ", winSum=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", balanceNew=", ", coefficient=");
        sbQ.append(this.d);
        sbQ.append(", result=");
        sbQ.append(this.e);
        sbQ.append(", rouletteWins=");
        sbQ.append(this.f);
        sbQ.append(", bonusType=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
