package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class dmq {
    static {
        int i = bso.f3140a;
        i1t0 i1t0Var = i1t0.f14017a;
        int i2 = zro.f44865a;
    }

    public static final void a(final Function0 function0, final mm40 mm40Var, yjj0 yjj0Var, final long j, final long j2, slq slqVar, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        Function0 function1;
        int i3;
        final yjj0 yjj0VarA;
        long j3;
        long j4;
        final slq slqVar2;
        fetVar.g0(748201188);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                yjj0VarA = yjj0Var;
                int i4 = fetVar.g(yjj0VarA) ? 256 : 128;
                i3 |= i4;
            } else {
                yjj0VarA = yjj0Var;
            }
            i3 |= i4;
        } else {
            yjj0VarA = yjj0Var;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i3 |= fetVar.f(j3) ? 2048 : 1024;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            j4 = j2;
            i3 |= fetVar.f(j4) ? 16384 : 8192;
        } else {
            j4 = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                slqVar2 = slqVar;
                int i5 = fetVar.g(slqVar2) ? 131072 : 65536;
                i3 |= i5;
            } else {
                slqVar2 = slqVar;
            }
            i3 |= i5;
        } else {
            slqVar2 = slqVar;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= fetVar.g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.i(ugdVar) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 4) != 0) {
                    yjj0VarA = elj0.a(suo.f32831a, fetVar);
                    i3 &= -897;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    slqVar2 = new slq(tuo.f34560a, tuo.d, tuo.b, tuo.c);
                }
            } else {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            slq slqVar3 = slqVar2;
            fetVar.s();
            int i6 = i3 << 9;
            long j5 = j3;
            yjj0 yjj0Var2 = yjj0VarA;
            b(function1, k1t0.a(aso.f1400a, fetVar), suo.b, mm40Var, yjj0Var2, j5, j4, slqVar3, ugdVar, fetVar, (i6 & 1879048192) | (i3 & 14) | 3456 | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6), (i3 >> 21) & 14);
            yjj0VarA = yjj0Var2;
            slqVar2 = slqVar3;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.amq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dmq.a(function0, mm40Var, yjj0VarA, j, j2, slqVar2, ugdVar, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, final y9q0 y9q0Var, final float f, final mm40 mm40Var, final yjj0 yjj0Var, final long j, final long j2, final slq slqVar, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        ugd ugdVar2;
        int i4;
        fetVar.g0(121669932);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(y9q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.d(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(mm40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.g(yjj0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar.f(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.f(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= fetVar.g(slqVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= fetVar.g(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            ugdVar2 = ugdVar;
            i4 = i2 | (fetVar.i(ugdVar2) ? 4 : 2);
        } else {
            ugdVar2 = ugdVar;
            i4 = i2;
        }
        if (fetVar.U(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            fetVar.e0(-282833393);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            fetVar.r(false);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new rnp((byte) 9);
                fetVar.o0(objP2);
            }
            mm40 mm40VarA = pai0.a(mm40Var, false, (Function1) objP2);
            float f2 = slqVar.f32412a;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zG = fetVar.g(gy40Var);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new vlq(slqVar.f32412a, slqVar.b, slqVar.d, slqVar.c);
                fetVar.o0(objP3);
            }
            vlq vlqVar = (vlq) objP3;
            boolean zI = fetVar.i(vlqVar) | (((i6 ^ 48) > 32 && fetVar.g(slqVar)) || (i5 & 48) == 32);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new cbq(vlqVar, slqVar, null, (byte) 1);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, slqVar, (Function2) objP4);
            boolean zG2 = fetVar.g(gy40Var) | fetVar.i(vlqVar);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj) {
                objP5 = new g6q((Object) gy40Var, (Object) vlqVar, (yje) null, (byte) 7);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, gy40Var, (Function2) objP5);
            int i7 = i3 >> 6;
            gmn0.b(function0, mm40VarA, false, yjj0Var, j, j2, f2, ((ycl) ((hgk0) vlqVar.e.c.b).getValue()).f42389a, gy40Var, u1c.M(-1779603465, new cmq(j2, y9q0Var, f, ugdVar2), fetVar), fetVar, (i3 & 14) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 260);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.bmq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    dmq.b(function0, y9q0Var, f, mm40Var, yjj0Var, j, j2, slqVar, ugdVar, (fet) obj2, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }
}
