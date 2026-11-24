package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c3d0 extends fjt {
    public int d;
    public int e;
    public List f;

    @Override // a.ajt
    public final z3 c() {
        d3d0 d3d0VarG = g();
        if (d3d0VarG.b()) {
            return d3d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        c3d0 c3d0Var = new c3d0();
        c3d0Var.f = Collections.EMPTY_LIST;
        c3d0Var.h(g());
        return c3d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        d3d0 d3d0Var = null;
        try {
            try {
                d3d0.i.getClass();
                h(new d3d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                d3d0 d3d0Var2 = (d3d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    d3d0Var = d3d0Var2;
                    if (d3d0Var != null) {
                        h(d3d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (d3d0Var != null) {
                h(d3d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        h((d3d0) ljtVar);
        return this;
    }

    public final d3d0 g() {
        d3d0 d3d0Var = new d3d0(this);
        int i = this.d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        d3d0Var.d = this.e;
        if ((i & 2) == 2) {
            this.f = Collections.unmodifiableList(this.f);
            this.d &= -3;
        }
        d3d0Var.e = this.f;
        d3d0Var.c = i2;
        return d3d0Var;
    }

    public final void h(d3d0 d3d0Var) {
        if (d3d0Var == d3d0.h) {
            return;
        }
        if ((d3d0Var.c & 1) == 1) {
            int i = d3d0Var.d;
            this.d = 1 | this.d;
            this.e = i;
        }
        if (!d3d0Var.e.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = d3d0Var.e;
                this.d &= -3;
            } else {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
                this.f.addAll(d3d0Var.e);
            }
        }
        f(d3d0Var);
        this.f994a = this.f994a.c(d3d0Var.b);
    }
}
