package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class hgl0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13021a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kfl0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ hgl0(List list, kfl0 kfl0Var, Function1 function1, boolean z, byte b) {
        this.f13021a = b;
        this.b = list;
        this.c = kfl0Var;
        this.d = function1;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x020e  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        fet fetVar;
        jm40 jm40Var;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        fet fetVar2;
        jm40 jm40Var2;
        boolean z4;
        byte b = this.f13021a;
        byte b2 = 26;
        boolean z5 = this.e;
        kfl0 kfl0Var = this.c;
        List list = this.b;
        Function1 function1 = this.d;
        cl5 cl5Var = ukd.f35823a;
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
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue);
                    fetVar3.e0(-1766770868);
                    z = iIntValue == q3d.i(kfl0Var.b);
                    jm40 jm40Var3 = jm40.b;
                    if (p6t0Var == null) {
                        jm40Var = jm40Var3;
                        fetVar = fetVar3;
                    } else {
                        if (p6t0Var instanceof rfl0) {
                            fetVar3.e0(-1766718820);
                            nkb.h(s5x0.L(jm40Var3, xfn.a(fetVar3).d, 0.0f, 2), ((rfl0) p6t0Var).f30394a, kjm.b, null, null, null, fetVar3, 384, 56);
                            fetVar = fetVar3;
                            fetVar.r(false);
                            jm40Var = jm40Var3;
                        } else {
                            fetVar = fetVar3;
                            if (p6t0Var instanceof rer0) {
                                fetVar.e0(-1766400915);
                                zcl zclVar = qmk.f28987a;
                                mm40 mm40VarN = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                f3n f3nVar = ((rer0) p6t0Var).f30350a;
                                boolean zG = fetVar.g(function1);
                                Object objP = fetVar.P();
                                if (zG || objP == cl5Var) {
                                    objP = new v6a0(function1, b2);
                                    fetVar.o0(objP);
                                }
                                qcc.m(mm40VarN, f3nVar, (Function1) objP, fetVar, 4);
                                fetVar.r(false);
                                jm40Var = jm40Var3;
                            } else if (p6t0Var instanceof gpp) {
                                fetVar.e0(-1765867715);
                                float f = xfn.a(fetVar).d;
                                float f2 = xfn.a(fetVar).d;
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarN2 = s5x0.N(jm40Var3, f, 0.0f, f2, 8.0f, 2);
                                jm40Var = jm40Var3;
                                b8l0 b8l0Var = ((gpp) p6t0Var).d;
                                l3l0 l3l0Var = new l3l0(16.0f);
                                boolean zG2 = fetVar.g(function1) | fetVar.g(p6t0Var);
                                Object objP2 = fetVar.P();
                                if (zG2 || objP2 == cl5Var) {
                                    objP2 = new z7(function1, p6t0Var, (byte) 20);
                                    fetVar.o0(objP2);
                                }
                                Function0 function0 = (Function0) objP2;
                                boolean zG3 = fetVar.g(function1) | fetVar.g(p6t0Var);
                                Object objP3 = fetVar.P();
                                if (zG3 || objP3 == cl5Var) {
                                    objP3 = new z7(function1, p6t0Var, (byte) 21);
                                    fetVar.o0(objP3);
                                }
                                Function0 function2 = (Function0) objP3;
                                boolean zG4 = fetVar.g(function1) | fetVar.g(p6t0Var);
                                Object objP4 = fetVar.P();
                                if (zG4 || objP4 == cl5Var) {
                                    objP4 = new bi2(function1, p6t0Var, (byte) 6);
                                    fetVar.o0(objP4);
                                }
                                xbc.o(mm40VarN2, b8l0Var, l3l0Var, null, false, function0, function2, null, (Function1) objP4, fetVar, 0, 152);
                                fetVar.r(false);
                            } else {
                                jm40Var = jm40Var3;
                            }
                        }
                        if (z5 && z) {
                            fetVar.e0(-1764591321);
                            zcl zclVar3 = qmk.f28987a;
                            qxw.o(fetVar, i120.Q(o7k0.e(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n));
                            z2 = false;
                            fetVar.r(false);
                        } else {
                            z2 = false;
                            fetVar.e0(-1764399121);
                            fetVar.r(false);
                        }
                        fetVar.r(z2);
                    }
                    fetVar.e0(-1764650097);
                    fetVar.r(false);
                    if (z5) {
                        z2 = false;
                        fetVar.e0(-1764399121);
                        fetVar.r(false);
                    } else {
                        z2 = false;
                        fetVar.e0(-1764399121);
                        fetVar.r(false);
                    }
                    fetVar.r(z2);
                } else {
                    fetVar3.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (fetVar4.g(g9zVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue3);
                    fetVar4.e0(1217871971);
                    z = iIntValue3 == q3d.i(kfl0Var.b);
                    jm40 jm40Var4 = jm40.b;
                    if (p6t0Var2 == null) {
                        fetVar4.e0(1219993703);
                        fetVar4.r(false);
                    } else if (p6t0Var2 instanceof rfl0) {
                        fetVar4.e0(1217923988);
                        nkb.h(s5x0.L(jm40Var4, xfn.a(fetVar4).d, 0.0f, 2), ((rfl0) p6t0Var2).f30394a, kjm.b, null, null, null, fetVar4, 384, 56);
                        fetVar4.r(false);
                    } else if (p6t0Var2 instanceof rer0) {
                        fetVar4.e0(1218241893);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN3 = s5x0.N(jm40Var4, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                        f3n f3nVar2 = ((rer0) p6t0Var2).f30350a;
                        boolean zG5 = fetVar4.g(function1);
                        Object objP5 = fetVar4.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new v6a0(function1, (byte) 28);
                            fetVar4.o0(objP5);
                        }
                        qcc.m(mm40VarN3, f3nVar2, (Function1) objP5, fetVar4, 4);
                        fetVar4.r(false);
                        jm40Var4 = jm40Var4;
                    } else if (p6t0Var2 instanceof gpp) {
                        fetVar4.e0(1218775124);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarN4 = s5x0.N(jm40Var4, xfn.a(fetVar4).d, 0.0f, xfn.a(fetVar4).d, 6.0f, 2);
                        jm40Var4 = jm40Var4;
                        b8l0 b8l0Var2 = ((gpp) p6t0Var2).d;
                        l3l0 l3l0Var2 = new l3l0(16.0f);
                        boolean zG6 = fetVar4.g(function1) | fetVar4.g(p6t0Var2);
                        Object objP6 = fetVar4.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new z7(function1, p6t0Var2, (byte) 24);
                            fetVar4.o0(objP6);
                        }
                        Function0 function3 = (Function0) objP6;
                        boolean zG7 = fetVar4.g(function1) | fetVar4.g(p6t0Var2);
                        Object objP7 = fetVar4.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new z7(function1, p6t0Var2, (byte) 25);
                            fetVar4.o0(objP7);
                        }
                        Function0 function4 = (Function0) objP7;
                        boolean zG8 = fetVar4.g(function1) | fetVar4.g(p6t0Var2);
                        Object objP8 = fetVar4.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new bi2(function1, p6t0Var2, (byte) 8);
                            fetVar4.o0(objP8);
                        }
                        xbc.o(mm40VarN4, b8l0Var2, l3l0Var2, null, false, function3, function4, null, (Function1) objP8, fetVar4, 0, 152);
                        fetVar4.r(false);
                    } else {
                        jm40Var4 = jm40Var4;
                        fetVar4.e0(1219993703);
                        fetVar4.r(false);
                    }
                    if (z5 || !z) {
                        z3 = false;
                        fetVar4.e0(1220244679);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1220052479);
                        zcl zclVar6 = qmk.f28987a;
                        qxw.o(fetVar4, i120.Q(o7k0.e(jm40Var4, 20.0f), ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n));
                        z3 = false;
                        fetVar4.r(false);
                    }
                    fetVar4.r(z3);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar5.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar5.U(i3 & 1, (i3 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) list.get(iIntValue5);
                    fetVar5.e0(997501294);
                    boolean z6 = iIntValue5 == q3d.i(kfl0Var.b);
                    jm40 jm40Var5 = jm40.b;
                    if (p6t0Var3 == null) {
                        fetVar2 = fetVar5;
                        jm40Var2 = jm40Var5;
                    } else {
                        if (p6t0Var3 instanceof rfl0) {
                            fetVar5.e0(997554086);
                            nkb.h(null, ((rfl0) p6t0Var3).f30394a, kjm.b, null, null, null, fetVar5, 384, 57);
                            fetVar2 = fetVar5;
                            fetVar2.r(false);
                            jm40Var2 = jm40Var5;
                        } else {
                            fetVar2 = fetVar5;
                            if (p6t0Var3 instanceof rer0) {
                                fetVar2.e0(997770125);
                                zcl zclVar7 = qmk.f28987a;
                                mm40 mm40VarN5 = s5x0.N(jm40Var5, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                                jm40Var2 = jm40Var5;
                                f3n f3nVar3 = ((rer0) p6t0Var3).f30350a;
                                boolean zG9 = fetVar2.g(function1);
                                Object objP9 = fetVar2.P();
                                if (zG9 || objP9 == cl5Var) {
                                    objP9 = new v6a0(function1, (byte) 29);
                                    fetVar2.o0(objP9);
                                }
                                qcc.m(mm40VarN5, f3nVar3, (Function1) objP9, fetVar2, 4);
                                fetVar2.r(false);
                            } else {
                                jm40Var2 = jm40Var5;
                                if (p6t0Var3 instanceof gpp) {
                                    fetVar2.e0(998281997);
                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                    int iHashCode = Long.hashCode(fetVar2.T);
                                    bh90 bh90VarM = fetVar2.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
                                    mkd.c0.getClass();
                                    fetVar2.i0();
                                    if (fetVar2.S) {
                                        fetVar2.l(e7z.u1);
                                    } else {
                                        fetVar2.r0();
                                    }
                                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                                    jpm0.n(fetVar2);
                                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                                    mm40 mm40VarL = s5x0.L(jm40Var2, xfn.a(fetVar2).b, 0.0f, 2);
                                    b8l0 b8l0Var3 = ((gpp) p6t0Var3).d;
                                    boolean zG10 = fetVar2.g(function1) | fetVar2.g(p6t0Var3);
                                    Object objP10 = fetVar2.P();
                                    if (zG10 || objP10 == cl5Var) {
                                        objP10 = new z7(function1, p6t0Var3, (byte) 26);
                                        fetVar2.o0(objP10);
                                    }
                                    Function0 function5 = (Function0) objP10;
                                    boolean zG11 = fetVar2.g(function1) | fetVar2.g(p6t0Var3);
                                    Object objP11 = fetVar2.P();
                                    if (zG11 || objP11 == cl5Var) {
                                        objP11 = new z7(function1, p6t0Var3, (byte) 27);
                                        fetVar2.o0(objP11);
                                    }
                                    Function0 function6 = (Function0) objP11;
                                    boolean zG12 = fetVar2.g(function1) | fetVar2.g(p6t0Var3);
                                    Object objP12 = fetVar2.P();
                                    if (zG12 || objP12 == cl5Var) {
                                        objP12 = new bi2(function1, p6t0Var3, (byte) 9);
                                        fetVar2.o0(objP12);
                                    }
                                    xbc.o(mm40VarL, b8l0Var3, null, null, false, function5, function6, null, (Function1) objP12, fetVar2, 0, 156);
                                    fetVar2.r(true);
                                    mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                                    fetVar2.r(false);
                                }
                            }
                        }
                        if (z5 && z6) {
                            fetVar2.e0(999555911);
                            zcl zclVar8 = qmk.f28987a;
                            qxw.o(fetVar2, i120.Q(o7k0.e(jm40Var2, 20.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n));
                            z4 = false;
                            fetVar2.r(false);
                        } else {
                            z4 = false;
                            fetVar2.e0(999748111);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z4);
                    }
                    fetVar2.e0(999497135);
                    fetVar2.r(false);
                    if (z5) {
                        z4 = false;
                        fetVar2.e0(999748111);
                        fetVar2.r(false);
                    } else {
                        z4 = false;
                        fetVar2.e0(999748111);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z4);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
