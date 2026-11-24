package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class xy1 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41685a;
    public final /* synthetic */ List b;

    public /* synthetic */ xy1(List list, byte b) {
        this.f41685a = b;
        this.b = list;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            oi40 oi40Var = (oi40) this.b.get(iIntValue);
            fetVar.e0(1719575487);
            bdx.d(oi40Var, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            h3a0 h3a0Var = (h3a0) this.b.get(iIntValue);
            fetVar.e0(90483257);
            x8f.j(h3a0Var, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            n2g0 n2g0Var = (n2g0) this.b.get(iIntValue);
            fetVar.e0(-211050031);
            cjx.A(n2g0Var, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-1554905777);
            if (p6t0Var == null) {
                fetVar.e0(-1554666489);
                fetVar.r(false);
            } else if (p6t0Var instanceof dpc0) {
                fetVar.e0(-1158534993);
                hmw0.b(0, fetVar);
                fetVar.r(false);
            } else if (p6t0Var instanceof rsc0) {
                fetVar.e0(-1158532694);
                hmw0.z(0, fetVar);
                fetVar.r(false);
            } else if (p6t0Var instanceof fuc0) {
                fetVar.e0(-1158530226);
                hmw0.o(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1554666489);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            pud0 pud0Var = (pud0) this.b.get(iIntValue);
            fetVar.e0(-1199406684);
            wb.r(null, pud0Var, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            zrr0 zrr0Var = (zrr0) this.b.get(iIntValue);
            fetVar.e0(970348242);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            pvm0.g(s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13), zrr0Var, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            jhm0 jhm0Var = (jhm0) this.b.get(iIntValue);
            fetVar.e0(887866930);
            hhm0.e(jhm0Var.b, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            dko0 dko0Var = (dko0) this.b.get(iIntValue);
            fetVar.e0(-1493337822);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), 48.0f), obc.O(dko0Var.f6242a, fetVar), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(dko0Var.b, jr8.f16991a.b(s5x0.L(jm40Var, 16.0f, 0.0f, 2), gqw0.d), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110584);
            fetVar.r(true);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        byte b = this.f41685a;
        jm40 jm40Var = jm40.b;
        List list = this.b;
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
                    ry1 ry1Var = (ry1) list.get(iIntValue);
                    fetVar.e0(-1351799493);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f = xfn.a(fetVar).c;
                    zcl zclVar = qmk.f28987a;
                    gsl.a(s5x0.N(mm40VarD, f, 8.0f, xfn.a(fetVar).c, 0.0f, 8), ry1Var, null, null, null, fetVar, 0, 28);
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
                    tea teaVar = (tea) list.get(iIntValue3);
                    fetVar2.e0(177851436);
                    if (Intrinsics.d(teaVar, new tea(R.drawable.transparent, R.drawable.transparent, StaticColors.INSTANCE.m123getWhite0d7_KjU(), "", ""))) {
                        fetVar2.e0(5739200);
                        fre0.m(0, fetVar2, o2e.e0(jm40Var, "CARD_CRICKET_GAME_PROGRESS_ITEM_" + iIntValue3));
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(178077797);
                        fre0.l(o2e.e0(jm40Var, "CARD_CRICKET_GAME_PROGRESS_ITEM_" + iIntValue3), teaVar, fetVar2, 0);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                k8z k8zVar = (k8z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(k8zVar) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    kc90 kc90Var = (kc90) list.get(iIntValue5);
                    fetVar3.e0(1669058691);
                    kc5.r0(kc90Var, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(k8zVar2) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    oc90 oc90Var = (oc90) list.get(iIntValue7);
                    fetVar4.e0(-299602559);
                    j47.c0(oc90Var, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(g9zVar3) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    fuh fuhVar = (fuh) list.get(iIntValue9);
                    fetVar5.e0(1267844164);
                    zcl zclVar2 = qmk.f28987a;
                    xkb.j(s5x0.N(jm40.b, 4.0f, 4.0f, 4.0f, 0.0f, 8), fuhVar, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar6.g(g9zVar4) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    String str = (String) list.get(iIntValue11);
                    fetVar6.e0(-909226498);
                    jjj.c(str, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar7.g(g9zVar5) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar7.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar7.U(i7 & 1, (i7 & 147) != 146)) {
                    xv1 xv1Var = (xv1) list.get(iIntValue13);
                    fetVar7.e0(507449354);
                    unh0.a(xv1Var, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar8.g(g9zVar6) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar8.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar8.U(i8 & 1, (i8 & 147) != 146)) {
                    a4m a4mVar = (a4m) list.get(iIntValue15);
                    fetVar8.e0(-526773601);
                    e4m e4mVar = a4mVar.b;
                    if (e4mVar instanceof c4m) {
                        fetVar8.e0(952840740);
                        jeb.D((c4m) e4mVar, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (e4mVar instanceof d4m) {
                        fetVar8.e0(952843432);
                        jeb.J((d4m) e4mVar, fetVar8, 0);
                        fetVar8.r(false);
                    } else {
                        if (!(e4mVar instanceof b4m)) {
                            throw b1j.f(952838628, fetVar8, false);
                        }
                        fetVar8.e0(952846116);
                        jeb.x((b4m) e4mVar, fetVar8, 0);
                        fetVar8.r(false);
                    }
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar9.g(g9zVar7) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar9.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar9.U(i9 & 1, (i9 & 147) != 146)) {
                    List list2 = (List) list.get(iIntValue17);
                    fetVar9.e0(-592671401);
                    mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
                    x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar9, 6);
                    int iHashCode = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM = fetVar9.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar9, mm40VarC);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(e7z.u1);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, x5dVarA, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar9);
                    Iterator itV = kng0.v(fetVar9, mm40VarC0, gqw0.v, 672606865, list2);
                    while (itV.hasNext()) {
                        oja0.u(null, (b7m) itV.next(), fetVar9, 0);
                    }
                    ohs0.x(fetVar9, false, true, false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar10.g(g9zVar8) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar10.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar10.U(i10 & 1, (i10 & 147) != 146)) {
                    ((Number) list.get(iIntValue19)).intValue();
                    fetVar10.e0(1258011064);
                    sac.o(0, fetVar10);
                    fetVar10.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar11.g(g9zVar9) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar11.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar11.U(i11 & 1, (i11 & 147) != 146)) {
                    String str2 = (String) list.get(iIntValue21);
                    fetVar11.e0(-1584879312);
                    vbc.P(0, fetVar11, null, str2);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (fetVar12.g(g9zVar10) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= fetVar12.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar12.U(i12 & 1, (i12 & 147) != 146)) {
                    String str3 = (String) list.get(iIntValue23);
                    fetVar12.e0(-1265558666);
                    xbc.G(0, fetVar12, null, str3);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                g9z g9zVar11 = (g9z) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (fetVar13.g(g9zVar11) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= fetVar13.e(iIntValue25) ? 32 : 16;
                }
                if (fetVar13.U(i13 & 1, (i13 & 147) != 146)) {
                    String str4 = (String) list.get(iIntValue25);
                    fetVar13.e0(-378054985);
                    qcc.A(0, fetVar13, null, str4);
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                g9z g9zVar12 = (g9z) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue28 = ((Number) obj4).intValue();
                if ((iIntValue28 & 6) == 0) {
                    i14 = iIntValue28 | (fetVar14.g(g9zVar12) ? 4 : 2);
                } else {
                    i14 = iIntValue28;
                }
                if ((iIntValue28 & 48) == 0) {
                    i14 |= fetVar14.e(iIntValue27) ? 32 : 16;
                }
                if (fetVar14.U(i14 & 1, (i14 & 147) != 146)) {
                    String str5 = (String) list.get(iIntValue27);
                    fetVar14.e0(509448696);
                    vcc.u(0, fetVar14, null, str5);
                    fetVar14.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                g9z g9zVar13 = (g9z) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue30 = ((Number) obj4).intValue();
                if ((iIntValue30 & 6) == 0) {
                    i15 = iIntValue30 | (fetVar15.g(g9zVar13) ? 4 : 2);
                } else {
                    i15 = iIntValue30;
                }
                if ((iIntValue30 & 48) == 0) {
                    i15 |= fetVar15.e(iIntValue29) ? 32 : 16;
                }
                if (fetVar15.U(i15 & 1, (i15 & 147) != 146)) {
                    ztp ztpVar = (ztp) list.get(iIntValue29);
                    fetVar15.e0(1819654244);
                    if (ztpVar != null) {
                        if (ztpVar instanceof xtp) {
                            fetVar15.e0(-911129290);
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar3 = qmk.f28987a;
                            wvb.v(0, fetVar15, s5x0.N(mm40VarD2, 0.0f, 16.0f, 0.0f, 0.0f, 13), ((xtp) ztpVar).f41473a);
                            fetVar15.r(false);
                        } else if (ztpVar instanceof ytp) {
                            fetVar15.e0(-911117412);
                            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar4 = qmk.f28987a;
                            wvb.w(s5x0.N(mm40VarD3, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ytp) ztpVar, fetVar15, 0);
                            fetVar15.r(false);
                        }
                        fetVar15.r(false);
                    }
                    throw b1j.f(-911132801, fetVar15, false);
                }
                fetVar15.X();
                return Unit.f46060a;
            case 15:
                g9z g9zVar14 = (g9z) obj;
                int iIntValue31 = ((Number) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue32 = ((Number) obj4).intValue();
                if ((iIntValue32 & 6) == 0) {
                    i16 = iIntValue32 | (fetVar16.g(g9zVar14) ? 4 : 2);
                } else {
                    i16 = iIntValue32;
                }
                if ((iIntValue32 & 48) == 0) {
                    i16 |= fetVar16.e(iIntValue31) ? 32 : 16;
                }
                if (fetVar16.U(i16 & 1, (i16 & 147) != 146)) {
                    String str6 = (String) list.get(iIntValue31);
                    fetVar16.e0(175488308);
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    l8x.u(0, 10, fetVar16, s5x0.N(mm40VarD4, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, str6);
                    fetVar16.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                g9z g9zVar15 = (g9z) obj;
                int iIntValue33 = ((Number) obj2).intValue();
                fet fetVar17 = (fet) obj3;
                int iIntValue34 = ((Number) obj4).intValue();
                if ((iIntValue34 & 6) == 0) {
                    i17 = iIntValue34 | (fetVar17.g(g9zVar15) ? 4 : 2);
                } else {
                    i17 = iIntValue34;
                }
                if ((iIntValue34 & 48) == 0) {
                    i17 |= fetVar17.e(iIntValue33) ? 32 : 16;
                }
                if (fetVar17.U(i17 & 1, (i17 & 147) != 146)) {
                    String str7 = (String) list.get(iIntValue33);
                    fetVar17.e0(-2104282591);
                    zcl zclVar6 = qmk.f28987a;
                    v8q0.a(str7, s5x0.K(jm40Var, 16.0f, 12.0f), 0L, null, qmk.s, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar17), fetVar17, 0, 0, 130028);
                    fetVar17.r(false);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                g9z g9zVar16 = (g9z) obj;
                int iIntValue35 = ((Number) obj2).intValue();
                fet fetVar18 = (fet) obj3;
                int iIntValue36 = ((Number) obj4).intValue();
                if ((iIntValue36 & 6) == 0) {
                    i18 = iIntValue36 | (fetVar18.g(g9zVar16) ? 4 : 2);
                } else {
                    i18 = iIntValue36;
                }
                if ((iIntValue36 & 48) == 0) {
                    i18 |= fetVar18.e(iIntValue35) ? 32 : 16;
                }
                if (fetVar18.U(i18 & 1, (i18 & 147) != 146)) {
                    bls blsVar = (bls) list.get(iIntValue35);
                    fetVar18.e0(-1560928764);
                    tdc.q(blsVar, fetVar18, 0);
                    fetVar18.r(false);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 18:
                g9z g9zVar17 = (g9z) obj;
                int iIntValue37 = ((Number) obj2).intValue();
                fet fetVar19 = (fet) obj3;
                int iIntValue38 = ((Number) obj4).intValue();
                if ((iIntValue38 & 6) == 0) {
                    i19 = iIntValue38 | (fetVar19.g(g9zVar17) ? 4 : 2);
                } else {
                    i19 = iIntValue38;
                }
                if ((iIntValue38 & 48) == 0) {
                    i19 |= fetVar19.e(iIntValue37) ? 32 : 16;
                }
                if (fetVar19.U(i19 & 1, (i19 & 147) != 146)) {
                    jsw jswVar = (jsw) list.get(iIntValue37);
                    fetVar19.e0(-1308229454);
                    hsw.a(null, jswVar, fetVar19, 0);
                    fetVar19.r(false);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g9z g9zVar18 = (g9z) obj;
                int iIntValue39 = ((Number) obj2).intValue();
                fet fetVar20 = (fet) obj3;
                int iIntValue40 = ((Number) obj4).intValue();
                if ((iIntValue40 & 6) == 0) {
                    i20 = iIntValue40 | (fetVar20.g(g9zVar18) ? 4 : 2);
                } else {
                    i20 = iIntValue40;
                }
                if ((iIntValue40 & 48) == 0) {
                    i20 |= fetVar20.e(iIntValue39) ? 32 : 16;
                }
                if (fetVar20.U(i20 & 1, (i20 & 147) != 146)) {
                    ksw kswVar = (ksw) list.get(iIntValue39);
                    fetVar20.e0(832755634);
                    zcl zclVar7 = qmk.f28987a;
                    isw.a(s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), kswVar, fetVar20, 0);
                    fetVar20.r(false);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 20:
                g9z g9zVar19 = (g9z) obj;
                int iIntValue41 = ((Number) obj2).intValue();
                fet fetVar21 = (fet) obj3;
                int iIntValue42 = ((Number) obj4).intValue();
                if ((iIntValue42 & 6) == 0) {
                    i21 = iIntValue42 | (fetVar21.g(g9zVar19) ? 4 : 2);
                } else {
                    i21 = iIntValue42;
                }
                if ((iIntValue42 & 48) == 0) {
                    i21 |= fetVar21.e(iIntValue41) ? 32 : 16;
                }
                if (fetVar21.U(i21 & 1, (i21 & 147) != 146)) {
                    ja40 ja40Var = (ja40) list.get(iIntValue41);
                    fetVar21.e0(-1670120375);
                    x2x.c(String.valueOf(iIntValue41 + 1), ja40Var, fetVar21, 0);
                    fetVar21.r(false);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
            case 21:
                return a(obj, obj2, obj3, obj4);
            case 22:
                return b(obj, obj2, obj3, obj4);
            case 23:
                return c(obj, obj2, obj3, obj4);
            case 24:
                return g(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return h(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return i(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return l(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return m(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar20 = (g9z) obj;
                int iIntValue43 = ((Number) obj2).intValue();
                fet fetVar22 = (fet) obj3;
                int iIntValue44 = ((Number) obj4).intValue();
                if ((iIntValue44 & 6) == 0) {
                    i22 = iIntValue44 | (fetVar22.g(g9zVar20) ? 4 : 2);
                } else {
                    i22 = iIntValue44;
                }
                if ((iIntValue44 & 48) == 0) {
                    i22 |= fetVar22.e(iIntValue43) ? 32 : 16;
                }
                if (fetVar22.U(i22 & 1, (i22 & 147) != 146)) {
                    gzp0 gzp0Var = (gzp0) list.get(iIntValue43);
                    fetVar22.e0(1825782784);
                    String str8 = gzp0Var.f12191a;
                    String str9 = gzp0Var.b;
                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar22).d, 0.0f, 2);
                    zcl zclVar8 = qmk.f28987a;
                    zgc.F(0, fetVar22, s5x0.N(mm40VarL, 0.0f, 16.0f, 0.0f, 0.0f, 13), str8, str9);
                    fetVar22.r(false);
                } else {
                    fetVar22.X();
                }
                return Unit.f46060a;
        }
    }
}
