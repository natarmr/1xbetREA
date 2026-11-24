package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f13795a;
    public final yyc b;
    public final bx6 c;
    public final iwo0 d;
    public final knb0 e;
    public final boolean f;

    public hx4(a8q0 a8q0Var, yyc yycVar, bx6 bx6Var, iwo0 iwo0Var, knb0 knb0Var, boolean z) {
        this.f13795a = a8q0Var;
        this.b = yycVar;
        this.c = bx6Var;
        this.d = iwo0Var;
        this.e = knb0Var;
        this.f = z;
    }

    public static hx4 a(hx4 hx4Var, a8q0 a8q0Var, yyc yycVar, bx6 bx6Var, iwo0 iwo0Var, knb0 knb0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            a8q0Var = hx4Var.f13795a;
        }
        a8q0 a8q0Var2 = a8q0Var;
        if ((i & 2) != 0) {
            yycVar = hx4Var.b;
        }
        yyc yycVar2 = yycVar;
        if ((i & 4) != 0) {
            bx6Var = hx4Var.c;
        }
        bx6 bx6Var2 = bx6Var;
        if ((i & 8) != 0) {
            iwo0Var = hx4Var.d;
        }
        iwo0 iwo0Var2 = iwo0Var;
        if ((i & 16) != 0) {
            knb0Var = hx4Var.e;
        }
        knb0 knb0Var2 = knb0Var;
        if ((i & 32) != 0) {
            z = hx4Var.f;
        }
        hx4Var.getClass();
        yycVar2.getClass();
        return new hx4(a8q0Var2, yycVar2, bx6Var2, iwo0Var2, knb0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx4)) {
            return false;
        }
        hx4 hx4Var = (hx4) obj;
        return this.f13795a.equals(hx4Var.f13795a) && this.b.equals(hx4Var.b) && this.c.equals(hx4Var.c) && this.d.equals(hx4Var.d) && this.e.equals(hx4Var.e) && this.f == hx4Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13795a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoBetStateModel(coefFieldState=" + this.f13795a + ", coefBetFieldParamsStateModel=" + this.b + ", betFieldStateModel=" + this.c + ", taxStateModel=" + this.d + ", possibleWinStateModel=" + this.e + ", isVisibleState=" + this.f + Separators.RPAREN;
    }
}
