package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b4d0 extends fjt {
    public int d;
    public int e;
    public int f;
    public List g;
    public a4d0 h;
    public int i;
    public a4d0 j;
    public int k;
    public List l;
    public List m;
    public List n;

    public static b4d0 h() {
        b4d0 b4d0Var = new b4d0();
        b4d0Var.e = 6;
        List list = Collections.EMPTY_LIST;
        b4d0Var.g = list;
        a4d0 a4d0Var = a4d0.u;
        b4d0Var.h = a4d0Var;
        b4d0Var.j = a4d0Var;
        b4d0Var.l = list;
        b4d0Var.m = list;
        b4d0Var.n = list;
        return b4d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        c4d0 c4d0VarG = g();
        if (c4d0VarG.b()) {
            return c4d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        b4d0 b4d0VarH = h();
        b4d0VarH.i(g());
        return b4d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        c4d0 c4d0Var = null;
        try {
            try {
                c4d0.q.getClass();
                i(new c4d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                c4d0 c4d0Var2 = (c4d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c4d0Var = c4d0Var2;
                    if (c4d0Var != null) {
                        i(c4d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c4d0Var != null) {
                i(c4d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((c4d0) ljtVar);
        return this;
    }

    public final c4d0 g() {
        int i;
        c4d0 c4d0Var = new c4d0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        c4d0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        c4d0Var.e = this.f;
        if ((i2 & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.d & (-5);
            this.d = i;
        } else {
            i = i2;
        }
        c4d0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        c4d0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        c4d0Var.h = this.i;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        c4d0Var.i = this.j;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        c4d0Var.j = this.k;
        if ((i & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
            i = this.d & (-129);
            this.d = i;
        }
        c4d0Var.k = this.l;
        if ((i & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            i = this.d & (-257);
            this.d = i;
        }
        c4d0Var.l = this.m;
        if ((i & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            this.d &= -513;
        }
        c4d0Var.m = this.n;
        c4d0Var.c = i3;
        return c4d0Var;
    }

    public final void i(c4d0 c4d0Var) {
        a4d0 a4d0Var;
        a4d0 a4d0Var2;
        if (c4d0Var == c4d0.p) {
            return;
        }
        int i = c4d0Var.c;
        if ((i & 1) == 1) {
            int i2 = c4d0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c4d0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if (!c4d0Var.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = c4d0Var.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(c4d0Var.f);
            }
        }
        if ((c4d0Var.c & 4) == 4) {
            a4d0 a4d0Var3 = c4d0Var.g;
            if ((this.d & 8) != 8 || (a4d0Var2 = this.h) == a4d0.u) {
                this.h = a4d0Var3;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var2);
                z3d0VarT.i(a4d0Var3);
                this.h = z3d0VarT.g();
            }
            this.d |= 8;
        }
        int i4 = c4d0Var.c;
        if ((i4 & 8) == 8) {
            int i5 = c4d0Var.h;
            this.d |= 16;
            this.i = i5;
        }
        if ((i4 & 16) == 16) {
            a4d0 a4d0Var4 = c4d0Var.i;
            if ((this.d & 32) != 32 || (a4d0Var = this.j) == a4d0.u) {
                this.j = a4d0Var4;
            } else {
                z3d0 z3d0VarT2 = a4d0.t(a4d0Var);
                z3d0VarT2.i(a4d0Var4);
                this.j = z3d0VarT2.g();
            }
            this.d |= 32;
        }
        if ((c4d0Var.c & 32) == 32) {
            int i6 = c4d0Var.j;
            this.d |= 64;
            this.k = i6;
        }
        if (!c4d0Var.k.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = c4d0Var.k;
                this.d &= -129;
            } else {
                if ((this.d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.d |= 128;
                }
                this.l.addAll(c4d0Var.k);
            }
        }
        if (!c4d0Var.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = c4d0Var.l;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(c4d0Var.l);
            }
        }
        if (!c4d0Var.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = c4d0Var.m;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(c4d0Var.m);
            }
        }
        f(c4d0Var);
        this.f994a = this.f994a.c(c4d0Var.b);
    }
}
