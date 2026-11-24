package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1289a;
    public final long b;

    public aqa0(long j, long j2) {
        this.f1289a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqa0)) {
            return false;
        }
        aqa0 aqa0Var = (aqa0) obj;
        return this.f1289a == aqa0Var.f1289a && this.b == aqa0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f1289a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f1289a, "GroupClicked(id=", ", sportId="));
    }
}
