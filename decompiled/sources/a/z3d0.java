package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z3d0 extends fjt {
    public int d;
    public List e;
    public boolean f;
    public int g;
    public a4d0 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public a4d0 n;
    public int o;
    public a4d0 p;
    public int q;
    public int r;
    public List s;

    public static z3d0 h() {
        z3d0 z3d0Var = new z3d0();
        List list = Collections.EMPTY_LIST;
        z3d0Var.e = list;
        a4d0 a4d0Var = a4d0.u;
        z3d0Var.h = a4d0Var;
        z3d0Var.n = a4d0Var;
        z3d0Var.p = a4d0Var;
        z3d0Var.s = list;
        return z3d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        a4d0 a4d0VarG = g();
        if (a4d0VarG.b()) {
            return a4d0VarG;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        z3d0 z3d0VarH = h();
        z3d0VarH.i(g());
        return z3d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        a4d0 a4d0Var = null;
        try {
            try {
                a4d0.v.getClass();
                i(new a4d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                a4d0 a4d0Var2 = (a4d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    a4d0Var = a4d0Var2;
                    if (a4d0Var != null) {
                        i(a4d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (a4d0Var != null) {
                i(a4d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        i((a4d0) ljtVar);
        return this;
    }

    public final a4d0 g() {
        int i;
        a4d0 a4d0Var = new a4d0(this);
        int i2 = this.d;
        if ((i2 & 1) == 1) {
            this.e = Collections.unmodifiableList(this.e);
            i = this.d & (-2);
            this.d = i;
        } else {
            i = i2;
        }
        a4d0Var.d = this.e;
        int i3 = (i2 & 2) != 2 ? 0 : 1;
        a4d0Var.e = this.f;
        if ((i2 & 4) == 4) {
            i3 |= 2;
        }
        a4d0Var.f = this.g;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        a4d0Var.g = this.h;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        a4d0Var.h = this.i;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        a4d0Var.i = this.j;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        a4d0Var.j = this.k;
        if ((i2 & 128) == 128) {
            i3 |= 64;
        }
        a4d0Var.k = this.l;
        if ((i2 & 256) == 256) {
            i3 |= 128;
        }
        a4d0Var.l = this.m;
        if ((i2 & 512) == 512) {
            i3 |= 256;
        }
        a4d0Var.m = this.n;
        if ((i2 & 1024) == 1024) {
            i3 |= 512;
        }
        a4d0Var.n = this.o;
        if ((i2 & 2048) == 2048) {
            i3 |= 1024;
        }
        a4d0Var.o = this.p;
        if ((i2 & 4096) == 4096) {
            i3 |= 2048;
        }
        a4d0Var.p = this.q;
        if ((i2 & 8192) == 8192) {
            i3 |= 4096;
        }
        a4d0Var.q = this.r;
        if ((i & 16384) == 16384) {
            this.s = Collections.unmodifiableList(this.s);
            this.d &= -16385;
        }
        a4d0Var.r = this.s;
        a4d0Var.c = i3;
        return a4d0Var;
    }

    public final z3d0 i(a4d0 a4d0Var) {
        a4d0 a4d0Var2;
        a4d0 a4d0Var3;
        a4d0 a4d0Var4;
        a4d0 a4d0Var5 = a4d0.u;
        if (a4d0Var == a4d0Var5) {
            return this;
        }
        if (!a4d0Var.d.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = a4d0Var.d;
                this.d &= -2;
            } else {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
                this.e.addAll(a4d0Var.d);
            }
        }
        int i = a4d0Var.c;
        if ((i & 1) == 1) {
            boolean z = a4d0Var.e;
            this.d |= 2;
            this.f = z;
        }
        if ((i & 2) == 2) {
            int i2 = a4d0Var.f;
            this.d |= 4;
            this.g = i2;
        }
        if ((i & 4) == 4) {
            a4d0 a4d0Var6 = a4d0Var.g;
            if ((this.d & 8) != 8 || (a4d0Var4 = this.h) == a4d0Var5) {
                this.h = a4d0Var6;
            } else {
                z3d0 z3d0VarT = a4d0.t(a4d0Var4);
                z3d0VarT.i(a4d0Var6);
                this.h = z3d0VarT.g();
            }
            this.d |= 8;
        }
        if ((a4d0Var.c & 8) == 8) {
            int i3 = a4d0Var.h;
            this.d |= 16;
            this.i = i3;
        }
        if (a4d0Var.r()) {
            int i4 = a4d0Var.i;
            this.d |= 32;
            this.j = i4;
        }
        int i5 = a4d0Var.c;
        if ((i5 & 32) == 32) {
            int i6 = a4d0Var.j;
            this.d |= 64;
            this.k = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = a4d0Var.k;
            this.d |= 128;
            this.l = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = a4d0Var.l;
            this.d |= 256;
            this.m = i8;
        }
        if ((i5 & 256) == 256) {
            a4d0 a4d0Var7 = a4d0Var.m;
            if ((this.d & 512) != 512 || (a4d0Var3 = this.n) == a4d0Var5) {
                this.n = a4d0Var7;
            } else {
                z3d0 z3d0VarT2 = a4d0.t(a4d0Var3);
                z3d0VarT2.i(a4d0Var7);
                this.n = z3d0VarT2.g();
            }
            this.d |= 512;
        }
        int i9 = a4d0Var.c;
        if ((i9 & 512) == 512) {
            int i10 = a4d0Var.n;
            this.d |= 1024;
            this.o = i10;
        }
        if ((i9 & 1024) == 1024) {
            a4d0 a4d0Var8 = a4d0Var.o;
            if ((this.d & 2048) != 2048 || (a4d0Var2 = this.p) == a4d0Var5) {
                this.p = a4d0Var8;
            } else {
                z3d0 z3d0VarT3 = a4d0.t(a4d0Var2);
                z3d0VarT3.i(a4d0Var8);
                this.p = z3d0VarT3.g();
            }
            this.d |= 2048;
        }
        int i11 = a4d0Var.c;
        if ((i11 & 2048) == 2048) {
            int i12 = a4d0Var.p;
            this.d |= 4096;
            this.q = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = a4d0Var.q;
            this.d |= 8192;
            this.r = i13;
        }
        if (!a4d0Var.r.isEmpty()) {
            if (this.s.isEmpty()) {
                this.s = a4d0Var.r;
                this.d &= -16385;
            } else {
                if ((this.d & 16384) != 16384) {
                    this.s = new ArrayList(this.s);
                    this.d |= 16384;
                }
                this.s.addAll(a4d0Var.r);
            }
        }
        f(a4d0Var);
        this.f994a = this.f994a.c(a4d0Var.b);
        return this;
    }
}
