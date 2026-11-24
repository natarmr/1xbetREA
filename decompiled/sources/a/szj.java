package a;

/* JADX INFO: loaded from: classes2.dex */
public final class szj extends p3k implements fyf, tzj {
    public final kzj0 b;
    public final boolean c;

    public szj(kzj0 kzj0Var, boolean z) {
        this.b = kzj0Var;
        this.c = z;
    }

    @Override // a.p3k, a.wsy
    public final boolean U() {
        return false;
    }

    @Override // a.fyf
    public final tft0 g(wsy wsyVar) {
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        szj szjVarE = kud.e(tft0VarJ0, this.c);
        if (szjVarE != null) {
            return szjVarE;
        }
        kzj0 kzj0VarC = q7x.C(tft0VarJ0);
        return kzj0VarC != null ? kzj0VarC : tft0VarJ0.k0(false);
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        return z ? this.b.k0(z) : this;
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new szj(this.b.m0(ays0Var), this.c);
    }

    @Override // a.p3k
    public final kzj0 p0() {
        return this.b;
    }

    @Override // a.fyf
    public final boolean r() {
        kzj0 kzj0Var = this.b;
        kzj0Var.S();
        return kzj0Var.S().n() instanceof hzs0;
    }

    @Override // a.p3k
    public final p3k r0(kzj0 kzj0Var) {
        return new szj(kzj0Var, this.c);
    }

    @Override // a.kzj0
    public final String toString() {
        return this.b + " & Any";
    }
}
