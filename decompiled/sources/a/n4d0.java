package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n4d0 extends ljt {
    public static final n4d0 e;
    public static final sfy f = new sfy((byte) 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f22893a;
    public List b;
    public byte c;
    public int d;

    static {
        n4d0 n4d0Var = new n4d0();
        e = n4d0Var;
        n4d0Var.b = Collections.EMPTY_LIST;
    }

    public n4d0(pyc pycVar, sso ssoVar) {
        this.c = (byte) -1;
        this.d = -1;
        this.b = Collections.EMPTY_LIST;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z2) {
                                this.b = new ArrayList();
                                z2 = true;
                            }
                            this.b.add(pycVar.g(m4d0.l, ssoVar));
                        } else if (!pycVar.q(iN, tycVarM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.b = Collections.unmodifiableList(this.b);
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f22893a = ng9Var.d();
                    }
                    throw th;
                }
            } catch (aox e2) {
                e2.f1223a = this;
                throw e2;
            } catch (IOException e3) {
                aox aoxVar = new aox(e3.getMessage());
                aoxVar.f1223a = this;
                throw aoxVar;
            }
        }
        if (z2) {
            this.b = Collections.unmodifiableList(this.b);
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f22893a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.c;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.c = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iP = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            iP += tyc.p(1, (z3) this.b.get(i2));
        }
        int size = this.f22893a.size() + iP;
        this.d = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        w2d0 w2d0Var = new w2d0((byte) 2);
        w2d0Var.d = Collections.EMPTY_LIST;
        return w2d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        w2d0 w2d0Var = new w2d0((byte) 2);
        w2d0Var.d = Collections.EMPTY_LIST;
        w2d0Var.o(this);
        return w2d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        for (int i = 0; i < this.b.size(); i++) {
            tycVar.l0(1, (z3) this.b.get(i));
        }
        tycVar.o0(this.f22893a);
    }

    public n4d0() {
        this.c = (byte) -1;
        this.d = -1;
        this.f22893a = pg9.f26941a;
    }

    public n4d0(w2d0 w2d0Var) {
        this.c = (byte) -1;
        this.d = -1;
        this.f22893a = w2d0Var.f994a;
    }
}
