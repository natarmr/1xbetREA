package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q2d0 extends fjt {
    public List A;
    public int d;
    public int e;
    public int f;
    public int g;
    public List h;
    public List i;
    public List j;
    public List k;
    public List l;
    public List m;
    public List n;
    public List o;
    public List p;
    public List q;
    public List r;
    public List s;
    public int t;
    public a4d0 u;
    public int v;
    public List w;
    public g4d0 x;
    public List y;
    public n4d0 z;

    public static q2d0 h() {
        q2d0 q2d0Var = new q2d0();
        q2d0Var.e = 6;
        List list = Collections.EMPTY_LIST;
        q2d0Var.h = list;
        q2d0Var.i = list;
        q2d0Var.j = list;
        q2d0Var.k = list;
        q2d0Var.l = list;
        q2d0Var.m = list;
        q2d0Var.n = list;
        q2d0Var.o = list;
        q2d0Var.p = list;
        q2d0Var.q = list;
        q2d0Var.r = list;
        q2d0Var.s = list;
        q2d0Var.u = a4d0.u;
        q2d0Var.w = list;
        q2d0Var.x = g4d0.g;
        q2d0Var.y = list;
        q2d0Var.z = n4d0.e;
        q2d0Var.A = list;
        return q2d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        s2d0 s2d0VarG = g();
        if (s2d0VarG.b()) {
            return s2d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        q2d0 q2d0VarH = h();
        q2d0VarH.i(g());
        return q2d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        s2d0 s2d0Var = null;
        try {
            try {
                s2d0.i1.getClass();
                i(new s2d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                s2d0 s2d0Var2 = (s2d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    s2d0Var = s2d0Var2;
                    if (s2d0Var != null) {
                        i(s2d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (s2d0Var != null) {
                i(s2d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((s2d0) ljtVar);
        return this;
    }

    public final s2d0 g() {
        int i;
        s2d0 s2d0Var = new s2d0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        s2d0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        s2d0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        s2d0Var.f = this.g;
        if ((i2 & 8) == 8) {
            this.h = Collections.unmodifiableList(this.h);
            i = this.d & (-9);
            this.d = i;
        } else {
            i = i2;
        }
        s2d0Var.g = this.h;
        if ((i & 16) == 16) {
            this.i = Collections.unmodifiableList(this.i);
            i = this.d & (-17);
            this.d = i;
        }
        s2d0Var.h = this.i;
        if ((i & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            i = this.d & (-33);
            this.d = i;
        }
        s2d0Var.i = this.j;
        if ((i & 64) == 64) {
            this.k = Collections.unmodifiableList(this.k);
            i = this.d & (-65);
            this.d = i;
        }
        s2d0Var.k = this.k;
        if ((i & 128) == 128) {
            this.l = Collections.unmodifiableList(this.l);
            i = this.d & (-129);
            this.d = i;
        }
        s2d0Var.m = this.l;
        if ((i & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            i = this.d & (-257);
            this.d = i;
        }
        s2d0Var.n = this.m;
        if ((i & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            i = this.d & (-513);
            this.d = i;
        }
        s2d0Var.p = this.n;
        if ((i & 1024) == 1024) {
            this.o = Collections.unmodifiableList(this.o);
            i = this.d & (-1025);
            this.d = i;
        }
        s2d0Var.q = this.o;
        if ((i & 2048) == 2048) {
            this.p = Collections.unmodifiableList(this.p);
            i = this.d & (-2049);
            this.d = i;
        }
        s2d0Var.r = this.p;
        if ((i & 4096) == 4096) {
            this.q = Collections.unmodifiableList(this.q);
            i = this.d & (-4097);
            this.d = i;
        }
        s2d0Var.s = this.q;
        if ((i & 8192) == 8192) {
            this.r = Collections.unmodifiableList(this.r);
            i = this.d & (-8193);
            this.d = i;
        }
        s2d0Var.t = this.r;
        if ((i & 16384) == 16384) {
            this.s = Collections.unmodifiableList(this.s);
            i = this.d & (-16385);
            this.d = i;
        }
        s2d0Var.u = this.s;
        if ((i2 & 32768) == 32768) {
            i3 |= 8;
        }
        s2d0Var.w = this.t;
        if ((i2 & 65536) == 65536) {
            i3 |= 16;
        }
        s2d0Var.x = this.u;
        if ((i2 & 131072) == 131072) {
            i3 |= 32;
        }
        s2d0Var.y = this.v;
        if ((i & 262144) == 262144) {
            this.w = Collections.unmodifiableList(this.w);
            i = this.d & (-262145);
            this.d = i;
        }
        s2d0Var.z = this.w;
        if ((i2 & 524288) == 524288) {
            i3 |= 64;
        }
        s2d0Var.A = this.x;
        if ((i & 1048576) == 1048576) {
            this.y = Collections.unmodifiableList(this.y);
            i = this.d & (-1048577);
            this.d = i;
        }
        s2d0Var.B = this.y;
        if ((i2 & 2097152) == 2097152) {
            i3 |= 128;
        }
        s2d0Var.Y = this.z;
        if ((i & 4194304) == 4194304) {
            this.A = Collections.unmodifiableList(this.A);
            this.d &= -4194305;
        }
        s2d0Var.Z = this.A;
        s2d0Var.c = i3;
        return s2d0Var;
    }

    public final void i(s2d0 s2d0Var) {
        n4d0 n4d0Var;
        g4d0 g4d0Var;
        a4d0 a4d0Var;
        if (s2d0Var == s2d0.h1) {
            return;
        }
        int i = s2d0Var.c;
        if ((i & 1) == 1) {
            int i2 = s2d0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        byte b = 2;
        if ((i & 2) == 2) {
            int i3 = s2d0Var.e;
            this.d |= 2;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = s2d0Var.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if (!s2d0Var.g.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h = s2d0Var.g;
                this.d &= -9;
            } else {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
                this.h.addAll(s2d0Var.g);
            }
        }
        if (!s2d0Var.h.isEmpty()) {
            if (this.i.isEmpty()) {
                this.i = s2d0Var.h;
                this.d &= -17;
            } else {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
                this.i.addAll(s2d0Var.h);
            }
        }
        if (!s2d0Var.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = s2d0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(s2d0Var.i);
            }
        }
        if (!s2d0Var.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = s2d0Var.k;
                this.d &= -65;
            } else {
                if ((this.d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.d |= 64;
                }
                this.k.addAll(s2d0Var.k);
            }
        }
        if (!s2d0Var.m.isEmpty()) {
            if (this.l.isEmpty()) {
                this.l = s2d0Var.m;
                this.d &= -129;
            } else {
                if ((this.d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.d |= 128;
                }
                this.l.addAll(s2d0Var.m);
            }
        }
        if (!s2d0Var.n.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = s2d0Var.n;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(s2d0Var.n);
            }
        }
        if (!s2d0Var.p.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = s2d0Var.p;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(s2d0Var.p);
            }
        }
        if (!s2d0Var.q.isEmpty()) {
            if (this.o.isEmpty()) {
                this.o = s2d0Var.q;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
                this.o.addAll(s2d0Var.q);
            }
        }
        if (!s2d0Var.r.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = s2d0Var.r;
                this.d &= -2049;
            } else {
                if ((this.d & 2048) != 2048) {
                    this.p = new ArrayList(this.p);
                    this.d |= 2048;
                }
                this.p.addAll(s2d0Var.r);
            }
        }
        if (!s2d0Var.s.isEmpty()) {
            if (this.q.isEmpty()) {
                this.q = s2d0Var.s;
                this.d &= -4097;
            } else {
                if ((this.d & 4096) != 4096) {
                    this.q = new ArrayList(this.q);
                    this.d |= 4096;
                }
                this.q.addAll(s2d0Var.s);
            }
        }
        if (!s2d0Var.t.isEmpty()) {
            if (this.r.isEmpty()) {
                this.r = s2d0Var.t;
                this.d &= -8193;
            } else {
                if ((this.d & 8192) != 8192) {
                    this.r = new ArrayList(this.r);
                    this.d |= 8192;
                }
                this.r.addAll(s2d0Var.t);
            }
        }
        if (!s2d0Var.u.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = s2d0Var.u;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.s = new ArrayList(this.s);
                    this.d |= 16384;
                }
                this.s.addAll(s2d0Var.u);
            }
        }
        int i5 = s2d0Var.c;
        if ((i5 & 8) == 8) {
            int i6 = s2d0Var.w;
            this.d |= 32768;
            this.t = i6;
        }
        if ((i5 & 16) == 16) {
            a4d0 a4d0Var2 = s2d0Var.x;
            if ((this.d & 65536) != 65536 || (a4d0Var = this.u) == a4d0.u) {
                this.u = a4d0Var2;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var);
                z3d0VarT.i(a4d0Var2);
                this.u = z3d0VarT.g();
            }
            this.d |= 65536;
        }
        if ((s2d0Var.c & 32) == 32) {
            int i7 = s2d0Var.y;
            this.d |= 131072;
            this.v = i7;
        }
        if (!s2d0Var.z.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = s2d0Var.z;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.w = new ArrayList(this.w);
                    this.d |= 262144;
                }
                this.w.addAll(s2d0Var.z);
            }
        }
        if ((s2d0Var.c & 64) == 64) {
            g4d0 g4d0Var2 = s2d0Var.A;
            if ((this.d & 524288) != 524288 || (g4d0Var = this.x) == g4d0.g) {
                this.x = g4d0Var2;
            } else {
                o2d0 o2d0VarJ = g4d0.j(g4d0Var);
                o2d0VarJ.i(g4d0Var2);
                this.x = o2d0VarJ.g();
            }
            this.d |= 524288;
        }
        if (!s2d0Var.B.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = s2d0Var.B;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.y = new ArrayList(this.y);
                    this.d |= 1048576;
                }
                this.y.addAll(s2d0Var.B);
            }
        }
        if ((s2d0Var.c & 128) == 128) {
            n4d0 n4d0Var2 = s2d0Var.Y;
            if ((this.d & 2097152) != 2097152 || (n4d0Var = this.z) == n4d0.e) {
                this.z = n4d0Var2;
            } else {
                w2d0 w2d0Var = new w2d0(b);
                w2d0Var.d = Collections.EMPTY_LIST;
                w2d0Var.o(n4d0Var);
                w2d0Var.o(n4d0Var2);
                this.z = w2d0Var.i();
            }
            this.d |= 2097152;
        }
        if (!s2d0Var.Z.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = s2d0Var.Z;
                this.d &= -4194305;
            } else {
                if ((this.d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.d |= 4194304;
                }
                this.A.addAll(s2d0Var.Z);
            }
        }
        f(s2d0Var);
        this.f994a = this.f994a.c(s2d0Var.b);
    }
}
