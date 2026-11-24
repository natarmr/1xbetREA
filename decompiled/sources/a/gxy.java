package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12100a;
    public final long b;

    public gxy(long j, long j2) {
        this.f12100a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxy)) {
            return false;
        }
        gxy gxyVar = (gxy) obj;
        return this.f12100a == gxyVar.f12100a && this.b == gxyVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f12100a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f12100a, "LastAction(id=", ", date="));
    }
}
