package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pza0 implements oza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkl f27836a;

    public pza0(fkl fklVar) {
        this.f27836a = fklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pza0) && this.f27836a.equals(((pza0) obj).f27836a);
    }

    public final int hashCode() {
        return this.f27836a.hashCode();
    }

    public final String toString() {
        return "PopularAggregatorMyAggregatorBannerItemUiModel(uiModel=" + this.f27836a + Separators.RPAREN;
    }
}
