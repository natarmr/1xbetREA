package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ens0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8111a;
    public final long b;
    public final boolean c;

    public ens0(long j, boolean z, long j2) {
        this.f8111a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ens0)) {
            return false;
        }
        ens0 ens0Var = (ens0) obj;
        return this.f8111a == ens0Var.f8111a && this.b == ens0Var.b && this.c == ens0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f8111a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8111a, "TransitionToLiveInfo(gameId=", ", sportId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
