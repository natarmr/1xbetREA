package a;

/* JADX INFO: loaded from: classes.dex */
public final class g7z implements fhl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6a f10839a = new a6a();
    public ehl b;

    @Override // a.fhl
    public final void A(long j, float f, long j2, float f2, agc agcVar, int i) {
        this.f10839a.A(j, f, j2, f2, agcVar, i);
    }

    @Override // a.fhl
    public final nr A0() {
        return this.f10839a.b;
    }

    @Override // a.w6k
    public final long B(float f) {
        return this.f10839a.B(f);
    }

    @Override // a.w6k
    public final int B0(long j) {
        return this.f10839a.B0(j);
    }

    @Override // a.fhl
    public final long E0() {
        return this.f10839a.E0();
    }

    @Override // a.w6k
    public final long G0(long j) {
        return this.f10839a.G0(j);
    }

    @Override // a.fhl
    public final void K(long j, long j2, long j3, float f, agc agcVar, a4d a4dVar, int i) {
        this.f10839a.K(j, j2, j3, f, agcVar, a4dVar, i);
    }

    @Override // a.fhl
    public final void M0(w03 w03Var, t89 t89Var, float f, agc agcVar, int i) {
        this.f10839a.M0(w03Var, t89Var, f, agcVar, i);
    }

    @Override // a.w6k
    public final int T(float f) {
        return this.f10839a.T(f);
    }

    @Override // a.fhl
    public final void W(long j, long j2, long j3, long j4, agc agcVar, int i) {
        this.f10839a.W(j, j2, j3, j4, agcVar, i);
    }

    @Override // a.w6k
    public final float X(long j) {
        return this.f10839a.X(j);
    }

    @Override // a.fhl
    public final void Z(long j, long j2, long j3, float f, int i, x03 x03Var) {
        this.f10839a.Z(j, j2, j3, f, i, x03Var);
    }

    public final void a() {
        a6a a6aVar = this.f10839a;
        nr nrVar = a6aVar.b;
        x5a x5aVarI = a6aVar.b.i();
        yzj yzjVar = this.b;
        if (yzjVar == null) {
            throw cs0.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        lm40 lm40Var = (lm40) yzjVar;
        lm40 lm40VarV = lm40Var.f20279a.f;
        if (lm40VarV != null && (lm40VarV.d & 4) != 0) {
            while (true) {
                if (lm40VarV != null) {
                    int i = lm40VarV.c;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            lm40VarV = lm40VarV.f;
                        }
                    }
                }
                lm40VarV = null;
                break;
            }
        } else {
            lm40VarV = null;
            break;
        }
        if (lm40VarV == null) {
            s460 s460VarX = vcc.X(yzjVar, 4);
            if (s460VarX.g1() == lm40Var.f20279a) {
                s460VarX = s460VarX.v;
                s460VarX.getClass();
            }
            s460VarX.w1(x5aVarI, (dfv) nrVar.c);
            return;
        }
        xz40 xz40Var = null;
        while (lm40VarV != null) {
            if (lm40VarV instanceof ehl) {
                ehl ehlVar = (ehl) lm40VarV;
                dfv dfvVar = (dfv) nrVar.c;
                s460 s460VarX2 = vcc.X(ehlVar, 4);
                long jQ = n2x.Q(s460VarX2.c);
                e7z e7zVar = s460VarX2.u;
                e7zVar.getClass();
                h7z.a(e7zVar).getSharedDrawScope().b(x5aVarI, jQ, s460VarX2, ehlVar, dfvVar);
            } else if ((lm40VarV.c & 4) != 0 && (lm40VarV instanceof f3k)) {
                int i2 = 0;
                for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                    if ((lm40Var2.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            lm40VarV = lm40Var2;
                        } else {
                            if (xz40Var == null) {
                                xz40Var = new xz40(new lm40[16]);
                            }
                            if (lm40VarV != null) {
                                xz40Var.b(lm40VarV);
                                lm40VarV = null;
                            }
                            xz40Var.b(lm40Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            lm40VarV = vcc.V(xz40Var);
        }
    }

    public final void b(x5a x5aVar, long j, s460 s460Var, ehl ehlVar, dfv dfvVar) {
        ehl ehlVar2 = this.b;
        this.b = ehlVar;
        k6z k6zVar = s460Var.u.A;
        nr nrVar = this.f10839a.b;
        w6k w6kVarJ = nrVar.j();
        k6z k6zVarO = nrVar.o();
        x5a x5aVarI = nrVar.i();
        long jP = nrVar.p();
        dfv dfvVar2 = (dfv) nrVar.c;
        nrVar.F(s460Var);
        nrVar.G(k6zVar);
        nrVar.E(x5aVar);
        nrVar.H(j);
        nrVar.c = dfvVar;
        x5aVar.l();
        try {
            ehlVar.u0(this);
            x5aVar.i();
            nrVar.F(w6kVarJ);
            nrVar.G(k6zVarO);
            nrVar.E(x5aVarI);
            nrVar.H(jP);
            nrVar.c = dfvVar2;
            this.b = ehlVar2;
        } catch (Throwable th) {
            x5aVar.i();
            nrVar.F(w6kVarJ);
            nrVar.G(k6zVarO);
            nrVar.E(x5aVarI);
            nrVar.H(jP);
            nrVar.c = dfvVar2;
            throw th;
        }
    }

    @Override // a.fhl
    public final long d() {
        return this.f10839a.d();
    }

    @Override // a.fhl
    public final void f0(t89 t89Var, long j, long j2, float f, agc agcVar, a4d a4dVar, int i) {
        this.f10839a.f0(t89Var, j, j2, f, agcVar, a4dVar, i);
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f10839a.getDensity();
    }

    @Override // a.fhl
    public final k6z getLayoutDirection() {
        return this.f10839a.f308a.b;
    }

    @Override // a.fhl
    public final void i(w03 w03Var, long j, float f, agc agcVar) {
        this.f10839a.i(w03Var, j, f, agcVar);
    }

    @Override // a.fhl
    public final void j0(vz2 vz2Var, long j, float f, a4d a4dVar, int i) {
        this.f10839a.j0(vz2Var, j, f, a4dVar, i);
    }

    @Override // a.fhl
    public final void k0(t89 t89Var, long j, long j2, long j3, float f, agc agcVar) {
        this.f10839a.k0(t89Var, j, j2, j3, f, agcVar);
    }

    @Override // a.fhl
    public final void l(vz2 vz2Var, long j, long j2, long j3, float f, a4d a4dVar, int i) {
        this.f10839a.l(vz2Var, j, j2, j3, f, a4dVar, i);
    }

    @Override // a.w6k
    public final long o(float f) {
        return this.f10839a.o(f);
    }

    @Override // a.w6k
    public final long p(long j) {
        return this.f10839a.p(j);
    }

    @Override // a.fhl
    public final void q(t89 t89Var, long j, agc agcVar) {
        this.f10839a.q(t89Var, j, agcVar);
    }

    @Override // a.fhl
    public final void q0(ijj0 ijj0Var, float f, long j, agc agcVar) {
        this.f10839a.q0(ijj0Var, f, j, agcVar);
    }

    @Override // a.w6k
    public final float r0(int i) {
        return this.f10839a.r0(i);
    }

    @Override // a.w6k
    public final float s(long j) {
        return this.f10839a.s(j);
    }

    @Override // a.w6k
    public final float s0(float f) {
        return f / this.f10839a.getDensity();
    }

    @Override // a.fhl
    public final void t(long j, float f, float f2, long j2, long j3, float f3, agc agcVar) {
        this.f10839a.t(j, f, f2, j2, j3, f3, agcVar);
    }

    @Override // a.w6k
    public final float v0() {
        return this.f10839a.v0();
    }

    @Override // a.w6k
    public final float w0(float f) {
        return this.f10839a.getDensity() * f;
    }

    @Override // a.w6k
    public final long z(int i) {
        return this.f10839a.z(i);
    }
}
