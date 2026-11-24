package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qza0 implements oza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f29570a;
    public final hkl b;
    public final jml c;

    public qza0(jjm jjmVar, hkl hklVar, jml jmlVar) {
        this.f29570a = jjmVar;
        this.b = hklVar;
        this.c = jmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qza0)) {
            return false;
        }
        qza0 qza0Var = (qza0) obj;
        return this.f29570a.equals(qza0Var.f29570a) && Intrinsics.d(this.b, qza0Var.b) && Intrinsics.d(this.c, qza0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f29570a.hashCode() * 31;
        hkl hklVar = this.b;
        int iHashCode2 = (iHashCode + (hklVar == null ? 0 : hklVar.hashCode())) * 31;
        jml jmlVar = this.c;
        return iHashCode2 + (jmlVar != null ? jmlVar.hashCode() : 0);
    }

    public final String toString() {
        return "PopularAggregatorPromoEntitiesItemUiModel(dsHeaderModel=" + this.f29570a + ", providerMonthBannerUiModel=" + this.b + ", aggregatorGamesCollectionPopularUiModel=" + this.c + Separators.RPAREN;
    }
}
