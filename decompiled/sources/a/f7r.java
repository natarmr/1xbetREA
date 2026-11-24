package a;

/* JADX INFO: loaded from: classes.dex */
public final class f7r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9070a;

    public static String a(long j) {
        return h97.h(j, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f7r) {
            return this.f9070a == ((f7r) obj).f9070a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9070a);
    }

    public final String toString() {
        return a(this.f9070a);
    }
}
