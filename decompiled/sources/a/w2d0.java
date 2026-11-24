package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w2d0 extends ajt implements e540 {
    public final /* synthetic */ byte b;
    public int c;
    public List d;

    public /* synthetic */ w2d0(byte b) {
        this.b = b;
    }

    @Override // a.ajt
    public final z3 c() {
        switch (this.b) {
            case 0:
                x2d0 x2d0VarF = f();
                if (x2d0VarF.b()) {
                    return x2d0VarF;
                }
                throw new ss3((byte) 28);
            case 1:
                t3d0 t3d0VarG = g();
                if (t3d0VarG.b()) {
                    return t3d0VarG;
                }
                throw new ss3((byte) 28);
            case 2:
                n4d0 n4d0VarI = i();
                if (n4d0VarI.b()) {
                    return n4d0VarI;
                }
                throw new ss3((byte) 28);
            default:
                v3d0 v3d0VarH = h();
                if (v3d0VarH.b()) {
                    return v3d0VarH;
                }
                throw new ss3((byte) 28);
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                w2d0 w2d0Var = new w2d0((byte) 0);
                w2d0Var.d = Collections.EMPTY_LIST;
                w2d0Var.j(f());
                return w2d0Var;
            case 1:
                w2d0 w2d0Var2 = new w2d0((byte) 1);
                w2d0Var2.d = Collections.EMPTY_LIST;
                w2d0Var2.m(g());
                return w2d0Var2;
            case 2:
                w2d0 w2d0Var3 = new w2d0((byte) 2);
                w2d0Var3.d = Collections.EMPTY_LIST;
                w2d0Var3.o(i());
                return w2d0Var3;
            default:
                w2d0 w2d0Var4 = new w2d0((byte) 3);
                w2d0Var4.d = pez.b;
                w2d0Var4.n(h());
                return w2d0Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007a  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        v3d0 v3d0Var = null;
        x2d0 x2d0Var = null;
        t3d0 t3d0Var = null;
        n4d0 n4d0Var = null;
        try {
            try {
                try {
                    switch (this.b) {
                        case 0:
                            try {
                                try {
                                    x2d0.f.getClass();
                                    j(new x2d0(pycVar, ssoVar));
                                    return this;
                                } catch (aox e) {
                                    x2d0 x2d0Var2 = (x2d0) e.f1223a;
                                    try {
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        x2d0Var = x2d0Var2;
                                        if (x2d0Var != null) {
                                            j(x2d0Var);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (x2d0Var != null) {
                                    j(x2d0Var);
                                }
                                throw th;
                            }
                        case 1:
                            try {
                                t3d0.f.getClass();
                                m(new t3d0(pycVar, ssoVar));
                                return this;
                            } catch (aox e2) {
                                t3d0 t3d0Var2 = (t3d0) e2.f1223a;
                                try {
                                    throw e2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    t3d0Var = t3d0Var2;
                                    if (t3d0Var != null) {
                                        m(t3d0Var);
                                    }
                                    throw th;
                                }
                            }
                        case 2:
                            try {
                                n4d0.f.getClass();
                                o(new n4d0(pycVar, ssoVar));
                                return this;
                            } catch (aox e3) {
                                n4d0 n4d0Var2 = (n4d0) e3.f1223a;
                                try {
                                    throw e3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    n4d0Var = n4d0Var2;
                                    if (n4d0Var != null) {
                                        o(n4d0Var);
                                    }
                                    throw th;
                                }
                            }
                        default:
                            try {
                                v3d0.f.getClass();
                                n(new v3d0(pycVar));
                                return this;
                            } catch (aox e4) {
                                v3d0 v3d0Var2 = (v3d0) e4.f1223a;
                                try {
                                    throw e4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    v3d0Var = v3d0Var2;
                                    if (v3d0Var != null) {
                                        n(v3d0Var);
                                    }
                                    throw th;
                                }
                            }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        switch (this.b) {
            case 0:
                j((x2d0) ljtVar);
                break;
            case 1:
                m((t3d0) ljtVar);
                break;
            case 2:
                o((n4d0) ljtVar);
                break;
            default:
                n((v3d0) ljtVar);
                break;
        }
        return this;
    }

    public x2d0 f() {
        x2d0 x2d0Var = new x2d0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        x2d0Var.b = this.d;
        return x2d0Var;
    }

    public t3d0 g() {
        t3d0 t3d0Var = new t3d0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        t3d0Var.b = this.d;
        return t3d0Var;
    }

    public v3d0 h() {
        v3d0 v3d0Var = new v3d0(this);
        if ((this.c & 1) == 1) {
            this.d = ((tez) this.d).d();
            this.c &= -2;
        }
        v3d0Var.b = (tez) this.d;
        return v3d0Var;
    }

    public n4d0 i() {
        n4d0 n4d0Var = new n4d0(this);
        if ((this.c & 1) == 1) {
            this.d = Collections.unmodifiableList(this.d);
            this.c &= -2;
        }
        n4d0Var.b = this.d;
        return n4d0Var;
    }

    public void j(x2d0 x2d0Var) {
        if (x2d0Var == x2d0.e) {
            return;
        }
        if (!x2d0Var.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = x2d0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(x2d0Var.b);
            }
        }
        this.f994a = this.f994a.c(x2d0Var.f40161a);
    }

    public void m(t3d0 t3d0Var) {
        if (t3d0Var == t3d0.e) {
            return;
        }
        if (!t3d0Var.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = t3d0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(t3d0Var.b);
            }
        }
        this.f994a = this.f994a.c(t3d0Var.f33260a);
    }

    public void n(v3d0 v3d0Var) {
        if (v3d0Var == v3d0.e) {
            return;
        }
        if (!v3d0Var.b.isEmpty()) {
            if (((tez) this.d).isEmpty()) {
                this.d = v3d0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new pez((tez) this.d);
                    this.c |= 1;
                }
                ((tez) this.d).addAll(v3d0Var.b);
            }
        }
        this.f994a = this.f994a.c(v3d0Var.f36727a);
    }

    public void o(n4d0 n4d0Var) {
        if (n4d0Var == n4d0.e) {
            return;
        }
        if (!n4d0Var.b.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d = n4d0Var.b;
                this.c &= -2;
            } else {
                if ((this.c & 1) != 1) {
                    this.d = new ArrayList(this.d);
                    this.c |= 1;
                }
                this.d.addAll(n4d0Var.b);
            }
        }
        this.f994a = this.f994a.c(n4d0Var.f22893a);
    }
}
