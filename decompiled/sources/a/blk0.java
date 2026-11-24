package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class blk0 implements clk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzb0 f2798a;

    public blk0(uzb0 uzb0Var) {
        this.f2798a = uzb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blk0) && this.f2798a == ((blk0) obj).f2798a;
    }

    public final int hashCode() {
        return this.f2798a.hashCode();
    }

    public final String toString() {
        return "OnSortCategoryClicked(productSortType=" + this.f2798a + Separators.RPAREN;
    }
}
