package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class c9d0 extends f3k implements vj50 {
    public boolean q;
    public Function0 r;
    public boolean s;
    public d9d0 t;
    public float u;
    public final ek50 v = new ek50(this, null);
    public final agk0 w = androidx.compose.runtime.e.a(0.0f);
    public final agk0 x = androidx.compose.runtime.e.a(0.0f);

    public c9d0(boolean z, Function0 function0, boolean z2, d9d0 d9d0Var, float f) {
        this.q = z;
        this.r = function0;
        this.s = z2;
        this.t = d9d0Var;
        this.u = f;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        if (!this.t.f5695a.e() && this.s && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return e1(j);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.vj50
    public final Object I0(long j, yje yjeVar) {
        a9d0 a9d0Var;
        if (yjeVar instanceof a9d0) {
            a9d0Var = (a9d0) yjeVar;
            int i = a9d0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a9d0Var.k = i - Integer.MIN_VALUE;
            } else {
                a9d0Var = new a9d0(this, (zje) yjeVar);
            }
        } else {
            a9d0Var = new a9d0(this, (zje) yjeVar);
        }
        Object objG1 = a9d0Var.i;
        Object obj = wne.f39444a;
        int i2 = a9d0Var.k;
        if (i2 == 0) {
            z1x.P(objG1);
            float fC = g6u0.c(j);
            a9d0Var.k = 1;
            objG1 = g1(fC, a9d0Var);
            if (objG1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG1);
        }
        return new g6u0(wpm0.g(0.0f, ((Number) objG1).floatValue()));
    }

    @Override // a.lm40
    public final boolean O0() {
        return false;
    }

    @Override // a.lm40
    public final void R0() {
        Z0(this.v);
        qjj.W(N0(), null, null, new z8d0(this, null, (byte) 0), 3);
        i1(this.q ? f1() : 0.0f);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (this.t.f5695a.e() || !this.s) {
            return 0L;
        }
        byte b = 1;
        if (i != 1) {
            return 0L;
        }
        long jE1 = e1(j2);
        qjj.W(N0(), null, null, new z8d0(this, null, b), 3);
        return jE1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object c1(zje zjeVar) {
        x8d0 x8d0Var;
        if (zjeVar instanceof x8d0) {
            x8d0Var = (x8d0) zjeVar;
            int i = x8d0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8d0Var.k = i - Integer.MIN_VALUE;
            } else {
                x8d0Var = new x8d0(this, zjeVar);
            }
        } else {
            x8d0Var = new x8d0(this, zjeVar);
        }
        Object obj = x8d0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = x8d0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                d9d0 d9d0Var = this.t;
                x8d0Var.k = 1;
                if (d9d0Var.a(x8d0Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            h1(0.0f);
            i1(0.0f);
            this = Unit.f46060a;
            return this;
        } catch (Throwable th) {
            this.h1(0.0f);
            this.i1(0.0f);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d1(zje zjeVar) {
        y8d0 y8d0Var;
        if (zjeVar instanceof y8d0) {
            y8d0Var = (y8d0) zjeVar;
            int i = y8d0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8d0Var.k = i - Integer.MIN_VALUE;
            } else {
                y8d0Var = new y8d0(this, zjeVar);
            }
        } else {
            y8d0Var = new y8d0(this, zjeVar);
        }
        y8d0 y8d0Var2 = y8d0Var;
        Object obj = y8d0Var2.i;
        Object obj2 = wne.f39444a;
        int i2 = y8d0Var2.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                d9d0 d9d0Var = this.t;
                y8d0Var2.k = 1;
                Object objA = t33.a(d9d0Var.f5695a, new Float(1.0f), null, null, null, y8d0Var2, 14);
                if (objA != obj2) {
                    objA = Unit.f46060a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            if (this.n) {
                h1(f1());
                i1(f1());
            }
            return Unit.f46060a;
        } catch (Throwable th) {
            if (!this.n) {
                throw th;
            }
            h1(f1());
            i1(f1());
            throw th;
        }
    }

    public final long e1(long j) {
        float fL;
        float fF1;
        if (this.q) {
            fL = 0.0f;
        } else {
            agk0 agk0Var = this.x;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + agk0Var.l();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fL = fIntBitsToFloat - agk0Var.l();
            h1(fIntBitsToFloat);
            if (agk0Var.l() * 0.5f <= f1()) {
                fF1 = agk0Var.l() * 0.5f;
            } else {
                float fC = l1e0.c(Math.abs((agk0Var.l() * 0.5f) / f1()) - 1.0f, 0.0f, 2.0f);
                fF1 = f1() + (f1() * (fC - (((float) Math.pow(fC, 2.0d)) / 4.0f)));
            }
            i1(fF1);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fL)) & 4294967295L);
    }

    public final int f1() {
        return vcc.Z(this).z.T(this.u);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g1(float f, zje zjeVar) {
        b9d0 b9d0Var;
        if (zjeVar instanceof b9d0) {
            b9d0Var = (b9d0) zjeVar;
            int i = b9d0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                b9d0Var.l = i - Integer.MIN_VALUE;
            } else {
                b9d0Var = new b9d0(this, zjeVar);
            }
        } else {
            b9d0Var = new b9d0(this, zjeVar);
        }
        Object obj = b9d0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = b9d0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.q) {
                return new Float(0.0f);
            }
            agk0 agk0Var = this.x;
            if (agk0Var.l() * 0.5f > f1()) {
                this.r.invoke();
            }
            if (agk0Var.l() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            b9d0Var.i = f;
            b9d0Var.l = 1;
            if (c1(b9d0Var) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = b9d0Var.i;
            z1x.P(obj);
        }
        h1(0.0f);
        return new Float(f);
    }

    public final void h1(float f) {
        this.x.m(f);
    }

    public final void i1(float f) {
        this.w.m(f);
    }
}
