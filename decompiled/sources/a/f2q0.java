package a;

/* JADX INFO: loaded from: classes.dex */
public final class f2q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8826a;

    public static String a(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2q0) {
            return this.f8826a == ((f2q0) obj).f8826a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8826a);
    }

    public final String toString() {
        return a(this.f8826a);
    }
}
