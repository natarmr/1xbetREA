package a;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class wm8 implements chi0 {
    public static final um8 Companion = new um8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39391a;

    public /* synthetic */ wm8(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f39391a = z;
        } else {
            m2x.I(i, 1, tm8.f34181a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm8) && this.f39391a == ((wm8) obj).f39391a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39391a);
    }

    public final String toString() {
        return brm0.o(new StringBuilder("BooleanValue(value="), this.f39391a, ')');
    }

    public wm8(boolean z) {
        this.f39391a = z;
    }
}
