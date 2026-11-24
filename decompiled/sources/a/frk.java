package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class frk implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10022a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ Function1 e;

    public frk(List list, Function1 function1, qdz qdzVar, Function1 function2) {
        this.f10022a = (byte) 1;
        this.b = list;
        this.c = function1;
        this.d = qdzVar;
        this.e = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        fet fetVar2;
        int i3;
        fet fetVar3;
        byte b = this.f10022a;
        jm40 jm40Var = jm40.b;
        qdz qdzVar = this.d;
        List list = this.b;
        Function1 function1 = this.c;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        byte b3 = 4;
        byte b4 = 0;
        byte b5 = 1;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar4.g(g9zVar) ? (byte) 4 : (byte) 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar4.e(iIntValue) ? 32 : 16;
                }
                if (fetVar4.U(i & 1, (i & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue);
                    fetVar4.e0(2114551862);
                    if (p6t0Var == null) {
                        fetVar = fetVar4;
                    } else {
                        if (p6t0Var instanceof gok) {
                            fetVar4.e0(2114524860);
                            gok gokVar = (gok) p6t0Var;
                            boolean zG = fetVar4.g(function1);
                            Object objP = fetVar4.P();
                            if (zG || objP == cl5Var) {
                                objP = new fzg(function1, (byte) 12);
                                fetVar4.o0(objP);
                            }
                            dub.p(gokVar, qdzVar, (Function1) objP, fetVar4, 0);
                            fetVar4.r(false);
                            fetVar = fetVar4;
                        } else if (p6t0Var instanceof yqv) {
                            fetVar4.e0(2115716097);
                            yqv yqvVar = (yqv) p6t0Var;
                            boolean zG2 = fetVar4.g(function1);
                            Object objP2 = fetVar4.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new fzg(function1, (byte) 13);
                                fetVar4.o0(objP2);
                            }
                            Function1 function2 = (Function1) objP2;
                            boolean zG3 = fetVar4.g(function1);
                            Object objP3 = fetVar4.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new fzg(function1, (byte) 14);
                                fetVar4.o0(objP3);
                            }
                            Function1 function3 = (Function1) objP3;
                            Object objP4 = fetVar4.P();
                            if (objP4 == cl5Var) {
                                objP4 = ske.t;
                                fetVar4.o0(objP4);
                            }
                            wvb.a(yqvVar, this.d, this.e, function2, function3, (Function1) objP4, fetVar4, 196608);
                            fetVar = fetVar4;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            if (p6t0Var instanceof hrv) {
                                fetVar.e0(2116479286);
                                hrv hrvVar = (hrv) p6t0Var;
                                boolean zG4 = fetVar.g(function1);
                                Object objP5 = fetVar.P();
                                if (zG4 || objP5 == cl5Var) {
                                    objP5 = new rr0(function1, (byte) 26);
                                    fetVar.o0(objP5);
                                }
                                Function0 function0 = (Function0) objP5;
                                boolean zG5 = fetVar.g(p6t0Var) | fetVar.g(function1);
                                Object objP6 = fetVar.P();
                                if (zG5 || objP6 == cl5Var) {
                                    objP6 = new grk(p6t0Var, function1);
                                    fetVar.o0(objP6);
                                }
                                fxb.s(hrvVar, this.d, function0, (Function1) objP6, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof crv) {
                                fetVar.e0(2117325958);
                                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                crv crvVar = (crv) p6t0Var;
                                boolean zG6 = fetVar.g(function1);
                                Object objP7 = fetVar.P();
                                if (zG6 || objP7 == cl5Var) {
                                    objP7 = new rr0(function1, (byte) 27);
                                    fetVar.o0(objP7);
                                }
                                Function0 function4 = (Function0) objP7;
                                boolean zG7 = fetVar.g(function1);
                                Object objP8 = fetVar.P();
                                if (zG7 || objP8 == cl5Var) {
                                    objP8 = new hrk(function1, b4);
                                    fetVar.o0(objP8);
                                }
                                wwb.q(mm40VarD, crvVar, this.d, function4, (Function2) objP8, fetVar, 6);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(2118202700);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar5.g(g9zVar2) ? (byte) 4 : (byte) 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar5.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue3);
                    fetVar5.e0(1779035996);
                    if (p6t0Var2 == null) {
                        fetVar2 = fetVar5;
                    } else {
                        if (p6t0Var2 instanceof prk) {
                            fetVar5.e0(1779028586);
                            sac.m(null, (prk) p6t0Var2, function1, fetVar5, 0);
                            fetVar5.r(false);
                            fetVar2 = fetVar5;
                        } else if (p6t0Var2 instanceof urk) {
                            fetVar5.e0(1779270231);
                            urk urkVar = (urk) p6t0Var2;
                            boolean zG8 = fetVar5.g(p6t0Var2) | fetVar5.g(function1);
                            Object objP9 = fetVar5.P();
                            if (zG8 || objP9 == cl5Var) {
                                objP9 = new z7(p6t0Var2, function1);
                                fetVar5.o0(objP9);
                            }
                            ibc.j(null, urkVar, this.d, this.e, (Function0) objP9, fetVar5, 0);
                            fetVar2 = fetVar5;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar5;
                            if (p6t0Var2 instanceof rrk) {
                                fetVar2.e0(1780091328);
                                rrk rrkVar = (rrk) p6t0Var2;
                                boolean zG9 = fetVar2.g(function1);
                                Object objP10 = fetVar2.P();
                                if (zG9 || objP10 == cl5Var) {
                                    objP10 = new rr0(function1, (byte) 28);
                                    fetVar2.o0(objP10);
                                }
                                Function0 function5 = (Function0) objP10;
                                boolean zG10 = fetVar2.g(p6t0Var2) | fetVar2.g(function1);
                                Object objP11 = fetVar2.P();
                                if (zG10 || objP11 == cl5Var) {
                                    objP11 = new vrk(p6t0Var2, function1);
                                    fetVar2.o0(objP11);
                                }
                                ebc.p(null, rrkVar, this.d, function5, (Function1) objP11, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var2 instanceof ork) {
                                fetVar2.e0(1781048980);
                                ork orkVar = (ork) p6t0Var2;
                                boolean zG11 = fetVar2.g(function1);
                                Object objP12 = fetVar2.P();
                                if (zG11 || objP12 == cl5Var) {
                                    objP12 = new rr0(function1, (byte) 29);
                                    fetVar2.o0(objP12);
                                }
                                Function0 function6 = (Function0) objP12;
                                boolean zG12 = fetVar2.g(function1);
                                Object objP13 = fetVar2.P();
                                if (zG12 || objP13 == cl5Var) {
                                    objP13 = new hrk(function1, b5);
                                    fetVar2.o0(objP13);
                                }
                                aac.k(null, orkVar, this.d, function6, (Function2) objP13, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(1781727756);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar6.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar6.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar6.U(i3 & 1, (i3 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) list.get(iIntValue5);
                    fetVar6.e0(-1170911941);
                    if (p6t0Var3 == null) {
                        fetVar3 = fetVar6;
                    } else {
                        if (p6t0Var3 instanceof gok) {
                            fetVar6.e0(-1170955063);
                            gok gokVar2 = (gok) p6t0Var3;
                            boolean zG13 = fetVar6.g(function1);
                            Object objP14 = fetVar6.P();
                            if (zG13 || objP14 == cl5Var) {
                                objP14 = new w8v(function1, b5);
                                fetVar6.o0(objP14);
                            }
                            dub.p(gokVar2, qdzVar, (Function1) objP14, fetVar6, 0);
                            fetVar6.r(false);
                            fetVar3 = fetVar6;
                        } else if (p6t0Var3 instanceof jf9) {
                            fetVar6.e0(-1170544499);
                            jf9 jf9Var = (jf9) p6t0Var3;
                            boolean zG14 = fetVar6.g(function1);
                            Object objP15 = fetVar6.P();
                            if (zG14 || objP15 == cl5Var) {
                                objP15 = new w8v(function1, b2);
                                fetVar6.o0(objP15);
                            }
                            ay3.k(null, this.d, jf9Var, (Function1) objP15, fetVar6, 0);
                            fetVar3 = fetVar6;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar6;
                            if (p6t0Var3 instanceof yqv) {
                                fetVar3.e0(-1170124015);
                                yqv yqvVar2 = (yqv) p6t0Var3;
                                boolean zG15 = fetVar3.g(function1);
                                Object objP16 = fetVar3.P();
                                if (zG15 || objP16 == cl5Var) {
                                    objP16 = new w8v(function1, (byte) 3);
                                    fetVar3.o0(objP16);
                                }
                                Function1 function7 = (Function1) objP16;
                                Object objP17 = fetVar3.P();
                                if (objP17 == cl5Var) {
                                    objP17 = ske.f1;
                                    fetVar3.o0(objP17);
                                }
                                Function1 function8 = (Function1) objP17;
                                boolean zG16 = fetVar3.g(function1) | fetVar3.g(p6t0Var3);
                                Object objP18 = fetVar3.P();
                                if (zG16 || objP18 == cl5Var) {
                                    objP18 = new bi2(function1, p6t0Var3, (byte) 5);
                                    fetVar3.o0(objP18);
                                }
                                wvb.a(yqvVar2, this.d, this.e, function7, function8, (Function1) objP18, fetVar3, 24576);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof crv) {
                                fetVar3.e0(-1169256232);
                                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                crv crvVar2 = (crv) p6t0Var3;
                                boolean zG17 = fetVar3.g(function1);
                                Object objP19 = fetVar3.P();
                                if (zG17 || objP19 == cl5Var) {
                                    objP19 = new cnn(function1, (byte) 8);
                                    fetVar3.o0(objP19);
                                }
                                Function0 function9 = (Function0) objP19;
                                boolean zG18 = fetVar3.g(function1);
                                Object objP20 = fetVar3.P();
                                if (zG18 || objP20 == cl5Var) {
                                    objP20 = new hrk(function1, b3);
                                    fetVar3.o0(objP20);
                                }
                                wwb.q(mm40VarD2, crvVar2, this.d, function9, (Function2) objP20, fetVar3, 6);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof vkw) {
                                fetVar3.e0(-1168691722);
                                vkw vkwVar = (vkw) p6t0Var3;
                                boolean zG19 = fetVar3.g(function1);
                                Object objP21 = fetVar3.P();
                                if (zG19 || objP21 == cl5Var) {
                                    objP21 = new cnn(function1, (byte) 9);
                                    fetVar3.o0(objP21);
                                }
                                aad.n(null, vkwVar, (Function0) objP21, fetVar3, 0, 1);
                                fetVar3.r(false);
                            } else if (p6t0Var3 instanceof hrv) {
                                fetVar3.e0(-1168231062);
                                hrv hrvVar2 = (hrv) p6t0Var3;
                                boolean zG20 = fetVar3.g(function1);
                                Object objP22 = fetVar3.P();
                                if (zG20 || objP22 == cl5Var) {
                                    objP22 = new cnn(function1, (byte) 10);
                                    fetVar3.o0(objP22);
                                }
                                Function0 function10 = (Function0) objP22;
                                boolean zG21 = fetVar3.g(p6t0Var3) | fetVar3.g(function1);
                                Object objP23 = fetVar3.P();
                                if (zG21 || objP23 == cl5Var) {
                                    objP23 = new drv(p6t0Var3, function1);
                                    fetVar3.o0(objP23);
                                }
                                fxb.s(hrvVar2, this.d, function10, (Function1) objP23, fetVar3, 0);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(-1167545559);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ frk(List list, qdz qdzVar, Function1 function1, Function1 function2, byte b) {
        this.f10022a = b;
        this.b = list;
        this.d = qdzVar;
        this.c = function1;
        this.e = function2;
    }
}
