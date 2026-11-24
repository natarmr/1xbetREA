package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ra2 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30113a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ra2(a4x a4xVar, boolean z, Function1 function1, byte b) {
        this.f30113a = b;
        this.b = a4xVar;
        this.c = z;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        fet fetVar2;
        int i3;
        fet fetVar3;
        int i4;
        fet fetVar4;
        int i5;
        fet fetVar5;
        int i6;
        fet fetVar6;
        byte b = this.f30113a;
        byte b2 = 7;
        byte b3 = 3;
        a4x a4xVar = this.b;
        Function1 function1 = this.d;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 16;
        byte b5 = 2;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar7.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar7.e(iIntValue) ? 32 : 16;
                }
                if (fetVar7.U(i & 1, (i & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) a4xVar.get(iIntValue);
                    fetVar7.e0(1927938077);
                    if (p6t0Var instanceof m2g0) {
                        fetVar7.e0(1928016599);
                        a2n a2nVar = ((m2g0) p6t0Var).f21058a;
                        if (a2nVar instanceof nla) {
                            fetVar7.e0(1928084985);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            nla nlaVar = (nla) a2nVar;
                            boolean zG = fetVar7.g(function1);
                            Object objP = fetVar7.P();
                            if (zG || objP == cl5Var) {
                                objP = new qr0(function1, (byte) 5);
                                fetVar7.o0(objP);
                            }
                            rcb.C(mm40VarN, nlaVar, this.c, (Function1) objP, fetVar7, 0);
                            fetVar = fetVar7;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar7;
                            fetVar.e0(1928632600);
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar7;
                        fetVar.e0(1928672280);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar8.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar8.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar8.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) a4xVar.get(iIntValue3);
                    fetVar8.e0(1069512740);
                    if (p6t0Var2 instanceof m2g0) {
                        fetVar8.e0(1069591262);
                        a2n a2nVar2 = ((m2g0) p6t0Var2).f21058a;
                        if (a2nVar2 instanceof jml0) {
                            fetVar8.e0(1069666375);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            jml0 jml0Var = (jml0) a2nVar2;
                            boolean zG2 = fetVar8.g(function1);
                            Object objP2 = fetVar8.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new qr0(function1, (byte) 6);
                                fetVar8.o0(objP2);
                            }
                            Function1 function2 = (Function1) objP2;
                            if (jml0Var instanceof cml0) {
                                fetVar8.e0(-413097245);
                                vdb.A(mm40VarN2, (cml0) jml0Var, this.c, function2, fetVar8, 0);
                                fetVar2 = fetVar8;
                                fetVar2.r(false);
                            } else {
                                fetVar2 = fetVar8;
                                if (!(jml0Var instanceof iml0)) {
                                    throw b1j.f(-413098879, fetVar2, false);
                                }
                                fetVar2.e0(-413090484);
                                feb.q(mm40VarN2, ((iml0) jml0Var).f(), fetVar2, 0);
                                fetVar2.r(false);
                            }
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar8;
                            fetVar2.e0(1070202458);
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar8;
                        fetVar2.e0(1070242138);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 2:
                k8z k8zVar = (k8z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar9.g(k8zVar) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar9.e(iIntValue5) ? (byte) 32 : (byte) 16;
                }
                if (fetVar9.U(i3 & 1, (i3 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) a4xVar.get(iIntValue5);
                    fetVar9.e0(1507797624);
                    if (p6t0Var3 == null) {
                        fetVar3 = fetVar9;
                    } else {
                        boolean z = p6t0Var3 instanceof ads0;
                        jm40 jm40Var = jm40.b;
                        if (z) {
                            fetVar9.e0(1507804195);
                            a2n a2nVar3 = ((ads0) p6t0Var3).f695a;
                            if (a2nVar3 instanceof y56) {
                                fetVar9.e0(1507851687);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                y56 y56Var = (y56) a2nVar3;
                                boolean zG3 = fetVar9.g(function1);
                                Object objP3 = fetVar9.P();
                                if (zG3 || objP3 == cl5Var) {
                                    objP3 = new qr0(function1, (byte) 10);
                                    fetVar9.o0(objP3);
                                }
                                vcc.i(mm40VarN3, y56Var, this.c, (Function1) objP3, null, fetVar9, 0, 16);
                                fetVar9.r(false);
                                fetVar3 = fetVar9;
                            } else if (a2nVar3 instanceof c2o0) {
                                fetVar9.e0(1508424195);
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                c2o0 c2o0Var = (c2o0) a2nVar3;
                                boolean zG4 = fetVar9.g(function1);
                                Object objP4 = fetVar9.P();
                                if (zG4 || objP4 == cl5Var) {
                                    objP4 = new qr0(function1, (byte) 11);
                                    fetVar9.o0(objP4);
                                }
                                hkb.n(mm40VarN4, c2o0Var, this.c, (Function1) objP4, null, fetVar9, 0, 16);
                                fetVar3 = fetVar9;
                                fetVar3.r(false);
                            } else {
                                fetVar3 = fetVar9;
                                fetVar3.e0(1508956434);
                                fetVar3.r(false);
                            }
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar9;
                            if (p6t0Var3 instanceof bds0) {
                                fetVar3.e0(1509037530);
                                nkb.h(s5x0.L(jm40Var, xfn.a(fetVar3).e - xfn.a(fetVar3).d, 0.0f, 2), ((bds0) p6t0Var3).f2415a, kjm.f18392a, null, null, null, fetVar3, 384, 56);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof sbs0) {
                                fetVar3.e0(1509510962);
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarN5 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                r7p r7pVar = ((sbs0) p6t0Var3).c;
                                boolean zG5 = fetVar3.g(function1) | fetVar3.g(p6t0Var3);
                                Object objP5 = fetVar3.P();
                                if (zG5 || objP5 == cl5Var) {
                                    objP5 = new z7(function1, p6t0Var3, (byte) 5);
                                    fetVar3.o0(objP5);
                                }
                                Function0 function0 = (Function0) objP5;
                                boolean zG6 = fetVar3.g(function1) | fetVar3.g(p6t0Var3);
                                Object objP6 = fetVar3.P();
                                if (zG6 || objP6 == cl5Var) {
                                    objP6 = new z7(function1, p6t0Var3, (byte) 6);
                                    fetVar3.o0(objP6);
                                }
                                Function0 function3 = (Function0) objP6;
                                boolean zG7 = fetVar3.g(function1) | fetVar3.g(p6t0Var3);
                                Object objP7 = fetVar3.P();
                                if (zG7 || objP7 == cl5Var) {
                                    objP7 = new bi2(function1, p6t0Var3, (byte) 3);
                                    fetVar3.o0(objP7);
                                }
                                Function1 function4 = (Function1) objP7;
                                boolean zG8 = fetVar3.g(function1) | fetVar3.g(p6t0Var3);
                                Object objP8 = fetVar3.P();
                                if (zG8 || objP8 == cl5Var) {
                                    objP8 = new z7(function1, p6t0Var3, (byte) 7);
                                    fetVar3.o0(objP8);
                                }
                                vdb.E(mm40VarN5, r7pVar, function0, function3, function4, (Function0) objP8, fetVar3, 0, 0);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof rbs0) {
                                fetVar3.e0(1510767020);
                                zcl zclVar6 = qmk.f28987a;
                                vdb.E(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((rbs0) p6t0Var3).b, null, null, null, null, fetVar3, 0, 60);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof hds0) {
                                fetVar3.e0(1511052933);
                                zcl zclVar7 = qmk.f28987a;
                                jcb.l(s5x0.L(jm40Var, 0.0f, 8.0f, 1), ((hds0) p6t0Var3).f12885a, true, null, fetVar3, 384, 8);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(1511329298);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 3:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar10.g(k8zVar2) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar10.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar10.U(i4 & 1, (i4 & 147) != 146)) {
                    a2n a2nVar4 = (a2n) a4xVar.get(iIntValue7);
                    fetVar10.e0(-235729401);
                    if (a2nVar4 == null) {
                        fetVar4 = fetVar10;
                    } else {
                        if (a2nVar4 instanceof y56) {
                            fetVar10.e0(-235690838);
                            y56 y56Var2 = (y56) a2nVar4;
                            boolean zG9 = fetVar10.g(function1);
                            Object objP9 = fetVar10.P();
                            if (zG9 || objP9 == cl5Var) {
                                objP9 = new v6a0(function1, b2);
                                fetVar10.o0(objP9);
                            }
                            vcc.i(null, y56Var2, this.c, (Function1) objP9, null, fetVar10, 0, 17);
                            fetVar4 = fetVar10;
                            fetVar4.r(false);
                        } else {
                            fetVar4 = fetVar10;
                            if (a2nVar4 instanceof c2o0) {
                                fetVar4.e0(-1808706052);
                                c2o0 c2o0Var2 = (c2o0) a2nVar4;
                                boolean zG10 = fetVar4.g(function1);
                                Object objP10 = fetVar4.P();
                                if (zG10 || objP10 == cl5Var) {
                                    objP10 = new v6a0(function1, (byte) 8);
                                    fetVar4.o0(objP10);
                                }
                                hkb.n(null, c2o0Var2, this.c, (Function1) objP10, null, fetVar4, 0, 17);
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(false);
                    }
                    fetVar4.e0(-235028833);
                    fetVar4.r(false);
                    fetVar4.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar11.g(g9zVar3) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar11.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar11.U(i5 & 1, (i5 & 147) != 146)) {
                    p6t0 p6t0Var4 = (p6t0) a4xVar.get(iIntValue9);
                    fetVar11.e0(-1759527846);
                    if (p6t0Var4 instanceof m2g0) {
                        fetVar11.e0(-1759449324);
                        a2n a2nVar5 = ((m2g0) p6t0Var4).f21058a;
                        if (a2nVar5 instanceof nla) {
                            fetVar11.e0(-1759380938);
                            zcl zclVar8 = qmk.f28987a;
                            mm40 mm40VarN6 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            nla nlaVar2 = (nla) a2nVar5;
                            boolean zG11 = fetVar11.g(function1);
                            Object objP11 = fetVar11.P();
                            if (zG11 || objP11 == cl5Var) {
                                objP11 = new v6a0(function1, b4);
                                fetVar11.o0(objP11);
                            }
                            rcb.C(mm40VarN6, nlaVar2, this.c, (Function1) objP11, fetVar11, 0);
                            fetVar5 = fetVar11;
                            fetVar5.r(false);
                        } else {
                            fetVar5 = fetVar11;
                            fetVar5.e0(-1758842933);
                            fetVar5.r(false);
                        }
                        fetVar5.r(false);
                    } else {
                        fetVar5 = fetVar11;
                        fetVar5.e0(-1758803253);
                        fetVar5.r(false);
                    }
                    fetVar5.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            default:
                k8z k8zVar3 = (k8z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar12.g(k8zVar3) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar12.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar12.U(i6 & 1, (i6 & 147) != 146)) {
                    a2n a2nVar6 = (a2n) a4xVar.get(iIntValue11);
                    fetVar12.e0(-1668005871);
                    if (a2nVar6 == null) {
                        fetVar6 = fetVar12;
                    } else {
                        if (a2nVar6 instanceof y56) {
                            fetVar12.e0(-1667967277);
                            y56 y56Var3 = (y56) a2nVar6;
                            boolean zG12 = fetVar12.g(function1);
                            Object objP12 = fetVar12.P();
                            if (zG12 || objP12 == cl5Var) {
                                objP12 = new dpl0(function1, b5);
                                fetVar12.o0(objP12);
                            }
                            vcc.i(null, y56Var3, this.c, (Function1) objP12, null, fetVar12, 0, 17);
                            fetVar6 = fetVar12;
                            fetVar6.r(false);
                        } else {
                            fetVar6 = fetVar12;
                            if (a2nVar6 instanceof c2o0) {
                                fetVar6.e0(-1023624557);
                                c2o0 c2o0Var3 = (c2o0) a2nVar6;
                                boolean zG13 = fetVar6.g(function1);
                                Object objP13 = fetVar6.P();
                                if (zG13 || objP13 == cl5Var) {
                                    objP13 = new dpl0(function1, b3);
                                    fetVar6.o0(objP13);
                                }
                                hkb.n(null, c2o0Var3, this.c, (Function1) objP13, null, fetVar6, 0, 17);
                                fetVar6.r(false);
                            }
                        }
                        fetVar6.r(false);
                    }
                    fetVar6.e0(-1667307225);
                    fetVar6.r(false);
                    fetVar6.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
        }
    }
}
