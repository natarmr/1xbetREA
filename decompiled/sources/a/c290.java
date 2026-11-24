package a;

/* JADX INFO: loaded from: classes.dex */
public final class c290 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3615a;

    public final boolean equals(Object obj) {
        if (obj instanceof c290) {
            return this.f3615a == ((c290) obj).f3615a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3615a);
    }

    public final String toString() {
        int i = this.f3615a;
        if (i == 0) {
            return "NonZero";
        }
        return i == 1 ? "EvenOdd" : "Unknown";
    }
}
