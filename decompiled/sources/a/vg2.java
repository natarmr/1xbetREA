package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f37362a;
    public final lde b;
    public final boolean c;
    public final boolean d;
    public final zpv e;

    public vg2(imm immVar, lde ldeVar, boolean z, boolean z2, zpv zpvVar) {
        this.f37362a = immVar;
        this.b = ldeVar;
        this.c = z;
        this.d = z2;
        this.e = zpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg2)) {
            return false;
        }
        vg2 vg2Var = (vg2) obj;
        return this.f37362a.equals(vg2Var.f37362a) && this.b.equals(vg2Var.b) && this.c == vg2Var.c && this.d == vg2Var.d && this.e.equals(vg2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (this.f37362a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportEventsUiState(header=");
        sb.append(this.f37362a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", refreshing=");
        ua80.u(", scrollToTop=", ", headerActionsState=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
