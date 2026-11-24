package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f9567a;
    public final mde b;
    public final boolean c;
    public final boolean d;
    public final zpv e;

    public fi2(imm immVar, mde mdeVar, boolean z, boolean z2, zpv zpvVar) {
        this.f9567a = immVar;
        this.b = mdeVar;
        this.c = z;
        this.d = z2;
        this.e = zpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi2)) {
            return false;
        }
        fi2 fi2Var = (fi2) obj;
        return this.f9567a.equals(fi2Var.f9567a) && this.b.equals(fi2Var.b) && this.c == fi2Var.c && this.d == fi2Var.d && this.e.equals(fi2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (this.f9567a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTeamsUiState(header=");
        sb.append(this.f9567a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", refreshing=");
        ua80.u(", scrollToTop=", ", headerActionsState=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
