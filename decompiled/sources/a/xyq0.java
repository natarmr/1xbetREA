package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41717a;
    public final boolean b;
    public final boolean c;

    public xyq0(boolean z, boolean z2, boolean z3) {
        this.f41717a = z;
        this.b = z2;
        this.c = z3;
    }

    public static xyq0 a(xyq0 xyq0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = xyq0Var.f41717a;
        }
        if ((i & 2) != 0) {
            z2 = xyq0Var.b;
        }
        if ((i & 4) != 0) {
            z3 = xyq0Var.c;
        }
        return new xyq0(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyq0)) {
            return false;
        }
        xyq0 xyq0Var = (xyq0) obj;
        return this.f41717a == xyq0Var.f41717a && this.b == xyq0Var.b && this.c == xyq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f41717a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("TopBannerPauseConditions(lifecyclePaused=", ", topBannerHalfHidden=", ", topBannerSwiping=", this.f41717a, this.b), this.c, Separators.RPAREN);
    }
}
