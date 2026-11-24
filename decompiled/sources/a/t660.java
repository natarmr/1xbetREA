package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t660 extends p3k implements fyf {
    public final kzj0 b;

    public t660(kzj0 kzj0Var) {
        kzj0Var.getClass();
        this.b = kzj0Var;
    }

    @Override // a.p3k, a.wsy
    public final boolean U() {
        return false;
    }

    @Override // a.fyf
    public final tft0 g(wsy wsyVar) {
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        if (!e0t0.f(tft0VarJ0) && !e0t0.e(tft0VarJ0)) {
            return tft0VarJ0;
        }
        if (tft0VarJ0 instanceof kzj0) {
            kzj0 kzj0Var = (kzj0) tft0VarJ0;
            kzj0 kzj0VarK0 = kzj0Var.k0(false);
            return !e0t0.f(kzj0Var) ? kzj0VarK0 : new t660(kzj0VarK0);
        }
        if (!(tft0VarJ0 instanceof kkq)) {
            t9f.b();
            return null;
        }
        kkq kkqVar = (kkq) tft0VarJ0;
        kzj0 kzj0Var2 = kkqVar.b;
        kzj0 kzj0VarK1 = kzj0Var2.k0(false);
        if (e0t0.f(kzj0Var2)) {
            kzj0VarK1 = new t660(kzj0VarK1);
        }
        kzj0 kzj0Var3 = kkqVar.c;
        kzj0 kzj0VarK2 = kzj0Var3.k0(false);
        if (e0t0.f(kzj0Var3)) {
            kzj0VarK2 = new t660(kzj0VarK2);
        }
        return xsm0.z(ucx.W(kzj0VarK1, kzj0VarK2), xsm0.m(tft0VarJ0));
    }

    @Override // a.tft0
    public final tft0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new t660(this.b.m0(ays0Var));
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        return z ? this.b.k0(true) : this;
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new t660(this.b.m0(ays0Var));
    }

    @Override // a.p3k
    public final kzj0 p0() {
        return this.b;
    }

    @Override // a.fyf
    public final boolean r() {
        return true;
    }
}
