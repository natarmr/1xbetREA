package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jfb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16417a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public jfb0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f16417a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfb0)) {
            return false;
        }
        jfb0 jfb0Var = (jfb0) obj;
        return this.f16417a == jfb0Var.f16417a && this.b == jfb0Var.b && this.c == jfb0Var.c && this.d == jfb0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Boolean.hashCode(this.f16417a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", categoriesError=", Separators.RPAREN, f140.q("PopularOneXGamesMapperErrorState(emptyDataError=", ", previewError=", ", umError=", this.f16417a, this.b), this.c, this.d);
    }
}
