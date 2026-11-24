package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w2p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1p0 f38462a;

    public w2p0(j1p0 j1p0Var) {
        this.f38462a = j1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2p0) && this.f38462a.equals(((w2p0) obj).f38462a);
    }

    public final int hashCode() {
        return this.f38462a.hashCode();
    }

    public final String toString() {
        return "TeamBetStatisticsPieChartUiItem(model=" + this.f38462a + Separators.RPAREN;
    }
}
