package a;

/* JADX INFO: loaded from: classes2.dex */
public final class j2d0 extends ajt implements e540 {
    public final /* synthetic */ byte b;
    public int c;
    public int d;
    public Object e;

    public /* synthetic */ j2d0(byte b) {
        this.b = b;
    }

    @Override // a.ajt
    public final z3 c() {
        switch (this.b) {
            case 0:
                n2d0 n2d0VarF = f();
                if (n2d0VarF.b()) {
                    return n2d0VarF;
                }
                throw new ss3((byte) 28);
            default:
                t2d0 t2d0VarG = g();
                if (t2d0VarG.b()) {
                    return t2d0VarG;
                }
                throw new ss3((byte) 28);
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                j2d0 j2d0Var = new j2d0((byte) 0);
                j2d0Var.e = m2d0.p;
                j2d0Var.h(f());
                return j2d0Var;
            default:
                j2d0 j2d0Var2 = new j2d0((byte) 1);
                j2d0Var2.e = pg9.f26941a;
                j2d0Var2.i(g());
                return j2d0Var2;
        }
    }

    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        t2d0 t2d0Var = null;
        n2d0 n2d0Var = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            n2d0.h.getClass();
                            h(new n2d0(pycVar, ssoVar));
                            return this;
                        } catch (aox e) {
                            n2d0 n2d0Var2 = (n2d0) e.f1223a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                n2d0Var = n2d0Var2;
                                if (n2d0Var != null) {
                                    h(n2d0Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            t2d0.h.getClass();
                            i(new t2d0(pycVar));
                            return this;
                        } catch (aox e2) {
                            t2d0 t2d0Var2 = (t2d0) e2.f1223a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                t2d0Var = t2d0Var2;
                                if (t2d0Var != null) {
                                    i(t2d0Var);
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
                h((n2d0) ljtVar);
                break;
            default:
                i((t2d0) ljtVar);
                break;
        }
        return this;
    }

    public n2d0 f() {
        n2d0 n2d0Var = new n2d0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        n2d0Var.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        n2d0Var.d = (m2d0) this.e;
        n2d0Var.b = i2;
        return n2d0Var;
    }

    public t2d0 g() {
        t2d0 t2d0Var = new t2d0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        t2d0Var.c = this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        t2d0Var.d = (nh00) this.e;
        t2d0Var.b = i2;
        return t2d0Var;
    }

    public void h(n2d0 n2d0Var) {
        m2d0 m2d0Var;
        if (n2d0Var == n2d0.g) {
            return;
        }
        int i = n2d0Var.b;
        if ((i & 1) == 1) {
            int i2 = n2d0Var.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            m2d0 m2d0Var2 = n2d0Var.d;
            if ((this.c & 2) != 2 || (m2d0Var = (m2d0) this.e) == m2d0.p) {
                this.e = m2d0Var2;
            } else {
                k2d0 k2d0VarG = k2d0.g();
                k2d0VarG.h(m2d0Var);
                k2d0VarG.h(m2d0Var2);
                this.e = k2d0VarG.f();
            }
            this.c |= 2;
        }
        this.f994a = this.f994a.c(n2d0Var.f22793a);
    }

    public void i(t2d0 t2d0Var) {
        if (t2d0Var == t2d0.g) {
            return;
        }
        int i = t2d0Var.b;
        if ((i & 1) == 1) {
            int i2 = t2d0Var.c;
            this.c = 1 | this.c;
            this.d = i2;
        }
        if ((i & 2) == 2) {
            nh00 nh00Var = t2d0Var.d;
            nh00Var.getClass();
            this.c = 2 | this.c;
            this.e = nh00Var;
        }
        this.f994a = this.f994a.c(t2d0Var.f33209a);
    }
}
