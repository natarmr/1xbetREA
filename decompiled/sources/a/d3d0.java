package a;

import android.javax.sip.message.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d3d0 extends gjt {
    public static final d3d0 h;
    public static final sfy i = new sfy((byte) 13);
    public final pg9 b;
    public int c;
    public int d;
    public List e;
    public byte f;
    public int g;

    static {
        d3d0 d3d0Var = new d3d0();
        h = d3d0Var;
        d3d0Var.d = 0;
        d3d0Var.e = Collections.EMPTY_LIST;
    }

    public d3d0(pyc pycVar, sso ssoVar) {
        this.f = (byte) -1;
        this.g = -1;
        boolean z = false;
        this.d = 0;
        this.e = Collections.EMPTY_LIST;
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
                        } else if (iN == 18) {
                            if ((c & 2) != 2) {
                                this.e = new ArrayList();
                                c = 2;
                            }
                            this.e.add(pycVar.g(p2d0.h, ssoVar));
                        } else if (!o(pycVar, tycVarM, ssoVar, iN)) {
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
                    this.e = Collections.unmodifiableList(this.e);
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
        if ((c & 2) == 2) {
            this.e = Collections.unmodifiableList(this.e);
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
        return h;
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            if (!((p2d0) this.e.get(i2)).b()) {
                this.f = (byte) 0;
                return false;
            }
        }
        if (j()) {
            this.f = (byte) 1;
            return true;
        }
        this.f = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int iN = (this.c & 1) == 1 ? tyc.n(1, this.d) : 0;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            iN += tyc.p(2, (z3) this.e.get(i3));
        }
        int size = this.b.size() + k() + iN;
        this.g = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        c3d0 c3d0Var = new c3d0();
        c3d0Var.f = Collections.EMPTY_LIST;
        return c3d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        c3d0 c3d0Var = new c3d0();
        c3d0Var.f = Collections.EMPTY_LIST;
        c3d0Var.h(this);
        return c3d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        wti wtiVar = new wti(this);
        if ((this.c & 1) == 1) {
            tycVar.j0(1, this.d);
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            tycVar.l0(2, (z3) this.e.get(i2));
        }
        wtiVar.E(Response.OK, tycVar);
        tycVar.o0(this.b);
    }

    public d3d0() {
        this.f = (byte) -1;
        this.g = -1;
        this.b = pg9.f26941a;
    }

    public d3d0(c3d0 c3d0Var) {
        super(c3d0Var);
        this.f = (byte) -1;
        this.g = -1;
        this.b = c3d0Var.f994a;
    }
}
