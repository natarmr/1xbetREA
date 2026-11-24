package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xwr0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwr0 f41624a;
    public final int b;

    public xwr0(wwr0 wwr0Var, int i) {
        this.f41624a = wwr0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwr0)) {
            return false;
        }
        xwr0 xwr0Var = (xwr0) obj;
        return this.f41624a.equals(xwr0Var.f41624a) && this.b == xwr0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f41624a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentBracketLineUiModel(type=" + this.f41624a + ", rows=" + this.b + Separators.RPAREN;
    }
}
