package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37045a;
    public final long b;

    public v9p(int i, long j) {
        this.f37045a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9p)) {
            return false;
        }
        v9p v9pVar = (v9p) obj;
        if (this.f37045a != v9pVar.f37045a) {
            return false;
        }
        long j = v9pVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37045a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return defpackage.c.b(this.f37045a, "FavoriteIconConfig(iconRes=", ", contentColorKey=", y3d.i(this.b), Separators.RPAREN);
    }
}
