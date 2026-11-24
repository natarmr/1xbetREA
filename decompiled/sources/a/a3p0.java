package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a3p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1p0 f183a;

    public a3p0(m1p0 m1p0Var) {
        this.f183a = m1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3p0) && this.f183a.equals(((a3p0) obj).f183a);
    }

    public final int hashCode() {
        return this.f183a.hashCode();
    }

    public final String toString() {
        return "TeamBetStatisticsShapePanelUiItem(model=" + this.f183a + Separators.RPAREN;
    }
}
