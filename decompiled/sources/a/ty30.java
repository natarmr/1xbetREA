package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ty30 implements wy30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f34733a;
    public final long b;
    public final long c;

    public ty30(iz30 iz30Var, long j, long j2) {
        this.f34733a = iz30Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty30)) {
            return false;
        }
        ty30 ty30Var = (ty30) obj;
        return this.f34733a == ty30Var.f34733a && this.b == ty30Var.b && this.c == ty30Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f34733a.hashCode() * 31, 31, this.b);
    }

    @Override // a.wy30
    public final iz30 m() {
        return this.f34733a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualBannerClick(menuItemModel=");
        sb.append(this.f34733a);
        sb.append(", id=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", gameId=", Separators.RPAREN);
    }
}
