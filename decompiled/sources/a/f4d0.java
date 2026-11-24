package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f4d0 extends gjt {
    public static final f4d0 n;
    public static final sfy o = new sfy((byte) 25);
    public final pg9 b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public e4d0 g;
    public List h;
    public List i;
    public int j;
    public List k;
    public byte l;
    public int m;

    static {
        f4d0 f4d0Var = new f4d0();
        n = f4d0Var;
        f4d0Var.d = 0;
        f4d0Var.e = 0;
        f4d0Var.f = false;
        f4d0Var.g = e4d0.INV;
        List list = Collections.EMPTY_LIST;
        f4d0Var.h = list;
        f4d0Var.i = list;
        f4d0Var.k = list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public f4d0(pyc pycVar, sso ssoVar) {
        this.j = -1;
        this.l = (byte) -1;
        this.m = -1;
        this.d = 0;
        this.e = 0;
        this.f = false;
        e4d0 e4d0Var = e4d0.INV;
        this.g = e4d0Var;
        List list = Collections.EMPTY_LIST;
        this.h = list;
        this.i = list;
        this.k = list;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN == 0) {
                        z = true;
                    } else if (iN == 8) {
                        this.c |= 1;
                        this.d = pycVar.k();
                    } else if (iN == 16) {
                        this.c |= 2;
                        this.e = pycVar.k();
                    } else if (iN == 24) {
                        this.c |= 4;
                        this.f = pycVar.l() != 0;
                    } else if (iN == 32) {
                        int iK = pycVar.k();
                        e4d0 e4d0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : e4d0Var : e4d0.OUT : e4d0.IN;
                        if (e4d0Var2 == null) {
                            tycVarM.s0(iN);
                            tycVarM.s0(iK);
                        } else {
                            this.c |= 8;
                            this.g = e4d0Var2;
                        }
                    } else if (iN == 42) {
                        if ((i & 16) != 16) {
                            this.h = new ArrayList();
                            i |= 16;
                        }
                        this.h.add(pycVar.g(a4d0.v, ssoVar));
                    } else if (iN == 48) {
                        if ((i & 32) != 32) {
                            this.i = new ArrayList();
                            i |= 32;
                        }
                        this.i.add(Integer.valueOf(pycVar.k()));
                    } else if (iN == 50) {
                        int iE = pycVar.e(pycVar.k());
                        if ((i & 32) != 32 && pycVar.c() > 0) {
                            this.i = new ArrayList();
                            i |= 32;
                        }
                        while (pycVar.c() > 0) {
                            this.i.add(Integer.valueOf(pycVar.k()));
                        }
                        pycVar.d(iE);
                    } else if (iN == 802) {
                        if ((i & 64) != 64) {
                            this.k = new ArrayList();
                            i |= 64;
                        }
                        this.k.add(pycVar.g(p2d0.h, ssoVar));
                    } else if (!o(pycVar, tycVarM, ssoVar, iN)) {
                        z = true;
                    }
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 64) == 64) {
                        this.k = Collections.unmodifiableList(this.k);
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
        if ((i & 16) == 16) {
            this.h = Collections.unmodifiableList(this.h);
        }
        if ((i & 32) == 32) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if ((i & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
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
        if ((i & 1) != 1) {
            this.l = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((a4d0) this.h.get(i2)).b()) {
                this.l = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            if (!((p2d0) this.k.get(i3)).b()) {
                this.l = (byte) 0;
                return false;
            }
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
        List list;
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 1) == 1 ? tyc.n(1, this.d) : 0;
        if ((this.c & 2) == 2) {
            iN += tyc.n(2, this.e);
        }
        if ((this.c & 4) == 4) {
            iN += tyc.t(3) + 1;
        }
        if ((this.c & 8) == 8) {
            iN += tyc.m(4, this.g.f7177a);
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iN += tyc.p(5, (z3) this.h.get(i2));
        }
        int i3 = 0;
        int iO = 0;
        while (true) {
            int size = this.i.size();
            list = this.i;
            if (i3 >= size) {
                break;
            }
            iO += tyc.o(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int iP = iN + iO;
        if (!list.isEmpty()) {
            iP = iP + 1 + tyc.o(iO);
        }
        this.j = iO;
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            iP += tyc.p(100, (z3) this.k.get(i4));
        }
        int size2 = this.b.size() + k() + iP;
        this.m = size2;
        return size2;
    }

    @Override // a.z3
    public final ajt e() {
        return d4d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        d4d0 d4d0VarH = d4d0.h();
        d4d0VarH.i(this);
        return d4d0VarH;
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
            boolean z = this.f;
            tycVar.u0(3, 0);
            tycVar.n0(z ? 1 : 0);
        }
        if ((this.c & 8) == 8) {
            tycVar.i0(4, this.g.f7177a);
        }
        for (int i = 0; i < this.h.size(); i++) {
            tycVar.l0(5, (z3) this.h.get(i));
        }
        if (this.i.size() > 0) {
            tycVar.s0(50);
            tycVar.s0(this.j);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            tycVar.k0(((Integer) this.i.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            tycVar.l0(100, (z3) this.k.get(i3));
        }
        wtiVar.E(1000, tycVar);
        tycVar.o0(this.b);
    }

    public f4d0() {
        this.j = -1;
        this.l = (byte) -1;
        this.m = -1;
        this.b = pg9.f26941a;
    }

    public f4d0(d4d0 d4d0Var) {
        super(d4d0Var);
        this.j = -1;
        this.l = (byte) -1;
        this.m = -1;
        this.b = d4d0Var.f994a;
    }
}
