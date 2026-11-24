package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic8 f12857a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final mdm e;

    public hd8(ic8 ic8Var, boolean z, boolean z2, boolean z3, mdm mdmVar) {
        this.f12857a = ic8Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = mdmVar;
    }

    public static hd8 a(hd8 hd8Var, ic8 ic8Var, boolean z, boolean z2, boolean z3, mdm mdmVar, int i) {
        if ((i & 1) != 0) {
            ic8Var = hd8Var.f12857a;
        }
        ic8 ic8Var2 = ic8Var;
        if ((i & 2) != 0) {
            z = hd8Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = hd8Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = hd8Var.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            mdmVar = hd8Var.e;
        }
        hd8Var.getClass();
        ic8Var2.getClass();
        return new hd8(ic8Var2, z4, z5, z6, mdmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd8)) {
            return false;
        }
        hd8 hd8Var = (hd8) obj;
        return this.f12857a.equals(hd8Var.f12857a) && this.b == hd8Var.b && this.c == hd8Var.c && this.d == hd8Var.d && Intrinsics.d(this.e, hd8Var.e);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(this.f12857a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        mdm mdmVar = this.e;
        return iE + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusAgreementsStateModel(bonusAgreements=");
        sb.append(this.f12857a);
        sb.append(", showLoading=");
        sb.append(this.b);
        sb.append(", showRefresh=");
        ua80.u(", showEmptyView=", ", emptyView=", sb, this.c, this.d);
        return cs0.m(sb, this.e, Separators.RPAREN);
    }
}
