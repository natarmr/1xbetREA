package a;

import android.gov.nist.javax.sip.parser.TokenTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o3d0 extends fjt {
    public x2d0 A;
    public x2d0 B;
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
    public i4d0 p;
    public int q;
    public int r;
    public List s;
    public List t;
    public List u;
    public List v;
    public List w;
    public List x;
    public List y;
    public List z;

    public static o3d0 h() {
        o3d0 o3d0Var = new o3d0();
        o3d0Var.e = 518;
        o3d0Var.f = TokenTypes.ACK;
        a4d0 a4d0Var = a4d0.u;
        o3d0Var.h = a4d0Var;
        List list = Collections.EMPTY_LIST;
        o3d0Var.j = list;
        o3d0Var.k = a4d0Var;
        o3d0Var.m = list;
        o3d0Var.n = list;
        o3d0Var.o = list;
        o3d0Var.p = i4d0.n;
        o3d0Var.s = list;
        o3d0Var.t = list;
        o3d0Var.u = list;
        o3d0Var.v = list;
        o3d0Var.w = list;
        o3d0Var.x = list;
        o3d0Var.y = list;
        o3d0Var.z = list;
        x2d0 x2d0Var = x2d0.e;
        o3d0Var.A = x2d0Var;
        o3d0Var.B = x2d0Var;
        return o3d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        p3d0 p3d0VarG = g();
        if (p3d0VarG.b()) {
            return p3d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        o3d0 o3d0VarH = h();
        o3d0VarH.i(g());
        return o3d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        p3d0 p3d0Var = null;
        try {
            try {
                p3d0.g1.getClass();
                i(new p3d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                p3d0 p3d0Var2 = (p3d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    p3d0Var = p3d0Var2;
                    if (p3d0Var != null) {
                        i(p3d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (p3d0Var != null) {
                i(p3d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((p3d0) ljtVar);
        return this;
    }

    public final p3d0 g() {
        int i;
        p3d0 p3d0Var = new p3d0(this);
        int i2 = this.d;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        p3d0Var.d = this.e;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        p3d0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 4;
        }
        p3d0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 8;
        }
        p3d0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 16;
        }
        p3d0Var.h = this.i;
        if ((i2 & 32) == 32) {
            this.j = Collections.unmodifiableList(this.j);
            i = this.d & (-33);
            this.d = i;
        } else {
            i = i2;
        }
        p3d0Var.i = this.j;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        p3d0Var.j = this.k;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        p3d0Var.k = this.l;
        if ((i & 256) == 256) {
            this.m = Collections.unmodifiableList(this.m);
            i = this.d & (-257);
            this.d = i;
        }
        p3d0Var.l = this.m;
        if ((i & 512) == 512) {
            this.n = Collections.unmodifiableList(this.n);
            i = this.d & (-513);
            this.d = i;
        }
        p3d0Var.m = this.n;
        if ((i & 1024) == 1024) {
            this.o = Collections.unmodifiableList(this.o);
            i = this.d & (-1025);
            this.d = i;
        }
        p3d0Var.o = this.o;
        if ((i2 & 2048) == 2048) {
            i3 |= 128;
        }
        p3d0Var.p = this.p;
        if ((i2 & 4096) == 4096) {
            i3 |= 256;
        }
        p3d0Var.q = this.q;
        if ((i2 & 8192) == 8192) {
            i3 |= 512;
        }
        p3d0Var.r = this.r;
        if ((i & 16384) == 16384) {
            this.s = Collections.unmodifiableList(this.s);
            i = this.d & (-16385);
            this.d = i;
        }
        p3d0Var.s = this.s;
        if ((i & 32768) == 32768) {
            this.t = Collections.unmodifiableList(this.t);
            i = this.d & (-32769);
            this.d = i;
        }
        p3d0Var.t = this.t;
        if ((i & 65536) == 65536) {
            this.u = Collections.unmodifiableList(this.u);
            i = this.d & (-65537);
            this.d = i;
        }
        p3d0Var.u = this.u;
        if ((i & 131072) == 131072) {
            this.v = Collections.unmodifiableList(this.v);
            i = this.d & (-131073);
            this.d = i;
        }
        p3d0Var.v = this.v;
        if ((i & 262144) == 262144) {
            this.w = Collections.unmodifiableList(this.w);
            i = this.d & (-262145);
            this.d = i;
        }
        p3d0Var.w = this.w;
        if ((i & 524288) == 524288) {
            this.x = Collections.unmodifiableList(this.x);
            i = this.d & (-524289);
            this.d = i;
        }
        p3d0Var.x = this.x;
        if ((i & 1048576) == 1048576) {
            this.y = Collections.unmodifiableList(this.y);
            i = this.d & (-1048577);
            this.d = i;
        }
        p3d0Var.y = this.y;
        if ((i & 2097152) == 2097152) {
            this.z = Collections.unmodifiableList(this.z);
            this.d &= -2097153;
        }
        p3d0Var.z = this.z;
        if ((i2 & 4194304) == 4194304) {
            i3 |= 1024;
        }
        p3d0Var.A = this.A;
        if ((i2 & 8388608) == 8388608) {
            i3 |= 2048;
        }
        p3d0Var.B = this.B;
        p3d0Var.c = i3;
        return p3d0Var;
    }

    public final void i(p3d0 p3d0Var) {
        x2d0 x2d0Var;
        x2d0 x2d0Var2;
        i4d0 i4d0Var;
        a4d0 a4d0Var;
        a4d0 a4d0Var2;
        if (p3d0Var == p3d0.f1) {
            return;
        }
        int i = p3d0Var.c;
        if ((i & 1) == 1) {
            int i2 = p3d0Var.d;
            this.d = 1 | this.d;
            this.e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = p3d0Var.e;
            this.d = 2 | this.d;
            this.f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = p3d0Var.f;
            this.d = 4 | this.d;
            this.g = i4;
        }
        if ((i & 8) == 8) {
            a4d0 a4d0Var3 = p3d0Var.g;
            if ((this.d & 8) != 8 || (a4d0Var2 = this.h) == a4d0.u) {
                this.h = a4d0Var3;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var2);
                z3d0VarT.i(a4d0Var3);
                this.h = z3d0VarT.g();
            }
            this.d |= 8;
        }
        if ((p3d0Var.c & 16) == 16) {
            int i5 = p3d0Var.h;
            this.d = 16 | this.d;
            this.i = i5;
        }
        if (!p3d0Var.i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = p3d0Var.i;
                this.d &= -33;
            } else {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
                this.j.addAll(p3d0Var.i);
            }
        }
        if ((p3d0Var.c & 32) == 32) {
            a4d0 a4d0Var4 = p3d0Var.j;
            if ((this.d & 64) != 64 || (a4d0Var = this.k) == a4d0.u) {
                this.k = a4d0Var4;
            } else {
                z3d0 z3d0VarT2 = a4d0.t(a4d0Var);
                z3d0VarT2.i(a4d0Var4);
                this.k = z3d0VarT2.g();
            }
            this.d |= 64;
        }
        if ((p3d0Var.c & 64) == 64) {
            int i6 = p3d0Var.k;
            this.d |= 128;
            this.l = i6;
        }
        if (!p3d0Var.l.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = p3d0Var.l;
                this.d &= -257;
            } else {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
                this.m.addAll(p3d0Var.l);
            }
        }
        if (!p3d0Var.m.isEmpty()) {
            if (this.n.isEmpty()) {
                this.n = p3d0Var.m;
                this.d &= -513;
            } else {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
                this.n.addAll(p3d0Var.m);
            }
        }
        if (!p3d0Var.o.isEmpty()) {
            if (this.o.isEmpty()) {
                this.o = p3d0Var.o;
                this.d &= -1025;
            } else {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
                this.o.addAll(p3d0Var.o);
            }
        }
        if ((p3d0Var.c & 128) == 128) {
            i4d0 i4d0Var2 = p3d0Var.p;
            if ((this.d & 2048) != 2048 || (i4d0Var = this.p) == i4d0.n) {
                this.p = i4d0Var2;
            } else {
                h4d0 h4d0VarH = h4d0.h();
                h4d0VarH.i(i4d0Var);
                h4d0VarH.i(i4d0Var2);
                this.p = h4d0VarH.g();
            }
            this.d |= 2048;
        }
        int i7 = p3d0Var.c;
        if ((i7 & 256) == 256) {
            int i8 = p3d0Var.q;
            this.d |= 4096;
            this.q = i8;
        }
        if ((i7 & 512) == 512) {
            int i9 = p3d0Var.r;
            this.d |= 8192;
            this.r = i9;
        }
        if (!p3d0Var.s.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = p3d0Var.s;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.s = new ArrayList(this.s);
                    this.d |= 16384;
                }
                this.s.addAll(p3d0Var.s);
            }
        }
        if (!p3d0Var.t.isEmpty()) {
            if (this.t.isEmpty()) {
                this.t = p3d0Var.t;
                this.d &= -32769;
            } else {
                if ((this.d & 32768) != 32768) {
                    this.t = new ArrayList(this.t);
                    this.d |= 32768;
                }
                this.t.addAll(p3d0Var.t);
            }
        }
        if (!p3d0Var.u.isEmpty()) {
            if (this.u.isEmpty()) {
                this.u = p3d0Var.u;
                this.d &= -65537;
            } else {
                if ((this.d & 65536) != 65536) {
                    this.u = new ArrayList(this.u);
                    this.d |= 65536;
                }
                this.u.addAll(p3d0Var.u);
            }
        }
        if (!p3d0Var.v.isEmpty()) {
            if (this.v.isEmpty()) {
                this.v = p3d0Var.v;
                this.d &= -131073;
            } else {
                if ((this.d & 131072) != 131072) {
                    this.v = new ArrayList(this.v);
                    this.d |= 131072;
                }
                this.v.addAll(p3d0Var.v);
            }
        }
        if (!p3d0Var.w.isEmpty()) {
            if (this.w.isEmpty()) {
                this.w = p3d0Var.w;
                this.d &= -262145;
            } else {
                if ((this.d & 262144) != 262144) {
                    this.w = new ArrayList(this.w);
                    this.d |= 262144;
                }
                this.w.addAll(p3d0Var.w);
            }
        }
        if (!p3d0Var.x.isEmpty()) {
            if (this.x.isEmpty()) {
                this.x = p3d0Var.x;
                this.d &= -524289;
            } else {
                if ((this.d & 524288) != 524288) {
                    this.x = new ArrayList(this.x);
                    this.d |= 524288;
                }
                this.x.addAll(p3d0Var.x);
            }
        }
        if (!p3d0Var.y.isEmpty()) {
            if (this.y.isEmpty()) {
                this.y = p3d0Var.y;
                this.d &= -1048577;
            } else {
                if ((this.d & 1048576) != 1048576) {
                    this.y = new ArrayList(this.y);
                    this.d |= 1048576;
                }
                this.y.addAll(p3d0Var.y);
            }
        }
        if (!p3d0Var.z.isEmpty()) {
            if (this.z.isEmpty()) {
                this.z = p3d0Var.z;
                this.d &= -2097153;
            } else {
                if ((this.d & 2097152) != 2097152) {
                    this.z = new ArrayList(this.z);
                    this.d |= 2097152;
                }
                this.z.addAll(p3d0Var.z);
            }
        }
        if ((p3d0Var.c & 1024) == 1024) {
            x2d0 x2d0Var3 = p3d0Var.A;
            if ((this.d & 4194304) != 4194304 || (x2d0Var2 = this.A) == x2d0.e) {
                this.A = x2d0Var3;
            } else {
                w2d0 w2d0VarJ = x2d0.j(x2d0Var2);
                w2d0VarJ.j(x2d0Var3);
                this.A = w2d0VarJ.f();
            }
            this.d |= 4194304;
        }
        if ((p3d0Var.c & 2048) == 2048) {
            x2d0 x2d0Var4 = p3d0Var.B;
            if ((this.d & 8388608) != 8388608 || (x2d0Var = this.B) == x2d0.e) {
                this.B = x2d0Var4;
            } else {
                w2d0 w2d0VarJ2 = x2d0.j(x2d0Var);
                w2d0VarJ2.j(x2d0Var4);
                this.B = w2d0VarJ2.f();
            }
            this.d |= 8388608;
        }
        f(p3d0Var);
        this.f994a = this.f994a.c(p3d0Var.b);
    }
}
