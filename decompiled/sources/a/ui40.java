package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ui40 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4m f35712a;

    public ui40(t4m t4mVar) {
        this.f35712a = t4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui40) && this.f35712a.equals(((ui40) obj).f35712a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "GOLD_CHART";
    }

    public final int hashCode() {
        return this.f35712a.hashCode() + 1645375681;
    }

    public final String toString() {
        return "MlbbGoldChartUiModel(key=GOLD_CHART, chart=" + this.f35712a + Separators.RPAREN;
    }
}
