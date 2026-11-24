package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class czc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tyc0 f5218a;
    public final yyc0 b;
    public final qlc0 c;
    public final boolean d;
    public final boolean e;

    public czc0(tyc0 tyc0Var, yyc0 yyc0Var, qlc0 qlc0Var, boolean z, boolean z2) {
        this.f5218a = tyc0Var;
        this.b = yyc0Var;
        this.c = qlc0Var;
        this.d = z;
        this.e = z2;
    }

    public static czc0 a(czc0 czc0Var, tyc0 tyc0Var, qlc0 qlc0Var, boolean z, boolean z2, int i) {
        yyc0 yyc0Var = yyc0.f43460a;
        if ((i & 1) != 0) {
            tyc0Var = czc0Var.f5218a;
        }
        tyc0 tyc0Var2 = tyc0Var;
        if ((i & 2) != 0) {
            yyc0Var = czc0Var.b;
        }
        yyc0 yyc0Var2 = yyc0Var;
        if ((i & 4) != 0) {
            qlc0Var = czc0Var.c;
        }
        qlc0 qlc0Var2 = qlc0Var;
        if ((i & 8) != 0) {
            z = czc0Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = czc0Var.e;
        }
        czc0Var.getClass();
        return new czc0(tyc0Var2, yyc0Var2, qlc0Var2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czc0)) {
            return false;
        }
        czc0 czc0Var = (czc0) obj;
        return this.f5218a.equals(czc0Var.f5218a) && this.b == czc0Var.b && this.c.equals(czc0Var.c) && this.d == czc0Var.d && this.e == czc0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f5218a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeStateModel(promocodeFieldUiState=");
        sb.append(this.f5218a);
        sb.append(", promocodeFieldStyle=");
        sb.append(this.b);
        sb.append(", promoInfoStateModel=");
        sb.append(this.c);
        sb.append(", hasMultiBalanceInfoLineText=");
        sb.append(this.d);
        sb.append(", makeBetBtnEnabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
