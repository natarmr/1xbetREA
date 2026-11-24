package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g53 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10698a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g53(Object obj, long j, byte b) {
        super(1);
        this.f10698a = b;
        this.b = obj;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cfq cfqVar;
        oul0 oul0Var;
        vqm0 vqm0Var;
        uqm0 uqm0Var;
        byte b = this.f10698a;
        long j = 0;
        long j2 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ams0 ams0Var = (ams0) obj;
                h53 h53Var = (h53) obj2;
                if (!Intrinsics.d(ams0Var.d(), h53Var.r.d())) {
                    l7m0 l7m0Var = (l7m0) h53Var.r.d.g(ams0Var.d());
                    j2 = l7m0Var != null ? ((qkx) l7m0Var.getValue()).f28908a : 0L;
                } else if (!qkx.a(h53Var.y, -9223372034707292160L)) {
                    j2 = h53Var.y;
                }
                l7m0 l7m0Var2 = (l7m0) h53Var.r.d.g(ams0Var.b());
                j = l7m0Var2 != null ? ((qkx) l7m0Var2.getValue()).f28908a : 0L;
                u7k0 u7k0Var = (u7k0) h53Var.q.getValue();
                return (u7k0Var == null || (cfqVar = (cfq) u7k0Var.b.invoke(new qkx(j2), new qkx(j))) == null) ? ro4.g0(0.0f, 400.0f, null, 5) : cfqVar;
            case 1:
                h53 h53Var2 = (h53) obj2;
                if (Intrinsics.d(obj, h53Var2.r.d())) {
                    j = qkx.a(h53Var2.y, -9223372034707292160L) ? j2 : h53Var2.y;
                } else {
                    l7m0 l7m0Var3 = (l7m0) h53Var2.r.d.g(obj);
                    if (l7m0Var3 != null) {
                        j = ((qkx) l7m0Var3.getValue()).f28908a;
                    }
                }
                return new qkx(j);
            default:
                long jLongValue = ((Number) obj).longValue();
                lms0 lms0Var = (lms0) obj2;
                fms0 fms0Var = lms0Var.f20314a.i;
                float fL = lms0Var.b.l();
                float fB = g6u0.b(j2);
                float fC = g6u0.c(j2);
                yls0 yls0Var = fms0Var.f;
                if (yls0Var != null) {
                    ems0 ems0Var = (ems0) fms0Var.b.get(yls0Var.f42859a);
                    float[] fArr = new float[2];
                    yls0 yls0Var2 = fms0Var.f;
                    float[] fArr2 = yls0.x[yls0Var2.e];
                    float[] fArr3 = yls0.s[yls0Var2.b];
                    ems0Var.d.f(fL, fArr3[0], fArr3[1], fArr);
                    if (Math.abs((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) < 0.01d) {
                        fArr[0] = 0.01f;
                        fArr[1] = 0.01f;
                    }
                    float f = fArr2[0] != 0.0f ? fB / fArr[0] : fC / fArr[1];
                    yls0 yls0Var3 = fms0Var.f;
                    float fSignum = f * yls0Var3.f;
                    yls0Var3.q = jLongValue;
                    float fAbs = Math.abs(fSignum);
                    float f2 = yls0Var3.h;
                    if (fAbs > f2) {
                        fSignum = Math.signum(fSignum) * f2;
                    }
                    float f3 = fSignum;
                    float fAbs2 = (((Math.abs(f3) * 0.5f) * f3) / yls0Var3.i) + fL;
                    switch (yls0Var3.j) {
                        case 1:
                            fAbs2 = fL < 1.0f ? 0.0f : 1.0f;
                            break;
                        case 2:
                            fAbs2 = fL > 0.0f ? 1.0f : 0.0f;
                            break;
                        case 3:
                            fAbs2 = Float.NaN;
                            break;
                        case 4:
                            fAbs2 = Math.max(0.0f, Math.min(1.0f, fAbs2));
                            break;
                        case 5:
                            if (fAbs2 <= 0.2f || fAbs2 >= 0.8f) {
                                fAbs2 = fAbs2 <= 0.5f ? 0.0f : 1.0f;
                            }
                            break;
                        case 6:
                            fAbs2 = 1.0f;
                            break;
                        case 7:
                            fAbs2 = 0.0f;
                            break;
                        default:
                            fAbs2 = fAbs2 <= 0.5d ? 0.0f : 1.0f;
                            break;
                    }
                    yls0Var3.o = fAbs2;
                    if (fAbs2 == fL) {
                        yls0Var3.c = null;
                    } else if (yls0Var3.j == 4 && yls0Var3.g == 0) {
                        sqm0 sqm0Var = yls0Var3.c;
                        if (sqm0Var instanceof uqm0) {
                            uqm0Var = (uqm0) sqm0Var;
                        } else {
                            uqm0Var = new uqm0();
                            uqm0Var.g = false;
                            yls0Var3.c = uqm0Var;
                        }
                        uqm0Var.g = false;
                        uqm0Var.f36126a = fAbs2;
                        uqm0Var.b = f3;
                        uqm0Var.f = fL;
                        float f4 = (fAbs2 - fL) / (f3 / 2.0f);
                        uqm0Var.e = f4;
                        uqm0Var.c = (-f3) / f4;
                    } else {
                        int i = yls0Var3.g;
                        sqm0 sqm0Var2 = yls0Var3.c;
                        if (i == 0) {
                            if (sqm0Var2 instanceof vqm0) {
                                vqm0Var = (vqm0) sqm0Var2;
                            } else {
                                vqm0Var = new vqm0();
                                yls0Var3.c = vqm0Var;
                            }
                            vqm0 vqm0Var2 = vqm0Var;
                            float f5 = yls0Var3.i;
                            float f6 = yls0Var3.h;
                            vqm0Var2.l = fL;
                            boolean z = fL > fAbs2;
                            vqm0Var2.k = z;
                            if (z) {
                                vqm0Var2.d(-f3, fL - fAbs2, f5, f6, 0.4f);
                            } else {
                                vqm0Var2.d(f3, fAbs2 - fL, f5, f6, 0.4f);
                            }
                        } else {
                            if (sqm0Var2 instanceof oul0) {
                                oul0Var = (oul0) sqm0Var2;
                            } else {
                                oul0Var = new oul0();
                                yls0Var3.c = oul0Var;
                            }
                            float f7 = yls0Var3.k;
                            float f8 = yls0Var3.l;
                            float f9 = yls0Var3.m;
                            float f10 = yls0Var3.n;
                            int i2 = yls0Var3.p;
                            oul0Var.c = fAbs2;
                            oul0Var.f25883a = f9;
                            oul0Var.e = fL;
                            oul0Var.b = f8;
                            oul0Var.g = f7;
                            oul0Var.h = f10;
                            oul0Var.i = i2;
                            oul0Var.d = 0.0f;
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
