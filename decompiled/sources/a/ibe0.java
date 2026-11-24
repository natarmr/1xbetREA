package a;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ibe0 implements e1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14483a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public ibe0(e1x e1xVar) {
        this.c = new Object();
        this.f14483a = 0;
        this.b = false;
        this.g = new nyw((Object) this, (byte) 2);
        this.d = e1xVar;
        this.e = e1xVar.getSurface();
    }

    public static ibe0 c(ibe0 ibe0Var, int i, o1x o1xVar, int i2) {
        if ((i2 & 1) != 0) {
            i = ibe0Var.f14483a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            o1xVar = (o1x) ibe0Var.d;
        }
        f7k0 f7k0Var = (f7k0) ibe0Var.f;
        return new ibe0((o1x) ibe0Var.c, (List) ibe0Var.e, i3, o1xVar, f7k0Var, (gqw0) ibe0Var.g, ibe0Var.b);
    }

    @Override // a.e1x
    public int G() {
        int iG;
        synchronized (this.c) {
            iG = ((e1x) this.d).G();
        }
        return iG;
    }

    public void a(o1x o1xVar, tlx tlxVar) {
        Context context = o1xVar.f24504a;
        o1x o1xVar2 = (o1x) this.c;
        if (context != o1xVar2.f24504a) {
            c99.t(tlxVar, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (o1xVar.b == i860.f14324a) {
            c99.t(tlxVar, "' cannot set the request's data to null.", "Interceptor '");
        } else if (o1xVar.c != o1xVar2.c) {
            c99.t(tlxVar, "' cannot modify the request's target.", "Interceptor '");
        } else {
            if (o1xVar.r == o1xVar2.r) {
                return;
            }
            c99.t(tlxVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    @Override // a.e1x
    public b1x b() {
        oyw oywVar;
        synchronized (this.c) {
            b1x b1xVarB = ((e1x) this.d).b();
            if (b1xVarB != null) {
                this.f14483a++;
                oywVar = new oyw(b1xVarB);
                oywVar.a((nyw) this.g);
            } else {
                oywVar = null;
            }
        }
        return oywVar;
    }

    @Override // a.e1x
    public b1x b0() {
        oyw oywVar;
        synchronized (this.c) {
            b1x b1xVarB0 = ((e1x) this.d).b0();
            if (b1xVarB0 != null) {
                this.f14483a++;
                oywVar = new oyw(b1xVarB0);
                oywVar.a((nyw) this.g);
            } else {
                oywVar = null;
            }
        }
        return oywVar;
    }

    @Override // a.e1x
    public void close() {
        synchronized (this.c) {
            try {
                Surface surface = (Surface) this.e;
                if (surface != null) {
                    surface.release();
                }
                ((e1x) this.d).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object d(zje zjeVar) {
        hbe0 hbe0Var;
        tlx tlxVar;
        int i = this.f14483a;
        if (zjeVar instanceof hbe0) {
            hbe0Var = (hbe0) zjeVar;
            int i2 = hbe0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hbe0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                hbe0Var = new hbe0(this, zjeVar);
            }
        } else {
            hbe0Var = new hbe0(this, zjeVar);
        }
        Object obj = hbe0Var.j;
        Object obj2 = wne.f39444a;
        int i3 = hbe0Var.l;
        if (i3 == 0) {
            z1x.P(obj);
            tlx tlxVar2 = (tlx) ((List) this.e).get(i);
            ibe0 ibe0VarC = c(this, i + 1, null, 6);
            hbe0Var.i = tlxVar2;
            hbe0Var.l = 1;
            Object objA = tlxVar2.a(ibe0VarC, hbe0Var);
            if (objA == obj2) {
                return obj2;
            }
            tlxVar = tlxVar2;
            obj = objA;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tlxVar = hbe0Var.i;
            z1x.P(obj);
        }
        u1x u1xVar = (u1x) obj;
        a(u1xVar.getRequest(), tlxVar);
        return u1xVar;
    }

    public void e() {
        synchronized (this.c) {
            try {
                this.b = true;
                ((e1x) this.d).k();
                if (this.f14483a == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.e1x
    public int f() {
        int iF;
        synchronized (this.c) {
            iF = ((e1x) this.d).f();
        }
        return iF;
    }

    public ibe0 g(o1x o1xVar) {
        int i = this.f14483a;
        if (i > 0) {
            a(o1xVar, (tlx) ((List) this.e).get(i - 1));
        }
        return c(this, 0, o1xVar, 5);
    }

    @Override // a.e1x
    public Surface getSurface() {
        Surface surface;
        synchronized (this.c) {
            surface = ((e1x) this.d).getSurface();
        }
        return surface;
    }

    @Override // a.e1x
    public int h() {
        int iH;
        synchronized (this.c) {
            iH = ((e1x) this.d).h();
        }
        return iH;
    }

    @Override // a.e1x
    public int j() {
        int iJ;
        synchronized (this.c) {
            iJ = ((e1x) this.d).j();
        }
        return iJ;
    }

    @Override // a.e1x
    public void k() {
        synchronized (this.c) {
            ((e1x) this.d).k();
        }
    }

    @Override // a.e1x
    public void o(d1x d1xVar, Executor executor) {
        synchronized (this.c) {
            ((e1x) this.d).o(new uq((Object) this, (Object) d1xVar, (byte) 29), executor);
        }
    }

    public ibe0(o1x o1xVar, List list, int i, o1x o1xVar2, f7k0 f7k0Var, gqw0 gqw0Var, boolean z) {
        this.c = o1xVar;
        this.e = list;
        this.f14483a = i;
        this.d = o1xVar2;
        this.f = f7k0Var;
        this.g = gqw0Var;
        this.b = z;
    }
}
