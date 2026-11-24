package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gz20 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12160a;
    public final /* synthetic */ kz20 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ gz20(kz20 kz20Var, Function1 function1, byte b) {
        this.f12160a = b;
        this.b = kz20Var;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f12160a;
        byte b2 = 2;
        byte b3 = 21;
        Function1 function1 = this.c;
        kz20 kz20Var = this.b;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        byte b4 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nym0 nym0Var = kz20Var.j;
                    if (nym0Var == null) {
                        fetVar.e0(-321560156);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-321560155);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, x5dVarA, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new lj00(function1, (byte) 18);
                            fetVar.o0(objP);
                        }
                        Function1 function2 = (Function1) objP;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new pd10(function1, (byte) 21);
                            fetVar.o0(objP2);
                        }
                        mym0.c(null, nym0Var, function2, (Function0) objP2, fetVar, 0, 1);
                        mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar, 54, 4);
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(jm40Var, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    j2e.l(o7k0.e(mm40VarD, 48.0f), this.b, 8.0f, 8.0f, this.c, hp4.d, hp4.e, fetVar2, 1769472);
                    mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD2, 40.0f);
                    pz40 pz40Var2 = s6t0.f31722a;
                    mm40 mm40VarQ2 = i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
                    Object objP3 = fetVar3.P();
                    if (objP3 == cl5Var) {
                        mbh0 mbh0Var = new mbh0(0.0f, 0.0f, 0.0f, y3d.f);
                        fetVar3.o0(mbh0Var);
                        objP3 = mbh0Var;
                    }
                    ugd ugdVar = hp4.f;
                    ugd ugdVar2 = hp4.g;
                    kz20 kz20Var2 = this.b;
                    Function1 function3 = this.c;
                    cvm0.a(mm40VarQ2, kz20Var2, (mbh0) objP3, false, null, function3, ugdVar, ugdVar2, u1c.M(-1237420036, new iz20(kz20Var2, function3, b4), fetVar3), hp4.h, null, fetVar3, 920125824, 0, 1048);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nym0 nym0Var2 = kz20Var.j;
                    if (nym0Var2 == null) {
                        fetVar4.e0(-1105901557);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1105901556);
                        x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
                        int iHashCode3 = Long.hashCode(fetVar4.T);
                        bh90 bh90VarM3 = fetVar4.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar4, jm40Var);
                        mkd.c0.getClass();
                        fetVar4.i0();
                        if (fetVar4.S) {
                            fetVar4.l(pcyVar);
                        } else {
                            fetVar4.r0();
                        }
                        jpm0.o(fetVar4, x5dVarA3, gqw0.x);
                        jpm0.o(fetVar4, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar4, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar4);
                        jpm0.o(fetVar4, mm40VarC2, gqw0.v);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                        boolean zG3 = fetVar4.g(function1);
                        Object objP4 = fetVar4.P();
                        if (zG3 || objP4 == cl5Var) {
                            objP4 = new lj00(function1, (byte) 19);
                            fetVar4.o0(objP4);
                        }
                        Function1 function4 = (Function1) objP4;
                        boolean zG4 = fetVar4.g(function1);
                        Object objP5 = fetVar4.P();
                        if (zG4 || objP5 == cl5Var) {
                            objP5 = new pd10(function1, (byte) 22);
                            fetVar4.o0(objP5);
                        }
                        mym0.c(mm40VarL, nym0Var2, function4, (Function0) objP5, fetVar4, 0, 0);
                        mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar4, 54, 4);
                        fetVar4.r(true);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode4 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM4 = fetVar5.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA4, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC3, gqw0.v);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    j2e.l(o7k0.e(mm40VarD3, 48.0f), this.b, 8.0f, 8.0f, this.c, kc5.d, kc5.e, fetVar5, 1769472);
                    mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar5, 54, 4);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD4, 40.0f);
                    Object objP6 = fetVar6.P();
                    if (objP6 == cl5Var) {
                        objP6 = new mbh0(8.0f, 0.0f, 8.0f, y3d.f);
                        fetVar6.o0(objP6);
                    }
                    ugd ugdVar3 = kc5.f;
                    ugd ugdVar4 = kc5.g;
                    kz20 kz20Var3 = this.b;
                    Function1 function5 = this.c;
                    cvm0.a(mm40VarE2, kz20Var3, (mbh0) objP6, false, null, function5, ugdVar3, ugdVar4, u1c.M(1171998968, new iz20(kz20Var3, function5, b2), fetVar6), kc5.h, null, fetVar6, 920125824, 0, 1048);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    nym0 nym0Var3 = kz20Var.j;
                    if (nym0Var3 == null) {
                        fetVar7.e0(-1959936448);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-1959936447);
                        x5d x5dVarA5 = w5d.a(uc9.c, gqw0.m, fetVar7, 0);
                        int iHashCode5 = Long.hashCode(fetVar7.T);
                        bh90 bh90VarM5 = fetVar7.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar7, jm40Var);
                        mkd.c0.getClass();
                        fetVar7.i0();
                        if (fetVar7.S) {
                            fetVar7.l(pcyVar);
                        } else {
                            fetVar7.r0();
                        }
                        jpm0.o(fetVar7, x5dVarA5, gqw0.x);
                        jpm0.o(fetVar7, bh90VarM5, gqw0.w);
                        jpm0.o(fetVar7, Integer.valueOf(iHashCode5), gqw0.y);
                        jpm0.n(fetVar7);
                        jpm0.o(fetVar7, mm40VarC4, gqw0.v);
                        boolean zG5 = fetVar7.g(function1);
                        Object objP7 = fetVar7.P();
                        if (zG5 || objP7 == cl5Var) {
                            objP7 = new lj00(function1, (byte) 20);
                            fetVar7.o0(objP7);
                        }
                        Function1 function6 = (Function1) objP7;
                        boolean zG6 = fetVar7.g(function1);
                        Object objP8 = fetVar7.P();
                        if (zG6 || objP8 == cl5Var) {
                            objP8 = new pd10(function1, (byte) 23);
                            fetVar7.o0(objP8);
                        }
                        mym0.c(null, nym0Var3, function6, (Function0) objP8, fetVar7, 0, 1);
                        mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar7, 54, 4);
                        fetVar7.r(true);
                        fetVar7.r(false);
                    }
                } else {
                    fetVar7.X();
                }
                break;
            default:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    nym0 nym0Var4 = kz20Var.j;
                    if (nym0Var4 == null) {
                        fetVar8.e0(-1278439388);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-1278439387);
                        x5d x5dVarA6 = w5d.a(uc9.c, gqw0.m, fetVar8, 0);
                        int iHashCode6 = Long.hashCode(fetVar8.T);
                        bh90 bh90VarM6 = fetVar8.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar8, jm40Var);
                        mkd.c0.getClass();
                        fetVar8.i0();
                        if (fetVar8.S) {
                            fetVar8.l(pcyVar);
                        } else {
                            fetVar8.r0();
                        }
                        jpm0.o(fetVar8, x5dVarA6, gqw0.x);
                        jpm0.o(fetVar8, bh90VarM6, gqw0.w);
                        jpm0.o(fetVar8, Integer.valueOf(iHashCode6), gqw0.y);
                        jpm0.n(fetVar8);
                        jpm0.o(fetVar8, mm40VarC5, gqw0.v);
                        boolean zG7 = fetVar8.g(function1);
                        Object objP9 = fetVar8.P();
                        if (zG7 || objP9 == cl5Var) {
                            objP9 = new lj00(function1, b3);
                            fetVar8.o0(objP9);
                        }
                        Function1 function7 = (Function1) objP9;
                        boolean zG8 = fetVar8.g(function1);
                        Object objP10 = fetVar8.P();
                        if (zG8 || objP10 == cl5Var) {
                            objP10 = new pd10(function1, (byte) 24);
                            fetVar8.o0(objP10);
                        }
                        mym0.c(null, nym0Var4, function7, (Function0) objP10, fetVar8, 0, 1);
                        mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar8, 54, 4);
                        fetVar8.r(true);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
