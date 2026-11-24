package a;

import android.javax.sip.message.Response;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeUiModel;
import org.xplatform.bet_history.history.presentation.dialog.history_menu.model.HistoryMenuItemUiModel;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;
import org.xplatform.statistic.grand_prix.presentation.model.SeasonItemUIModel;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterUiModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class xe4 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40726a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xe4(List list, Object obj, byte b) {
        this.f40726a = b;
        this.b = list;
        this.c = obj;
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
            qcx qcxVar = (qcx) ((a4x) this.b).get(iIntValue);
            fetVar.e0(309796837);
            qcxVar.getClass();
            ocx ocxVar = (ocx) qcxVar;
            zcl zclVar = qmk.f28987a;
            jiq0.y(s5x0.M(jm40.b, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, iIntValue == ((bcx) ((fcx) this.c)).f2374a.size() - 1 ? 12.0f : 0.0f), new gy30(new ux30(10, 0L, ocxVar.b, ocxVar.f25050a), new rx30(new m0x(R.drawable.ic_injury, null, 6), 0L, null, R.drawable.ic_injury, 0L, null, Response.BAD_GATEWAY), null, 0L, null, null, 252), null, null, null, fetVar, 0, 28);
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
        k3t0 k3t0Var = (k3t0) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            lk60 lk60Var = (lk60) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-1778967593);
            ux30 ux30Var = new ux30(14, 0L, lk60Var.b, (String) null);
            int i2 = lk60Var.c;
            gy30 gy30Var = new gy30(ux30Var, new rx30(new m0x(i2, null, 6), 0L, null, i2, 0L, null, Response.BAD_GATEWAY), null, 0L, null, null, 252);
            boolean zI = fetVar.i(k3t0Var) | fetVar.g(lk60Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new ej60(k3t0Var, lk60Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.g(lk60Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new ej60(k3t0Var, lk60Var, (byte) 1);
                fetVar.o0(objP2);
            }
            jiq0.y(null, gy30Var, function0, (Function0) objP2, null, fetVar, 0, 17);
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
            i5d i5dVar = (i5d) this.b.get(iIntValue);
            fetVar.e0(-1531591855);
            ebc.c(i5dVar, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), ibc.Y(((v9c) this.c).d, fetVar), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

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
            owa0 owa0Var = (owa0) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-679955241);
            if (owa0Var != null) {
                if (owa0Var instanceof nwa0) {
                    fetVar.e0(-679926691);
                    wwb.i(null, ((nwa0) owa0Var).f24226a, 0L, 0, 0L, fetVar, 0, 29);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (owa0Var instanceof kwa0) {
                    fetVar.e0(-679784711);
                    zcl zclVar = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                    kkb.m(null, ((kwa0) owa0Var).f18992a, ro8.c, 0, 0L, 0L, fetVar, 0, 57);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (owa0Var instanceof mwa0) {
                    fetVar.e0(-679470619);
                    zcl zclVar2 = qmk.f28987a;
                    wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
                    vdb.v(o7k0.d(jm40.b, 1.0f), gx1.f12054a, ((mwa0) owa0Var).f22494a, null, fetVar, 6, 8);
                    a4x a4xVar = ((twa0) ((l7m0) this.c).getValue()).b;
                    if (a4xVar != null && a4xVar.isEmpty()) {
                        fetVar.e0(-678832112);
                        fetVar.r(false);
                        break;
                    }
                    Iterator<E> it = a4xVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fetVar.e0(-678832112);
                            fetVar.r(false);
                            break;
                        }
                        if (((owa0) it.next()) instanceof lwa0) {
                            fetVar.e0(-678926290);
                            zcl zclVar3 = qmk.f28987a;
                            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                            fetVar.r(false);
                            break;
                        }
                    }
                    fetVar.r(false);
                } else if (owa0Var instanceof lwa0) {
                    fetVar.e0(-678749621);
                    dub.x(null, ((lwa0) owa0Var).f20757a, null, null, fetVar, 0, 29);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(116613292, fetVar, false);
        }
        fetVar.X();
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
            kba kbaVar = (kba) this.b.get(iIntValue);
            fetVar.e0(-1689302534);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CARD_BASKETBALL_QUARTER_ITEM_" + ((jba) this.c).f16229a.indexOf(kbaVar));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            wdx.x(kbaVar, fetVar, 8);
            fetVar.r(true);
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
        l4e0 l4e0Var = (l4e0) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            SelectorOptionModel selectorOptionModel = (SelectorOptionModel) this.b.get(iIntValue);
            fetVar.e0(274763827);
            rqm rqmVar = new rqm((vui0) new tui0(selectorOptionModel.f47063a, null), (pui0) null, (pvi0) new nvi0(selectorOptionModel.d || selectorOptionModel.c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
            boolean zI = fetVar.i(l4e0Var) | fetVar.i(selectorOptionModel);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new k4e0(l4e0Var, selectorOptionModel, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(l4e0Var) | fetVar.i(selectorOptionModel);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new k4e0(l4e0Var, selectorOptionModel, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(null, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 169);
            fl70 fl70Var = l4e0.n2;
            if (iIntValue != l4e0Var.l2.n(l4e0Var, l4e0.o2[1]).size() - 1) {
                fetVar.e0(275677892);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(jm40.b, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(275896845);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long textPrimary;
        boolean z;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ljh0 ljh0Var = (ljh0) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            SeasonItemUIModel seasonItemUIModel = (SeasonItemUIModel) this.b.get(iIntValue);
            fetVar.e0(-2121662818);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 48.0f), 16.0f, 0.0f, 2);
            boolean zI = fetVar.i(ljh0Var) | fetVar.i(seasonItemUIModel);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new sue0(ljh0Var, seasonItemUIModel, (byte) 13);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarL, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            String str = seasonItemUIModel.b;
            y9q0 y9q0Var = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
            if (seasonItemUIModel.c) {
                fetVar.e0(537217130);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                fetVar.r(false);
            } else {
                fetVar.e0(537327366);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarB, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, y9q0.a(y9q0Var, textPrimary, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 384, 126972);
            lme0 lme0Var = ljh0.m2;
            if (iIntValue != ljh0Var.k2.n(ljh0Var, ljh0.n2[0]).size() - 1) {
                fetVar.e0(537664832);
                mbc.o(zfi0.f44303a, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.i), false, fetVar, 6, 4);
                z = false;
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(537989619);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0172  */
    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40VarL;
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
            fetVar.e0(-1660506804);
            if (p6t0Var == null) {
                fetVar.e0(-1658173497);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof rfl0;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-1660497970);
                    if (lgl0.f20015a[((j8l0) this.c).ordinal()] == 1) {
                        fetVar.e0(-1660381565);
                        mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2);
                        zcl zclVar = qmk.f28987a;
                        mm40VarL = s5x0.N(mm40VarL2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1660125846);
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                        fetVar.r(false);
                    }
                    nkb.h(mm40VarL, ((rfl0) p6t0Var).f30394a, kjm.b, null, null, null, fetVar, 384, 56);
                    fetVar.r(false);
                } else if (p6t0Var instanceof qfl0) {
                    fetVar.e0(-1659659141);
                    int iOrdinal = ((qfl0) p6t0Var).f28640a.ordinal();
                    if (iOrdinal == 0) {
                        fetVar.e0(-1659598319);
                        ahy.E(0, fetVar, s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2));
                        fetVar.r(false);
                    } else if (iOrdinal == 1 || iOrdinal == 2) {
                        fetVar.e0(-1659251987);
                        ahy.C(0, fetVar, s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2));
                        fetVar.r(false);
                    } else if (iOrdinal == 3) {
                        fetVar.e0(-1658674798);
                        ahy.x(0, fetVar, s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2));
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 4) {
                            throw b1j.f(-1439010713, fetVar, false);
                        }
                        fetVar.e0(-1658963346);
                        ahy.N(0, fetVar, s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (p6t0Var instanceof rer0) {
                    fetVar.e0(-1658384390);
                    zcl zclVar2 = qmk.f28987a;
                    qcc.m(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), ((rer0) p6t0Var).f30350a, null, fetVar, 12);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1658173497);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
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
            i1m0 i1m0Var = (i1m0) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(2114098403);
            cfx0.d(null, i1m0Var.f14006a, (xcz) this.c, false, 0L, 0L, null, null, null, null, null, null, fetVar, 1573312);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        fcm0 fcm0Var = (fcm0) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            ChampSubMenuItem champSubMenuItem = (ChampSubMenuItem) this.b.get(iIntValue);
            fetVar.e0(748816054);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 48.0f), 16.0f, 0.0f, 2);
            boolean zI = fetVar.i(fcm0Var) | fetVar.i(champSubMenuItem);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new sue0(fcm0Var, champSubMenuItem, (byte) 29);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarL, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            v8q0.a(champSubMenuItem.c, jr8Var.b(jm40Var, zx7Var), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 384, 126972);
            j6m0 j6m0Var = fcm0.n2;
            if (iIntValue != fcm0Var.l2.n(fcm0Var, fcm0.o2[1]).size() - 1) {
                fetVar.e0(-2124470144);
                mbc.o(zfi0.f44303a, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.i), false, fetVar, 6, 4);
                z = false;
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(-2124145357);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
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
            s6x s6xVar = (s6x) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(1129768755);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            xkb.r(s5x0.N(mm40VarD, 0.0f, iIntValue == 0 ? 16.0f : 0.0f, 0.0f, iIntValue == ((pop0) this.c).c.size() - 1 ? 24.0f : 0.0f, 5), s6xVar, 0, 0, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
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
            ear0 ear0Var = (ear0) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-317746350);
            wgm0.f(null, ear0Var, fetVar, 0);
            if (iIntValue != q3d.i(((gar0) this.c).f10983a)) {
                fetVar.e0(-317614787);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(jm40.b, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(-317357146);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
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
            o9r0 o9r0Var = (o9r0) this.b.get(iIntValue);
            fetVar.e0(1396523581);
            boolean z = iIntValue == 0;
            String str = o9r0Var.f24895a;
            a4x a4xVar = o9r0Var.b;
            ju70.g(0, fetVar, str, z);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            if (iIntValue == ((jcr0) this.c).b.size() - 1) {
                zcl zclVar = qmk.f28987a;
                f = 24.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            }
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1383391566, a4xVar);
            int i2 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                ju70.A((tar0) next, i2 == 0, i2 == a4xVar.size() - 1, fetVar, 0);
                i2 = i3;
            }
            ohs0.x(fetVar, false, true, false);
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
        fet fetVar;
        float f;
        float f2;
        int i4;
        long secondary;
        boolean z;
        int i5;
        float f3;
        int i6;
        y3d y3dVar;
        wui0 wui0Var;
        int i7;
        boolean z2;
        int i8;
        fet fetVar2;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        int i11;
        byte b = this.f40726a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Object obj5 = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ze4 ze4Var = (ze4) obj5;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    af4 af4Var = (af4) list.get(iIntValue);
                    fetVar3.e0(-174751823);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 56.0f), vgg0.f37379a);
                    pm80 pm80VarF = a8k0.F(af4Var.f759a, 0, fetVar3);
                    boolean zI = fetVar3.i(ze4Var) | fetVar3.g(af4Var);
                    Object objP = fetVar3.P();
                    if (zI || objP == cl5Var) {
                        objP = new h5((Object) ze4Var, (Object) af4Var, (byte) 7);
                        fetVar3.o0(objP);
                    }
                    saj.e(mm40VarJ, pm80VarF, null, null, (Function0) objP, fetVar3, 64, 12);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                k8z k8zVar = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(k8zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    ko5 ko5Var = (ko5) list.get(iIntValue3);
                    fetVar4.e0(-187572882);
                    bsr0.s(ko5Var, (rfv) obj5, null, fetVar4, 48);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = (fetVar5.g(g9zVar2) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar5.U(i3 & 1, (i3 & 147) != 146)) {
                    n48 n48Var = (n48) ((a4x) list).get(iIntValue5);
                    fetVar5.e0(1606674207);
                    n48Var.getClass();
                    l48 l48Var = (l48) n48Var;
                    String str = l48Var.f19391a;
                    int length = str.length();
                    jm40 jm40Var2 = jm40.b;
                    if (length > 0) {
                        fetVar5.e0(1606770461);
                        f = 0.0f;
                        nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar5).d, 0.0f, 2), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar5.k(zaq0.b)).getPrimary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar5, 384, 56);
                        fetVar = fetVar5;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar5;
                        f = 0.0f;
                        fetVar.e0(1607339373);
                        fetVar.r(false);
                    }
                    if (iIntValue5 == ((y48) ((c58) obj5)).d.size() - 1) {
                        zcl zclVar2 = qmk.f28987a;
                        f2 = 12.0f;
                    } else {
                        zcl zclVar3 = qmk.f28987a;
                        f2 = f;
                    }
                    mm40 mm40VarN = s5x0.N(jm40Var2, xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, f2, 2);
                    String str2 = l48Var.b;
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    v8q0.a(str2, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, 0, 0, 131064);
                    fetVar.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                oic oicVar = (oic) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = (fetVar6.g(g9zVar3) ? 4 : 2) | iIntValue8;
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(i4 & 1, (i4 & 147) != 146)) {
                    ChoseFilterUiModel choseFilterUiModel = (ChoseFilterUiModel) ((ArrayList) list).get(iIntValue7);
                    fetVar6.e0(1127654508);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 48.0f), 16.0f, 0.0f, 2);
                    boolean zI2 = fetVar6.i(oicVar) | fetVar6.i(choseFilterUiModel);
                    Object objP2 = fetVar6.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new h5((Object) oicVar, (Object) choseFilterUiModel, (byte) 17);
                        fetVar6.o0(objP2);
                    }
                    mm40 mm40VarW = y860.W(mm40VarL, null, null, false, null, (Function0) objP2, 28);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarW);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    zx7 zx7Var = gqw0.d;
                    jr8 jr8Var = jr8.f16991a;
                    mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                    String str3 = choseFilterUiModel.f47100a;
                    y9q0 y9q0Var = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                    if (choseFilterUiModel.c) {
                        fetVar6.e0(227620149);
                        secondary = ((ThemeColors) fetVar6.k(zaq0.b)).getPrimary();
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(227730323);
                        secondary = ((ThemeColors) fetVar6.k(zaq0.b)).getSecondary();
                        fetVar6.r(false);
                    }
                    v8q0.a(str3, mm40VarB, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, y9q0.a(y9q0Var, secondary, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar6, 0, 384, 126972);
                    yk5 yk5Var = oic.l2;
                    if (iIntValue7 != oicVar.P0().c.size() - 1) {
                        fetVar6.e0(228080747);
                        mbc.o(zfi0.f44303a, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.i), false, fetVar6, 6, 4);
                        z = false;
                        fetVar6.r(false);
                    } else {
                        z = false;
                        fetVar6.e0(228405534);
                        fetVar6.r(false);
                    }
                    fetVar6.r(true);
                    fetVar6.r(z);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar7.g(g9zVar4) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar7.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar7.U(i5 & 1, (i5 & 147) != 146)) {
                    f7m f7mVar = (f7m) list.get(iIntValue9);
                    fetVar7.e0(2076206475);
                    if (iIntValue9 != q3d.i(((l7m) obj5).d)) {
                        zcl zclVar5 = qmk.f28987a;
                        f3 = 8.0f;
                    } else {
                        zcl zclVar6 = qmk.f28987a;
                        f3 = 0.0f;
                    }
                    dub.m(s5x0.N(jm40.b, 0.0f, 0.0f, f3, 0.0f, 11), f7mVar, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                omn omnVar = (omn) obj5;
                es esVar = omnVar.k2;
                zz2 zz2Var = omnVar.o2;
                if ((iIntValue12 & 6) == 0) {
                    i6 = (fetVar8.g(g9zVar5) ? 4 : 2) | iIntValue12;
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar8.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar8.U(i6 & 1, (i6 & 147) != 146)) {
                    String str4 = (String) list.get(iIntValue11);
                    fetVar8.e0(-1858764412);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarL2 = s5x0.L(mm40VarD2, 4.0f, 0.0f, 2);
                    ddk ddkVar = omn.p2;
                    iiy[] iiyVarArr = omn.q2;
                    if (iIntValue11 == zz2Var.n(omnVar, iiyVarArr[4]).intValue()) {
                        pz40 pz40Var = s6t0.f31722a;
                        y3dVar = new y3d(s6t0.b().f33626a.getPrimary());
                    } else {
                        y3dVar = null;
                    }
                    tui0 tui0Var = new tui0(str4, y3dVar);
                    nvi0 nvi0Var = new nvi0(iIntValue11 == zz2Var.n(omnVar, iiyVarArr[4]).intValue());
                    if (esVar.n(omnVar, iiyVarArr[0]).size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (iIntValue11 == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = iIntValue11 == esVar.n(omnVar, iiyVarArr[0]).size() - 1 ? wui0.d : wui0.c;
                    }
                    rqm rqmVar = new rqm((vui0) tui0Var, (pui0) null, (pvi0) nvi0Var, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442);
                    boolean zI3 = fetVar8.i(omnVar) | ((((i6 & 112) ^ 48) > 32 && fetVar8.e(iIntValue11)) || (i6 & 48) == 32);
                    Object objP3 = fetVar8.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new tfe(omnVar, iIntValue11, (byte) 4);
                        fetVar8.o0(objP3);
                    }
                    obc.q(mm40VarL2, rqmVar, false, null, (Function0) objP3, null, null, null, fetVar8, 0, 236);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar9.g(g9zVar6) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar9.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar9.U(i7 & 1, (i7 & 147) != 146)) {
                    xyx xyxVar = (xyx) list.get(iIntValue13);
                    fetVar9.e0(-1343333758);
                    int iOrdinal = ((wyx) obj5).ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        z2 = false;
                        fetVar9.e0(95216898);
                        ebc.d(xyxVar.f41727a, xyxVar.b, fetVar9, 0);
                        fetVar9.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw b1j.f(95213985, fetVar9, false);
                        }
                        fetVar9.e0(95222244);
                        z2 = false;
                        ebc.W(xyxVar.f41727a, xyxVar.b, fetVar9, 0);
                        fetVar9.r(false);
                    }
                    fetVar9.r(z2);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 7:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                g9z g9zVar7 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                xx7 xx7Var = gqw0.m;
                mw3 mw3Var = uc9.c;
                q0w q0wVar = (q0w) obj5;
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar10.g(g9zVar7) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar10.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar10.U(i8 & 1, (i8 & 147) != 146)) {
                    HistoryDateFilterTypeUiModel historyDateFilterTypeUiModel = (HistoryDateFilterTypeUiModel) list.get(iIntValue15);
                    fetVar10.e0(1989932927);
                    HistoryDateFilterTypeModel historyDateFilterTypeModel = historyDateFilterTypeUiModel.c;
                    boolean z5 = historyDateFilterTypeUiModel.d;
                    int iOrdinal2 = historyDateFilterTypeModel.ordinal();
                    zfi0 zfi0Var = zfi0.f44303a;
                    if (iOrdinal2 == 0) {
                        fetVar10.e0(1989886333);
                        x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar10, 0);
                        int iHashCode2 = Long.hashCode(fetVar10.T);
                        bh90 bh90VarM2 = fetVar10.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar10, jm40Var);
                        mkd.c0.getClass();
                        fetVar10.i0();
                        if (fetVar10.S) {
                            fetVar10.l(pcyVar);
                        } else {
                            fetVar10.r0();
                        }
                        jpm0.o(fetVar10, x5dVarA, shdVar4);
                        jpm0.o(fetVar10, bh90VarM2, shdVar3);
                        vqd.u(iHashCode2, fetVar10, shdVar2, fetVar10);
                        jpm0.o(fetVar10, mm40VarC1, shdVar);
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        rqm rqmVar2 = new rqm((vui0) new uui0(historyDateFilterTypeUiModel.f46398a, null, historyDateFilterTypeUiModel.b, null, null, 58), (pui0) null, (pvi0) new nvi0(z5), (d4d) null, (tvi0) null, wui0.b, false, (e900) null, 442);
                        boolean zI4 = fetVar10.i(q0wVar);
                        Object objP4 = fetVar10.P();
                        if (zI4 || objP4 == cl5Var) {
                            objP4 = new p0w(q0wVar, (byte) 0);
                            fetVar10.o0(objP4);
                        }
                        Function0 function0 = (Function0) objP4;
                        boolean zI5 = fetVar10.i(q0wVar);
                        Object objP5 = fetVar10.P();
                        if (zI5 || objP5 == cl5Var) {
                            objP5 = new p0w(q0wVar, (byte) 1);
                            fetVar10.o0(objP5);
                        }
                        obc.q(mm40VarD3, rqmVar2, false, null, function0, null, (Function0) objP5, null, fetVar10, 390, 168);
                        mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar8 = qmk.f28987a;
                        mbc.o(zfi0Var, s5x0.L(mm40VarD4, 12.0f, 0.0f, 2), false, fetVar10, 6, 4);
                        fetVar2 = fetVar10;
                        fetVar2.r(true);
                        z3 = false;
                        fetVar2.r(false);
                    } else if (iOrdinal2 == 1) {
                        fetVar10.e0(1991665051);
                        x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar10, 0);
                        int iHashCode3 = Long.hashCode(fetVar10.T);
                        bh90 bh90VarM3 = fetVar10.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar10, jm40Var);
                        mkd.c0.getClass();
                        fetVar10.i0();
                        if (fetVar10.S) {
                            fetVar10.l(pcyVar);
                        } else {
                            fetVar10.r0();
                        }
                        jpm0.o(fetVar10, x5dVarA2, shdVar4);
                        jpm0.o(fetVar10, bh90VarM3, shdVar3);
                        vqd.u(iHashCode3, fetVar10, shdVar2, fetVar10);
                        jpm0.o(fetVar10, mm40VarC2, shdVar);
                        mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                        rqm rqmVar3 = new rqm((vui0) new uui0(historyDateFilterTypeUiModel.f46398a, null, historyDateFilterTypeUiModel.b, null, null, 58), (pui0) null, (pvi0) new nvi0(z5), (d4d) null, (tvi0) null, wui0.b, false, (e900) null, 442);
                        boolean zI6 = fetVar10.i(q0wVar);
                        Object objP6 = fetVar10.P();
                        if (zI6 || objP6 == cl5Var) {
                            objP6 = new p0w(q0wVar, (byte) 2);
                            fetVar10.o0(objP6);
                        }
                        Function0 function1 = (Function0) objP6;
                        boolean zI7 = fetVar10.i(q0wVar);
                        Object objP7 = fetVar10.P();
                        if (zI7 || objP7 == cl5Var) {
                            objP7 = new p0w(q0wVar, (byte) 3);
                            fetVar10.o0(objP7);
                        }
                        obc.q(mm40VarD5, rqmVar3, false, null, function1, null, (Function0) objP7, null, fetVar10, 390, 168);
                        mm40 mm40VarD6 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar9 = qmk.f28987a;
                        mbc.o(zfi0Var, s5x0.L(mm40VarD6, 12.0f, 0.0f, 2), false, fetVar10, 6, 4);
                        fetVar2 = fetVar10;
                        fetVar2.r(true);
                        z3 = false;
                        fetVar2.r(false);
                    } else if (iOrdinal2 == 2) {
                        fetVar10.e0(1993430222);
                        mm40 mm40VarD7 = o7k0.d(jm40Var, 1.0f);
                        rqm rqmVar4 = new rqm((vui0) new uui0(historyDateFilterTypeUiModel.f46398a, null, historyDateFilterTypeUiModel.b, null, null, 58), (pui0) null, (pvi0) new nvi0(z5), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
                        boolean zI8 = fetVar10.i(q0wVar);
                        Object objP8 = fetVar10.P();
                        if (zI8 || objP8 == cl5Var) {
                            objP8 = new p0w(q0wVar, (byte) 4);
                            fetVar10.o0(objP8);
                        }
                        Function0 function2 = (Function0) objP8;
                        boolean zI9 = fetVar10.i(q0wVar);
                        Object objP9 = fetVar10.P();
                        if (zI9 || objP9 == cl5Var) {
                            objP9 = new p0w(q0wVar, (byte) 5);
                            fetVar10.o0(objP9);
                        }
                        obc.q(mm40VarD7, rqmVar4, false, null, function2, null, (Function0) objP9, null, fetVar10, 6, 172);
                        fetVar2 = fetVar10;
                        z3 = false;
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal2 != 3) {
                            throw b1j.f(-628545276, fetVar10, false);
                        }
                        fetVar10.e0(1994679460);
                        mm40 mm40VarD8 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar10 = qmk.f28987a;
                        mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarD8, 16.0f, 12.0f, 16.0f, 0.0f, 8), "SEND_HISTORY_CELL");
                        uui0 uui0Var = new uui0(historyDateFilterTypeUiModel.f46398a, null, historyDateFilterTypeUiModel.b, null, null, 58);
                        zfn zfnVar = zaq0.b;
                        rqm rqmVar5 = new rqm((vui0) uui0Var, (pui0) new oui0(Integer.valueOf(R.drawable.ic_glyph_mail), (y3d) null, new m0x(R.drawable.ic_glyph_mail, null, 6), new y3d(((ThemeColors) fetVar10.k(zfnVar)).getSecondary()), 18), (pvi0) new fvi0(new y3d(((ThemeColors) fetVar10.k(zfnVar)).getSecondary())), d4d.BACKGROUND, (tvi0) qvi0.f29388a, (wui0) null, false, (e900) null, 456);
                        boolean zI10 = fetVar10.i(q0wVar);
                        Object objP10 = fetVar10.P();
                        if (zI10 || objP10 == cl5Var) {
                            objP10 = new p0w(q0wVar, (byte) 6);
                            fetVar10.o0(objP10);
                        }
                        obc.q(mm40VarE0, rqmVar5, false, null, (Function0) objP10, null, null, null, fetVar10, 0, 236);
                        fetVar10.r(false);
                        fetVar2 = fetVar10;
                        z3 = false;
                    }
                    fetVar2.r(z3);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                c4w c4wVar = (c4w) obj5;
                lhf0 lhf0Var = c4wVar.m2;
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar11.g(g9zVar8) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar11.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar11.U(i9 & 1, (i9 & 147) != 146)) {
                    HistoryMenuItemUiModel historyMenuItemUiModel = (HistoryMenuItemUiModel) list.get(iIntValue17);
                    fetVar11.e0(938137250);
                    mm40 mm40VarD9 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarL3 = s5x0.L(mm40VarD9, 4.0f, 0.0f, 2);
                    tui0 tui0Var2 = new tui0(historyMenuItemUiModel.f46399a, null);
                    int i12 = historyMenuItemUiModel.b;
                    oui0 oui0Var = new oui0(Integer.valueOf(i12), (y3d) null, new m0x(i12, null, 6), new y3d(((ThemeColors) fetVar11.k(zaq0.b)).getSecondary()), 18);
                    tqt tqtVar = c4w.n2;
                    iiy[] iiyVarArr2 = c4w.o2;
                    rqm rqmVar6 = new rqm((vui0) tui0Var2, (pui0) oui0Var, (pvi0) null, (d4d) null, (tvi0) null, iIntValue17 == lhf0Var.n(c4wVar, iiyVarArr2[2]).size() + (-1) ? wui0.d : wui0.c, false, (e900) null, 444);
                    boolean zI11 = fetVar11.i(c4wVar) | fetVar11.i(historyMenuItemUiModel);
                    Object objP11 = fetVar11.P();
                    if (zI11 || objP11 == cl5Var) {
                        objP11 = new nsr((Object) c4wVar, (Object) historyMenuItemUiModel, (byte) 8);
                        fetVar11.o0(objP11);
                    }
                    obc.q(mm40VarL3, rqmVar6, false, null, (Function0) objP11, null, null, null, fetVar11, 384, 232);
                    if (iIntValue17 < lhf0Var.n(c4wVar, iiyVarArr2[2]).size() - 1) {
                        fetVar11.e0(939494181);
                        mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar11, 6, 4);
                        z4 = false;
                        fetVar11.r(false);
                    } else {
                        z4 = false;
                        fetVar11.e0(939779598);
                        fetVar11.r(false);
                    }
                    fetVar11.r(z4);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 9:
                return a(obj, obj2, obj3, obj4);
            case 10:
                return b(obj, obj2, obj3, obj4);
            case 11:
                return c(obj, obj2, obj3, obj4);
            case 12:
                return g(obj, obj2, obj3, obj4);
            case 13:
                return h(obj, obj2, obj3, obj4);
            case 14:
                return i(obj, obj2, obj3, obj4);
            case 15:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar12.g(g9zVar9) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar12.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar12.U(i10 & 1, (i10 & 147) != 146)) {
                    eje0 eje0Var = (eje0) list.get(iIntValue19);
                    fetVar12.e0(-1344281695);
                    zcl zclVar12 = qmk.f28987a;
                    ydx.q(s5x0.N(jm40.b, xfn.a(fetVar12).d, 4.0f, xfn.a(fetVar12).d, 0.0f, 8), eje0Var, ((fje0) obj5).b, fetVar12, 0);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 16:
                return l(obj, obj2, obj3, obj4);
            case 17:
                return m(obj, obj2, obj3, obj4);
            case 18:
                return o(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return p(obj, obj2, obj3, obj4);
            case 20:
                return r(obj, obj2, obj3, obj4);
            case 21:
                return s(obj, obj2, obj3, obj4);
            case 22:
                return t(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar13.g(g9zVar10) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar13.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar13.U(i11 & 1, (i11 & 147) != 146)) {
                    qhs0 qhs0Var = (qhs0) ((a4x) list).get(iIntValue21);
                    fetVar13.e0(-1979643111);
                    zcl zclVar13 = qmk.f28987a;
                    kcx.n(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, iIntValue21 == ((ujs0) obj5).f35799a.size() + (-1) ? 24.0f : 0.0f, 5), qhs0Var, fetVar13, 0);
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
        }
    }
}
