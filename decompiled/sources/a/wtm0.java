package a;

/* JADX INFO: loaded from: classes.dex */
public final class wtm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39749a;

    public final boolean equals(Object obj) {
        if (obj instanceof wtm0) {
            return this.f39749a == ((wtm0) obj).f39749a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39749a);
    }

    public final String toString() {
        int i = this.f39749a;
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Square" : "Unknown";
    }
}
