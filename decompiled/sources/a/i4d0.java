package a;

import android.javax.sip.message.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i4d0 extends gjt {
    public static final i4d0 n;
    public static final sfy o = new sfy((byte) 27);
    public final pg9 b;
    public int c;
    public int d;
    public int e;
    public a4d0 f;
    public int g;
    public a4d0 h;
    public int i;
    public List j;
    public m2d0 k;
    public byte l;
    public int m;

    static {
        i4d0 i4d0Var = new i4d0();
        n = i4d0Var;
        i4d0Var.d = 0;
        i4d0Var.e = 0;
        a4d0 a4d0Var = a4d0.u;
        i4d0Var.f = a4d0Var;
        i4d0Var.g = 0;
        i4d0Var.h = a4d0Var;
        i4d0Var.i = 0;
        i4d0Var.j = Collections.EMPTY_LIST;
        i4d0Var.k = m2d0.p;
    }

    public i4d0(pyc pycVar, sso ssoVar) {
        this.l = (byte) -1;
        this.m = -1;
        boolean z = false;
        this.d = 0;
        this.e = 0;
        a4d0 a4d0Var = a4d0.u;
        this.f = a4d0Var;
        this.g = 0;
        this.h = a4d0Var;
        this.i = 0;
        this.j = Collections.EMPTY_LIST;
        this.k = m2d0.p;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.c |= 1;
                            this.d = pycVar.k();
                        } else if (iN != 16) {
                            k2d0 k2d0VarG = null;
                            z3d0 z3d0VarT = null;
                            z3d0 z3d0VarT2 = null;
                            if (iN == 26) {
                                if ((this.c & 4) == 4) {
                                    a4d0 a4d0Var2 = this.f;
                                    a4d0Var2.getClass();
                                    z3d0VarT = a4d0.t(a4d0Var2);
                                }
                                a4d0 a4d0Var3 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                                this.f = a4d0Var3;
                                if (z3d0VarT != null) {
                                    z3d0VarT.i(a4d0Var3);
                                    this.f = z3d0VarT.g();
                                }
                                this.c |= 4;
                            } else if (iN == 34) {
                                if ((this.c & 16) == 16) {
                                    a4d0 a4d0Var4 = this.h;
                                    a4d0Var4.getClass();
                                    z3d0VarT2 = a4d0.t(a4d0Var4);
                                }
                                a4d0 a4d0Var5 = (a4d0) pycVar.g(a4d0.v, ssoVar);
                                this.h = a4d0Var5;
                                if (z3d0VarT2 != null) {
                                    z3d0VarT2.i(a4d0Var5);
                                    this.h = z3d0VarT2.g();
                                }
                                this.c |= 16;
                            } else if (iN == 40) {
                                this.c |= 8;
                                this.g = pycVar.k();
                            } else if (iN == 48) {
                                this.c |= 32;
                                this.i = pycVar.k();
                            } else if (iN == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.j = new ArrayList();
                                    c = '@';
                                }
                                this.j.add(pycVar.g(p2d0.h, ssoVar));
                            } else if (iN == 66) {
                                if ((this.c & 64) == 64) {
                                    m2d0 m2d0Var = this.k;
                                    m2d0Var.getClass();
                                    k2d0VarG = k2d0.g();
                                    k2d0VarG.h(m2d0Var);
                                }
                                m2d0 m2d0Var2 = (m2d0) pycVar.g(m2d0.q, ssoVar);
                                this.k = m2d0Var2;
                                if (k2d0VarG != null) {
                                    k2d0VarG.h(m2d0Var2);
                                    this.k = k2d0VarG.f();
                                }
                                this.c |= 64;
                            } else if (!o(pycVar, tycVarM, ssoVar, iN)) {
                            }
                        } else {
                            this.c |= 2;
                            this.e = pycVar.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.b = ng9Var.d();
                    }
                    n();
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
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.j = Collections.unmodifiableList(this.j);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.b = ng9Var.d();
        }
        n();
    }

    @Override // a.e540
    public final z3 a() {
        return n;
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.c;
        if ((i & 2) != 2) {
            this.l = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f.b()) {
            this.l = (byte) 0;
            return false;
        }
        if ((this.c & 16) == 16 && !this.h.b()) {
            this.l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            if (!((p2d0) this.j.get(i2)).b()) {
                this.l = (byte) 0;
                return false;
            }
        }
        if ((this.c & 64) == 64 && !this.k.b()) {
            this.l = (byte) 0;
            return false;
        }
        if (j()) {
            this.l = (byte) 1;
            return true;
        }
        this.l = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 1) == 1 ? tyc.n(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iN += tyc.n(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iN += tyc.p(3, this.f);
        }
        if ((this.c & 16) == 16) {
            iN += tyc.p(4, this.h);
        }
        if ((this.c & 8) == 8) {
            iN += tyc.n(5, this.g);
        }
        if ((this.c & 32) == 32) {
            iN += tyc.n(6, this.i);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            iN += tyc.p(7, (z3) this.j.get(i2));
        }
        if ((this.c & 64) == 64) {
            iN += tyc.p(8, this.k);
        }
        int size = this.b.size() + k() + iN;
        this.m = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return h4d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        h4d0 h4d0VarH = h4d0.h();
        h4d0VarH.i(this);
        return h4d0VarH;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 1) == 1) {
            tycVar.j0(1, this.d);
        }
        if ((this.c & 2) == 2) {
            tycVar.j0(2, this.e);
        }
        if ((this.c & 4) == 4) {
            tycVar.l0(3, this.f);
        }
        if ((this.c & 16) == 16) {
            tycVar.l0(4, this.h);
        }
        if ((this.c & 8) == 8) {
            tycVar.j0(5, this.g);
        }
        if ((this.c & 32) == 32) {
            tycVar.j0(6, this.i);
        }
        for (int i = 0; i < this.j.size(); i++) {
            tycVar.l0(7, (z3) this.j.get(i));
        }
        if ((this.c & 64) == 64) {
            tycVar.l0(8, this.k);
        }
        wtiVar.E(Response.OK, tycVar);
        tycVar.o0(this.b);
    }

    public i4d0() {
        this.l = (byte) -1;
        this.m = -1;
        this.b = pg9.f26941a;
    }

    public i4d0(h4d0 h4d0Var) {
        super(h4d0Var);
        this.l = (byte) -1;
        this.m = -1;
        this.b = h4d0Var.f994a;
    }
}
