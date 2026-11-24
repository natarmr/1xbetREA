package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xlk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41077a;
    public final long b;
    public final String c;
    public final bmk0 d;

    public xlk0(int i, long j, String str, bmk0 bmk0Var) {
        this.f41077a = i;
        this.b = j;
        this.c = str;
        this.d = bmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlk0)) {
            return false;
        }
        xlk0 xlk0Var = (xlk0) obj;
        return this.f41077a == xlk0Var.f41077a && znq0.e(this.b, xlk0Var.b) && this.c.equals(xlk0Var.c) && this.d == xlk0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(Integer.hashCode(this.f41077a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f41077a, "SoulcaliburRoundModel(round=", ", time=", znq0.h(this.b), ", winnerName=");
        sbR.append(this.c);
        sbR.append(", typeOfWin=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
