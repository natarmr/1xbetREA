package a;

/* JADX INFO: loaded from: classes.dex */
public final class tjf0 {
    public static final tjf0 c = new tjf0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f34046a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public tjf0(int i, boolean z) {
        this.f34046a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tjf0.class != obj.getClass()) {
            return false;
        }
        tjf0 tjf0Var = (tjf0) obj;
        return this.f34046a == tjf0Var.f34046a && this.b == tjf0Var.b;
    }

    public final int hashCode() {
        return (this.f34046a << 1) + (this.b ? 1 : 0);
    }
}
