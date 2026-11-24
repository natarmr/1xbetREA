package a;

/* JADX INFO: loaded from: classes.dex */
public final class ply {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27207a;

    public static String a(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        return i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ply) {
            return this.f27207a == ((ply) obj).f27207a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27207a);
    }

    public final String toString() {
        return a(this.f27207a);
    }
}
