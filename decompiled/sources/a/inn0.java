package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class inn0 implements w6k, yje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jnn0 f15083a;
    public final n5a b;
    public n5a c;
    public xoa0 d = xoa0.b;
    public final kotlin.coroutines.g e = kotlin.coroutines.g.f46065a;
    public final /* synthetic */ jnn0 f;

    public inn0(jnn0 jnn0Var, n5a n5aVar) {
        this.f = jnn0Var;
        this.f15083a = jnn0Var;
        this.b = n5aVar;
    }

    @Override // a.w6k
    public final long B(float f) {
        return this.f15083a.B(f);
    }

    @Override // a.w6k
    public final int B0(long j) {
        return this.f15083a.B0(j);
    }

    @Override // a.w6k
    public final long G0(long j) {
        return this.f15083a.G0(j);
    }

    @Override // a.w6k
    public final int T(float f) {
        return this.f15083a.T(f);
    }

    @Override // a.w6k
    public final float X(long j) {
        return this.f15083a.X(j);
    }

    public final Object a(xoa0 xoa0Var, yje yjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        this.d = xoa0Var;
        this.c = n5aVar;
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    public final long c() {
        jnn0 jnn0Var = this.f;
        long jG0 = jnn0Var.G0(vcc.Z(jnn0Var).B.f());
        long j = jnn0Var.x;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jG0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jG0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final wgu0 e() {
        return vcc.Z(this.f).B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, Function2 function2, zw5 zw5Var) throws Throwable {
        gnn0 gnn0Var;
        Throwable th;
        c4m0 c4m0Var;
        n5a n5aVar;
        if (zw5Var instanceof gnn0) {
            gnn0Var = (gnn0) zw5Var;
            int i = gnn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gnn0Var.l = i - Integer.MIN_VALUE;
            } else {
                gnn0Var = new gnn0(this, zw5Var);
            }
        } else {
            gnn0Var = new gnn0(this, zw5Var);
        }
        Object objInvoke = gnn0Var.j;
        Object obj = wne.f39444a;
        int i2 = gnn0Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c4m0Var = gnn0Var.i;
            try {
                z1x.P(objInvoke);
                c4m0Var.cancel(g5a.b);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                c4m0Var.cancel(g5a.b);
                throw th;
            }
        }
        z1x.P(objInvoke);
        if (j <= 0 && (n5aVar = this.c) != null) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(new g0g0(new yoa0(j)));
        }
        c4m0 c4m0VarW = qjj.W(this.f.N0(), null, null, new hu3(j, this, (yje) null), 3);
        try {
            gnn0Var.i = c4m0VarW;
            gnn0Var.l = 1;
            objInvoke = function2.invoke(this, gnn0Var);
            if (objInvoke == obj) {
                return obj;
            }
            c4m0Var = c4m0VarW;
            c4m0Var.cancel(g5a.b);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            c4m0Var = c4m0VarW;
            c4m0Var.cancel(g5a.b);
            throw th;
        }
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f15083a.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j, Function2 function2, zje zjeVar) {
        hnn0 hnn0Var;
        if (zjeVar instanceof hnn0) {
            hnn0Var = (hnn0) zjeVar;
            int i = hnn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnn0Var.k = i - Integer.MIN_VALUE;
            } else {
                hnn0Var = new hnn0(this, zjeVar);
            }
        } else {
            hnn0Var = new hnn0(this, zjeVar);
        }
        Object obj = hnn0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = hnn0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                hnn0Var.k = 1;
                Object objG = g(j, function2, hnn0Var);
                return objG == obj2 ? obj2 : objG;
            }
            if (i2 == 1) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (yoa0 unused) {
            return null;
        }
    }

    @Override // a.w6k
    public final long o(float f) {
        return this.f15083a.o(f);
    }

    @Override // a.w6k
    public final long p(long j) {
        return this.f15083a.p(j);
    }

    @Override // a.w6k
    public final float r0(int i) {
        return this.f15083a.r0(i);
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        jnn0 jnn0Var = this.f;
        synchronized (jnn0Var.u) {
            jnn0Var.t.j(this);
        }
        this.b.resumeWith(obj);
    }

    @Override // a.w6k
    public final float s(long j) {
        return this.f15083a.s(j);
    }

    @Override // a.w6k
    public final float s0(float f) {
        return f / this.f15083a.getDensity();
    }

    @Override // a.w6k
    public final float v0() {
        return this.f15083a.v0();
    }

    @Override // a.w6k
    public final float w0(float f) {
        return this.f15083a.getDensity() * f;
    }

    @Override // a.w6k
    public final long z(int i) {
        return this.f15083a.z(i);
    }
}
