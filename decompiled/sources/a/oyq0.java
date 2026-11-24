package a;

/* JADX INFO: loaded from: classes6.dex */
public final class oyq0 {
    public static final v0h0 d = qxw.L(new t6q0(22), new shq0(12));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26070a;
    public final agk0 b;
    public final agk0 c;

    public oyq0(float f, float f2, float f3) {
        this.f26070a = f;
        this.b = androidx.compose.runtime.e.a(f3);
        this.c = androidx.compose.runtime.e.a(f2);
    }

    public final float a() {
        if (this.f26070a == 0.0f) {
            return 0.0f;
        }
        return this.c.l() / this.f26070a;
    }

    public final void b(float f) {
        this.b.m(f);
    }

    public final void c(float f) {
        this.c.m(l1e0.c(f, this.f26070a, 0.0f));
    }
}
