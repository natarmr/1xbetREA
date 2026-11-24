package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class kp0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18654a;
    public final /* synthetic */ List b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ kp0(List list, mm40 mm40Var, Function1 function1, byte b) {
        this.f18654a = b;
        this.b = list;
        this.c = mm40Var;
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
        int i5;
        int i6;
        fet fetVar4;
        int i7;
        fet fetVar5;
        byte b = this.f18654a;
        mm40 mm40Var = this.c;
        List list = this.b;
        Function1 function1 = this.d;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar6.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar6.e(iIntValue) ? 32 : 16;
                }
                if (fetVar6.U(i & 1, (i & 147) != 146)) {
                    lxl lxlVar = (lxl) list.get(iIntValue);
                    fetVar6.e0(1246004483);
                    boolean zF = fetVar6.f(lxlVar.f20819a);
                    Object objP = fetVar6.P();
                    if (zF || objP == cl5Var) {
                        objP = new jp0(function1, lxlVar, (byte) 0);
                        fetVar6.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    dyl dylVar = lxlVar.b;
                    if (dylVar instanceof zxl) {
                        fetVar6.e0(-929629629);
                        zxl zxlVar = (zxl) dylVar;
                        nia0.G(this.c, zxlVar.f45165a, zxlVar.b, lxlVar.b(), function0, fetVar6, 0);
                        fetVar = fetVar6;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar6;
                        fetVar.e0(1246596737);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar6.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar7.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar7.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar7.U(i2 & 1, (i2 & 147) != 146)) {
                    lxl lxlVar2 = (lxl) list.get(iIntValue3);
                    fetVar7.e0(1050779333);
                    boolean zF2 = fetVar7.f(lxlVar2.f20819a);
                    Object objP2 = fetVar7.P();
                    if (zF2 || objP2 == cl5Var) {
                        objP2 = new jp0(function1, lxlVar2, (byte) 1);
                        fetVar7.o0(objP2);
                    }
                    Function0 function2 = (Function0) objP2;
                    dyl dylVar2 = lxlVar2.b;
                    if (dylVar2 instanceof zxl) {
                        fetVar7.e0(-1490116543);
                        zxl zxlVar2 = (zxl) dylVar2;
                        xia0.A(this.c, zxlVar2.f45165a, zxlVar2.b, lxlVar2.b(), function2, fetVar7, 0);
                        fetVar2 = fetVar7;
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar7;
                        fetVar2.e0(1051369665);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar7.X();
                }
                break;
            case 2:
                k8z k8zVar = (k8z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar8.g(k8zVar) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar8.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar8.U(i3 & 1, (i3 & 147) != 146)) {
                    jlb jlbVar = (jlb) list.get(iIntValue5);
                    fetVar8.e0(-375256806);
                    if (jlbVar == null) {
                        fetVar3 = fetVar8;
                    } else {
                        if (jlbVar instanceof hlb) {
                            fetVar8.e0(-375205192);
                            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
                            zrm zrmVar = ((hlb) jlbVar).b;
                            boolean zG = fetVar8.g(function1) | fetVar8.g(jlbVar);
                            Object objP3 = fetVar8.P();
                            if (zG || objP3 == cl5Var) {
                                objP3 = new k160(function1, jlbVar, (byte) 0);
                                fetVar8.o0(objP3);
                            }
                            Function0 function3 = (Function0) objP3;
                            boolean zG2 = fetVar8.g(function1) | fetVar8.g(jlbVar);
                            Object objP4 = fetVar8.P();
                            if (zG2 || objP4 == cl5Var) {
                                objP4 = new l160(function1, jlbVar, (byte) 0);
                                fetVar8.o0(objP4);
                            }
                            agc.r(mm40VarC, zrmVar, function3, null, null, (Function1) objP4, null, fetVar8, 6, 88);
                            fetVar3 = fetVar8;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar8;
                            if (jlbVar instanceof ilb) {
                                fetVar3.e0(-374469562);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarE = o7k0.e(mm40Var, 66.0f);
                                zcl zclVar2 = qmk.i;
                                ugg0 ugg0Var = vgg0.f37379a;
                                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar3, 0, 1), fetVar3, false);
                            } else if (jlbVar instanceof glb) {
                                fetVar3.e0(-374086743);
                                mm40 mm40VarC2 = o7k0.c(mm40Var, 1.0f);
                                kjl kjlVar = ((glb) jlbVar).f11482a;
                                boolean zG3 = fetVar3.g(function1);
                                Object objP5 = fetVar3.P();
                                if (zG3 || objP5 == cl5Var) {
                                    objP5 = new t450(function1, (byte) 1);
                                    fetVar3.o0(objP5);
                                }
                                ieb.m(mm40VarC2, kjlVar, (Function0) objP5, fetVar3, 6, 0);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(-373744193);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar8.X();
                }
                break;
            case 3:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar9.g(g9zVar3) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar9.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar9.U(i4 & 1, (i4 & 147) != 146)) {
                    sbs0 sbs0Var = (sbs0) list.get(iIntValue7);
                    fetVar9.e0(-1809037737);
                    r7p r7pVar = sbs0Var.c;
                    boolean zG4 = fetVar9.g(function1) | fetVar9.g(sbs0Var);
                    Object objP6 = fetVar9.P();
                    if (zG4 || objP6 == cl5Var) {
                        objP6 = new q160(function1, sbs0Var, (byte) 0);
                        fetVar9.o0(objP6);
                    }
                    Function0 function4 = (Function0) objP6;
                    boolean zG5 = fetVar9.g(function1) | fetVar9.g(sbs0Var);
                    Object objP7 = fetVar9.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new q160(function1, sbs0Var, (byte) 1);
                        fetVar9.o0(objP7);
                    }
                    Function0 function5 = (Function0) objP7;
                    boolean zG6 = fetVar9.g(function1);
                    Object objP8 = fetVar9.P();
                    if (zG6 || objP8 == cl5Var) {
                        objP8 = new w8v(function1, (byte) 17);
                        fetVar9.o0(objP8);
                    }
                    Function1 function6 = (Function1) objP8;
                    boolean zG7 = fetVar9.g(function1) | fetVar9.g(sbs0Var);
                    Object objP9 = fetVar9.P();
                    if (zG7 || objP9 == cl5Var) {
                        objP9 = new q160(function1, sbs0Var, (byte) 2);
                        fetVar9.o0(objP9);
                    }
                    vdb.E(this.c, r7pVar, function4, function5, function6, (Function0) objP9, fetVar9, 6, 0);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                break;
            case 4:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar10.g(g9zVar4) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar10.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar10.U(i5 & 1, (i5 & 147) != 146)) {
                    tdp tdpVar = (tdp) list.get(iIntValue9);
                    fetVar10.e0(-2050426946);
                    boolean zG8 = fetVar10.g(function1) | fetVar10.g(tdpVar);
                    Object objP10 = fetVar10.P();
                    if (zG8 || objP10 == cl5Var) {
                        objP10 = new m160(function1, tdpVar, (byte) 5);
                        fetVar10.o0(objP10);
                    }
                    ckb.x(mm40Var, tdpVar, (Function1) objP10, fetVar10, 6);
                    fetVar10.r(false);
                } else {
                    fetVar10.X();
                }
                break;
            case 5:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar11.g(k8zVar2) ? (byte) 4 : (byte) 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar11.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar11.U(i6 & 1, (i6 & 147) != 146)) {
                    jlb jlbVar2 = (jlb) list.get(iIntValue11);
                    fetVar11.e0(-1563910686);
                    if (jlbVar2 == null) {
                        fetVar4 = fetVar11;
                    } else {
                        if (jlbVar2 instanceof hlb) {
                            fetVar11.e0(-1563858576);
                            mm40 mm40VarC3 = o7k0.c(mm40Var, 1.0f);
                            zrm zrmVar2 = ((hlb) jlbVar2).b;
                            boolean zG9 = fetVar11.g(function1) | fetVar11.g(jlbVar2);
                            Object objP11 = fetVar11.P();
                            if (zG9 || objP11 == cl5Var) {
                                objP11 = new k160(function1, jlbVar2, (byte) 1);
                                fetVar11.o0(objP11);
                            }
                            Function0 function7 = (Function0) objP11;
                            boolean zG10 = fetVar11.g(function1) | fetVar11.g(jlbVar2);
                            Object objP12 = fetVar11.P();
                            if (zG10 || objP12 == cl5Var) {
                                objP12 = new l160(function1, jlbVar2, (byte) 1);
                                fetVar11.o0(objP12);
                            }
                            agc.r(mm40VarC3, zrmVar2, function7, null, null, (Function1) objP12, null, fetVar11, 6, 88);
                            fetVar4 = fetVar11;
                            fetVar4.r(false);
                        } else {
                            fetVar4 = fetVar11;
                            if (jlbVar2 instanceof ilb) {
                                fetVar4.e0(-1563272862);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarE2 = o7k0.e(mm40Var, 66.0f);
                                zcl zclVar4 = qmk.i;
                                ugg0 ugg0Var2 = vgg0.f37379a;
                                h97.s(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), vbc.d0(null, fetVar4, 0, 1), fetVar4, false);
                            } else if (jlbVar2 instanceof glb) {
                                fetVar4.e0(-1562890539);
                                mm40 mm40VarC4 = o7k0.c(mm40Var, 1.0f);
                                kjl kjlVar2 = ((glb) jlbVar2).f11482a;
                                boolean zG11 = fetVar4.g(function1);
                                Object objP13 = fetVar4.P();
                                if (zG11 || objP13 == cl5Var) {
                                    objP13 = new t450(function1, (byte) 4);
                                    fetVar4.o0(objP13);
                                }
                                ieb.m(mm40VarC4, kjlVar2, (Function0) objP13, fetVar4, 6, 0);
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(false);
                    }
                    fetVar4.e0(-1562563365);
                    fetVar4.r(false);
                    fetVar4.r(false);
                } else {
                    fetVar11.X();
                }
                break;
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar12.g(g9zVar5) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar12.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar12.U(i7 & 1, (i7 & 147) != 146)) {
                    a2n a2nVar = (a2n) list.get(iIntValue13);
                    fetVar12.e0(944277045);
                    if (a2nVar == null) {
                        fetVar5 = fetVar12;
                    } else {
                        if (a2nVar instanceof y56) {
                            fetVar12.e0(307556428);
                            y56 y56Var = (y56) a2nVar;
                            boolean zG12 = fetVar12.g(function1);
                            Object objP14 = fetVar12.P();
                            if (zG12 || objP14 == cl5Var) {
                                objP14 = new v6a0(function1, b2);
                                fetVar12.o0(objP14);
                            }
                            vcc.i(this.c, y56Var, false, (Function1) objP14, null, fetVar12, 0, 20);
                            fetVar5 = fetVar12;
                            fetVar5.r(false);
                        } else {
                            fetVar5 = fetVar12;
                            if (a2nVar instanceof c2o0) {
                                fetVar5.e0(307571440);
                                c2o0 c2o0Var = (c2o0) a2nVar;
                                boolean zG13 = fetVar5.g(function1);
                                Object objP15 = fetVar5.P();
                                if (zG13 || objP15 == cl5Var) {
                                    objP15 = new v6a0(function1, (byte) 3);
                                    fetVar5.o0(objP15);
                                }
                                hkb.n(this.c, c2o0Var, false, (Function1) objP15, null, fetVar5, 0, 20);
                                fetVar5.r(false);
                            }
                        }
                        fetVar5.r(false);
                    }
                    fetVar5.e0(945208253);
                    fetVar5.r(false);
                    fetVar5.r(false);
                } else {
                    fetVar12.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
