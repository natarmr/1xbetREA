package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cwv0 implements dwv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5097a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public cwv0(int i, boolean z, boolean z2, boolean z3) {
        this.f5097a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // a.dwv0
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwv0)) {
            return false;
        }
        cwv0 cwv0Var = (cwv0) obj;
        return this.f5097a == cwv0Var.f5097a && this.b == cwv0Var.b && this.c == cwv0Var.c && this.d == cwv0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(Integer.hashCode(this.f5097a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", canScrollBackward=", Separators.RPAREN, h97.l(this.f5097a, "Plain(viewportHeightPx=", ", isScrollInProgress=", ", canScrollForward=", this.b), this.c, this.d);
    }
}
