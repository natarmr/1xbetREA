package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b3d0 extends ljt {
    public static final b3d0 j;
    public static final sfy k = new sfy((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f1897a;
    public int b;
    public z2d0 c;
    public List d;
    public g3d0 e;
    public a3d0 f;
    public y2d0 g;
    public byte h;
    public int i;

    static {
        b3d0 b3d0Var = new b3d0();
        j = b3d0Var;
        b3d0Var.c = z2d0.RETURNS_CONSTANT;
        b3d0Var.d = Collections.EMPTY_LIST;
        b3d0Var.e = g3d0.l;
        b3d0Var.f = a3d0.AT_MOST_ONCE;
        b3d0Var.g = y2d0.CONCLUSION_CONDITION;
    }

    public b3d0(pyc pycVar, sso ssoVar) {
        this.h = (byte) -1;
        this.i = -1;
        z2d0 z2d0Var = z2d0.RETURNS_CONSTANT;
        this.c = z2d0Var;
        this.d = Collections.EMPTY_LIST;
        this.e = g3d0.l;
        a3d0 a3d0Var = a3d0.AT_MOST_ONCE;
        this.f = a3d0Var;
        y2d0 y2d0Var = y2d0.CONCLUSION_CONDITION;
        this.g = y2d0Var;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        y2d0 y2d0Var2 = null;
                        z2d0 z2d0Var2 = null;
                        e3d0 e3d0VarG = null;
                        a3d0 a3d0Var2 = null;
                        if (iN == 8) {
                            int iK = pycVar.k();
                            if (iK == 0) {
                                z2d0Var2 = z2d0Var;
                            } else if (iK == 1) {
                                z2d0Var2 = z2d0.CALLS;
                            } else if (iK == 2) {
                                z2d0Var2 = z2d0.RETURNS_NOT_NULL;
                            } else if (iK == 3) {
                                z2d0Var2 = z2d0.RETURNS_RESULT_OF;
                            }
                            if (z2d0Var2 == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK);
                            } else {
                                this.b |= 1;
                                this.c = z2d0Var2;
                            }
                        } else if (iN == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.d = new ArrayList();
                                c = 2;
                            }
                            this.d.add(pycVar.g(g3d0.m, ssoVar));
                        } else if (iN == 26) {
                            if ((this.b & 2) == 2) {
                                g3d0 g3d0Var = this.e;
                                g3d0Var.getClass();
                                e3d0VarG = e3d0.g();
                                e3d0VarG.h(g3d0Var);
                            }
                            g3d0 g3d0Var2 = (g3d0) pycVar.g(g3d0.m, ssoVar);
                            this.e = g3d0Var2;
                            if (e3d0VarG != null) {
                                e3d0VarG.h(g3d0Var2);
                                this.e = e3d0VarG.f();
                            }
                            this.b |= 2;
                        } else if (iN == 32) {
                            int iK2 = pycVar.k();
                            if (iK2 == 0) {
                                a3d0Var2 = a3d0Var;
                            } else if (iK2 == 1) {
                                a3d0Var2 = a3d0.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                a3d0Var2 = a3d0.AT_LEAST_ONCE;
                            }
                            if (a3d0Var2 == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK2);
                            } else {
                                this.b |= 4;
                                this.f = a3d0Var2;
                            }
                        } else if (iN == 40) {
                            int iK3 = pycVar.k();
                            if (iK3 == 0) {
                                y2d0Var2 = y2d0Var;
                            } else if (iK3 == 1) {
                                y2d0Var2 = y2d0.RETURNS_CONDITION;
                            } else if (iK3 == 2) {
                                y2d0Var2 = y2d0.HOLDSIN_CONDITION;
                            }
                            if (y2d0Var2 == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK3);
                            } else {
                                this.b |= 8;
                                this.g = y2d0Var2;
                            }
                        } else if (!pycVar.q(iN, tycVarM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f1897a = ng9Var.d();
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
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f1897a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((g3d0) this.d.get(i)).b()) {
                this.h = (byte) 0;
                return false;
            }
        }
        if ((this.b & 2) != 2 || this.e.b()) {
            this.h = (byte) 1;
            return true;
        }
        this.h = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int iM = (this.b & 1) == 1 ? tyc.m(1, this.c.f43665a) : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iM += tyc.p(2, (z3) this.d.get(i2));
        }
        if ((this.b & 2) == 2) {
            iM += tyc.p(3, this.e);
        }
        if ((this.b & 4) == 4) {
            iM += tyc.m(4, this.f.f166a);
        }
        if ((this.b & 8) == 8) {
            iM += tyc.m(5, this.g.f41899a);
        }
        int size = this.f1897a.size() + iM;
        this.i = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return wfy.i();
    }

    @Override // a.z3
    public final ajt f() {
        wfy wfyVarI = wfy.i();
        wfyVarI.m(this);
        return wfyVarI;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.i0(1, this.c.f43665a);
        }
        for (int i = 0; i < this.d.size(); i++) {
            tycVar.l0(2, (z3) this.d.get(i));
        }
        if ((this.b & 2) == 2) {
            tycVar.l0(3, this.e);
        }
        if ((this.b & 4) == 4) {
            tycVar.i0(4, this.f.f166a);
        }
        if ((this.b & 8) == 8) {
            tycVar.i0(5, this.g.f41899a);
        }
        tycVar.o0(this.f1897a);
    }

    public b3d0() {
        this.h = (byte) -1;
        this.i = -1;
        this.f1897a = pg9.f26941a;
    }

    public b3d0(wfy wfyVar) {
        this.h = (byte) -1;
        this.i = -1;
        this.f1897a = wfyVar.f994a;
    }
}
