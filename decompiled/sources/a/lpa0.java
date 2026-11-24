package a;

/* JADX INFO: loaded from: classes.dex */
public final class lpa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20431a;

    public static String a(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lpa0) {
            return this.f20431a == ((lpa0) obj).f20431a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20431a);
    }

    public final String toString() {
        return a(this.f20431a);
    }
}
