package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p2d0 extends ljt {
    public static final p2d0 g;
    public static final sfy h = new sfy((byte) 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f26244a;
    public int b;
    public int c;
    public List d;
    public byte e;
    public int f;

    static {
        p2d0 p2d0Var = new p2d0();
        g = p2d0Var;
        p2d0Var.c = 0;
        p2d0Var.d = Collections.EMPTY_LIST;
    }

    public p2d0(pyc pycVar, sso ssoVar) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = Collections.EMPTY_LIST;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = pycVar.k();
                        } else if (iN == 18) {
                            if ((c & 2) != 2) {
                                this.d = new ArrayList();
                                c = 2;
                            }
                            this.d.add(pycVar.g(n2d0.h, ssoVar));
                        } else if (!pycVar.q(iN, tycVarM)) {
                        }
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
                if ((c & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                }
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.f26244a = ng9Var.d();
                }
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f26244a = ng9Var.d();
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
        if ((this.b & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!((n2d0) this.d.get(i)).b()) {
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
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            iN += tyc.p(2, (z3) this.d.get(i2));
        }
        int size = this.f26244a.size() + iN;
        this.f = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        o2d0 o2d0Var = new o2d0((byte) 0);
        o2d0Var.d = Collections.EMPTY_LIST;
        return o2d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        o2d0 o2d0Var = new o2d0((byte) 0);
        o2d0Var.d = Collections.EMPTY_LIST;
        o2d0Var.h(this);
        return o2d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.j0(1, this.c);
        }
        for (int i = 0; i < this.d.size(); i++) {
            tycVar.l0(2, (z3) this.d.get(i));
        }
        tycVar.o0(this.f26244a);
    }

    public p2d0() {
        this.e = (byte) -1;
        this.f = -1;
        this.f26244a = pg9.f26941a;
    }

    public p2d0(o2d0 o2d0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.f26244a = o2d0Var.f994a;
    }
}
