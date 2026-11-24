package a;

/* JADX INFO: loaded from: classes2.dex */
public final class z25 extends i9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f43654a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public z25(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f43654a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i9f) {
            i9f i9fVar = (i9f) obj;
            Double d = this.f43654a;
            if (d != null ? d.equals(((z25) i9fVar).f43654a) : ((z25) i9fVar).f43654a == null) {
                z25 z25Var = (z25) i9fVar;
                if (this.b == z25Var.b && this.c == z25Var.c && this.d == z25Var.d && this.e == z25Var.e && this.f == z25Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f43654a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f43654a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return brm0.k(this.f, "}", sb);
    }
}
