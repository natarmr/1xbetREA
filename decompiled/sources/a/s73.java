package a;

/* JADX INFO: loaded from: classes.dex */
public final class s73 extends t73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31731a;
    public float b;
    public float c;
    public float d;

    public s73(float f, float f2, float f3, float f4) {
        this.f31731a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // a.t73
    public final float a(int i) {
        if (i == 0) {
            return this.f31731a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // a.t73
    public final int b() {
        return 4;
    }

    @Override // a.t73
    public final t73 c() {
        return new s73(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // a.t73
    public final void d() {
        this.f31731a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // a.t73
    public final void e(float f, int i) {
        if (i == 0) {
            this.f31731a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s73)) {
            return false;
        }
        s73 s73Var = (s73) obj;
        return s73Var.f31731a == this.f31731a && s73Var.b == this.b && s73Var.c == this.c && s73Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f31731a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.f31731a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbS = dw9.s(f, f2, "AnimationVector4D: v1 = ", ", v2 = ", ", v3 = ");
        sbS.append(f3);
        sbS.append(", v4 = ");
        sbS.append(f4);
        return sbS.toString();
    }
}
