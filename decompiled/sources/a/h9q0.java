package a;

/* JADX INFO: loaded from: classes.dex */
public final class h9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12690a;

    public final boolean equals(Object obj) {
        if (obj instanceof h9q0) {
            return this.f12690a == ((h9q0) obj).f12690a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12690a);
    }

    public final String toString() {
        int i = this.f12690a;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}
