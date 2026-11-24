package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class un50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35944a;

    public un50(int i) {
        this.f35944a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un50) && this.f35944a == ((un50) obj).f35944a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35944a);
    }

    public final String toString() {
        return ua80.e(this.f35944a, "NewsCatalogBanners(id=", Separators.RPAREN);
    }
}
