package a;

/* JADX INFO: loaded from: classes.dex */
public final class jpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16914a;

    public static String a(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        return i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpq) {
            return this.f16914a == ((jpq) obj).f16914a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16914a);
    }

    public final String toString() {
        return a(this.f16914a);
    }
}
