package a;

/* JADX INFO: loaded from: classes.dex */
public final class kf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18185a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kf80) {
            return this.f18185a == ((kf80) obj).f18185a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18185a);
    }

    public final String toString() {
        return "StreamUseHint(value=" + this.f18185a + ')';
    }
}
