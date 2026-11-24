package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29942a;
    public final long b;

    public r6n(float f, long j) {
        this.f29942a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6n)) {
            return false;
        }
        r6n r6nVar = (r6n) obj;
        if (!ycl.b(this.f29942a, r6nVar.f29942a)) {
            return false;
        }
        long j = r6nVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f29942a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("Circle(logoSize=", ycl.c(this.f29942a), ", placeholderColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
