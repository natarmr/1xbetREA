package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wlp implements xlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39366a;
    public final j8l0 b;

    public wlp(float f, j8l0 j8l0Var) {
        this.f39366a = f;
        this.b = j8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlp)) {
            return false;
        }
        wlp wlpVar = (wlp) obj;
        return ycl.b(this.f39366a, wlpVar.f39366a) && this.b == wlpVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f39366a) * 31);
    }

    public final String toString() {
        return "Shimmers(paddingTop=" + ycl.c(this.f39366a) + ", listStyle=" + this.b + Separators.RPAREN;
    }
}
