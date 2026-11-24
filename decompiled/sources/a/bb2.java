package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qim f2287a;
    public final boolean b;
    public final z4g0 c;
    public final boolean d;
    public final boolean e;

    public bb2(qim qimVar, boolean z, z4g0 z4g0Var, boolean z2, boolean z3) {
        this.f2287a = qimVar;
        this.b = z;
        this.c = z4g0Var;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb2)) {
            return false;
        }
        bb2 bb2Var = (bb2) obj;
        return this.f2287a.equals(bb2Var.f2287a) && this.b == bb2Var.b && this.c.equals(bb2Var.c) && this.d == bb2Var.d && this.e == bb2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e((this.c.hashCode() + brm0.e(this.f2287a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltGamesHistoryResultsUiState(headerModel=");
        sb.append(this.f2287a);
        sb.append(", refresh=");
        sb.append(this.b);
        sb.append(", resultState=");
        sb.append(this.c);
        sb.append(", scrollTop=");
        sb.append(this.d);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
