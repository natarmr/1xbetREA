package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y9s0 implements bas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s9s0 f42265a;

    public y9s0(s9s0 s9s0Var) {
        this.f42265a = s9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9s0) && this.f42265a == ((y9s0) obj).f42265a;
    }

    public final int hashCode() {
        s9s0 s9s0Var = this.f42265a;
        if (s9s0Var == null) {
            return 0;
        }
        return s9s0Var.hashCode();
    }

    public final String toString() {
        return "OnBackClick(tournamentsPage=" + this.f42265a + Separators.RPAREN;
    }
}
