package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oje f30588a;

    static {
        pnh0 pnh0Var = pnh0.f27287a;
        zfn zfnVar = k13.f17498a;
        pnh0 pnh0Var2 = pnh0.f27287a;
        pnh0 pnh0Var3 = pnh0.f27287a;
        long j = y3d.c;
        long j2 = y3d.b;
        f30588a = new oje(j, j2, j2, y3d.c(0.38f, j2), y3d.c(0.38f, j2));
    }

    public static final void a(oje ojeVar, mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-527864079);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ojeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = qje.f28834a;
            mm40 mm40VarA0 = wha0.a0(s5x0.L(q8a.y0(i120.Q(bww.U(mm40Var, 3.0f, vgg0.a(4.0f), 0L, 0L, 28), ojeVar.f25354a, jd8.n), enx.b), 0.0f, qje.d, 1), wha0.T(fetVar), false, 14);
            int i3 = (i2 << 3) & 7168;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            vqd.t(((i3 >> 6) & 112) | 6, ugdVar, y5d.f42040a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(ojeVar, mm40Var, ugdVar, i, (byte) 9);
        }
    }

    public static final void b(mm40 mm40Var, oje ojeVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        int i4;
        fetVar.g0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (fetVar.g(ojeVar) ? 32 : 16);
        }
        int i7 = i4 | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            if (i6 != 0) {
                ojeVar = f30588a;
            }
            a(ojeVar, mm40Var, u1c.M(-250345048, new ab4((byte) 27, (Object) ojeVar, function1), fetVar), fetVar, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        oje ojeVar2 = ojeVar;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(mm40Var2, (Object) ojeVar2, (Object) function1, i, i2, (byte) 3);
        }
    }

    public static final void c(String str, boolean z, oje ojeVar, mm40 mm40Var, xdr xdrVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(ojeVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(xdrVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            yx7 yx7Var = qje.f28834a;
            float f = qje.c;
            qw3 qw3Var = new qw3(f, true, new jf4((byte) 14));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new jw7(z, function0, (byte) 7);
                fetVar2.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(o7k0.q(o7k0.d(y860.Y(mm40Var, z, str, null, (Function0) objP, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (xdrVar == null) {
                fetVar2.e0(-1597947094);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1597947093);
                float f2 = qje.e;
                mm40 mm40VarK = o7k0.k(jm40.b, f2, 0.0f, f2, f2, 2);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                xdrVar.F(new y3d(z ? ojeVar.c : ojeVar.e), fetVar2, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            long j = z ? ojeVar.b : ojeVar.d;
            aad.e(str, new x7z(1.0f, true), new y9q0(j, qje.h, qje.i, null, qje.k, null, qje.b, 0, qje.j, 16613240), null, 0, false, 1, 0, null, null, fetVar2, (i3 & 14) | 1572864, 952);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(str, z, ojeVar, mm40Var, xdrVar, function0, i);
        }
    }
}
