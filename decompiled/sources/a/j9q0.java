package a;

/* JADX INFO: loaded from: classes.dex */
public final class j9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f16151a;

    public static String a(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        return i == 4 ? "StartEllipsis" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j9q0) {
            return this.f16151a == ((j9q0) obj).f16151a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16151a);
    }

    public final String toString() {
        return a(this.f16151a);
    }
}
