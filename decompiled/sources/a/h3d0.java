package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h3d0 extends fjt {
    public int d;
    public int e;
    public int f;
    public int g;
    public a4d0 h;
    public int i;
    public List j;
    public a4d0 k;
    public int l;
    public List m;
    public List n;
    public List o;
    public List p;
    public g4d0 q;
    public List r;
    public x2d0 s;
    public List t;
    public List u;
    public List v;

    public static h3d0 h() {
        h3d0 h3d0Var = new h3d0();
        h3d0Var.e = 6;
        h3d0Var.f = 6;
        a4d0 a4d0Var = a4d0.u;
        h3d0Var.h = a4d0Var;
        List list = Collections.EMPTY_LIST;
        h3d0Var.j = list;
        h3d0Var.k = a4d0Var;
        h3d0Var.m = list;
        h3d0Var.n = list;
        h3d0Var.o = list;
        h3d0Var.p = list;
        h3d0Var.q = g4d0.g;
        h3d0Var.r = list;
        h3d0Var.s = x2d0.e;
        h3d0Var.t = list;
        h3d0Var.u = list;
        h3d0Var.v = list;
        return h3d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        i3d0 i3d0VarG = g();
        if (i3d0VarG.b()) {
            return i3d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        h3d0 h3d0VarH = h();
        h3d0VarH.i(g());
        return h3d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        i3d0 i3d0Var = null;
        try {
            try {
                i3d0.z.getClass();
                i(new i3d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                i3d0 i3d0Var2 = (i3d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    i3d0Var = i3d0Var2;
                    if (i3d0Var != null) {
                        i(i3d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (i3d0Var != null) {
                i(i3d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((i3d0) ljtVar);
        return this;
    }

    public final i3d0 g() {
        int i;
        i3d0 i3d0Var = new i3d0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        i3d0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        i3d0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        i3d0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        i3d0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        i3d0Var.h = this.i;
        if ((i2 & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            i = this.d & (-33);
            this.d = i;
        } else {
            i = i2;
        }
        i3d0Var.i = this.j;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        i3d0Var.j = this.k;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        i3d0Var.k = this.l;
        if ((i & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            i = this.d & (-257);
            this.d = i;
        }
        i3d0Var.l = this.m;
        if ((i & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            i = this.d & (-513);
            this.d = i;
        }
        i3d0Var.m = this.n;
        if ((i & 1024) == 1024) {
            this.o = Collections.unmodifiableList(this.o);
            i = this.d & (-1025);
            this.d = i;
        }
        i3d0Var.o = this.o;
        if ((i & 2048) == 2048) {
            this.p = Collections.unmodifiableList(this.p);
            i = this.d & (-2049);
            this.d = i;
        }
        i3d0Var.p = this.p;
        if ((i2 & 4096) == 4096) {
            i3 |= 128;
        }
        i3d0Var.q = this.q;
        if ((i & 8192) == 8192) {
            this.r = Collections.unmodifiableList(this.r);
            i = this.d & (-8193);
            this.d = i;
        }
        i3d0Var.r = this.r;
        if ((i2 & 16384) == 16384) {
            i3 |= 256;
        }
        i3d0Var.s = this.s;
        if ((i & 32768) == 32768) {
            this.t = Collections.unmodifiableList(this.t);
            i = (-32769) & this.d;
            this.d = i;
        }
        i3d0Var.t = this.t;
        if ((i & 65536) == 65536) {
            this.u = Collections.unmodifiableList(this.u);
            i = (-65537) & this.d;
            this.d = i;
        }
        i3d0Var.u = this.u;
        if ((i & 131072) == 131072) {
            this.v = Collections.unmodifiableList(this.v);
            this.d &= -131073;
        }
        i3d0Var.v = this.v;
        i3d0Var.c = i3;
        return i3d0Var;
    }

    public final void i(i3d0 i3d0Var) {
        x2d0 x2d0Var;
        g4d0 g4d0Var;
        a4d0 a4d0Var;
        a4d0 a4d0Var2;
        if (i3d0Var == i3d0.y) {
            return;
        }
        int i = i3d0Var.c;
        if ((i & 1) == 1) {
            int i2 = i3d0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = i3d0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = i3d0Var.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if ((i & 8) == 8) {
            a4d0 a4d0Var3 = i3d0Var.g;
            if ((this.d & 8) != 8 || (a4d0Var2 = this.h) == a4d0.u) {
                this.h = a4d0Var3;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var2);
                z3d0VarT.i(a4d0Var3);
                this.h = z3d0VarT.g();
            }
            this.d |= 8;
        }
        if ((i3d0Var.c & 16) == 16) {
            int i5 = i3d0Var.h;
            this.d = 16 | this.d;
            this.i = i5;
        }
        if (!i3d0Var.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = i3d0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(i3d0Var.i);
            }
        }
        if ((i3d0Var.c & 32) == 32) {
            a4d0 a4d0Var4 = i3d0Var.j;
            if ((this.d & 64) != 64 || (a4d0Var = this.k) == a4d0.u) {
                this.k = a4d0Var4;
            } else {
                z3d0 z3d0VarT2 = a4d0.t(a4d0Var);
                z3d0VarT2.i(a4d0Var4);
                this.k = z3d0VarT2.g();
            }
            this.d |= 64;
        }
        if ((i3d0Var.c & 64) == 64) {
            int i6 = i3d0Var.k;
            this.d |= 128;
            this.l = i6;
        }
        if (!i3d0Var.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = i3d0Var.l;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(i3d0Var.l);
            }
        }
        if (!i3d0Var.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = i3d0Var.m;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(i3d0Var.m);
            }
        }
        if (!i3d0Var.o.isEmpty()) {
            if (this.o.isEmpty()) {
                this.o = i3d0Var.o;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
                this.o.addAll(i3d0Var.o);
            }
        }
        if (!i3d0Var.p.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = i3d0Var.p;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.p = new ArrayList(this.p);
                    this.d |= 2048;
                }
                this.p.addAll(i3d0Var.p);
            }
        }
        if ((i3d0Var.c & 128) == 128) {
            g4d0 g4d0Var2 = i3d0Var.q;
            if ((this.d & 4096) != 4096 || (g4d0Var = this.q) == g4d0.g) {
                this.q = g4d0Var2;
            } else {
                o2d0 o2d0VarJ = g4d0.j(g4d0Var);
                o2d0VarJ.i(g4d0Var2);
                this.q = o2d0VarJ.g();
            }
            this.d |= 4096;
        }
        if (!i3d0Var.r.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = i3d0Var.r;
                this.d &= -8193;
            } else {
                if ((this.d & 8192) != 8192) {
                    this.r = new ArrayList(this.r);
                    this.d |= 8192;
                }
                this.r.addAll(i3d0Var.r);
            }
        }
        if ((i3d0Var.c & 256) == 256) {
            x2d0 x2d0Var2 = i3d0Var.s;
            if ((this.d & 16384) != 16384 || (x2d0Var = this.s) == x2d0.e) {
                this.s = x2d0Var2;
            } else {
                w2d0 w2d0VarJ = x2d0.j(x2d0Var);
                w2d0VarJ.j(x2d0Var2);
                this.s = w2d0VarJ.f();
            }
            this.d |= 16384;
        }
        if (!i3d0Var.t.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = i3d0Var.t;
                this.d &= -32769;
            } else {
                if ((this.d & 32768) != 32768) {
                    this.t = new ArrayList(this.t);
                    this.d |= 32768;
                }
                this.t.addAll(i3d0Var.t);
            }
        }
        if (!i3d0Var.u.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = i3d0Var.u;
                this.d &= -65537;
            } else {
                if ((this.d & 65536) != 65536) {
                    this.u = new ArrayList(this.u);
                    this.d |= 65536;
                }
                this.u.addAll(i3d0Var.u);
            }
        }
        if (!i3d0Var.v.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = i3d0Var.v;
                this.d &= -131073;
            } else {
                if ((this.d & 131072) != 131072) {
                    this.v = new ArrayList(this.v);
                    this.d |= 131072;
                }
                this.v.addAll(i3d0Var.v);
            }
        }
        f(i3d0Var);
        this.f994a = this.f994a.c(i3d0Var.b);
    }
}
