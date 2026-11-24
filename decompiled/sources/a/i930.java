package a;

import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;

/* JADX INFO: loaded from: classes.dex */
public final class i930 extends hrv0 {
    public final boolean l;
    public final Timeline$Window m;
    public final amq0 n;
    public g930 o;
    public f930 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public i930(e06 e06Var, boolean z) {
        super(e06Var);
        this.l = z && e06Var.h();
        this.m = new Timeline$Window();
        this.n = new amq0();
        bmq0 bmq0VarF = e06Var.f();
        if (bmq0VarF == null) {
            this.o = new g930(new h930(e06Var.g()), Timeline$Window.p, g930.e);
        } else {
            this.o = new g930(bmq0VarF, null, null);
            this.s = true;
        }
    }

    @Override // a.e06
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final f930 a(vn30 vn30Var, lhf0 lhf0Var, long j) {
        f930 f930Var = new f930(vn30Var, lhf0Var, j);
        x0x.K(f930Var.d == null);
        e06 e06Var = this.k;
        f930Var.d = e06Var;
        if (!this.r) {
            this.p = f930Var;
            if (!this.q) {
                this.q = true;
                w(null, e06Var);
            }
            return f930Var;
        }
        Object obj = vn30Var.f37698a;
        if (this.o.d != null && obj.equals(g930.e)) {
            obj = this.o.d;
        }
        f930Var.i(vn30Var.a(obj));
        return f930Var;
    }

    public final boolean B(long j) {
        f930 f930Var = this.p;
        int iB = this.o.b(f930Var.f9136a.f37698a);
        if (iB == -1) {
            return false;
        }
        g930 g930Var = this.o;
        amq0 amq0Var = this.n;
        g930Var.f(iB, amq0Var, false);
        long j2 = amq0Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        f930Var.g = j;
        return true;
    }

    @Override // a.e06
    public final void m(mn30 mn30Var) {
        f930 f930Var = (f930) mn30Var;
        if (f930Var.e != null) {
            e06 e06Var = f930Var.d;
            e06Var.getClass();
            e06Var.m(f930Var.e);
        }
        if (mn30Var == this.p) {
            this.p = null;
        }
    }

    @Override // a.gld, a.e06
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // a.e06
    public final void r(MediaItem mediaItem) {
        if (this.s) {
            g930 g930Var = this.o;
            bmq0 bmq0Var = g930Var.b;
            this.o = new g930(bmq0Var instanceof cmq0 ? new cmq0(((cmq0) bmq0Var).b, mediaItem) : new cmq0(bmq0Var, mediaItem), g930Var.c, g930Var.d);
        } else {
            this.o = new g930(new h930(mediaItem), Timeline$Window.p, g930.e);
        }
        this.k.r(mediaItem);
    }

    @Override // a.hrv0
    public final vn30 x(vn30 vn30Var) {
        Object obj = vn30Var.f37698a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = g930.e;
        }
        return vn30Var.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // a.hrv0
    public final void y(bmq0 bmq0Var) {
        long j;
        g930 g930Var;
        vn30 vn30VarA;
        g930 g930Var2;
        if (this.r) {
            g930 g930Var3 = this.o;
            this.o = new g930(bmq0Var, g930Var3.c, g930Var3.d);
            f930 f930Var = this.p;
            if (f930Var != null) {
                B(f930Var.g);
            }
        } else {
            if (!bmq0Var.p()) {
                Timeline$Window timeline$Window = this.m;
                bmq0Var.n(0, timeline$Window);
                long j2 = timeline$Window.k;
                Object obj = timeline$Window.f45385a;
                f930 f930Var2 = this.p;
                amq0 amq0Var = this.n;
                if (f930Var2 != null) {
                    long j3 = f930Var2.b;
                    this.o.g(f930Var2.f9136a.f37698a, amq0Var);
                    long j4 = amq0Var.e + j3;
                    this.o.m(0, timeline$Window, 0L);
                    if (j4 != timeline$Window.k) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = bmq0Var.i(timeline$Window, amq0Var, 0, j);
                Object obj2 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    g930 g930Var4 = this.o;
                    g930Var = new g930(bmq0Var, g930Var4.c, g930Var4.d);
                } else {
                    g930Var = new g930(bmq0Var, obj, obj2);
                }
                this.o = g930Var;
                f930 f930Var3 = this.p;
                if (f930Var3 != null && B(jLongValue)) {
                    vn30 vn30Var = f930Var3.f9136a;
                    Object obj3 = vn30Var.f37698a;
                    if (this.o.d != null && obj3.equals(g930.e)) {
                        obj3 = this.o.d;
                    }
                    vn30VarA = vn30Var.a(obj3);
                }
                this.s = true;
                this.r = true;
                l(this.o);
                if (vn30VarA != null) {
                    f930 f930Var4 = this.p;
                    f930Var4.getClass();
                    f930Var4.i(vn30VarA);
                }
            }
            if (this.s) {
                g930 g930Var5 = this.o;
                g930Var2 = new g930(bmq0Var, g930Var5.c, g930Var5.d);
            } else {
                g930Var2 = new g930(bmq0Var, Timeline$Window.p, g930.e);
            }
            this.o = g930Var2;
        }
        vn30VarA = null;
        this.s = true;
        this.r = true;
        l(this.o);
        if (vn30VarA != null) {
            f930 f930Var5 = this.p;
            f930Var5.getClass();
            f930Var5.i(vn30VarA);
        }
    }

    @Override // a.hrv0
    public final void z() {
        if (this.l) {
            return;
        }
        this.q = true;
        w(null, this.k);
    }
}
