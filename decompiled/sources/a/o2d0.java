package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o2d0 extends ajt implements e540 {
    public final /* synthetic */ byte b;
    public int c;
    public List d;
    public int e;

    public /* synthetic */ o2d0(byte b) {
        this.b = b;
    }

    @Override // a.ajt
    public final z3 c() {
        switch (this.b) {
            case 0:
                p2d0 p2d0VarF = f();
                if (p2d0VarF.b()) {
                    return p2d0VarF;
                }
                throw new ss3((byte) 28);
            default:
                g4d0 g4d0VarG = g();
                if (g4d0VarG.b()) {
                    return g4d0VarG;
                }
                throw new ss3((byte) 28);
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                o2d0 o2d0Var = new o2d0((byte) 0);
                o2d0Var.d = Collections.EMPTY_LIST;
                o2d0Var.h(f());
                return o2d0Var;
            default:
                o2d0 o2d0Var2 = new o2d0((byte) 1);
                o2d0Var2.d = Collections.EMPTY_LIST;
                o2d0Var2.e = -1;
                o2d0Var2.i(g());
                return o2d0Var2;
        }
    }

    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        g4d0 g4d0Var = null;
        p2d0 p2d0Var = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            p2d0.h.getClass();
                            h(new p2d0(pycVar, ssoVar));
                            return this;
                        } catch (aox e) {
                            p2d0 p2d0Var2 = (p2d0) e.f1223a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                p2d0Var = p2d0Var2;
                                if (p2d0Var != null) {
                                    h(p2d0Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            g4d0.h.getClass();
                            i(new g4d0(pycVar, ssoVar));
                            return this;
                        } catch (aox e2) {
                            g4d0 g4d0Var2 = (g4d0) e2.f1223a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                g4d0Var = g4d0Var2;
                                if (g4d0Var != null) {
                                    i(g4d0Var);
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
                h((p2d0) ljtVar);
                break;
            default:
                i((g4d0) ljtVar);
                break;
        }
        return this;
    }

    public p2d0 f() {
        p2d0 p2d0Var = new p2d0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        p2d0Var.c = this.e;
        if ((i & 2) == 2) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -3;
        }
        p2d0Var.d = this.d;
        p2d0Var.b = i2;
        return p2d0Var;
    }

    public g4d0 g() {
        g4d0 g4d0Var = new g4d0(this);
        int i = this.c;
        if ((i & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        g4d0Var.c = this.d;
        int i2 = (i & 2) != 2 ? 0 : 1;
        g4d0Var.d = this.e;
        g4d0Var.b = i2;
        return g4d0Var;
    }

    public void h(p2d0 p2d0Var) {
        if (p2d0Var == p2d0.g) {
            return;
        }
        if ((p2d0Var.b & 1) == 1) {
            int i = p2d0Var.c;
            this.c = 1 | this.c;
            this.e = i;
        }
        if (!p2d0Var.d.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = p2d0Var.d;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.c |= 2;
                }
                this.d.addAll(p2d0Var.d);
            }
        }
        this.f994a = this.f994a.c(p2d0Var.f26244a);
    }

    public void i(g4d0 g4d0Var) {
        if (g4d0Var == g4d0.g) {
            return;
        }
        if (!g4d0Var.c.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = g4d0Var.c;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(g4d0Var.c);
            }
        }
        if ((g4d0Var.b & 1) == 1) {
            int i = g4d0Var.d;
            this.c |= 2;
            this.e = i;
        }
        this.f994a = this.f994a.c(g4d0Var.f10661a);
    }
}
