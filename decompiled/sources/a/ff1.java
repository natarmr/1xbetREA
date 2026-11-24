package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ff1 implements nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wq5 f9430a;

    public ff1(wq5 wq5Var) {
        this.f9430a = wq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff1) && this.f9430a.equals(((ff1) obj).f9430a);
    }

    public final int hashCode() {
        return this.f9430a.hashCode();
    }

    public final String toString() {
        return "AggregatorBannerSideEffect(bannerSideEffect=" + this.f9430a + Separators.RPAREN;
    }
}
