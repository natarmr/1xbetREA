package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9348a;
    public final boolean b;
    public final long c;

    public fd90(long j, boolean z, long j2) {
        this.f9348a = j;
        this.b = z;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd90)) {
            return false;
        }
        fd90 fd90Var = (fd90) obj;
        return this.f9348a == fd90Var.f9348a && this.b == fd90Var.b && this.c == fd90Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(Long.hashCode(this.f9348a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(kng0.r(this.f9348a, "PendingChampModel(id=", ", adding=", this.b), this.c, ", lockTimestamp=", Separators.RPAREN);
    }
}
