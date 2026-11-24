package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zu5 extends jvv {
    public int w0 = 0;
    public boolean x0 = true;
    public int y0 = 0;
    public boolean z0 = false;

    @Override // a.k4e
    public final boolean C() {
        return this.z0;
    }

    @Override // a.k4e
    public final boolean D() {
        return this.z0;
    }

    public final boolean Z() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.v0;
            if (i4 >= i) {
                break;
            }
            k4e k4eVar = this.u0[i4];
            if ((this.x0 || k4eVar.d()) && ((((i2 = this.w0) == 0 || i2 == 1) && !k4eVar.C()) || (((i3 = this.w0) == 2 || i3 == 3) && !k4eVar.D()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.v0; i5++) {
            k4e k4eVar2 = this.u0[i5];
            if (this.x0 || k4eVar2.d()) {
                if (!z2) {
                    int i6 = this.w0;
                    if (i6 == 0) {
                        iMax = k4eVar2.k(2).d();
                    } else if (i6 == 1) {
                        iMax = k4eVar2.k(4).d();
                    } else if (i6 == 2) {
                        iMax = k4eVar2.k(3).d();
                    } else if (i6 == 3) {
                        iMax = k4eVar2.k(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.w0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, k4eVar2.k(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, k4eVar2.k(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, k4eVar2.k(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, k4eVar2.k(5).d());
                }
            }
        }
        int i8 = iMax + this.y0;
        int i9 = this.w0;
        if (i9 == 0 || i9 == 1) {
            M(i8, i8);
        } else {
            N(i8, i8);
        }
        this.z0 = true;
        return true;
    }

    public final int a0() {
        int i = this.w0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // a.k4e
    public final void c(p900 p900Var, boolean z) {
        boolean z2;
        int i;
        w2e[] w2eVarArr = this.R;
        w2e w2eVar = this.J;
        w2eVarArr[0] = w2eVar;
        int i2 = 2;
        w2e w2eVar2 = this.K;
        w2eVarArr[2] = w2eVar2;
        w2e w2eVar3 = this.L;
        w2eVarArr[1] = w2eVar3;
        w2e w2eVar4 = this.M;
        w2eVarArr[3] = w2eVar4;
        for (w2e w2eVar5 : w2eVarArr) {
            w2eVar5.i = p900Var.k(w2eVar5);
        }
        int i3 = this.w0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        w2e w2eVar6 = w2eVarArr[i3];
        if (!this.z0) {
            Z();
        }
        if (this.z0) {
            this.z0 = false;
            int i4 = this.w0;
            if (i4 == 0 || i4 == 1) {
                p900Var.d(w2eVar.i, this.a0);
                p900Var.d(w2eVar3.i, this.a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    p900Var.d(w2eVar2.i, this.b0);
                    p900Var.d(w2eVar4.i, this.b0);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.v0) {
                z2 = false;
                break;
            }
            k4e k4eVar = this.u0[i5];
            if (this.x0 || k4eVar.d()) {
                int i6 = this.w0;
                j4e j4eVar = j4e.c;
                if (((i6 == 0 || i6 == 1) && k4eVar.U[0] == j4eVar && k4eVar.J.f != null && k4eVar.L.f != null) || ((i6 == 2 || i6 == 3) && k4eVar.U[1] == j4eVar && k4eVar.K.f != null && k4eVar.M.f != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = w2eVar.g() || w2eVar3.g();
        boolean z4 = w2eVar2.g() || w2eVar4.g();
        int i7 = !(!z2 && (((i = this.w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.v0) {
            k4e k4eVar2 = this.u0[i8];
            if (this.x0 || k4eVar2.d()) {
                ukk0 ukk0VarK = p900Var.k(k4eVar2.R[this.w0]);
                w2e[] w2eVarArr2 = k4eVar2.R;
                int i9 = this.w0;
                w2e w2eVar7 = w2eVarArr2[i9];
                w2eVar7.i = ukk0VarK;
                w2e w2eVar8 = w2eVar7.f;
                int i10 = (w2eVar8 == null || w2eVar8.d != this) ? 0 : w2eVar7.g;
                if (i9 == 0 || i9 == i2) {
                    ukk0 ukk0Var = w2eVar6.i;
                    int i11 = this.y0 - i10;
                    kx3 kx3VarL = p900Var.l();
                    ukk0 ukk0VarM = p900Var.m();
                    ukk0VarM.d = 0;
                    kx3VarL.c(ukk0Var, ukk0VarK, ukk0VarM, i11);
                    p900Var.c(kx3VarL);
                } else {
                    ukk0 ukk0Var2 = w2eVar6.i;
                    int i12 = this.y0 + i10;
                    kx3 kx3VarL2 = p900Var.l();
                    ukk0 ukk0VarM2 = p900Var.m();
                    ukk0VarM2.d = 0;
                    kx3VarL2.b(ukk0Var2, ukk0VarK, ukk0VarM2, i12);
                    p900Var.c(kx3VarL2);
                }
                p900Var.e(w2eVar6.i, ukk0VarK, this.y0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.w0;
        if (i13 == 0) {
            p900Var.e(w2eVar3.i, w2eVar.i, 0, 8);
            p900Var.e(w2eVar.i, this.V.L.i, 0, 4);
            p900Var.e(w2eVar.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            p900Var.e(w2eVar.i, w2eVar3.i, 0, 8);
            p900Var.e(w2eVar.i, this.V.J.i, 0, 4);
            p900Var.e(w2eVar.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            p900Var.e(w2eVar4.i, w2eVar2.i, 0, 8);
            p900Var.e(w2eVar2.i, this.V.M.i, 0, 4);
            p900Var.e(w2eVar2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            p900Var.e(w2eVar2.i, w2eVar4.i, 0, 8);
            p900Var.e(w2eVar2.i, this.V.K.i, 0, 4);
            p900Var.e(w2eVar2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // a.k4e
    public final boolean d() {
        return true;
    }

    @Override // a.jvv, a.k4e
    public final void h(k4e k4eVar, HashMap map) {
        super.h(k4eVar, map);
        zu5 zu5Var = (zu5) k4eVar;
        this.w0 = zu5Var.w0;
        this.x0 = zu5Var.x0;
        this.y0 = zu5Var.y0;
    }

    @Override // a.k4e
    public final String toString() {
        String strN = axq.n(new StringBuilder("[Barrier] "), this.k0, " {");
        for (int i = 0; i < this.v0; i++) {
            k4e k4eVar = this.u0[i];
            if (i > 0) {
                strN = strN.concat(", ");
            }
            strN = strN + k4eVar.k0;
        }
        return strN.concat("}");
    }
}
