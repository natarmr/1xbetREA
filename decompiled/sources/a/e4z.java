package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e4z implements f4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7206a;
    public final long b;
    public final boolean c;

    public e4z(long j, boolean z, long j2) {
        this.f7206a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4z)) {
            return false;
        }
        e4z e4zVar = (e4z) obj;
        return this.f7206a == e4zVar.f7206a && this.b == e4zVar.b && this.c == e4zVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f7206a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f7206a, "Success(gameId=", ", sportId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
