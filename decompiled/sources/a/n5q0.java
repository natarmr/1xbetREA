package a;

/* JADX INFO: loaded from: classes.dex */
public final class n5q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22957a;

    public static String a(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n5q0) {
            return this.f22957a == ((n5q0) obj).f22957a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22957a);
    }

    public final String toString() {
        return a(this.f22957a);
    }
}
