package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rpk implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30891a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ l7m0 g;

    public /* synthetic */ rpk(xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, l7m0 l7m0Var, l7m0 l7m0Var2, byte b) {
        this.f30891a = b;
        this.b = xczVar;
        this.c = qdzVar;
        this.d = function1;
        this.e = function2;
        this.f = l7m0Var;
        this.g = l7m0Var2;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fet fetVar;
        fet fetVar2;
        byte b = this.f30891a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.g;
        l7m0 l7m0Var2 = this.f;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar3 = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    lpk lpkVar = (lpk) l7m0Var2.getValue();
                    if (lpkVar != null) {
                        boolean z = lpkVar instanceof jpk;
                        Function1 function1 = this.d;
                        if (z) {
                            fetVar3.e0(1428556727);
                            Object objP = fetVar3.P();
                            if (objP == cl5Var) {
                                objP = jgk0.b(new plh(l7m0Var, (byte) 3));
                                fetVar3.o0(objP);
                            }
                            l7m0 l7m0Var3 = (l7m0) objP;
                            Object objP2 = fetVar3.P();
                            if (objP2 == cl5Var) {
                                objP2 = jgk0.b(new plh(l7m0Var, (byte) 4));
                                fetVar3.o0(objP2);
                            }
                            dwi0.m(l7m0Var3, (l7m0) objP2, this.b, this.c, function1, this.e, fetVar3, 438);
                            fetVar3.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (lpkVar instanceof kpk) {
                                fetVar.e0(1429273664);
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
                                mdm mdmVar = ((kpk) lpkVar).f18680a;
                                boolean zG = fetVar.g(function1);
                                Object objP3 = fetVar.P();
                                if (zG || objP3 == cl5Var) {
                                    objP3 = new ouh(function1, (byte) 19);
                                    fetVar.o0(objP3);
                                }
                                jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
                                fetVar.r(true);
                                fetVar.r(false);
                            }
                        }
                    } else {
                        fetVar = fetVar3;
                    }
                    throw b1j.f(46079421, fetVar, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 1:
                fet fetVar4 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    z7o z7oVar = (z7o) l7m0Var2.getValue();
                    boolean zD = Intrinsics.d(z7oVar, x7o.f40421a);
                    Function1 function2 = this.d;
                    if (zD) {
                        fetVar4.e0(957860751);
                        Object objP4 = fetVar4.P();
                        if (objP4 == cl5Var) {
                            objP4 = jgk0.b(new plh(l7m0Var, (byte) 21));
                            fetVar4.o0(objP4);
                        }
                        ay3.r(null, (l7m0) objP4, this.b, this.c, function2, this.e, fetVar4, 48);
                        fetVar4.r(false);
                    } else {
                        if (!(z7oVar instanceof y7o)) {
                            throw b1j.f(1277821814, fetVar4, false);
                        }
                        fetVar4.e0(958371724);
                        n0q n0qVar = o7k0.c;
                        tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM2 = fetVar4.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar4, n0qVar);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, tj30VarC2, gqw0.x);
                        jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar4);
                        jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                        mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.e);
                        mdm mdmVar2 = ((y7o) z7oVar).f42162a;
                        boolean zG2 = fetVar4.g(function2);
                        Object objP5 = fetVar4.P();
                        if (zG2 || objP5 == cl5Var) {
                            objP5 = new s8o(function2, b2);
                            fetVar4.o0(objP5);
                        }
                        jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP5, fetVar4, 0, 4);
                        fetVar4.r(true);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar5 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 1025) != 1024)) {
                    d9t0 d9t0Var = (d9t0) l7m0Var2.getValue();
                    if (d9t0Var != null) {
                        boolean z2 = d9t0Var instanceof b9t0;
                        Function1 function3 = this.d;
                        if (z2) {
                            fetVar5.e0(-1008889736);
                            Object objP6 = fetVar5.P();
                            if (objP6 == cl5Var) {
                                objP6 = jgk0.b(new ybt0(l7m0Var, (byte) 1));
                                fetVar5.o0(objP6);
                            }
                            l7m0 l7m0Var4 = (l7m0) objP6;
                            Object objP7 = fetVar5.P();
                            if (objP7 == cl5Var) {
                                objP7 = jgk0.b(new ybt0(l7m0Var, (byte) 2));
                                fetVar5.o0(objP7);
                            }
                            cy2.t(null, l7m0Var4, (l7m0) objP7, this.b, this.c, function3, this.e, fetVar5, 432);
                            fetVar5.r(false);
                        } else {
                            fetVar2 = fetVar5;
                            if (d9t0Var instanceof c9t0) {
                                fetVar2.e0(-1008228909);
                                n0q n0qVar2 = o7k0.c;
                                tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                                int iHashCode3 = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM3 = fetVar2.m();
                                mm40 mm40VarC2 = kbc.c0(fetVar2, n0qVar2);
                                mkd.c0.getClass();
                                fetVar2.i0();
                                if (fetVar2.S) {
                                    fetVar2.l(pcyVar);
                                } else {
                                    fetVar2.r0();
                                }
                                jpm0.o(fetVar2, tj30VarC3, gqw0.x);
                                jpm0.o(fetVar2, bh90VarM3, gqw0.w);
                                jpm0.o(fetVar2, Integer.valueOf(iHashCode3), gqw0.y);
                                jpm0.n(fetVar2);
                                jpm0.o(fetVar2, mm40VarC2, gqw0.v);
                                mm40 mm40VarB3 = jr8Var.b(jm40Var, gqw0.e);
                                mdm mdmVar3 = ((c9t0) d9t0Var).f3978a;
                                boolean zG3 = fetVar2.g(function3);
                                Object objP8 = fetVar2.P();
                                if (zG3 || objP8 == cl5Var) {
                                    objP8 = new zbt0(function3, (byte) 0);
                                    fetVar2.o0(objP8);
                                }
                                jcb.l(mm40VarB3, mdmVar3, false, (Function0) objP8, fetVar2, 0, 4);
                                fetVar2.r(true);
                                fetVar2.r(false);
                            }
                        }
                    } else {
                        fetVar2 = fetVar5;
                    }
                    throw b1j.f(244546861, fetVar2, false);
                }
                fetVar5.X();
                return Unit.f46060a;
        }
    }
}
