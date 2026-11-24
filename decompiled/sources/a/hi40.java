package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi40 f13096a;
    public final long b;

    public hi40(gi40 gi40Var, long j) {
        this.f13096a = gi40Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi40)) {
            return false;
        }
        hi40 hi40Var = (hi40) obj;
        if (this.f13096a != hi40Var.f13096a) {
            return false;
        }
        long j = hi40Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f13096a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "MlbbGameMapTowerUiModel(tower=" + this.f13096a + ", color=" + y3d.i(this.b) + Separators.RPAREN;
    }
}
