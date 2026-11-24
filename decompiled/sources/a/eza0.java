package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eza0 implements oza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f8663a;
    public final bvl b;

    public eza0(jjm jjmVar, bvl bvlVar) {
        this.f8663a = jjmVar;
        this.b = bvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eza0)) {
            return false;
        }
        eza0 eza0Var = (eza0) obj;
        return this.f8663a.equals(eza0Var.f8663a) && this.b.equals(eza0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8663a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularAggregatorCategoriesItemUiModel(dsHeaderModel=" + this.f8663a + ", dsCategoryCardCollectionUiModel=" + this.b + Separators.RPAREN;
    }
}
