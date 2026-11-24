package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1984a;
    public final long b;
    public final long c;

    public b55(long j, long j2, long j3) {
        this.f1984a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b55) {
            b55 b55Var = (b55) obj;
            if (this.f1984a == b55Var.f1984a && this.b == b55Var.b && this.c == b55Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1984a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f1984a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return brm0.k(this.c, "}", sb);
    }
}
