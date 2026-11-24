package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u2d0 extends fjt {
    public int d;
    public int e;
    public List f;
    public List g;
    public List h;
    public List i;

    public static u2d0 h() {
        u2d0 u2d0Var = new u2d0();
        u2d0Var.e = 6;
        List list = Collections.EMPTY_LIST;
        u2d0Var.f = list;
        u2d0Var.g = list;
        u2d0Var.h = list;
        u2d0Var.i = list;
        return u2d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        v2d0 v2d0VarG = g();
        if (v2d0VarG.b()) {
            return v2d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        u2d0 u2d0VarH = h();
        u2d0VarH.i(g());
        return u2d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        v2d0 v2d0Var = null;
        try {
            try {
                v2d0.l.getClass();
                i(new v2d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                v2d0 v2d0Var2 = (v2d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    v2d0Var = v2d0Var2;
                    if (v2d0Var != null) {
                        i(v2d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (v2d0Var != null) {
                i(v2d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((v2d0) ljtVar);
        return this;
    }

    public final v2d0 g() {
        v2d0 v2d0Var = new v2d0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        v2d0Var.d = this.e;
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            i = this.d & (-3);
            this.d = i;
        }
        v2d0Var.e = this.f;
        if ((i & 4) == 4) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.d & (-5);
            this.d = i;
        }
        v2d0Var.f = this.g;
        if ((i & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            i = this.d & (-9);
            this.d = i;
        }
        v2d0Var.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            this.d &= -17;
        }
        v2d0Var.h = this.i;
        v2d0Var.c = i2;
        return v2d0Var;
    }

    public final void i(v2d0 v2d0Var) {
        if (v2d0Var == v2d0.k) {
            return;
        }
        if ((v2d0Var.c & 1) == 1) {
            int i = v2d0Var.d;
            this.d = 1 | this.d;
            this.e = i;
        }
        if (!v2d0Var.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = v2d0Var.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(v2d0Var.e);
            }
        }
        if (!v2d0Var.f.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = v2d0Var.f;
                this.d &= -5;
            } else {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
                this.g.addAll(v2d0Var.f);
            }
        }
        if (!v2d0Var.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = v2d0Var.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(v2d0Var.g);
            }
        }
        if (!v2d0Var.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = v2d0Var.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(v2d0Var.h);
            }
        }
        f(v2d0Var);
        this.f994a = this.f994a.c(v2d0Var.b);
    }
}
