package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0k0 f30755a;

    public final boolean equals(Object obj) {
        if (obj instanceof rmr) {
            return this.f30755a.equals(((rmr) obj).f30755a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30755a.hashCode();
    }

    public final String toString() {
        return "SimulationClick(uiModel=" + this.f30755a + Separators.RPAREN;
    }
}
