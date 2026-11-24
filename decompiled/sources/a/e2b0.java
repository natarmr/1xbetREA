package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class e2b0 implements j2b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vs5 f7076a;
    public final hkl b;

    public e2b0(vs5 vs5Var, hkl hklVar) {
        this.f7076a = vs5Var;
        this.b = hklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2b0)) {
            return false;
        }
        e2b0 e2b0Var = (e2b0) obj;
        return this.f7076a.equals(e2b0Var.f7076a) && this.b.equals(e2b0Var.b);
    }

    @Override // a.j2b0
    public final String getKey() {
        tre0 tre0Var = sre0.f32672a;
        return ohs0.n(tre0Var.b(e2b0.class).J(), tre0Var.b(this.f7076a.getClass()).J());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7076a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularClassicAggregatorBannerItemUiModel(bannerType=" + this.f7076a + ", dsAggregatorBannerUiModel=" + this.b + Separators.RPAREN;
    }
}
