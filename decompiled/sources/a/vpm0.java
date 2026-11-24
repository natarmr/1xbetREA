package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vpm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f37812a;
    public final float b;

    public vpm0(float f, float f2) {
        this.f37812a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpm0)) {
            return false;
        }
        vpm0 vpm0Var = (vpm0) obj;
        return ycl.b(this.f37812a, vpm0Var.f37812a) && ycl.b(this.b, vpm0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f37812a) * 31);
    }

    public final String toString() {
        return b1j.k("StickyTitleWidths(title=", ycl.c(this.f37812a), ", spacer=", ycl.c(this.b), Separators.RPAREN);
    }
}
