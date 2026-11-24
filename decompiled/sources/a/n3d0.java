package a;

import android.javax.sip.message.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n3d0 extends gjt {
    public static final n3d0 k;
    public static final sfy l = new sfy((byte) 17);
    public final pg9 b;
    public int c;
    public v3d0 d;
    public t3d0 e;
    public m3d0 f;
    public List g;
    public List h;
    public byte i;
    public int j;

    static {
        n3d0 n3d0Var = new n3d0();
        k = n3d0Var;
        n3d0Var.d = v3d0.e;
        n3d0Var.e = t3d0.e;
        n3d0Var.f = m3d0.k;
        List list = Collections.EMPTY_LIST;
        n3d0Var.g = list;
        n3d0Var.h = list;
    }

    public n3d0(pyc pycVar, sso ssoVar) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = v3d0.e;
        this.e = t3d0.e;
        this.f = m3d0.k;
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.h = list;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        l3d0 l3d0VarI = null;
                        w2d0 w2d0Var = null;
                        w2d0 w2d0Var2 = null;
                        if (iN == 10) {
                            if ((this.c & 1) == 1) {
                                v3d0 v3d0Var = this.d;
                                v3d0Var.getClass();
                                w2d0Var = new w2d0((byte) 3);
                                w2d0Var.d = pez.b;
                                w2d0Var.n(v3d0Var);
                            }
                            v3d0 v3d0Var2 = (v3d0) pycVar.g(v3d0.f, ssoVar);
                            this.d = v3d0Var2;
                            if (w2d0Var != null) {
                                w2d0Var.n(v3d0Var2);
                                this.d = w2d0Var.h();
                            }
                            this.c |= 1;
                        } else if (iN == 18) {
                            if ((this.c & 2) == 2) {
                                t3d0 t3d0Var = this.e;
                                t3d0Var.getClass();
                                w2d0Var2 = new w2d0((byte) 1);
                                w2d0Var2.d = Collections.EMPTY_LIST;
                                w2d0Var2.m(t3d0Var);
                            }
                            t3d0 t3d0Var2 = (t3d0) pycVar.g(t3d0.f, ssoVar);
                            this.e = t3d0Var2;
                            if (w2d0Var2 != null) {
                                w2d0Var2.m(t3d0Var2);
                                this.e = w2d0Var2.g();
                            }
                            this.c |= 2;
                        } else if (iN == 26) {
                            if ((this.c & 4) == 4) {
                                m3d0 m3d0Var = this.f;
                                m3d0Var.getClass();
                                l3d0VarI = l3d0.i();
                                l3d0VarI.m(m3d0Var);
                            }
                            m3d0 m3d0Var2 = (m3d0) pycVar.g(m3d0.l, ssoVar);
                            this.f = m3d0Var2;
                            if (l3d0VarI != null) {
                                l3d0VarI.m(m3d0Var2);
                                this.f = l3d0VarI.g();
                            }
                            this.c |= 4;
                        } else if (iN == 34) {
                            int i2 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i2 != 8) {
                                this.g = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.g.add(pycVar.g(s2d0.i1, ssoVar));
                        } else if (iN == 42) {
                            int i3 = (i == true ? 1 : 0) & 16;
                            i = i;
                            if (i3 != 16) {
                                this.h = new ArrayList();
                                i = (i == true ? 1 : 0) | 16;
                            }
                            this.h.add(pycVar.g(p2d0.h, ssoVar));
                        } else if (!o(pycVar, tycVarM, ssoVar, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 8) == 8) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if (((i == true ? 1 : 0) & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
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
        if (((i == true ? 1 : 0) & 8) == 8) {
            this.g = Collections.unmodifiableList(this.g);
        }
        if (((i == true ? 1 : 0) & 16) == 16) {
            this.h = Collections.unmodifiableList(this.h);
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
        return k;
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
        if ((this.c & 2) == 2 && !this.e.b()) {
            this.i = (byte) 0;
            return false;
        }
        if ((this.c & 4) == 4 && !this.f.b()) {
            this.i = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!((s2d0) this.g.get(i)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((p2d0) this.h.get(i2)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.i = (byte) 1;
            return true;
        }
        this.i = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iP = (this.c & 1) == 1 ? tyc.p(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iP += tyc.p(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iP += tyc.p(3, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            iP += tyc.p(4, (z3) this.g.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            iP += tyc.p(5, (z3) this.h.get(i3));
        }
        int size = this.b.size() + k() + iP;
        this.j = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return l3d0.j();
    }

    @Override // a.z3
    public final ajt f() {
        l3d0 l3d0VarJ = l3d0.j();
        l3d0VarJ.n(this);
        return l3d0VarJ;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 1) == 1) {
            tycVar.l0(1, this.d);
        }
        if ((this.c & 2) == 2) {
            tycVar.l0(2, this.e);
        }
        if ((this.c & 4) == 4) {
            tycVar.l0(3, this.f);
        }
        for (int i = 0; i < this.g.size(); i++) {
            tycVar.l0(4, (z3) this.g.get(i));
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            tycVar.l0(5, (z3) this.h.get(i2));
        }
        wtiVar.E(Response.OK, tycVar);
        tycVar.o0(this.b);
    }

    public n3d0() {
        this.i = (byte) -1;
        this.j = -1;
        this.b = pg9.f26941a;
    }

    public n3d0(l3d0 l3d0Var) {
        super(l3d0Var);
        this.i = (byte) -1;
        this.j = -1;
        this.b = l3d0Var.f994a;
    }
}
