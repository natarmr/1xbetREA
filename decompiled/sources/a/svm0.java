package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class svm0 implements xvm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32876a;
    public final long b;

    public svm0(long j, long j2) {
        this.f32876a = j;
        this.b = j2;
    }

    @Override // a.xvm0
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svm0)) {
            return false;
        }
        svm0 svm0Var = (svm0) obj;
        return this.f32876a == svm0Var.f32876a && this.b == svm0Var.b;
    }

    @Override // a.xvm0
    public final long getId() {
        return this.f32876a;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f32876a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f32876a, "Insight(id=", ", gameId="));
    }
}
