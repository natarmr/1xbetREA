package a;

/* JADX INFO: loaded from: classes.dex */
public final class daq0 {
    public static final eaq0[] b = {new eaq0(0), new eaq0(4294967296L), new eaq0(8589934592L)};
    public static final long c = idm0.v(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5764a;

    public /* synthetic */ daq0(long j) {
        this.f5764a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].f7481a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static final boolean e(long j) {
        return (j & 1095216660480L) == 4294967296L;
    }

    public static String f(long j) {
        long jB = b(j);
        if (eaq0.a(jB, 0L)) {
            return "Unspecified";
        }
        if (eaq0.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!eaq0.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof daq0) {
            return this.f5764a == ((daq0) obj).f5764a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5764a);
    }

    public final String toString() {
        return f(this.f5764a);
    }
}
