package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wlj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39356a;
    public final long b;

    public wlj(long j, long j2) {
        this.f39356a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlj)) {
            return false;
        }
        wlj wljVar = (wlj) obj;
        return this.f39356a == wljVar.f39356a && this.b == wljVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + rw2.b(Long.hashCode(this.f39356a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.b, ", hasBackStack=false)", kng0.q(this.f39356a, "BetResult(currencyAccId=", ", betId="));
    }
}
