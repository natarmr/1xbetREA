package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v8d0 f36977a = new v8d0();
    public static final ugg0 b = vgg0.f37379a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(d9d0 d9d0Var, boolean z, mm40 mm40Var, long j, long j2, float f, fet fetVar, int i, int i2) {
        float f2;
        int i3;
        float f3;
        fetVar.g0(-1076870256);
        long j3 = j;
        long j4 = j2;
        int i4 = i | (fetVar.g(d9d0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128) | (((i2 & 8) == 0 && fetVar.f(j3)) ? 2048 : 1024) | (((i2 & 16) == 0 && fetVar.f(j4)) ? 16384 : 8192) | 65536;
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 8) != 0) {
                    j3 = ((t4d) fetVar.k(v4d.f36771a)).G;
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j4 = ((t4d) fetVar.k(v4d.f36771a)).s;
                    i4 &= -57345;
                }
                i3 = i4 & (-458753);
                f3 = d;
            } else {
                fetVar.X();
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                }
                i3 = i4 & (-458753);
                f3 = f;
            }
            long j5 = j4;
            long j6 = j3;
            fetVar.s();
            b(d9d0Var, z, mm40Var, f3, null, j6, 0.0f, u1c.M(298232649, new u8d0(z, j5, d9d0Var), fetVar), fetVar, ((i3 << 6) & 458752) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            fetVar.X();
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m3c0(this, d9d0Var, z, mm40Var, j3, j4, f2, i, i2);
        }
    }

    public final void b(d9d0 d9d0Var, final boolean z, mm40 mm40Var, final float f, yjj0 yjj0Var, long j, float f2, ugd ugdVar, fet fetVar, int i) {
        final d9d0 d9d0Var2;
        int i2;
        v8d0 v8d0Var;
        yjj0 yjj0Var2;
        final float f3;
        int i3;
        yjj0 yjj0Var3;
        final yjj0 yjj0Var4;
        fetVar.g0(-1341144489);
        if ((i & 6) == 0) {
            d9d0Var2 = d9d0Var;
            i2 = (fetVar.g(d9d0Var2) ? 4 : 2) | i;
        } else {
            d9d0Var2 = d9d0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
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
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            v8d0Var = this;
            i2 |= fetVar.g(v8d0Var) ? 67108864 : 33554432;
        } else {
            v8d0Var = this;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                i3 = i2 & (-3727361);
                yjj0Var3 = b;
                f3 = e;
            } else {
                fetVar.X();
                i3 = i2 & (-3727361);
                yjj0Var3 = yjj0Var;
                f3 = f2;
            }
            int i4 = i3;
            fetVar.s();
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ljc0((byte) 19);
                fetVar.o0(objP);
            }
            mm40 mm40VarM = rq8.M(mm40VarN, (Function1) objP);
            boolean zD = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && fetVar.d(f)) || (i4 & 3072) == 2048) | fetVar.d(f3) | fetVar.g(yjj0Var3);
            Object objP2 = fetVar.P();
            if (zD || objP2 == cl5Var) {
                yjj0Var4 = yjj0Var3;
                xdr xdrVar = new xdr() { // from class: a.p8d0
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        final pu90 pu90VarS = ((pj30) obj2).S(((p4e) obj3).f26347a);
                        int i5 = pu90VarS.f27604a;
                        int i6 = pu90VarS.b;
                        final d9d0 d9d0Var3 = d9d0Var2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final yjj0 yjj0Var5 = yjj0Var4;
                        return vj30.x((vj30) obj, i5, i6, new Function1() { // from class: a.r8d0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ou90.F((ou90) obj4, pu90VarS, 0, 0, new m4m(d9d0Var3, z2, f4, f5, yjj0Var5), 4);
                                return Unit.f46060a;
                            }
                        });
                    }
                };
                fetVar.o0(xdrVar);
                objP2 = xdrVar;
            } else {
                yjj0Var4 = yjj0Var3;
            }
            mm40 mm40VarQ = i120.Q(knx.Q(mm40VarM, (xdr) objP2), j, yjj0Var4);
            int i5 = ((i4 >> 12) & 7168) | 48;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(((i5 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
            yjj0Var2 = yjj0Var4;
        } else {
            fetVar.X();
            yjj0Var2 = yjj0Var;
            f3 = f2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q8d0(v8d0Var, d9d0Var, z, mm40Var, f, yjj0Var2, j, f3, ugdVar, i);
        }
    }
}
