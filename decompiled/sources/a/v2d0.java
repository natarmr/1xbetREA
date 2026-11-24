package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v2d0 extends gjt {
    public static final v2d0 k;
    public static final sfy l = new sfy((byte) 10);
    public final pg9 b;
    public int c;
    public int d;
    public List e;
    public List f;
    public List g;
    public List h;
    public byte i;
    public int j;

    static {
        v2d0 v2d0Var = new v2d0();
        k = v2d0Var;
        v2d0Var.d = 6;
        List list = Collections.EMPTY_LIST;
        v2d0Var.e = list;
        v2d0Var.f = list;
        v2d0Var.g = list;
        v2d0Var.h = list;
    }

    public v2d0(pyc pycVar, sso ssoVar) {
        this.i = (byte) -1;
        this.j = -1;
        this.d = 6;
        List list = Collections.EMPTY_LIST;
        this.e = list;
        this.f = list;
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
                        if (iN == 8) {
                            this.c |= 1;
                            this.d = pycVar.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.e = new ArrayList();
                                i |= 2;
                            }
                            this.e.add(pycVar.g(i4d0.o, ssoVar));
                        } else if (iN == 26) {
                            if ((i & 16) != 16) {
                                this.h = new ArrayList();
                                i |= 16;
                            }
                            this.h.add(pycVar.g(p2d0.h, ssoVar));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.f = new ArrayList();
                                i |= 4;
                            }
                            this.f.add(Integer.valueOf(pycVar.k()));
                        } else if (iN == 250) {
                            int iE = pycVar.e(pycVar.k());
                            if ((i & 4) != 4 && pycVar.c() > 0) {
                                this.f = new ArrayList();
                                i |= 4;
                            }
                            while (pycVar.c() > 0) {
                                this.f.add(Integer.valueOf(pycVar.k()));
                            }
                            pycVar.d(iE);
                        } else if (iN == 258) {
                            if ((i & 8) != 8) {
                                this.g = new ArrayList();
                                i |= 8;
                            }
                            this.g.add(pycVar.g(t2d0.h, ssoVar));
                        } else if (!o(pycVar, tycVarM, ssoVar, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if ((i & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if ((i & 8) == 8) {
                        this.g = Collections.unmodifiableList(this.g);
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
        if ((i & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
        }
        if ((i & 16) == 16) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 4) == 4) {
            this.f = Collections.unmodifiableList(this.f);
        }
        if ((i & 8) == 8) {
            this.g = Collections.unmodifiableList(this.g);
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
        for (int i = 0; i < this.e.size(); i++) {
            if (!((i4d0) this.e.get(i)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (!((t2d0) this.g.get(i2)).b()) {
                this.i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            if (!((p2d0) this.h.get(i3)).b()) {
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
        List list;
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 1) == 1 ? tyc.n(1, this.d) : 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            iN += tyc.p(2, (z3) this.e.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            iN += tyc.p(3, (z3) this.h.get(i3));
        }
        int i4 = 0;
        int iO = 0;
        while (true) {
            int size = this.f.size();
            list = this.f;
            if (i4 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iN + iO;
        for (int i5 = 0; i5 < this.g.size(); i5++) {
            size2 += tyc.p(32, (z3) this.g.get(i5));
        }
        int size3 = this.b.size() + k() + size2;
        this.j = size3;
        return size3;
    }

    @Override // a.z3
    public final ajt e() {
        return u2d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        u2d0 u2d0VarH = u2d0.h();
        u2d0VarH.i(this);
        return u2d0VarH;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 1) == 1) {
            tycVar.j0(1, this.d);
        }
        for (int i = 0; i < this.e.size(); i++) {
            tycVar.l0(2, (z3) this.e.get(i));
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            tycVar.l0(3, (z3) this.h.get(i2));
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            tycVar.j0(31, ((Integer) this.f.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            tycVar.l0(32, (z3) this.g.get(i4));
        }
        wtiVar.E(19000, tycVar);
        tycVar.o0(this.b);
    }

    public v2d0() {
        this.i = (byte) -1;
        this.j = -1;
        this.b = pg9.f26941a;
    }

    public v2d0(u2d0 u2d0Var) {
        super(u2d0Var);
        this.i = (byte) -1;
        this.j = -1;
        this.b = u2d0Var.f994a;
    }
}
