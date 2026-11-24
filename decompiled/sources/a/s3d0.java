package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s3d0 extends ljt {
    public static final s3d0 h;
    public static final sfy i = new sfy((byte) 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f31553a;
    public int b;
    public int c;
    public int d;
    public r3d0 e;
    public byte f;
    public int g;

    static {
        s3d0 s3d0Var = new s3d0();
        h = s3d0Var;
        s3d0Var.c = -1;
        s3d0Var.d = 0;
        s3d0Var.e = r3d0.PACKAGE;
    }

    public s3d0(pyc pycVar) {
        this.f = (byte) -1;
        this.g = -1;
        this.c = -1;
        boolean z = false;
        this.d = 0;
        r3d0 r3d0Var = r3d0.PACKAGE;
        this.e = r3d0Var;
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
                        } else if (iN == 24) {
                            int iK = pycVar.k();
                            r3d0 r3d0Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : r3d0.LOCAL : r3d0Var : r3d0.CLASS;
                            if (r3d0Var2 == null) {
                                tycVarM.s0(iN);
                                tycVarM.s0(iK);
                            } else {
                                this.b |= 4;
                                this.e = r3d0Var2;
                            }
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
                    this.f31553a = ng9Var.d();
                }
                throw th;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f31553a = ng9Var.d();
        }
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
        if ((this.b & 2) == 2) {
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
        int iN = (this.b & 1) == 1 ? tyc.n(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iN += tyc.n(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iN += tyc.m(3, this.e.f29781a);
        }
        int size = this.f31553a.size() + iN;
        this.g = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        q3d0 q3d0Var = new q3d0();
        q3d0Var.c = -1;
        q3d0Var.e = r3d0.PACKAGE;
        return q3d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        q3d0 q3d0Var = new q3d0();
        q3d0Var.c = -1;
        q3d0Var.e = r3d0.PACKAGE;
        q3d0Var.g(this);
        return q3d0Var;
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
        if ((this.b & 4) == 4) {
            tycVar.i0(3, this.e.f29781a);
        }
        tycVar.o0(this.f31553a);
    }

    public s3d0() {
        this.f = (byte) -1;
        this.g = -1;
        this.f31553a = pg9.f26941a;
    }

    public s3d0(q3d0 q3d0Var) {
        this.f = (byte) -1;
        this.g = -1;
        this.f31553a = q3d0Var.f994a;
    }
}
