package a;

import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class qn7 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29018a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ qn7(i4 i4Var, byte b) {
        this.f29018a = b;
        this.b = i4Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        fet fetVar;
        byte b = this.f29018a;
        i4 i4Var = this.b;
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
                    fuy fuyVar = (fuy) i4Var.get(iIntValue);
                    fetVar2.e0(-1642537338);
                    i120.K(fuyVar, fetVar2, 0);
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
                    sls slsVar = (sls) i4Var.get(iIntValue3);
                    fetVar3.e0(-509972578);
                    vic.m(slsVar, fetVar3, 0);
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
                    lgg0 lgg0Var = (lgg0) i4Var.get(iIntValue5);
                    fetVar4.e0(-1289389168);
                    if (lgg0Var != null) {
                        if (lgg0Var instanceof jgg0) {
                            fetVar4.e0(-2119801018);
                            x9x.u((jgg0) lgg0Var, fetVar4, 0);
                            fetVar4.r(false);
                        } else if (lgg0Var instanceof kgg0) {
                            fetVar4.e0(-2119798022);
                            kcx.p(0, fetVar4);
                            fetVar4.r(false);
                        }
                        fetVar4.r(false);
                    }
                    throw b1j.f(-2119803181, fetVar4, false);
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
                    fj90 fj90Var = (fj90) i4Var.get(iIntValue7);
                    fetVar5.e0(1936145990);
                    zcl zclVar = qmk.f28987a;
                    obc.q(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), new rqm((vui0) new rui0(fj90Var.c, null, fj90Var.b, null, 58), (pui0) new oui0((Integer) null, (y3d) null, new m0x(fj90Var.f9628a, null, 6), new y3d(((ThemeColors) fetVar5.k(zaq0.b)).getSecondary()), 19), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), false, null, null, null, null, null, fetVar5, 0, 252);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
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
                    lvw lvwVar = (lvw) i4Var.get(iIntValue9);
                    fetVar6.e0(-19467782);
                    if (lvwVar == null) {
                        fetVar = fetVar6;
                    } else {
                        boolean z = lvwVar instanceof mgs0;
                        jm40 jm40Var = jm40.b;
                        if (z) {
                            fetVar6.e0(-19393941);
                            nkb.h(jm40Var, new hjm(rsm0.w(R.string.transactions, 0, fetVar6), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjm.b, null, null, null, fetVar6, 390, 56);
                            fetVar = fetVar6;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar6;
                            if (lvwVar instanceof yfs0) {
                                fetVar.e0(-18721303);
                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                zcl zclVar2 = qmk.f28987a;
                                hhm0.i(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 6.0f, 7), (yfs0) lvwVar, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(-18247313);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }
}
