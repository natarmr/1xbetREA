package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vpk implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37810a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ vpk(a4x a4xVar, qdz qdzVar, Function1 function1, Function1 function2, byte b) {
        this.f37810a = b;
        this.b = a4xVar;
        this.c = qdzVar;
        this.d = function1;
        this.e = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        fet fetVar2;
        byte b = this.f37810a;
        byte b2 = 9;
        a4x a4xVar = this.b;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 4;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar3.g(g9zVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) a4xVar.get(iIntValue);
                    fetVar3.e0(1515181193);
                    if (p6t0Var == null) {
                        fetVar = fetVar3;
                    } else {
                        boolean z = p6t0Var instanceof kuj;
                        jm40 jm40Var = jm40.b;
                        if (z) {
                            fetVar3.e0(1515154563);
                            sac.l(jm40Var, (kuj) p6t0Var, this.c, this.d, fetVar3, 6);
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            boolean z2 = p6t0Var instanceof nuj;
                            Function1 function1 = this.e;
                            if (z2) {
                                fetVar.e0(1515458425);
                                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2);
                                nuj nujVar = (nuj) p6t0Var;
                                boolean zG = fetVar.g(function1) | fetVar.g(p6t0Var);
                                Object objP = fetVar.P();
                                if (zG || objP == cl5Var) {
                                    objP = new z7(function1, p6t0Var, (byte) 9);
                                    fetVar.o0(objP);
                                }
                                fbc.t(mm40VarL, nujVar, (Function0) objP, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                byte b4 = 6;
                                if (p6t0Var instanceof mtj) {
                                    fetVar.e0(1515912296);
                                    mtj mtjVar = (mtj) p6t0Var;
                                    boolean zG2 = fetVar.g(function1);
                                    Object objP2 = fetVar.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new fzg(function1, (byte) 3);
                                        fetVar.o0(objP2);
                                    }
                                    n4c.e(mtjVar, this.c, (Function1) objP2, fetVar, 6);
                                    fetVar.r(false);
                                } else if (p6t0Var instanceof oxj) {
                                    fetVar.e0(1516512208);
                                    float f = xfn.a(fetVar).c;
                                    zcl zclVar = qmk.f28987a;
                                    mm40 mm40VarN = s5x0.N(jm40Var, f, 0.0f, f, 8.0f, 2);
                                    vrm vrmVar = ((oxj) p6t0Var).b;
                                    boolean zG3 = fetVar.g(function1);
                                    Object objP3 = fetVar.P();
                                    if (zG3 || objP3 == cl5Var) {
                                        objP3 = new fzg(function1, b3);
                                        fetVar.o0(objP3);
                                    }
                                    ccq0.s(mm40VarN, vrmVar, (Function1) objP3, fetVar, 0);
                                    fetVar.r(false);
                                } else if (p6t0Var instanceof ztj) {
                                    fetVar.e0(1517217768);
                                    a4x a4xVar2 = ((ztj) p6t0Var).b;
                                    boolean zG4 = fetVar.g(function1);
                                    Object objP4 = fetVar.P();
                                    if (zG4 || objP4 == cl5Var) {
                                        objP4 = new fzg(function1, (byte) 5);
                                        fetVar.o0(objP4);
                                    }
                                    Function1 function2 = (Function1) objP4;
                                    Object objP5 = fetVar.P();
                                    if (objP5 == cl5Var) {
                                        objP5 = ske.s;
                                        fetVar.o0(objP5);
                                    }
                                    Function1 function3 = (Function1) objP5;
                                    boolean zG5 = fetVar.g(function1);
                                    Object objP6 = fetVar.P();
                                    if (zG5 || objP6 == cl5Var) {
                                        objP6 = new fzg(function1, b4);
                                        fetVar.o0(objP6);
                                    }
                                    Function1 function4 = (Function1) objP6;
                                    boolean zG6 = fetVar.g(function1);
                                    Object objP7 = fetVar.P();
                                    if (zG6 || objP7 == cl5Var) {
                                        objP7 = new fzg(function1, (byte) 7);
                                        fetVar.o0(objP7);
                                    }
                                    Function1 function5 = (Function1) objP7;
                                    boolean zG7 = fetVar.g(function1);
                                    Object objP8 = fetVar.P();
                                    if (zG7 || objP8 == cl5Var) {
                                        objP8 = new fzg(function1, (byte) 8);
                                        fetVar.o0(objP8);
                                    }
                                    feb.m(null, a4xVar2, null, function2, function3, function4, function5, (Function1) objP8, fetVar, 24576, 5);
                                    fetVar.r(false);
                                }
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(1517949833);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) a4xVar.get(iIntValue3);
                    fetVar4.e0(-1787665860);
                    if (p6t0Var2 == null) {
                        fetVar2 = fetVar4;
                    } else {
                        boolean z3 = p6t0Var2 instanceof dqk;
                        Function1 function6 = this.d;
                        if (z3) {
                            fetVar4.e0(-1787673673);
                            dqk dqkVar = (dqk) p6t0Var2;
                            boolean zG8 = fetVar4.g(function6);
                            Object objP9 = fetVar4.P();
                            if (zG8 || objP9 == cl5Var) {
                                objP9 = new rr0(function6, (byte) 22);
                                fetVar4.o0(objP9);
                            }
                            Function0 function0 = (Function0) objP9;
                            boolean zG9 = fetVar4.g(function6);
                            Object objP10 = fetVar4.P();
                            if (zG9 || objP10 == cl5Var) {
                                objP10 = new fzg(function6, b2);
                                fetVar4.o0(objP10);
                            }
                            fxb.g(null, this.c, dqkVar, function0, (Function1) objP10, fetVar4, 0);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar4;
                            if (p6t0Var2 instanceof gqk) {
                                fetVar2.e0(-1786756817);
                                gqk gqkVar = (gqk) p6t0Var2;
                                boolean zG10 = fetVar2.g(function6);
                                Object objP11 = fetVar2.P();
                                if (zG10 || objP11 == cl5Var) {
                                    objP11 = new fzg(function6, (byte) 10);
                                    fetVar2.o0(objP11);
                                }
                                ozb.q(gqkVar, this.c, this.e, (Function1) objP11, fetVar2, 6);
                                fetVar2.r(false);
                            } else if (p6t0Var2 instanceof uqk) {
                                fetVar2.e0(-1785783293);
                                uqk uqkVar = (uqk) p6t0Var2;
                                boolean zG11 = fetVar2.g(function6);
                                Object objP12 = fetVar2.P();
                                if (zG11 || objP12 == cl5Var) {
                                    objP12 = new rr0(function6, (byte) 23);
                                    fetVar2.o0(objP12);
                                }
                                Function0 function7 = (Function0) objP12;
                                boolean zG12 = fetVar2.g(p6t0Var2) | fetVar2.g(function6);
                                Object objP13 = fetVar2.P();
                                if (zG12 || objP13 == cl5Var) {
                                    objP13 = new oqk(p6t0Var2, function6);
                                    fetVar2.o0(objP13);
                                }
                                wzb.n(null, this.c, uqkVar, function7, (Function1) objP13, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var2 instanceof ssk) {
                                fetVar2.e0(-334671009);
                                ssk sskVar = (ssk) p6t0Var2;
                                boolean zG13 = fetVar2.g(function6);
                                Object objP14 = fetVar2.P();
                                if (zG13 || objP14 == cl5Var) {
                                    objP14 = new rr0(function6, (byte) 24);
                                    fetVar2.o0(objP14);
                                }
                                vcc.e(sskVar, (Function0) objP14, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var2 instanceof fsk) {
                                fetVar2.e0(-1784630372);
                                fsk fskVar = (fsk) p6t0Var2;
                                boolean zG14 = fetVar2.g(function6);
                                Object objP15 = fetVar2.P();
                                if (zG14 || objP15 == cl5Var) {
                                    objP15 = new fzg(function6, (byte) 11);
                                    fetVar2.o0(objP15);
                                }
                                Function1 function8 = (Function1) objP15;
                                boolean zG15 = fetVar2.g(function6);
                                Object objP16 = fetVar2.P();
                                if (zG15 || objP16 == cl5Var) {
                                    objP16 = new rr0(function6, (byte) 25);
                                    fetVar2.o0(objP16);
                                }
                                qbc.h(fskVar, function8, (Function0) objP16, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(-1784199534);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
