package a;

/* JADX INFO: loaded from: classes.dex */
public final class x5u0 implements p5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q5u0 f40335a;

    public x5u0(float f, float f2, t73 t73Var) {
        int[] iArr = m5u0.f21235a;
        this.f40335a = new q5u0((t73Var == null && f == 1.0f && f2 == 1500.0f) ? pxj.f27756a : t73Var != null ? new owp0(f, f2, t73Var) : new w4p0(f, f2));
    }

    @Override // a.p5u0, a.l5u0
    public final boolean a() {
        return false;
    }

    @Override // a.l5u0
    public final long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.f40335a.b(t73Var, t73Var2, t73Var3);
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.f40335a.c(j, t73Var, t73Var2, t73Var3);
    }

    @Override // a.l5u0
    public final t73 g(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.f40335a.g(t73Var, t73Var2, t73Var3);
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return this.f40335a.h(j, t73Var, t73Var2, t73Var3);
    }
}
