package a;

/* JADX INFO: loaded from: classes.dex */
public final class zex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44275a;

    public final boolean equals(Object obj) {
        if (obj instanceof zex) {
            return this.f44275a == ((zex) obj).f44275a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44275a);
    }

    public final String toString() {
        int i = this.f44275a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
