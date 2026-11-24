package a;

/* JADX INFO: loaded from: classes.dex */
public final class dk00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6211a;

    public final boolean equals(Object obj) {
        if (obj instanceof dk00) {
            return this.f6211a == ((dk00) obj).f6211a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6211a ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f6211a;
        if (z) {
            return z ? "Assertive" : "Unknown";
        }
        return "Polite";
    }
}
