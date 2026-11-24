package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ufy extends ljt {
    public static final ufy g;
    public static final sfy h = new sfy((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f35597a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public int f;

    static {
        ufy ufyVar = new ufy();
        g = ufyVar;
        ufyVar.c = 0;
        ufyVar.d = 0;
    }

    public ufy(pyc pycVar) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = 0;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.b |= 1;
                            this.c = pycVar.k();
                        } else if (iN == 16) {
                            this.b |= 2;
                            this.d = pycVar.k();
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
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.f35597a = ng9Var.d();
                }
                throw th;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f35597a = ng9Var.d();
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
        if ((this.b & 2) == 2) {
            iN += tyc.n(2, this.d);
        }
        int size = this.f35597a.size() + iN;
        this.f = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return new tfy((byte) 0);
    }

    @Override // a.z3
    public final ajt f() {
        tfy tfyVar = new tfy((byte) 0);
        tfyVar.h(this);
        return tfyVar;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.j0(1, this.c);
        }
        if ((this.b & 2) == 2) {
            tycVar.j0(2, this.d);
        }
        tycVar.o0(this.f35597a);
    }

    public ufy() {
        this.e = (byte) -1;
        this.f = -1;
        this.f35597a = pg9.f26941a;
    }

    public ufy(tfy tfyVar) {
        this.e = (byte) -1;
        this.f = -1;
        this.f35597a = tfyVar.f994a;
    }
}
