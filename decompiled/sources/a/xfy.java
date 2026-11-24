package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xfy extends ljt {
    public static final xfy j;
    public static final sfy k = new sfy((byte) 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg9 f40815a;
    public int b;
    public ufy c;
    public vfy d;
    public vfy e;
    public vfy f;
    public vfy g;
    public byte h;
    public int i;

    static {
        xfy xfyVar = new xfy();
        j = xfyVar;
        xfyVar.c = ufy.g;
        vfy vfyVar = vfy.g;
        xfyVar.d = vfyVar;
        xfyVar.e = vfyVar;
        xfyVar.f = vfyVar;
        xfyVar.g = vfyVar;
    }

    public xfy(pyc pycVar, sso ssoVar) {
        this.h = (byte) -1;
        this.i = -1;
        this.c = ufy.g;
        vfy vfyVar = vfy.g;
        this.d = vfyVar;
        this.e = vfyVar;
        this.f = vfyVar;
        this.g = vfyVar;
        ng9 ng9Var = new ng9();
        tyc tycVarM = tyc.M(ng9Var, 1);
        byte b = 0;
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iN = pycVar.n();
                    if (iN != 0) {
                        tfy tfyVarJ = null;
                        if (iN == 10) {
                            if ((this.b & 1) == 1) {
                                ufy ufyVar = this.c;
                                ufyVar.getClass();
                                tfyVarJ = new tfy(b);
                                tfyVarJ.h(ufyVar);
                            }
                            ufy ufyVar2 = (ufy) pycVar.g(ufy.h, ssoVar);
                            this.c = ufyVar2;
                            if (tfyVarJ != null) {
                                tfyVarJ.h(ufyVar2);
                                this.c = tfyVarJ.f();
                            }
                            this.b |= 1;
                        } else if (iN == 18) {
                            if ((this.b & 2) == 2) {
                                vfy vfyVar2 = this.d;
                                vfyVar2.getClass();
                                tfyVarJ = vfy.j(vfyVar2);
                            }
                            vfy vfyVar3 = (vfy) pycVar.g(vfy.h, ssoVar);
                            this.d = vfyVar3;
                            if (tfyVarJ != null) {
                                tfyVarJ.i(vfyVar3);
                                this.d = tfyVarJ.g();
                            }
                            this.b |= 2;
                        } else if (iN == 26) {
                            if ((this.b & 4) == 4) {
                                vfy vfyVar4 = this.e;
                                vfyVar4.getClass();
                                tfyVarJ = vfy.j(vfyVar4);
                            }
                            vfy vfyVar5 = (vfy) pycVar.g(vfy.h, ssoVar);
                            this.e = vfyVar5;
                            if (tfyVarJ != null) {
                                tfyVarJ.i(vfyVar5);
                                this.e = tfyVarJ.g();
                            }
                            this.b |= 4;
                        } else if (iN == 34) {
                            if ((this.b & 8) == 8) {
                                vfy vfyVar6 = this.f;
                                vfyVar6.getClass();
                                tfyVarJ = vfy.j(vfyVar6);
                            }
                            vfy vfyVar7 = (vfy) pycVar.g(vfy.h, ssoVar);
                            this.f = vfyVar7;
                            if (tfyVarJ != null) {
                                tfyVarJ.i(vfyVar7);
                                this.f = tfyVarJ.g();
                            }
                            this.b |= 8;
                        } else if (iN == 42) {
                            if ((this.b & 16) == 16) {
                                vfy vfyVar8 = this.g;
                                vfyVar8.getClass();
                                tfyVarJ = vfy.j(vfyVar8);
                            }
                            vfy vfyVar9 = (vfy) pycVar.g(vfy.h, ssoVar);
                            this.g = vfyVar9;
                            if (tfyVarJ != null) {
                                tfyVarJ.i(vfyVar9);
                                this.g = tfyVarJ.g();
                            }
                            this.b |= 16;
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
                    this.f40815a = ng9Var.d();
                }
                throw th;
            }
        }
        try {
            tycVarM.c0();
        } catch (IOException unused2) {
        } finally {
            this.f40815a = ng9Var.d();
        }
    }

    @Override // a.e540
    public final boolean b() {
        byte b = this.h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.h = (byte) 1;
        return true;
    }

    @Override // a.z3
    public final int d() {
        int i = this.i;
        if (i != -1) {
            return i;
        }
        int iP = (this.b & 1) == 1 ? tyc.p(1, this.c) : 0;
        if ((this.b & 2) == 2) {
            iP += tyc.p(2, this.d);
        }
        if ((this.b & 4) == 4) {
            iP += tyc.p(3, this.e);
        }
        if ((this.b & 8) == 8) {
            iP += tyc.p(4, this.f);
        }
        if ((this.b & 16) == 16) {
            iP += tyc.p(5, this.g);
        }
        int size = this.f40815a.size() + iP;
        this.i = size;
        return size;
    }

    @Override // a.z3
    public final ajt e() {
        return wfy.h();
    }

    @Override // a.z3
    public final ajt f() {
        wfy wfyVarH = wfy.h();
        wfyVarH.j(this);
        return wfyVarH;
    }

    @Override // a.z3
    public final void g(tyc tycVar) throws IOException {
        d();
        if ((this.b & 1) == 1) {
            tycVar.l0(1, this.c);
        }
        if ((this.b & 2) == 2) {
            tycVar.l0(2, this.d);
        }
        if ((this.b & 4) == 4) {
            tycVar.l0(3, this.e);
        }
        if ((this.b & 8) == 8) {
            tycVar.l0(4, this.f);
        }
        if ((this.b & 16) == 16) {
            tycVar.l0(5, this.g);
        }
        tycVar.o0(this.f40815a);
    }

    public final boolean j() {
        return (this.b & 4) == 4;
    }

    public xfy() {
        this.h = (byte) -1;
        this.i = -1;
        this.f40815a = pg9.f26941a;
    }

    public xfy(wfy wfyVar) {
        this.h = (byte) -1;
        this.i = -1;
        this.f40815a = wfyVar.f994a;
    }
}
