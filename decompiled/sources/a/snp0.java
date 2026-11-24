package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class snp0 implements tnp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32505a;
    public final long b;

    public snp0(long j, long j2) {
        this.f32505a = j;
        this.b = j2;
    }

    @Override // a.tnp0
    public final long a() {
        return this.f32505a;
    }

    @Override // a.tnp0
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snp0)) {
            return false;
        }
        snp0 snp0Var = (snp0) obj;
        return this.f32505a == snp0Var.f32505a && this.b == snp0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f32505a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f32505a, "Sport(teamId=", ", sportId="));
    }
}
