package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class vfe implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37326a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;

    public vfe(a4x a4xVar, boolean z, qdz qdzVar, Function1 function1) {
        this.f37326a = (byte) 4;
        this.b = a4xVar;
        this.c = z;
        this.e = qdzVar;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        int i3;
        fet fetVar2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        boolean z5;
        int i4;
        fet fetVar3;
        int i5;
        fet fetVar4;
        int i6;
        int i7;
        jm40 jm40Var;
        byte b = this.f37326a;
        jm40 jm40Var2 = jm40.b;
        float f2 = 0.0f;
        cl5 cl5Var = ukd.f35823a;
        boolean z6 = this.c;
        Function1 function1 = this.d;
        List list = this.b;
        byte b2 = 16;
        boolean zD = true;
        char c = 1;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                zdz zdzVar = (zdz) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar5.g(zdzVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar5.e(iIntValue) ? (byte) 32 : (byte) 16;
                }
                if (fetVar5.U(i & 1, (i & 147) != 146)) {
                    nz30 nz30Var = (nz30) list.get(iIntValue);
                    fetVar5.e0(1642456681);
                    int size = ((List) obj5).size() - 1;
                    mm40 mm40VarN = jm40.b;
                    if (iIntValue == size && z6) {
                        zcl zclVar = qmk.f28987a;
                        mm40VarN = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    }
                    dtb.o(nz30Var, this.d, mm40VarN, fetVar5, 0, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 1:
                u3n u3nVar = (u3n) obj5;
                g9z g9zVar = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar6.g(g9zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar6.e(iIntValue3) ? (byte) 32 : (byte) 16;
                }
                if (fetVar6.U(i2 & 1, (i2 & 147) != 146)) {
                    vim vimVar = (vim) list.get(iIntValue3);
                    fetVar6.e0(-1435147850);
                    if (vimVar != null) {
                        if (vimVar instanceof uim) {
                            fetVar6.e0(-1435109504);
                            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            ewm0.h(0, u3nVar, fetVar6, s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((uim) vimVar).f35738a);
                            fetVar6.r(false);
                            fetVar = fetVar6;
                        } else if (vimVar instanceof tim) {
                            fetVar6.e0(-1434702381);
                            if (z6) {
                                fetVar6.e0(-1434184681);
                                fetVar = fetVar6;
                                zsm0.e(null, (tim) vimVar, u3nVar, this.d, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                fetVar6.e0(-1434676899);
                                obc.d(bmd.n.a(k6z.f17794a), u1c.M(323138737, new xrk(vimVar, u3nVar, function1, c == true ? 1 : 0), fetVar6), fetVar6, 56);
                                fetVar6.r(false);
                                fetVar = fetVar6;
                            }
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    }
                    throw b1j.f(1062083565, fetVar6, false);
                }
                fetVar6.X();
                return Unit.f46060a;
            case 2:
                k8z k8zVar = (k8z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar7.g(k8zVar) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar7.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar7.U(i3 & 1, (i3 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue5);
                    fetVar7.e0(-559432254);
                    if (p6t0Var == null) {
                        fetVar2 = fetVar7;
                    } else {
                        boolean z7 = p6t0Var instanceof w360;
                        jm40 jm40Var3 = jm40.b;
                        if (z7) {
                            fetVar7.e0(-1264978234);
                            zcl zclVar3 = qmk.f28987a;
                            jcb.l(s5x0.K(jm40Var3, xfn.a(fetVar7).e, 16.0f), ((w360) p6t0Var).f38487a, true, null, fetVar7, 384, 8);
                            fetVar2 = fetVar7;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar7;
                            if (p6t0Var instanceof gdp) {
                                fetVar2.e0(-1264966496);
                                a4x a4xVar = ((gdp) p6t0Var).c;
                                if (a4xVar == null || !a4xVar.isEmpty()) {
                                    Iterator<E> it = a4xVar.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z5 = false;
                                        } else if (((fdp) it.next()) instanceof ddp) {
                                            z5 = true;
                                        }
                                    }
                                } else {
                                    z5 = false;
                                }
                                nia0.C(0, fetVar2, a4xVar, (bdz) obj5, null, this.d, z5);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof mbo) {
                                fetVar2.e0(-1264954928);
                                zcl zclVar4 = qmk.f28987a;
                                mbo mboVar = (mbo) p6t0Var;
                                if (mboVar.b) {
                                    fetVar2.e0(-558767812);
                                    fetVar2.r(false);
                                    z4 = true;
                                } else {
                                    fetVar2.e0(-1264950317);
                                    z4 = !pkd.d(fetVar2);
                                    fetVar2.r(false);
                                }
                                if (z4) {
                                    fetVar2.e0(-1264949410);
                                    float f3 = qmk.a(fetVar2).c;
                                    fetVar2.r(false);
                                    f = f3;
                                } else {
                                    fetVar2.e0(-1264948306);
                                    fetVar2.r(false);
                                    f = 0.0f;
                                }
                                if (mboVar.c) {
                                    fetVar2.e0(-558643874);
                                } else {
                                    fetVar2.e0(-1264946381);
                                    zD = true ^ pkd.d(fetVar2);
                                }
                                fetVar2.r(false);
                                if (zD) {
                                    fetVar2.e0(-1264945474);
                                    f2 = qmk.a(fetVar2).c;
                                } else {
                                    fetVar2.e0(-1264944370);
                                }
                                fetVar2.r(false);
                                mm40 mm40VarN2 = s5x0.N(jm40Var3, f, 0.0f, f2, 8.0f, 2);
                                a2n a2nVar = mboVar.f21519a;
                                boolean zG = fetVar2.g(function1);
                                Object objP = fetVar2.P();
                                if (zG || objP == cl5Var) {
                                    objP = new w8v(function1, (byte) 13);
                                    fetVar2.o0(objP);
                                }
                                nia0.x(mm40VarN2, a2nVar, this.c, (Function1) objP, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof rt0) {
                                fetVar2.e0(-558205461);
                                ckb.f(null, ((rt0) p6t0Var).b, null, s5x0.t(xfn.a(fetVar2).d, 0.0f, 2), null, null, null, null, fetVar2, 0, 245);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof flw) {
                                fetVar2.e0(-557832810);
                                a4x a4xVar2 = ((flw) p6t0Var).b;
                                if (a4xVar2 == null || !a4xVar2.isEmpty()) {
                                    Iterator<E> it2 = a4xVar2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z3 = false;
                                        } else if (((a2n) it2.next()) instanceof x56) {
                                            z3 = true;
                                        }
                                    }
                                } else {
                                    z3 = false;
                                }
                                nia0.B(null, z3, a4xVar2, (bdz) obj5, this.c, this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof nlw) {
                                fetVar2.e0(-557387433);
                                a4x a4xVar3 = ((nlw) p6t0Var).b;
                                if (a4xVar3 == null || !a4xVar3.isEmpty()) {
                                    Iterator<E> it3 = a4xVar3.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z2 = false;
                                        } else if (((tdp) it3.next()) instanceof rdp) {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    z2 = false;
                                }
                                nia0.F(0, fetVar2, a4xVar3, (bdz) obj5, null, this.d, z2);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof llw) {
                                fetVar2.e0(-556995097);
                                nia0.D(0, fetVar2, ((llw) p6t0Var).b, (bdz) obj5, null, this.d);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof mlw) {
                                fetVar2.e0(-556693219);
                                nia0.E(0, fetVar2, ((mlw) p6t0Var).b, null);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof sfp) {
                                fetVar2.e0(-556535429);
                                uzb.x(null, ((sfp) p6t0Var).b, s5x0.t(xfn.a(fetVar2).c, 0.0f, 2), null, null, null, fetVar2, 0, 121);
                                fetVar2.r(false);
                            } else if (p6t0Var instanceof n5p) {
                                fetVar2.e0(-556147061);
                                a4x a4xVar4 = ((n5p) p6t0Var).c;
                                if (a4xVar4 == null || !a4xVar4.isEmpty()) {
                                    Iterator<E> it4 = a4xVar4.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z = false;
                                        } else if (((jlb) it4.next()) instanceof ilb) {
                                            z = true;
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                nia0.q(0, fetVar2, a4xVar4, (bdz) obj5, null, this.d, z);
                                fetVar2.r(false);
                            } else {
                                byte b3 = 15;
                                if (p6t0Var instanceof nt0) {
                                    fetVar2.e0(-555722702);
                                    zll zllVar = ((nt0) p6t0Var).c;
                                    lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).d, 0.0f, 2);
                                    boolean zG2 = fetVar2.g(function1);
                                    Object objP2 = fetVar2.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new w8v(function1, (byte) 14);
                                        fetVar2.o0(objP2);
                                    }
                                    Function1 function2 = (Function1) objP2;
                                    boolean zG3 = fetVar2.g(function1);
                                    Object objP3 = fetVar2.P();
                                    if (zG3 || objP3 == cl5Var) {
                                        objP3 = new w8v(function1, b3);
                                        fetVar2.o0(objP3);
                                    }
                                    Function1 function3 = (Function1) objP3;
                                    boolean zG4 = fetVar2.g(function1);
                                    Object objP4 = fetVar2.P();
                                    if (zG4 || objP4 == cl5Var) {
                                        objP4 = new w8v(function1, b2);
                                        fetVar2.o0(objP4);
                                    }
                                    ckb.f(null, zllVar, null, lh80VarT, null, function2, function3, (Function1) objP4, fetVar2, 0, 21);
                                    fetVar2.r(false);
                                } else if (p6t0Var instanceof rfp) {
                                    fetVar2.e0(-554569192);
                                    xcz xczVarB = ((bdz) obj5).b("FAVORITES_GAMES_STATE", fetVar2);
                                    lh80 lh80VarT2 = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
                                    ftr ftrVar = ((rfp) p6t0Var).c;
                                    boolean zG5 = fetVar2.g(function1);
                                    Object objP5 = fetVar2.P();
                                    if (zG5 || objP5 == cl5Var) {
                                        objP5 = new hrk(function1, (byte) 7);
                                        fetVar2.o0(objP5);
                                    }
                                    Function2 function4 = (Function2) objP5;
                                    boolean zG6 = fetVar2.g(function1);
                                    Object objP6 = fetVar2.P();
                                    if (zG6 || objP6 == cl5Var) {
                                        objP6 = new w8v(function1, (byte) 12);
                                        fetVar2.o0(objP6);
                                    }
                                    uzb.x(null, ftrVar, lh80VarT2, xczVarB, function4, (Function1) objP6, fetVar2, 0, 65);
                                    fetVar2.r(false);
                                } else if (p6t0Var instanceof a460) {
                                    fetVar2.e0(-1264733009);
                                    zcl zclVar5 = qmk.f28987a;
                                    mm40 mm40VarN3 = s5x0.N(jm40Var3, xfn.a(fetVar2).e, 8.0f, xfn.a(fetVar2).e, 0.0f, 8);
                                    jjm jjmVar = ((a460) p6t0Var).f209a;
                                    kjm kjmVar = kjm.f18392a;
                                    boolean zG7 = fetVar2.g(function1) | fetVar2.g(p6t0Var);
                                    Object objP7 = fetVar2.P();
                                    if (zG7 || objP7 == cl5Var) {
                                        objP7 = new z7(function1, p6t0Var, b3);
                                        fetVar2.o0(objP7);
                                    }
                                    nkb.h(mm40VarN3, jjmVar, kjmVar, null, (Function0) objP7, null, fetVar2, 384, 40);
                                    fetVar2.r(false);
                                }
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(-551474214);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                qgv0 qgv0Var = (qgv0) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar8.g(g9zVar2) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar8.e(iIntValue7) ? (byte) 32 : (byte) 16;
                }
                if (fetVar8.U(i4 & 1, (i4 & 147) != 146)) {
                    o8w o8wVar = (o8w) ((ArrayList) list).get(iIntValue7);
                    fetVar8.e0(-1971806916);
                    if (iIntValue7 != 1 || qgv0Var == null) {
                        fetVar3 = fetVar8;
                        fetVar3.e0(-1970217795);
                        fetVar3.r(false);
                    } else {
                        fetVar8.e0(-1971742034);
                        zcl zclVar6 = qmk.f28987a;
                        mm40 mm40VarN4 = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 2.0f, 5);
                        String str = qgv0Var.b;
                        pz40 pz40Var = s6t0.f31722a;
                        StaticColors staticColors = StaticColors.INSTANCE;
                        gy30 gy30Var = new gy30(new ux30(staticColors.m123getWhite0d7_KjU(), staticColors.m131getWhite800d7_KjU(), str, qgv0Var.c), null, new zx30(new n0x(qgv0Var.d), 3), qgv0Var.e, null, null, 242);
                        boolean zG8 = fetVar8.g(function1) | fetVar8.g(qgv0Var);
                        Object objP8 = fetVar8.P();
                        if (zG8 || objP8 == cl5Var) {
                            objP8 = new n57(function1, qgv0Var, (byte) 2);
                            fetVar8.o0(objP8);
                        }
                        jiq0.y(mm40VarN4, gy30Var, (Function0) objP8, null, null, fetVar8, 0, 24);
                        fetVar3 = fetVar8;
                        fetVar3.r(false);
                    }
                    if (o8wVar instanceof fak0) {
                        fetVar3.e0(-1970080093);
                        x8x.j(null, (fak0) o8wVar, this.c, this.d, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-1969683107);
                        fetVar3.r(false);
                    }
                    fetVar3.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar9.g(g9zVar3) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar9.e(iIntValue9) ? (byte) 32 : (byte) 16;
                }
                if (fetVar9.U(i5 & 1, (i5 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) ((a4x) list).get(iIntValue9);
                    fetVar9.e0(1670225030);
                    if (p6t0Var2 == null) {
                        fetVar4 = fetVar9;
                    } else {
                        if (p6t0Var2 instanceof jx80) {
                            fetVar9.e0(1670273606);
                            mm40 mm40VarE0 = o2e.e0(jm40Var2, "PARTNER_INFO");
                            jx80 jx80Var = (jx80) p6t0Var2;
                            qdz qdzVar = (qdz) obj5;
                            boolean zG9 = fetVar9.g(function1);
                            Object objP9 = fetVar9.P();
                            if (zG9 || objP9 == cl5Var) {
                                objP9 = new w8v(function1, (byte) 25);
                                fetVar9.o0(objP9);
                            }
                            Function1 function5 = (Function1) objP9;
                            boolean zG10 = fetVar9.g(function1);
                            Object objP10 = fetVar9.P();
                            if (zG10 || objP10 == cl5Var) {
                                objP10 = new w8v(function1, (byte) 26);
                                fetVar9.o0(objP10);
                            }
                            Function1 function6 = (Function1) objP10;
                            boolean zG11 = fetVar9.g(function1);
                            Object objP11 = fetVar9.P();
                            if (zG11 || objP11 == cl5Var) {
                                objP11 = new hrk(function1, (byte) 9);
                                fetVar9.o0(objP11);
                            }
                            w9x.k(mm40VarE0, jx80Var, this.c, qdzVar, function5, function6, (Function2) objP11, fetVar9, 6);
                            fetVar4 = fetVar9;
                            fetVar4.r(false);
                        } else {
                            fetVar4 = fetVar9;
                            if (p6t0Var2 instanceof nx80) {
                                fetVar4.e0(1671289383);
                                kcx.m(6, fetVar4, o7k0.d(jm40Var2, 1.0f));
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(false);
                    }
                    fetVar4.e0(1671379190);
                    fetVar4.r(false);
                    fetVar4.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar10.g(g9zVar4) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar10.e(iIntValue11) ? (byte) 32 : (byte) 16;
                }
                if (fetVar10.U(i6 & 1, (i6 & 147) != 146)) {
                    ka00 ka00Var = (ka00) list.get(iIntValue11);
                    fetVar10.e0(-1316942238);
                    if (ka00Var != null) {
                        if (ka00Var instanceof ja00) {
                            fetVar10.e0(788803662);
                            b8k0.o(((ja00) ka00Var).f16165a, fetVar10, 0);
                            fetVar10.r(false);
                        } else if (ka00Var instanceof ia00) {
                            fetVar10.e0(-1316790959);
                            obc.d(bmd.n.a((k6z) obj5), u1c.M(124258444, new oga0(ka00Var, z6, function1), fetVar10), fetVar10, 56);
                            fetVar10.r(false);
                        }
                        fetVar10.r(false);
                    }
                    throw b1j.f(788801985, fetVar10, false);
                }
                fetVar10.X();
                return Unit.f46060a;
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                a4x a4xVar5 = (a4x) obj5;
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar11.g(g9zVar5) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar11.e(iIntValue13) ? (byte) 32 : (byte) 16;
                }
                if (fetVar11.U(i7 & 1, (i7 & 147) != 146)) {
                    era0 era0Var = (era0) list.get(iIntValue13);
                    fetVar11.e0(-1089543732);
                    era0 era0Var2 = (era0) CollectionsKt.W(iIntValue13 - 1, a4xVar5);
                    era0 era0Var3 = (era0) CollectionsKt.W(iIntValue13 + 1, a4xVar5);
                    boolean z8 = era0Var2 instanceof bra0;
                    boolean z9 = era0Var3 == null || (era0Var3 instanceof bra0);
                    boolean z10 = (era0Var instanceof dra0) && !(era0Var3 instanceof dra0);
                    if (era0Var != null) {
                        boolean z11 = era0Var instanceof bra0;
                        jm40 jm40Var4 = jm40.b;
                        if (z11) {
                            fetVar11.e0(-1004962837);
                            zcl zclVar7 = qmk.f28987a;
                            jm40Var = jm40Var4;
                            y860.I(s5x0.N(jm40Var4, 0.0f, iIntValue13 > 0 ? 12.0f : 0.0f, 0.0f, 0.0f, 13), (bra0) era0Var, fetVar11, 0);
                            fetVar11.r(false);
                        } else {
                            jm40Var = jm40Var4;
                            if (era0Var instanceof cra0) {
                                fetVar11.e0(-1004954081);
                                y860.L((cra0) era0Var, z8, z9, this.d, fetVar11, 0);
                                fetVar11.r(false);
                            } else {
                                boolean z12 = z9;
                                boolean z13 = z10;
                                if (era0Var instanceof ara0) {
                                    fetVar11.e0(-1004945730);
                                    y860.J((ara0) era0Var, z8, z12, this.d, fetVar11, 0);
                                    fetVar11.r(false);
                                } else if (era0Var instanceof dra0) {
                                    fetVar11.e0(-1088290651);
                                    y860.M((dra0) era0Var, z12, z13, this.d, fetVar11, 0);
                                    fetVar11.r(false);
                                }
                            }
                        }
                        if (z6 || iIntValue13 != a4xVar5.size() - 1) {
                            fetVar11.e0(-1087813933);
                            fetVar11.r(false);
                        } else {
                            fetVar11.e0(-1088006133);
                            zcl zclVar8 = qmk.f28987a;
                            qxw.o(fetVar11, i120.Q(o7k0.e(jm40Var, 20.0f), ((ThemeColors) fetVar11.k(zaq0.b)).getBackground(), jd8.n));
                            fetVar11.r(false);
                        }
                        fetVar11.r(false);
                    }
                    throw b1j.f(-1004964121, fetVar11, false);
                }
                fetVar11.X();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ vfe(List list, Object obj, Function1 function1, boolean z, byte b) {
        this.f37326a = b;
        this.b = list;
        this.e = obj;
        this.d = function1;
        this.c = z;
    }

    public /* synthetic */ vfe(List list, Object obj, boolean z, Function1 function1, byte b) {
        this.f37326a = b;
        this.b = list;
        this.e = obj;
        this.c = z;
        this.d = function1;
    }
}
