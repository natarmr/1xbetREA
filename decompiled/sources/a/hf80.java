package a;

/* JADX INFO: loaded from: classes.dex */
public final class hf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12960a;

    public static String a(long j) {
        return "DynamicRangeProfile(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hf80) {
            return this.f12960a == ((hf80) obj).f12960a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12960a);
    }

    public final String toString() {
        return a(this.f12960a);
    }
}
