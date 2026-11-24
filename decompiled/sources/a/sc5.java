package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sc5 extends lm40 implements ehl, fe60, qai0 {
    public long o;
    public t89 p;
    public float q;
    public yjj0 r;
    public long s;
    public k6z t;
    public x1x u;
    public yjj0 v;
    public x1x w;

    @Override // a.fe60
    public final void R() {
        this.s = 9205357640488583168L;
        this.t = null;
        this.u = null;
        this.v = null;
        vfc.J(this);
    }

    @Override // a.qai0
    public final boolean e() {
        return false;
    }

    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        x1x x1xVar;
        t89 t89Var;
        w03 w03Var;
        a6a a6aVar = g7zVar.f10839a;
        if (this.r == jd8.n) {
            if (!h2t0.a(this.o, y3d.g)) {
                fhl.u(g7zVar, this.o, 0L, 0L, 0.0f, null, null, 0, 126);
            }
            t89 t89Var2 = this.p;
            if (t89Var2 != null) {
                fhl.r(g7zVar, t89Var2, 0L, 0L, this.q, null, null, 0, 118);
            }
        } else {
            if (h7k0.b(a6aVar.d(), this.s) && g7zVar.getLayoutDirection() == this.t && Intrinsics.d(this.v, this.r)) {
                x1xVar = this.u;
                x1xVar.getClass();
            } else {
                c9x.B(this, new gj4(this, g7zVar, (byte) 8));
                x1xVar = this.w;
                this.w = null;
            }
            this.u = x1xVar;
            this.s = a6aVar.d();
            this.t = g7zVar.getLayoutDirection();
            this.v = this.r;
            x1xVar.getClass();
            if (!h2t0.a(this.o, y3d.g)) {
                z1x.E(g7zVar, x1xVar, this.o);
            }
            t89 t89Var3 = this.p;
            if (t89Var3 != null) {
                float f = this.q;
                boolean z = x1xVar instanceof oe80;
                l0q l0qVar = l0q.f19214a;
                if (z) {
                    jge0 jge0Var = ((oe80) x1xVar).f25111a;
                    float f2 = jge0Var.f16474a;
                    g7zVar.f0(t89Var3, (4294967295L & ((long) Float.floatToRawIntBits(jge0Var.b))) | (Float.floatToRawIntBits(f2) << 32), z1x.O(jge0Var), f, l0qVar, null, 3);
                } else {
                    if (x1xVar instanceof pe80) {
                        pe80 pe80Var = (pe80) x1xVar;
                        t89Var = t89Var3;
                        w03Var = pe80Var.b;
                        if (w03Var == null) {
                            wfg0 wfg0Var = pe80Var.f26840a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (wfg0Var.h >> 32));
                            float f3 = wfg0Var.f39069a;
                            g7zVar.k0(t89Var, (((long) Float.floatToRawIntBits(wfg0Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (((long) Float.floatToRawIntBits(wfg0Var.b())) << 32) | (((long) Float.floatToRawIntBits(wfg0Var.a())) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f, l0qVar);
                        }
                    } else if (!(x1xVar instanceof ne80)) {
                        t9f.b();
                        return;
                    } else {
                        t89Var = t89Var3;
                        w03Var = ((ne80) x1xVar).f23373a;
                    }
                    g7zVar.M0(w03Var, t89Var, f, l0qVar, 3);
                }
            }
        }
        g7zVar.a();
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
        yai0.g(abi0Var, this.r);
    }
}
