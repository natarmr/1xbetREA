package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ozj0 extends p3k implements g0t0 {
    public final kzj0 b;
    public final wsy c;

    public ozj0(kzj0 kzj0Var, wsy wsyVar) {
        wsyVar.getClass();
        this.b = kzj0Var;
        this.c = wsyVar;
    }

    @Override // a.g0t0
    public final tft0 getOrigin() {
        return this.b;
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        tft0 tft0VarZ = xsm0.z(this.b.k0(z), this.c.j0().k0(z));
        tft0VarZ.getClass();
        return (kzj0) tft0VarZ;
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        tft0 tft0VarZ = xsm0.z(this.b.m0(ays0Var), this.c);
        tft0VarZ.getClass();
        return (kzj0) tft0VarZ;
    }

    @Override // a.g0t0
    public final wsy p() {
        return this.c;
    }

    @Override // a.p3k
    public final kzj0 p0() {
        return this.b;
    }

    @Override // a.p3k
    public final p3k r0(kzj0 kzj0Var) {
        return new ozj0(kzj0Var, this.c);
    }

    @Override // a.p3k
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final ozj0 f0(cty ctyVar) {
        wsy wsyVar = this.c;
        wsyVar.getClass();
        return new ozj0(this.b, wsyVar);
    }

    @Override // a.kzj0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.c + ")] " + this.b;
    }
}
