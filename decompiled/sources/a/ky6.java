package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ky6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd5 f19093a;
    public final iur b;

    public ky6(kd5 kd5Var, iur iurVar) {
        this.f19093a = kd5Var;
        this.b = iurVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky6)) {
            return false;
        }
        ky6 ky6Var = (ky6) obj;
        return this.f19093a.equals(ky6Var.f19093a) && this.b.equals(ky6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19093a.hashCode() * 31);
    }

    public final String toString() {
        return "BetGameInfoStateModel(backgroundStateModel=" + this.f19093a + ", gameCardStateModel=" + this.b + Separators.RPAREN;
    }
}
