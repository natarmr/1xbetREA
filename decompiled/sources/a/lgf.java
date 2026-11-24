package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lgf {
    public static final lgf h = new lgf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20006a;
    public final double b;
    public final csr c;
    public final double d;
    public final khf e;
    public final double f;
    public final lnm0 g;

    public lgf() {
        this(0L, 0.0d, csr.e, 0.0d, new khf(iun.f15405a), 0.0d, lnm0.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgf)) {
            return false;
        }
        lgf lgfVar = (lgf) obj;
        return this.f20006a == lgfVar.f20006a && Double.compare(this.b, lgfVar.b) == 0 && Intrinsics.d(this.c, lgfVar.c) && Double.compare(this.d, lgfVar.d) == 0 && Intrinsics.d(this.e, lgfVar.e) && Double.compare(this.f, lgfVar.f) == 0 && this.g == lgfVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.d(this.f, dw9.a(brm0.d(this.d, (this.c.hashCode() + brm0.d(this.b, Long.hashCode(this.f20006a) * 31, 31)) * 31, 31), 31, this.e.f18288a), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f20006a, "CrystalModel(accountId=", ", newBalance=");
        sbQ.append(this.b);
        sbQ.append(", bonusInfo=");
        sbQ.append(this.c);
        ohs0.A(sbQ, this.d, ", winSum=", ", roundState=");
        sbQ.append(this.e);
        sbQ.append(", coeff=");
        sbQ.append(this.f);
        sbQ.append(", gameStatus=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public lgf(long j, double d, csr csrVar, double d2, khf khfVar, double d3, lnm0 lnm0Var) {
        csrVar.getClass();
        this.f20006a = j;
        this.b = d;
        this.c = csrVar;
        this.d = d2;
        this.e = khfVar;
        this.f = d3;
        this.g = lnm0Var;
    }
}
