package a;

import kotlin.time.TimeMark;

/* JADX INFO: loaded from: classes.dex */
public final class lef extends pm80 {
    public final pm80 f;
    public final qge g;
    public final long h;
    public final rlq0 i;
    public final boolean j;
    public final cgk0 k;
    public TimeMark l;
    public boolean m;
    public float n;
    public a4d o;
    public pm80 p;
    public final long q;

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    public lef(pm80 pm80Var, pm80 pm80Var2, qge qgeVar, long j, boolean z, boolean z2) {
        qlq0 qlq0Var = qlq0.f28947a;
        this.f = pm80Var2;
        this.g = qgeVar;
        this.h = j;
        this.i = qlq0Var;
        this.j = z;
        this.k = androidx.compose.runtime.e.b(0);
        this.n = 1.0f;
        this.p = pm80Var;
        long jI = pm80Var != null ? pm80Var.i() : 0L;
        long jI2 = pm80Var2 != null ? pm80Var2.i() : 0L;
        boolean z3 = jI != 9205357640488583168L;
        boolean z4 = jI2 != 9205357640488583168L;
        if (z2) {
            if (z4) {
                jI = jI2;
            } else if (!z3) {
                if (z3) {
                    jI = 9205357640488583168L;
                } else {
                    jI = 9205357640488583168L;
                }
            }
        } else if (z3 || !z4) {
            jI = 9205357640488583168L;
        } else {
            jI = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI2 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jI & 4294967295L)), Float.intBitsToFloat((int) (jI2 & 4294967295L))))) & 4294967295L);
        }
        this.q = jI;
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.n = f;
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.o = a4dVar;
        return true;
    }

    @Override // a.pm80
    public final long i() {
        return this.q;
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        boolean z = this.m;
        pm80 pm80Var = this.f;
        if (z) {
            k(fhlVar, pm80Var, this.n);
            return;
        }
        TimeMark timeMarkA = this.l;
        if (timeMarkA == null) {
            timeMarkA = this.i.a();
            this.l = timeMarkA;
        }
        float fE = wen.e(timeMarkA.a()) / wen.e(this.h);
        float fC = l1e0.c(fE, 0.0f, 1.0f);
        float f = this.n;
        float f2 = fC * f;
        if (this.j) {
            f -= f2;
        }
        this.m = fE >= 1.0f;
        k(fhlVar, this.p, f);
        k(fhlVar, pm80Var, f2);
        if (this.m) {
            this.p = null;
        } else {
            cgk0 cgk0Var = this.k;
            cgk0Var.m(cgk0Var.l() + 1);
        }
    }

    public final void k(fhl fhlVar, pm80 pm80Var, float f) {
        if (pm80Var == null || f <= 0.0f) {
            return;
        }
        long jD = fhlVar.d();
        long jI = pm80Var.i();
        long jI2 = (jI == 9205357640488583168L || h7k0.f(jI) || jD == 9205357640488583168L || h7k0.f(jD)) ? jD : q8x.I(jI, this.g.a(jI, jD));
        if (jD == 9205357640488583168L || h7k0.f(jD)) {
            pm80Var.e(fhlVar, jI2, f, this.o);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jD >> 32)) - Float.intBitsToFloat((int) (jI2 >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jD & 4294967295L)) - Float.intBitsToFloat((int) (jI2 & 4294967295L))) / 2.0f;
        ((fvt0) fhlVar.A0().b).u(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            pm80Var.e(fhlVar, jI2, f, this.o);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((fvt0) fhlVar.A0().b).u(f2, f3, f2, f3);
        }
    }
}
