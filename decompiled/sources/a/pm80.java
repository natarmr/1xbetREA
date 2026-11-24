package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class pm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ucs0 f27218a;
    public boolean b;
    public a4d c;
    public float d = 1.0f;
    public k6z e = k6z.f17794a;

    public boolean a(float f) {
        return false;
    }

    public boolean b(a4d a4dVar) {
        return false;
    }

    public final void e(fhl fhlVar, long j, float f, a4d a4dVar) {
        if (this.d != f) {
            if (!a(f)) {
                ucs0 ucs0VarD = this.f27218a;
                if (f == 1.0f) {
                    if (ucs0VarD != null) {
                        ucs0VarD.q(f);
                    }
                    this.b = false;
                } else {
                    if (ucs0VarD == null) {
                        ucs0VarD = saj.D();
                        this.f27218a = ucs0VarD;
                    }
                    ucs0VarD.q(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!Intrinsics.d(this.c, a4dVar)) {
            if (!b(a4dVar)) {
                ucs0 ucs0VarD2 = this.f27218a;
                if (a4dVar == null) {
                    if (ucs0VarD2 != null) {
                        ucs0VarD2.t(null);
                    }
                    this.b = false;
                } else {
                    if (ucs0VarD2 == null) {
                        ucs0VarD2 = saj.D();
                        this.f27218a = ucs0VarD2;
                    }
                    ucs0VarD2.t(a4dVar);
                    this.b = true;
                }
            }
            this.c = a4dVar;
        }
        k6z layoutDirection = fhlVar.getLayoutDirection();
        if (this.e != layoutDirection) {
            d(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((fvt0) fhlVar.A0().b).u(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        jge0 jge0VarR = k9x.r(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        x5a x5aVarI = fhlVar.A0().i();
                        ucs0 ucs0VarD3 = this.f27218a;
                        if (ucs0VarD3 == null) {
                            ucs0VarD3 = saj.D();
                            this.f27218a = ucs0VarD3;
                        }
                        try {
                            x5aVarI.r(jge0VarR, ucs0VarD3);
                            j(fhlVar);
                            x5aVarI.i();
                        } catch (Throwable th) {
                            x5aVarI.i();
                            throw th;
                        }
                    } else {
                        j(fhlVar);
                    }
                }
            } catch (Throwable th2) {
                ((fvt0) fhlVar.A0().b).u(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((fvt0) fhlVar.A0().b).u(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public long i() {
        return 9205357640488583168L;
    }

    public abstract void j(fhl fhlVar);

    public void d(k6z k6zVar) {
    }
}
