package a;

import android.javax.sip.message.Response;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class zip0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44451a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zip0(List list, Object obj, Object obj2, byte b) {
        this.f44451a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        fet fetVar;
        int i4;
        int i5;
        vui0 tui0Var;
        long secondary;
        int i6;
        int i7;
        float f;
        int i8;
        float f2;
        wui0 wui0Var;
        byte b = this.f44451a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        List list = this.b;
        Object obj5 = this.c;
        byte b2 = 0;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ajp0 ajp0Var = (ajp0) obj5;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    kjp0 kjp0Var = (kjp0) list.get(iIntValue);
                    fetVar2.e0(1497626593);
                    rqm rqmVar = kjp0Var.b;
                    boolean zI = fetVar2.i(ajp0Var) | fetVar2.g(kjp0Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        objP = new ywm0(ajp0Var, kjp0Var, (byte) 10);
                        fetVar2.o0(objP);
                    }
                    obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar2, 384, 233);
                    if (iIntValue < q3d.i(((gjp0) obj6).f11412a)) {
                        fetVar2.e0(1498088027);
                        zcl zclVar = qmk.f28987a;
                        mbc.o(agi0.f827a, s5x0.L(jm40Var, 16.0f, 0.0f, 2), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1498312746);
                        fetVar2.r(false);
                    }
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
                Function1 function1 = (Function1) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    chq0 chq0Var = (chq0) list.get(iIntValue3);
                    fetVar3.e0(-436253818);
                    wxl wxlVar = (wxl) obj5;
                    boolean zG = fetVar3.g(function1);
                    Object objP2 = fetVar3.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new dpl0(function1, (byte) 10);
                        fetVar3.o0(objP2);
                    }
                    xnm0.d(null, wxlVar, chq0Var, (Function1) objP2, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                Function1 function2 = (Function1) obj6;
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
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue5);
                    fetVar4.e0(-265058518);
                    if (p6t0Var == null) {
                        fetVar = fetVar4;
                    } else {
                        if (p6t0Var instanceof olw) {
                            fetVar4.e0(-147096981);
                            gq80.T(null, (olw) p6t0Var, (skb0) obj5, (Function1) obj6, fetVar4, 0);
                            fetVar = fetVar4;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            if (p6t0Var instanceof lcb0) {
                                fetVar.e0(-147090316);
                                gq80.P(null, (lcb0) p6t0Var, function2, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof nxv) {
                                fetVar.e0(-264672228);
                                zcl zclVar2 = qmk.f28987a;
                                slb.e(0, fetVar, ((nxv) p6t0Var).f24301a, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), function2);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof sok0) {
                                fetVar.e0(-147075528);
                                gq80.S(null, (sok0) p6t0Var, function2, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof ecb0) {
                                fetVar.e0(-264209956);
                                ecb0 ecb0Var = (ecb0) p6t0Var;
                                gq80.O(null, ecb0Var.f7558a, (skb0) obj5, ecb0Var.b, (Function1) obj6, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof dcb0) {
                                fetVar.e0(-263940442);
                                dcb0 dcb0Var = (dcb0) p6t0Var;
                                gq80.O(null, dcb0Var.f5842a, null, dcb0Var.b, (Function1) obj6, fetVar, 384);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof alw) {
                                fetVar.e0(-263676012);
                                alw alwVar = (alw) p6t0Var;
                                gq80.z(null, alwVar.c, alwVar.d, (Function1) obj6, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof gij) {
                                fetVar.e0(-147046347);
                                gq80.q(null, (gij) p6t0Var, function2, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(-263346978);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                ylr0 ylr0Var = (ylr0) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    hmr0 hmr0Var = (hmr0) ((a4x) list).get(iIntValue7);
                    fetVar5.e0(-1012551250);
                    rqm rqmVar2 = hmr0Var.b;
                    boolean zI2 = fetVar5.i(ylr0Var) | fetVar5.i(hmr0Var);
                    Object objP3 = fetVar5.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new wlr0(ylr0Var, hmr0Var, (byte) 0);
                        fetVar5.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zI3 = fetVar5.i(ylr0Var) | fetVar5.i(hmr0Var);
                    Object objP4 = fetVar5.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new wlr0(ylr0Var, hmr0Var, (byte) 1);
                        fetVar5.o0(objP4);
                    }
                    obc.q(null, rqmVar2, false, null, function0, null, (Function0) objP4, null, fetVar5, 0, 173);
                    if (iIntValue7 < q3d.i(((cmr0) ((l7m0) obj6).getValue()).b)) {
                        fetVar5.e0(-1012241809);
                        zcl zclVar3 = qmk.f28987a;
                        mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar5, 6, 4);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-1011988105);
                        fetVar5.r(false);
                    }
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
                amr0 amr0Var = (amr0) obj5;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar6.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar6.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar6.U(i5 & 1, (i5 & 147) != 146)) {
                    pmr0 pmr0Var = (pmr0) list.get(iIntValue9);
                    fetVar6.e0(-1910085792);
                    ulr0 ulr0Var = pmr0Var.c;
                    int i9 = pmr0Var.e;
                    String str = pmr0Var.b;
                    boolean z = pmr0Var.d;
                    if (ulr0Var == ulr0.TOTO_1XTOTO) {
                        fetVar6.e0(-1910063225);
                        rui0 rui0Var = new rui0(str, null, rsm0.w(R.string.free_toto_history, 0, fetVar6), new y3d(((StaticColors) fetVar6.k(m8m0.f21378a)).m98getGreen0d7_KjU()), 50);
                        fetVar6.r(false);
                        tui0Var = rui0Var;
                    } else {
                        fetVar6.e0(-1909721419);
                        fetVar6.r(false);
                        tui0Var = new tui0(str, null);
                    }
                    Integer numValueOf = Integer.valueOf(i9);
                    m0x m0xVar = new m0x(i9, null, 6);
                    if (z) {
                        fetVar6.e0(1878077322);
                        secondary = ((ThemeColors) fetVar6.k(zaq0.b)).getPrimary();
                    } else {
                        fetVar6.e0(1878078316);
                        secondary = ((ThemeColors) fetVar6.k(zaq0.b)).getSecondary();
                    }
                    fetVar6.r(false);
                    rqm rqmVar3 = new rqm(tui0Var, (pui0) new oui0(numValueOf, (y3d) null, m0xVar, new y3d(secondary), 18), (pvi0) new nvi0(z), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
                    boolean zI4 = fetVar6.i(amr0Var) | fetVar6.i(pmr0Var);
                    Object objP5 = fetVar6.P();
                    if (zI4 || objP5 == cl5Var) {
                        objP5 = new zlr0(amr0Var, pmr0Var, b2);
                        fetVar6.o0(objP5);
                    }
                    Function0 function3 = (Function0) objP5;
                    boolean zI5 = fetVar6.i(amr0Var) | fetVar6.i(pmr0Var);
                    Object objP6 = fetVar6.P();
                    if (zI5 || objP6 == cl5Var) {
                        objP6 = new zlr0(amr0Var, pmr0Var, (byte) 1);
                        fetVar6.o0(objP6);
                    }
                    obc.q(null, rqmVar3, false, null, function3, null, (Function0) objP6, null, fetVar6, 0, 173);
                    if (iIntValue9 < q3d.i(((jq8) ((l7m0) obj6).getValue()).b)) {
                        fetVar6.e0(-1908525129);
                        zcl zclVar4 = qmk.f28987a;
                        mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar6, 6, 4);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-1908271425);
                        fetVar6.r(false);
                    }
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
                Function2 function4 = (Function2) obj6;
                Function1 function5 = (Function1) obj5;
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar7.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar7.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                    fe80 fe80Var = (fe80) list.get(iIntValue11);
                    fetVar7.e0(1317804576);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    int i10 = (i6 & 112) ^ 48;
                    boolean zG2 = fetVar7.g(function5) | ((i10 > 32 && fetVar7.e(iIntValue11)) || (i6 & 48) == 32);
                    Object objP7 = fetVar7.P();
                    if (zG2 || objP7 == cl5Var) {
                        objP7 = new bp40(function5, iIntValue11, (byte) 6);
                        fetVar7.o0(objP7);
                    }
                    Function0 function6 = (Function0) objP7;
                    boolean zG3 = ((i10 > 32 && fetVar7.e(iIntValue11)) || (i6 & 48) == 32) | fetVar7.g(function4);
                    Object objP8 = fetVar7.P();
                    if (zG3 || objP8 == cl5Var) {
                        objP8 = new b4l0(function4, iIntValue11, (byte) 1);
                        fetVar7.o0(objP8);
                    }
                    s0x.m(mm40VarN, fe80Var, function6, (Function1) objP8, fetVar7, 0);
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
                    g3k0 g3k0Var = (g3k0) list.get(iIntValue13);
                    fetVar8.e0(-1353280814);
                    if (g3k0Var != null) {
                        boolean z2 = g3k0Var instanceof f3k0;
                        jm40 jm40Var2 = jm40.b;
                        if (z2) {
                            fetVar8.e0(926179030);
                            ghm0.j(o7k0.d(s5x0.L(jm40Var2, xfn.a(fetVar8).e, 0.0f, 2), 1.0f), ((f3k0) g3k0Var).f8868a, fetVar8, 0);
                            fetVar8.r(false);
                        } else if (g3k0Var instanceof a3k0) {
                            fetVar8.e0(926191257);
                            zcl zclVar6 = qmk.f28987a;
                            qzb.n(o7k0.d(s5x0.L(s5x0.N(jm40Var2, 0.0f, 24.0f, 0.0f, 0.0f, 13), xfn.a(fetVar8).d, 0.0f, 2), 1.0f), ((a3k0) g3k0Var).f176a, (Function0) obj5, fetVar8, 0, 0);
                            fetVar8.r(false);
                        } else if (g3k0Var instanceof b3k0) {
                            fetVar8.e0(926206646);
                            if (CollectionsKt.W(iIntValue13 - 1, (a4x) obj6) instanceof f3k0) {
                                zcl zclVar7 = qmk.f28987a;
                                f = 0.0f;
                            } else {
                                zcl zclVar8 = qmk.f28987a;
                                f = 8.0f;
                            }
                            gnm0.f(o7k0.d(s5x0.L(s5x0.N(jm40Var2, 0.0f, f, 0.0f, 0.0f, 13), xfn.a(fetVar8).c, 0.0f, 2), 1.0f), ((b3k0) g3k0Var).b, fetVar8, 0);
                            fetVar8.r(false);
                        } else if (g3k0Var instanceof c3k0) {
                            fetVar8.e0(926227780);
                            zcl zclVar9 = qmk.f28987a;
                            jcb.l(o7k0.d(s5x0.N(jm40Var2, 0.0f, 32.0f, 0.0f, 0.0f, 13), 1.0f), ((c3k0) g3k0Var).f3680a, true, null, fetVar8, 384, 8);
                            fetVar8.r(false);
                        } else if (g3k0Var instanceof d3k0) {
                            fetVar8.e0(926239269);
                            zcl zclVar10 = qmk.f28987a;
                            wgm0.o(0, fetVar8, o7k0.d(s5x0.N(jm40Var2, 0.0f, 24.0f, 0.0f, 0.0f, 13), 1.0f));
                            fetVar8.r(false);
                        } else if (g3k0Var instanceof e3k0) {
                            fetVar8.e0(926247992);
                            dem0.h(o2e.e0(o7k0.d(s5x0.L(jm40Var2, xfn.a(fetVar8).d, 0.0f, 2), 1.0f), "TRANSACTION_ITEM"), ((e3k0) g3k0Var).b, fetVar8, 0);
                            fetVar8.r(false);
                        }
                        fetVar8.r(false);
                    }
                    throw b1j.f(926177105, fetVar8, false);
                }
                fetVar8.X();
                return Unit.f46060a;
            default:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                Function1 function7 = (Function1) obj6;
                zlv0 zlv0Var = (zlv0) obj5;
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar9.g(g9zVar8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar9.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar9.U(i8 & 1, (i8 & 147) != 146)) {
                    j240 j240Var = (j240) ((a4x) list).get(iIntValue15);
                    fetVar9.e0(-1497078809);
                    if (iIntValue15 == 0) {
                        zcl zclVar11 = qmk.f28987a;
                        f2 = 12.0f;
                    } else {
                        zcl zclVar12 = qmk.f28987a;
                        f2 = 0.0f;
                    }
                    mm40 mm40VarN2 = s5x0.N(jm40.b, xfn.a(fetVar9).d, f2, xfn.a(fetVar9).d, 0.0f, 8);
                    nui0 nui0Var = new nui0(Integer.valueOf(j240Var.f15765a.getF47018a()), null, new m0x(j240Var.f15765a.getF47018a(), null, 6), new y3d(((ThemeColors) fetVar9.k(zaq0.b)).getPrimary()), null, null, 0.0f, 242);
                    tui0 tui0Var2 = new tui0(j240Var.b, null);
                    if (iIntValue15 == 0 && ((wlv0) zlv0Var).e.size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (iIntValue15 == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = iIntValue15 == q3d.i(((wlv0) zlv0Var).e) ? wui0.d : wui0.c;
                    }
                    rqm rqmVar4 = new rqm((vui0) tui0Var2, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 444);
                    boolean zG4 = fetVar9.g(function7) | fetVar9.g(j240Var);
                    Object objP9 = fetVar9.P();
                    if (zG4 || objP9 == cl5Var) {
                        objP9 = new puh(function7, j240Var, (byte) 4);
                        fetVar9.o0(objP9);
                    }
                    obc.q(mm40VarN2, rqmVar4, false, null, (Function0) objP9, null, null, null, fetVar9, 0, 236);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
        }
    }
}
