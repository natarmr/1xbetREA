package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hk0 implements ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13185a;
    public final boolean b;
    public final int c;

    public hk0(int i, long j, boolean z) {
        this.f13185a = j;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0)) {
            return false;
        }
        hk0 hk0Var = (hk0) obj;
        return this.f13185a == hk0Var.f13185a && this.b == hk0Var.b && this.c == hk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(Long.hashCode(this.f13185a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f13185a, "VirtualGameFavoriteButtonClick(id=", ", isFavorite=", this.b), ", subcategoryId=", this.c, Separators.RPAREN);
    }
}
