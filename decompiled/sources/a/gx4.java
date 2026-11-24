package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gx4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f12059a;
    public final xyc b;
    public final dx6 c;
    public final kwo0 d;
    public final mnb0 e;

    public gx4(a8q0 a8q0Var, xyc xycVar, dx6 dx6Var, kwo0 kwo0Var, mnb0 mnb0Var) {
        this.f12059a = a8q0Var;
        this.b = xycVar;
        this.c = dx6Var;
        this.d = kwo0Var;
        this.e = mnb0Var;
    }

    public static gx4 a(gx4 gx4Var, a8q0 a8q0Var, xyc xycVar, dx6 dx6Var, kwo0 kwo0Var, mnb0 mnb0Var, int i) {
        if ((i & 1) != 0) {
            a8q0Var = gx4Var.f12059a;
        }
        a8q0 a8q0Var2 = a8q0Var;
        if ((i & 2) != 0) {
            xycVar = gx4Var.b;
        }
        xyc xycVar2 = xycVar;
        if ((i & 4) != 0) {
            dx6Var = gx4Var.c;
        }
        dx6 dx6Var2 = dx6Var;
        if ((i & 8) != 0) {
            kwo0Var = gx4Var.d;
        }
        kwo0 kwo0Var2 = kwo0Var;
        if ((i & 16) != 0) {
            mnb0Var = gx4Var.e;
        }
        gx4Var.getClass();
        return new gx4(a8q0Var2, xycVar2, dx6Var2, kwo0Var2, mnb0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx4)) {
            return false;
        }
        gx4 gx4Var = (gx4) obj;
        return this.f12059a.equals(gx4Var.f12059a) && this.b.equals(gx4Var.b) && this.c.equals(gx4Var.c) && this.d.equals(gx4Var.d) && this.e.equals(gx4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12059a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutoBetStateModel(coefFieldState=" + this.f12059a + ", coefBetFieldParamsStateModel=" + this.b + ", betFieldStateModel=" + this.c + ", taxStateModel=" + this.d + ", possibleWinStateModel=" + this.e + Separators.RPAREN;
    }
}
