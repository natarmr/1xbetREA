package a;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class tvb implements chi0 {
    public static final rvb Companion = new rvb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f34591a;

    public /* synthetic */ tvb(char c, int i) {
        if (1 == (i & 1)) {
            this.f34591a = c;
        } else {
            m2x.I(i, 1, qvb.f29378a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tvb) && this.f34591a == ((tvb) obj).f34591a;
    }

    public final int hashCode() {
        return Character.hashCode(this.f34591a);
    }

    public final String toString() {
        return "CharValue(value=" + this.f34591a + ')';
    }

    public tvb(char c) {
        this.f34591a = c;
    }
}
