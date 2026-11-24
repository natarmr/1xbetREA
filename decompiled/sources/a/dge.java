package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dge implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f6037a;

    public dge(ha8 ha8Var) {
        this.f6037a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f6037a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dge) && this.f6037a.equals(((dge) obj).f6037a);
    }

    public final int hashCode() {
        return this.f6037a.hashCode();
    }

    public final String toString() {
        return "PromotionCarousel(blockState=" + this.f6037a + Separators.RPAREN;
    }
}
