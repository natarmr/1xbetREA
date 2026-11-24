package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class i2b0 implements j2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14039a;
    public final jml b;

    public i2b0(boolean z, jml jmlVar) {
        this.f14039a = z;
        this.b = jmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2b0)) {
            return false;
        }
        i2b0 i2b0Var = (i2b0) obj;
        return this.f14039a == i2b0Var.f14039a && this.b.equals(i2b0Var.b);
    }

    @Override // a.j2b0
    public final String getKey() {
        String strJ = sre0.f32672a.b(i2b0.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f14039a) * 31);
    }

    public final String toString() {
        return "PopularClassicAggregatorPromoGamesItemUiModel(isTopItem=" + this.f14039a + ", aggregatorGamesCollectionPopularUiModel=" + this.b + Separators.RPAREN;
    }
}
