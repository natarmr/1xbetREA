package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tfy extends ajt implements e540 {
    public final /* synthetic */ byte b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ tfy(byte b) {
        this.b = b;
    }

    @Override // a.ajt
    public final z3 c() {
        switch (this.b) {
            case 0:
                ufy ufyVarF = f();
                if (ufyVarF.b()) {
                    return ufyVarF;
                }
                throw new ss3((byte) 28);
            default:
                vfy vfyVarG = g();
                if (vfyVarG.b()) {
                    return vfyVarG;
                }
                throw new ss3((byte) 28);
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                tfy tfyVar = new tfy((byte) 0);
                tfyVar.h(f());
                return tfyVar;
            default:
                tfy tfyVar2 = new tfy((byte) 1);
                tfyVar2.i(g());
                return tfyVar2;
        }
    }

    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        vfy vfyVar = null;
        ufy ufyVar = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            ufy.h.getClass();
                            h(new ufy(pycVar));
                            return this;
                        } catch (aox e) {
                            ufy ufyVar2 = (ufy) e.f1223a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ufyVar = ufyVar2;
                                if (ufyVar != null) {
                                    h(ufyVar);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            vfy.h.getClass();
                            i(new vfy(pycVar));
                            return this;
                        } catch (aox e2) {
                            vfy vfyVar2 = (vfy) e2.f1223a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                vfyVar = vfyVar2;
                                if (vfyVar != null) {
                                    i(vfyVar);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        switch (this.b) {
            case 0:
                h((ufy) ljtVar);
                break;
            default:
                i((vfy) ljtVar);
                break;
        }
        return this;
    }

    public ufy f() {
        ufy ufyVar = new ufy(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ufyVar.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ufyVar.d = this.e;
        ufyVar.b = i2;
        return ufyVar;
    }

    public vfy g() {
        vfy vfyVar = new vfy(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        vfyVar.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        vfyVar.d = this.e;
        vfyVar.b = i2;
        return vfyVar;
    }

    public void h(ufy ufyVar) {
        if (ufyVar == ufy.g) {
            return;
        }
        int i = ufyVar.b;
        if ((i & 1) == 1) {
            int i2 = ufyVar.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ufyVar.d;
            this.c = 2 | this.c;
            this.e = i3;
        }
        this.f994a = this.f994a.c(ufyVar.f35597a);
    }

    public void i(vfy vfyVar) {
        if (vfyVar == vfy.g) {
            return;
        }
        int i = vfyVar.b;
        if ((i & 1) == 1) {
            int i2 = vfyVar.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            int i3 = vfyVar.d;
            this.c = 2 | this.c;
            this.e = i3;
        }
        this.f994a = this.f994a.c(vfyVar.f37358a);
    }
}
