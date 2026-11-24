package a;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qiv extends k4e {
    public float u0 = -1.0f;
    public int v0 = -1;
    public int w0 = -1;
    public w2e x0 = this.K;
    public int y0 = 0;
    public boolean z0;

    public qiv() {
        this.S.clear();
        this.S.add(this.x0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.x0;
        }
    }

    @Override // a.k4e
    public final boolean C() {
        return this.z0;
    }

    @Override // a.k4e
    public final boolean D() {
        return this.z0;
    }

    @Override // a.k4e
    public final void V(p900 p900Var, boolean z) {
        if (this.V == null) {
            return;
        }
        w2e w2eVar = this.x0;
        p900Var.getClass();
        int iN = p900.n(w2eVar);
        if (this.y0 == 1) {
            this.a0 = iN;
            this.b0 = 0;
            O(this.V.m());
            T(0);
            return;
        }
        this.a0 = 0;
        this.b0 = iN;
        T(this.V.s());
        O(0);
    }

    public final void W(int i) {
        this.x0.l(i);
        this.z0 = true;
    }

    public final void X(int i) {
        w2e w2eVar;
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.y0 == 1) {
            w2eVar = this.J;
            this.x0 = w2eVar;
        } else {
            w2eVar = this.K;
            this.x0 = w2eVar;
        }
        arrayList.add(w2eVar);
        w2e[] w2eVarArr = this.R;
        int length = w2eVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            w2eVarArr[i2] = this.x0;
        }
    }

    @Override // a.k4e
    public final void c(p900 p900Var, boolean z) {
        l4e l4eVar = (l4e) this.V;
        if (l4eVar == null) {
            return;
        }
        Object objK = l4eVar.k(2);
        Object objK2 = l4eVar.k(4);
        k4e k4eVar = this.V;
        j4e j4eVar = j4e.b;
        boolean z2 = k4eVar != null && k4eVar.U[0] == j4eVar;
        if (this.y0 == 0) {
            objK = l4eVar.k(3);
            objK2 = l4eVar.k(5);
            k4e k4eVar2 = this.V;
            z2 = k4eVar2 != null && k4eVar2.U[1] == j4eVar;
        }
        if (this.z0) {
            w2e w2eVar = this.x0;
            if (w2eVar.c) {
                ukk0 ukk0VarK = p900Var.k(w2eVar);
                p900Var.d(ukk0VarK, this.x0.d());
                if (this.v0 != -1) {
                    if (z2) {
                        p900Var.f(p900Var.k(objK2), ukk0VarK, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    ukk0 ukk0VarK2 = p900Var.k(objK2);
                    p900Var.f(ukk0VarK, p900Var.k(objK), 0, 5);
                    p900Var.f(ukk0VarK2, ukk0VarK, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            ukk0 ukk0VarK3 = p900Var.k(this.x0);
            p900Var.e(ukk0VarK3, p900Var.k(objK), this.v0, 8);
            if (z2) {
                p900Var.f(p900Var.k(objK2), ukk0VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.w0 != -1) {
            ukk0 ukk0VarK4 = p900Var.k(this.x0);
            ukk0 ukk0VarK5 = p900Var.k(objK2);
            p900Var.e(ukk0VarK4, ukk0VarK5, -this.w0, 8);
            if (z2) {
                p900Var.f(ukk0VarK4, p900Var.k(objK), 0, 5);
                p900Var.f(ukk0VarK5, ukk0VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.u0 != -1.0f) {
            ukk0 ukk0VarK6 = p900Var.k(this.x0);
            ukk0 ukk0VarK7 = p900Var.k(objK2);
            float f = this.u0;
            kx3 kx3VarL = p900Var.l();
            kx3VarL.d.g(ukk0VarK6, -1.0f);
            kx3VarL.d.g(ukk0VarK7, f);
            p900Var.c(kx3VarL);
        }
    }

    @Override // a.k4e
    public final boolean d() {
        return true;
    }

    @Override // a.k4e
    public final void h(k4e k4eVar, HashMap map) {
        super.h(k4eVar, map);
        qiv qivVar = (qiv) k4eVar;
        this.u0 = qivVar.u0;
        this.v0 = qivVar.v0;
        this.w0 = qivVar.w0;
        X(qivVar.y0);
    }

    @Override // a.k4e
    public final w2e k(int i) {
        int iE = hne.E(i);
        if (iE != 1) {
            if (iE != 2) {
                if (iE != 3) {
                    if (iE != 4) {
                        return null;
                    }
                }
            }
            if (this.y0 == 0) {
                return this.x0;
            }
            return null;
        }
        if (this.y0 == 1) {
            return this.x0;
        }
        return null;
    }
}
