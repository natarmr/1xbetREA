package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fqk implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9978a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ qdz e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;

    public /* synthetic */ fqk(xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, pz40 pz40Var, l7m0 l7m0Var, pz40 pz40Var2) {
        this.d = xczVar;
        this.e = qdzVar;
        this.c = function1;
        this.f = function2;
        this.g = pz40Var;
        this.b = l7m0Var;
        this.h = pz40Var2;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fet fetVar;
        fet fetVar2;
        boolean z;
        byte b = this.f9978a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.h;
        l7m0 l7m0Var2 = this.g;
        l7m0 l7m0Var3 = this.b;
        switch (b) {
            case 0:
                pz40 pz40Var = (pz40) l7m0Var2;
                pz40 pz40Var2 = (pz40) l7m0Var;
                fet fetVar3 = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    Object objP = fetVar3.P();
                    if (objP == cl5Var) {
                        objP = jgk0.b(new plh(l7m0Var3, (byte) 6));
                        fetVar3.o0(objP);
                    }
                    l7m0 l7m0Var4 = (l7m0) objP;
                    lpk lpkVar = (lpk) l7m0Var4.getValue();
                    if (lpkVar != null) {
                        boolean z2 = lpkVar instanceof jpk;
                        xcz xczVar = this.d;
                        Function1 function1 = this.c;
                        if (z2) {
                            fetVar3.e0(1011904095);
                            Object objP2 = fetVar3.P();
                            if (objP2 == cl5Var) {
                                objP2 = jgk0.b(new plh(l7m0Var3, (byte) 7));
                                fetVar3.o0(objP2);
                            }
                            l7m0 l7m0Var5 = (l7m0) objP2;
                            Object objP3 = fetVar3.P();
                            if (objP3 == cl5Var) {
                                objP3 = jgk0.b(new plh(l7m0Var3, (byte) 8));
                                fetVar3.o0(objP3);
                            }
                            ay3.o(l7m0Var5, (l7m0) objP3, xczVar, this.e, function1, this.f, fetVar3, 438);
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (lpkVar instanceof kpk) {
                                fetVar.e0(1012623915);
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
                                Object objP4 = fetVar.P();
                                if (zG || objP4 == cl5Var) {
                                    objP4 = new ouh(function1, (byte) 20);
                                    fetVar.o0(objP4);
                                }
                                jcb.l(mm40VarB, mdmVar, false, (Function0) objP4, fetVar, 0, 4);
                                fetVar.r(true);
                                fetVar.r(false);
                            }
                        }
                        lpk lpkVar2 = (lpk) l7m0Var4.getValue();
                        Object objP5 = fetVar.P();
                        if (objP5 == cl5Var) {
                            objP5 = new ca6(pz40Var2, (byte) 28);
                            fetVar.o0(objP5);
                        }
                        dyb.F(lpkVar2, pz40Var, xczVar, (Function1) objP5, fetVar, 3128);
                    } else {
                        fetVar = fetVar3;
                    }
                    throw b1j.f(-521550315, fetVar, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            default:
                fet fetVar4 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    mm40 mm40VarS = o050.S(jm40Var);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarS);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar4, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar4, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar4, numValueOf, shdVar3);
                    jpm0.n(fetVar4);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar4, mm40VarC1, shdVar4);
                    Function1 function2 = this.c;
                    ohm0.d(l7m0Var3, function2, fetVar4, 0);
                    u8p0 u8p0Var = (u8p0) l7m0Var.getValue();
                    if (u8p0Var != null) {
                        if (u8p0Var instanceof s8p0) {
                            fetVar4.e0(477288828);
                            Object[] objArr = new Object[0];
                            boolean zG2 = fetVar4.g(l7m0Var2);
                            Object objP6 = fetVar4.P();
                            if (zG2 || objP6 == cl5Var) {
                                objP6 = new g7o0(l7m0Var2, (byte) 19);
                                fetVar4.o0(objP6);
                            }
                            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar4);
                            Object[] objArr2 = new Object[0];
                            boolean zG3 = fetVar4.g(l7m0Var2);
                            Object objP7 = fetVar4.P();
                            if (zG3 || objP7 == cl5Var) {
                                objP7 = new g7o0(l7m0Var2, (byte) 20);
                                fetVar4.o0(objP7);
                            }
                            dj8.R(null, l7m0VarY, v3c.Y(objArr2, (Function0) objP7, fetVar4), this.d, this.e, function2, this.f, fetVar4, 0);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                            z = true;
                        } else {
                            fetVar2 = fetVar4;
                            if (u8p0Var instanceof t8p0) {
                                fetVar2.e0(477876247);
                                n0q n0qVar = o7k0.c;
                                tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                                int iHashCode3 = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM3 = fetVar2.m();
                                mm40 mm40VarC2 = kbc.c0(fetVar2, n0qVar);
                                fetVar2.i0();
                                if (fetVar2.S) {
                                    fetVar2.l(pcyVar);
                                } else {
                                    fetVar2.r0();
                                }
                                jpm0.o(fetVar2, tj30VarC2, shdVar);
                                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.e);
                                mdm mdmVar2 = ((t8p0) u8p0Var).f33522a;
                                boolean zG4 = fetVar2.g(function2);
                                Object objP8 = fetVar2.P();
                                if (zG4 || objP8 == cl5Var) {
                                    objP8 = new g4p0(function2, (byte) 7);
                                    fetVar2.o0(objP8);
                                }
                                jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP8, fetVar2, 0, 4);
                                z = true;
                                fetVar2.r(true);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(z);
                    } else {
                        fetVar2 = fetVar4;
                    }
                    throw b1j.f(292488004, fetVar2, false);
                }
                fetVar4.X();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ fqk(l7m0 l7m0Var, Function1 function1, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function2, l7m0 l7m0Var3) {
        this.b = l7m0Var;
        this.c = function1;
        this.g = l7m0Var2;
        this.d = xczVar;
        this.e = qdzVar;
        this.f = function2;
        this.h = l7m0Var3;
    }
}
