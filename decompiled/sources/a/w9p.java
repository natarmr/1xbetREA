package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38790a;
    public final long b;

    public w9p(int i, long j) {
        this.f38790a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9p)) {
            return false;
        }
        w9p w9pVar = (w9p) obj;
        if (this.f38790a != w9pVar.f38790a) {
            return false;
        }
        long j = w9pVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f38790a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return defpackage.c.b(this.f38790a, "FavoriteIconConfig(iconRes=", ", contentColorKey=", y3d.i(this.b), Separators.RPAREN);
    }
}
