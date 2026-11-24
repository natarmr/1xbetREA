package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ol2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25433a;
    public final ode b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final zpv f;

    public ol2(imm immVar, ode odeVar, boolean z, boolean z2, boolean z3, zpv zpvVar) {
        this.f25433a = immVar;
        this.b = odeVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = zpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol2)) {
            return false;
        }
        ol2 ol2Var = (ol2) obj;
        return this.f25433a.equals(ol2Var.f25433a) && this.b.equals(ol2Var.b) && this.c == ol2Var.c && this.d == ol2Var.d && this.e == ol2Var.e && this.f.equals(ol2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e((this.b.hashCode() + (this.f25433a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTrackedUiState(header=");
        sb.append(this.f25433a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", refreshing=");
        ua80.u(", scrollToTop=", ", canScrollUp=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", headerActionsState=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
