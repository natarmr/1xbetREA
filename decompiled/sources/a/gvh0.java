package a;

/* JADX INFO: loaded from: classes.dex */
public final class gvh0 {
    public static final gvh0 c;
    public static final gvh0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11974a;
    public final long b;

    static {
        gvh0 gvh0Var = new gvh0(0L, 0L);
        new gvh0(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new gvh0(Long.MAX_VALUE, 0L);
        new gvh0(0L, Long.MAX_VALUE);
        d = gvh0Var;
    }

    public gvh0(long j, long j2) {
        x0x.A(j >= 0);
        x0x.A(j2 >= 0);
        this.f11974a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[RETURN] */
    public final long a(long j, long j2, long j3) {
        long j4 = this.f11974a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = vtt0.f38024a;
        long j6 = j - j4;
        long j7 = (((j4 ^ j) > 0L ? 1 : ((j4 ^ j) == 0L ? 0 : -1)) >= 0) | (((j ^ j6) > 0L ? 1 : ((j ^ j6) == 0L ? 0 : -1)) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j7 == Long.MIN_VALUE && j6 != Long.MIN_VALUE) || (j7 == Long.MAX_VALUE && j6 != Long.MAX_VALUE)) {
            j7 = Long.MIN_VALUE;
        }
        long jA = vtt0.a(j, j5);
        boolean z = j7 <= j2 && j2 <= jA;
        boolean z2 = j7 <= j3 && j3 <= jA;
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j7;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gvh0.class == obj.getClass()) {
            gvh0 gvh0Var = (gvh0) obj;
            if (this.f11974a == gvh0Var.f11974a && this.b == gvh0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11974a) * 31) + ((int) this.b);
    }
}
