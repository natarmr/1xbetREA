package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class luc0 implements nuc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f20668a;
    public final guc0 b;
    public final hh80 c;

    public luc0(a4x a4xVar, guc0 guc0Var, lh80 lh80Var) {
        a4xVar.getClass();
        guc0Var.getClass();
        this.f20668a = a4xVar;
        this.b = guc0Var;
        this.c = lh80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luc0)) {
            return false;
        }
        luc0 luc0Var = (luc0) obj;
        return Intrinsics.d(this.f20668a, luc0Var.f20668a) && this.b == luc0Var.b && Intrinsics.d(this.c, luc0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f20668a.hashCode() * 31)) * 31;
        hh80 hh80Var = this.c;
        return iHashCode + (hh80Var == null ? 0 : hh80Var.hashCode());
    }

    public final String toString() {
        return "Cards(items=" + this.f20668a + ", orientation=" + this.b + ", contentPadding=" + this.c + Separators.RPAREN;
    }
}
