package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17172a;
    public final pz40 b;
    public final boolean c;
    public final boolean d;

    public jur0(boolean z, pz40 pz40Var, boolean z2, boolean z3) {
        this.f17172a = z;
        this.b = pz40Var;
        this.c = z2;
        this.d = z3;
    }

    public static jur0 a(jur0 jur0Var, boolean z, int i) {
        boolean z2 = jur0Var.f17172a;
        pz40 pz40Var = jur0Var.b;
        boolean z3 = (i & 4) != 0 ? jur0Var.c : true;
        jur0Var.getClass();
        return new jur0(z2, pz40Var, z3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jur0)) {
            return false;
        }
        jur0 jur0Var = (jur0) obj;
        return this.f17172a == jur0Var.f17172a && this.b.equals(jur0Var.b) && this.c == jur0Var.c && this.d == jur0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((this.b.hashCode() + (Boolean.hashCode(this.f17172a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoPromoBetPageState(hasUserMultipleBalances=");
        sb.append(this.f17172a);
        sb.append(", promoCodeFieldState=");
        sb.append(this.b);
        sb.append(", isPromoCodeFieldEnabled=");
        return ohs0.p(", isMakePromoBetButtonEnabled=", Separators.RPAREN, sb, this.c, this.d);
    }
}
