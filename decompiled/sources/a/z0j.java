package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class z0j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43569a;
    public final int b;
    public final int c;

    public z0j(int i, int i2, long j) {
        this.f43569a = j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0j)) {
            return false;
        }
        z0j z0jVar = (z0j) obj;
        return this.f43569a == z0jVar.f43569a && this.b == z0jVar.b && this.c == z0jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f43569a) * 31, 31);
    }

    public final String toString() {
        return vqd.p(brm0.q(this.b, this.f43569a, "DailyTaskMoreInfoState(productId=", ", taskKindId="), ", progress=", this.c, Separators.RPAREN);
    }
}
