package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tt1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34489a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ d9z d;
    public final /* synthetic */ xcz e;
    public final /* synthetic */ xcz f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ tt1(d9z d9zVar, xcz xczVar, xcz xczVar2, xcz xczVar3, l7m0 l7m0Var, Function1 function1) {
        this.f34489a = (byte) 0;
        this.b = l7m0Var;
        this.c = xczVar;
        this.d = d9zVar;
        this.e = xczVar2;
        this.f = xczVar3;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34489a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev1 ev1Var = (ev1) l7m0Var.getValue();
                    if (ev1Var != null) {
                        boolean z = ev1Var instanceof cv1;
                        Function1 function1 = this.g;
                        if (z) {
                            fetVar.e0(-1624294970);
                            zgc.d(o7k0.c, (cv1) ev1Var, this.c, this.d, this.e, this.f, function1, fetVar, 6);
                            fetVar.r(false);
                        } else if (ev1Var instanceof dv1) {
                            fetVar.e0(-1623675187);
                            mm40 mm40VarQ = i120.Q(knm0.r(o7k0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
                            tj30 tj30VarC = zq8.c(gqw0.e, false);
                            int iHashCode = Long.hashCode(fetVar.T);
                            bh90 bh90VarM = fetVar.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
                            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
                            mdm mdmVar = ((dv1) ev1Var).e;
                            boolean zG = fetVar.g(function1);
                            Object objP = fetVar.P();
                            if (zG || objP == cl5Var) {
                                objP = new si1(function1, (byte) 12);
                                fetVar.o0(objP);
                            }
                            jcb.l(mm40VarN, mdmVar, true, (Function0) objP, fetVar, 384, 0);
                            fetVar.r(true);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(-52398828, fetVar, false);
                }
                fetVar.X();
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev1 ev1Var2 = (ev1) l7m0Var.getValue();
                    if (ev1Var2 != null) {
                        boolean z2 = ev1Var2 instanceof cv1;
                        Function1 function2 = this.g;
                        if (z2) {
                            fetVar2.e0(1242419274);
                            o2e.h(o7k0.c, (cv1) ev1Var2, this.c, this.d, this.e, this.f, function2, fetVar2, 6);
                            fetVar2.r(false);
                        } else if (ev1Var2 instanceof dv1) {
                            fetVar2.e0(1243041940);
                            mm40 mm40VarQ2 = i120.Q(knm0.r(o7k0.c), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
                            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                            int iHashCode2 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM2 = fetVar2.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
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
                            mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                            mdm mdmVar2 = ((dv1) ev1Var2).e;
                            boolean zG2 = fetVar2.g(function2);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new si1(function2, (byte) 15);
                                fetVar2.o0(objP2);
                            }
                            jcb.l(mm40VarN2, mdmVar2, true, (Function0) objP2, fetVar2, 384, 0);
                            fetVar2.r(true);
                            fetVar2.r(false);
                        }
                    }
                    throw b1j.f(-1068302832, fetVar2, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev1 ev1Var3 = (ev1) l7m0Var.getValue();
                    if (ev1Var3 != null) {
                        boolean z3 = ev1Var3 instanceof cv1;
                        Function1 function3 = this.g;
                        if (z3) {
                            fetVar3.e0(1538124402);
                            x8f.d(o7k0.c, (cv1) ev1Var3, this.c, this.d, this.e, this.f, function3, fetVar3, 6);
                            fetVar3.r(false);
                        } else if (ev1Var3 instanceof dv1) {
                            fetVar3.e0(1538749951);
                            mm40 mm40VarQ3 = i120.Q(knm0.r(o7k0.c), ((ThemeColors) fetVar3.k(zaq0.b)).getBackground(), jd8.n);
                            tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                            int iHashCode3 = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM3 = fetVar3.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarQ3);
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
                            mm40 mm40VarN3 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar3, false), 7);
                            mdm mdmVar3 = ((dv1) ev1Var3).e;
                            boolean zG3 = fetVar3.g(function3);
                            Object objP3 = fetVar3.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new si1(function3, (byte) 17);
                                fetVar3.o0(objP3);
                            }
                            jcb.l(mm40VarN3, mdmVar3, true, (Function0) objP3, fetVar3, 384, 0);
                            fetVar3.r(true);
                            fetVar3.r(false);
                        }
                    }
                    throw b1j.f(-88932632, fetVar3, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ev1 ev1Var4 = (ev1) l7m0Var.getValue();
                    if (ev1Var4 != null) {
                        boolean z4 = ev1Var4 instanceof cv1;
                        Function1 function4 = this.g;
                        if (z4) {
                            fetVar4.e0(1881862705);
                            qjj.c(o7k0.c, (cv1) ev1Var4, this.c, this.d, this.e, this.f, function4, fetVar4, 6);
                            fetVar4.r(false);
                        } else if (ev1Var4 instanceof dv1) {
                            fetVar4.e0(1882484410);
                            mm40 mm40VarQ4 = i120.Q(knm0.r(o7k0.c), ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n);
                            tj30 tj30VarC4 = zq8.c(gqw0.e, false);
                            int iHashCode4 = Long.hashCode(fetVar4.T);
                            bh90 bh90VarM4 = fetVar4.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarQ4);
                            mkd.c0.getClass();
                            fetVar4.i0();
                            if (fetVar4.S) {
                                fetVar4.l(pcyVar);
                            } else {
                                fetVar4.r0();
                            }
                            jpm0.o(fetVar4, tj30VarC4, gqw0.x);
                            jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                            jpm0.o(fetVar4, Integer.valueOf(iHashCode4), gqw0.y);
                            jpm0.n(fetVar4);
                            jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                            mm40 mm40VarN4 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar4, false), 7);
                            mdm mdmVar4 = ((dv1) ev1Var4).e;
                            boolean zG4 = fetVar4.g(function4);
                            Object objP4 = fetVar4.P();
                            if (zG4 || objP4 == cl5Var) {
                                objP4 = new si1(function4, (byte) 19);
                                fetVar4.o0(objP4);
                            }
                            jcb.l(mm40VarN4, mdmVar4, true, (Function0) objP4, fetVar4, 384, 0);
                            fetVar4.r(true);
                            fetVar4.r(false);
                        }
                    }
                    throw b1j.f(614892361, fetVar4, false);
                }
                fetVar4.X();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ tt1(byte b, d9z d9zVar, xcz xczVar, xcz xczVar2, xcz xczVar3, l7m0 l7m0Var, Function1 function1) {
        this.f34489a = b;
        this.b = l7m0Var;
        this.c = xczVar;
        this.d = d9zVar;
        this.e = xczVar2;
        this.f = xczVar3;
        this.g = function1;
    }
}
