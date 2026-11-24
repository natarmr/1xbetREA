package a;

/* JADX INFO: loaded from: classes.dex */
public final class qkx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28908a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return w6x.n((int) (j >> 32), (int) (j & 4294967295L), " x ");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qkx) {
            return this.f28908a == ((qkx) obj).f28908a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28908a);
    }

    public final String toString() {
        return b(this.f28908a);
    }
}
