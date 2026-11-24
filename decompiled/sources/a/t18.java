package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f33158a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final q18 e;
    public static final float f;
    public static final long g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final long k;
    public static final float l;
    public static final float m;
    public static final float n;

    static {
        zcl zclVar = qmk.f28987a;
        f33158a = 40.0f;
        b = 64.0f;
        c = 50.0f;
        d = 80.0f;
        e = new q18();
        f = 4.0f;
        g = osm0.e(0.5f, 0.0f);
        h = 1.0f;
        i = 2.0f;
        j = 2.0f;
        k = osm0.e(0.8f, 0.0f);
        l = 2.0f;
        m = 2.0f;
        n = 4.0f;
    }

    public static final void a(mm40 mm40Var, rz7 rz7Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        rz7Var.getClass();
        String str = rz7Var.s;
        function0.getClass();
        function1.getClass();
        fetVar.g0(931740670);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(rz7Var) : fetVar.i(rz7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = k7n0.H(jm40Var, 1.0f);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new y(function0, (byte) 12);
                fetVar.o0(objP);
            }
            mm40 mm40VarP = ffb0.P(mm40VarH, (Function1) objP);
            boolean z2 = (i3 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new y(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            mm40 mm40VarP2 = ffb0.P(jm40Var, (Function1) objP2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.l, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (rz7Var.t) {
                fetVar.e0(1524274031);
                vbw0.H(384, 0, fetVar, mm40VarP2, str, false);
                b(mm40VarP, rz7Var, true, fetVar, (i3 & 112) | 384);
                fetVar.r(false);
            } else {
                fetVar.e0(1524526991);
                b(mm40VarP, rz7Var, false, fetVar, (i3 & 112) | 384);
                vbw0.H(384, 0, fetVar, mm40VarP2, str, true);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 7, i2, mm40Var2, rz7Var, function0, function1);
        }
    }

    public static final void b(mm40 mm40Var, rz7 rz7Var, final boolean z, fet fetVar, int i2) {
        int i3;
        float f2;
        final byte b2;
        final boolean z2;
        Object obj;
        fet fetVar2 = fetVar;
        fetVar2.g0(1353871513);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(rz7Var) : fetVar2.i(rz7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = xf0.c(-6.0f);
                fetVar2.o0(objP);
            }
            final t33 t33Var = (t33) objP;
            Unit unit = Unit.f46060a;
            boolean zI = fetVar2.i(t33Var);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new my7(t33Var, null, (byte) 6);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, unit, (Function2) objP2);
            mm40 mm40VarP = o7k0.p(mm40Var, tz7.f34791a, tz7.c);
            int i4 = i3 & 896;
            boolean zI2 = (i4 == 256) | fetVar2.i(t33Var);
            Object objP3 = fetVar2.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new x9(z, t33Var, (byte) 4);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40VarP, (Function1) objP3);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str = rz7Var.q;
            float f3 = -24.0f;
            q18 q18Var = e;
            if (z) {
                q18Var.getClass();
                f3 = (-24.0f) + m;
            } else {
                q18Var.getClass();
            }
            if (z) {
                q18Var.getClass();
                f2 = l;
            } else {
                q18Var.getClass();
                f2 = h;
            }
            float f4 = 62.0f - f2;
            long j2 = z ? k : g;
            boolean zI3 = fetVar2.i(t33Var);
            Object objP4 = fetVar2.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new fu7(t33Var, (byte) 4);
                fetVar2.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zI4 = (i4 == 256) | fetVar2.i(t33Var);
            Object objP5 = fetVar2.P();
            if (zI4 || objP5 == cl5Var) {
                b2 = 1;
                objP5 = new Function0() { // from class: a.r18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fC;
                        byte b3 = b2;
                        t33 t33Var2 = t33Var;
                        boolean z3 = z;
                        float fC2 = 0.0f;
                        switch (b3) {
                            case 0:
                                float fFloatValue = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            case 1:
                                float fFloatValue2 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar2 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue2 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                }
                                return new ycl(fC2);
                            case 2:
                                float fFloatValue3 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar3 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue3 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            default:
                                if (z3) {
                                    fC = l1e0.c((((Number) t33Var2.d()).floatValue() - (-6.0f)) / 20.0f, 0.0f, 1.0f) * (-t18.n);
                                } else {
                                    float fFloatValue4 = ((Number) t33Var2.d()).floatValue();
                                    if (z3) {
                                        zcl zclVar4 = qmk.f28987a;
                                    } else {
                                        fC2 = l1e0.c((fFloatValue4 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                    }
                                    fC = fC2;
                                }
                                return new ycl(fC);
                        }
                    }
                };
                fetVar2.o0(objP5);
            } else {
                b2 = 1;
            }
            Function0 function1 = (Function0) objP5;
            int i5 = (i4 == 256 ? b2 : (byte) 0) | (fetVar2.i(t33Var) ? 1 : 0);
            Object objP6 = fetVar2.P();
            if (i5 != 0 || objP6 == cl5Var) {
                final byte b3 = 2;
                objP6 = new Function0() { // from class: a.r18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fC;
                        byte b4 = b3;
                        t33 t33Var2 = t33Var;
                        boolean z3 = z;
                        float fC2 = 0.0f;
                        switch (b4) {
                            case 0:
                                float fFloatValue = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            case 1:
                                float fFloatValue2 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar2 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue2 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                }
                                return new ycl(fC2);
                            case 2:
                                float fFloatValue3 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar3 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue3 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            default:
                                if (z3) {
                                    fC = l1e0.c((((Number) t33Var2.d()).floatValue() - (-6.0f)) / 20.0f, 0.0f, 1.0f) * (-t18.n);
                                } else {
                                    float fFloatValue4 = ((Number) t33Var2.d()).floatValue();
                                    if (z3) {
                                        zcl zclVar4 = qmk.f28987a;
                                    } else {
                                        fC2 = l1e0.c((fFloatValue4 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                    }
                                    fC = fC2;
                                }
                                return new ycl(fC);
                        }
                    }
                };
                fetVar2.o0(objP6);
            }
            float f5 = f33158a;
            float f6 = b;
            phu0.c(str, zx7Var, f5, f6, f3, f4, j2, null, null, function0, function1, (Function0) objP6, fetVar, 28038, 0, 896);
            k7x.a(rz7Var.n, null, o7k0.c, null, null, fetVar, 432, 2040);
            String str2 = rz7Var.o;
            q18Var.getClass();
            boolean zI5 = fetVar.i(t33Var);
            Object objP7 = fetVar.P();
            Object obj2 = objP7;
            if (zI5 || objP7 == cl5Var) {
                fu7 fu7Var = new fu7(t33Var, (byte) 5);
                fetVar.o0(fu7Var);
                obj2 = fu7Var;
            }
            phu0.c(str2, zx7Var, f5, f6, 76.0f, 62.0f, g, null, null, (Function0) obj2, null, null, fetVar, 12610950, 0, 7040);
            String str3 = rz7Var.r;
            zx7 zx7Var2 = gqw0.g;
            boolean zI6 = fetVar.i(t33Var);
            Object objP8 = fetVar.P();
            Object obj3 = objP8;
            if (zI6 || objP8 == cl5Var) {
                fu7 fu7Var2 = new fu7(t33Var, (byte) 6);
                fetVar.o0(fu7Var2);
                obj3 = fu7Var2;
            }
            Function0 function2 = (Function0) obj3;
            boolean zI7 = fetVar.i(t33Var) | (i4 == 256);
            Object objP9 = fetVar.P();
            final byte b4 = 3;
            if (zI7 || objP9 == cl5Var) {
                z2 = z;
                Function0 function3 = new Function0() { // from class: a.r18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fC;
                        byte b5 = b4;
                        t33 t33Var2 = t33Var;
                        boolean z3 = z2;
                        float fC2 = 0.0f;
                        switch (b5) {
                            case 0:
                                float fFloatValue = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            case 1:
                                float fFloatValue2 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar2 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue2 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                }
                                return new ycl(fC2);
                            case 2:
                                float fFloatValue3 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar3 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue3 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            default:
                                if (z3) {
                                    fC = l1e0.c((((Number) t33Var2.d()).floatValue() - (-6.0f)) / 20.0f, 0.0f, 1.0f) * (-t18.n);
                                } else {
                                    float fFloatValue4 = ((Number) t33Var2.d()).floatValue();
                                    if (z3) {
                                        zcl zclVar4 = qmk.f28987a;
                                    } else {
                                        fC2 = l1e0.c((fFloatValue4 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                    }
                                    fC = fC2;
                                }
                                return new ycl(fC);
                        }
                    }
                };
                fetVar.o0(function3);
                obj = function3;
            } else {
                z2 = z;
                obj = objP9;
            }
            Function0 function4 = (Function0) obj;
            boolean zI8 = fetVar.i(t33Var) | (i4 == 256);
            Object objP10 = fetVar.P();
            Object obj4 = objP10;
            if (zI8 || objP10 == cl5Var) {
                final byte b5 = 0;
                Function0 function5 = new Function0() { // from class: a.r18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fC;
                        byte b6 = b5;
                        t33 t33Var2 = t33Var;
                        boolean z3 = z2;
                        float fC2 = 0.0f;
                        switch (b6) {
                            case 0:
                                float fFloatValue = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            case 1:
                                float fFloatValue2 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar2 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue2 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                }
                                return new ycl(fC2);
                            case 2:
                                float fFloatValue3 = ((Number) t33Var2.d()).floatValue();
                                if (z3) {
                                    zcl zclVar3 = qmk.f28987a;
                                } else {
                                    fC2 = l1e0.c((fFloatValue3 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.i;
                                }
                                return new ycl(-fC2);
                            default:
                                if (z3) {
                                    fC = l1e0.c((((Number) t33Var2.d()).floatValue() - (-6.0f)) / 20.0f, 0.0f, 1.0f) * (-t18.n);
                                } else {
                                    float fFloatValue4 = ((Number) t33Var2.d()).floatValue();
                                    if (z3) {
                                        zcl zclVar4 = qmk.f28987a;
                                    } else {
                                        fC2 = l1e0.c((fFloatValue4 - (-6.0f)) / 20.0f, 0.0f, 1.0f) * t18.j;
                                    }
                                    fC = fC2;
                                }
                                return new ycl(fC);
                        }
                    }
                };
                fetVar.o0(function5);
                obj4 = function5;
            }
            Function0 function6 = (Function0) obj4;
            float f7 = c;
            float f8 = d;
            phu0.c(str3, zx7Var2, f7, f8, -48.0f, -34.0f, 0L, null, null, function2, function4, function6, fetVar, 28038, 0, 960);
            String str4 = rz7Var.p;
            boolean zI9 = fetVar.i(t33Var);
            Object objP11 = fetVar.P();
            Object obj5 = objP11;
            if (zI9 || objP11 == cl5Var) {
                fu7 fu7Var3 = new fu7(t33Var, (byte) 3);
                fetVar.o0(fu7Var3);
                obj5 = fu7Var3;
            }
            phu0.c(str4, zx7Var, f7, f8, 86.0f, 44.0f, 0L, null, null, (Function0) obj5, null, null, fetVar, 28038, 0, 7104);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s18(mm40Var, rz7Var, z, i2, (byte) 0);
        }
    }
}
