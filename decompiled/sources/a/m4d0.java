package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m4d0 extends ljt {
    public static final m4d0 k;
    public static final sfy l = new sfy((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f21164a;
    public int b;
    public int c;
    public int d;
    public k4d0 e;
    public int f;
    public int g;
    public l4d0 h;
    public byte i;
    public int j;

    static {
        m4d0 m4d0Var = new m4d0();
        k = m4d0Var;
        m4d0Var.c = 0;
        m4d0Var.d = 0;
        m4d0Var.e = k4d0.ERROR;
        m4d0Var.f = 0;
        m4d0Var.g = 0;
        m4d0Var.h = l4d0.LANGUAGE_VERSION;
    }

    public m4d0(pyc pycVar) {
        this.i = (byte) -1;
        this.j = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        k4d0 k4d0Var = k4d0.ERROR;
        this.e = k4d0Var;
        this.f = 0;
        this.g = 0;
        l4d0 l4d0Var = l4d0.LANGUAGE_VERSION;
        this.h = l4d0Var;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = pycVar.k();
                        } else if (iN != 16) {
                            l4d0 l4d0Var2 = null;
                            k4d0 k4d0Var2 = null;
                            if (iN == 24) {
                                int iK = pycVar.k();
                                if (iK == 0) {
                                    k4d0Var2 = k4d0.WARNING;
                                } else if (iK == 1) {
                                    k4d0Var2 = k4d0Var;
                                } else if (iK == 2) {
                                    k4d0Var2 = k4d0.HIDDEN;
                                }
                                if (k4d0Var2 == null) {
                                    tycVarM.s0(iN);
                                    tycVarM.s0(iK);
                                } else {
                                    this.b |= 4;
                                    this.e = k4d0Var2;
                                }
                            } else if (iN == 32) {
                                this.b |= 8;
                                this.f = pycVar.k();
                            } else if (iN == 40) {
                                this.b |= 16;
                                this.g = pycVar.k();
                            } else if (iN == 48) {
                                int iK2 = pycVar.k();
                                if (iK2 == 0) {
                                    l4d0Var2 = l4d0Var;
                                } else if (iK2 == 1) {
                                    l4d0Var2 = l4d0.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    l4d0Var2 = l4d0.API_VERSION;
                                }
                                if (l4d0Var2 == null) {
                                    tycVarM.s0(iN);
                                    tycVarM.s0(iK2);
                                } else {
                                    this.b |= 32;
                                    this.h = l4d0Var2;
                                }
                            } else if (!pycVar.q(iN, tycVarM)) {
                            }
                        } else {
                            this.b |= 2;
                            this.d = pycVar.k();
                        }
                    }
                    z = true;
                } catch (aox e) {
                    e.f1223a = this;
                    throw e;
                } catch (IOException e2) {
                    aox aoxVar = new aox(e2.getMessage());
                    aoxVar.f1223a = this;
                    throw aoxVar;
                }
            } catch (Throwable th) {
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.f21164a = ng9Var.d();
                }
                throw th;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f21164a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.i = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iN += tyc.n(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iN += tyc.m(3, this.e.f17664a);
        }
        if ((this.b & 8) == 8) {
            iN += tyc.n(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iN += tyc.n(5, this.g);
        }
        if ((this.b & 32) == 32) {
            iN += tyc.m(6, this.h.f19400a);
        }
        int size = this.f21164a.size() + iN;
        this.j = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        j4d0 j4d0Var = new j4d0();
        j4d0Var.e = k4d0.ERROR;
        j4d0Var.h = l4d0.LANGUAGE_VERSION;
        return j4d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        j4d0 j4d0Var = new j4d0();
        j4d0Var.e = k4d0.ERROR;
        j4d0Var.h = l4d0.LANGUAGE_VERSION;
        j4d0Var.g(this);
        return j4d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.j0(1, this.c);
        }
        if ((this.b & 2) == 2) {
            tycVar.j0(2, this.d);
        }
        if ((this.b & 4) == 4) {
            tycVar.i0(3, this.e.f17664a);
        }
        if ((this.b & 8) == 8) {
            tycVar.j0(4, this.f);
        }
        if ((this.b & 16) == 16) {
            tycVar.j0(5, this.g);
        }
        if ((this.b & 32) == 32) {
            tycVar.i0(6, this.h.f19400a);
        }
        tycVar.o0(this.f21164a);
    }

    public m4d0() {
        this.i = (byte) -1;
        this.j = -1;
        this.f21164a = pg9.f26941a;
    }

    public m4d0(j4d0 j4d0Var) {
        this.i = (byte) -1;
        this.j = -1;
        this.f21164a = j4d0Var.f994a;
    }
}
