package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class f2b0 implements j2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bvl f8804a;

    public f2b0(bvl bvlVar) {
        this.f8804a = bvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2b0) && this.f8804a.equals(((f2b0) obj).f8804a);
    }

    @Override // a.j2b0
    public final String getKey() {
        String strJ = sre0.f32672a.b(f2b0.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f8804a.hashCode();
    }

    public final String toString() {
        return "PopularClassicAggregatorCategoriesItemUiModel(dsCategoryCardCollectionUiModel=" + this.f8804a + Separators.RPAREN;
    }
}
