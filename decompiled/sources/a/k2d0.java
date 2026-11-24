package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k2d0 extends ajt implements e540 {
    public int b;
    public l2d0 c;
    public long d;
    public float e;
    public double f;
    public int g;
    public int h;
    public int i;
    public p2d0 j;
    public List k;
    public int l;
    public int m;

    public static k2d0 g() {
        k2d0 k2d0Var = new k2d0();
        k2d0Var.c = l2d0.BYTE;
        k2d0Var.j = p2d0.g;
        k2d0Var.k = Collections.EMPTY_LIST;
        return k2d0Var;
    }

    @Override // a.ajt
    public final z3 c() {
        m2d0 m2d0VarF = f();
        if (m2d0VarF.b()) {
            return m2d0VarF;
        }
        throw new ss3((byte) 28);
    }

    public final Object clone() {
        k2d0 k2d0VarG = g();
        k2d0VarG.h(f());
        return k2d0VarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        m2d0 m2d0Var = null;
        try {
            try {
                m2d0.q.getClass();
                h(new m2d0(pycVar, ssoVar));
                return this;
            } catch (aox e) {
                m2d0 m2d0Var2 = (m2d0) e.f1223a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    m2d0Var = m2d0Var2;
                    if (m2d0Var != null) {
                        h(m2d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (m2d0Var != null) {
                h(m2d0Var);
            }
            throw th;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        h((m2d0) ljtVar);
        return this;
    }

    public final m2d0 f() {
        m2d0 m2d0Var = new m2d0(this);
        int i = this.b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        m2d0Var.c = this.c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        m2d0Var.d = this.d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        m2d0Var.e = this.e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        m2d0Var.f = this.f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        m2d0Var.g = this.g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        m2d0Var.h = this.h;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        m2d0Var.i = this.i;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        m2d0Var.j = this.j;
        if ((i & 256) == 256) {
            this.k = Collections.unmodifiableList(this.k);
            this.b &= -257;
        }
        m2d0Var.k = this.k;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        m2d0Var.l = this.l;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        m2d0Var.m = this.m;
        m2d0Var.b = i2;
        return m2d0Var;
    }

    public final void h(m2d0 m2d0Var) {
        p2d0 p2d0Var;
        if (m2d0Var == m2d0.p) {
            return;
        }
        if ((m2d0Var.b & 1) == 1) {
            l2d0 l2d0Var = m2d0Var.c;
            l2d0Var.getClass();
            this.b = 1 | this.b;
            this.c = l2d0Var;
        }
        int i = m2d0Var.b;
        if ((i & 2) == 2) {
            long j = m2d0Var.d;
            this.b |= 2;
            this.d = j;
        }
        if ((i & 4) == 4) {
            float f = m2d0Var.e;
            this.b = 4 | this.b;
            this.e = f;
        }
        if ((i & 8) == 8) {
            double d = m2d0Var.f;
            this.b |= 8;
            this.f = d;
        }
        if ((i & 16) == 16) {
            int i2 = m2d0Var.g;
            this.b = 16 | this.b;
            this.g = i2;
        }
        if ((i & 32) == 32) {
            int i3 = m2d0Var.h;
            this.b = 32 | this.b;
            this.h = i3;
        }
        if ((i & 64) == 64) {
            int i4 = m2d0Var.i;
            this.b = 64 | this.b;
            this.i = i4;
        }
        if ((i & 128) == 128) {
            p2d0 p2d0Var2 = m2d0Var.j;
            if ((this.b & 128) != 128 || (p2d0Var = this.j) == p2d0.g) {
                this.j = p2d0Var2;
            } else {
                o2d0 o2d0Var = new o2d0((byte) 0);
                o2d0Var.d = Collections.EMPTY_LIST;
                o2d0Var.h(p2d0Var);
                o2d0Var.h(p2d0Var2);
                this.j = o2d0Var.f();
            }
            this.b |= 128;
        }
        if (!m2d0Var.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = m2d0Var.k;
                this.b &= -257;
            } else {
                if ((this.b & 256) != 256) {
                    this.k = new ArrayList(this.k);
                    this.b |= 256;
                }
                this.k.addAll(m2d0Var.k);
            }
        }
        int i5 = m2d0Var.b;
        if ((i5 & 256) == 256) {
            int i6 = m2d0Var.l;
            this.b |= 512;
            this.l = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = m2d0Var.m;
            this.b |= 1024;
            this.m = i7;
        }
        this.f994a = this.f994a.c(m2d0Var.f21052a);
    }
}
