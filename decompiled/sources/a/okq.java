package a;

/* JADX INFO: loaded from: classes2.dex */
public final class okq extends kkq implements g0t0 {
    public final kkq d;
    public final wsy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okq(kkq kkqVar, wsy wsyVar) {
        super(kkqVar.b, kkqVar.c);
        wsyVar.getClass();
        this.d = kkqVar;
        this.e = wsyVar;
    }

    @Override // a.wsy
    public final wsy f0(cty ctyVar) {
        wsy wsyVar = this.e;
        wsyVar.getClass();
        return new okq(this.d, wsyVar);
    }

    @Override // a.g0t0
    public final tft0 getOrigin() {
        return this.d;
    }

    @Override // a.tft0
    public final tft0 k0(boolean z) {
        return xsm0.z(this.d.k0(z), this.e.j0().k0(z));
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: l0 */
    public final tft0 f0(cty ctyVar) {
        wsy wsyVar = this.e;
        wsyVar.getClass();
        return new okq(this.d, wsyVar);
    }

    @Override // a.tft0
    public final tft0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return xsm0.z(this.d.m0(ays0Var), this.e);
    }

    @Override // a.kkq
    public final kzj0 n0() {
        return this.d.n0();
    }

    @Override // a.kkq
    public final String o0(iek iekVar, iek iekVar2) {
        return iekVar2.f14637a.r() ? iekVar.P(this.e) : this.d.o0(iekVar, iekVar2);
    }

    @Override // a.g0t0
    public final wsy p() {
        return this.e;
    }

    @Override // a.kkq
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.e + ")] " + this.d;
    }
}
