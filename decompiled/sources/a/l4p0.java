package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f19420a;
    public final eie b;

    public l4p0(imm immVar, eie eieVar) {
        this.f19420a = immVar;
        this.b = eieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4p0)) {
            return false;
        }
        l4p0 l4p0Var = (l4p0) obj;
        return this.f19420a.equals(l4p0Var.f19420a) && this.b.equals(l4p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19420a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetTeamsUiState(navigationModel=" + this.f19420a + ", content=" + this.b + Separators.RPAREN;
    }
}
