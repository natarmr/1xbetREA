package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22751a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        zcl zclVar = qmk.f28987a;
        f22751a = 6.0f;
        b = 4.0f;
        c = 2.0f;
        d = 6.0f;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0280  */
    /* JADX WARN: Code duplicated, block: B:107:0x0285  */
    /* JADX WARN: Code duplicated, block: B:110:0x028b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0290 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0292  */
    /* JADX WARN: Code duplicated, block: B:113:0x0294  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cd A[LOOP:0: B:116:0x02cb->B:117:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x02df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:134:0x030c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0311  */
    /* JADX WARN: Code duplicated, block: B:143:0x0324  */
    /* JADX WARN: Code duplicated, block: B:148:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0347  */
    /* JADX WARN: Code duplicated, block: B:151:0x034c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0360  */
    /* JADX WARN: Code duplicated, block: B:157:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0376  */
    /* JADX WARN: Code duplicated, block: B:162:0x037b  */
    /* JADX WARN: Code duplicated, block: B:163:0x037e  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:178:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x03c1 A[PHI: r14
  0x03c1: PHI (r14v17 int) = (r14v13 int), (r14v11 int) binds: [B:188:0x03da, B:178:0x03bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x03c6 A[PHI: r1 r26 r27
  0x03c6: PHI (r1v34 int) = (r1v28 int), (r1v28 int), (r1v29 int), (r1v30 int), (r1v35 int) binds: [B:220:0x0422, B:221:0x0424, B:214:0x0417, B:207:0x0407, B:179:0x03c1] A[DONT_GENERATE, DONT_INLINE]
  0x03c6: PHI (r26v6 int) = (r26v0 int), (r26v0 int), (r26v0 int), (r26v0 int), (r26v7 int) binds: [B:220:0x0422, B:221:0x0424, B:214:0x0417, B:207:0x0407, B:179:0x03c1] A[DONT_GENERATE, DONT_INLINE]
  0x03c6: PHI (r27v7 java.lang.Object) = 
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v0 java.lang.Object)
  (r27v1 java.lang.Object)
  (r27v8 java.lang.Object)
 binds: [B:220:0x0422, B:221:0x0424, B:214:0x0417, B:207:0x0407, B:179:0x03c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:188:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:199:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:205:0x0404  */
    /* JADX WARN: Code duplicated, block: B:207:0x0407  */
    /* JADX WARN: Code duplicated, block: B:208:0x040a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0416  */
    /* JADX WARN: Code duplicated, block: B:216:0x041a  */
    /* JADX WARN: Code duplicated, block: B:218:0x041d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x0451  */
    /* JADX WARN: Code duplicated, block: B:229:0x045e  */
    /* JADX WARN: Code duplicated, block: B:232:0x046f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0471  */
    /* JADX WARN: Code duplicated, block: B:234:0x0474  */
    /* JADX WARN: Code duplicated, block: B:239:0x0495  */
    /* JADX WARN: Code duplicated, block: B:242:0x049f  */
    /* JADX WARN: Code duplicated, block: B:243:0x04af A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:99:0x0240  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mm40 mm40Var, final xk80 xk80Var, final smm smmVar, y3d y3dVar, fet fetVar, final int i, final int i2) {
        final mm40 mm40Var2;
        int i3;
        y3d y3dVar2;
        boolean z;
        final y3d y3dVar3;
        yfe0 yfe0VarU;
        Function2 function2;
        y3d y3dVar4;
        Object objP;
        cl5 cl5Var;
        int iIntValue;
        y3d y3dVar5;
        float f;
        float f2;
        int iOrdinal;
        long secondary10;
        long primary;
        int iK;
        int iOrdinal2;
        long secondary20;
        long j;
        int i4;
        boolean zE;
        Object objP2;
        long j2;
        int iN;
        int i5;
        int i6;
        boolean zE2;
        Object objP3;
        Object obj;
        int i7;
        int iIntValue2;
        float fL;
        Object[] objArr;
        int i8;
        boolean zE3;
        int i9;
        Object objP4;
        int i10;
        float f3;
        float f4;
        boolean zBooleanValue;
        boolean zD;
        Object objP5;
        float f5;
        float f6;
        int i11;
        int i12;
        boolean zE4;
        Object objP6;
        long j3;
        boolean zE5;
        int i13;
        Object objP7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj2;
        int i19;
        float f7;
        int iOrdinal3;
        xk80Var.getClass();
        fetVar.g0(1814876830);
        int i20 = i2 & 1;
        if (i20 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(xk80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.e(smmVar.ordinal()) ? 256 : 128;
        }
        int i21 = i2 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                y3dVar2 = y3dVar;
                i3 |= fetVar.g(y3dVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i20 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i21 != 0) {
                    y3dVar4 = null;
                } else {
                    y3dVar4 = y3dVar2;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = jgk0.b(new s39(xk80Var, (byte) 3));
                    fetVar.o0(objP);
                }
                iIntValue = ((Number) ((l7m0) objP).getValue()).intValue();
                if (iIntValue < 2) {
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        return;
                    }
                    final y3d y3dVar6 = y3dVar4;
                    final byte b2 = 0;
                    function2 = new Function2() { // from class: a.m1i
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b3 = b2;
                            int i22 = i;
                            switch (b3) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    n1i.a(mm40Var2, xk80Var, smmVar, y3dVar6, (fet) obj3, x8x.L(i22 | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    n1i.a(mm40Var2, xk80Var, smmVar, y3dVar6, (fet) obj3, x8x.L(i22 | 1), i2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                } else {
                    y3dVar5 = y3dVar4;
                    mm40 mm40Var3 = mm40Var2;
                    f = d;
                    f2 = f22751a;
                    float f8 = ((f + f2) * iIntValue) + f;
                    iOrdinal = smmVar.ordinal();
                    if (iOrdinal != 0) {
                        fetVar.e0(339930985);
                        fetVar.r(false);
                        secondary10 = y3d.f;
                    } else if (iOrdinal != 1) {
                        fetVar.e0(339933481);
                        secondary10 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary10();
                        fetVar.r(false);
                    } else if (iOrdinal != 2) {
                        fetVar.e0(339935273);
                        fetVar.r(false);
                        secondary10 = y3d.f;
                    } else {
                        if (iOrdinal == 3) {
                            throw b1j.f(339929376, fetVar, false);
                        }
                        fetVar.e0(339937957);
                        secondary10 = ((StaticColors) fetVar.k(m8m0.f21378a)).m70getBlack200d7_KjU();
                        fetVar.r(false);
                    }
                    if (y3dVar5 == null) {
                        fetVar.e0(1948228660);
                        iOrdinal3 = smmVar.ordinal();
                        if (iOrdinal3 != 0) {
                            fetVar.e0(339942725);
                            primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else if (iOrdinal3 != 1) {
                            fetVar.e0(339945093);
                            primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                            fetVar.r(false);
                        } else if (iOrdinal3 != 2) {
                            fetVar.e0(339947331);
                            primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                            fetVar.r(false);
                        } else {
                            if (iOrdinal3 == 3) {
                                throw b1j.f(339940750, fetVar, false);
                            }
                            fetVar.e0(339949827);
                            primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else {
                        fetVar.e0(339939944);
                        fetVar.r(false);
                        primary = y3dVar5.f41946a;
                    }
                    nw3 nw3Var = uc9.e;
                    yx7 yx7Var = gqw0.k;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarX = o7k0.x(i120.Q(lgb.J(o7k0.s(o7k0.e(mm40Var3, 18.0f), f8), vgg0.a(360.0f)), secondary10, jd8.n), gqw0.d, true);
                    thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarX);
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
                    iK = xk80Var.k();
                    iOrdinal2 = smmVar.ordinal();
                    if (iOrdinal2 != 0 || iOrdinal2 == 1) {
                        fetVar.e0(75939821);
                        secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
                        fetVar.r(false);
                    } else {
                        if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                            throw b1j.f(75936429, fetVar, false);
                        }
                        fetVar.e0(75943177);
                        fetVar.r(false);
                        secondary20 = StaticColors.INSTANCE.m127getWhite300d7_KjU();
                    }
                    j = secondary20;
                    if (xk80Var.n() > 9) {
                        fetVar.e0(-1940526501);
                        iN = xk80Var.n();
                        i5 = iIntValue / 2;
                        i6 = i5 + 1;
                        zE2 = fetVar.e(iN) | fetVar.e(iK) | fetVar.e(i6);
                        objP3 = fetVar.P();
                        if (zE2) {
                            obj = cl5Var;
                        } else {
                            obj = cl5Var;
                            if (objP3 == obj) {
                            }
                            iIntValue2 = ((Number) objP3).intValue();
                            fL = xk80Var.l();
                            objArr = new Object[]{Float.valueOf(fL), Integer.valueOf(iN), Integer.valueOf(iIntValue2), Integer.valueOf(i6), Integer.valueOf(iK), Integer.valueOf(iIntValue)};
                            zE3 = fetVar.e(6);
                            i9 = 0;
                            for (i8 = 6; i9 < i8; i8 = 6) {
                                zE3 |= fetVar.g(objArr[i9]);
                                i9++;
                            }
                            objP4 = fetVar.P();
                            if (!zE3 || objP4 == obj) {
                                if (iIntValue2 == i6) {
                                    if (iN == iIntValue + 1) {
                                        f3 = i6;
                                        i10 = 1;
                                        f4 = iK + fL;
                                        if (f3 - 1.0f <= f4 || f4 > f3) {
                                        }
                                        objP4 = Boolean.valueOf(z);
                                        fetVar.o0(objP4);
                                    } else {
                                        i10 = 1;
                                    }
                                    float f9 = i6;
                                    float f10 = iN - iK;
                                    float f11 = f10 + fL;
                                    boolean z2 = ((f9 <= f11 || f11 > 0.5f + f9) && (f10 - fL < ((float) (i5 + 2)) || ((float) iK) + fL > ((float) i5))) ? i10 : 0;
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                } else {
                                    i10 = 1;
                                }
                                objP4 = Boolean.valueOf(z2);
                                fetVar.o0(objP4);
                            } else {
                                i10 = 1;
                            }
                            zBooleanValue = ((Boolean) objP4).booleanValue();
                            zD = fetVar.d(fL) | fetVar.d(fL);
                            objP5 = fetVar.P();
                            if (zD || objP5 == obj) {
                                if (zBooleanValue) {
                                    f5 = (-(fL * f)) * 2.0f;
                                } else {
                                    zcl zclVar2 = qmk.f28987a;
                                    f5 = 0.0f;
                                }
                                objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                            }
                            f6 = ((ycl) objP5).f42389a;
                            i11 = iIntValue + 2;
                            i12 = 0;
                            while (i12 < i11) {
                                zE4 = fetVar.e(iIntValue2) | fetVar.e(i12);
                                objP6 = fetVar.P();
                                if (zE4 || objP6 == obj) {
                                    if (iIntValue2 == i12) {
                                        j3 = primary;
                                    } else {
                                        j3 = j;
                                    }
                                    objP6 = dw9.e(j3, fetVar);
                                }
                                long j4 = ((y3d) objP6).f41946a;
                                zE5 = fetVar.e(iK) | fetVar.e(i6) | fetVar.e(i12);
                                i13 = iN;
                                objP7 = fetVar.P();
                                if (!zE5 || objP7 == obj) {
                                    i14 = (iIntValue - i12) + 1;
                                    int i22 = i10;
                                    if (iK == i5 || i12 != i22) {
                                        i15 = 2;
                                        if (iK == i5 || i12 != 2) {
                                            float f12 = b;
                                            if (iK == i6 || i12 != 1) {
                                                i15 = 2;
                                                if (iK == i6 || i12 != 2) {
                                                    float f13 = c;
                                                    if (iK >= i6 || i12 > 1) {
                                                        if (iK >= i6 || i12 != 2) {
                                                            i16 = i13 - iK;
                                                            i17 = i5;
                                                            if (i16 == i6 || i14 != 1) {
                                                                if (i16 == i6) {
                                                                    i19 = 2;
                                                                    if (i14 == 2) {
                                                                        obj2 = obj;
                                                                    } else {
                                                                        i18 = i17 + 2;
                                                                        obj2 = obj;
                                                                        if (i16 == i18 || i14 != 1) {
                                                                            if (i16 == i18) {
                                                                                i19 = 2;
                                                                                if (i14 == 2) {
                                                                                }
                                                                            } else {
                                                                                i19 = 2;
                                                                            }
                                                                            if (i16 < i6 && i14 <= 1) {
                                                                                f7 = f13;
                                                                            } else if (i16 >= i6 || i14 != i19) {
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    i18 = i17 + 2;
                                                                    obj2 = obj;
                                                                    if (i16 == i18) {
                                                                    }
                                                                    if (i16 == i18) {
                                                                        i19 = 2;
                                                                        if (i14 == 2) {
                                                                        }
                                                                    } else {
                                                                        i19 = 2;
                                                                    }
                                                                    if (i16 < i6) {
                                                                    }
                                                                    if (i16 >= i6) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i17 = i5;
                                                            obj2 = obj;
                                                            i19 = 2;
                                                        }
                                                        f7 = f12;
                                                    } else {
                                                        i17 = i5;
                                                        obj2 = obj;
                                                        f7 = f13;
                                                        i19 = 2;
                                                    }
                                                } else {
                                                    i17 = i5;
                                                    obj2 = obj;
                                                    i19 = i15;
                                                }
                                                f7 = f2;
                                            } else {
                                                i17 = i5;
                                                obj2 = obj;
                                            }
                                            f7 = f12;
                                            i19 = 2;
                                        } else {
                                            i17 = i5;
                                            obj2 = obj;
                                            i19 = i15;
                                            f7 = f2;
                                        }
                                        objP7 = twn.j(f7, fetVar);
                                    } else {
                                        i17 = i5;
                                    }
                                    obj2 = obj;
                                    f7 = f2;
                                    i19 = 2;
                                    objP7 = twn.j(f7, fetVar);
                                } else {
                                    i17 = i5;
                                    obj2 = obj;
                                    i19 = 2;
                                }
                                float f14 = f6;
                                b(j4, ((ycl) objP7).f42389a, f14, fetVar, 0);
                                i12++;
                                i6 = i6;
                                iIntValue2 = iIntValue2;
                                iN = i13;
                                i5 = i17;
                                i10 = 1;
                                f6 = f14;
                                obj = obj2;
                            }
                            fetVar.r(false);
                        }
                        if (iN - iK < i6) {
                            i7 = ((i6 * 2) - iN) + iK;
                        } else if (iK >= i6) {
                            i7 = i6;
                        } else {
                            i7 = iK + 1;
                        }
                        objP3 = Integer.valueOf(i7);
                        fetVar.o0(objP3);
                        iIntValue2 = ((Number) objP3).intValue();
                        fL = xk80Var.l();
                        objArr = new Object[]{Float.valueOf(fL), Integer.valueOf(iN), Integer.valueOf(iIntValue2), Integer.valueOf(i6), Integer.valueOf(iK), Integer.valueOf(iIntValue)};
                        zE3 = fetVar.e(6);
                        i9 = 0;
                        while (i9 < i8) {
                            zE3 |= fetVar.g(objArr[i9]);
                            i9++;
                        }
                        objP4 = fetVar.P();
                        if (zE3) {
                            if (iIntValue2 == i6) {
                                if (iN == iIntValue + 1) {
                                    f3 = i6;
                                    i10 = 1;
                                    f4 = iK + fL;
                                    if (f3 - 1.0f <= f4) {
                                    }
                                } else {
                                    i10 = 1;
                                }
                                float f15 = i6;
                                float f16 = iN - iK;
                                float f17 = f16 + fL;
                                if (f15 <= f17) {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                } else {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                }
                            } else {
                                i10 = 1;
                            }
                            objP4 = Boolean.valueOf(z2);
                            fetVar.o0(objP4);
                        } else {
                            if (iIntValue2 == i6) {
                                if (iN == iIntValue + 1) {
                                    f3 = i6;
                                    i10 = 1;
                                    f4 = iK + fL;
                                    if (f3 - 1.0f <= f4) {
                                    }
                                } else {
                                    i10 = 1;
                                }
                                float f18 = i6;
                                float f19 = iN - iK;
                                float f110 = f19 + fL;
                                if (f18 <= f110) {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                } else {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                }
                            } else {
                                i10 = 1;
                            }
                            objP4 = Boolean.valueOf(z2);
                            fetVar.o0(objP4);
                        }
                        zBooleanValue = ((Boolean) objP4).booleanValue();
                        zD = fetVar.d(fL) | fetVar.d(fL);
                        objP5 = fetVar.P();
                        if (zD) {
                            if (zBooleanValue) {
                                f5 = (-(fL * f)) * 2.0f;
                            } else {
                                zcl zclVar3 = qmk.f28987a;
                                f5 = 0.0f;
                            }
                            objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                        } else {
                            if (zBooleanValue) {
                                f5 = (-(fL * f)) * 2.0f;
                            } else {
                                zcl zclVar4 = qmk.f28987a;
                                f5 = 0.0f;
                            }
                            objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                        }
                        f6 = ((ycl) objP5).f42389a;
                        i11 = iIntValue + 2;
                        i12 = 0;
                        while (i12 < i11) {
                            zE4 = fetVar.e(iIntValue2) | fetVar.e(i12);
                            objP6 = fetVar.P();
                            if (zE4) {
                                if (iIntValue2 == i12) {
                                    j3 = primary;
                                } else {
                                    j3 = j;
                                }
                                objP6 = dw9.e(j3, fetVar);
                            } else {
                                if (iIntValue2 == i12) {
                                    j3 = primary;
                                } else {
                                    j3 = j;
                                }
                                objP6 = dw9.e(j3, fetVar);
                            }
                            long j5 = ((y3d) objP6).f41946a;
                            zE5 = fetVar.e(iK) | fetVar.e(i6) | fetVar.e(i12);
                            i13 = iN;
                            objP7 = fetVar.P();
                            if (zE5) {
                                i14 = (iIntValue - i12) + 1;
                                int i23 = i10;
                                if (iK == i5) {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f111 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f112 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f113 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f114 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f115 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f116 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f117 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f118 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f119 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f1110 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1112 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                }
                                objP7 = twn.j(f7, fetVar);
                            } else {
                                i14 = (iIntValue - i12) + 1;
                                int i24 = i10;
                                if (iK == i5) {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f1113 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1114 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1115 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f1116 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1117 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1118 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f1119 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11110 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11111 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f11112 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11113 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11114 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                }
                                objP7 = twn.j(f7, fetVar);
                            }
                            float f120 = f6;
                            b(j5, ((ycl) objP7).f42389a, f120, fetVar, 0);
                            i12++;
                            i6 = i6;
                            iIntValue2 = iIntValue2;
                            iN = i13;
                            i5 = i17;
                            i10 = 1;
                            f6 = f120;
                            obj = obj2;
                        }
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1936568886);
                        for (i4 = 0; i4 < iIntValue; i4++) {
                            zE = fetVar.e(iK) | fetVar.e(i4);
                            objP2 = fetVar.P();
                            if (zE || objP2 == cl5Var) {
                                if (iK == i4) {
                                    j2 = primary;
                                } else {
                                    j2 = j;
                                }
                                objP2 = dw9.e(j2, fetVar);
                            }
                            b(((y3d) objP2).f41946a, f22751a, f / 2.0f, fetVar, 432);
                        }
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    mm40Var2 = mm40Var3;
                    y3dVar3 = y3dVar5;
                }
                yfe0VarU.d = function2;
            }
            fetVar.X();
            y3dVar3 = y3dVar2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final byte b3 = 1;
                function2 = new Function2() { // from class: a.m1i
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b4 = b3;
                        int i25 = i;
                        switch (b4) {
                            case 0:
                                ((Integer) obj4).getClass();
                                n1i.a(mm40Var2, xk80Var, smmVar, y3dVar3, (fet) obj3, x8x.L(i25 | 1), i2);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                n1i.a(mm40Var2, xk80Var, smmVar, y3dVar3, (fet) obj3, x8x.L(i25 | 1), i2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                yfe0VarU.d = function2;
            }
        }
        i3 |= 3072;
        y3dVar2 = y3dVar;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i20 != 0) {
                mm40Var2 = jm40.b;
            }
            if (i21 != 0) {
                y3dVar4 = null;
            } else {
                y3dVar4 = y3dVar2;
            }
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new s39(xk80Var, (byte) 3));
                fetVar.o0(objP);
            }
            iIntValue = ((Number) ((l7m0) objP).getValue()).intValue();
            if (iIntValue < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    return;
                }
                final y3d y3dVar7 = y3dVar4;
                final byte b4 = 0;
                function2 = new Function2() { // from class: a.m1i
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b5 = b4;
                        int i25 = i;
                        switch (b5) {
                            case 0:
                                ((Integer) obj4).getClass();
                                n1i.a(mm40Var2, xk80Var, smmVar, y3dVar7, (fet) obj3, x8x.L(i25 | 1), i2);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                n1i.a(mm40Var2, xk80Var, smmVar, y3dVar7, (fet) obj3, x8x.L(i25 | 1), i2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                y3dVar5 = y3dVar4;
                mm40 mm40Var4 = mm40Var2;
                f = d;
                f2 = f22751a;
                float f20 = ((f + f2) * iIntValue) + f;
                iOrdinal = smmVar.ordinal();
                if (iOrdinal != 0) {
                    fetVar.e0(339930985);
                    fetVar.r(false);
                    secondary10 = y3d.f;
                } else if (iOrdinal != 1) {
                    fetVar.e0(339933481);
                    secondary10 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary10();
                    fetVar.r(false);
                } else if (iOrdinal != 2) {
                    fetVar.e0(339935273);
                    fetVar.r(false);
                    secondary10 = y3d.f;
                } else {
                    if (iOrdinal == 3) {
                        throw b1j.f(339929376, fetVar, false);
                    }
                    fetVar.e0(339937957);
                    secondary10 = ((StaticColors) fetVar.k(m8m0.f21378a)).m70getBlack200d7_KjU();
                    fetVar.r(false);
                }
                if (y3dVar5 == null) {
                    fetVar.e0(1948228660);
                    iOrdinal3 = smmVar.ordinal();
                    if (iOrdinal3 != 0) {
                        fetVar.e0(339942725);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        fetVar.r(false);
                    } else if (iOrdinal3 != 1) {
                        fetVar.e0(339945093);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                        fetVar.r(false);
                    } else if (iOrdinal3 != 2) {
                        fetVar.e0(339947331);
                        primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        fetVar.r(false);
                    } else {
                        if (iOrdinal3 == 3) {
                            throw b1j.f(339940750, fetVar, false);
                        }
                        fetVar.e0(339949827);
                        primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.e0(339939944);
                    fetVar.r(false);
                    primary = y3dVar5.f41946a;
                }
                nw3 nw3Var2 = uc9.e;
                yx7 yx7Var2 = gqw0.k;
                zcl zclVar5 = qmk.f28987a;
                mm40 mm40VarX2 = o7k0.x(i120.Q(lgb.J(o7k0.s(o7k0.e(mm40Var4, 18.0f), f20), vgg0.a(360.0f)), secondary10, jd8.n), gqw0.d, true);
                thg0 thg0VarA2 = shg0.a(nw3Var2, yx7Var2, fetVar, 54);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarX2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                iK = xk80Var.k();
                iOrdinal2 = smmVar.ordinal();
                if (iOrdinal2 != 0) {
                    fetVar.e0(75939821);
                    secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
                    fetVar.r(false);
                } else {
                    fetVar.e0(75939821);
                    secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
                    fetVar.r(false);
                }
                j = secondary20;
                if (xk80Var.n() > 9) {
                    fetVar.e0(-1940526501);
                    iN = xk80Var.n();
                    i5 = iIntValue / 2;
                    i6 = i5 + 1;
                    zE2 = fetVar.e(iN) | fetVar.e(iK) | fetVar.e(i6);
                    objP3 = fetVar.P();
                    if (zE2) {
                        obj = cl5Var;
                        if (objP3 == obj) {
                        }
                        iIntValue2 = ((Number) objP3).intValue();
                        fL = xk80Var.l();
                        objArr = new Object[]{Float.valueOf(fL), Integer.valueOf(iN), Integer.valueOf(iIntValue2), Integer.valueOf(i6), Integer.valueOf(iK), Integer.valueOf(iIntValue)};
                        zE3 = fetVar.e(6);
                        i9 = 0;
                        while (i9 < i8) {
                            zE3 |= fetVar.g(objArr[i9]);
                            i9++;
                        }
                        objP4 = fetVar.P();
                        if (zE3) {
                            if (iIntValue2 == i6) {
                                if (iN == iIntValue + 1) {
                                    f3 = i6;
                                    i10 = 1;
                                    f4 = iK + fL;
                                    if (f3 - 1.0f <= f4) {
                                    }
                                } else {
                                    i10 = 1;
                                }
                                float f121 = i6;
                                float f122 = iN - iK;
                                float f1120 = f122 + fL;
                                if (f121 <= f1120) {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                } else {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                }
                            } else {
                                i10 = 1;
                            }
                            objP4 = Boolean.valueOf(z2);
                            fetVar.o0(objP4);
                        } else {
                            if (iIntValue2 == i6) {
                                if (iN == iIntValue + 1) {
                                    f3 = i6;
                                    i10 = 1;
                                    f4 = iK + fL;
                                    if (f3 - 1.0f <= f4) {
                                    }
                                } else {
                                    i10 = 1;
                                }
                                float f123 = i6;
                                float f124 = iN - iK;
                                float f1121 = f124 + fL;
                                if (f123 <= f1121) {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                } else {
                                    objP4 = Boolean.valueOf(z2);
                                    fetVar.o0(objP4);
                                }
                            } else {
                                i10 = 1;
                            }
                            objP4 = Boolean.valueOf(z2);
                            fetVar.o0(objP4);
                        }
                        zBooleanValue = ((Boolean) objP4).booleanValue();
                        zD = fetVar.d(fL) | fetVar.d(fL);
                        objP5 = fetVar.P();
                        if (zD) {
                            if (zBooleanValue) {
                                f5 = (-(fL * f)) * 2.0f;
                            } else {
                                zcl zclVar6 = qmk.f28987a;
                                f5 = 0.0f;
                            }
                            objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                        } else {
                            if (zBooleanValue) {
                                f5 = (-(fL * f)) * 2.0f;
                            } else {
                                zcl zclVar7 = qmk.f28987a;
                                f5 = 0.0f;
                            }
                            objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                        }
                        f6 = ((ycl) objP5).f42389a;
                        i11 = iIntValue + 2;
                        i12 = 0;
                        while (i12 < i11) {
                            zE4 = fetVar.e(iIntValue2) | fetVar.e(i12);
                            objP6 = fetVar.P();
                            if (zE4) {
                                if (iIntValue2 == i12) {
                                    j3 = primary;
                                } else {
                                    j3 = j;
                                }
                                objP6 = dw9.e(j3, fetVar);
                            } else {
                                if (iIntValue2 == i12) {
                                    j3 = primary;
                                } else {
                                    j3 = j;
                                }
                                objP6 = dw9.e(j3, fetVar);
                            }
                            long j6 = ((y3d) objP6).f41946a;
                            zE5 = fetVar.e(iK) | fetVar.e(i6) | fetVar.e(i12);
                            i13 = iN;
                            objP7 = fetVar.P();
                            if (zE5) {
                                i14 = (iIntValue - i12) + 1;
                                int i25 = i10;
                                if (iK == i5) {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f11115 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11116 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11117 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f11118 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f11119 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111110 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f111111 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111112 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111113 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f111114 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111115 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111116 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                }
                                objP7 = twn.j(f7, fetVar);
                            } else {
                                i14 = (iIntValue - i12) + 1;
                                int i26 = i10;
                                if (iK == i5) {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f111117 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111118 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f111119 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f1111110 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111111 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111112 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i15 = 2;
                                    if (iK == i5) {
                                        float f1111113 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111114 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111115 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    } else {
                                        float f1111116 = b;
                                        if (iK == i6) {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111117 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        } else {
                                            i15 = 2;
                                            if (iK == i6) {
                                            }
                                            float f1111118 = c;
                                            if (iK >= i6) {
                                            }
                                            if (iK >= i6) {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            } else {
                                                i16 = i13 - iK;
                                                i17 = i5;
                                                if (i16 == i6) {
                                                }
                                                if (i16 == i6) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        obj2 = obj;
                                                    } else {
                                                        i18 = i17 + 2;
                                                        obj2 = obj;
                                                        if (i16 == i18) {
                                                        }
                                                        if (i16 == i18) {
                                                            i19 = 2;
                                                            if (i14 == 2) {
                                                            }
                                                        } else {
                                                            i19 = 2;
                                                        }
                                                        if (i16 < i6) {
                                                        }
                                                        if (i16 >= i6) {
                                                        }
                                                    }
                                                    f7 = f2;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                            f7 = f2;
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                    f7 = f2;
                                                }
                                            }
                                        }
                                    }
                                }
                                objP7 = twn.j(f7, fetVar);
                            }
                            float f125 = f6;
                            b(j6, ((ycl) objP7).f42389a, f125, fetVar, 0);
                            i12++;
                            i6 = i6;
                            iIntValue2 = iIntValue2;
                            iN = i13;
                            i5 = i17;
                            i10 = 1;
                            f6 = f125;
                            obj = obj2;
                        }
                        fetVar.r(false);
                    } else {
                        obj = cl5Var;
                    }
                    if (iN - iK < i6) {
                        i7 = ((i6 * 2) - iN) + iK;
                    } else if (iK >= i6) {
                        i7 = i6;
                    } else {
                        i7 = iK + 1;
                    }
                    objP3 = Integer.valueOf(i7);
                    fetVar.o0(objP3);
                    iIntValue2 = ((Number) objP3).intValue();
                    fL = xk80Var.l();
                    objArr = new Object[]{Float.valueOf(fL), Integer.valueOf(iN), Integer.valueOf(iIntValue2), Integer.valueOf(i6), Integer.valueOf(iK), Integer.valueOf(iIntValue)};
                    zE3 = fetVar.e(6);
                    i9 = 0;
                    while (i9 < i8) {
                        zE3 |= fetVar.g(objArr[i9]);
                        i9++;
                    }
                    objP4 = fetVar.P();
                    if (zE3) {
                        if (iIntValue2 == i6) {
                            if (iN == iIntValue + 1) {
                                f3 = i6;
                                i10 = 1;
                                f4 = iK + fL;
                                if (f3 - 1.0f <= f4) {
                                }
                            } else {
                                i10 = 1;
                            }
                            float f126 = i6;
                            float f127 = iN - iK;
                            float f1122 = f127 + fL;
                            if (f126 <= f1122) {
                                objP4 = Boolean.valueOf(z2);
                                fetVar.o0(objP4);
                            } else {
                                objP4 = Boolean.valueOf(z2);
                                fetVar.o0(objP4);
                            }
                        } else {
                            i10 = 1;
                        }
                        objP4 = Boolean.valueOf(z2);
                        fetVar.o0(objP4);
                    } else {
                        if (iIntValue2 == i6) {
                            if (iN == iIntValue + 1) {
                                f3 = i6;
                                i10 = 1;
                                f4 = iK + fL;
                                if (f3 - 1.0f <= f4) {
                                }
                            } else {
                                i10 = 1;
                            }
                            float f128 = i6;
                            float f129 = iN - iK;
                            float f1123 = f129 + fL;
                            if (f128 <= f1123) {
                                objP4 = Boolean.valueOf(z2);
                                fetVar.o0(objP4);
                            } else {
                                objP4 = Boolean.valueOf(z2);
                                fetVar.o0(objP4);
                            }
                        } else {
                            i10 = 1;
                        }
                        objP4 = Boolean.valueOf(z2);
                        fetVar.o0(objP4);
                    }
                    zBooleanValue = ((Boolean) objP4).booleanValue();
                    zD = fetVar.d(fL) | fetVar.d(fL);
                    objP5 = fetVar.P();
                    if (zD) {
                        if (zBooleanValue) {
                            f5 = (-(fL * f)) * 2.0f;
                        } else {
                            zcl zclVar8 = qmk.f28987a;
                            f5 = 0.0f;
                        }
                        objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                    } else {
                        if (zBooleanValue) {
                            f5 = (-(fL * f)) * 2.0f;
                        } else {
                            zcl zclVar9 = qmk.f28987a;
                            f5 = 0.0f;
                        }
                        objP5 = twn.j(f5 - ((f / 2.0f) + f), fetVar);
                    }
                    f6 = ((ycl) objP5).f42389a;
                    i11 = iIntValue + 2;
                    i12 = 0;
                    while (i12 < i11) {
                        zE4 = fetVar.e(iIntValue2) | fetVar.e(i12);
                        objP6 = fetVar.P();
                        if (zE4) {
                            if (iIntValue2 == i12) {
                                j3 = primary;
                            } else {
                                j3 = j;
                            }
                            objP6 = dw9.e(j3, fetVar);
                        } else {
                            if (iIntValue2 == i12) {
                                j3 = primary;
                            } else {
                                j3 = j;
                            }
                            objP6 = dw9.e(j3, fetVar);
                        }
                        long j7 = ((y3d) objP6).f41946a;
                        zE5 = fetVar.e(iK) | fetVar.e(i6) | fetVar.e(i12);
                        i13 = iN;
                        objP7 = fetVar.P();
                        if (zE5) {
                            i14 = (iIntValue - i12) + 1;
                            int i27 = i10;
                            if (iK == i5) {
                                i15 = 2;
                                if (iK == i5) {
                                    float f1111119 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111110 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111111 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                } else {
                                    float f11111112 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111113 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111114 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i15 = 2;
                                if (iK == i5) {
                                    float f11111115 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111116 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111117 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                } else {
                                    float f11111118 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f11111119 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111110 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                }
                            }
                            objP7 = twn.j(f7, fetVar);
                        } else {
                            i14 = (iIntValue - i12) + 1;
                            int i28 = i10;
                            if (iK == i5) {
                                i15 = 2;
                                if (iK == i5) {
                                    float f111111111 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111112 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111113 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                } else {
                                    float f111111114 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111115 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111116 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i15 = 2;
                                if (iK == i5) {
                                    float f111111117 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111118 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f111111119 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                } else {
                                    float f1111111110 = b;
                                    if (iK == i6) {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f1111111111 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    } else {
                                        i15 = 2;
                                        if (iK == i6) {
                                        }
                                        float f1111111112 = c;
                                        if (iK >= i6) {
                                        }
                                        if (iK >= i6) {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        } else {
                                            i16 = i13 - iK;
                                            i17 = i5;
                                            if (i16 == i6) {
                                            }
                                            if (i16 == i6) {
                                                i19 = 2;
                                                if (i14 == 2) {
                                                    obj2 = obj;
                                                } else {
                                                    i18 = i17 + 2;
                                                    obj2 = obj;
                                                    if (i16 == i18) {
                                                    }
                                                    if (i16 == i18) {
                                                        i19 = 2;
                                                        if (i14 == 2) {
                                                        }
                                                    } else {
                                                        i19 = 2;
                                                    }
                                                    if (i16 < i6) {
                                                    }
                                                    if (i16 >= i6) {
                                                    }
                                                }
                                                f7 = f2;
                                            } else {
                                                i18 = i17 + 2;
                                                obj2 = obj;
                                                if (i16 == i18) {
                                                }
                                                if (i16 == i18) {
                                                    i19 = 2;
                                                    if (i14 == 2) {
                                                        f7 = f2;
                                                    }
                                                } else {
                                                    i19 = 2;
                                                }
                                                if (i16 < i6) {
                                                }
                                                if (i16 >= i6) {
                                                }
                                                f7 = f2;
                                            }
                                        }
                                    }
                                }
                            }
                            objP7 = twn.j(f7, fetVar);
                        }
                        float f1210 = f6;
                        b(j7, ((ycl) objP7).f42389a, f1210, fetVar, 0);
                        i12++;
                        i6 = i6;
                        iIntValue2 = iIntValue2;
                        iN = i13;
                        i5 = i17;
                        i10 = 1;
                        f6 = f1210;
                        obj = obj2;
                    }
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1936568886);
                    while (i4 < iIntValue) {
                        zE = fetVar.e(iK) | fetVar.e(i4);
                        objP2 = fetVar.P();
                        if (zE) {
                            if (iK == i4) {
                                j2 = primary;
                            } else {
                                j2 = j;
                            }
                            objP2 = dw9.e(j2, fetVar);
                        } else {
                            if (iK == i4) {
                                j2 = primary;
                            } else {
                                j2 = j;
                            }
                            objP2 = dw9.e(j2, fetVar);
                        }
                        b(((y3d) objP2).f41946a, f22751a, f / 2.0f, fetVar, 432);
                    }
                    fetVar.r(false);
                }
                fetVar.r(true);
                mm40Var2 = mm40Var4;
                y3dVar3 = y3dVar5;
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        y3dVar3 = y3dVar2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b5 = 1;
            function2 = new Function2() { // from class: a.m1i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b6 = b5;
                    int i29 = i;
                    switch (b6) {
                        case 0:
                            ((Integer) obj4).getClass();
                            n1i.a(mm40Var2, xk80Var, smmVar, y3dVar3, (fet) obj3, x8x.L(i29 | 1), i2);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            n1i.a(mm40Var2, xk80Var, smmVar, y3dVar3, (fet) obj3, x8x.L(i29 | 1), i2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void b(final long j, final float f, final float f2, fet fetVar, final int i) {
        fetVar.g0(-2118385350);
        int i2 = (fetVar.f(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(ffb0.R(jm40Var, f2, 0.0f, 2), f22751a * 2.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zq8.a(0, fetVar, o7k0.n(i120.Q(lgb.J(hp4.C(jr8.f16991a.b(s5x0.L(jm40Var, d / 2.0f, 0.0f, 2), zx7Var)), vgg0.f37379a), j, jd8.n), f));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.l1i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n1i.b(j, f, f2, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }
}
