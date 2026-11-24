package a;

/* JADX INFO: loaded from: classes.dex */
public final class ytm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43226a;

    public final boolean equals(Object obj) {
        if (obj instanceof ytm0) {
            return this.f43226a == ((ytm0) obj).f43226a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43226a);
    }

    public final String toString() {
        int i = this.f43226a;
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Bevel" : "Unknown";
    }
}
