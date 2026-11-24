package a;

/* JADX INFO: loaded from: classes2.dex */
public final class j4d0 extends ajt implements e540 {
    public int b;
    public int c;
    public int d;
    public k4d0 e;
    public int f;
    public int g;
    public l4d0 h;

    @Override // a.ajt
    public final z3 c() {
        m4d0 m4d0VarF = f();
        if (m4d0VarF.b()) {
            return m4d0VarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        j4d0 j4d0Var = new j4d0();
        j4d0Var.e = k4d0.ERROR;
        j4d0Var.h = l4d0.LANGUAGE_VERSION;
        j4d0Var.g(f());
        return j4d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        m4d0 m4d0Var = null;
        try {
            try {
                m4d0.l.getClass();
                g(new m4d0(pycVar));
                return this;
            } catch (aox e) {
                m4d0 m4d0Var2 = (m4d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    m4d0Var = m4d0Var2;
                    if (m4d0Var != null) {
                        g(m4d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (m4d0Var != null) {
                g(m4d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        g((m4d0) ljtVar);
        return this;
    }

    public final m4d0 f() {
        m4d0 m4d0Var = new m4d0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        m4d0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        m4d0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        m4d0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        m4d0Var.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        m4d0Var.g = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        m4d0Var.h = this.h;
        m4d0Var.b = i2;
        return m4d0Var;
    }

    public final void g(m4d0 m4d0Var) {
        if (m4d0Var == m4d0.k) {
            return;
        }
        int i = m4d0Var.b;
        if ((i & 1) == 1) {
            int i2 = m4d0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = m4d0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            k4d0 k4d0Var = m4d0Var.e;
            k4d0Var.getClass();
            this.b = 4 | this.b;
            this.e = k4d0Var;
        }
        int i4 = m4d0Var.b;
        if ((i4 & 8) == 8) {
            int i5 = m4d0Var.f;
            this.b = 8 | this.b;
            this.f = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = m4d0Var.g;
            this.b = 16 | this.b;
            this.g = i6;
        }
        if ((i4 & 32) == 32) {
            l4d0 l4d0Var = m4d0Var.h;
            l4d0Var.getClass();
            this.b = 32 | this.b;
            this.h = l4d0Var;
        }
        this.f994a = this.f994a.c(m4d0Var.f21164a);
    }
}
