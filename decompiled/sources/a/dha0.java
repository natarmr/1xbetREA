package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cca0 f6083a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dha0(cca0 cca0Var, boolean z, boolean z2, boolean z3) {
        this.f6083a = cca0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static dha0 a(dha0 dha0Var, cca0 cca0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            cca0Var = dha0Var.f6083a;
        }
        if ((i & 4) != 0) {
            z2 = dha0Var.c;
        }
        if ((i & 8) != 0) {
            z3 = dha0Var.d;
        }
        dha0Var.getClass();
        return new dha0(cca0Var, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dha0)) {
            return false;
        }
        dha0 dha0Var = (dha0) obj;
        return Intrinsics.d(this.f6083a, dha0Var.f6083a) && this.b == dha0Var.b && this.c == dha0Var.c && this.d == dha0Var.d;
    }

    public final int hashCode() {
        cca0 cca0Var = this.f6083a;
        return Boolean.hashCode(this.d) + brm0.e(brm0.e((cca0Var == null ? 0 : cca0Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayersMenuState(playerTennisMenuModel=");
        sb.append(this.f6083a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isEmpty=");
        return ohs0.p(", isError=", Separators.RPAREN, sb, this.c, this.d);
    }
}
