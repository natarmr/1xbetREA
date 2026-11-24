package a;

/* JADX INFO: loaded from: classes.dex */
public final class doq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6426a;

    public static String a(long j) {
        return "TimestampNs(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof doq0) {
            return this.f6426a == ((doq0) obj).f6426a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6426a);
    }

    public final String toString() {
        return a(this.f6426a);
    }
}
