package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kkq extends tft0 implements nkq {
    public final kzj0 b;
    public final kzj0 c;

    public kkq(kzj0 kzj0Var, kzj0 kzj0Var2) {
        kzj0Var.getClass();
        kzj0Var2.getClass();
        this.b = kzj0Var;
        this.c = kzj0Var2;
    }

    @Override // a.wsy
    public final List J() {
        return n0().J();
    }

    @Override // a.wsy
    public final ays0 K() {
        return n0().K();
    }

    @Override // a.wsy
    public final iys0 S() {
        return n0().S();
    }

    @Override // a.wsy
    public final boolean U() {
        return n0().U();
    }

    public kzj0 n0() {
        return this.b;
    }

    public String o0(iek iekVar, iek iekVar2) {
        boolean zP = iekVar2.f14637a.p();
        kzj0 kzj0Var = this.c;
        kzj0 kzj0Var2 = this.b;
        if (!zP) {
            return iekVar.w(iekVar.P(kzj0Var2), iekVar.P(kzj0Var), vsm0.q(this));
        }
        return Separators.LPAREN + iekVar.P(kzj0Var2) + ".." + iekVar.P(kzj0Var) + ')';
    }

    public String toString() {
        return iek.e.P(this);
    }

    @Override // a.wsy
    public cr30 y() {
        return n0().y();
    }
}
