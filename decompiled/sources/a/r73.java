package a;

/* JADX INFO: loaded from: classes.dex */
public final class r73 extends t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f29959a;
    public float b;
    public float c;

    public r73(float f, float f2, float f3) {
        this.f29959a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // a.t73
    public final float a(int i) {
        if (i == 0) {
            return this.f29959a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // a.t73
    public final int b() {
        return 3;
    }

    @Override // a.t73
    public final t73 c() {
        return new r73(0.0f, 0.0f, 0.0f);
    }

    @Override // a.t73
    public final void d() {
        this.f29959a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // a.t73
    public final void e(float f, int i) {
        if (i == 0) {
            this.f29959a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r73)) {
            return false;
        }
        r73 r73Var = (r73) obj;
        return r73Var.f29959a == this.f29959a && r73Var.b == this.b && r73Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f29959a) * 31, this.b, 31);
    }

    public final String toString() {
        float f = this.f29959a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbS = dw9.s(f, f2, "AnimationVector3D: v1 = ", ", v2 = ", ", v3 = ");
        sbS.append(f3);
        return sbS.toString();
    }
}
