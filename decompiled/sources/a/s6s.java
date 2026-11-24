package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final faj f31719a;

    public final boolean equals(Object obj) {
        if (obj instanceof s6s) {
            return this.f31719a.equals(((s6s) obj).f31719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31719a.hashCode();
    }

    public final String toString() {
        return "SimulationClick(uiModel=" + this.f31719a + Separators.RPAREN;
    }
}
