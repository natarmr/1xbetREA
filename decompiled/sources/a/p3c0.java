package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p3c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f26293a = bu40.b;

    /* JADX WARN: Code duplicated, block: B:110:0x023f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:115:0x0279  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01da  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    public static final void a(mm40 mm40Var, long j, float f, long j2, int i, float f2, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        long j3;
        float f3;
        long j4;
        int i5;
        boolean z;
        final mm40 mm40Var3;
        final long j5;
        final float f4;
        final long j6;
        final int i6;
        final float f5;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        long jD;
        final float f6;
        final int i7;
        final vtm0 vtm0Var;
        long j7;
        final x7x x7xVarR;
        final x7x x7xVarR2;
        final x7x x7xVarR3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zG;
        Object objP;
        final long j8;
        final float f7;
        final long j9;
        int i8;
        fetVar.g0(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && fetVar.f(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i4 |= fetVar.d(f3) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                j4 = j2;
                if ((i3 & 8) == 0 || !fetVar.f(j4)) {
                    i8 = 1024;
                } else {
                    i8 = 2048;
                }
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i4 | 221184;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    if (i9 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jD = v4d.d(q3c0.f28047a, fetVar);
                        i5 &= -113;
                    } else {
                        jD = j3;
                    }
                    if (i10 != 0) {
                        f3 = 4.0f;
                    }
                    if ((i3 & 8) != 0) {
                        j4 = y3d.f;
                        i5 &= -7169;
                    }
                    f6 = 4.0f;
                    j3 = jD;
                    i7 = 1;
                    mm40Var2 = mm40Var4;
                } else {
                    fetVar.X();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    i7 = i;
                    f6 = f2;
                }
                fetVar.s();
                vtm0Var = new vtm0(((w6k) fetVar.k(bmd.h)).w0(f3), 0.0f, i7, 0, null, 26);
                z7x z7xVarV = b8k0.V(null, fetVar, 1);
                j7 = j4;
                x7xVarR = b8k0.r(z7xVarV, 0.0f, 1080.0f, ro4.b0(ro4.m0(6000, 0, ihn.d, 2), null, 0L, 6), null, fetVar, 4536, 8);
                wyb0 wyb0Var = new wyb0((byte) 5);
                imy imyVar = new imy();
                wyb0Var.invoke(imyVar);
                x7xVarR2 = b8k0.r(z7xVarV, 0.0f, 360.0f, ro4.b0(new jmy(imyVar), null, 0L, 6), null, fetVar, 4536, 8);
                imy imyVar2 = new imy();
                imyVar2.f15048a = 6000;
                imyVar2.a(3000, Float.valueOf(0.87f)).b = f26293a;
                imyVar2.a(6000, Float.valueOf(0.1f));
                x7xVarR3 = b8k0.r(z7xVarV, 0.1f, 0.87f, ro4.b0(new jmy(imyVar2), null, 0L, 6), null, fetVar, 4536, 8);
                mm40 mm40VarN = o7k0.n(pai0.a(mm40Var2, true, new wyb0((byte) 6)), 40.0f);
                boolean zG2 = fetVar.g(x7xVarR3);
                if ((57344 & i5) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = zG2 | z2;
                if ((458752 & i5) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z5 | z3;
                if ((i5 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zG = z6 | z4 | fetVar.g(x7xVarR) | fetVar.g(x7xVarR2) | ((((i5 & 7168) ^ 3072) <= 2048 && fetVar.f(j7)) || (i5 & 3072) == 2048) | fetVar.i(vtm0Var) | ((((i5 & 112) ^ 48) <= 32 && fetVar.f(j3)) || (i5 & 48) == 32);
                objP = fetVar.P();
                if (!zG || objP == ukd.f35823a) {
                    j8 = j3;
                    f7 = f3;
                    j9 = j7;
                    objP = new Function1() { // from class: a.o3c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            long j10 = j9;
                            vtm0 vtm0Var2 = vtm0Var;
                            long j11 = j8;
                            fhl fhlVar = (fhl) obj;
                            float fFloatValue = ((Number) x7xVarR3.getValue()).floatValue() * 360.0f;
                            boolean z7 = i7;
                            float f8 = f6;
                            if (z7 && Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (fhlVar.d() >> 32))) {
                                f8 += f7;
                            }
                            float fS0 = (f8 / ((float) (((double) fhlVar.s0(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) x7xVarR2.getValue()).floatValue() + ((Number) x7xVarR.getValue()).floatValue();
                            long jE0 = fhlVar.E0();
                            nr nrVarA0 = fhlVar.A0();
                            long jP = nrVarA0.p();
                            nrVarA0.i().l();
                            try {
                                ((fvt0) nrVarA0.b).y(fFloatValue2, jE0);
                                p3c0.d(fhlVar, Math.min(fFloatValue, fS0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fS0) * 2.0f), j10, vtm0Var2);
                                p3c0.d(fhlVar, 0.0f, fFloatValue, j11, vtm0Var2);
                                return Unit.f46060a;
                            } finally {
                                defpackage.c.g(nrVarA0, jP);
                            }
                        }
                    };
                    fetVar.o0(objP);
                } else {
                    j8 = j3;
                    f7 = f3;
                    j9 = j7;
                }
                p8a.k(mm40VarN, (Function1) objP, fetVar, 0);
                mm40Var3 = mm40Var2;
                i6 = i7;
                f5 = f6;
                f4 = f7;
                j6 = j9;
                j5 = j8;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                j5 = j3;
                f4 = f3;
                j6 = j4;
                i6 = i;
                f5 = f2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.k3c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iL = x8x.L(i2 | 1);
                        mm40 mm40Var5 = mm40Var3;
                        long j10 = j5;
                        float f8 = f4;
                        long j11 = j6;
                        boolean z7 = i6;
                        float f9 = f5;
                        p3c0.a(mm40Var5, j10, f8, j11, z7 ? 1 : 0, f9, (fet) obj, iL, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 384;
        f3 = f;
        if ((i2 & 3072) == 0) {
            j4 = j2;
            if ((i3 & 8) == 0) {
                i8 = 1024;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        } else {
            j4 = j2;
        }
        i5 = i4 | 221184;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 2) != 0) {
                    jD = v4d.d(q3c0.f28047a, fetVar);
                    i5 &= -113;
                } else {
                    jD = j3;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                if ((i3 & 8) != 0) {
                    j4 = y3d.f;
                    i5 &= -7169;
                }
                f6 = 4.0f;
                j3 = jD;
                i7 = 1;
                mm40Var2 = mm40Var4;
            } else {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 2) != 0) {
                    jD = v4d.d(q3c0.f28047a, fetVar);
                    i5 &= -113;
                } else {
                    jD = j3;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                if ((i3 & 8) != 0) {
                    j4 = y3d.f;
                    i5 &= -7169;
                }
                f6 = 4.0f;
                j3 = jD;
                i7 = 1;
                mm40Var2 = mm40Var4;
            }
            fetVar.s();
            vtm0Var = new vtm0(((w6k) fetVar.k(bmd.h)).w0(f3), 0.0f, i7, 0, null, 26);
            z7x z7xVarV2 = b8k0.V(null, fetVar, 1);
            j7 = j4;
            x7xVarR = b8k0.r(z7xVarV2, 0.0f, 1080.0f, ro4.b0(ro4.m0(6000, 0, ihn.d, 2), null, 0L, 6), null, fetVar, 4536, 8);
            wyb0 wyb0Var2 = new wyb0((byte) 5);
            imy imyVar3 = new imy();
            wyb0Var2.invoke(imyVar3);
            x7xVarR2 = b8k0.r(z7xVarV2, 0.0f, 360.0f, ro4.b0(new jmy(imyVar3), null, 0L, 6), null, fetVar, 4536, 8);
            imy imyVar4 = new imy();
            imyVar4.f15048a = 6000;
            imyVar4.a(3000, Float.valueOf(0.87f)).b = f26293a;
            imyVar4.a(6000, Float.valueOf(0.1f));
            x7xVarR3 = b8k0.r(z7xVarV2, 0.1f, 0.87f, ro4.b0(new jmy(imyVar4), null, 0L, 6), null, fetVar, 4536, 8);
            mm40 mm40VarN2 = o7k0.n(pai0.a(mm40Var2, true, new wyb0((byte) 6)), 40.0f);
            boolean zG3 = fetVar.g(x7xVarR3);
            if ((57344 & i5) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = zG3 | z2;
            if ((458752 & i5) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            if ((i5 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zG = z8 | z4 | fetVar.g(x7xVarR) | fetVar.g(x7xVarR2) | ((((i5 & 7168) ^ 3072) <= 2048 && fetVar.f(j7)) || (i5 & 3072) == 2048) | fetVar.i(vtm0Var) | ((((i5 & 112) ^ 48) <= 32 && fetVar.f(j3)) || (i5 & 48) == 32);
            objP = fetVar.P();
            if (zG) {
                j8 = j3;
                f7 = f3;
                j9 = j7;
                objP = new Function1() { // from class: a.o3c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j10 = j9;
                        vtm0 vtm0Var2 = vtm0Var;
                        long j11 = j8;
                        fhl fhlVar = (fhl) obj;
                        float fFloatValue = ((Number) x7xVarR3.getValue()).floatValue() * 360.0f;
                        boolean z9 = i7;
                        float f8 = f6;
                        if (z9 && Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (fhlVar.d() >> 32))) {
                            f8 += f7;
                        }
                        float fS0 = (f8 / ((float) (((double) fhlVar.s0(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) x7xVarR2.getValue()).floatValue() + ((Number) x7xVarR.getValue()).floatValue();
                        long jE0 = fhlVar.E0();
                        nr nrVarA0 = fhlVar.A0();
                        long jP = nrVarA0.p();
                        nrVarA0.i().l();
                        try {
                            ((fvt0) nrVarA0.b).y(fFloatValue2, jE0);
                            p3c0.d(fhlVar, Math.min(fFloatValue, fS0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fS0) * 2.0f), j10, vtm0Var2);
                            p3c0.d(fhlVar, 0.0f, fFloatValue, j11, vtm0Var2);
                            return Unit.f46060a;
                        } finally {
                            defpackage.c.g(nrVarA0, jP);
                        }
                    }
                };
                fetVar.o0(objP);
            } else {
                j8 = j3;
                f7 = f3;
                j9 = j7;
                objP = new Function1() { // from class: a.o3c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j10 = j9;
                        vtm0 vtm0Var2 = vtm0Var;
                        long j11 = j8;
                        fhl fhlVar = (fhl) obj;
                        float fFloatValue = ((Number) x7xVarR3.getValue()).floatValue() * 360.0f;
                        boolean z9 = i7;
                        float f8 = f6;
                        if (z9 && Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) <= Float.intBitsToFloat((int) (fhlVar.d() >> 32))) {
                            f8 += f7;
                        }
                        float fS0 = (f8 / ((float) (((double) fhlVar.s0(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) x7xVarR2.getValue()).floatValue() + ((Number) x7xVarR.getValue()).floatValue();
                        long jE0 = fhlVar.E0();
                        nr nrVarA0 = fhlVar.A0();
                        long jP = nrVarA0.p();
                        nrVarA0.i().l();
                        try {
                            ((fvt0) nrVarA0.b).y(fFloatValue2, jE0);
                            p3c0.d(fhlVar, Math.min(fFloatValue, fS0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fS0) * 2.0f), j10, vtm0Var2);
                            p3c0.d(fhlVar, 0.0f, fFloatValue, j11, vtm0Var2);
                            return Unit.f46060a;
                        } finally {
                            defpackage.c.g(nrVarA0, jP);
                        }
                    }
                };
                fetVar.o0(objP);
            }
            p8a.k(mm40VarN2, (Function1) objP, fetVar, 0);
            mm40Var3 = mm40Var2;
            i6 = i7;
            f5 = f6;
            f4 = f7;
            j6 = j9;
            j5 = j8;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            j5 = j3;
            f4 = f3;
            j6 = j4;
            i6 = i;
            f5 = f2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.k3c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    mm40 mm40Var5 = mm40Var3;
                    long j10 = j5;
                    float f8 = f4;
                    long j11 = j6;
                    boolean z9 = i6;
                    float f9 = f5;
                    p3c0.a(mm40Var5, j10, f8, j11, z9 ? 1 : 0, f9, (fet) obj, iL, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(Function0 function0, mm40 mm40Var, final long j, final float f, final long j2, float f2, fet fetVar, int i) {
        int i2;
        final float f3;
        int i3;
        fetVar.g0(-1798883595);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.e(1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            f3 = f2;
            i2 |= fetVar.d(f3) ? 1048576 : 524288;
        } else {
            f3 = f2;
        }
        if (fetVar.U(i2 & 1, (i2 & 599187) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new l3c0(function0, (byte) 1);
                fetVar.o0(objP);
            }
            final Function0 function1 = (Function0) objP;
            final vtm0 vtm0Var = new vtm0(((w6k) fetVar.k(bmd.h)).w0(f), 0.0f, 1, 0, null, 26);
            boolean zG = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new r3w(function1, (byte) 20);
                fetVar.o0(objP2);
            }
            mm40 mm40VarN = o7k0.n(pai0.a(mm40Var, true, (Function1) objP2), 40.0f);
            boolean zG2 = ((i2 & 458752) == 131072) | fetVar.g(function1) | ((3670016 & i2) == 1048576) | ((i2 & 7168) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && fetVar.f(j2)) || (i2 & 24576) == 16384) | fetVar.i(vtm0Var) | ((((i2 & 896) ^ 384) > 256 && fetVar.f(j)) || (i2 & 384) == 256);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                i3 = 0;
                Object obj2 = new Function1() { // from class: a.n3c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        fhl fhlVar = (fhl) obj3;
                        float fFloatValue = ((Number) function1.invoke()).floatValue() * 360.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        float f4 = f3;
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            f4 += f;
                        }
                        float fS0 = (f4 / ((float) (((double) fhlVar.s0(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fS0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fS0) * 2.0f);
                        long j3 = j2;
                        vtm0 vtm0Var2 = vtm0Var;
                        p3c0.d(fhlVar, fMin, fMin2, j3, vtm0Var2);
                        p3c0.d(fhlVar, 270.0f, fFloatValue, j, vtm0Var2);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj2);
                objP3 = obj2;
            } else {
                i3 = 0;
            }
            p8a.k(mm40VarN, (Function1) objP3, fetVar, i3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ou50(function0, mm40Var, j, f, j2, f2, i);
        }
    }

    public static final void c(Function0 function0, mm40 mm40Var, long j, long j2, int i, float f, Function1 function1, fet fetVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Object glwVar;
        int i7;
        int i8;
        fetVar.g0(-339970038);
        int i9 = i2 | (fetVar.i(function0) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024);
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i9 | 24576;
            i4 = i;
        } else {
            i4 = i;
            i5 = i9 | (fetVar.e(i4) ? 16384 : 8192);
        }
        int i11 = i5 | (fetVar.d(f) ? 131072 : 65536);
        if (fetVar.U(i11 & 1, (599187 & i11) != 599186)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            } else if (i10 != 0) {
                i4 = 1;
            }
            fetVar.s();
            boolean z = (i11 & 14) == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new l3c0(function0, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            mm40 mm40VarE = mm40Var.e(o7.f24760a);
            boolean zG = fetVar.g(function2);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new r3w(function2, (byte) 19);
                fetVar.o0(objP2);
            }
            mm40 mm40VarP = o7k0.p(pai0.a(mm40VarE, true, (Function1) objP2), 240.0f, 4.0f);
            boolean zG2 = ((57344 & i11) == 16384) | ((458752 & i11) == 131072) | fetVar.g(function2) | ((((i11 & 7168) ^ 3072) > 2048 && fetVar.f(j2)) || (i11 & 3072) == 2048) | ((((i11 & 896) ^ 384) > 256 && fetVar.f(j)) || (i11 & 384) == 256);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                i7 = i4;
                i8 = 0;
                glwVar = new glw(i7, f, function2, j2, j, function1);
                fetVar.o0(glwVar);
            } else {
                glwVar = objP3;
                i7 = i4;
                i8 = 0;
            }
            p8a.k(mm40VarP, (Function1) glwVar, fetVar, i8);
            i6 = i7;
        } else {
            fetVar.X();
            i6 = i4;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m3c0(function0, mm40Var, j, j2, i6, f, function1, i2, i3);
        }
    }

    public static final void d(fhl fhlVar, float f, float f2, long j, vtm0 vtm0Var) {
        float f3 = vtm0Var.f38015a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - (2.0f * f3);
        fhl.V(fhlVar, j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, vtm0Var, 832);
    }

    public static final void e(fhl fhlVar, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = fhlVar.getLayoutDirection() == k6z.f17794a;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, null, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, null, Response.TEMPORARILY_UNAVAILABLE);
        }
    }
}
