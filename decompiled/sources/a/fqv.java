package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fqv implements mqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4t f9994a;

    public fqv(x4t x4tVar) {
        this.f9994a = x4tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqv) && this.f9994a.equals(((fqv) obj).f9994a);
    }

    public final int hashCode() {
        return this.f9994a.hashCode();
    }

    public final String toString() {
        return "GamesCarousel(carouselType=" + this.f9994a + Separators.RPAREN;
    }
}
