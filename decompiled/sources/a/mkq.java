package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mkq extends kkq implements fyf {
    @Override // a.wsy
    public final wsy f0(cty ctyVar) {
        kzj0 kzj0Var = this.b;
        kzj0Var.getClass();
        kzj0 kzj0Var2 = this.c;
        kzj0Var2.getClass();
        return new mkq(kzj0Var, kzj0Var2);
    }

    @Override // a.fyf
    public final tft0 g(wsy wsyVar) {
        tft0 tft0VarW;
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof kkq) {
            tft0VarW = tft0VarJ0;
        } else {
            if (!(tft0VarJ0 instanceof kzj0)) {
                t9f.b();
                return null;
            }
            kzj0 kzj0Var = (kzj0) tft0VarJ0;
            tft0VarW = ucx.W(kzj0Var, kzj0Var.k0(true));
        }
        return xsm0.n(tft0VarW, tft0VarJ0);
    }

    @Override // a.tft0
    public final tft0 k0(boolean z) {
        return ucx.W(this.b.k0(z), this.c.k0(z));
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: l0 */
    public final tft0 f0(cty ctyVar) {
        kzj0 kzj0Var = this.b;
        kzj0Var.getClass();
        kzj0 kzj0Var2 = this.c;
        kzj0Var2.getClass();
        return new mkq(kzj0Var, kzj0Var2);
    }

    @Override // a.tft0
    public final tft0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return ucx.W(this.b.m0(ays0Var), this.c.m0(ays0Var));
    }

    @Override // a.fyf
    public final boolean r() {
        kzj0 kzj0Var = this.b;
        return (kzj0Var.S().n() instanceof hzs0) && Intrinsics.d(kzj0Var.S(), this.c.S());
    }

    @Override // a.kkq
    public final String toString() {
        return Separators.LPAREN + this.b + ".." + this.c + ')';
    }
}
