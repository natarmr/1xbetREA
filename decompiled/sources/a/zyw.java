package a;

/* JADX INFO: loaded from: classes5.dex */
public final class zyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45225a;

    public final boolean equals(Object obj) {
        if (obj instanceof zyw) {
            return this.f45225a == ((zyw) obj).f45225a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45225a);
    }

    public final String toString() {
        int i = this.f45225a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
