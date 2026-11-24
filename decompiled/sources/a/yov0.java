package a;

/* JADX INFO: loaded from: classes.dex */
public final class yov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43004a;
    public final long b;

    public yov0(long j, long j2) {
        this.f43004a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yov0.class.equals(obj.getClass())) {
            yov0 yov0Var = (yov0) obj;
            if (yov0Var.f43004a == this.f43004a && yov0Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f43004a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, "}", kng0.q(this.f43004a, "PeriodicityInfo{repeatIntervalMillis=", ", flexIntervalMillis="));
    }
}
