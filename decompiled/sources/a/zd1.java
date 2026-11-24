package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class zd1 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44191a;
    public final /* synthetic */ a4x b;

    public /* synthetic */ zd1(a4x a4xVar, byte b) {
        this.f44191a = b;
        this.b = a4xVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        fet fetVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte b = this.f44191a;
        jm40 jm40Var = jm40.b;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    String str = (String) a4xVar.get(iIntValue);
                    fetVar2.e0(-1256081577);
                    v8q0.a(str, o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2, 48, 384, 125944);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    pu1 pu1Var = (pu1) a4xVar.get(iIntValue3);
                    fetVar3.e0(-451378210);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    pu1Var.getClass();
                    vic.d(mm40VarN, hrl.f13536a, pu1Var.f27590a, 0.0f, fetVar3, 0, 24);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar4.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar4.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
                    lu1 lu1Var = (lu1) a4xVar.get(iIntValue5);
                    fetVar4.e0(552682259);
                    if (lu1Var != null) {
                        if (lu1Var instanceof ju1) {
                            fetVar4.e0(552765059);
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            ju1 ju1Var = (ju1) lu1Var;
                            vfc.l(s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 8.0f, 7), ju1Var.f17128a, ju1Var.b, 0.0f, fetVar4, 0);
                            fetVar = fetVar4;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            if (lu1Var instanceof ku1) {
                                fetVar.e0(553294570);
                                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                                zcl zclVar3 = qmk.f28987a;
                                jd8.d(s5x0.N(mm40VarD3, qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 8.0f, 2), ((ku1) lu1Var).f18892a, null, fetVar, 0, 4);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar4;
                    }
                    throw b1j.f(156375792, fetVar, false);
                }
                fetVar4.X();
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    l5h l5hVar = (l5h) a4xVar.get(iIntValue7);
                    fetVar5.e0(596472984);
                    knx.u(l5hVar, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar6.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar6.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar6.U(i5 & 1, (i5 & 147) != 146)) {
                    jnh jnhVar = (jnh) a4xVar.get(iIntValue9);
                    fetVar6.e0(1444837821);
                    dub.c(jnhVar, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar7.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar7.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                    k5j k5jVar = (k5j) a4xVar.get(iIntValue11);
                    fetVar7.e0(-380097048);
                    zjb.d(null, k5jVar.f17723a, k5jVar.b, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar8.g(g9zVar7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar8.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar8.U(i7 & 1, (i7 & 147) != 146)) {
                    in40 in40Var = (in40) a4xVar.get(iIntValue13);
                    fetVar8.e0(-1694526976);
                    rqm rqmVar = in40Var.b;
                    Object objP = fetVar8.P();
                    if (objP == ukd.f35823a) {
                        objP = pul.m;
                        fetVar8.o0(objP);
                    }
                    obc.q(null, rqmVar, false, null, null, null, (Function0) objP, null, fetVar8, 1572864, 189);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar9.g(g9zVar8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar9.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar9.U(i8 & 1, (i8 & 147) != 146)) {
                    String str2 = (String) a4xVar.get(iIntValue15);
                    fetVar9.e0(-538786991);
                    v8q0.a(str2, null, ((ThemeColors) fetVar9.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar9, 0, 384, 125946);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar10.g(g9zVar9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar10.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar10.U(i9 & 1, (i9 & 147) != 146)) {
                    qrj0 qrj0Var = (qrj0) a4xVar.get(iIntValue17);
                    fetVar10.e0(-1885687031);
                    n6x.f(null, qrj0Var, fetVar10, 0);
                    fetVar10.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                g9zVar10.getClass();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar11.g(g9zVar10) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar11.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar11.U(i10 & 1, (i10 & 147) != 146)) {
                    a1l0 a1l0Var = (a1l0) a4xVar.get(iIntValue19);
                    fetVar11.e0(-101173694);
                    o2e.D(g9zVar10, a1l0Var, fetVar11, i10 & 14);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
        }
    }
}
