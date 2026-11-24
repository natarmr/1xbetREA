package a;

import android.javax.sip.message.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m3d0 extends gjt {
    public static final m3d0 k;
    public static final sfy l = new sfy((byte) 16);
    public final pg9 b;
    public int c;
    public List d;
    public List e;
    public List f;
    public g4d0 g;
    public n4d0 h;
    public byte i;
    public int j;

    static {
        m3d0 m3d0Var = new m3d0();
        k = m3d0Var;
        List list = Collections.EMPTY_LIST;
        m3d0Var.d = list;
        m3d0Var.e = list;
        m3d0Var.f = list;
        m3d0Var.g = g4d0.g;
        m3d0Var.h = n4d0.e;
    }

    public m3d0(pyc pycVar, sso ssoVar) {
        this.i = (byte) -1;
        this.j = -1;
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
        this.f = list;
        this.g = g4d0.g;
        this.h = n4d0.e;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            byte b = 2;
            if (z) {
                break;
            }
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.d = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.d.add(pycVar.g(i3d0.z, ssoVar));
                        } else if (iN == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.e = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.e.add(pycVar.g(p3d0.g1, ssoVar));
                        } else if (iN != 42) {
                            w2d0 w2d0Var = null;
                            o2d0 o2d0VarJ = null;
                            if (iN == 242) {
                                if ((this.c & 1) == 1) {
                                    g4d0 g4d0Var = this.g;
                                    g4d0Var.getClass();
                                    o2d0VarJ = g4d0.j(g4d0Var);
                                }
                                g4d0 g4d0Var2 = (g4d0) pycVar.g(g4d0.h, ssoVar);
                                this.g = g4d0Var2;
                                if (o2d0VarJ != null) {
                                    o2d0VarJ.i(g4d0Var2);
                                    this.g = o2d0VarJ.g();
                                }
                                this.c |= 1;
                            } else if (iN == 258) {
                                if ((this.c & 2) == 2) {
                                    n4d0 n4d0Var = this.h;
                                    n4d0Var.getClass();
                                    w2d0Var = new w2d0(b);
                                    w2d0Var.d = Collections.EMPTY_LIST;
                                    w2d0Var.o(n4d0Var);
                                }
                                n4d0 n4d0Var2 = (n4d0) pycVar.g(n4d0.f, ssoVar);
                                this.h = n4d0Var2;
                                if (w2d0Var != null) {
                                    w2d0Var.o(n4d0Var2);
                                    this.h = w2d0Var.i();
                                }
                                this.c |= 2;
                            } else if (!o(pycVar, tycVarM, ssoVar, iN)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.f = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.f.add(pycVar.g(c4d0.q, ssoVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) == 1) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    if (((i == true ? 1 : 0) & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if (((i == true ? 1 : 0) & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
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
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
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
        for (int i = 0; i < this.d.size(); i++) {
            if (!((i3d0) this.d.get(i)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!((p3d0) this.e.get(i2)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            if (!((c4d0) this.f.get(i3)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        if ((this.c & 1) == 1 && !this.g.b()) {
            this.i = (byte) 0;
            return false;
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
        int iP = 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iP += tyc.p(3, (z3) this.d.get(i2));
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            iP += tyc.p(4, (z3) this.e.get(i3));
        }
        for (int i4 = 0; i4 < this.f.size(); i4++) {
            iP += tyc.p(5, (z3) this.f.get(i4));
        }
        if ((this.c & 1) == 1) {
            iP += tyc.p(30, this.g);
        }
        if ((this.c & 2) == 2) {
            iP += tyc.p(32, this.h);
        }
        int size = this.b.size() + k() + iP;
        this.j = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return l3d0.i();
    }

    @Override // a.z3
    public final ajt f() {
        l3d0 l3d0VarI = l3d0.i();
        l3d0VarI.m(this);
        return l3d0VarI;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        for (int i = 0; i < this.d.size(); i++) {
            tycVar.l0(3, (z3) this.d.get(i));
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            tycVar.l0(4, (z3) this.e.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            tycVar.l0(5, (z3) this.f.get(i3));
        }
        if ((this.c & 1) == 1) {
            tycVar.l0(30, this.g);
        }
        if ((this.c & 2) == 2) {
            tycVar.l0(32, this.h);
        }
        wtiVar.E(Response.OK, tycVar);
        tycVar.o0(this.b);
    }

    public m3d0() {
        this.i = (byte) -1;
        this.j = -1;
        this.b = pg9.f26941a;
    }

    public m3d0(l3d0 l3d0Var) {
        super(l3d0Var);
        this.i = (byte) -1;
        this.j = -1;
        this.b = l3d0Var.f994a;
    }
}
