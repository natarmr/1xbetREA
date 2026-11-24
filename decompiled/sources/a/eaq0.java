package a;

/* JADX INFO: loaded from: classes.dex */
public final class eaq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7481a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        if (a(j, 0L)) {
            return "Unspecified";
        }
        if (a(j, 4294967296L)) {
            return "Sp";
        }
        return a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eaq0) {
            return this.f7481a == ((eaq0) obj).f7481a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7481a);
    }

    public final String toString() {
        return b(this.f7481a);
    }
}
