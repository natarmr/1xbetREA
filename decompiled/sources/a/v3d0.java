package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class v3d0 extends ljt {
    public static final v3d0 e;
    public static final sfy f = new sfy((byte) 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f36727a;
    public tez b;
    public byte c;
    public int d;

    static {
        v3d0 v3d0Var = new v3d0();
        e = v3d0Var;
        v3d0Var.b = pez.b;
    }

    public v3d0(pyc pycVar) {
        this.c = (byte) -1;
        this.d = -1;
        this.b = pez.b;
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
                            nh00 nh00VarF = pycVar.f();
                            if (!z2) {
                                this.b = new pez();
                                z2 = true;
                            }
                            this.b.j0(nh00VarF);
                        } else if (!pycVar.q(iN, tycVarM)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.b = this.b.d();
                    }
                    try {
                        tycVarM.c0();
                    } catch (IOException unused) {
                    } finally {
                        this.f36727a = ng9Var.d();
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
            this.b = this.b.d();
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f36727a = ng9Var.d();
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
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.b.size();
            tez tezVar = this.b;
            if (i2 >= size2) {
                int size3 = this.f36727a.size() + tezVar.size() + size;
                this.d = size3;
                return size3;
            }
            pg9 pg9VarA0 = tezVar.a0(i2);
            size += pg9VarA0.size() + tyc.r(pg9VarA0.size());
            i2++;
        }
    }

    @Override // a.z3
    public final ajt e() {
        w2d0 w2d0Var = new w2d0((byte) 3);
        w2d0Var.d = pez.b;
        return w2d0Var;
    }

    @Override // a.z3
    public final ajt f() {
        w2d0 w2d0Var = new w2d0((byte) 3);
        w2d0Var.d = pez.b;
        w2d0Var.n(this);
        return w2d0Var;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        for (int i = 0; i < this.b.size(); i++) {
            pg9 pg9VarA0 = this.b.a0(i);
            tycVar.u0(1, 2);
            tycVar.s0(pg9VarA0.size());
            tycVar.o0(pg9VarA0);
        }
        tycVar.o0(this.f36727a);
    }

    public v3d0() {
        this.c = (byte) -1;
        this.d = -1;
        this.f36727a = pg9.f26941a;
    }

    public v3d0(w2d0 w2d0Var) {
        this.c = (byte) -1;
        this.d = -1;
        this.f36727a = w2d0Var.f994a;
    }
}
