package a;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class qlq implements chi0 {
    public static final plq Companion = new plq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28946a;

    public /* synthetic */ qlq(float f, int i) {
        if (1 == (i & 1)) {
            this.f28946a = f;
        } else {
            m2x.I(i, 1, olq.f25469a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlq) && Float.compare(this.f28946a, ((qlq) obj).f28946a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28946a);
    }

    public final String toString() {
        return "FloatValue(value=" + this.f28946a + ')';
    }

    public qlq(float f) {
        this.f28946a = f;
    }
}
