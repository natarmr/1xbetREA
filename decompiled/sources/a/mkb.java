package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mkb implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21936a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mkb(xcz xczVar, qdz qdzVar, Function1 function1, l7m0 l7m0Var, l7m0 l7m0Var2) {
        this.c = xczVar;
        this.d = qdzVar;
        this.e = function1;
        this.b = l7m0Var;
        this.f = l7m0Var2;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fet fetVar;
        fet fetVar2;
        byte b = this.f21936a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.b;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                l7m0 l7m0Var2 = (l7m0) obj6;
                fet fetVar3 = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    qkb qkbVar = (qkb) l7m0Var.getValue();
                    if (qkbVar != null) {
                        boolean z = qkbVar instanceof okb;
                        Function1 function1 = this.e;
                        if (z) {
                            fetVar3.e0(-256669975);
                            Object objP = fetVar3.P();
                            if (objP == cl5Var) {
                                objP = jgk0.b(new eka(l7m0Var2, (byte) 7));
                                fetVar3.o0(objP);
                            }
                            eeq.o(null, (l7m0) objP, this.c, this.d, function1, fetVar3, 48);
                            fetVar3.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (qkbVar instanceof pkb) {
                                fetVar.e0(-256229496);
                                mm40 mm40VarR = knm0.r(o7k0.c);
                                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                int iHashCode = Long.hashCode(fetVar.T);
                                bh90 bh90VarM = fetVar.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(pcyVar);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, tj30VarC, gqw0.x);
                                jpm0.o(fetVar, bh90VarM, gqw0.w);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                mdm mdmVar = ((pkb) qkbVar).f27128a;
                                boolean zG = fetVar.g(function1);
                                Object objP2 = fetVar.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new dib(function1, (byte) 4);
                                    fetVar.o0(objP2);
                                }
                                jcb.l(mm40VarB, mdmVar, false, (Function0) objP2, fetVar, 0, 4);
                                fetVar.r(true);
                                fetVar.r(false);
                            }
                        }
                    } else {
                        fetVar = fetVar3;
                    }
                    throw b1j.f(1792832938, fetVar, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 1:
                l7m0 l7m0Var3 = (l7m0) obj6;
                fet fetVar4 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (!fetVar4.U(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    fetVar4.X();
                } else if (((gjw) l7m0Var.getValue()) instanceof djw) {
                    fetVar4.e0(-911104981);
                    Object objP3 = fetVar4.P();
                    if (objP3 == cl5Var) {
                        objP3 = jgk0.b(new ziw(l7m0Var3, (byte) 0));
                        fetVar4.o0(objP3);
                    }
                    wb.m(null, (l7m0) objP3, this.c, this.d, this.e, fetVar4, 48);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-910718225);
                    fetVar4.r(false);
                }
                return Unit.f46060a;
            default:
                Function1 function2 = (Function1) obj6;
                fet fetVar5 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 1025) != 1024)) {
                    Object objP4 = fetVar5.P();
                    if (objP4 == cl5Var) {
                        objP4 = jgk0.b(new plh(l7m0Var, (byte) 12));
                        fetVar5.o0(objP4);
                    }
                    lpk lpkVar = (lpk) ((l7m0) objP4).getValue();
                    if (lpkVar != null) {
                        boolean z2 = lpkVar instanceof jpk;
                        Function1 function3 = this.e;
                        if (z2) {
                            fetVar5.e0(-1356505670);
                            Object objP5 = fetVar5.P();
                            if (objP5 == cl5Var) {
                                objP5 = jgk0.b(new plh(l7m0Var, (byte) 13));
                                fetVar5.o0(objP5);
                            }
                            l7m0 l7m0Var4 = (l7m0) objP5;
                            Object objP6 = fetVar5.P();
                            if (objP6 == cl5Var) {
                                objP6 = jgk0.b(new plh(l7m0Var, (byte) 14));
                                fetVar5.o0(objP6);
                            }
                            kc5.W(l7m0Var4, (l7m0) objP6, this.c, this.d, function3, function2, fetVar5, 438);
                            fetVar5.r(false);
                        } else {
                            fetVar2 = fetVar5;
                            if (lpkVar instanceof kpk) {
                                fetVar2.e0(-1355786811);
                                mm40 mm40VarR2 = knm0.r(o7k0.c);
                                tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                                int iHashCode2 = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM2 = fetVar2.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarR2);
                                mkd.c0.getClass();
                                fetVar2.i0();
                                if (fetVar2.S) {
                                    fetVar2.l(pcyVar);
                                } else {
                                    fetVar2.r0();
                                }
                                jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                                jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar2);
                                jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.e);
                                mdm mdmVar2 = ((kpk) lpkVar).f18680a;
                                boolean zG2 = fetVar2.g(function3);
                                Object objP7 = fetVar2.P();
                                if (zG2 || objP7 == cl5Var) {
                                    objP7 = new ouh(function3, (byte) 22);
                                    fetVar2.o0(objP7);
                                }
                                jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP7, fetVar2, 0, 4);
                                fetVar2.r(true);
                                fetVar2.r(false);
                            }
                        }
                    } else {
                        fetVar2 = fetVar5;
                    }
                    throw b1j.f(-597950630, fetVar2, false);
                }
                fetVar5.X();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ mkb(xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, l7m0 l7m0Var) {
        this.c = xczVar;
        this.d = qdzVar;
        this.e = function1;
        this.f = function2;
        this.b = l7m0Var;
    }

    public /* synthetic */ mkb(l7m0 l7m0Var, xcz xczVar, qdz qdzVar, Function1 function1, l7m0 l7m0Var2) {
        this.b = l7m0Var;
        this.c = xczVar;
        this.d = qdzVar;
        this.e = function1;
        this.f = l7m0Var2;
    }
}
