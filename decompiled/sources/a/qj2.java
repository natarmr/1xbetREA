package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f28816a;
    public final nde b;
    public final boolean c;
    public final boolean d;
    public final zpv e;

    public qj2(imm immVar, nde ndeVar, boolean z, boolean z2, zpv zpvVar) {
        this.f28816a = immVar;
        this.b = ndeVar;
        this.c = z;
        this.d = z2;
        this.e = zpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj2)) {
            return false;
        }
        qj2 qj2Var = (qj2) obj;
        return this.f28816a.equals(qj2Var.f28816a) && this.b.equals(qj2Var.b) && this.c == qj2Var.c && this.d == qj2Var.d && this.e.equals(qj2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e((this.b.hashCode() + (this.f28816a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AltSportTournamentsUiState(header=");
        sb.append(this.f28816a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", refreshing=");
        ua80.u(", scrollToTop=", ", headerActionsState=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
