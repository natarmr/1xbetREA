package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class y3d0 extends ljt {
    public static final y3d0 h;
    public static final sfy i = new sfy((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f41947a;
    public int b;
    public x3d0 c;
    public a4d0 d;
    public int e;
    public byte f;
    public int g;

    static {
        y3d0 y3d0Var = new y3d0();
        h = y3d0Var;
        y3d0Var.c = x3d0.INV;
        y3d0Var.d = a4d0.u;
        y3d0Var.e = 0;
    }

    public y3d0(pyc pycVar, sso ssoVar) {
        this.f = (byte) -1;
        this.g = -1;
        x3d0 x3d0Var = x3d0.INV;
        this.c = x3d0Var;
        this.d = a4d0.u;
        boolean z = false;
        this.e = 0;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        z3d0 z3d0VarT = null;
                        x3d0 x3d0Var2 = null;
                        if (iN == 8) {
                            int iK = pycVar.k();
                            if (iK == 0) {
                                x3d0Var2 = x3d0.IN;
                            } else if (iK == 1) {
                                x3d0Var2 = x3d0.OUT;
                            } else if (iK == 2) {
                                x3d0Var2 = x3d0Var;
                            } else if (iK == 3) {
                                x3d0Var2 = x3d0.STAR;
                            }
                            if (x3d0Var2 == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK);
                            } else {
                                this.b |= 1;
                                this.c = x3d0Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.b & 2) == 2) {
                                a4d0 a4d0Var = this.d;
                                a4d0Var.getClass();
                                z3d0VarT = a4d0.t(a4d0Var);
                            }
                            a4d0 a4d0Var2 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                            this.d = a4d0Var2;
                            if (z3d0VarT != null) {
                                z3d0VarT.i(a4d0Var2);
                                this.d = z3d0VarT.g();
                            }
                            this.b |= 2;
                        } else if (iN == 24) {
                            this.b |= 4;
                            this.e = pycVar.k();
                        } else if (!pycVar.q(iN, tycVarM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f41947a = ng9Var.d();
                    }
                    throw th;
                }
            } catch (aox e) {
                e.f1223a = this;
                throw e;
            } catch (IOException e2) {
                aox aoxVar = new aox(e2.getMessage());
                aoxVar.f1223a = this;
                throw aoxVar;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f41947a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 2) != 2 || this.d.b()) {
            this.f = (byte) 1;
            return true;
        }
        this.f = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int iM = (this.b & 1) == 1 ? tyc.m(1, this.c.f40213a) : 0;
        if ((this.b & 2) == 2) {
            iM += tyc.p(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iM += tyc.n(3, this.e);
        }
        int size = this.f41947a.size() + iM;
        this.g = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        w3d0 w3d0Var = new w3d0();
        w3d0Var.c = x3d0.INV;
        w3d0Var.d = a4d0.u;
        return w3d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        w3d0 w3d0Var = new w3d0();
        w3d0Var.c = x3d0.INV;
        w3d0Var.d = a4d0.u;
        w3d0Var.g(this);
        return w3d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.i0(1, this.c.f40213a);
        }
        if ((this.b & 2) == 2) {
            tycVar.l0(2, this.d);
        }
        if ((this.b & 4) == 4) {
            tycVar.j0(3, this.e);
        }
        tycVar.o0(this.f41947a);
    }

    public y3d0() {
        this.f = (byte) -1;
        this.g = -1;
        this.f41947a = pg9.f26941a;
    }

    public y3d0(w3d0 w3d0Var) {
        this.f = (byte) -1;
        this.g = -1;
        this.f41947a = w3d0Var.f994a;
    }
}
