package a;

/* JADX INFO: loaded from: classes6.dex */
public final class bdl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2404a;

    public /* synthetic */ bdl(long j) {
        this.f2404a = j;
    }

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String c(long j) {
        return j != 9205357640488583168L ? kng0.l(ycl.c(b(j)), " x ", ycl.c(a(j))) : "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdl) {
            return this.f2404a == ((bdl) obj).f2404a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2404a);
    }

    public final String toString() {
        return c(this.f2404a);
    }
}
