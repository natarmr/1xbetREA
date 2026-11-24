package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g4d0 extends ljt {
    public static final g4d0 g;
    public static final sfy h = new sfy((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f10661a;
    public int b;
    public List c;
    public int d;
    public byte e;
    public int f;

    static {
        g4d0 g4d0Var = new g4d0();
        g = g4d0Var;
        g4d0Var.c = Collections.EMPTY_LIST;
        g4d0Var.d = -1;
    }

    public g4d0(pyc pycVar, sso ssoVar) {
        this.e = (byte) -1;
        this.f = -1;
        this.c = Collections.EMPTY_LIST;
        this.d = -1;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = pycVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.c = new ArrayList();
                                    z2 = true;
                                }
                                this.c.add(pycVar.g(a4d0.v, ssoVar));
                            } else if (iN == 16) {
                                this.b |= 1;
                                this.d = pycVar.k();
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
                if (z2) {
                    this.c = Collections.unmodifiableList(this.c);
                }
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.f10661a = ng9Var.d();
                }
                throw th;
            }
        }
        if (z2) {
            this.c = Collections.unmodifiableList(this.c);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f10661a = ng9Var.d();
        }
    }

    public static o2d0 j(g4d0 g4d0Var) {
        o2d0 o2d0Var = new o2d0((byte) 1);
        o2d0Var.d = Collections.EMPTY_LIST;
        o2d0Var.e = -1;
        o2d0Var.i(g4d0Var);
        return o2d0Var;
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
        for (int i = 0; i < this.c.size(); i++) {
            if (!((a4d0) this.c.get(i)).b()) {
                this.e = (byte) 0;
                return false;
            }
        }
        this.e = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iN = 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            iN += tyc.p(1, (z3) this.c.get(i2));
        }
        if ((this.b & 1) == 1) {
            iN += tyc.n(2, this.d);
        }
        int size = this.f10661a.size() + iN;
        this.f = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        o2d0 o2d0Var = new o2d0((byte) 1);
        o2d0Var.d = Collections.EMPTY_LIST;
        o2d0Var.e = -1;
        return o2d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        return j(this);
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        for (int i = 0; i < this.c.size(); i++) {
            tycVar.l0(1, (z3) this.c.get(i));
        }
        if ((this.b & 1) == 1) {
            tycVar.j0(2, this.d);
        }
        tycVar.o0(this.f10661a);
    }

    public g4d0() {
        this.e = (byte) -1;
        this.f = -1;
        this.f10661a = pg9.f26941a;
    }

    public g4d0(o2d0 o2d0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.f10661a = o2d0Var.f994a;
    }
}
