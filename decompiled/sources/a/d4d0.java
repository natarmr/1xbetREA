package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d4d0 extends fjt {
    public int d;
    public int e;
    public int f;
    public boolean g;
    public e4d0 h;
    public List i;
    public List j;
    public List k;

    public static d4d0 h() {
        d4d0 d4d0Var = new d4d0();
        d4d0Var.h = e4d0.INV;
        List list = Collections.EMPTY_LIST;
        d4d0Var.i = list;
        d4d0Var.j = list;
        d4d0Var.k = list;
        return d4d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        f4d0 f4d0VarG = g();
        if (f4d0VarG.b()) {
            return f4d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        d4d0 d4d0VarH = h();
        d4d0VarH.i(g());
        return d4d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        f4d0 f4d0Var = null;
        try {
            try {
                f4d0.o.getClass();
                i(new f4d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                f4d0 f4d0Var2 = (f4d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    f4d0Var = f4d0Var2;
                    if (f4d0Var != null) {
                        i(f4d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (f4d0Var != null) {
                i(f4d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((f4d0) ljtVar);
        return this;
    }

    public final f4d0 g() {
        f4d0 f4d0Var = new f4d0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        f4d0Var.d = this.e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        f4d0Var.e = this.f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        f4d0Var.f = this.g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        f4d0Var.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            i = this.d & (-17);
            this.d = i;
        }
        f4d0Var.h = this.i;
        if ((i & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            i = this.d & (-33);
            this.d = i;
        }
        f4d0Var.i = this.j;
        if ((i & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
            this.d &= -65;
        }
        f4d0Var.k = this.k;
        f4d0Var.c = i2;
        return f4d0Var;
    }

    public final void i(f4d0 f4d0Var) {
        if (f4d0Var == f4d0.n) {
            return;
        }
        int i = f4d0Var.c;
        if ((i & 1) == 1) {
            int i2 = f4d0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = f4d0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            boolean z = f4d0Var.f;
            this.d = 4 | this.d;
            this.g = z;
        }
        if ((i & 8) == 8) {
            e4d0 e4d0Var = f4d0Var.g;
            e4d0Var.getClass();
            this.d = 8 | this.d;
            this.h = e4d0Var;
        }
        if (!f4d0Var.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = f4d0Var.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(f4d0Var.h);
            }
        }
        if (!f4d0Var.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = f4d0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(f4d0Var.i);
            }
        }
        if (!f4d0Var.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = f4d0Var.k;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.d |= 64;
                }
                this.k.addAll(f4d0Var.k);
            }
        }
        f(f4d0Var);
        this.f994a = this.f994a.c(f4d0Var.b);
    }
}
