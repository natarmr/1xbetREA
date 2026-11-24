package a;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class hls0 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public sz5 l;
    public sz5 m;
    public sz5 n;
    public sz5 o;
    public sz5 p;
    public hlq q;
    public hlq r;
    public hlq s;
    public hlq t;
    public hlq u;
    public sz5 v;
    public sz5 w;
    public final boolean x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f13278a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public hls0(z33 z33Var) {
        ok50 ok50Var = z33Var.f43699a;
        this.l = ok50Var == null ? null : ok50Var.f0();
        b43 b43Var = z33Var.b;
        this.m = b43Var == null ? null : b43Var.f0();
        u33 u33Var = z33Var.c;
        this.n = u33Var == null ? null : u33Var.f0();
        v33 v33Var = z33Var.d;
        this.o = v33Var == null ? null : v33Var.f0();
        v33 v33Var2 = z33Var.f;
        this.q = v33Var2 == null ? null : v33Var2.f0();
        this.x = z33Var.m;
        v33 v33Var3 = z33Var.h;
        this.s = v33Var3 == null ? null : v33Var3.f0();
        v33 v33Var4 = z33Var.i;
        this.t = v33Var4 == null ? null : v33Var4.f0();
        v33 v33Var5 = z33Var.j;
        this.u = v33Var5 == null ? null : v33Var5.f0();
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        v33 v33Var6 = z33Var.g;
        this.r = v33Var6 == null ? null : v33Var6.f0();
        u33 u33Var2 = z33Var.e;
        if (u33Var2 != null) {
            this.p = u33Var2.f0();
        }
        v33 v33Var7 = z33Var.k;
        if (v33Var7 != null) {
            this.v = v33Var7.f0();
        } else {
            this.v = null;
        }
        v33 v33Var8 = z33Var.l;
        if (v33Var8 != null) {
            this.w = v33Var8.f0();
        } else {
            this.w = null;
        }
    }

    public final void a(tz5 tz5Var) {
        tz5Var.f(this.p);
        tz5Var.f(this.v);
        tz5Var.f(this.w);
        tz5Var.f(this.l);
        tz5Var.f(this.m);
        tz5Var.f(this.n);
        tz5Var.f(this.o);
        tz5Var.f(this.q);
        tz5Var.f(this.r);
        tz5Var.f(this.s);
        tz5Var.f(this.t);
        tz5Var.f(this.u);
    }

    public final void b(oz5 oz5Var) {
        sz5 sz5Var = this.p;
        if (sz5Var != null) {
            sz5Var.a(oz5Var);
        }
        sz5 sz5Var2 = this.v;
        if (sz5Var2 != null) {
            sz5Var2.a(oz5Var);
        }
        sz5 sz5Var3 = this.w;
        if (sz5Var3 != null) {
            sz5Var3.a(oz5Var);
        }
        sz5 sz5Var4 = this.l;
        if (sz5Var4 != null) {
            sz5Var4.a(oz5Var);
        }
        sz5 sz5Var5 = this.m;
        if (sz5Var5 != null) {
            sz5Var5.a(oz5Var);
        }
        sz5 sz5Var6 = this.n;
        if (sz5Var6 != null) {
            sz5Var6.a(oz5Var);
        }
        sz5 sz5Var7 = this.o;
        if (sz5Var7 != null) {
            sz5Var7.a(oz5Var);
        }
        hlq hlqVar = this.q;
        if (hlqVar != null) {
            hlqVar.a(oz5Var);
        }
        hlq hlqVar2 = this.r;
        if (hlqVar2 != null) {
            hlqVar2.a(oz5Var);
        }
        hlq hlqVar3 = this.s;
        if (hlqVar3 != null) {
            hlqVar3.a(oz5Var);
            this.s.a(new gls0(this, (byte) 0));
        }
        hlq hlqVar4 = this.t;
        if (hlqVar4 != null) {
            hlqVar4.a(oz5Var);
            this.t.a(new gls0(this, (byte) 1));
        }
        hlq hlqVar5 = this.u;
        if (hlqVar5 != null) {
            hlqVar5.a(oz5Var);
            this.u.a(new gls0(this, (byte) 2));
        }
    }

    public final boolean c(zn00 zn00Var, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == nb10.f23218a) {
            sz5 sz5Var = this.l;
            if (sz5Var == null) {
                this.l = new h2u0(zn00Var, new PointF());
                return true;
            }
            sz5Var.j(zn00Var);
            return true;
        }
        if (obj == nb10.b) {
            sz5 sz5Var2 = this.m;
            if (sz5Var2 == null) {
                this.m = new h2u0(zn00Var, new PointF());
                return true;
            }
            sz5Var2.j(zn00Var);
            return true;
        }
        if (obj == nb10.c) {
            sz5 sz5Var3 = this.m;
            if (sz5Var3 instanceof a0l0) {
                ((a0l0) sz5Var3).m = zn00Var;
                return true;
            }
        }
        if (obj == nb10.d) {
            sz5 sz5Var4 = this.m;
            if (sz5Var4 instanceof a0l0) {
                ((a0l0) sz5Var4).n = zn00Var;
                return true;
            }
        }
        if (obj == nb10.j) {
            sz5 sz5Var5 = this.n;
            if (sz5Var5 == null) {
                this.n = new h2u0(zn00Var, new m1h0());
                return true;
            }
            sz5Var5.j(zn00Var);
            return true;
        }
        if (obj == nb10.k) {
            sz5 sz5Var6 = this.o;
            if (sz5Var6 == null) {
                this.o = new h2u0(zn00Var, fValueOf2);
                return true;
            }
            sz5Var6.j(zn00Var);
            return true;
        }
        if (obj == 3) {
            sz5 sz5Var7 = this.p;
            if (sz5Var7 == null) {
                this.p = new h2u0(zn00Var, 100);
                return true;
            }
            sz5Var7.j(zn00Var);
            return true;
        }
        if (obj == nb10.A) {
            sz5 sz5Var8 = this.v;
            if (sz5Var8 == null) {
                this.v = new h2u0(zn00Var, fValueOf);
                return true;
            }
            sz5Var8.j(zn00Var);
            return true;
        }
        if (obj == nb10.B) {
            sz5 sz5Var9 = this.w;
            if (sz5Var9 == null) {
                this.w = new h2u0(zn00Var, fValueOf);
                return true;
            }
            sz5Var9.j(zn00Var);
            return true;
        }
        if (obj == nb10.o) {
            hlq hlqVar = this.q;
            if (hlqVar == null) {
                hlqVar = new hlq(Collections.singletonList(new cmy(fValueOf2)));
                this.q = hlqVar;
            }
            hlqVar.j(zn00Var);
            return true;
        }
        if (obj == nb10.p) {
            hlq hlqVar2 = this.r;
            if (hlqVar2 == null) {
                hlqVar2 = new hlq(Collections.singletonList(new cmy(fValueOf2)));
                this.r = hlqVar2;
            }
            hlqVar2.j(zn00Var);
            return true;
        }
        if (obj == nb10.l) {
            hlq hlqVar3 = this.s;
            if (hlqVar3 == null) {
                hlqVar3 = new hlq(Collections.singletonList(new cmy(fValueOf2)));
                this.s = hlqVar3;
            }
            hlqVar3.j(zn00Var);
            return true;
        }
        if (obj == nb10.m) {
            hlq hlqVar4 = this.t;
            if (hlqVar4 == null) {
                hlqVar4 = new hlq(Collections.singletonList(new cmy(fValueOf2)));
                this.t = hlqVar4;
            }
            hlqVar4.j(zn00Var);
            return true;
        }
        if (obj != nb10.n) {
            return false;
        }
        hlq hlqVar5 = this.u;
        if (hlqVar5 == null) {
            hlqVar5 = new hlq(Collections.singletonList(new cmy(fValueOf2)));
            this.u = hlqVar5;
        }
        hlqVar5.j(zn00Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        hlq hlqVar;
        hlq hlqVar2;
        PointF pointF;
        m1h0 m1h0Var;
        PointF pointF2;
        Matrix matrix = this.f13278a;
        matrix.reset();
        hlq hlqVar3 = this.s;
        if ((hlqVar3 == null || hlqVar3.l() == 0.0f) && (((hlqVar = this.t) == null || hlqVar.l() == 0.0f) && ((hlqVar2 = this.u) == null || hlqVar2.l() == 0.0f))) {
            sz5 sz5Var = this.m;
            if (sz5Var != null && (pointF2 = (PointF) sz5Var.e()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                sz5 sz5Var2 = this.o;
                if (sz5Var2 != null) {
                    float fFloatValue = sz5Var2 instanceof h2u0 ? ((Float) sz5Var2.e()).floatValue() : ((hlq) sz5Var2).l();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (sz5Var != null) {
                float f2 = sz5Var.d;
                PointF pointF3 = (PointF) sz5Var.e();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                sz5Var.i(1.0E-4f + f2);
                PointF pointF4 = (PointF) sz5Var.e();
                sz5Var.i(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            hlq hlqVar4 = this.q;
            if (hlqVar4 != null) {
                hlq hlqVar5 = this.r;
                float fCos = hlqVar5 == null ? 0.0f : (float) Math.cos(Math.toRadians((-hlqVar5.l()) + 90.0f));
                hlq hlqVar6 = this.r;
                float fSin = hlqVar6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-hlqVar6.l()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(hlqVar4.l()));
                d();
                float[] fArr = this.e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            sz5 sz5Var3 = this.n;
            if (sz5Var3 != null && (m1h0Var = (m1h0) sz5Var3.e()) != null) {
                float f6 = m1h0Var.f21008a;
                if (f6 != 1.0f || m1h0Var.b != 1.0f) {
                    matrix.preScale(f6, m1h0Var.b);
                }
            }
            sz5 sz5Var4 = this.l;
            if (sz5Var4 != null && (pointF = (PointF) sz5Var4.e()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            hlq hlqVar7 = this.s;
            float fL = hlqVar7 != null ? hlqVar7.l() : 0.0f;
            hlq hlqVar8 = this.t;
            float fL2 = hlqVar8 != null ? hlqVar8.l() : 0.0f;
            hlq hlqVar9 = this.u;
            float fL3 = hlqVar9 != null ? hlqVar9.l() : 0.0f;
            if (this.k || fL != this.f || fL2 != this.g || fL3 != this.h) {
                this.f = fL;
                this.g = fL2;
                this.h = fL3;
                if (fL != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(fL));
                } else {
                    this.i = 1.0f;
                }
                if (fL2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fL2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            sz5 sz5Var5 = this.l;
            PointF pointF5 = sz5Var5 == null ? null : (PointF) sz5Var5.e();
            sz5 sz5Var6 = this.m;
            PointF pointF6 = sz5Var6 == null ? null : (PointF) sz5Var6.e();
            sz5 sz5Var7 = this.n;
            m1h0 m1h0Var2 = sz5Var7 != null ? (m1h0) sz5Var7.e() : null;
            float f8 = m1h0Var2 != null ? m1h0Var2.f21008a : 1.0f;
            float f9 = m1h0Var2 != null ? m1h0Var2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        sz5 sz5Var = this.m;
        PointF pointF = sz5Var == null ? null : (PointF) sz5Var.e();
        sz5 sz5Var2 = this.n;
        m1h0 m1h0Var = sz5Var2 == null ? null : (m1h0) sz5Var2.e();
        sz5 sz5Var3 = this.l;
        PointF pointF2 = sz5Var3 != null ? (PointF) sz5Var3.e() : null;
        Matrix matrix = this.f13278a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        hlq hlqVar = this.s;
        float fL = hlqVar != null ? hlqVar.l() * f : 0.0f;
        hlq hlqVar2 = this.t;
        float fL2 = hlqVar2 != null ? hlqVar2.l() * f : 0.0f;
        hlq hlqVar3 = this.u;
        float fL3 = hlqVar3 != null ? hlqVar3.l() * f : 0.0f;
        if (fL == 0.0f && fL2 == 0.0f && fL3 == 0.0f) {
            sz5 sz5Var4 = this.o;
            if (sz5Var4 != null) {
                matrix.preRotate(((Float) sz5Var4.e()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fL != 0.0f ? (float) Math.cos(Math.toRadians(fL)) : 1.0f;
            float fCos2 = fL2 != 0.0f ? (float) Math.cos(Math.toRadians(fL2)) : 1.0f;
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (m1h0Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(m1h0Var.f21008a, d), (float) Math.pow(m1h0Var.b, d));
        }
        return matrix;
    }
}
