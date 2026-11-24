package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pis implements sis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0k0 f27058a;

    public final boolean equals(Object obj) {
        if (obj instanceof pis) {
            return this.f27058a.equals(((pis) obj).f27058a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27058a.hashCode();
    }

    public final String toString() {
        return "SimulationClick(uiModel=" + this.f27058a + Separators.RPAREN;
    }
}
