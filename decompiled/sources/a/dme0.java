package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes7.dex */
public final class dme0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f6319a;
    public final fle0 b;

    public dme0(imm immVar, fle0 fle0Var) {
        this.f6319a = immVar;
        this.b = fle0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dme0)) {
            return false;
        }
        dme0 dme0Var = (dme0) obj;
        return this.f6319a.equals(dme0Var.f6319a) && this.b.equals(dme0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6319a.hashCode() * 31);
    }

    public final String toString() {
        return "RefereeTourUiState(navigationBarModel=" + this.f6319a + ", refereeTourContentUiState=" + this.b + Separators.RPAREN;
    }
}
