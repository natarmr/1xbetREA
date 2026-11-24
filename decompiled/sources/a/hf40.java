package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4t f12955a;
    public final bml b;

    public hf40(x4t x4tVar, bml bmlVar) {
        this.f12955a = x4tVar;
        this.b = bmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf40)) {
            return false;
        }
        hf40 hf40Var = (hf40) obj;
        return this.f12955a.equals(hf40Var.f12955a) && this.b.equals(hf40Var.b);
    }

    @Override // a.tf40
    public final String getKey() {
        tre0 tre0Var = sre0.f32672a;
        return ohs0.n(tre0Var.b(hf40.class).J(), tre0Var.b(this.f12955a.getClass()).J());
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12955a.hashCode() * 31);
    }

    public final String toString() {
        return "GamesCarousel(carouselType=" + this.f12955a + ", model=" + this.b + Separators.RPAREN;
    }
}
