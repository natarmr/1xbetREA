package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qe70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28569a;
    public final ql5 b;
    public final boolean c;
    public final boolean d;

    public qe70(boolean z, ql5 ql5Var, boolean z2, boolean z3) {
        this.f28569a = z;
        this.b = ql5Var;
        this.c = z2;
        this.d = z3;
    }

    public static qe70 a(qe70 qe70Var, ql5 ql5Var, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? qe70Var.f28569a : false;
        if ((i & 2) != 0) {
            ql5Var = qe70Var.b;
        }
        if ((i & 4) != 0) {
            z = qe70Var.c;
        }
        if ((i & 8) != 0) {
            z2 = qe70Var.d;
        }
        qe70Var.getClass();
        ql5Var.getClass();
        return new qe70(z3, ql5Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe70)) {
            return false;
        }
        qe70 qe70Var = (qe70) obj;
        return this.f28569a == qe70Var.f28569a && this.b.equals(qe70Var.b) && this.c == qe70Var.c && this.d == qe70Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (Boolean.hashCode(this.f28569a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceState(loading=");
        sb.append(this.f28569a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", enable=");
        return ohs0.p(", showAccordion=", Separators.RPAREN, sb, this.c, this.d);
    }
}
