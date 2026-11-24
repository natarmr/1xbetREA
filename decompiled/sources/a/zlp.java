package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zlp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44591a;
    public final long b;

    public zlp(long j, long j2) {
        this.f44591a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlp)) {
            return false;
        }
        zlp zlpVar = (zlp) obj;
        return this.f44591a == zlpVar.f44591a && this.b == zlpVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f44591a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f44591a, "GroupClicked(id=", ", sportId="));
    }
}
