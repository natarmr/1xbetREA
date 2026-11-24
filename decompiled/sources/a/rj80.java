package a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rj80 implements j39 {
    public final xk80 b;
    public final j39 c;
    public final k6z d;

    public rj80(xk80 xk80Var, j39 j39Var, k6z k6zVar) {
        this.b = xk80Var;
        this.c = j39Var;
        this.d = k6zVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // a.j39
    public final float a(float f, float f2, float f3) {
        int iP;
        int iP2;
        int iP3;
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map map = quu0.f29360a;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        k6z k6zVar = this.d;
        xk80 xk80Var = this.b;
        if (fAbs != 0.0f && z) {
            if (k6zVar == k6z.b && xk80Var.m().e == ma80.b) {
                iP3 = xk80Var.p() + (-xk80Var.f);
            } else {
                iP3 = xk80Var.f;
            }
            float fP = iP3 * (-1.0f);
            while (fA > 0.0f && fP < fA) {
                fP += xk80Var.p();
            }
            while (fA < 0.0f && fP > fA) {
                fP -= xk80Var.p();
            }
            return fP;
        }
        int i = xk80Var.f;
        pz40 pz40Var = xk80Var.F;
        if (Math.abs(i) < 1.0E-6d) {
            return 0.0f;
        }
        k6z k6zVar2 = k6z.b;
        if (k6zVar == k6zVar2 && xk80Var.m().e == ma80.b) {
            iP = xk80Var.p() + (-xk80Var.f);
        } else {
            iP = xk80Var.f;
        }
        float f5 = iP * (-1.0f);
        if (k6zVar == k6zVar2 && xk80Var.m().e == ma80.b) {
            if (!((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
                iP2 = xk80Var.p();
                f5 += iP2;
            }
        } else if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
            iP2 = xk80Var.p();
            f5 += iP2;
        }
        return l1e0.c(f5, -f3, f3);
    }
}
