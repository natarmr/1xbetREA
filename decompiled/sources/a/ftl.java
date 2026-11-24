package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ftl implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10117a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ ftl(a4x a4xVar, byte b) {
        this.f10117a = b;
        this.b = a4xVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jM121getTransparent0d7_KjU;
        byte b = this.f10117a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        hz3 hz3Var = hz3.f13888a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    pr5 pr5Var = (pr5) a4xVar.get(iIntValue);
                    Integer num = pr5Var.d;
                    fetVar.e0(503545223);
                    pm80 pm80VarF = a8k0.F(num.intValue(), 0, fetVar);
                    fetVar.r(false);
                    n0q n0qVar = o7k0.c;
                    y3d y3dVar = pr5Var.b;
                    if (y3dVar == null) {
                        fetVar.e0(847536759);
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(847535054);
                        fetVar.r(false);
                        jM121getTransparent0d7_KjU = y3dVar.f41946a;
                    }
                    k7x.b(pr5Var.f27449a.a(), null, o2e.e0(i120.Q(n0qVar, jM121getTransparent0d7_KjU, jd8.n), "DS_BANNER_IMAGE"), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    pz40 pz40Var = s6t0.f31722a;
                    oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_stadium, 0, fetVar2), new m78(StaticColors.INSTANCE.m123getWhite0d7_KjU(), 5), null, 10);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(hz3Var);
                        fetVar2.o0(objP);
                    }
                    pz40 pz40Var2 = (pz40) objP;
                    Object obj5 = a4xVar.get(iIntValue3);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ryc0(pz40Var2, (byte) 24);
                        fetVar2.o0(objP2);
                    }
                    mz3 mz3VarX = l7x.X(obj5, (Function1) objP2, null, fetVar2, 384, 26);
                    n0q n0qVar2 = o7k0.c;
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    lz3 lz3Var = (lz3) pz40Var2.getValue();
                    if (lz3Var != null && ((lz3Var instanceof jz3) || (lz3Var instanceof iz3))) {
                        fetVar2.e0(1833812166);
                        zcl zclVar = qmk.f28987a;
                        j0x.b(oilVarT, null, o7k0.n(jm40Var, 120.0f), null, null, 0.0f, null, fetVar2, 56, 120);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1834102326);
                        j0x.b(mz3VarX, null, jr8Var.a(jm40Var), null, gqw0.A, 0.0f, null, fetVar2, 24624, 104);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                int i = iIntValue6;
                if (fetVar3.U(i & 1, (i & 145) != 144)) {
                    pz40 pz40Var3 = s6t0.f31722a;
                    oil oilVarT2 = ju70.T(a8k0.F(R.drawable.ic_glyph_stadium, 0, fetVar3), new m78(s6t0.b().f33626a.getSecondary20(), 5), null, 10);
                    Object objP3 = fetVar3.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(hz3Var);
                        fetVar3.o0(objP3);
                    }
                    pz40 pz40Var4 = (pz40) objP3;
                    Object obj6 = a4xVar.get(iIntValue5);
                    Object objP4 = fetVar3.P();
                    if (objP4 == cl5Var) {
                        objP4 = new ryc0(pz40Var4, (byte) 25);
                        fetVar3.o0(objP4);
                    }
                    mz3 mz3VarX2 = l7x.X(obj6, (Function1) objP4, null, fetVar3, 384, 26);
                    n0q n0qVar3 = o7k0.c;
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar3);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    lz3 lz3Var2 = (lz3) pz40Var4.getValue();
                    if (lz3Var2 != null && ((lz3Var2 instanceof jz3) || (lz3Var2 instanceof iz3))) {
                        fetVar3.e0(-1974256244);
                        zcl zclVar2 = qmk.f28987a;
                        j0x.b(oilVarT2, null, o7k0.n(jm40Var, 104.0f), null, null, 0.0f, null, fetVar3, 56, 120);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-1973966084);
                        j0x.b(mz3VarX2, null, jr8Var.a(jm40Var), null, gqw0.A, 0.0f, null, fetVar3, 24624, 104);
                        fetVar3.r(false);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    unh0.W(((rm90) a4xVar.get(iIntValue7 % a4xVar.size())).f30734a, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                int iIntValue9 = ((Integer) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    xvw.h(null, (t0a0) a4xVar.get(iIntValue9), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                int iIntValue11 = ((Integer) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    xkb.r(o7k0.d(jm40Var, 1.0f), (s6x) a4xVar.get(iIntValue11), 0, 0, fetVar6, 6);
                } else {
                    fetVar6.X();
                }
                break;
            default:
                int iIntValue13 = ((Integer) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= fetVar7.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar7.U(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    x8x.g((zfg0) a4xVar.get(iIntValue13), fetVar7, 8);
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
