package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class u9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35294a;
    public final long b;
    public final float c;

    public u9p(float f, int i, long j) {
        this.f35294a = i;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9p)) {
            return false;
        }
        u9p u9pVar = (u9p) obj;
        if (this.f35294a != u9pVar.f35294a) {
            return false;
        }
        long j = u9pVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Float.compare(this.c, u9pVar.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35294a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.c) + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return kng0.o(vqd.r(this.f35294a, "FavoriteIconConfig(iconRes=", ", contentColorKey=", y3d.i(this.b), ", alfa="), this.c, Separators.RPAREN);
    }
}
