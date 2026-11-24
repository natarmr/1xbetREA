package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g3d0 extends ljt {
    public static final g3d0 l;
    public static final sfy m = new sfy((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f10605a;
    public int b;
    public int c;
    public int d;
    public f3d0 e;
    public a4d0 f;
    public int g;
    public List h;
    public List i;
    public byte j;
    public int k;

    static {
        g3d0 g3d0Var = new g3d0();
        l = g3d0Var;
        g3d0Var.c = 0;
        g3d0Var.d = 0;
        g3d0Var.e = f3d0.TRUE;
        g3d0Var.f = a4d0.u;
        g3d0Var.g = 0;
        List list = Collections.EMPTY_LIST;
        g3d0Var.h = list;
        g3d0Var.i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g3d0(pyc pycVar, sso ssoVar) {
        f3d0 f3d0Var;
        this.j = (byte) -1;
        this.k = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        f3d0 f3d0Var2 = f3d0.TRUE;
        this.e = f3d0Var2;
        this.f = a4d0.u;
        this.g = 0;
        List list = Collections.EMPTY_LIST;
        this.h = list;
        this.i = list;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = pycVar.k();
                        } else if (iN != 16) {
                            Object objT = null;
                            if (iN == 24) {
                                int iK = pycVar.k();
                                if (iK != 0) {
                                    if (iK == 1) {
                                        objT = f3d0.FALSE;
                                    } else if (iK == 2) {
                                        objT = f3d0.NULL;
                                    }
                                    f3d0Var = objT;
                                } else {
                                    f3d0Var = f3d0Var2;
                                }
                                if (f3d0Var == 0) {
                                    tycVarM.s0(iN);
                                    tycVarM.s0(iK);
                                } else {
                                    this.b |= 4;
                                    this.e = f3d0Var;
                                }
                            } else if (iN == 34) {
                                if ((this.b & 8) == 8) {
                                    a4d0 a4d0Var = this.f;
                                    a4d0Var.getClass();
                                    objT = a4d0.t(a4d0Var);
                                }
                                z3d0 z3d0Var = objT;
                                a4d0 a4d0Var2 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                                this.f = a4d0Var2;
                                if (z3d0Var != 0) {
                                    z3d0Var.i(a4d0Var2);
                                    this.f = z3d0Var.g();
                                }
                                this.b |= 8;
                            } else if (iN != 40) {
                                sfy sfyVar = m;
                                if (iN == 50) {
                                    if ((i & 32) != 32) {
                                        this.h = new ArrayList();
                                        i |= 32;
                                    }
                                    this.h.add(pycVar.g(sfyVar, ssoVar));
                                } else if (iN == 58) {
                                    if ((i & 64) != 64) {
                                        this.i = new ArrayList();
                                        i |= 64;
                                    }
                                    this.i.add(pycVar.g(sfyVar, ssoVar));
                                } else if (!pycVar.q(iN, tycVarM)) {
                                }
                            } else {
                                this.b |= 16;
                                this.g = pycVar.k();
                            }
                        } else {
                            this.b |= 2;
                            this.d = pycVar.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 64) == 64) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f10605a = ng9Var.d();
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
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 64) == 64) {
            this.i = Collections.unmodifiableList(this.i);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f10605a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.b & 8) == 8 && !this.f.b()) {
            this.j = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.h.size(); i++) {
            if (!((g3d0) this.h.get(i)).b()) {
                this.j = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!((g3d0) this.i.get(i2)).b()) {
                this.j = (byte) 0;
                return false;
            }
        }
        this.j = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        int i = this.k;
        if (i != -1) {
            return i;
        }
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iN += tyc.n(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iN += tyc.m(3, this.e.f8857a);
        }
        if ((this.b & 8) == 8) {
            iN += tyc.p(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iN += tyc.n(5, this.g);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iN += tyc.p(6, (z3) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            iN += tyc.p(7, (z3) this.i.get(i3));
        }
        int size = this.f10605a.size() + iN;
        this.k = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return e3d0.g();
    }

    @Override // a.z3
    public final ajt f() {
        e3d0 e3d0VarG = e3d0.g();
        e3d0VarG.h(this);
        return e3d0VarG;
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
            tycVar.i0(3, this.e.f8857a);
        }
        if ((this.b & 8) == 8) {
            tycVar.l0(4, this.f);
        }
        if ((this.b & 16) == 16) {
            tycVar.j0(5, this.g);
        }
        for (int i = 0; i < this.h.size(); i++) {
            tycVar.l0(6, (z3) this.h.get(i));
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            tycVar.l0(7, (z3) this.i.get(i2));
        }
        tycVar.o0(this.f10605a);
    }

    public g3d0() {
        this.j = (byte) -1;
        this.k = -1;
        this.f10605a = pg9.f26941a;
    }

    public g3d0(e3d0 e3d0Var) {
        this.j = (byte) -1;
        this.k = -1;
        this.f10605a = e3d0Var.f994a;
    }
}
