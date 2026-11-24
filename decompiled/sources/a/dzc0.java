package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final syc0 f6938a;
    public final uyc0 b;
    public final olc0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public dzc0(syc0 syc0Var, uyc0 uyc0Var, olc0 olc0Var, boolean z, boolean z2, boolean z3) {
        this.f6938a = syc0Var;
        this.b = uyc0Var;
        this.c = olc0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static dzc0 a(dzc0 dzc0Var, syc0 syc0Var, olc0 olc0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            syc0Var = dzc0Var.f6938a;
        }
        syc0 syc0Var2 = syc0Var;
        uyc0 uyc0Var = dzc0Var.b;
        if ((i & 4) != 0) {
            olc0Var = dzc0Var.c;
        }
        olc0 olc0Var2 = olc0Var;
        if ((i & 8) != 0) {
            z = dzc0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = dzc0Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = dzc0Var.f;
        }
        return new dzc0(syc0Var2, uyc0Var, olc0Var2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzc0)) {
            return false;
        }
        dzc0 dzc0Var = (dzc0) obj;
        return this.f6938a.equals(dzc0Var.f6938a) && this.b == dzc0Var.b && this.c.equals(dzc0Var.c) && this.d == dzc0Var.d && this.e == dzc0Var.e && this.f == dzc0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f6938a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeStateModel(promocodeFieldState=");
        sb.append(this.f6938a);
        sb.append(", promocodeFieldStyle=");
        sb.append(this.b);
        sb.append(", promoInfoStateModel=");
        sb.append(this.c);
        sb.append(", hasMultiBalanceInfoLineText=");
        sb.append(this.d);
        sb.append(", makeBetBtnEnabled=");
        return ohs0.p(", isVisibleState=", Separators.RPAREN, sb, this.e, this.f);
    }
}
