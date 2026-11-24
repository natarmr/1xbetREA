package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class t2d0 extends ljt {
    public static final t2d0 g;
    public static final sfy h = new sfy((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f33209a;
    public int b;
    public int c;
    public nh00 d;
    public byte e;
    public int f;

    static {
        t2d0 t2d0Var = new t2d0();
        g = t2d0Var;
        t2d0Var.c = 0;
        t2d0Var.d = pg9.f26941a;
    }

    public t2d0(pyc pycVar) {
        this.e = (byte) -1;
        this.f = -1;
        boolean z = false;
        this.c = 0;
        this.d = pg9.f26941a;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = pycVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.b |= 1;
                                this.c = pycVar.k();
                            } else if (iN == 18) {
                                this.b |= 2;
                                this.d = pycVar.f();
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
                try {
                    tycVarM.c0();
                } catch (IOException unused) {
                } finally {
                    this.f33209a = ng9Var.d();
                }
                throw th;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f33209a = ng9Var.d();
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
        int i = this.b;
        if ((i & 1) != 1) {
            this.e = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.e = (byte) 1;
            return true;
        }
        this.e = (byte) 0;
        return false;
    }

    @Override // a.z3
    public final int d() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            nh00 nh00Var = this.d;
            iN += nh00Var.size() + tyc.r(nh00Var.size()) + tyc.t(2);
        }
        int size = this.f33209a.size() + iN;
        this.f = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        j2d0 j2d0Var = new j2d0((byte) 1);
        j2d0Var.e = pg9.f26941a;
        return j2d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        j2d0 j2d0Var = new j2d0((byte) 1);
        j2d0Var.e = pg9.f26941a;
        j2d0Var.i(this);
        return j2d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.j0(1, this.c);
        }
        if ((this.b & 2) == 2) {
            nh00 nh00Var = this.d;
            tycVar.u0(2, 2);
            tycVar.s0(nh00Var.size());
            tycVar.o0(nh00Var);
        }
        tycVar.o0(this.f33209a);
    }

    public t2d0() {
        this.e = (byte) -1;
        this.f = -1;
        this.f33209a = pg9.f26941a;
    }

    public t2d0(j2d0 j2d0Var) {
        this.e = (byte) -1;
        this.f = -1;
        this.f33209a = j2d0Var.f994a;
    }
}
