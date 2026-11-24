package a;

/* JADX INFO: loaded from: classes.dex */
public interface fhl extends w6k {
    static void C0(fhl fhlVar, w03 w03Var, long j, float f, agc agcVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            agcVar = l0q.f19214a;
        }
        fhlVar.i(w03Var, j, f2, agcVar);
    }

    static void E(fhl fhlVar, long j, float f, long j2, float f2, agc agcVar, int i) {
        if ((i & 2) != 0) {
            f = h7k0.d(fhlVar.d()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = fhlVar.E0();
        }
        fhlVar.A(j, f3, j2, (i & 8) != 0 ? 1.0f : f2, (i & 16) != 0 ? l0q.f19214a : agcVar, (i & 64) != 0 ? 3 : 0);
    }

    static void K0(fhl fhlVar, w03 w03Var, t89 t89Var, float f, agc agcVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            agcVar = l0q.f19214a;
        }
        fhlVar.M0(w03Var, t89Var, f2, agcVar, (i & 32) != 0 ? 3 : 0);
    }

    static void O(fhl fhlVar, ijj0 ijj0Var, float f, long j, vtm0 vtm0Var, int i) {
        if ((i & 2) != 0) {
            f = h7k0.d(fhlVar.d()) / 2.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j = fhlVar.E0();
        }
        long j2 = j;
        agc agcVar = vtm0Var;
        if ((i & 16) != 0) {
            agcVar = l0q.f19214a;
        }
        fhlVar.q0(ijj0Var, f2, j2, agcVar);
    }

    static void Q(fhl fhlVar, long j, long j2, long j3, float f, int i, x03 x03Var, int i2) {
        fhlVar.Z(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : x03Var);
    }

    static void V(fhl fhlVar, long j, float f, float f2, long j2, long j3, float f3, agc agcVar, int i) {
        fhlVar.t(j, f, f2, j2, j3, (i & 64) != 0 ? 1.0f : f3, agcVar);
    }

    static void b0(fhl fhlVar, vz2 vz2Var, long j, long j2, float f, a4d a4dVar, int i, int i2) {
        fhlVar.l(vz2Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, a4dVar, (i2 & 512) != 0 ? 1 : i);
    }

    static void f(fhl fhlVar, t89 t89Var, long j, long j2, long j3, agc agcVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        fhlVar.k0(t89Var, j4, (i & 4) != 0 ? t0(fhlVar.d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? l0q.f19214a : agcVar);
    }

    static void m0(fhl fhlVar, vz2 vz2Var, long j, float f, a4d a4dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        fhlVar.j0(vz2Var, j2, f2, a4dVar, i);
    }

    static void o0(fhl fhlVar, long j, long j2, long j3, long j4, agc agcVar, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = t0(fhlVar.d(), j2);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            agcVar = l0q.f19214a;
        }
        fhlVar.W(j, j2, j3, j4, agcVar, (i & 128) != 0 ? 3 : 0);
    }

    static void r(fhl fhlVar, t89 t89Var, long j, long j2, float f, agc agcVar, a4d a4dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        fhlVar.f0(t89Var, j3, (i2 & 4) != 0 ? t0(fhlVar.d(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? l0q.f19214a : agcVar, (i2 & 32) != 0 ? null : a4dVar, (i2 & 64) != 0 ? 3 : i);
    }

    static long t0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void u(fhl fhlVar, long j, long j2, long j3, float f, vtm0 vtm0Var, a4d a4dVar, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        fhlVar.K(j, j4, (i2 & 4) != 0 ? t0(fhlVar.d(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? l0q.f19214a : vtm0Var, (i2 & 32) != 0 ? null : a4dVar, (i2 & 64) != 0 ? 3 : i);
    }

    void A(long j, float f, long j2, float f2, agc agcVar, int i);

    nr A0();

    default long E0() {
        return p7x.u(A0().p());
    }

    void K(long j, long j2, long j3, float f, agc agcVar, a4d a4dVar, int i);

    void M0(w03 w03Var, t89 t89Var, float f, agc agcVar, int i);

    void W(long j, long j2, long j3, long j4, agc agcVar, int i);

    void Z(long j, long j2, long j3, float f, int i, x03 x03Var);

    default long d() {
        return A0().p();
    }

    void f0(t89 t89Var, long j, long j2, float f, agc agcVar, a4d a4dVar, int i);

    k6z getLayoutDirection();

    void i(w03 w03Var, long j, float f, agc agcVar);

    void j0(vz2 vz2Var, long j, float f, a4d a4dVar, int i);

    void k0(t89 t89Var, long j, long j2, long j3, float f, agc agcVar);

    void l(vz2 vz2Var, long j, long j2, long j3, float f, a4d a4dVar, int i);

    void q(t89 t89Var, long j, agc agcVar);

    void q0(ijj0 ijj0Var, float f, long j, agc agcVar);

    void t(long j, float f, float f2, long j2, long j3, float f3, agc agcVar);
}
