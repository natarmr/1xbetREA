package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e3d0 extends ajt implements e540 {
    public int b;
    public int c;
    public int d;
    public f3d0 e;
    public a4d0 f;
    public int g;
    public List h;
    public List i;

    public static e3d0 g() {
        e3d0 e3d0Var = new e3d0();
        e3d0Var.e = f3d0.TRUE;
        e3d0Var.f = a4d0.u;
        List list = Collections.EMPTY_LIST;
        e3d0Var.h = list;
        e3d0Var.i = list;
        return e3d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        g3d0 g3d0VarF = f();
        if (g3d0VarF.b()) {
            return g3d0VarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        e3d0 e3d0VarG = g();
        e3d0VarG.h(f());
        return e3d0VarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        g3d0 g3d0Var = null;
        try {
            try {
                g3d0.m.getClass();
                h(new g3d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                g3d0 g3d0Var2 = (g3d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    g3d0Var = g3d0Var2;
                    if (g3d0Var != null) {
                        h(g3d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (g3d0Var != null) {
                h(g3d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        h((g3d0) ljtVar);
        return this;
    }

    public final g3d0 f() {
        g3d0 g3d0Var = new g3d0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        g3d0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        g3d0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        g3d0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        g3d0Var.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        g3d0Var.g = this.g;
        if ((i & 32) == 32) {
            this.h = Collections.unmodifiableList(this.h);
            i = this.b & (-33);
            this.b = i;
        }
        g3d0Var.h = this.h;
        if ((i & 64) == 64) {
            this.i = Collections.unmodifiableList(this.i);
            this.b &= -65;
        }
        g3d0Var.i = this.i;
        g3d0Var.b = i2;
        return g3d0Var;
    }

    public final void h(g3d0 g3d0Var) {
        a4d0 a4d0Var;
        if (g3d0Var == g3d0.l) {
            return;
        }
        int i = g3d0Var.b;
        if ((i & 1) == 1) {
            int i2 = g3d0Var.c;
            this.b = 1 | this.b;
            this.c = i2;
        }
        if ((i & 2) == 2) {
            int i3 = g3d0Var.d;
            this.b = 2 | this.b;
            this.d = i3;
        }
        if ((i & 4) == 4) {
            f3d0 f3d0Var = g3d0Var.e;
            f3d0Var.getClass();
            this.b = 4 | this.b;
            this.e = f3d0Var;
        }
        if ((g3d0Var.b & 8) == 8) {
            a4d0 a4d0Var2 = g3d0Var.f;
            if ((this.b & 8) != 8 || (a4d0Var = this.f) == a4d0.u) {
                this.f = a4d0Var2;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var);
                z3d0VarT.i(a4d0Var2);
                this.f = z3d0VarT.g();
            }
            this.b |= 8;
        }
        if ((g3d0Var.b & 16) == 16) {
            int i4 = g3d0Var.g;
            this.b = 16 | this.b;
            this.g = i4;
        }
        if (!g3d0Var.h.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = g3d0Var.h;
                this.b &= -33;
            } else {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
                this.h.addAll(g3d0Var.h);
            }
        }
        if (!g3d0Var.i.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = g3d0Var.i;
                this.b &= -65;
            } else {
                if ((this.b & 64) != 64) {
                    this.i = new ArrayList(this.i);
                    this.b |= 64;
                }
                this.i.addAll(g3d0Var.i);
            }
        }
        this.f994a = this.f994a.c(g3d0Var.f10605a);
    }
}
