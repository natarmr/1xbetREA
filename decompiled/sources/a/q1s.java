package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0k0 f27969a;

    public q1s(d0k0 d0k0Var) {
        this.f27969a = d0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1s) && this.f27969a.equals(((q1s) obj).f27969a);
    }

    public final int hashCode() {
        return this.f27969a.hashCode();
    }

    public final String toString() {
        return "SimulationClick(uiModel=" + this.f27969a + Separators.RPAREN;
    }
}
