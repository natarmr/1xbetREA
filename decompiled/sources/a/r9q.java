package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final njx f30097a;

    public r9q(njx njxVar) {
        this.f30097a = njxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9q) && this.f30097a.equals(((r9q) obj).f30097a);
    }

    public final int hashCode() {
        return this.f30097a.hashCode();
    }

    public final String toString() {
        return "OnInstrumentClick(instrument=" + this.f30097a + Separators.RPAREN;
    }
}
