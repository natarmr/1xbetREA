package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h2b0 implements j2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lqv f12322a;
    public final jjm b;

    public h2b0(lqv lqvVar, jjm jjmVar) {
        this.f12322a = lqvVar;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2b0)) {
            return false;
        }
        h2b0 h2b0Var = (h2b0) obj;
        return this.f12322a.equals(h2b0Var.f12322a) && this.b.equals(h2b0Var.b);
    }

    @Override // a.j2b0
    public final String getKey() {
        tre0 tre0Var = sre0.f32672a;
        return ohs0.n(tre0Var.b(h2b0.class).J(), tre0Var.b(this.f12322a.getClass()).J());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12322a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularClassicAggregatorHeaderUiModel(headerCategoryType=" + this.f12322a + ", dsHeaderModel=" + this.b + Separators.RPAREN;
    }
}
