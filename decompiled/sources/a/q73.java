package a;

/* JADX INFO: loaded from: classes.dex */
public final class q73 extends t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28229a;
    public float b;

    public q73(float f, float f2) {
        this.f28229a = f;
        this.b = f2;
    }

    @Override // a.t73
    public final float a(int i) {
        if (i == 0) {
            return this.f28229a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // a.t73
    public final int b() {
        return 2;
    }

    @Override // a.t73
    public final t73 c() {
        return new q73(0.0f, 0.0f);
    }

    @Override // a.t73
    public final void d() {
        this.f28229a = 0.0f;
        this.b = 0.0f;
    }

    @Override // a.t73
    public final void e(float f, int i) {
        if (i == 0) {
            this.f28229a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q73)) {
            return false;
        }
        q73 q73Var = (q73) obj;
        return q73Var.f28229a == this.f28229a && q73Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f28229a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f28229a + ", v2 = " + this.b;
    }
}
