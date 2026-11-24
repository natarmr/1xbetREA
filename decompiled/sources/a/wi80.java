package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wi80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39202a;
    public final boolean b;
    public final int c;

    public wi80(int i, int i2, boolean z) {
        this.f39202a = i;
        this.b = z;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi80)) {
            return false;
        }
        wi80 wi80Var = (wi80) obj;
        return this.f39202a == wi80Var.f39202a && this.b == wi80Var.b && this.c == wi80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(Integer.hashCode(this.f39202a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, h97.l(this.f39202a, "PageIndicatorModelUI(id=", ", selected=", ", color=", this.b));
    }
}
