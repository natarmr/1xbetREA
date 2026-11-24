package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fns0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9852a;
    public final long b;
    public final boolean c;

    public fns0(long j, boolean z, long j2) {
        this.f9852a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fns0)) {
            return false;
        }
        fns0 fns0Var = (fns0) obj;
        return this.f9852a == fns0Var.f9852a && this.b == fns0Var.b && this.c == fns0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f9852a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f9852a, "TransitionToLiveModel(gameId=", ", sportId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
