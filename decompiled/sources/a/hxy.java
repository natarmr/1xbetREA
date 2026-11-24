package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13835a;
    public final int b;
    public final long c;

    public hxy(int i, long j, long j2) {
        this.f13835a = j;
        this.b = i;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxy)) {
            return false;
        }
        hxy hxyVar = (hxy) obj;
        return this.f13835a == hxyVar.f13835a && this.b == hxyVar.b && this.c == hxyVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f13835a) * 31, 31);
    }

    public final String toString() {
        return rw2.n(brm0.q(this.b, this.f13835a, "LastAction(id=", ", type="), this.c, ", date=", Separators.RPAREN);
    }
}
