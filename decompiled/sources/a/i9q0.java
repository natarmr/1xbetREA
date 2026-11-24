package a;

/* JADX INFO: loaded from: classes.dex */
public final class i9q0 {
    public static final i9q0 c = new i9q0(2, false);
    public static final i9q0 d = new i9q0(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14400a;
    public final boolean b;

    public i9q0(int i, boolean z) {
        this.f14400a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9q0)) {
            return false;
        }
        i9q0 i9q0Var = (i9q0) obj;
        return this.f14400a == i9q0Var.f14400a && this.b == i9q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f14400a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        return equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
