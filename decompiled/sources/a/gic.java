package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class gic implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11338a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ gic(List list, a4x a4xVar, Function1 function1, byte b) {
        this.f11338a = b;
        this.b = list;
        this.c = a4xVar;
        this.d = function1;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0313  */
    /* JADX WARN: Code duplicated, block: B:174:0x047f  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        wui0 wui0Var;
        int i5;
        float f2;
        float f3;
        int i6;
        float f4;
        int i7;
        wui0 wui0Var2;
        byte b = this.f11338a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        float f5 = 0.0f;
        Function1 function1 = this.d;
        List list = this.b;
        a4x a4xVar = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    twm0 twm0Var = (twm0) list.get(iIntValue);
                    fetVar.e0(2066929962);
                    long j = twm0Var.f34658a;
                    String str = twm0Var.b;
                    boolean z = twm0Var.c;
                    boolean zF = fetVar.f(j) | fetVar.g(str) | fetVar.h(z);
                    Object objP = fetVar.P();
                    if (zF || objP == cl5Var) {
                        objP = new kvl(Long.valueOf(twm0Var.f34658a), new tui0(str, null), null, new nvi0(z), null, 500);
                        fetVar.o0(objP);
                    }
                    kvl kvlVar = (kvl) objP;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                    boolean zG = fetVar.g(function1) | fetVar.i(twm0Var);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new fic(function1, twm0Var, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    Function1 function2 = (Function1) objP2;
                    boolean zG2 = fetVar.g(function1) | fetVar.i(twm0Var);
                    Object objP3 = fetVar.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new fic(function1, twm0Var, (byte) 1);
                        fetVar.o0(objP3);
                    }
                    dub.x(mm40VarL, kvlVar, function2, (Function1) objP3, fetVar, 0, 4);
                    if (iIntValue != q3d.i(a4xVar)) {
                        fetVar.e0(2067358567);
                        vtb.t(null, qqm.f29173a, null, 0L, fetVar, 48, 13);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2067482536);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    q2k0 q2k0Var = (q2k0) list.get(iIntValue3);
                    fetVar2.e0(349373703);
                    boolean z2 = a4xVar.size() == 1;
                    boolean z3 = iIntValue3 == a4xVar.size() - 1;
                    mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, xfn.a(fetVar2).d, 0.0f, 2), 1.0f);
                    rqm rqmVar = q2k0Var.b;
                    boolean z4 = (z2 || z3) ? false : true;
                    boolean zG3 = fetVar2.g(function1) | fetVar2.i(q2k0Var);
                    Object objP4 = fetVar2.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new ha30(function1, q2k0Var, (byte) 5);
                        fetVar2.o0(objP4);
                    }
                    obc.q(mm40VarD, rqmVar, z4, null, (Function0) objP4, null, null, null, fetVar2, 0, 232);
                    if (z3) {
                        fetVar2.e0(349834982);
                        zcl zclVar2 = qmk.f28987a;
                        rz4.t(jm40Var, 12.0f, fetVar2, false);
                    } else {
                        fetVar2.e0(349905135);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    cq90 cq90Var = (cq90) list.get(iIntValue5);
                    fetVar3.e0(366548050);
                    if (cq90Var != null) {
                        boolean z5 = cq90Var instanceof aq90;
                        jm40 jm40Var2 = jm40.b;
                        if (z5) {
                            fetVar3.e0(366615133);
                            if (iIntValue5 == 1 && (a4xVar.get(0) instanceof bq90)) {
                                zcl zclVar3 = qmk.f28987a;
                                f = 8.0f;
                            } else {
                                zcl zclVar4 = qmk.f28987a;
                                f = 0.0f;
                            }
                            boolean z6 = CollectionsKt.W(iIntValue5 + 1, a4xVar) instanceof aq90;
                            mm40 mm40VarN = s5x0.N(jm40Var2, 4.0f, f, 4.0f, 0.0f, 8);
                            rqm rqmVar2 = ((aq90) cq90Var).b;
                            boolean zG4 = fetVar3.g(function1) | fetVar3.g(cq90Var);
                            Object objP5 = fetVar3.P();
                            if (zG4 || objP5 == cl5Var) {
                                objP5 = new de40(function1, cq90Var, (byte) 0);
                                fetVar3.o0(objP5);
                            }
                            Function0 function0 = (Function0) objP5;
                            boolean zG5 = fetVar3.g(function1) | fetVar3.g(cq90Var);
                            Object objP6 = fetVar3.P();
                            if (zG5 || objP6 == cl5Var) {
                                objP6 = new de40(function1, cq90Var, (byte) 1);
                                fetVar3.o0(objP6);
                            }
                            obc.q(mm40VarN, rqmVar2, false, null, function0, null, (Function0) objP6, null, fetVar3, 0, 172);
                            if (z6) {
                                fetVar3.e0(367412205);
                                mm40 mm40VarE = o7k0.e(s5x0.L(o7k0.d(jm40Var2, 1.0f), 16.0f, 0.0f, 2), 1.0f);
                                pz40 pz40Var = s6t0.f31722a;
                                zq8.a(0, fetVar3, i120.Q(mm40VarE, s6t0.b().f33626a.getSeparator60(), jd8.n));
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(367773541);
                                fetVar3.r(false);
                            }
                            fetVar3.r(false);
                        } else if (cq90Var instanceof bq90) {
                            fetVar3.e0(-1650701585);
                            zcl zclVar5 = qmk.f28987a;
                            q8x.m(s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), (bq90) cq90Var, fetVar3, 0);
                            fetVar3.r(false);
                        }
                        fetVar3.r(false);
                    }
                    throw b1j.f(-1650743855, fetVar3, false);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    nz30 nz30Var = (nz30) list.get(iIntValue7);
                    fetVar4.e0(-806514524);
                    if (iIntValue7 == 0 && a4xVar.size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (iIntValue7 == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = iIntValue7 == q3d.i(a4xVar) ? wui0.d : wui0.c;
                    }
                    rq8.q(null, nz30Var, wui0Var, this.d, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue9);
                    fetVar5.e0(-517375273);
                    if (p6t0Var == null) {
                        fetVar5.e0(-515173623);
                        fetVar5.r(false);
                    } else {
                        boolean z7 = p6t0Var instanceof t3q;
                        jm40 jm40Var3 = jm40.b;
                        if (z7) {
                            fetVar5.e0(1091689507);
                            int i8 = iIntValue9 + 1;
                            if ((CollectionsKt.W(i8, a4xVar) instanceof i3q) || (CollectionsKt.W(i8, a4xVar) instanceof b3q)) {
                                zcl zclVar6 = qmk.f28987a;
                                f3 = 0.0f;
                            } else {
                                zcl zclVar7 = qmk.f28987a;
                                f3 = 6.0f;
                            }
                            jpm0.e(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, f3, 7), (t3q) p6t0Var, function1, fetVar5, 0);
                            fetVar5.r(false);
                        } else if (p6t0Var instanceof i3q) {
                            fetVar5.e0(1091710666);
                            zcl zclVar8 = qmk.f28987a;
                            nkb.h(s5x0.N(jm40Var3, 12.0f, iIntValue9 == 0 ? 0.0f : 12.0f, 0.0f, 0.0f, 12), new hjm(((i3q) p6t0Var).f14108a, null, new y3d(((ThemeColors) fetVar5.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar5, 384, 56);
                            fetVar5.r(false);
                        } else if (p6t0Var instanceof b3q) {
                            fetVar5.e0(-516148635);
                            int i9 = iIntValue9 + 1;
                            if (CollectionsKt.W(i9, a4xVar) instanceof t3q) {
                                zcl zclVar9 = qmk.f28987a;
                                f2 = 6.0f;
                            } else {
                                zcl zclVar10 = qmk.f28987a;
                                f2 = 0.0f;
                            }
                            knm0.c(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, f2, 7), ((CollectionsKt.W(i9, a4xVar) instanceof i3q) || (CollectionsKt.W(i9, a4xVar) instanceof t3q) || a4xVar.size() - 1 == iIntValue9) ? new k3l0() : j3l0.f15840a, (b3q) p6t0Var, this.d, fetVar5, 0);
                            fetVar5.r(false);
                        } else {
                            fetVar5.e0(-515173623);
                            fetVar5.r(false);
                        }
                    }
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar6.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue11);
                    fetVar6.e0(-619331656);
                    if (p6t0Var2 == null) {
                        fetVar6.e0(-616896483);
                        fetVar6.r(false);
                    } else {
                        boolean z8 = p6t0Var2 instanceof u2p0;
                        jm40 jm40Var4 = jm40.b;
                        if (z8) {
                            fetVar6.e0(-435619910);
                            zcl zclVar11 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(jm40Var4, 8.0f, 12.0f, 8.0f, 0.0f, 8);
                            jjm jjmVar = ((u2p0) p6t0Var2).b;
                            kjm kjmVar = kjm.f18392a;
                            boolean zG6 = fetVar6.g(p6t0Var2) | fetVar6.g(function1);
                            Object objP7 = fetVar6.P();
                            if (zG6 || objP7 == cl5Var) {
                                objP7 = new y2p0(p6t0Var2, function1);
                                fetVar6.o0(objP7);
                            }
                            nkb.h(mm40VarN2, jjmVar, kjmVar, null, (Function0) objP7, null, fetVar6, 384, 40);
                            fetVar6.r(false);
                        } else if (p6t0Var2 instanceof b3p0) {
                            fetVar6.e0(-435596315);
                            v2n0.e(0, fetVar6, null);
                            fetVar6.r(false);
                        } else if (p6t0Var2 instanceof w2p0) {
                            fetVar6.e0(-435591231);
                            aad.D(null, ((w2p0) p6t0Var2).f38462a, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (p6t0Var2 instanceof a3p0) {
                            fetVar6.e0(-435586127);
                            zcl zclVar12 = qmk.f28987a;
                            pym0.d(s5x0.N(jm40Var4, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((a3p0) p6t0Var2).f183a, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (p6t0Var2 instanceof p2p0) {
                            fetVar6.e0(-435578874);
                            obc.q(null, ((p2p0) p6t0Var2).b, false, null, null, null, null, null, fetVar6, 0, 253);
                            fetVar6.r(false);
                        } else if (p6t0Var2 instanceof o2p0) {
                            fetVar6.e0(-435575575);
                            rqm rqmVar3 = ((o2p0) p6t0Var2).b;
                            boolean zG7 = fetVar6.g(function1) | fetVar6.g(p6t0Var2);
                            Object objP8 = fetVar6.P();
                            if (zG7 || objP8 == cl5Var) {
                                objP8 = new y2p0(function1, p6t0Var2);
                                fetVar6.o0(objP8);
                            }
                            obc.q(null, rqmVar3, false, null, (Function0) objP8, null, null, null, fetVar6, 0, 237);
                            fetVar6.r(false);
                        } else if (p6t0Var2 instanceof v2p0) {
                            fetVar6.e0(-435564876);
                            if (CollectionsKt.W(iIntValue11 - 1, a4xVar) instanceof u2p0) {
                                zcl zclVar13 = qmk.f28987a;
                                f4 = 0.0f;
                            } else {
                                zcl zclVar14 = qmk.f28987a;
                                f4 = 8.0f;
                            }
                            mm40 mm40VarN3 = s5x0.N(jm40Var4, 0.0f, f4, 0.0f, 0.0f, 13);
                            v2p0 v2p0Var = (v2p0) p6t0Var2;
                            mim0 mim0Var = v2p0Var.b;
                            boolean z9 = v2p0Var.c;
                            boolean zG8 = fetVar6.g(function1) | fetVar6.g(p6t0Var2);
                            Object objP9 = fetVar6.P();
                            if (zG8 || objP9 == cl5Var) {
                                objP9 = new bi2(function1, p6t0Var2, (byte) 10);
                                fetVar6.o0(objP9);
                            }
                            lgb.n(mm40VarN3, mim0Var, z9, (Function1) objP9, fetVar6, 0);
                            fetVar6.r(false);
                        } else {
                            fetVar6.e0(-616896483);
                            fetVar6.r(false);
                        }
                    }
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar7.g(g9zVar7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar7.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar7.U(i7 & 1, (i7 & 147) != 146)) {
                    etp0 etp0Var = (etp0) list.get(iIntValue13);
                    fetVar7.e0(651507828);
                    float f6 = xfn.a(fetVar7).d;
                    float f7 = xfn.a(fetVar7).d;
                    if (iIntValue13 == q3d.i(a4xVar)) {
                        zcl zclVar15 = qmk.f28987a;
                        f5 = 28.0f;
                    } else {
                        zcl zclVar16 = qmk.f28987a;
                    }
                    mm40 mm40VarN4 = s5x0.N(jm40.b, f6, 0.0f, f7, f5, 2);
                    Integer numValueOf = Integer.valueOf(etp0Var.b.f4951a);
                    m0x m0xVar = new m0x(etp0Var.b.f4951a, null, 6);
                    pz40 pz40Var2 = s6t0.f31722a;
                    nui0 nui0Var = new nui0(numValueOf, null, m0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242);
                    tui0 tui0Var = new tui0(etp0Var.f8387a, null);
                    if (iIntValue13 == 0 && a4xVar.size() == 1) {
                        wui0Var2 = wui0.f39793a;
                    } else if (iIntValue13 == 0) {
                        wui0Var2 = wui0.b;
                    } else {
                        wui0Var2 = iIntValue13 == a4xVar.size() - 1 ? wui0.d : wui0.c;
                    }
                    rqm rqmVar4 = new rqm((vui0) tui0Var, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) null, wui0Var2, false, (e900) null, 444);
                    boolean zG9 = fetVar7.g(function1) | fetVar7.g(etp0Var);
                    Object objP10 = fetVar7.P();
                    if (zG9 || objP10 == cl5Var) {
                        objP10 = new ywm0(function1, etp0Var, (byte) 11);
                        fetVar7.o0(objP10);
                    }
                    obc.q(mm40VarN4, rqmVar4, false, null, (Function0) objP10, null, null, null, fetVar7, 0, 236);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gic(List list, Function1 function1, a4x a4xVar, byte b) {
        this.f11338a = b;
        this.b = list;
        this.d = function1;
        this.c = a4xVar;
    }
}
