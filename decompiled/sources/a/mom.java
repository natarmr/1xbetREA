package a;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22141a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        zcl zclVar = qmk.f28987a;
        f22141a = 16.0f;
        b = 40.0f;
        c = 4.0f;
        d = 2.5f;
    }

    public static final void a(long j, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-1571536693);
        int i2 = (fetVar.f(j) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (objP == obj) {
                w03 w03VarA = z03.a();
                w03VarA.j(1);
                fetVar.o0(w03VarA);
                obj2 = w03VarA;
            }
            Object obj3 = (w03) obj2;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = jgk0.b(new unl(function0, (byte) 23));
                fetVar.o0(objP2);
            }
            Object objB = d43.b(((Number) ((l7m0) objP2).getValue()).floatValue(), ro4.m0(150, 0, null, 6), null, null, fetVar, 48, 28);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP3 = fetVar.P();
            if (z || objP3 == obj) {
                objP3 = new cjl(function0, (byte) 16);
                fetVar.o0(objP3);
            }
            AtomicInteger atomicInteger = pai0.f26656a;
            mm40 mm40VarN = o7k0.n(new bpc((Function1) objP3), f22141a);
            boolean zG = (i3 == 32) | fetVar.g(objB) | ((i2 & 14) == 4) | fetVar.i(obj3);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                Object as0Var = new as0((Object) function0, objB, j, obj3, (byte) 3);
                fetVar.o0(as0Var);
                objP4 = as0Var;
            }
            p8a.k(mm40VarN, (Function1) objP4, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ub4(j, function0, i);
        }
    }

    public static final void b(final mm40 mm40Var, final wom womVar, final boolean z, long j, long j2, float f, fet fetVar, final int i, final int i2) {
        int i3;
        boolean z2;
        long backgroundContent;
        long secondary;
        final float f2;
        final long j3;
        final long j4;
        int i4;
        long j5;
        long j6;
        float f3;
        womVar.getClass();
        fetVar.g0(406890920);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(womVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                backgroundContent = j;
                int i5 = fetVar.f(backgroundContent) ? 2048 : 1024;
                i3 |= i5;
            } else {
                backgroundContent = j;
            }
            i3 |= i5;
        } else {
            backgroundContent = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                secondary = j2;
                int i6 = fetVar.f(secondary) ? 16384 : 8192;
                i3 |= i6;
            } else {
                secondary = j2;
            }
            i3 |= i6;
        } else {
            secondary = j2;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 8) != 0) {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    secondary = s6t0.b().f33626a.getSecondary();
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                j5 = secondary;
                j6 = backgroundContent;
                f3 = v8d0.d;
            } else {
                fetVar.X();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                i4 = i3 & (-458753);
                j5 = secondary;
                j6 = backgroundContent;
                f3 = f;
            }
            fetVar.s();
            d(mm40Var, womVar, z2, f3, null, j6, u1c.M(803547266, new iom(womVar, j5, b2), fetVar), fetVar, (i4 & 14) | 1572864 | (i4 & 112) | (i4 & 896) | ((i4 << 6) & 458752));
            f2 = f3;
            j4 = j6;
            j3 = j5;
        } else {
            fetVar.X();
            f2 = f;
            j3 = secondary;
            j4 = backgroundContent;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.jom
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mom.b(mm40Var, womVar, z, j4, j3, f2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0201  */
    /* JADX WARN: Code duplicated, block: B:134:0x0213  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[PHI: r16
  0x009f: PHI (r16v20 int) = (r16v0 int), (r16v6 int), (r16v7 int) binds: [B:54:0x009d, B:64:0x00ba, B:63:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
    public static final void c(mm40 mm40Var, final boolean z, wom womVar, u12 u12Var, boolean z2, vj50 vj50Var, final Function0 function0, ydr ydrVar, final xdr xdrVar, fet fetVar, final int i, final int i2) {
        int i3;
        wom womVarF;
        u12 u12Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        boolean zI;
        int i8;
        int i9;
        boolean z4;
        mm40 mm40Var2;
        final ydr ydrVar2;
        final wom womVar2;
        final u12 u12Var3;
        final vj50 vj50Var2;
        final boolean z5;
        yfe0 yfe0VarU;
        int i10;
        mm40 mm40VarV;
        u12 u12Var4;
        vj50 vj50Var3;
        ydr ydrVarM;
        int i11;
        int i12;
        function0.getClass();
        xdrVar.getClass();
        fetVar.g0(-272091709);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                womVarF = womVar;
                int i14 = fetVar.g(womVarF) ? 256 : 128;
                i3 |= i14;
            } else {
                womVarF = womVar;
            }
            i3 |= i14;
        } else {
            womVarF = womVar;
        }
        int i15 = i2 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                u12Var2 = u12Var;
                i3 |= fetVar.g(u12Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (fetVar.h(z3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                i7 = 196608;
                if (i6 == 0) {
                    i3 |= i7;
                } else if ((i & 196608) == 0) {
                    if ((i & 262144) == 0) {
                        zI = fetVar.g(vj50Var);
                    } else {
                        zI = fetVar.i(vj50Var);
                    }
                    if (zI) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function0)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        if (fetVar.i(ydrVar)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) == 0) {
                        if (fetVar.i(xdrVar)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (fetVar.U(i3 & 1, z4)) {
                        fetVar.Z();
                        i10 = i & 1;
                        mm40VarV = jm40.b;
                        if (i10 != 0 || fetVar.B()) {
                            if (i13 != 0) {
                                mm40Var2 = mm40VarV;
                            } else {
                                mm40Var2 = mm40Var;
                            }
                            if ((i2 & 4) != 0) {
                                womVarF = f(fetVar);
                                i3 &= -897;
                            }
                            if (i15 != 0) {
                                u12Var4 = gqw0.f11754a;
                            } else {
                                u12Var4 = u12Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                vj50Var3 = null;
                            } else {
                                vj50Var3 = vj50Var;
                            }
                            if (i8 != 0) {
                                ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                            } else {
                                ydrVarM = ydrVar;
                            }
                        } else {
                            fetVar.X();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            mm40Var2 = mm40Var;
                            ydrVarM = ydrVar;
                            u12Var4 = u12Var2;
                            vj50Var3 = vj50Var;
                        }
                        fetVar.s();
                        zcl zclVar = qmk.f28987a;
                        mm40Var2.getClass();
                        womVarF.getClass();
                        mm40 mm40VarE = mm40Var2.e(new eom(z, function0, z3, womVarF));
                        if (vj50Var3 != null) {
                            mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                        }
                        mm40 mm40VarE2 = mm40VarE.e(mm40VarV);
                        tj30 tj30VarC = zq8.c(u12Var4, false);
                        int i16 = i3;
                        wom womVar3 = womVarF;
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
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
                        Integer numValueOf = Integer.valueOf(((i16 >> 21) & 112) | 6);
                        jr8 jr8Var = jr8.f16991a;
                        xdrVar.F(jr8Var, fetVar, numValueOf);
                        ydrVarM.j(jr8Var, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i16 & 112) | ((i16 >> 15) & 896)));
                        fetVar.r(true);
                        womVar2 = womVar3;
                        u12Var3 = u12Var4;
                        vj50Var2 = vj50Var3;
                        ydrVar2 = ydrVarM;
                    } else {
                        fetVar.X();
                        mm40Var2 = mm40Var;
                        ydrVar2 = ydrVar;
                        womVar2 = womVarF;
                        u12Var3 = u12Var2;
                        vj50Var2 = vj50Var;
                    }
                    z5 = z3;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        final mm40 mm40Var3 = mm40Var2;
                        yfe0VarU.d = new Function2() { // from class: a.hom
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                mom.c(mm40Var3, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i & 100663296) == 0) {
                    if (fetVar.i(xdrVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    fetVar.Z();
                    i10 = i & 1;
                    mm40VarV = jm40.b;
                    if (i10 != 0) {
                        if (i13 != 0) {
                            mm40Var2 = mm40VarV;
                        } else {
                            mm40Var2 = mm40Var;
                        }
                        if ((i2 & 4) != 0) {
                            womVarF = f(fetVar);
                            i3 &= -897;
                        }
                        if (i15 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            vj50Var3 = null;
                        } else {
                            vj50Var3 = vj50Var;
                        }
                        if (i8 != 0) {
                            ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                        } else {
                            ydrVarM = ydrVar;
                        }
                    } else {
                        if (i13 != 0) {
                            mm40Var2 = mm40VarV;
                        } else {
                            mm40Var2 = mm40Var;
                        }
                        if ((i2 & 4) != 0) {
                            womVarF = f(fetVar);
                            i3 &= -897;
                        }
                        if (i15 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            vj50Var3 = null;
                        } else {
                            vj50Var3 = vj50Var;
                        }
                        if (i8 != 0) {
                            ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                        } else {
                            ydrVarM = ydrVar;
                        }
                    }
                    fetVar.s();
                    zcl zclVar2 = qmk.f28987a;
                    mm40Var2.getClass();
                    womVarF.getClass();
                    mm40 mm40VarE3 = mm40Var2.e(new eom(z, function0, z3, womVarF));
                    if (vj50Var3 != null) {
                        mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                    }
                    mm40 mm40VarE4 = mm40VarE3.e(mm40VarV);
                    tj30 tj30VarC2 = zq8.c(u12Var4, false);
                    int i17 = i3;
                    wom womVar4 = womVarF;
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE4);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC1, gqw0.v);
                    Integer numValueOf2 = Integer.valueOf(((i17 >> 21) & 112) | 6);
                    jr8 jr8Var2 = jr8.f16991a;
                    xdrVar.F(jr8Var2, fetVar, numValueOf2);
                    ydrVarM.j(jr8Var2, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i17 & 112) | ((i17 >> 15) & 896)));
                    fetVar.r(true);
                    womVar2 = womVar4;
                    u12Var3 = u12Var4;
                    vj50Var2 = vj50Var3;
                    ydrVar2 = ydrVarM;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ydrVar2 = ydrVar;
                    womVar2 = womVarF;
                    u12Var3 = u12Var2;
                    vj50Var2 = vj50Var;
                }
                z5 = z3;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final mm40 mm40Var4 = mm40Var2;
                    yfe0VarU.d = new Function2() { // from class: a.hom
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mom.c(mm40Var4, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 24576;
            z3 = z2;
            i6 = i2 & 32;
            i7 = 196608;
            if (i6 == 0) {
                i3 |= i7;
            } else if ((i & 196608) == 0) {
                if ((i & 262144) == 0) {
                    zI = fetVar.g(vj50Var);
                } else {
                    zI = fetVar.i(vj50Var);
                }
                if (zI) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if (fetVar.i(function0)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (fetVar.i(ydrVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) == 0) {
                    if (fetVar.i(xdrVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    fetVar.Z();
                    i10 = i & 1;
                    mm40VarV = jm40.b;
                    if (i10 != 0) {
                        if (i13 != 0) {
                            mm40Var2 = mm40VarV;
                        } else {
                            mm40Var2 = mm40Var;
                        }
                        if ((i2 & 4) != 0) {
                            womVarF = f(fetVar);
                            i3 &= -897;
                        }
                        if (i15 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            vj50Var3 = null;
                        } else {
                            vj50Var3 = vj50Var;
                        }
                        if (i8 != 0) {
                            ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                        } else {
                            ydrVarM = ydrVar;
                        }
                    } else {
                        if (i13 != 0) {
                            mm40Var2 = mm40VarV;
                        } else {
                            mm40Var2 = mm40Var;
                        }
                        if ((i2 & 4) != 0) {
                            womVarF = f(fetVar);
                            i3 &= -897;
                        }
                        if (i15 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            vj50Var3 = null;
                        } else {
                            vj50Var3 = vj50Var;
                        }
                        if (i8 != 0) {
                            ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                        } else {
                            ydrVarM = ydrVar;
                        }
                    }
                    fetVar.s();
                    zcl zclVar3 = qmk.f28987a;
                    mm40Var2.getClass();
                    womVarF.getClass();
                    mm40 mm40VarE5 = mm40Var2.e(new eom(z, function0, z3, womVarF));
                    if (vj50Var3 != null) {
                        mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                    }
                    mm40 mm40VarE6 = mm40VarE5.e(mm40VarV);
                    tj30 tj30VarC3 = zq8.c(u12Var4, false);
                    int i18 = i3;
                    wom womVar5 = womVarF;
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE6);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC2, gqw0.v);
                    Integer numValueOf3 = Integer.valueOf(((i18 >> 21) & 112) | 6);
                    jr8 jr8Var3 = jr8.f16991a;
                    xdrVar.F(jr8Var3, fetVar, numValueOf3);
                    ydrVarM.j(jr8Var3, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i18 & 112) | ((i18 >> 15) & 896)));
                    fetVar.r(true);
                    womVar2 = womVar5;
                    u12Var3 = u12Var4;
                    vj50Var2 = vj50Var3;
                    ydrVar2 = ydrVarM;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ydrVar2 = ydrVar;
                    womVar2 = womVarF;
                    u12Var3 = u12Var2;
                    vj50Var2 = vj50Var;
                }
                z5 = z3;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final mm40 mm40Var5 = mm40Var2;
                    yfe0VarU.d = new Function2() { // from class: a.hom
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mom.c(mm40Var5, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) == 0) {
                if (fetVar.i(xdrVar)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                i10 = i & 1;
                mm40VarV = jm40.b;
                if (i10 != 0) {
                    if (i13 != 0) {
                        mm40Var2 = mm40VarV;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 4) != 0) {
                        womVarF = f(fetVar);
                        i3 &= -897;
                    }
                    if (i15 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        vj50Var3 = null;
                    } else {
                        vj50Var3 = vj50Var;
                    }
                    if (i8 != 0) {
                        ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                    } else {
                        ydrVarM = ydrVar;
                    }
                } else {
                    if (i13 != 0) {
                        mm40Var2 = mm40VarV;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 4) != 0) {
                        womVarF = f(fetVar);
                        i3 &= -897;
                    }
                    if (i15 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        vj50Var3 = null;
                    } else {
                        vj50Var3 = vj50Var;
                    }
                    if (i8 != 0) {
                        ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                    } else {
                        ydrVarM = ydrVar;
                    }
                }
                fetVar.s();
                zcl zclVar4 = qmk.f28987a;
                mm40Var2.getClass();
                womVarF.getClass();
                mm40 mm40VarE7 = mm40Var2.e(new eom(z, function0, z3, womVarF));
                if (vj50Var3 != null) {
                    mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                }
                mm40 mm40VarE8 = mm40VarE7.e(mm40VarV);
                tj30 tj30VarC4 = zq8.c(u12Var4, false);
                int i19 = i3;
                wom womVar6 = womVarF;
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE8);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC4, gqw0.x);
                jpm0.o(fetVar, bh90VarM4, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC3, gqw0.v);
                Integer numValueOf4 = Integer.valueOf(((i19 >> 21) & 112) | 6);
                jr8 jr8Var4 = jr8.f16991a;
                xdrVar.F(jr8Var4, fetVar, numValueOf4);
                ydrVarM.j(jr8Var4, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i19 & 112) | ((i19 >> 15) & 896)));
                fetVar.r(true);
                womVar2 = womVar6;
                u12Var3 = u12Var4;
                vj50Var2 = vj50Var3;
                ydrVar2 = ydrVarM;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ydrVar2 = ydrVar;
                womVar2 = womVarF;
                u12Var3 = u12Var2;
                vj50Var2 = vj50Var;
            }
            z5 = z3;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final mm40 mm40Var6 = mm40Var2;
                yfe0VarU.d = new Function2() { // from class: a.hom
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mom.c(mm40Var6, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        u12Var2 = u12Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (fetVar.h(z3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            i7 = 196608;
            if (i6 == 0) {
                i3 |= i7;
            } else if ((i & 196608) == 0) {
                if ((i & 262144) == 0) {
                    zI = fetVar.g(vj50Var);
                } else {
                    zI = fetVar.i(vj50Var);
                }
                if (zI) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if (fetVar.i(function0)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    if (fetVar.i(ydrVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) == 0) {
                    if (fetVar.i(xdrVar)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fetVar.U(i3 & 1, z4)) {
                    fetVar.Z();
                    i10 = i & 1;
                    mm40VarV = jm40.b;
                    if (i10 != 0) {
                        if (i13 != 0) {
                            mm40Var2 = mm40VarV;
                        } else {
                            mm40Var2 = mm40Var;
                        }
                        if ((i2 & 4) != 0) {
                            womVarF = f(fetVar);
                            i3 &= -897;
                        }
                        if (i15 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            vj50Var3 = null;
                        } else {
                            vj50Var3 = vj50Var;
                        }
                        if (i8 != 0) {
                            ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                        } else {
                            ydrVarM = ydrVar;
                        }
                    } else {
                        if (i13 != 0) {
                            mm40Var2 = mm40VarV;
                        } else {
                            mm40Var2 = mm40Var;
                        }
                        if ((i2 & 4) != 0) {
                            womVarF = f(fetVar);
                            i3 &= -897;
                        }
                        if (i15 != 0) {
                            u12Var4 = gqw0.f11754a;
                        } else {
                            u12Var4 = u12Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            vj50Var3 = null;
                        } else {
                            vj50Var3 = vj50Var;
                        }
                        if (i8 != 0) {
                            ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                        } else {
                            ydrVarM = ydrVar;
                        }
                    }
                    fetVar.s();
                    zcl zclVar5 = qmk.f28987a;
                    mm40Var2.getClass();
                    womVarF.getClass();
                    mm40 mm40VarE9 = mm40Var2.e(new eom(z, function0, z3, womVarF));
                    if (vj50Var3 != null) {
                        mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                    }
                    mm40 mm40VarE10 = mm40VarE9.e(mm40VarV);
                    tj30 tj30VarC5 = zq8.c(u12Var4, false);
                    int i110 = i3;
                    wom womVar7 = womVarF;
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE10);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC5, gqw0.x);
                    jpm0.o(fetVar, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC4, gqw0.v);
                    Integer numValueOf5 = Integer.valueOf(((i110 >> 21) & 112) | 6);
                    jr8 jr8Var5 = jr8.f16991a;
                    xdrVar.F(jr8Var5, fetVar, numValueOf5);
                    ydrVarM.j(jr8Var5, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i110 & 112) | ((i110 >> 15) & 896)));
                    fetVar.r(true);
                    womVar2 = womVar7;
                    u12Var3 = u12Var4;
                    vj50Var2 = vj50Var3;
                    ydrVar2 = ydrVarM;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                    ydrVar2 = ydrVar;
                    womVar2 = womVarF;
                    u12Var3 = u12Var2;
                    vj50Var2 = vj50Var;
                }
                z5 = z3;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final mm40 mm40Var7 = mm40Var2;
                    yfe0VarU.d = new Function2() { // from class: a.hom
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mom.c(mm40Var7, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i & 100663296) == 0) {
                if (fetVar.i(xdrVar)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                i10 = i & 1;
                mm40VarV = jm40.b;
                if (i10 != 0) {
                    if (i13 != 0) {
                        mm40Var2 = mm40VarV;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 4) != 0) {
                        womVarF = f(fetVar);
                        i3 &= -897;
                    }
                    if (i15 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        vj50Var3 = null;
                    } else {
                        vj50Var3 = vj50Var;
                    }
                    if (i8 != 0) {
                        ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                    } else {
                        ydrVarM = ydrVar;
                    }
                } else {
                    if (i13 != 0) {
                        mm40Var2 = mm40VarV;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 4) != 0) {
                        womVarF = f(fetVar);
                        i3 &= -897;
                    }
                    if (i15 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        vj50Var3 = null;
                    } else {
                        vj50Var3 = vj50Var;
                    }
                    if (i8 != 0) {
                        ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                    } else {
                        ydrVarM = ydrVar;
                    }
                }
                fetVar.s();
                zcl zclVar6 = qmk.f28987a;
                mm40Var2.getClass();
                womVarF.getClass();
                mm40 mm40VarE11 = mm40Var2.e(new eom(z, function0, z3, womVarF));
                if (vj50Var3 != null) {
                    mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                }
                mm40 mm40VarE12 = mm40VarE11.e(mm40VarV);
                tj30 tj30VarC6 = zq8.c(u12Var4, false);
                int i111 = i3;
                wom womVar8 = womVarF;
                int iHashCode6 = Long.hashCode(fetVar.T);
                bh90 bh90VarM6 = fetVar.m();
                mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarE12);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC6, gqw0.x);
                jpm0.o(fetVar, bh90VarM6, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode6), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC5, gqw0.v);
                Integer numValueOf6 = Integer.valueOf(((i111 >> 21) & 112) | 6);
                jr8 jr8Var6 = jr8.f16991a;
                xdrVar.F(jr8Var6, fetVar, numValueOf6);
                ydrVarM.j(jr8Var6, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i111 & 112) | ((i111 >> 15) & 896)));
                fetVar.r(true);
                womVar2 = womVar8;
                u12Var3 = u12Var4;
                vj50Var2 = vj50Var3;
                ydrVar2 = ydrVarM;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ydrVar2 = ydrVar;
                womVar2 = womVarF;
                u12Var3 = u12Var2;
                vj50Var2 = vj50Var;
            }
            z5 = z3;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final mm40 mm40Var8 = mm40Var2;
                yfe0VarU.d = new Function2() { // from class: a.hom
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mom.c(mm40Var8, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        z3 = z2;
        i6 = i2 & 32;
        i7 = 196608;
        if (i6 == 0) {
            i3 |= i7;
        } else if ((i & 196608) == 0) {
            if ((i & 262144) == 0) {
                zI = fetVar.g(vj50Var);
            } else {
                zI = fetVar.i(vj50Var);
            }
            if (zI) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((i & 1572864) == 0) {
            if (fetVar.i(function0)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((i & 12582912) == 0) {
                if (fetVar.i(ydrVar)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) == 0) {
                if (fetVar.i(xdrVar)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar.U(i3 & 1, z4)) {
                fetVar.Z();
                i10 = i & 1;
                mm40VarV = jm40.b;
                if (i10 != 0) {
                    if (i13 != 0) {
                        mm40Var2 = mm40VarV;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 4) != 0) {
                        womVarF = f(fetVar);
                        i3 &= -897;
                    }
                    if (i15 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        vj50Var3 = null;
                    } else {
                        vj50Var3 = vj50Var;
                    }
                    if (i8 != 0) {
                        ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                    } else {
                        ydrVarM = ydrVar;
                    }
                } else {
                    if (i13 != 0) {
                        mm40Var2 = mm40VarV;
                    } else {
                        mm40Var2 = mm40Var;
                    }
                    if ((i2 & 4) != 0) {
                        womVarF = f(fetVar);
                        i3 &= -897;
                    }
                    if (i15 != 0) {
                        u12Var4 = gqw0.f11754a;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        vj50Var3 = null;
                    } else {
                        vj50Var3 = vj50Var;
                    }
                    if (i8 != 0) {
                        ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                    } else {
                        ydrVarM = ydrVar;
                    }
                }
                fetVar.s();
                zcl zclVar7 = qmk.f28987a;
                mm40Var2.getClass();
                womVarF.getClass();
                mm40 mm40VarE13 = mm40Var2.e(new eom(z, function0, z3, womVarF));
                if (vj50Var3 != null) {
                    mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
                }
                mm40 mm40VarE14 = mm40VarE13.e(mm40VarV);
                tj30 tj30VarC7 = zq8.c(u12Var4, false);
                int i112 = i3;
                wom womVar9 = womVarF;
                int iHashCode7 = Long.hashCode(fetVar.T);
                bh90 bh90VarM7 = fetVar.m();
                mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarE14);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC7, gqw0.x);
                jpm0.o(fetVar, bh90VarM7, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode7), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC6, gqw0.v);
                Integer numValueOf7 = Integer.valueOf(((i112 >> 21) & 112) | 6);
                jr8 jr8Var7 = jr8.f16991a;
                xdrVar.F(jr8Var7, fetVar, numValueOf7);
                ydrVarM.j(jr8Var7, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i112 & 112) | ((i112 >> 15) & 896)));
                fetVar.r(true);
                womVar2 = womVar9;
                u12Var3 = u12Var4;
                vj50Var2 = vj50Var3;
                ydrVar2 = ydrVarM;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                ydrVar2 = ydrVar;
                womVar2 = womVarF;
                u12Var3 = u12Var2;
                vj50Var2 = vj50Var;
            }
            z5 = z3;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                final mm40 mm40Var9 = mm40Var2;
                yfe0VarU.d = new Function2() { // from class: a.hom
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mom.c(mm40Var9, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 12582912;
        if ((i & 100663296) == 0) {
            if (fetVar.i(xdrVar)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        }
        if ((i3 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (fetVar.U(i3 & 1, z4)) {
            fetVar.Z();
            i10 = i & 1;
            mm40VarV = jm40.b;
            if (i10 != 0) {
                if (i13 != 0) {
                    mm40Var2 = mm40VarV;
                } else {
                    mm40Var2 = mm40Var;
                }
                if ((i2 & 4) != 0) {
                    womVarF = f(fetVar);
                    i3 &= -897;
                }
                if (i15 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    vj50Var3 = null;
                } else {
                    vj50Var3 = vj50Var;
                }
                if (i8 != 0) {
                    ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                } else {
                    ydrVarM = ydrVar;
                }
            } else {
                if (i13 != 0) {
                    mm40Var2 = mm40VarV;
                } else {
                    mm40Var2 = mm40Var;
                }
                if ((i2 & 4) != 0) {
                    womVarF = f(fetVar);
                    i3 &= -897;
                }
                if (i15 != 0) {
                    u12Var4 = gqw0.f11754a;
                } else {
                    u12Var4 = u12Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    vj50Var3 = null;
                } else {
                    vj50Var3 = vj50Var;
                }
                if (i8 != 0) {
                    ydrVarM = u1c.M(-1374244259, new fom(womVarF, (byte) 0), fetVar);
                } else {
                    ydrVarM = ydrVar;
                }
            }
            fetVar.s();
            zcl zclVar8 = qmk.f28987a;
            mm40Var2.getClass();
            womVarF.getClass();
            mm40 mm40VarE15 = mm40Var2.e(new eom(z, function0, z3, womVarF));
            if (vj50Var3 != null) {
                mm40VarV = cjx.V(mm40VarV, vj50Var3, null);
            }
            mm40 mm40VarE16 = mm40VarE15.e(mm40VarV);
            tj30 tj30VarC8 = zq8.c(u12Var4, false);
            int i113 = i3;
            wom womVar10 = womVarF;
            int iHashCode8 = Long.hashCode(fetVar.T);
            bh90 bh90VarM8 = fetVar.m();
            mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarE16);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC8, gqw0.x);
            jpm0.o(fetVar, bh90VarM8, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode8), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC7, gqw0.v);
            Integer numValueOf8 = Integer.valueOf(((i113 >> 21) & 112) | 6);
            jr8 jr8Var8 = jr8.f16991a;
            xdrVar.F(jr8Var8, fetVar, numValueOf8);
            ydrVarM.j(jr8Var8, Boolean.valueOf(z), fetVar, Integer.valueOf(6 | (i113 & 112) | ((i113 >> 15) & 896)));
            fetVar.r(true);
            womVar2 = womVar10;
            u12Var3 = u12Var4;
            vj50Var2 = vj50Var3;
            ydrVar2 = ydrVarM;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            ydrVar2 = ydrVar;
            womVar2 = womVarF;
            u12Var3 = u12Var2;
            vj50Var2 = vj50Var;
        }
        z5 = z3;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var10 = mm40Var2;
            yfe0VarU.d = new Function2() { // from class: a.hom
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mom.c(mm40Var10, z, womVar2, u12Var3, z5, vj50Var2, function0, ydrVar2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(final mm40 mm40Var, final wom womVar, final boolean z, final float f, yjj0 yjj0Var, final long j, final ugd ugdVar, fet fetVar, final int i) {
        int i2;
        final yjj0 yjj0Var2;
        int i3;
        womVar.getClass();
        fetVar.g0(-558199318);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(womVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599059 & i2) != 599058)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                yjj0Var2 = vgg0.f37379a;
                i3 = i2 & (-57345);
            } else {
                fetVar.X();
                i3 = i2 & (-57345);
                yjj0Var2 = yjj0Var;
            }
            fetVar.s();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                zcl zclVar = qmk.f28987a;
                pz40 pz40Var = s6t0.f31722a;
                objP = new sqm(0.0f, 1.0f, 4.0f, s6t0.b().f33626a.getShadowStrong(), qmk.m);
                fetVar.o0(objP);
            }
            sqm sqmVar = (sqm) objP;
            mm40 mm40VarN = o7k0.n(mm40Var, b);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new aim((byte) 11);
                fetVar.o0(objP2);
            }
            mm40 mm40VarM = rq8.M(mm40VarN, (Function1) objP2);
            int i4 = i3 & 112;
            boolean zG = ((((i3 & 7168) ^ 3072) > 2048 && fetVar.d(f)) || (i3 & 3072) == 2048) | (i4 == 32) | fetVar.g(yjj0Var2);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new kom(womVar, f, yjj0Var2, (byte) 0);
                fetVar.o0(objP3);
            }
            mm40 mm40VarQ = knx.Q(mm40VarM, (xdr) objP3);
            boolean z2 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new edl(womVar, (byte) 20);
                fetVar.o0(objP4);
            }
            mm40 mm40VarQ2 = i120.Q(i4w0.T(mm40VarQ, (Function1) objP4).e(qbc.c0(jm40.b, sqmVar)), j, yjj0Var2);
            int i5 = ((i3 >> 9) & 7168) | 48;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ2);
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
            ua80.p(((i5 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
            yjj0Var2 = yjj0Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.lom
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mom.d(mm40Var, womVar, z, f, yjj0Var2, j, ugdVar, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(fhl fhlVar, w03 w03Var, jge0 jge0Var, long j, float f, isl islVar, float f2) {
        zcl zclVar = qmk.f28987a;
        float fMin = Math.min(jge0Var.c - jge0Var.f16474a, jge0Var.d - jge0Var.b) / 2.0f;
        float fW0 = fhlVar.w0(10.0f);
        float f3 = islVar.d;
        w03Var.h();
        w03Var.f(0.0f, 0.0f);
        w03Var.e((fhlVar.w0(10.0f) * f3) / 2.0f, fhlVar.w0(5.0f) * f3);
        w03Var.e(fhlVar.w0(10.0f) * f3, 0.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jge0Var.e() >> 32)) + fMin;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)) - fhlVar.w0(f2);
        w03Var.k((((long) Float.floatToRawIntBits(fIntBitsToFloat - ((fW0 * f3) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fW1 = islVar.c - fhlVar.w0(f2);
        long jE0 = fhlVar.E0();
        nr nrVarA0 = fhlVar.A0();
        long jP = nrVarA0.p();
        nrVarA0.i().l();
        try {
            ((fvt0) nrVarA0.b).y(fW1, jE0);
            fhl.C0(fhlVar, w03Var, j, f, new vtm0(fhlVar.w0(f2), 0.0f, 0, 0, null, 30), 48);
        } finally {
            defpackage.c.g(nrVarA0, jP);
        }
    }

    public static final wom f(fet fetVar) {
        boolean zF = fetVar.f(800L);
        Object objP = fetVar.P();
        if (zF || objP == ukd.f35823a) {
            objP = new wom();
            fetVar.o0(objP);
        }
        return (wom) objP;
    }
}
