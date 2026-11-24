package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n2d0 extends ljt {
    public static final n2d0 g;
    public static final sfy h = new sfy((byte) 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f22793a;
    public int b;
    public int c;
    public m2d0 d;
    public byte e;
    public int f;

    static {
        n2d0 n2d0Var = new n2d0();
        g = n2d0Var;
        n2d0Var.c = 0;
        n2d0Var.d = m2d0.p;
    }

    public n2d0(pyc pycVar, sso ssoVar) {
        k2d0 k2d0VarG;
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = m2d0.p;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = pycVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.b |= 1;
                                this.c = pycVar.k();
                            } else if (iN == 18) {
                                if ((this.b & 2) == 2) {
                                    m2d0 m2d0Var = this.d;
                                    m2d0Var.getClass();
                                    k2d0VarG = k2d0.g();
                                    k2d0VarG.h(m2d0Var);
                                } else {
                                    k2d0VarG = null;
                                }
                                m2d0 m2d0Var2 = (m2d0) pycVar.g(m2d0.q, ssoVar);
                                this.d = m2d0Var2;
                                if (k2d0VarG != null) {
                                    k2d0VarG.h(m2d0Var2);
                                    this.d = k2d0VarG.f();
                                }
                                this.b |= 2;
                            } else if (!pycVar.q(iN, tycVarM)) {
                            }
                        }
                        z = true;
                    } catch (aox e) {
                        e.f1223a = this;
                        throw e;
                    }
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
                    this.f22793a = ng9Var.d();
                }
                throw th;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f22793a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.b;
        if ((i & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.e = (byte) 0;
            return false;
        }
        if (this.d.b()) {
            this.e = (byte) 1;
            return true;
        }
        this.e = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iN += tyc.p(2, this.d);
        }
        int size = this.f22793a.size() + iN;
        this.f = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        j2d0 j2d0Var = new j2d0((byte) 0);
        j2d0Var.e = m2d0.p;
        return j2d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        j2d0 j2d0Var = new j2d0((byte) 0);
        j2d0Var.e = m2d0.p;
        j2d0Var.h(this);
        return j2d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.j0(1, this.c);
        }
        if ((this.b & 2) == 2) {
            tycVar.l0(2, this.d);
        }
        tycVar.o0(this.f22793a);
    }

    public n2d0() {
        this.e = (byte) -1;
        this.f = -1;
        this.f22793a = pg9.f26941a;
    }

    public n2d0(j2d0 j2d0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.f22793a = j2d0Var.f994a;
    }
}
