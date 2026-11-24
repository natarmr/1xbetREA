package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w3d0 extends ajt implements e540 {
    public int b;
    public x3d0 c;
    public a4d0 d;
    public int e;

    @Override // a.ajt
    public final z3 c() {
        y3d0 y3d0VarF = f();
        if (y3d0VarF.b()) {
            return y3d0VarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        w3d0 w3d0Var = new w3d0();
        w3d0Var.c = x3d0.INV;
        w3d0Var.d = a4d0.u;
        w3d0Var.g(f());
        return w3d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        y3d0 y3d0Var = null;
        try {
            try {
                y3d0.i.getClass();
                g(new y3d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                y3d0 y3d0Var2 = (y3d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    y3d0Var = y3d0Var2;
                    if (y3d0Var != null) {
                        g(y3d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (y3d0Var != null) {
                g(y3d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        g((y3d0) ljtVar);
        return this;
    }

    public final y3d0 f() {
        y3d0 y3d0Var = new y3d0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        y3d0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        y3d0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        y3d0Var.e = this.e;
        y3d0Var.b = i2;
        return y3d0Var;
    }

    public final void g(y3d0 y3d0Var) {
        a4d0 a4d0Var;
        if (y3d0Var == y3d0.h) {
            return;
        }
        if ((y3d0Var.b & 1) == 1) {
            x3d0 x3d0Var = y3d0Var.c;
            x3d0Var.getClass();
            this.b = 1 | this.b;
            this.c = x3d0Var;
        }
        if ((y3d0Var.b & 2) == 2) {
            a4d0 a4d0Var2 = y3d0Var.d;
            if ((this.b & 2) != 2 || (a4d0Var = this.d) == a4d0.u) {
                this.d = a4d0Var2;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var);
                z3d0VarT.i(a4d0Var2);
                this.d = z3d0VarT.g();
            }
            this.b |= 2;
        }
        if ((y3d0Var.b & 4) == 4) {
            int i = y3d0Var.e;
            this.b = 4 | this.b;
            this.e = i;
        }
        this.f994a = this.f994a.c(y3d0Var.f41947a);
    }
}
