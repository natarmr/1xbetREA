package a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class snm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f32502a;

    static {
        zcl zclVar = qmk.f28987a;
        f32502a = 2.0f;
        zsf zsfVar = hhn.f13072a;
    }

    public static final void a(mm40 mm40Var, unm unmVar, float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(1795254339);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(unmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            qed0 qed0Var = new qed0(pkd.b(unmVar.f, fetVar));
            mm40 mm40VarV = yyw.V(o7k0.e(mm40Var, unmVar.e), fetVar.k(bmd.n) == k6z.b);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarV, new ugg0(qed0Var, qed0Var, qed0Var, qed0Var)), unmVar.d, jd8.n);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new cel(unmVar, f, b);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, rq8.K(mm40VarQ, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnm(mm40Var, unmVar, f, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, unm unmVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        unmVar.getClass();
        fetVar.g0(-820653297);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(unmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            l7m0 l7m0VarB = d43.b(unmVar.g, new jfk0(), "ProgressAnimation", null, fetVar2, 3456, 16);
            int iOrdinal = unmVar.f35970a.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(1626179501);
                a(mm40Var, unmVar, ((Number) l7m0VarB.getValue()).floatValue(), fetVar2, i2 & 126);
                fetVar2.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(1626177653, fetVar2, false);
                }
                fetVar2.e0(1626185955);
                c(mm40Var, unmVar, ((Number) l7m0VarB.getValue()).floatValue(), fetVar2, i2 & 126);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) unmVar, i, (byte) 27);
        }
    }

    public static final void c(mm40 mm40Var, final unm unmVar, float f, fet fetVar, int i) {
        int i2;
        final float f2;
        fetVar.g0(1715178208);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(unmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i2 |= fetVar.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            final e900 e900VarN = yk5.n(q3d.j(new y3d(unmVar.b), new y3d(unmVar.c)), 0.0f, 0.0f, 14);
            final long j = unmVar.d;
            mm40 mm40VarV = yyw.V(mm40Var, fetVar.k(bmd.n) == k6z.b);
            boolean zF = ((i2 & 112) == 32) | ((i2 & 896) == 256) | fetVar.f(j) | fetVar.g(e900VarN);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                Object obj = new Function1() { // from class: a.rnm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float fC;
                        float f3;
                        float f4;
                        e900 e900Var;
                        fhl fhlVar;
                        float f5;
                        float f6;
                        fhl fhlVar2 = (fhl) obj2;
                        fhlVar2.getClass();
                        unm unmVar2 = unmVar;
                        float fMin = Math.min(fhlVar2.w0(unmVar2.e), (Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) / 2.0f) - fhlVar2.w0(snm.f32502a));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) / 2.0f;
                        float f7 = fIntBitsToFloat - fMin;
                        float f8 = fMin / 2.0f;
                        float f9 = fIntBitsToFloat - f8;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                        float fMin2 = Math.min(fhlVar2.w0(unmVar2.f), Math.min(f8, f7 / 2.0f));
                        float f10 = (fMin2 / (fIntBitsToFloat * 6.2831855f)) * 360.0f;
                        float f11 = (fMin / (6.2831855f * f9)) * 360.0f;
                        float f12 = f10 * 2.0f;
                        float f13 = f11 - f12;
                        float f14 = f2;
                        if (f14 <= 0.0f) {
                            fC = 0.0f;
                        } else {
                            float f15 = unmVar2.h;
                            fC = f14 >= f15 ? 1.0f : l1e0.c((f14 / f15) * 360.0f, f13, 360.0f - f11) / 360.0f;
                        }
                        if (unmVar2.i) {
                            f4 = 0.0f;
                            f3 = fIntBitsToFloat;
                            fhl.E(fhlVar2, j, f9, 0L, 0.0f, new vtm0(fMin, 0.0f, 0, 0, null, 30), 108);
                        } else {
                            f3 = fIntBitsToFloat;
                            f4 = 0.0f;
                        }
                        e900 e900Var2 = e900VarN;
                        if (fC >= 1.0f) {
                            f6 = fMin2;
                            f5 = f7;
                            f13 = f13;
                            f4 = f4;
                            e900Var = e900Var2;
                            fhlVar = fhlVar2;
                            fhl.O(fhlVar, e900Var, f9, 0L, new vtm0(fMin, 0.0f, 0, 0, null, 30), 108);
                        } else {
                            e900Var = e900Var2;
                            fhlVar = fhlVar2;
                            f5 = r6;
                            f6 = fMin2;
                        }
                        if (fC > f4 && fC < 1.0f) {
                            float f16 = f10 - 90.0f;
                            float fMax = Math.max((fC * 360.0f) - f12, f13);
                            float fSqrt = f3 - ((float) Math.sqrt(((float) Math.pow(f3, 2.0d)) - ((float) Math.pow(f6, 2.0d))));
                            float f17 = (f6 * f5) / (f6 + f5);
                            float f18 = f3;
                            float fSqrt2 = f5 - ((float) Math.sqrt(((float) Math.pow(f5, 2.0d)) - ((float) Math.pow(f17, 2.0d))));
                            float fAsin = (((float) Math.asin(f17 / f5)) * 180.0f) / 3.1415927f;
                            w03 w03VarA = z03.a();
                            int i3 = (int) (jFloatToRawIntBits >> 32);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i3) - f18;
                            int i4 = (int) (jFloatToRawIntBits & 4294967295L);
                            float fIntBitsToFloat3 = Float.intBitsToFloat(i4) - f18;
                            float fIntBitsToFloat4 = Float.intBitsToFloat(i3) + f18;
                            fhl fhlVar3 = fhlVar;
                            float fIntBitsToFloat5 = Float.intBitsToFloat(i4) + f18;
                            e900 e900Var3 = e900Var;
                            Path path = w03VarA.f38329a;
                            RectF rectF = w03VarA.b;
                            if (rectF == null) {
                                rectF = new RectF();
                                w03VarA.b = rectF;
                            }
                            rectF.set(fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5);
                            RectF rectF2 = w03VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, f16, fMax, false);
                            float fIntBitsToFloat6 = Float.intBitsToFloat(i3) - f5;
                            float fIntBitsToFloat7 = Float.intBitsToFloat(i4) - f5;
                            float fIntBitsToFloat8 = Float.intBitsToFloat(i3) + f5;
                            float fIntBitsToFloat9 = Float.intBitsToFloat(i4) + f5;
                            float f19 = ((f16 + fMax) + f10) - fAsin;
                            float f20 = (fAsin * 2.0f) + ((-fMax) - f12);
                            RectF rectF3 = w03VarA.b;
                            if (rectF3 == null) {
                                rectF3 = new RectF();
                                w03VarA.b = rectF3;
                            }
                            rectF3.set(fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, fIntBitsToFloat9);
                            RectF rectF4 = w03VarA.b;
                            rectF4.getClass();
                            path.arcTo(rectF4, f19, f20, false);
                            w03 w03VarA2 = z03.a();
                            float fIntBitsToFloat10 = Float.intBitsToFloat(i3);
                            float f21 = fMin + fSqrt + fSqrt2;
                            float f22 = f6 * 2.0f;
                            float f23 = f21 - f22;
                            float f24 = fIntBitsToFloat10 + f22;
                            Path path2 = w03VarA2.f38329a;
                            RectF rectF5 = w03VarA2.b;
                            if (rectF5 == null) {
                                rectF5 = new RectF();
                                w03VarA2.b = rectF5;
                            }
                            rectF5.set(fIntBitsToFloat10, f23, f24, f21);
                            RectF rectF6 = w03VarA2.b;
                            rectF6.getClass();
                            path2.arcTo(rectF6, 90.0f, 90.0f, false);
                            w03VarA2.e(fIntBitsToFloat10, fSqrt + f6 + fSqrt2);
                            float f25 = fSqrt + f22;
                            RectF rectF7 = w03VarA2.b;
                            if (rectF7 == null) {
                                rectF7 = new RectF();
                                w03VarA2.b = rectF7;
                            }
                            rectF7.set(fIntBitsToFloat10, fSqrt, f24, f25);
                            RectF rectF8 = w03VarA2.b;
                            rectF8.getClass();
                            path2.arcTo(rectF8, 180.0f, 90.0f, false);
                            w03 w03VarA3 = z03.a();
                            float fIntBitsToFloat11 = Float.intBitsToFloat(i3) - f22;
                            float f26 = f22 + fIntBitsToFloat11;
                            Path path3 = w03VarA3.f38329a;
                            RectF rectF9 = w03VarA3.b;
                            if (rectF9 == null) {
                                rectF9 = new RectF();
                                w03VarA3.b = rectF9;
                            }
                            rectF9.set(fIntBitsToFloat11, fSqrt, f26, f25);
                            RectF rectF10 = w03VarA3.b;
                            rectF10.getClass();
                            path3.arcTo(rectF10, -90.0f, 90.0f, false);
                            w03VarA3.e(f26, f21 - f6);
                            RectF rectF11 = w03VarA3.b;
                            if (rectF11 == null) {
                                rectF11 = new RectF();
                                w03VarA3.b = rectF11;
                            }
                            rectF11.set(fIntBitsToFloat11, f23, f26, f21);
                            RectF rectF12 = w03VarA3.b;
                            rectF12.getClass();
                            path3.arcTo(rectF12, 0.0f, 90.0f, false);
                            float[] fArrA = ui30.a();
                            ui30.g(fArrA, Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                            ui30.e(fMax + f12, fArrA);
                            ui30.g(fArrA, -Float.intBitsToFloat(i3), -Float.intBitsToFloat(i4));
                            Matrix matrix = w03VarA3.d;
                            if (matrix == null) {
                                matrix = new Matrix();
                                w03VarA3.d = matrix;
                            }
                            tke.a0(matrix, fArrA);
                            Path path4 = w03VarA3.f38329a;
                            Matrix matrix2 = w03VarA3.d;
                            matrix2.getClass();
                            path4.transform(matrix2);
                            w03 w03VarA4 = z03.a();
                            w03VarA4.g(w03VarA, w03VarA2, 2);
                            w03 w03VarA5 = z03.a();
                            w03VarA5.g(w03VarA4, w03VarA3, 2);
                            fhl.K0(fhlVar3, w03VarA5, e900Var3, 0.0f, l0q.f19214a, 52);
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj);
                objP = obj;
            }
            p8a.k(mm40VarV, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnm(mm40Var, unmVar, f, i, (byte) 1);
        }
    }
}
