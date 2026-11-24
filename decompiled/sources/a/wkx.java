package a;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class wkx implements chi0 {
    public static final ukx Companion = new ukx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39329a;

    public /* synthetic */ wkx(int i, int i2) {
        if (1 == (i & 1)) {
            this.f39329a = i2;
        } else {
            m2x.I(i, 1, tkx.f34118a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkx) && this.f39329a == ((wkx) obj).f39329a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39329a);
    }

    public final String toString() {
        return brm0.n(new StringBuilder("IntValue(value="), this.f39329a, ')');
    }

    public wkx(int i) {
        this.f39329a = i;
    }
}
