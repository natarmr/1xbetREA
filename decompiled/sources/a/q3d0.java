package a;

/* JADX INFO: loaded from: classes2.dex */
public final class q3d0 extends ajt implements e540 {
    public int b;
    public int c;
    public int d;
    public r3d0 e;

    @Override // a.ajt
    public final z3 c() {
        s3d0 s3d0VarF = f();
        if (s3d0VarF.b()) {
            return s3d0VarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        q3d0 q3d0Var = new q3d0();
        q3d0Var.c = -1;
        q3d0Var.e = r3d0.PACKAGE;
        q3d0Var.g(f());
        return q3d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        s3d0 s3d0Var = null;
        try {
            try {
                s3d0.i.getClass();
                g(new s3d0(pycVar));
                return this;
            } catch (aox e) {
                s3d0 s3d0Var2 = (s3d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    s3d0Var = s3d0Var2;
                    if (s3d0Var != null) {
                        g(s3d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (s3d0Var != null) {
                g(s3d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        g((s3d0) ljtVar);
        return this;
    }

    public final s3d0 f() {
        s3d0 s3d0Var = new s3d0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        s3d0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        s3d0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        s3d0Var.e = this.e;
        s3d0Var.b = i2;
        return s3d0Var;
    }

    public final void g(s3d0 s3d0Var) {
        if (s3d0Var == s3d0.h) {
            return;
        }
        int i = s3d0Var.b;
        if ((i & 1) == 1) {
            int i2 = s3d0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = s3d0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            r3d0 r3d0Var = s3d0Var.e;
            r3d0Var.getClass();
            this.b = 4 | this.b;
            this.e = r3d0Var;
        }
        this.f994a = this.f994a.c(s3d0Var.f31553a);
    }
}
