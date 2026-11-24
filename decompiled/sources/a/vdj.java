package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vdj implements wdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37235a;
    public final long b;

    public vdj(long j, long j2) {
        this.f37235a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdj)) {
            return false;
        }
        vdj vdjVar = (vdj) obj;
        return this.f37235a == vdjVar.f37235a && this.b == vdjVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f37235a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f37235a, "Period(startDate=", ", endDate="));
    }
}
