package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h4d0 extends fjt {
    public int d;
    public int e;
    public int f;
    public a4d0 g;
    public int h;
    public a4d0 i;
    public int j;
    public List k;
    public m2d0 l;

    public static h4d0 h() {
        h4d0 h4d0Var = new h4d0();
        a4d0 a4d0Var = a4d0.u;
        h4d0Var.g = a4d0Var;
        h4d0Var.i = a4d0Var;
        h4d0Var.k = Collections.EMPTY_LIST;
        h4d0Var.l = m2d0.p;
        return h4d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        i4d0 i4d0VarG = g();
        if (i4d0VarG.b()) {
            return i4d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        h4d0 h4d0VarH = h();
        h4d0VarH.i(g());
        return h4d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        i4d0 i4d0Var = null;
        try {
            try {
                i4d0.o.getClass();
                i(new i4d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                i4d0 i4d0Var2 = (i4d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    i4d0Var = i4d0Var2;
                    if (i4d0Var != null) {
                        i(i4d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (i4d0Var != null) {
                i(i4d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((i4d0) ljtVar);
        return this;
    }

    public final i4d0 g() {
        i4d0 i4d0Var = new i4d0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        i4d0Var.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        i4d0Var.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        i4d0Var.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        i4d0Var.g = this.h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        i4d0Var.h = this.i;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        i4d0Var.i = this.j;
        if ((i & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
            this.d &= -65;
        }
        i4d0Var.j = this.k;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        i4d0Var.k = this.l;
        i4d0Var.c = i2;
        return i4d0Var;
    }

    public final void i(i4d0 i4d0Var) {
        m2d0 m2d0Var;
        a4d0 a4d0Var;
        a4d0 a4d0Var2;
        if (i4d0Var == i4d0.n) {
            return;
        }
        int i = i4d0Var.c;
        if ((i & 1) == 1) {
            int i2 = i4d0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = i4d0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            a4d0 a4d0Var3 = i4d0Var.f;
            if ((this.d & 4) != 4 || (a4d0Var2 = this.g) == a4d0.u) {
                this.g = a4d0Var3;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var2);
                z3d0VarT.i(a4d0Var3);
                this.g = z3d0VarT.g();
            }
            this.d |= 4;
        }
        int i4 = i4d0Var.c;
        if ((i4 & 8) == 8) {
            int i5 = i4d0Var.g;
            this.d = 8 | this.d;
            this.h = i5;
        }
        if ((i4 & 16) == 16) {
            a4d0 a4d0Var4 = i4d0Var.h;
            if ((this.d & 16) != 16 || (a4d0Var = this.i) == a4d0.u) {
                this.i = a4d0Var4;
            } else {
                z3d0 z3d0VarT2 = a4d0.t(a4d0Var);
                z3d0VarT2.i(a4d0Var4);
                this.i = z3d0VarT2.g();
            }
            this.d |= 16;
        }
        if ((i4d0Var.c & 32) == 32) {
            int i6 = i4d0Var.i;
            this.d = 32 | this.d;
            this.j = i6;
        }
        if (!i4d0Var.j.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = i4d0Var.j;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.d |= 64;
                }
                this.k.addAll(i4d0Var.j);
            }
        }
        if ((i4d0Var.c & 64) == 64) {
            m2d0 m2d0Var2 = i4d0Var.k;
            if ((this.d & 128) != 128 || (m2d0Var = this.l) == m2d0.p) {
                this.l = m2d0Var2;
            } else {
                k2d0 k2d0VarG = k2d0.g();
                k2d0VarG.h(m2d0Var);
                k2d0VarG.h(m2d0Var2);
                this.l = k2d0VarG.f();
            }
            this.d |= 128;
        }
        f(i4d0Var);
        this.f994a = this.f994a.c(i4d0Var.b);
    }
}
