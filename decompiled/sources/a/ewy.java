package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class ewy implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8549a;
    public final /* synthetic */ List b;
    public final /* synthetic */ slp c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ewy(List list, slp slpVar, Function1 function1, boolean z, byte b) {
        this.f8549a = b;
        this.b = list;
        this.c = slpVar;
        this.d = function1;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x033e  */
    /* JADX WARN: Code duplicated, block: B:235:0x0493  */
    /* JADX WARN: Code duplicated, block: B:238:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:318:0x066f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        jm40 jm40Var;
        int i2;
        jm40 jm40Var2;
        fet fetVar;
        int i3;
        jm40 jm40Var3;
        int i4;
        byte b = this.f8549a;
        Function1 function1 = this.d;
        boolean z = this.e;
        List list = this.b;
        slp slpVar = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                a4x a4xVar = slpVar.b;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue);
                    fetVar2.e0(-1360409683);
                    p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(iIntValue + 1, a4xVar);
                    boolean z2 = p6t0Var2 == null || (p6t0Var2 instanceof plp);
                    boolean z3 = ((p6t0Var instanceof olp) || (p6t0Var instanceof clp)) && !((p6t0Var2 instanceof olp) || (p6t0Var2 instanceof clp));
                    jm40 jm40Var4 = jm40.b;
                    if (p6t0Var == null) {
                        jm40Var = jm40Var4;
                    } else {
                        if (p6t0Var instanceof plp) {
                            fetVar2.e0(1480148972);
                            zcl zclVar = qmk.f28987a;
                            jm40Var = jm40Var4;
                            acb.d(s5x0.N(jm40Var4, 0.0f, iIntValue > 0 ? 12.0f : 0.0f, 0.0f, 0.0f, 13), (plp) p6t0Var, fetVar2, 0);
                            fetVar2.r(false);
                        } else {
                            jm40Var = jm40Var4;
                            if (p6t0Var instanceof ilp) {
                                fetVar2.e0(1480157189);
                                o2e.O((ilp) p6t0Var, z2, slpVar.c, this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof xkp) {
                                fetVar2.e0(1480165156);
                                o2e.A((xkp) p6t0Var, z2, slpVar.c, this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof alp) {
                                fetVar2.e0(1480173455);
                                o2e.B((alp) p6t0Var, z2, slpVar.c, this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof olp) {
                                fetVar2.e0(-1359007027);
                                o2e.Q((olp) p6t0Var, z2, z3, slpVar.c, this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof clp) {
                                fetVar2.e0(-1358703134);
                                o2e.R((clp) p6t0Var, z2, z3, slpVar.c, this.d, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        if (z && iIntValue == a4xVar.size() - 1) {
                            fetVar2.e0(-1358327197);
                            zcl zclVar2 = qmk.f28987a;
                            qxw.o(fetVar2, i120.Q(o7k0.e(jm40Var, 20.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n));
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-1358134997);
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(1480200539);
                    fetVar2.r(false);
                    if (z) {
                        fetVar2.e0(-1358134997);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1358134997);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                a4x a4xVar2 = slpVar.b;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) list.get(iIntValue3);
                    fetVar3.e0(-342811060);
                    p6t0 p6t0Var4 = (p6t0) CollectionsKt.W(iIntValue3 + 1, a4xVar2);
                    boolean z4 = p6t0Var4 == null || (p6t0Var4 instanceof plp);
                    boolean z5 = ((p6t0Var3 instanceof olp) || (p6t0Var3 instanceof clp)) && !((p6t0Var4 instanceof olp) || (p6t0Var4 instanceof clp));
                    jm40 jm40Var5 = jm40.b;
                    if (p6t0Var3 == null) {
                        fetVar = fetVar3;
                        jm40Var2 = jm40Var5;
                    } else {
                        if (p6t0Var3 instanceof plp) {
                            fetVar3.e0(404596352);
                            zcl zclVar3 = qmk.f28987a;
                            jm40Var2 = jm40Var5;
                            acb.d(s5x0.N(jm40Var5, 0.0f, iIntValue3 > 0 ? 12.0f : 0.0f, 0.0f, 0.0f, 13), (plp) p6t0Var3, fetVar3, 0);
                            fetVar3.r(false);
                        } else {
                            jm40Var2 = jm40Var5;
                            if (p6t0Var3 instanceof ilp) {
                                fetVar3.e0(404604514);
                                b34.J((ilp) p6t0Var3, z4, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof xkp) {
                                fetVar3.e0(404610721);
                                b34.w((xkp) p6t0Var3, z4, function1, fetVar3, 0);
                                fetVar3.r(false);
                            } else {
                                if (p6t0Var3 instanceof alp) {
                                    fetVar3.e0(404617260);
                                    b34.y((alp) p6t0Var3, z4, function1, fetVar3, 0);
                                    fetVar3.r(false);
                                } else if (p6t0Var3 instanceof olp) {
                                    fetVar3.e0(-341565264);
                                    b34.M((olp) p6t0Var3, z4, z5, this.d, fetVar3, 0);
                                    fetVar = fetVar3;
                                    fetVar.r(false);
                                } else {
                                    fetVar = fetVar3;
                                    boolean z6 = z4;
                                    if (p6t0Var3 instanceof clp) {
                                        fetVar.e0(404631805);
                                        b34.O((clp) p6t0Var3, z6, z5, this.d, fetVar, 0);
                                        fetVar.r(false);
                                    }
                                }
                                if (z && iIntValue3 == a4xVar2.size() - 1) {
                                    fetVar.e0(-340992849);
                                    zcl zclVar4 = qmk.f28987a;
                                    qxw.o(fetVar, i120.Q(o7k0.e(jm40Var2, 20.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n));
                                    fetVar.r(false);
                                } else {
                                    fetVar.e0(-340800649);
                                    fetVar.r(false);
                                }
                                fetVar.r(false);
                            }
                        }
                        fetVar = fetVar3;
                        if (z) {
                            fetVar.e0(-340800649);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-340800649);
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(404639119);
                    fetVar.r(false);
                    if (z) {
                        fetVar.e0(-340800649);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-340800649);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                break;
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
                    p6t0 p6t0Var5 = (p6t0) list.get(iIntValue5);
                    fetVar4.e0(-1216654001);
                    a4x a4xVar3 = slpVar.b;
                    p6t0 p6t0Var6 = (p6t0) CollectionsKt.W(iIntValue5 - 1, a4xVar3);
                    p6t0 p6t0Var7 = (p6t0) CollectionsKt.W(iIntValue5 + 1, a4xVar3);
                    boolean z7 = p6t0Var6 instanceof plp;
                    boolean z8 = p6t0Var7 == null || (p6t0Var7 instanceof plp);
                    boolean z9 = p6t0Var7 instanceof olp;
                    boolean z10 = ((p6t0Var5 instanceof olp) || (p6t0Var5 instanceof clp) || (p6t0Var5 instanceof vhp)) && !(z9 || (p6t0Var7 instanceof clp) || (p6t0Var7 instanceof vhp));
                    jm40 jm40Var6 = jm40.b;
                    if (p6t0Var5 == null) {
                        jm40Var3 = jm40Var6;
                    } else {
                        if (p6t0Var5 instanceof plp) {
                            fetVar4.e0(-731963456);
                            zcl zclVar5 = qmk.f28987a;
                            jm40Var3 = jm40Var6;
                            acb.d(s5x0.N(jm40Var6, 0.0f, iIntValue5 > 0 ? 12.0f : 0.0f, 0.0f, 0.0f, 13), (plp) p6t0Var5, fetVar4, 0);
                            fetVar4.r(false);
                        } else {
                            jm40Var3 = jm40Var6;
                            if (p6t0Var5 instanceof ilp) {
                                fetVar4.e0(-731955244);
                                ny9.G((ilp) p6t0Var5, z7, z8, this.d, fetVar4, 0);
                                fetVar4.r(false);
                            } else {
                                boolean z11 = z8;
                                boolean z12 = z10;
                                if (p6t0Var5 instanceof xkp) {
                                    fetVar4.e0(-731947437);
                                    ny9.u((xkp) p6t0Var5, z7, z11, this.d, fetVar4, 0);
                                    fetVar4.r(false);
                                } else if (p6t0Var5 instanceof alp) {
                                    fetVar4.e0(-731939298);
                                    ny9.v((alp) p6t0Var5, z7, z11, this.d, fetVar4, 0);
                                    fetVar4.r(false);
                                } else if (p6t0Var5 instanceof olp) {
                                    fetVar4.e0(-1215032144);
                                    ny9.H((olp) p6t0Var5, z11, z12, this.d, fetVar4, 0);
                                    fetVar4.r(false);
                                } else if (p6t0Var5 instanceof vhp) {
                                    fetVar4.e0(-1214784516);
                                    ny9.s((vhp) p6t0Var5, z11, !(p6t0Var7 instanceof vhp), z9, this.d, fetVar4, 0);
                                    fetVar4.r(false);
                                } else if (p6t0Var5 instanceof uhp) {
                                    fetVar4.e0(-1214451049);
                                    ny9.t(z11, !(p6t0Var7 instanceof uhp), z9, fetVar4, 0);
                                    fetVar4.r(false);
                                } else if (p6t0Var5 instanceof clp) {
                                    fetVar4.e0(-1214177691);
                                    ny9.I((clp) p6t0Var5, z11, z12, this.d, fetVar4, 0);
                                    fetVar4.r(false);
                                }
                            }
                        }
                        if (z && iIntValue5 == a4xVar3.size() - 1) {
                            fetVar4.e0(-1213854609);
                            zcl zclVar6 = qmk.f28987a;
                            qxw.o(fetVar4, i120.Q(o7k0.e(jm40Var3, 20.0f), ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n));
                            fetVar4.r(false);
                        } else {
                            fetVar4.e0(-1213662409);
                            fetVar4.r(false);
                        }
                        fetVar4.r(false);
                    }
                    fetVar4.e0(-731896369);
                    fetVar4.r(false);
                    if (z) {
                        fetVar4.e0(-1213662409);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1213662409);
                        fetVar4.r(false);
                    }
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                a4x a4xVar4 = slpVar.b;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    p6t0 p6t0Var8 = (p6t0) list.get(iIntValue7);
                    fetVar5.e0(635541752);
                    p6t0 p6t0Var9 = (p6t0) CollectionsKt.W(iIntValue7 + 1, a4xVar4);
                    boolean z13 = ((p6t0Var8 instanceof olp) || (p6t0Var8 instanceof clp)) && !((p6t0Var9 instanceof olp) || (p6t0Var9 instanceof clp));
                    if (p6t0Var8 == null) {
                        fetVar5.e0(297635683);
                        fetVar5.r(false);
                    } else if (p6t0Var8 instanceof plp) {
                        fetVar5.e0(297606672);
                        b34.l((plp) p6t0Var8, fetVar5, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var8 instanceof ilp) {
                        fetVar5.e0(297608710);
                        b34.I((ilp) p6t0Var8, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var8 instanceof xkp) {
                        fetVar5.e0(297613381);
                        b34.v((xkp) p6t0Var8, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var8 instanceof alp) {
                        fetVar5.e0(297618384);
                        b34.x((alp) p6t0Var8, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var8 instanceof olp) {
                        fetVar5.e0(297623350);
                        b34.L((olp) p6t0Var8, z13, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else if (p6t0Var8 instanceof clp) {
                        fetVar5.e0(297629857);
                        b34.N((clp) p6t0Var8, z13, function1, fetVar5, 0);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(297635683);
                        fetVar5.r(false);
                    }
                    if (z || iIntValue7 != a4xVar4.size() - 1) {
                        fetVar5.e0(637060131);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(636867931);
                        zcl zclVar7 = qmk.f28987a;
                        qxw.o(fetVar5, i120.Q(o7k0.e(jm40.b, 20.0f), ((ThemeColors) fetVar5.k(zaq0.b)).getBackground(), jd8.n));
                        fetVar5.r(false);
                    }
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
