package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kzh0 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19154a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ kzh0(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f19154a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fet fetVar;
        boolean z;
        byte b = this.f19154a;
        cl5 cl5Var = ukd.f35823a;
        jr8 jr8Var = jr8.f16991a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                fet fetVar2 = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                zx7 zx7Var = gqw0.e;
                zx7 zx7Var2 = gqw0.f11754a;
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    ozh0 ozh0Var = (ozh0) ((vzh0) l7m0Var.getValue()).b.getValue();
                    if (ozh0Var == null) {
                        fetVar = fetVar2;
                        z = false;
                    } else if (ozh0Var instanceof lzh0) {
                        fetVar2.e0(-877042050);
                        ohq0.O(((lzh0) ozh0Var).f20906a, function1, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        z = false;
                        if (ozh0Var instanceof mzh0) {
                            fetVar2.e0(-876793523);
                            n0q n0qVar = o7k0.c;
                            tj30 tj30VarC = zq8.c(zx7Var2, false);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC, shdVar4);
                            jpm0.o(fetVar2, bh90VarM, shdVar3);
                            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                            jpm0.o(fetVar2, mm40VarC0, shdVar);
                            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                            mdm mdmVar = ((mzh0) ozh0Var).f22656a;
                            boolean zG = fetVar2.g(function1);
                            Object objP = fetVar2.P();
                            if (zG || objP == cl5Var) {
                                objP = new dng0(function1, (byte) 21);
                                fetVar2.o0(objP);
                            }
                            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar2, 0, 4);
                            fetVar2.r(true);
                            fetVar2.r(false);
                        } else {
                            fetVar = fetVar2;
                            if (ozh0Var instanceof nzh0) {
                                fetVar.e0(-876375209);
                                n0q n0qVar2 = o7k0.c;
                                tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                                int iHashCode2 = Long.hashCode(fetVar.T);
                                bh90 bh90VarM2 = fetVar.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar2);
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(pcyVar);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, tj30VarC2, shdVar4);
                                jpm0.o(fetVar, bh90VarM2, shdVar3);
                                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                                jpm0.o(fetVar, mm40VarC1, shdVar);
                                jwb.g(jr8Var.b(jm40Var, zx7Var), ((nzh0) ozh0Var).f24373a, false, fetVar, 0);
                                fetVar.r(true);
                                fetVar.r(false);
                            }
                        }
                    }
                    throw b1j.f(-998125721, fetVar, z);
                }
                fetVar2.X();
                return Unit.f46060a;
            default:
                fet fetVar3 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    jwb jwbVar = ((few) ((zew) l7m0Var.getValue()).b.getValue()).f9425a;
                    if (jwbVar instanceof dew) {
                        fetVar3.e0(1877881996);
                        y0x0.o(((dew) jwbVar).f5971a, function1, fetVar3, 6);
                        fetVar3.r(false);
                    } else {
                        if (!(jwbVar instanceof eew)) {
                            throw b1j.f(-493615924, fetVar3, false);
                        }
                        fetVar3.e0(1878175845);
                        mm40 mm40VarC = o7k0.c(o7k0.d(jm40Var, 1.0f), 1.0f);
                        tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                        int iHashCode3 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM3 = fetVar3.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarC);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC3, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                        mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.e);
                        mdm mdmVar2 = ((eew) jwbVar).f7693a;
                        boolean zG2 = fetVar3.g(function1);
                        Object objP2 = fetVar3.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new i8v(function1, (byte) 12);
                            fetVar3.o0(objP2);
                        }
                        jcb.l(mm40VarB2, mdmVar2, false, (Function0) objP2, fetVar3, 0, 4);
                        fetVar3.r(true);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }
}
