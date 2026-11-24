package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ob3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f24958a = new zfn(new f33(7), (byte) 0);
    public static final float b;
    public static final float c;

    static {
        new xez(new f33((byte) 8));
        new zsf(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(ugd ugdVar, mm40 mm40Var, ugd ugdVar2, ugd ugdVar3, float f, vhv0 vhv0Var, kyq0 kyq0Var, fet fetVar, int i) {
        int i2;
        float f2;
        vhv0 vhv0Var2;
        int i3;
        float f3;
        vhv0 dnzVar;
        fetVar.g0(-302230691);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(ugdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= fetVar.g(kyq0Var) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if (fetVar.U(i5 & 1, (4793491 & i5) != 4793490)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                i3 = i5 & (-458753);
                f3 = lyq0.f20876a;
                dnzVar = new dnz(jtt0.k(fetVar), 16 | 15);
            } else {
                fetVar.X();
                i3 = i5 & (-458753);
                f3 = f;
                dnzVar = vhv0Var;
            }
            fetVar.s();
            int i6 = i3 << 12;
            b(mm40Var, ugdVar, k1t0.a(cc3.f4091a, fetVar), y9q0.d, ugdVar2, ugdVar3, (ycl.b(f3, Float.NaN) || ycl.b(f3, Float.POSITIVE_INFINITY)) ? lyq0.f20876a : f3, dnzVar, kyq0Var, fetVar, ((i3 >> 3) & 14) | 224256 | ((i3 << 3) & 112) | (3670016 & i6) | (i6 & 29360128), (i3 >> 18) & 126);
            vhv0Var2 = dnzVar;
            f2 = f3;
        } else {
            fetVar.X();
            f2 = f;
            vhv0Var2 = vhv0Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb3(ugdVar, mm40Var, ugdVar2, ugdVar3, f2, vhv0Var2, kyq0Var, i);
        }
    }

    public static final void b(final mm40 mm40Var, final ugd ugdVar, final y9q0 y9q0Var, final y9q0 y9q0Var2, final ugd ugdVar2, final ugd ugdVar3, final float f, final vhv0 vhv0Var, final kyq0 kyq0Var, fet fetVar, final int i, final int i2) {
        int i3;
        ugd ugdVar4;
        float f2;
        int i4;
        xx7 xx7Var = gqw0.n;
        fetVar.g0(-2033800111);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(y9q0Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.g(xx7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            ugdVar4 = ugdVar3;
            i3 |= fetVar.i(ugdVar4) ? 8388608 : 4194304;
        } else {
            ugdVar4 = ugdVar3;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= fetVar.d(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= fetVar.g(vhv0Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar.g(kyq0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(null) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((dxj) fetVar.k(f24958a)).a(new m3k0(mm40Var, ugdVar, y9q0Var, y9q0Var2, ugdVar2, ugdVar4, f2, vhv0Var, kyq0Var), fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.lb3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ob3.b(mm40Var, ugdVar, y9q0Var, y9q0Var2, ugdVar2, ugdVar3, f, vhv0Var, kyq0Var, (fet) obj, x8x.L(i | 1), x8x.L(i2));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void c(final mm40 mm40Var, final ilq ilqVar, final long j, final long j2, final long j3, long j4, final ugd ugdVar, final y9q0 y9q0Var, final y9q0 y9q0Var2, Function0 function0, final ugd ugdVar2, ugd ugdVar3, final float f, fet fetVar, final int i) {
        final Function0 function1;
        ugd ugdVar4;
        final long j5 = j4;
        xx7 xx7Var = gqw0.n;
        fetVar.g0(126395868);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ilqVar) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024) | (fetVar.f(j3) ? 16384 : 8192) | (fetVar.f(j5) ? 131072 : 65536) | (fetVar.i(ugdVar) ? 1048576 : 524288) | (fetVar.g(y9q0Var) ? 8388608 : 4194304) | (fetVar.i(null) ? 67108864 : 33554432) | (fetVar.g(y9q0Var2) ? 536870912 : 268435456);
        int i3 = 1600566 | (fetVar.g(xx7Var) ? 256 : 128) | (fetVar.i(ugdVar2) ? 131072 : 65536) | (fetVar.d(f) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new myq0(ilqVar, f);
                fetVar.o0(objP);
            }
            myq0 myq0Var = (myq0) objP;
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, myq0Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            shd shdVar3 = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar3);
            }
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(jm40Var, "navigationIcon");
            float f2 = b;
            mm40 mm40VarN = s5x0.N(mm40VarK0, f2, 0.0f, 0.0f, 0.0f, 14);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iX2 = e3c.x(fetVar);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX2))) {
                rw2.t(iX2, fetVar, iX2, shdVar3);
            }
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zfn zfnVar = yde.f42431a;
            obc.d(zfnVar.a(new y3d(j)), ugdVar2, fetVar, ((i3 >> 12) & 112) | 8);
            fetVar.r(true);
            fetVar.e0(-1359701523);
            mm40 mm40VarL = s5x0.L(mrv.k0(jm40Var, "title"), f2, 0.0f, 2);
            fetVar.e0(510340109);
            fetVar.r(false);
            mm40 mm40VarE = mm40VarL.e(jm40Var);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                function1 = function0;
                objP2 = new y(function1, (byte) 7);
                fetVar.o0(objP2);
            } else {
                function1 = function0;
            }
            mm40 mm40VarT = i4w0.T(mm40VarE, (Function1) objP2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iX3 = e3c.x(fetVar);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarT);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX3))) {
                rw2.t(iX3, fetVar, iX3, shdVar3);
            }
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            q8x.o(j2, y9q0Var, ugdVar, fetVar, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            fetVar.r(true);
            fetVar.r(false);
            mm40 mm40VarN2 = s5x0.N(mrv.k0(jm40Var, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iX4 = e3c.x(fetVar);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX4))) {
                rw2.t(iX4, fetVar, iX4, shdVar3);
            }
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            j5 = j4;
            ugdVar4 = ugdVar3;
            obc.d(zfnVar.a(new y3d(j5)), ugdVar4, fetVar, 56);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            function1 = function0;
            ugdVar4 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar5 = ugdVar4;
            yfe0VarU.d = new Function2(ilqVar, j, j2, j3, j5, ugdVar, y9q0Var, y9q0Var2, function1, ugdVar2, ugdVar5, f, i) { // from class: a.mb3
                public final /* synthetic */ ilq b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ ugd g;
                public final /* synthetic */ y9q0 h;
                public final /* synthetic */ y9q0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ ugd k;
                public final /* synthetic */ ugd l;
                public final /* synthetic */ float m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    ob3.c(this.f21487a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final oyq0 d(int i, int i2, fet fetVar) {
        boolean z = true;
        float f = (i2 & 1) != 0 ? -3.4028235E38f : 0.0f;
        Object[] objArr = new Object[0];
        v0h0 v0h0Var = oyq0.d;
        if ((((i & 14) ^ 6) <= 4 || !fetVar.d(f)) && (i & 6) != 4) {
            z = false;
        }
        boolean zD = fetVar.d(0.0f) | z | fetVar.d(0.0f);
        Object objP = fetVar.P();
        if (zD || objP == ukd.f35823a) {
            objP = new rt2(f, (byte) 2);
            fetVar.o0(objP);
        }
        return (oyq0) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object e(oyq0 oyq0Var, float f, sjj sjjVar, j73 j73Var, zje zjeVar) {
        nb3 nb3Var;
        jie0 jie0Var;
        jie0 jie0Var2;
        if (zjeVar instanceof nb3) {
            nb3Var = (nb3) zjeVar;
            int i = nb3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nb3Var.m = i - Integer.MIN_VALUE;
            } else {
                nb3Var = new nb3(zjeVar);
            }
        } else {
            nb3Var = new nb3(zjeVar);
        }
        nb3 nb3Var2 = nb3Var;
        Object obj = nb3Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = nb3Var2.m;
        byte b2 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                jie0 jie0Var3 = nb3Var2.k;
                j73Var = nb3Var2.j;
                oyq0 oyq0Var2 = (oyq0) nb3Var2.i;
                z1x.P(obj);
                jie0Var = jie0Var3;
                oyq0Var = oyq0Var2;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jie0Var2 = (jie0) nb3Var2.i;
                z1x.P(obj);
            }
            jie0Var = jie0Var2;
            return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        }
        z1x.P(obj);
        if (oyq0Var.a() < 0.01f || oyq0Var.a() == 1.0f) {
            return new g6u0(0L);
        }
        jie0Var = new jie0();
        jie0Var.f16571a = f;
        if (sjjVar != null && Math.abs(f) > 1.0f) {
            jie0 jie0Var4 = new jie0();
            l73 l73VarD = x4d0.d(0.0f, f, 28);
            ib3 ib3Var = new ib3(jie0Var4, oyq0Var, jie0Var, b2);
            nb3Var2.i = oyq0Var;
            nb3Var2.j = j73Var;
            nb3Var2.k = jie0Var;
            nb3Var2.m = 1;
            if (hhm0.o(l73VarD, sjjVar, false, ib3Var, nb3Var2) != wneVar) {
            }
            return wneVar;
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        if (j73Var != null) {
            agk0 agk0Var = oyq0Var.c;
            if (agk0Var.l() < 0.0f && agk0Var.l() > oyq0Var.f26070a) {
                l73 l73VarD2 = x4d0.d(agk0Var.l(), 0.0f, 30);
                Float f2 = new Float(oyq0Var.a() < 0.5f ? 0.0f : oyq0Var.f26070a);
                jb3 jb3Var = new jb3(oyq0Var, (byte) 0);
                nb3Var2.i = jie0Var;
                nb3Var2.j = null;
                nb3Var2.k = null;
                nb3Var2.m = 2;
                if (hhm0.q(l73VarD2, f2, j73Var, false, jb3Var, nb3Var2, 4) != wneVar) {
                    jie0Var2 = jie0Var;
                    jie0Var = jie0Var2;
                }
                return wneVar;
            }
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
    }
}
