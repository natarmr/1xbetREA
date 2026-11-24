package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g5l0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10726a;
    public final long b;
    public final mxl c;

    public g5l0(long j, long j2, mxl mxlVar) {
        this.f10726a = j;
        this.b = j2;
        this.c = mxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5l0)) {
            return false;
        }
        g5l0 g5l0Var = (g5l0) obj;
        return this.f10726a == g5l0Var.f10726a && this.b == g5l0Var.b && this.c.equals(g5l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f10726a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f10726a, "SportDsChipUiModel(id=", ", subSportId=");
        sbQ.append(this.b);
        sbQ.append(", dsChipModel=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
