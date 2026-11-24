package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hat0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knh f12741a;

    public hat0(knh knhVar) {
        this.f12741a = knhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hat0) && this.f12741a.equals(((hat0) obj).f12741a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "PRIZE_POOL";
    }

    public final int hashCode() {
        return this.f12741a.f18586a.hashCode() + 2086819031;
    }

    public final String toString() {
        return "UniversalChampPositionUiModel(key=PRIZE_POOL, tournamentPosition=" + this.f12741a + Separators.RPAREN;
    }
}
