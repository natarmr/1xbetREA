package a;

/* JADX INFO: loaded from: classes.dex */
public final class p73 extends t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26486a;

    public p73(float f) {
        this.f26486a = f;
    }

    @Override // a.t73
    public final float a(int i) {
        if (i == 0) {
            return this.f26486a;
        }
        return 0.0f;
    }

    @Override // a.t73
    public final void d() {
        this.f26486a = 0.0f;
    }

    @Override // a.t73
    public final void e(float f, int i) {
        if (i == 0) {
            this.f26486a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p73) && ((p73) obj).f26486a == this.f26486a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26486a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f26486a;
    }
}
