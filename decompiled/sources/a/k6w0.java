package a;

/* JADX INFO: loaded from: classes6.dex */
public final class k6w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17791a;
    public final long b;

    /* JADX WARN: Multi-variable type inference failed */
    public k6w0(int i, long j) {
        this.f17791a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k6w0)) {
            return false;
        }
        k6w0 k6w0Var = (k6w0) obj;
        return this.f17791a == k6w0Var.f17791a && this.b == k6w0Var.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.f17791a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append((int) this.f17791a);
        sb.append(", eventTimestamp=");
        return brm0.k(this.b, "}", sb);
    }
}
