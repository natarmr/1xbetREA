package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l3d0 extends fjt {
    public final /* synthetic */ byte d;
    public int e;
    public List f;
    public List g;
    public Object h;
    public ljt i;
    public ljt j;

    public /* synthetic */ l3d0(byte b) {
        this.d = b;
    }

    public static l3d0 i() {
        l3d0 l3d0Var = new l3d0((byte) 0);
        List list = Collections.EMPTY_LIST;
        l3d0Var.f = list;
        l3d0Var.g = list;
        l3d0Var.h = list;
        l3d0Var.i = g4d0.g;
        l3d0Var.j = n4d0.e;
        return l3d0Var;
    }

    public static l3d0 j() {
        l3d0 l3d0Var = new l3d0((byte) 1);
        l3d0Var.h = v3d0.e;
        l3d0Var.i = t3d0.e;
        l3d0Var.j = m3d0.k;
        List list = Collections.EMPTY_LIST;
        l3d0Var.f = list;
        l3d0Var.g = list;
        return l3d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        switch (this.d) {
            case 0:
                m3d0 m3d0VarG = g();
                if (m3d0VarG.b()) {
                    return m3d0VarG;
                }
                throw new ss3((byte) 28);
            default:
                n3d0 n3d0VarH = h();
                if (n3d0VarH.b()) {
                    return n3d0VarH;
                }
                throw new ss3((byte) 28);
        }
    }

    public final Object clone() {
        switch (this.d) {
            case 0:
                l3d0 l3d0VarI = i();
                l3d0VarI.m(g());
                return l3d0VarI;
            default:
                l3d0 l3d0VarJ = j();
                l3d0VarJ.n(h());
                return l3d0VarJ;
        }
    }

    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        n3d0 n3d0Var = null;
        m3d0 m3d0Var = null;
        try {
            try {
                switch (this.d) {
                    case 0:
                        try {
                            m3d0.l.getClass();
                            m(new m3d0(pycVar, ssoVar));
                            return this;
                        } catch (aox e) {
                            m3d0 m3d0Var2 = (m3d0) e.f1223a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                m3d0Var = m3d0Var2;
                                if (m3d0Var != null) {
                                    m(m3d0Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            n3d0.l.getClass();
                            n(new n3d0(pycVar, ssoVar));
                            return this;
                        } catch (aox e2) {
                            n3d0 n3d0Var2 = (n3d0) e2.f1223a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                n3d0Var = n3d0Var2;
                                if (n3d0Var != null) {
                                    n(n3d0Var);
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
        switch (this.d) {
            case 0:
                m((m3d0) ljtVar);
                break;
            default:
                n((n3d0) ljtVar);
                break;
        }
        return this;
    }

    public m3d0 g() {
        int i;
        m3d0 m3d0Var = new m3d0(this);
        int i2 = this.e;
        if ((i2 & 1) == 1) {
            this.f = Collections.unmodifiableList(this.f);
            i = this.e & (-2);
            this.e = i;
        } else {
            i = i2;
        }
        m3d0Var.d = this.f;
        if ((i & 2) == 2) {
            this.g = Collections.unmodifiableList(this.g);
            i = this.e & (-3);
            this.e = i;
        }
        m3d0Var.e = this.g;
        if ((i & 4) == 4) {
            this.h = Collections.unmodifiableList((List) this.h);
            this.e &= -5;
        }
        m3d0Var.f = (List) this.h;
        int i3 = (i2 & 8) != 8 ? 0 : 1;
        m3d0Var.g = (g4d0) this.i;
        if ((i2 & 16) == 16) {
            i3 |= 2;
        }
        m3d0Var.h = (n4d0) this.j;
        m3d0Var.c = i3;
        return m3d0Var;
    }

    public n3d0 h() {
        n3d0 n3d0Var = new n3d0(this);
        int i = this.e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        n3d0Var.d = (v3d0) this.h;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        n3d0Var.e = (t3d0) this.i;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        n3d0Var.f = (m3d0) this.j;
        if ((i & 8) == 8) {
            this.f = Collections.unmodifiableList(this.f);
            i = this.e & (-9);
            this.e = i;
        }
        n3d0Var.g = this.f;
        if ((i & 16) == 16) {
            this.g = Collections.unmodifiableList(this.g);
            this.e &= -17;
        }
        n3d0Var.h = this.g;
        n3d0Var.c = i2;
        return n3d0Var;
    }

    public void m(m3d0 m3d0Var) {
        n4d0 n4d0Var;
        g4d0 g4d0Var;
        if (m3d0Var == m3d0.k) {
            return;
        }
        if (!m3d0Var.d.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = m3d0Var.d;
                this.e &= -2;
            } else {
                if ((this.e & 1) != 1) {
                    this.f = new ArrayList(this.f);
                    this.e |= 1;
                }
                this.f.addAll(m3d0Var.d);
            }
        }
        if (!m3d0Var.e.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = m3d0Var.e;
                this.e &= -3;
            } else {
                if ((this.e & 2) != 2) {
                    this.g = new ArrayList(this.g);
                    this.e |= 2;
                }
                this.g.addAll(m3d0Var.e);
            }
        }
        if (!m3d0Var.f.isEmpty()) {
            if (((List) this.h).isEmpty()) {
                this.h = m3d0Var.f;
                this.e &= -5;
            } else {
                if ((this.e & 4) != 4) {
                    this.h = new ArrayList((List) this.h);
                    this.e |= 4;
                }
                ((List) this.h).addAll(m3d0Var.f);
            }
        }
        if ((m3d0Var.c & 1) == 1) {
            g4d0 g4d0Var2 = m3d0Var.g;
            if ((this.e & 8) != 8 || (g4d0Var = (g4d0) this.i) == g4d0.g) {
                this.i = g4d0Var2;
            } else {
                o2d0 o2d0VarJ = g4d0.j(g4d0Var);
                o2d0VarJ.i(g4d0Var2);
                this.i = o2d0VarJ.g();
            }
            this.e |= 8;
        }
        if ((m3d0Var.c & 2) == 2) {
            n4d0 n4d0Var2 = m3d0Var.h;
            if ((this.e & 16) != 16 || (n4d0Var = (n4d0) this.j) == n4d0.e) {
                this.j = n4d0Var2;
            } else {
                w2d0 w2d0Var = new w2d0((byte) 2);
                w2d0Var.d = Collections.EMPTY_LIST;
                w2d0Var.o(n4d0Var);
                w2d0Var.o(n4d0Var2);
                this.j = w2d0Var.i();
            }
            this.e |= 16;
        }
        f(m3d0Var);
        this.f994a = this.f994a.c(m3d0Var.b);
    }

    public void n(n3d0 n3d0Var) {
        m3d0 m3d0Var;
        t3d0 t3d0Var;
        v3d0 v3d0Var;
        if (n3d0Var == n3d0.k) {
            return;
        }
        if ((n3d0Var.c & 1) == 1) {
            v3d0 v3d0Var2 = n3d0Var.d;
            if ((this.e & 1) != 1 || (v3d0Var = (v3d0) this.h) == v3d0.e) {
                this.h = v3d0Var2;
            } else {
                w2d0 w2d0Var = new w2d0((byte) 3);
                w2d0Var.d = pez.b;
                w2d0Var.n(v3d0Var);
                w2d0Var.n(v3d0Var2);
                this.h = w2d0Var.h();
            }
            this.e |= 1;
        }
        if ((n3d0Var.c & 2) == 2) {
            t3d0 t3d0Var2 = n3d0Var.e;
            if ((this.e & 2) != 2 || (t3d0Var = (t3d0) this.i) == t3d0.e) {
                this.i = t3d0Var2;
            } else {
                w2d0 w2d0Var2 = new w2d0((byte) 1);
                w2d0Var2.d = Collections.EMPTY_LIST;
                w2d0Var2.m(t3d0Var);
                w2d0Var2.m(t3d0Var2);
                this.i = w2d0Var2.g();
            }
            this.e |= 2;
        }
        if ((n3d0Var.c & 4) == 4) {
            m3d0 m3d0Var2 = n3d0Var.f;
            if ((this.e & 4) != 4 || (m3d0Var = (m3d0) this.j) == m3d0.k) {
                this.j = m3d0Var2;
            } else {
                l3d0 l3d0VarI = i();
                l3d0VarI.m(m3d0Var);
                l3d0VarI.m(m3d0Var2);
                this.j = l3d0VarI.g();
            }
            this.e |= 4;
        }
        if (!n3d0Var.g.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f = n3d0Var.g;
                this.e &= -9;
            } else {
                if ((this.e & 8) != 8) {
                    this.f = new ArrayList(this.f);
                    this.e |= 8;
                }
                this.f.addAll(n3d0Var.g);
            }
        }
        if (!n3d0Var.h.isEmpty()) {
            if (this.g.isEmpty()) {
                this.g = n3d0Var.h;
                this.e &= -17;
            } else {
                if ((this.e & 16) != 16) {
                    this.g = new ArrayList(this.g);
                    this.e |= 16;
                }
                this.g.addAll(n3d0Var.h);
            }
        }
        f(n3d0Var);
        this.f994a = this.f994a.c(n3d0Var.b);
    }
}
