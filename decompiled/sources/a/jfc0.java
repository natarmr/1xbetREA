package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jfc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azc0 f16419a;
    public final wyc0 b;
    public final rlc0 c;
    public final boolean d;
    public final boolean e;

    public jfc0(azc0 azc0Var, wyc0 wyc0Var, rlc0 rlc0Var, boolean z, boolean z2) {
        this.f16419a = azc0Var;
        this.b = wyc0Var;
        this.c = rlc0Var;
        this.d = z;
        this.e = z2;
    }

    public static jfc0 a(jfc0 jfc0Var, azc0 azc0Var, rlc0 rlc0Var, boolean z, boolean z2, int i) {
        wyc0 wyc0Var = wyc0.f39969a;
        if ((i & 1) != 0) {
            azc0Var = jfc0Var.f16419a;
        }
        azc0 azc0Var2 = azc0Var;
        if ((i & 2) != 0) {
            wyc0Var = jfc0Var.b;
        }
        wyc0 wyc0Var2 = wyc0Var;
        if ((i & 4) != 0) {
            rlc0Var = jfc0Var.c;
        }
        rlc0 rlc0Var2 = rlc0Var;
        if ((i & 8) != 0) {
            z = jfc0Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = jfc0Var.e;
        }
        jfc0Var.getClass();
        return new jfc0(azc0Var2, wyc0Var2, rlc0Var2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfc0)) {
            return false;
        }
        jfc0 jfc0Var = (jfc0) obj;
        return this.f16419a.equals(jfc0Var.f16419a) && this.b == jfc0Var.b && this.c.equals(jfc0Var.c) && this.d == jfc0Var.d && this.e == jfc0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f16419a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeStateModel(promoCodeFieldUiState=");
        sb.append(this.f16419a);
        sb.append(", promoCodeFieldStyle=");
        sb.append(this.b);
        sb.append(", promoInfoStateModel=");
        sb.append(this.c);
        sb.append(", hasMultiBalanceInfoLineText=");
        sb.append(this.d);
        sb.append(", makeBetBtnEnabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
