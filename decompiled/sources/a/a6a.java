package a;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a6a implements fhl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5a f308a;
    public final nr b;
    public ucs0 c;
    public ucs0 d;

    public a6a() {
        z6k z6kVar = dj8.h;
        k6z k6zVar = k6z.f17794a;
        z5a z5aVar = new z5a();
        z5aVar.f43806a = z6kVar;
        z5aVar.b = k6zVar;
        z5aVar.c = xtn.f41471a;
        z5aVar.d = 0L;
        this.f308a = z5aVar;
        this.b = new nr(this);
    }

    public static ucs0 a(a6a a6aVar, long j, agc agcVar, float f, a4d a4dVar, int i) {
        ucs0 ucs0VarC = a6aVar.c(agcVar);
        if (f != 1.0f) {
            j = y3d.c(y3d.d(j) * f, j);
        }
        long jL = ucs0VarC.l();
        int i2 = y3d.h;
        if (!h2t0.a(jL, j)) {
            ucs0VarC.s(j);
        }
        if (((Shader) ucs0VarC.d) != null) {
            ucs0VarC.w(null);
        }
        if (!Intrinsics.d((a4d) ucs0VarC.e, a4dVar)) {
            ucs0VarC.t(a4dVar);
        }
        if (ucs0VarC.b != i) {
            ucs0VarC.r(i);
        }
        if (((Paint) ucs0VarC.c).isFilterBitmap()) {
            return ucs0VarC;
        }
        ucs0VarC.u(1);
        return ucs0VarC;
    }

    @Override // a.fhl
    public final void A(long j, float f, long j2, float f2, agc agcVar, int i) {
        this.f308a.c.e(f, j2, a(this, j, agcVar, f2, null, i));
    }

    @Override // a.fhl
    public final nr A0() {
        return this.b;
    }

    @Override // a.fhl
    public final void K(long j, long j2, long j3, float f, agc agcVar, a4d a4dVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f308a.c.m(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, agcVar, f, a4dVar, i));
    }

    @Override // a.fhl
    public final void M0(w03 w03Var, t89 t89Var, float f, agc agcVar, int i) {
        this.f308a.c.p(w03Var, b(t89Var, agcVar, f, null, i, 1));
    }

    @Override // a.fhl
    public final void W(long j, long j2, long j3, long j4, agc agcVar, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f308a.c.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, agcVar, 1.0f, null, i));
    }

    @Override // a.fhl
    public final void Z(long j, long j2, long j3, float f, int i, x03 x03Var) {
        x5a x5aVar = this.f308a.c;
        ucs0 ucs0VarD = this.d;
        if (ucs0VarD == null) {
            ucs0VarD = saj.D();
            ucs0VarD.A(1);
            this.d = ucs0VarD;
        }
        Paint paint = (Paint) ucs0VarD.c;
        long jL = ucs0VarD.l();
        int i2 = y3d.h;
        if (!h2t0.a(jL, j)) {
            ucs0VarD.s(j);
        }
        if (((Shader) ucs0VarD.d) != null) {
            ucs0VarD.w(null);
        }
        if (!Intrinsics.d((a4d) ucs0VarD.e, null)) {
            ucs0VarD.t(null);
        }
        if (ucs0VarD.b != 3) {
            ucs0VarD.r(3);
        }
        if (paint.getStrokeWidth() != f) {
            ucs0VarD.z(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (ucs0VarD.m() != i) {
            ucs0VarD.x(i);
        }
        if (ucs0VarD.n() != 0) {
            ucs0VarD.y(0);
        }
        if (!Intrinsics.d((x03) ucs0VarD.f, x03Var)) {
            ucs0VarD.v(x03Var);
        }
        if (!paint.isFilterBitmap()) {
            ucs0VarD.u(1);
        }
        x5aVar.b(j2, j3, ucs0VarD);
    }

    public final ucs0 b(t89 t89Var, agc agcVar, float f, a4d a4dVar, int i, int i2) {
        ucs0 ucs0VarC = c(agcVar);
        Paint paint = (Paint) ucs0VarC.c;
        if (t89Var != null) {
            t89Var.a(f, d(), ucs0VarC);
        } else {
            if (((Shader) ucs0VarC.d) != null) {
                ucs0VarC.w(null);
            }
            long jL = ucs0VarC.l();
            long j = y3d.b;
            if (!h2t0.a(jL, j)) {
                ucs0VarC.s(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                ucs0VarC.q(f);
            }
        }
        if (!Intrinsics.d((a4d) ucs0VarC.e, a4dVar)) {
            ucs0VarC.t(a4dVar);
        }
        if (ucs0VarC.b != i) {
            ucs0VarC.r(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return ucs0VarC;
        }
        ucs0VarC.u(i2);
        return ucs0VarC;
    }

    public final ucs0 c(agc agcVar) {
        if (Intrinsics.d(agcVar, l0q.f19214a)) {
            ucs0 ucs0Var = this.c;
            if (ucs0Var != null) {
                return ucs0Var;
            }
            ucs0 ucs0VarD = saj.D();
            ucs0VarD.A(0);
            this.c = ucs0VarD;
            return ucs0VarD;
        }
        if (!(agcVar instanceof vtm0)) {
            t9f.b();
            return null;
        }
        ucs0 ucs0VarD2 = this.d;
        if (ucs0VarD2 == null) {
            ucs0VarD2 = saj.D();
            ucs0VarD2.A(1);
            this.d = ucs0VarD2;
        }
        Paint paint = (Paint) ucs0VarD2.c;
        float strokeWidth = paint.getStrokeWidth();
        vtm0 vtm0Var = (vtm0) agcVar;
        x03 x03Var = vtm0Var.e;
        float f = vtm0Var.f38015a;
        if (strokeWidth != f) {
            ucs0VarD2.z(f);
        }
        int iM = ucs0VarD2.m();
        int i = vtm0Var.c;
        if (iM != i) {
            ucs0VarD2.x(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = vtm0Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iN = ucs0VarD2.n();
        int i2 = vtm0Var.d;
        if (iN != i2) {
            ucs0VarD2.y(i2);
        }
        if (!Intrinsics.d((x03) ucs0VarD2.f, x03Var)) {
            ucs0VarD2.v(x03Var);
        }
        return ucs0VarD2;
    }

    @Override // a.fhl
    public final void f0(t89 t89Var, long j, long j2, float f, agc agcVar, a4d a4dVar, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.f308a.c.m(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(t89Var, agcVar, f, a4dVar, i, 1));
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.f308a.f43806a.getDensity();
    }

    @Override // a.fhl
    public final k6z getLayoutDirection() {
        return this.f308a.b;
    }

    @Override // a.fhl
    public final void i(w03 w03Var, long j, float f, agc agcVar) {
        this.f308a.c.p(w03Var, a(this, j, agcVar, f, null, 3));
    }

    @Override // a.fhl
    public final void j0(vz2 vz2Var, long j, float f, a4d a4dVar, int i) {
        this.f308a.c.q(vz2Var, j, b(null, l0q.f19214a, f, a4dVar, i, 1));
    }

    @Override // a.fhl
    public final void k0(t89 t89Var, long j, long j2, long j3, float f, agc agcVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.f308a.c.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(t89Var, agcVar, f, null, 3, 1));
    }

    @Override // a.fhl
    public final void l(vz2 vz2Var, long j, long j2, long j3, float f, a4d a4dVar, int i) {
        this.f308a.c.s(vz2Var, j, j2, j3, b(null, l0q.f19214a, f, a4dVar, 3, i));
    }

    @Override // a.fhl
    public final void q(t89 t89Var, long j, agc agcVar) {
        this.f308a.c.t(Float.intBitsToFloat(0), Float.intBitsToFloat(0), Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat(0), Float.intBitsToFloat((int) (4294967295L & j)) + Float.intBitsToFloat(0), -180.0f, 180.0f, b(t89Var, agcVar, 1.0f, null, 3, 1));
    }

    @Override // a.fhl
    public final void q0(ijj0 ijj0Var, float f, long j, agc agcVar) {
        this.f308a.c.e(f, j, b(ijj0Var, agcVar, 1.0f, null, 3, 1));
    }

    @Override // a.fhl
    public final void t(long j, float f, float f2, long j2, long j3, float f3, agc agcVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f308a.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, agcVar, f3, null, 3));
    }

    @Override // a.w6k
    public final float v0() {
        return this.f308a.f43806a.v0();
    }
}
