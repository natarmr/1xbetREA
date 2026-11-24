package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class phq0 implements khq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27011a;
    public final boolean b;
    public final int c;
    public final rqm d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public phq0(int i, boolean z, int i2, rqm rqmVar) {
        this.f27011a = i;
        this.b = z;
        this.c = i2;
        this.d = rqmVar;
        this.e = i + Separators.SP + z + Separators.SP + rqmVar.f30938a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phq0)) {
            return false;
        }
        phq0 phq0Var = (phq0) obj;
        return this.f27011a == phq0Var.f27011a && this.b == phq0Var.b && this.c == phq0Var.c && this.d.equals(phq0Var.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, brm0.e(Integer.hashCode(this.f27011a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f27011a, "TimeFilterUiModel(id=", ", selected=", ", titleRes=", this.b);
        sbL.append(this.c);
        sbL.append(", cardStyle=");
        sbL.append(this.d);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
