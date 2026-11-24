package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rr50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30965a;

    public rr50(int i) {
        this.f30965a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr50) && this.f30965a == ((rr50) obj).f30965a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30965a);
    }

    public final String toString() {
        return ua80.e(this.f30965a, "NewsCatalogCmsBanners(id=", Separators.RPAREN);
    }
}
