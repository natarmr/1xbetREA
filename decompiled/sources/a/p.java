package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p3k {
    public final kzj0 b;
    public final kzj0 c;

    public p(kzj0 kzj0Var, kzj0 kzj0Var2) {
        kzj0Var.getClass();
        kzj0Var2.getClass();
        this.b = kzj0Var;
        this.c = kzj0Var2;
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new p(this.b.m0(ays0Var), this.c);
    }

    @Override // a.p3k
    public final kzj0 p0() {
        return this.b;
    }

    @Override // a.p3k
    public final p3k r0(kzj0 kzj0Var) {
        return new p(kzj0Var, this.c);
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final p k0(boolean z) {
        return new p(this.b.k0(z), this.c.k0(z));
    }

    @Override // a.p3k
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final p f0(cty ctyVar) {
        kzj0 kzj0Var = this.b;
        kzj0Var.getClass();
        kzj0 kzj0Var2 = this.c;
        kzj0Var2.getClass();
        return new p(kzj0Var, kzj0Var2);
    }
}
