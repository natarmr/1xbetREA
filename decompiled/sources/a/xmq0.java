package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xmq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41141a;
    public final long b;
    public final long c;

    public xmq0(long j, long j2, long j3) {
        this.f41141a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmq0)) {
            return false;
        }
        xmq0 xmq0Var = (xmq0) obj;
        return this.f41141a == xmq0Var.f41141a && this.b == xmq0Var.b && this.c == xmq0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Long.hashCode(this.f41141a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f41141a, "Timer(hours=", ", minutes=");
        sbQ.append(this.b);
        return rw2.n(sbQ, this.c, ", seconds=", Separators.RPAREN);
    }
}
