package a;

/* JADX INFO: loaded from: classes.dex */
public final class jf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16412a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jf80) {
            return this.f16412a == ((jf80) obj).f16412a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16412a);
    }

    public final String toString() {
        return "StreamUseCase(value=" + this.f16412a + ')';
    }
}
