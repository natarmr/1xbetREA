package a;

/* JADX INFO: loaded from: classes.dex */
public final class msq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22332a;

    public final boolean equals(Object obj) {
        if (obj instanceof msq) {
            return this.f22332a == ((msq) obj).f22332a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22332a);
    }

    public final String toString() {
        int i = this.f22332a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
