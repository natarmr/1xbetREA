package a;

/* JADX INFO: loaded from: classes.dex */
public final class d7q0 {
    public static final v0h0 g = qxw.L(new t6q0(6), new zgp0(21));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk0 f5606a;
    public final agk0 b = androidx.compose.runtime.e.a(0.0f);
    public final cgk0 c = androidx.compose.runtime.e.b(0);
    public jge0 d = jge0.e;
    public long e = o9q0.b;
    public final pz40 f;

    public d7q0(ma80 ma80Var, float f) {
        this.f5606a = androidx.compose.runtime.e.a(f);
        this.f = androidx.compose.runtime.e.d(ma80Var, rek0.c);
    }

    public final void a(ma80 ma80Var, jge0 jge0Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.m(f2);
        float f3 = jge0Var.f16474a;
        float f4 = jge0Var.b;
        jge0 jge0Var2 = this.d;
        float f5 = jge0Var2.f16474a;
        agk0 agk0Var = this.f5606a;
        if (f3 != f5 || f4 != jge0Var2.b) {
            boolean z = ma80Var == ma80.f21447a;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? jge0Var.d : jge0Var.c;
            float fL = agk0Var.l();
            float f7 = i;
            float f8 = fL + f7;
            if (f6 <= f8 && (f3 >= fL || f6 - f3 <= f7)) {
                f = (f3 >= fL || f6 - f3 > f7) ? 0.0f : f3 - fL;
            } else {
                f = f6 - f8;
            }
            agk0Var.m(agk0Var.l() + f);
            this.d = jge0Var;
        }
        agk0Var.m(l1e0.c(agk0Var.l(), 0.0f, f2));
        this.c.m(i);
    }
}
