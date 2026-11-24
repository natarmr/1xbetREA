package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class dm40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6306a = osm0.e(0.5f, 0.0f);

    /* JADX WARN: Code duplicated, block: B:111:0x0161  */
    /* JADX WARN: Code duplicated, block: B:114:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x019e  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:130:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01cc A[PHI: r31
  0x01cc: PHI (r31v5 boolean) = (r31v2 boolean), (r31v6 boolean) binds: [B:138:0x01ca, B:136:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:156:0x0204  */
    /* JADX WARN: Code duplicated, block: B:158:0x020a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0220  */
    /* JADX WARN: Code duplicated, block: B:165:0x0222  */
    /* JADX WARN: Code duplicated, block: B:168:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x022c  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:188:0x02dd  */
    public static final void a(final Function0 function0, final mm40 mm40Var, xpj0 xpj0Var, float f, boolean z, final yjj0 yjj0Var, final long j, final long j2, final long j3, final Function2 function2, final Function2 function3, final em40 em40Var, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        int i4;
        fet fetVar2;
        xpj0 xpj0Var2;
        final float f2;
        final boolean z2;
        float f3;
        boolean z3;
        int i5;
        boolean z4;
        boolean zI;
        cl5 cl5Var;
        Object np8Var;
        Object objP;
        vne vneVar;
        int i6;
        boolean z5;
        boolean z6;
        Object objP2;
        boolean zI2;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objP3;
        Object objP4;
        t33 t33Var;
        boolean z11;
        boolean z12;
        Object objP5;
        int i7;
        t33 t33Var2;
        boolean z13;
        int i8;
        boolean z14;
        Object objP6;
        fetVar.g0(1904798512);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(xpj0Var) ? 256 : 128;
        }
        int i9 = i3 | 27648;
        if ((196608 & i) == 0) {
            i9 |= fetVar.g(yjj0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i9 |= fetVar.f(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i9 |= fetVar.f(j2) ? 8388608 : 4194304;
        }
        int i10 = i9 | 100663296;
        if ((805306368 & i) == 0) {
            i10 |= fetVar.f(j3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (fetVar.i(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(function3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(em40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i10 & 1, ((306783379 & i10) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                f3 = uo8.c;
                z3 = true;
            } else {
                fetVar.X();
                f3 = f;
                z3 = z;
            }
            fetVar.s();
            yt40 yt40Var = yt40.f43200a;
            nul0 nul0VarP = d7x.P(yt40Var, fetVar);
            nul0 nul0VarP2 = d7x.P(yt40Var, fetVar);
            nul0 nul0VarP3 = d7x.P(yt40.d, fetVar);
            int i11 = (i10 & 896) ^ 384;
            if (i11 <= 256 || !fetVar.g(xpj0Var)) {
                i5 = i4;
                if ((i10 & 384) != 256) {
                    z4 = false;
                }
                zI = z4 | fetVar.i(nul0VarP2) | fetVar.i(nul0VarP3) | fetVar.i(nul0VarP);
                Object objP7 = fetVar.P();
                cl5Var = ukd.f35823a;
                if (!zI || objP7 == cl5Var) {
                    np8Var = new np8(xpj0Var, nul0VarP2, nul0VarP3, nul0VarP, (byte) 1);
                    fetVar.o0(np8Var);
                } else {
                    np8Var = objP7;
                }
                m0x0.D((Function0) np8Var, fetVar);
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP);
                }
                vneVar = (vne) objP;
                boolean zI3 = ((i11 <= 256 && fetVar.g(xpj0Var)) || (i10 & 384) == 256) | fetVar.i(vneVar);
                i6 = i10 & 14;
                if (i6 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zI3 | z5;
                objP2 = fetVar.P();
                if (z6 || objP2 == cl5Var) {
                    objP2 = new yl40(xpj0Var, vneVar, function0);
                    fetVar.o0(objP2);
                }
                Function0 function1 = (Function0) objP2;
                zI2 = fetVar.i(vneVar);
                if (i11 > 256 || !fetVar.g(xpj0Var)) {
                    z7 = zI2;
                    if ((i10 & 384) != 256) {
                        z8 = false;
                    }
                    boolean z15 = z7 | z8;
                    if (i6 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z15 | z9;
                    objP3 = fetVar.P();
                    if (z10 || objP3 == cl5Var) {
                        objP3 = new jl40((Object) vneVar, (Object) xpj0Var, (Object) function0, (byte) 1);
                        fetVar.o0(objP3);
                    }
                    Function1 function4 = (Function1) objP3;
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = xf0.c(0.0f);
                        fetVar.o0(objP4);
                    }
                    t33Var = (t33) objP4;
                    boolean zI4 = ((i11 <= 256 && fetVar.g(xpj0Var)) || (i10 & 384) == 256) | fetVar.i(vneVar) | fetVar.i(t33Var);
                    if (i6 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zI4 | z11;
                    objP5 = fetVar.P();
                    if (!z12 || objP5 == cl5Var) {
                        i7 = i10;
                        t33Var2 = t33Var;
                        z13 = true;
                        mr0 mr0Var = new mr0(xpj0Var, vneVar, t33Var2, function0, (byte) 21);
                        fetVar.o0(mr0Var);
                        objP5 = mr0Var;
                    } else {
                        i7 = i10;
                        t33Var2 = t33Var;
                        z13 = true;
                    }
                    i8 = i7;
                    float f4 = f3;
                    t33 t33Var3 = t33Var2;
                    bm40 bm40Var = new bm40(j3, function1, xpj0Var, em40Var, t33Var3, vneVar, function4, mm40Var, f4, z3, yjj0Var, j, j2, function2, function3, ugdVar);
                    xpj0Var2 = xpj0Var;
                    fetVar2 = fetVar;
                    uvw.e((Function0) objP5, j2, em40Var, t33Var3, u1c.M(1010026864, bm40Var, fetVar2), fetVar2, ((i8 >> 18) & 112) | 24576 | (i5 & 896) | 4096);
                    if (xpj0Var2.e.j().f23849a.containsKey(ypj0.b)) {
                        fetVar2.e0(748459762);
                        z14 = ((i11 > 256 || !fetVar2.g(xpj0Var2)) && (i8 & 384) != 256) ? false : z13;
                        objP6 = fetVar2.P();
                        if (z14 || objP6 == cl5Var) {
                            objP6 = new xp8(xpj0Var2, null, (byte) 9);
                            fetVar2.o0(objP6);
                        }
                        m0x0.t(fetVar2, xpj0Var2, (Function2) objP6);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(748521266);
                        fetVar2.r(false);
                    }
                    f2 = f4;
                    z2 = z3;
                } else {
                    z7 = zI2;
                }
                z8 = true;
                boolean z16 = z7 | z8;
                if (i6 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z16 | z9;
                objP3 = fetVar.P();
                if (z10) {
                    objP3 = new jl40((Object) vneVar, (Object) xpj0Var, (Object) function0, (byte) 1);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new jl40((Object) vneVar, (Object) xpj0Var, (Object) function0, (byte) 1);
                    fetVar.o0(objP3);
                }
                Function1 function5 = (Function1) objP3;
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = xf0.c(0.0f);
                    fetVar.o0(objP4);
                }
                t33Var = (t33) objP4;
                boolean zI5 = ((i11 <= 256 && fetVar.g(xpj0Var)) || (i10 & 384) == 256) | fetVar.i(vneVar) | fetVar.i(t33Var);
                if (i6 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zI5 | z11;
                objP5 = fetVar.P();
                if (z12) {
                    i7 = i10;
                    t33Var2 = t33Var;
                    z13 = true;
                    mr0 mr0Var2 = new mr0(xpj0Var, vneVar, t33Var2, function0, (byte) 21);
                    fetVar.o0(mr0Var2);
                    objP5 = mr0Var2;
                } else {
                    i7 = i10;
                    t33Var2 = t33Var;
                    z13 = true;
                    mr0 mr0Var3 = new mr0(xpj0Var, vneVar, t33Var2, function0, (byte) 21);
                    fetVar.o0(mr0Var3);
                    objP5 = mr0Var3;
                }
                i8 = i7;
                float f5 = f3;
                t33 t33Var4 = t33Var2;
                bm40 bm40Var2 = new bm40(j3, function1, xpj0Var, em40Var, t33Var4, vneVar, function5, mm40Var, f5, z3, yjj0Var, j, j2, function2, function3, ugdVar);
                xpj0Var2 = xpj0Var;
                fetVar2 = fetVar;
                uvw.e((Function0) objP5, j2, em40Var, t33Var4, u1c.M(1010026864, bm40Var2, fetVar2), fetVar2, ((i8 >> 18) & 112) | 24576 | (i5 & 896) | 4096);
                if (xpj0Var2.e.j().f23849a.containsKey(ypj0.b)) {
                    fetVar2.e0(748459762);
                    if (i11 > 256) {
                    }
                    objP6 = fetVar2.P();
                    if (z14) {
                        objP6 = new xp8(xpj0Var2, null, (byte) 9);
                        fetVar2.o0(objP6);
                    } else {
                        objP6 = new xp8(xpj0Var2, null, (byte) 9);
                        fetVar2.o0(objP6);
                    }
                    m0x0.t(fetVar2, xpj0Var2, (Function2) objP6);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(748521266);
                    fetVar2.r(false);
                }
                f2 = f5;
                z2 = z3;
            } else {
                i5 = i4;
            }
            z4 = true;
            zI = z4 | fetVar.i(nul0VarP2) | fetVar.i(nul0VarP3) | fetVar.i(nul0VarP);
            Object objP8 = fetVar.P();
            cl5Var = ukd.f35823a;
            if (zI) {
                np8Var = new np8(xpj0Var, nul0VarP2, nul0VarP3, nul0VarP, (byte) 1);
                fetVar.o0(np8Var);
            } else {
                np8Var = new np8(xpj0Var, nul0VarP2, nul0VarP3, nul0VarP, (byte) 1);
                fetVar.o0(np8Var);
            }
            m0x0.D((Function0) np8Var, fetVar);
            objP = fetVar.P();
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vneVar = (vne) objP;
            boolean zI6 = ((i11 <= 256 && fetVar.g(xpj0Var)) || (i10 & 384) == 256) | fetVar.i(vneVar);
            i6 = i10 & 14;
            if (i6 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zI6 | z5;
            objP2 = fetVar.P();
            if (z6) {
                objP2 = new yl40(xpj0Var, vneVar, function0);
                fetVar.o0(objP2);
            } else {
                objP2 = new yl40(xpj0Var, vneVar, function0);
                fetVar.o0(objP2);
            }
            Function0 function6 = (Function0) objP2;
            zI2 = fetVar.i(vneVar);
            if (i11 > 256) {
                z7 = zI2;
                if ((i10 & 384) != 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                z7 = zI2;
                if ((i10 & 384) != 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            boolean z17 = z7 | z8;
            if (i6 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z17 | z9;
            objP3 = fetVar.P();
            if (z10) {
                objP3 = new jl40((Object) vneVar, (Object) xpj0Var, (Object) function0, (byte) 1);
                fetVar.o0(objP3);
            } else {
                objP3 = new jl40((Object) vneVar, (Object) xpj0Var, (Object) function0, (byte) 1);
                fetVar.o0(objP3);
            }
            Function1 function7 = (Function1) objP3;
            objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = xf0.c(0.0f);
                fetVar.o0(objP4);
            }
            t33Var = (t33) objP4;
            boolean zI7 = ((i11 <= 256 && fetVar.g(xpj0Var)) || (i10 & 384) == 256) | fetVar.i(vneVar) | fetVar.i(t33Var);
            if (i6 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zI7 | z11;
            objP5 = fetVar.P();
            if (z12) {
                i7 = i10;
                t33Var2 = t33Var;
                z13 = true;
                mr0 mr0Var4 = new mr0(xpj0Var, vneVar, t33Var2, function0, (byte) 21);
                fetVar.o0(mr0Var4);
                objP5 = mr0Var4;
            } else {
                i7 = i10;
                t33Var2 = t33Var;
                z13 = true;
                mr0 mr0Var5 = new mr0(xpj0Var, vneVar, t33Var2, function0, (byte) 21);
                fetVar.o0(mr0Var5);
                objP5 = mr0Var5;
            }
            i8 = i7;
            float f6 = f3;
            t33 t33Var5 = t33Var2;
            bm40 bm40Var3 = new bm40(j3, function6, xpj0Var, em40Var, t33Var5, vneVar, function7, mm40Var, f6, z3, yjj0Var, j, j2, function2, function3, ugdVar);
            xpj0Var2 = xpj0Var;
            fetVar2 = fetVar;
            uvw.e((Function0) objP5, j2, em40Var, t33Var5, u1c.M(1010026864, bm40Var3, fetVar2), fetVar2, ((i8 >> 18) & 112) | 24576 | (i5 & 896) | 4096);
            if (xpj0Var2.e.j().f23849a.containsKey(ypj0.b)) {
                fetVar2.e0(748459762);
                if (i11 > 256) {
                }
                objP6 = fetVar2.P();
                if (z14) {
                    objP6 = new xp8(xpj0Var2, null, (byte) 9);
                    fetVar2.o0(objP6);
                } else {
                    objP6 = new xp8(xpj0Var2, null, (byte) 9);
                    fetVar2.o0(objP6);
                }
                m0x0.t(fetVar2, xpj0Var2, (Function2) objP6);
                fetVar2.r(false);
            } else {
                fetVar2.e0(748521266);
                fetVar2.r(false);
            }
            f2 = f6;
            z2 = z3;
        } else {
            fetVar2 = fetVar;
            xpj0Var2 = xpj0Var;
            fetVar2.X();
            f2 = f;
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final xpj0 xpj0Var3 = xpj0Var2;
            yfe0VarU.d = new Function2() { // from class: a.zl40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    dm40.a(function0, mm40Var, xpj0Var3, f2, z2, yjj0Var, j, j2, j3, function2, function3, em40Var, ugdVar, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(final t33 t33Var, final vne vneVar, final Function0 function0, final Function1 function1, final mm40 mm40Var, final xpj0 xpj0Var, final float f, final boolean z, final yjj0 yjj0Var, final long j, final long j2, final float f2, final Function2 function2, final Function2 function3, final ugd ugdVar, fet fetVar, final int i) {
        fetVar.g0(-37400432);
        int i2 = i | (fetVar.i(t33Var) ? 32 : 16) | (fetVar.i(vneVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.g(mm40Var) ? 131072 : 65536) | (fetVar.g(xpj0Var) ? 1048576 : 524288) | (fetVar.d(f) ? 8388608 : 4194304) | (fetVar.h(z) ? 67108864 : 33554432) | (fetVar.g(yjj0Var) ? 536870912 : 268435456);
        int i3 = (fetVar.f(j) ? 4 : 2) | (fetVar.f(j2) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024) | (fetVar.i(function3) ? 16384 : 8192) | (fetVar.i(ugdVar) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            String strJ = jtt0.j(R.string.m3c_bottom_sheet_pane_title, fetVar);
            mm40 mm40VarD = o7k0.d(o7k0.u(jr8.f16991a.b(mm40Var, gqw0.b), 0.0f, f, 1), 1.0f);
            mm40 mm40VarV = jm40.b;
            Object obj = ukd.f35823a;
            if (z) {
                fetVar.e0(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && fetVar.g(xpj0Var)) || (i2 & 1572864) == 1048576;
                Object objP = fetVar.P();
                if (z2 || objP == obj) {
                    ma80 ma80Var = ma80.f21447a;
                    uts0 uts0Var = tpj0.f34337a;
                    objP = new spj0(xpj0Var, function1);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, (vj50) objP, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-1582020872);
                fetVar.r(false);
            }
            mm40 mm40VarE = mm40VarD.e(mm40VarV);
            qv2 qv2Var = xpj0Var.e;
            qv2 qv2Var2 = xpj0Var.e;
            ma80 ma80Var2 = ma80.f21447a;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && fetVar.g(xpj0Var)) || (i2 & 1572864) == 1048576;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                objP2 = new pi40(xpj0Var, (byte) 4);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE2 = s5x0.E(mm40VarE, qv2Var, (Function2) objP2);
            pv2 pv2Var = (pv2) qv2Var2.g;
            boolean z4 = z && xpj0Var.e();
            boolean z5 = ((hgk0) ((pz40) qv2Var2.i)).getValue() != null;
            boolean z6 = (i2 & 57344) == 16384;
            Object objP3 = fetVar.P();
            if (z6 || objP3 == obj) {
                objP3 = new itv0(function1, null, (byte) 2);
                fetVar.o0(objP3);
            }
            mm40 mm40VarA = uel.a(mm40VarE2, pv2Var, ma80Var2, z4, z5, null, (xdr) objP3, 168);
            boolean zG = fetVar.g(strJ);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new ka6(strJ, (byte) 10);
                fetVar.o0(objP4);
            }
            mm40 mm40VarA2 = pai0.a(mm40VarA, false, (Function1) objP4);
            int iL = (int) ((agk0) qv2Var2.l).l();
            if (iL < 0) {
                iL = 0;
            }
            mm40 mm40VarL = j120.L(mm40VarA2, new niq(iL));
            boolean z7 = ((i4 > 1048576 && fetVar.g(xpj0Var)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || fetVar.i(t33Var));
            Object objP5 = fetVar.P();
            if (z7 || objP5 == obj) {
                objP5 = new bw20((Object) xpj0Var, (Object) t33Var, (byte) 26);
                fetVar.o0(objP5);
            }
            int i5 = i3 << 6;
            gmn0.a(i4w0.T(i4w0.T(mm40VarL, (Function1) objP5), new pp8(xpj0Var, (byte) 1)), yjj0Var, j, j2, f2, 0.0f, null, u1c.M(728743275, new cm40(function3, t33Var, xpj0Var, function2, ugdVar, function0, vneVar, z), fetVar), fetVar, ((i2 >> 24) & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 96);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(vneVar, function0, function1, mm40Var, xpj0Var, f, z, yjj0Var, j, j2, f2, function2, function3, ugdVar, i) { // from class: a.xl40
                public final /* synthetic */ vne b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ mm40 e;
                public final /* synthetic */ xpj0 f;
                public final /* synthetic */ float g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ yjj0 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ Function2 m;
                public final /* synthetic */ Function2 n;
                public final /* synthetic */ ugd o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL2 = x8x.L(71);
                    dm40.b(this.f41056a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (fet) obj2, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void c(long j, Function0 function0, boolean z, fet fetVar, int i) {
        fetVar.g0(-391613911);
        byte b = 4;
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.h(true) ? 2048 : 1024);
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (j != 16) {
            fetVar.e0(-1438582326);
            l7m0 l7m0VarB = d43.b(z ? 1.0f : 0.0f, d7x.P(yt40.c, fetVar), null, null, fetVar, 0, 28);
            String strJ = jtt0.j(R.string.close_sheet, fetVar);
            fetVar.e0(-1438283579);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new zy2(function0, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(jm40.b, function0, (PointerInputEventHandler) objP);
            boolean zG = (i3 == 32) | fetVar.g(strJ);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new xfk(strJ, function0, (byte) 1);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA2 = pai0.a(mm40VarA, true, (Function1) objP2);
            fetVar.r(false);
            mm40 mm40VarE = o7k0.c.e(mm40VarA2);
            boolean zG2 = fetVar.g(l7m0VarB) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                objP3 = new m5n(j, l7m0VarB, (byte) 2);
                fetVar.o0(objP3);
            }
            p8a.k(mm40VarE, (Function1) objP3, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(-1437676103);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d5m(j, function0, z, i);
        }
    }

    public static final float d(uag0 uag0Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (uag0Var.r >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (l7x.O(0.0f, Math.min(uag0Var.t.getDensity() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(uag0 uag0Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (uag0Var.r & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (l7x.O(0.0f, Math.min(uag0Var.t.getDensity() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final xpj0 f(fet fetVar) {
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new cp8((byte) 1);
            fetVar.o0(objP);
        }
        return tpj0.b((Function1) objP, ypj0.f43033a, false, fetVar, 384, 56);
    }
}
