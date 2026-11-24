package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class z5z {
    public static final z5z c = new z5z(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43841a;
    public final float b;

    public z5z(int i) {
        float f = (i & 1) != 0 ? 0.0f : 2.0f;
        float f2 = (i & 4) != 0 ? 0.0f : 2.0f;
        this.f43841a = f;
        this.b = f2;
        if (ycl.a(f, 0.0f) < 0 || ycl.a(f2, 0.0f) < 0 || ycl.a(0.0f, 0.0f) < 0 || ycl.a(0.0f, 0.0f) < 0) {
            wcx.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5z)) {
            return false;
        }
        z5z z5zVar = (z5z) obj;
        return ycl.b(this.f43841a, z5zVar.f43841a) && ycl.b(0.0f, 0.0f) && ycl.b(this.b, z5zVar.b) && ycl.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f43841a) * 31, 0.0f, 31), this.b, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f43841a);
        String strC2 = ycl.c(0.0f);
        return ua80.m(b1j.n("LayerOutsets(left=", strC, ", top=", strC2, ", right="), ycl.c(this.b), ", bottom=", ycl.c(0.0f), Separators.RPAREN);
    }
}
