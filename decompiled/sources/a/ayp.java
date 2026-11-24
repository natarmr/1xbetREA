package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ayp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqh f1679a;

    public ayp(pqh pqhVar) {
        this.f1679a = pqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayp) && this.f1679a.equals(((ayp) obj).f1679a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STATISTIC";
    }

    public final int hashCode() {
        return this.f1679a.hashCode() + 390503632;
    }

    public final String toString() {
        return "FighterStatisticUiModel(key=STATISTIC, statistic=" + this.f1679a + Separators.RPAREN;
    }
}
