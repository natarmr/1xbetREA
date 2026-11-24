package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f41105a;
    public final boolean b;
    public final ql5 c;
    public final h40 d;

    public xm5(ke keVar, boolean z, ql5 ql5Var, h40 h40Var) {
        this.f41105a = keVar;
        this.b = z;
        this.c = ql5Var;
        this.d = h40Var;
    }

    public static xm5 a(xm5 xm5Var, ke keVar, boolean z, ql5 ql5Var, h40 h40Var, int i) {
        if ((i & 1) != 0) {
            keVar = xm5Var.f41105a;
        }
        if ((i & 2) != 0) {
            z = xm5Var.b;
        }
        if ((i & 4) != 0) {
            ql5Var = xm5Var.c;
        }
        if ((i & 8) != 0) {
            h40Var = xm5Var.d;
        }
        ql5Var.getClass();
        return new xm5(keVar, z, ql5Var, h40Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm5)) {
            return false;
        }
        xm5 xm5Var = (xm5) obj;
        return this.f41105a.equals(xm5Var.f41105a) && this.b == xm5Var.b && this.c.equals(xm5Var.c) && this.d.equals(xm5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f41105a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "BalanceStateModel(accountInfo=" + this.f41105a + ", isCanChangeBalance=" + this.b + ", currentBalance=" + this.c + ", advanceStateModel=" + this.d + Separators.RPAREN;
    }
}
