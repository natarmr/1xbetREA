package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fat0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5h f9226a;

    public fat0(m5h m5hVar) {
        this.f9226a = m5hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fat0) && this.f9226a.equals(((fat0) obj).f9226a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MAP_STATISTIC";
    }

    public final int hashCode() {
        return this.f9226a.f21218a.hashCode() + 1050864563;
    }

    public final String toString() {
        return "UniversalChampMapStatisticUiModel(key=MAP_STATISTIC, mapCollection=" + this.f9226a + Separators.RPAREN;
    }
}
