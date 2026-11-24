package a;

import android.javax.sip.message.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a4d0 extends gjt {
    public static final a4d0 u;
    public static final sfy v = new sfy((byte) 22);
    public final pg9 b;
    public int c;
    public List d;
    public boolean e;
    public int f;
    public a4d0 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public a4d0 m;
    public int n;
    public a4d0 o;
    public int p;
    public int q;
    public List r;
    public byte s;
    public int t;

    static {
        a4d0 a4d0Var = new a4d0();
        u = a4d0Var;
        a4d0Var.s();
    }

    public a4d0(pyc pycVar, sso ssoVar) {
        this.s = (byte) -1;
        this.t = -1;
        s();
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    sfy sfyVar = v;
                    z3d0 z3d0VarT = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.c |= 4096;
                            this.q = pycVar.k();
                            continue;
                        case 18:
                            if ((i & 1) != 1) {
                                this.d = new ArrayList();
                                i |= 1;
                            }
                            this.d.add(pycVar.g(y3d0.i, ssoVar));
                            continue;
                        case 24:
                            this.c |= 1;
                            this.e = pycVar.l() != 0;
                            continue;
                        case 32:
                            this.c |= 2;
                            this.f = pycVar.k();
                            continue;
                        case 42:
                            if ((this.c & 4) == 4) {
                                a4d0 a4d0Var = this.g;
                                a4d0Var.getClass();
                                z3d0VarT = t(a4d0Var);
                            }
                            a4d0 a4d0Var2 = (a4d0) pycVar.g(sfyVar, ssoVar);
                            this.g = a4d0Var2;
                            if (z3d0VarT != null) {
                                z3d0VarT.i(a4d0Var2);
                                this.g = z3d0VarT.g();
                            }
                            this.c |= 4;
                            continue;
                        case 48:
                            this.c |= 16;
                            this.i = pycVar.k();
                            continue;
                        case 56:
                            this.c |= 32;
                            this.j = pycVar.k();
                            continue;
                        case 64:
                            this.c |= 8;
                            this.h = pycVar.k();
                            continue;
                        case 72:
                            this.c |= 64;
                            this.k = pycVar.k();
                            continue;
                        case 82:
                            if ((this.c & 256) == 256) {
                                a4d0 a4d0Var3 = this.m;
                                a4d0Var3.getClass();
                                z3d0VarT = t(a4d0Var3);
                            }
                            a4d0 a4d0Var4 = (a4d0) pycVar.g(sfyVar, ssoVar);
                            this.m = a4d0Var4;
                            if (z3d0VarT != null) {
                                z3d0VarT.i(a4d0Var4);
                                this.m = z3d0VarT.g();
                            }
                            this.c |= 256;
                            continue;
                        case 88:
                            this.c |= 512;
                            this.n = pycVar.k();
                            continue;
                        case 96:
                            this.c |= 128;
                            this.l = pycVar.k();
                            continue;
                        case 106:
                            if ((this.c & 1024) == 1024) {
                                a4d0 a4d0Var5 = this.o;
                                a4d0Var5.getClass();
                                z3d0VarT = t(a4d0Var5);
                            }
                            a4d0 a4d0Var6 = (a4d0) pycVar.g(sfyVar, ssoVar);
                            this.o = a4d0Var6;
                            if (z3d0VarT != null) {
                                z3d0VarT.i(a4d0Var6);
                                this.o = z3d0VarT.g();
                            }
                            this.c |= 1024;
                            continue;
                        case 112:
                            this.c |= 2048;
                            this.p = pycVar.k();
                            continue;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.r = new ArrayList();
                                i |= 16384;
                            }
                            this.r.add(pycVar.g(p2d0.h, ssoVar));
                            continue;
                        default:
                            if (!o(pycVar, tycVarM, ssoVar, iN)) {
                                break;
                            }
                            break;
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
                if ((i & 1) == 1) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                if ((i & 16384) == 16384) {
                    this.r = Collections.unmodifiableList(this.r);
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
        }
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
        }
        if ((i & 16384) == 16384) {
            this.r = Collections.unmodifiableList(this.r);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.b = ng9Var.d();
        }
        n();
    }

    public static z3d0 t(a4d0 a4d0Var) {
        z3d0 z3d0VarH = z3d0.h();
        z3d0VarH.i(a4d0Var);
        return z3d0VarH;
    }

    @Override // a.e540
    public final z3 a() {
        return u;
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((y3d0) this.d.get(i)).b()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if ((this.c & 4) == 4 && !this.g.b()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.c & 256) == 256 && !this.m.b()) {
            this.s = (byte) 0;
            return false;
        }
        if ((this.c & 1024) == 1024 && !this.o.b()) {
            this.s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (!((p2d0) this.r.get(i2)).b()) {
                this.s = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.s = (byte) 1;
            return true;
        }
        this.s = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i = this.t;
        if (i != -1) {
            return i;
        }
        int iN = (this.c & 4096) == 4096 ? tyc.n(1, this.q) : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iN += tyc.p(2, (z3) this.d.get(i2));
        }
        if ((this.c & 1) == 1) {
            iN += tyc.t(3) + 1;
        }
        if ((this.c & 2) == 2) {
            iN += tyc.n(4, this.f);
        }
        if ((this.c & 4) == 4) {
            iN += tyc.p(5, this.g);
        }
        if ((this.c & 16) == 16) {
            iN += tyc.n(6, this.i);
        }
        if ((this.c & 32) == 32) {
            iN += tyc.n(7, this.j);
        }
        if ((this.c & 8) == 8) {
            iN += tyc.n(8, this.h);
        }
        if ((this.c & 64) == 64) {
            iN += tyc.n(9, this.k);
        }
        if ((this.c & 256) == 256) {
            iN += tyc.p(10, this.m);
        }
        if ((this.c & 512) == 512) {
            iN += tyc.n(11, this.n);
        }
        if ((this.c & 128) == 128) {
            iN += tyc.n(12, this.l);
        }
        if ((this.c & 1024) == 1024) {
            iN += tyc.p(13, this.o);
        }
        if ((this.c & 2048) == 2048) {
            iN += tyc.n(14, this.p);
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            iN += tyc.p(100, (z3) this.r.get(i3));
        }
        int size = this.b.size() + k() + iN;
        this.t = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return z3d0.h();
    }

    @Override // a.z3
    public final ajt f() {
        return t(this);
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 4096) == 4096) {
            tycVar.j0(1, this.q);
        }
        for (int i = 0; i < this.d.size(); i++) {
            tycVar.l0(2, (z3) this.d.get(i));
        }
        if ((this.c & 1) == 1) {
            boolean z = this.e;
            tycVar.u0(3, 0);
            tycVar.n0(z ? 1 : 0);
        }
        if ((this.c & 2) == 2) {
            tycVar.j0(4, this.f);
        }
        if ((this.c & 4) == 4) {
            tycVar.l0(5, this.g);
        }
        if ((this.c & 16) == 16) {
            tycVar.j0(6, this.i);
        }
        if ((this.c & 32) == 32) {
            tycVar.j0(7, this.j);
        }
        if ((this.c & 8) == 8) {
            tycVar.j0(8, this.h);
        }
        if ((this.c & 64) == 64) {
            tycVar.j0(9, this.k);
        }
        if ((this.c & 256) == 256) {
            tycVar.l0(10, this.m);
        }
        if ((this.c & 512) == 512) {
            tycVar.j0(11, this.n);
        }
        if ((this.c & 128) == 128) {
            tycVar.j0(12, this.l);
        }
        if ((this.c & 1024) == 1024) {
            tycVar.l0(13, this.o);
        }
        if ((this.c & 2048) == 2048) {
            tycVar.j0(14, this.p);
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            tycVar.l0(100, (z3) this.r.get(i2));
        }
        wtiVar.E(Response.OK, tycVar);
        tycVar.o0(this.b);
    }

    public final boolean r() {
        return (this.c & 16) == 16;
    }

    public final void s() {
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = false;
        this.f = 0;
        a4d0 a4d0Var = u;
        this.g = a4d0Var;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = a4d0Var;
        this.n = 0;
        this.o = a4d0Var;
        this.p = 0;
        this.q = 0;
        this.r = list;
    }

    public a4d0() {
        this.s = (byte) -1;
        this.t = -1;
        this.b = pg9.f26941a;
    }

    public a4d0(z3d0 z3d0Var) {
        super(z3d0Var);
        this.s = (byte) -1;
        this.t = -1;
        this.b = z3d0Var.f994a;
    }
}
