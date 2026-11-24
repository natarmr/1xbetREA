package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oas0 implements ras0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9s0 f24945a;

    public oas0(s9s0 s9s0Var) {
        this.f24945a = s9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oas0) && this.f24945a == ((oas0) obj).f24945a;
    }

    public final int hashCode() {
        s9s0 s9s0Var = this.f24945a;
        if (s9s0Var == null) {
            return 0;
        }
        return s9s0Var.hashCode();
    }

    public final String toString() {
        return "SetResultOnExit(tournamentsPage=" + this.f24945a + Separators.RPAREN;
    }
}
