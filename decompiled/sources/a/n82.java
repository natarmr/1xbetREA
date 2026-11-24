package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n82 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23067a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n82(Object obj, Object obj2, Object obj3, byte b) {
        this.f23067a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        rod rodVar = (rod) this.b;
        pz40 pz40Var = (pz40) this.c;
        Function2 function2 = (Function2) this.d;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            aad.j(((iD >> 3) & 14) | 3456, u1c.M(1992319380, new qb((Object) rodVar, (Object) pz40Var, (Object) function2, (byte) 24), fetVar), u1c.M(981653333, new sd8(rodVar, (byte) 14), fetVar), fetVar, mm40Var, false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        i4 i4Var = (i4) this.b;
        pv40 pv40Var = (pv40) this.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            cnb cnbVar = (cnb) CollectionsKt.W(iIntValue, i4Var);
            if (cnbVar == null) {
                return Unit.f46060a;
            }
            obc.d(sdo0.f32043a.a(sdo0.a(cnbVar, pv40Var, fetVar)), u1c.M(670244716, new eod(linkedHashMap, cnbVar, (byte) 17), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        yrr yrrVar = (yrr) this.b;
        pz40 pz40Var = (pz40) this.c;
        Function2 function2 = (Function2) this.d;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.n(mm40Var, 100.0f), 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            b8k0.i(3462, u1c.M(-166143014, new eyn(yrrVar, pz40Var, function2, (byte) 10), fetVar), u1c.M(1416209051, new elm(yrrVar, (byte) 13), fetVar), fetVar, jm40.b, false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        xrr xrrVar = (xrr) this.b;
        pz40 pz40Var = (pz40) this.c;
        Function2 function2 = (Function2) this.d;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            zcl zclVar = qmk.f28987a;
            a8k0.f(3456, u1c.M(-1109377718, new eyn(xrrVar, pz40Var, function2, (byte) 9), fetVar), u1c.M(-696471511, new elm(xrrVar, (byte) 12), fetVar), fetVar, s5x0.L(mm40Var, 0.0f, 8.0f, 1), false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        j2s j2sVar = (j2s) this.b;
        mm40 mm40Var = (mm40) this.c;
        Function1 function1 = (Function1) this.d;
        mm40 mm40Var2 = (mm40) obj;
        MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        xak xakVar = j2s.b2;
        mm40Var2.getClass();
        marketsCategoriesParams.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(mm40Var2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? fetVar.g(marketsCategoriesParams) : fetVar.i(marketsCategoriesParams) ? 32 : 16;
        }
        if (!fetVar.U(i & 1, (i & 147) != 146)) {
            fetVar.X();
        } else {
            if (j2sVar.N1 == null) {
                Intrinsics.h("marketsCategoriesFactory");
                throw null;
            }
            uuz.c(mm40Var2, mm40Var, j2sVar, marketsCategoriesParams, function1, fetVar, (i & 14) | ((i << 6) & 7168));
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        uwh0 uwh0Var = (uwh0) this.b;
        gh00 gh00Var = (gh00) this.c;
        Function1 function1 = (Function1) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jj80 jj80Var = ((mj80) uwh0Var.f36392a.get(iIntValue)).f21884a;
            if (jj80Var.equals(gj80.f11384a)) {
                fetVar.e0(1821614358);
                q8x.s(gh00Var.d, function1, fetVar, 6);
                fetVar.r(false);
            } else if (jj80Var.equals(dj80.f6171a)) {
                fetVar.e0(1821893234);
                z6c0 z6c0Var = gh00Var.e;
                if (z6c0Var == null) {
                    fetVar.e0(1821893233);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1821893234);
                    d9x.s(z6c0Var, function1, fetVar, 6);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!jj80Var.equals(aj80.f962a)) {
                    throw b1j.f(-1465261076, fetVar, false);
                }
                fetVar.e0(1822173877);
                px4 px4Var = gh00Var.f;
                if (px4Var == null) {
                    fetVar.e0(1822173876);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1822173877);
                    s5x0.c(px4Var, function1, fetVar, 6);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        baj bajVar = (baj) this.b;
        xcz xczVar = (xcz) this.c;
        Function1 function1 = (Function1) this.d;
        mm40 mm40Var = (mm40) obj2;
        fet fetVar = (fet) obj3;
        int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
        if ((iD & 48) == 0) {
            iD |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(iD & 1, (iD & 145) != 144)) {
            a4x a4xVar = bajVar.f2259a;
            zcl zclVar = qmk.f28987a;
            tdc.m(s5x0.L(mm40Var, 0.0f, 8.0f, 1), a4xVar, p3n.f26307a, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), xczVar, function1, fetVar, 384, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        vwh0 vwh0Var = (vwh0) this.b;
        jp30 jp30Var = (jp30) this.c;
        Function1 function1 = (Function1) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "HORIZONTAL_PAGER");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kj80 kj80Var = ((nj80) vwh0Var.f38150a.get(iIntValue)).f23623a;
            if (kj80Var.equals(hj80.f13150a)) {
                fetVar.e0(-2101170214);
                m8x.E(jp30Var.c, jp30Var.d, function1, fetVar, 6);
                fetVar.r(false);
            } else if (kj80Var.equals(ej80.f7896a)) {
                fetVar.e0(-2100824471);
                a7c0 a7c0Var = jp30Var.e;
                if (a7c0Var == null) {
                    fetVar.e0(-2100824472);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-2100824471);
                    c9x.h(jp30Var.c, a7c0Var, function1, fetVar, 6);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!kj80Var.equals(bj80.f2694a)) {
                    throw b1j.f(347860295, fetVar, false);
                }
                fetVar.e0(-2100464499);
                qx4 qx4Var = jp30Var.f;
                if (qx4Var == null) {
                    fetVar.e0(-2100464500);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-2100464499);
                    y0x0.f(jp30Var.c, qx4Var, function1, fetVar, 6);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        gna0 gna0Var = (gna0) this.b;
        Function1 function1 = (Function1) this.c;
        Function1 function2 = (Function1) this.d;
        he40 he40Var = (he40) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((b53) obj).getClass();
        he40Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.g(he40Var) ? 32 : 16;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            fetVar.X();
        } else if (he40Var instanceof ge40) {
            fetVar.e0(2066693863);
            ge40 ge40Var = (ge40) he40Var;
            rcc rccVar = ge40Var.f11134a;
            gna0Var.getClass();
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            a4x a4xVar = ge40Var.b;
            if (rccVar != null) {
                fetVar.e0(1304348859);
                i = 0;
                qcc.a(null, rccVar, function2, fetVar, 0);
                fetVar.r(false);
            } else {
                i = 0;
                fetVar.e0(1304497814);
                fetVar.r(false);
            }
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, i);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar4);
            jpm0.o(fetVar, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar, -339387322, a4xVar);
            while (itO.hasNext()) {
                a4x a4xVar2 = (a4x) itO.next();
                fetVar.b0(-60470184, Integer.valueOf(a4xVar.indexOf(a4xVar2)));
                a4xVar2.getClass();
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40Var, qmk.a(fetVar).d, 0.0f, 2);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = mu90.b;
                    fetVar.o0(objP);
                }
                tj30 tj30Var = (tj30) objP;
                jm40 jm40Var2 = jm40Var;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarL);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var, shdVar4);
                jpm0.o(fetVar, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                Iterator itO2 = h97.o(fetVar, mm40VarC2, shdVar, 1528185633, a4xVar2);
                while (itO2.hasNext()) {
                    oea0 oea0Var = (oea0) itO2.next();
                    fetVar.b0(642970542, oea0Var.f25114a);
                    boolean zG = fetVar.g(oea0Var.f25114a);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = jgk0.b(new qw80((Object) oea0Var, (Object) gna0Var, (byte) 9));
                        fetVar.o0(objP2);
                    }
                    k9x.m(null, oea0Var, (l7m0) objP2, function1, fetVar, 0);
                    fetVar.r(false);
                    cl5Var = cl5Var;
                }
                ohs0.x(fetVar, false, true, false);
                jm40Var = jm40Var2;
            }
            fetVar.r(false);
            fetVar.r(true);
            fetVar.r(true);
            fetVar.r(false);
        } else {
            if (!(he40Var instanceof fe40)) {
                throw b1j.f(2066692163, fetVar, false);
            }
            fetVar.e0(2066703185);
            cww.b((fe40) he40Var, gna0Var, function1, fetVar, (iIntValue >> 3) & 14);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        Map map = (Map) this.b;
        List list = (List) this.c;
        v9c v9cVar = (v9c) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            cy2.n(map, list, iIntValue, v9cVar, fetVar, (iIntValue2 << 3) & 896);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mm40 mm40Var = (mm40) this.b;
        vb90 vb90Var = (vb90) this.c;
        Function1 function1 = (Function1) this.d;
        a2n a2nVar = (a2n) obj;
        ycl yclVar = (ycl) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        a2nVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (fetVar.g(a2nVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= fetVar.d(yclVar.f42389a) ? 32 : 16;
        }
        if (!fetVar.U(i & 1, (i & 147) != 146)) {
            fetVar.X();
        } else if (a2nVar instanceof y56) {
            fetVar.e0(1019698187);
            vcc.i(o7k0.s(mm40Var, yclVar.f42389a), (y56) a2nVar, vb90Var.e, function1, null, fetVar, (i << 3) & 112, 16);
            fetVar.r(false);
        } else if (a2nVar instanceof c2o0) {
            fetVar.e0(1020066343);
            hkb.n(o7k0.s(mm40Var, yclVar.f42389a), (c2o0) a2nVar, vb90Var.e, function1, null, fetVar, (i << 3) & 112, 16);
            fetVar.r(false);
        } else if (a2nVar instanceof x0g0) {
            fetVar.e0(1020440389);
            plc.m(o7k0.s(mm40Var, yclVar.f42389a), (x0g0) a2nVar, vb90Var.e, function1, fetVar, (i << 3) & 112, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(1020752032);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        Function1 function1 = (Function1) this.b;
        Function0 function0 = (Function0) this.c;
        Function0 function2 = (Function0) this.d;
        rr90 rr90Var = (rr90) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((b53) obj).getClass();
        rr90Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= fetVar.g(rr90Var) ? 32 : 16;
        }
        if (!fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
            fetVar.X();
        } else if (rr90Var instanceof pr90) {
            fetVar.e0(-734071912);
            tlb.p(null, (pr90) rr90Var, function1, function0, fetVar, iIntValue & 112);
            fetVar.r(false);
        } else {
            if (!(rr90Var instanceof qr90)) {
                throw b1j.f(-734074172, fetVar, false);
            }
            fetVar.e0(-734064882);
            e9x.o(null, (qr90) rr90Var, function2, fetVar, iIntValue & 112);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        pv40 pv40Var = (pv40) this.b;
        l7m0 l7m0Var = (l7m0) this.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        mi70 mi70Var = ccb0.X1;
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            ylb0 ylb0Var = (ylb0) CollectionsKt.W(iIntValue, (a4x) l7m0Var.getValue());
            if (ylb0Var == null) {
                return Unit.f46060a;
            }
            obc.d(sdo0.f32043a.a(sdo0.a(ylb0Var, pv40Var, fetVar)), u1c.M(-778884729, new o090((Object) linkedHashMap, (Object) ylb0Var, (Object) pv40Var, (byte) 18), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        l7m0 l7m0Var = (l7m0) this.b;
        adz adzVar = (adz) this.c;
        Function1 function1 = (Function1) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            String str = ((ewi0) ((ucj0) l7m0Var.getValue()).d.get(iIntValue)).d;
            adzVar.getClass();
            fetVar.e0(461106520);
            HashMap map = adzVar.f703a;
            Object objA = map.get(str);
            if (objA == null) {
                objA = ddz.a(0, 0, fetVar, 0, 3);
                map.put(str, objA);
            }
            fetVar.r(false);
            w9x.u(((ewi0) ((ucj0) l7m0Var.getValue()).d.get(iIntValue)).c, (xcz) objA, function1, fetVar, 384);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        va00 va00Var = (va00) this.b;
        Function1 function1 = (Function1) this.c;
        Function1 function2 = (Function1) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((rk80) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            ua00 ua00Var = (ua00) CollectionsKt.W(iIntValue, va00Var.d);
            if ((ua00Var instanceof pa00) || (ua00Var instanceof qa00)) {
                fetVar.e0(-1739992393);
                zcl zclVar = qmk.f28987a;
                bdx.i(null, ua00Var, 12.0f, 0.0f, 0.0f, function1, function2, fetVar, 0);
                fetVar.r(false);
            } else {
                boolean zD = Intrinsics.d(ua00Var, sa00.f31870a);
                jm40 jm40Var = jm40.b;
                if (zD) {
                    fetVar.e0(2022091682);
                    zcl zclVar2 = qmk.f28987a;
                    jcb.l(s5x0.L(o7k0.e(jm40Var, 96.0f), 0.0f, 24.0f, 1), va00Var.f, false, null, fetVar, 0, 12);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2022099184);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
                    fetVar.r(true);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:388:0x098c  */
    /* JADX WARN: Code duplicated, block: B:389:0x099b  */
    /* JADX WARN: Code duplicated, block: B:392:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:393:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a7c A[PHI: r12
  0x0a7c: PHI (r12v5 a.ugd) = (r12v4 a.ugd), (r12v8 a.ugd) binds: [B:426:0x0a7f, B:422:0x0a77] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ugd ugdVar;
        String str;
        fet fetVar;
        Object obj5;
        t9v t9vVar;
        boolean zD;
        fet fetVar2;
        byte b = this.f23067a;
        jm40 jm40Var = jm40.b;
        byte b2 = 3;
        pcy pcyVar = e7z.u1;
        Object obj6 = ukd.f35823a;
        Object obj7 = null;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (b) {
            case 0:
                y82 y82Var = (y82) obj10;
                ArrayList arrayList = (ArrayList) obj9;
                qno0 qno0Var = (qno0) obj8;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                qek0 qek0Var = y82.V1;
                ((rk80) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    vrk0 vrk0Var = y82Var.L1;
                    if (vrk0Var == null) {
                        Intrinsics.h("specialEventTabContentFactory");
                        throw null;
                    }
                    n0q n0qVar = o7k0.c;
                    SpecialEventTabScreenParams specialEventTabScreenParams = (SpecialEventTabScreenParams) arrayList.get(iIntValue);
                    ebo0 ebo0VarA = qno0Var.a(iIntValue);
                    boolean zI = fetVar3.i(y82Var);
                    Object objP = fetVar3.P();
                    if (zI || objP == obj6) {
                        objP = new p82(y82Var, (byte) 0);
                        fetVar3.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zI2 = fetVar3.i(y82Var);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == obj6) {
                        objP2 = new m82(y82Var, (byte) 1);
                        fetVar3.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean zI3 = fetVar3.i(y82Var);
                    Object objP3 = fetVar3.P();
                    if (zI3 || objP3 == obj6) {
                        objP3 = new un6(y82Var, (byte) 13);
                        fetVar3.o0(objP3);
                    }
                    vrk0Var.a(n0qVar, y82Var, specialEventTabScreenParams, ebo0VarA, function1, function0, (xdr) objP3, fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                Function0 function2 = (Function0) obj10;
                Function1 function3 = (Function1) obj9;
                ugd ugdVar2 = (ugd) obj8;
                k7h k7hVar = (k7h) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                k7hVar.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar4.g(k7hVar) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    h7h h7hVarI0 = ahy.i0(k7hVar);
                    vbg vbgVar = k7hVar.i;
                    if (vbgVar != null) {
                        Iterator<E> it = k7hVar.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                ugdVar = ugdVar2;
                                if (((q5h) next).f28151a == k7hVar.d) {
                                    obj5 = next;
                                } else {
                                    ugdVar2 = ugdVar;
                                }
                            } else {
                                ugdVar = ugdVar2;
                                obj5 = null;
                            }
                        }
                        q5h q5hVar = (q5h) obj5;
                        if (q5hVar != null) {
                            str = q5hVar.b;
                        } else {
                            str = null;
                        }
                    } else {
                        ugdVar = ugdVar2;
                        if (h7hVarI0 != null) {
                            str = h7hVarI0.b;
                        } else {
                            str = null;
                        }
                    }
                    n0q n0qVar2 = o7k0.c;
                    mm40 mm40VarQ = i120.Q(n0qVar2, ((ThemeColors) fetVar4.k(zaq0.b)).getBackground(), jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    if (vbgVar != null) {
                        fetVar4.e0(898861926);
                        fetVar = fetVar4;
                        tke.r(vbgVar, function2, function3, u1c.M(-827758449, new eod(ugdVar, str, (byte) 27), fetVar4), fetVar, 3072);
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar4;
                        if (h7hVarI0 != null && h7hVarI0.h) {
                            fetVar.e0(898875011);
                            ugdVar.F(str, fetVar, 0);
                            fetVar.r(false);
                        } else if (h7hVarI0 != null) {
                            fetVar.e0(898878532);
                            lv00.y(h7hVarI0, function2, function3, fetVar, 0);
                            fetVar.r(false);
                        } else if (k7hVar.h) {
                            fetVar.e0(898888876);
                            boolean zG = fetVar.g(function2);
                            Object objP4 = fetVar.P();
                            if (zG || objP4 == obj6) {
                                objP4 = new y(function2, (byte) 20);
                                fetVar.o0(objP4);
                            }
                            wzb.j(i4w0.T(n0qVar2, (Function1) objP4), null, fetVar, 0, 2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(2096022105);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 2:
                th90 th90Var = (th90) obj10;
                th90 th90Var2 = (th90) obj9;
                String str2 = (String) obj8;
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                int i = (iIntValue6 & 6) == 0 ? iIntValue6 | (fetVar5.e(iIntValue4) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar5.U(i & 1, (i & 147) != 146)) {
                    for (Object obj11 : th90Var.keySet()) {
                        t9v t9vVar2 = (t9v) obj11;
                        if (t9vVar2.f33587a == iIntValue4 && t9vVar2.b == iIntValue5) {
                            obj7 = obj11;
                            t9vVar = (t9v) obj7;
                            if (t9vVar != null) {
                                zD = Intrinsics.d((Boolean) th90Var2.get(t9vVar), Boolean.TRUE);
                            } else {
                                zD = false;
                            }
                            u9v u9vVar = (u9v) th90Var.get(t9vVar);
                            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                            int iHashCode2 = Long.hashCode(fetVar5.T);
                            bh90 bh90VarM2 = fetVar5.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar5, jm40Var);
                            mkd.c0.getClass();
                            fetVar5.i0();
                            if (fetVar5.S) {
                                fetVar5.l(pcyVar);
                            } else {
                                fetVar5.r0();
                            }
                            jpm0.o(fetVar5, tj30VarC2, gqw0.x);
                            jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                            jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                            jpm0.n(fetVar5);
                            jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                            r9v.a(s5x0.J(o7k0.c, 0.5f), u9vVar, zD, str2, fetVar5, 6);
                            fetVar5.r(true);
                        }
                    }
                    t9vVar = (t9v) obj7;
                    if (t9vVar != null) {
                        zD = Intrinsics.d((Boolean) th90Var2.get(t9vVar), Boolean.TRUE);
                    } else {
                        zD = false;
                    }
                    u9v u9vVar2 = (u9v) th90Var.get(t9vVar);
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, jm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, gqw0.v);
                    r9v.a(s5x0.J(o7k0.c, 0.5f), u9vVar2, zD, str2, fetVar5, 6);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 3:
                l7m0 l7m0Var = (l7m0) obj10;
                l7m0 l7m0Var2 = (l7m0) obj9;
                Function1 function4 = (Function1) obj8;
                int iIntValue7 = ((Integer) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    fg10 fg10Var = (fg10) CollectionsKt.W(iIntValue7, ((mh10) l7m0Var.getValue()).d);
                    if (fg10Var == null) {
                        fetVar6.e0(-913864469);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-913864468);
                        sg10 sg10Var = fg10Var.b;
                        if (sg10Var instanceof rg10) {
                            fetVar6.e0(1095766734);
                            n0q n0qVar3 = o7k0.c;
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarI = s5x0.I(n0qVar3, new lh80(qmk.a(fetVar6).c, 8.0f, qmk.a(fetVar6).c, 0.0f));
                            zcl zclVar2 = qmk.i;
                            ugg0 ugg0Var = vgg0.f37379a;
                            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarI);
                            boolean zG2 = fetVar6.g(l7m0Var2);
                            Object objP5 = fetVar6.P();
                            if (zG2 || objP5 == obj6) {
                                objP5 = new ufp(l7m0Var2, (byte) 15);
                                fetVar6.o0(objP5);
                            }
                            mm40 mm40VarL = rq8.L(mm40VarE, (Function1) objP5);
                            tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                            int iHashCode4 = Long.hashCode(fetVar6.T);
                            bh90 bh90VarM4 = fetVar6.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar6, mm40VarL);
                            mkd.c0.getClass();
                            fetVar6.i0();
                            if (fetVar6.S) {
                                fetVar6.l(pcyVar);
                            } else {
                                fetVar6.r0();
                            }
                            jpm0.o(fetVar6, tj30VarC4, gqw0.x);
                            jpm0.o(fetVar6, bh90VarM4, gqw0.w);
                            jpm0.o(fetVar6, Integer.valueOf(iHashCode4), gqw0.y);
                            jpm0.n(fetVar6);
                            jpm0.o(fetVar6, mm40VarC3, gqw0.v);
                            mm40 mm40VarB = jr8.f16991a.b(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar6, false), 7), gqw0.e);
                            mdm mdmVar = ((rg10) sg10Var).f30411a;
                            boolean zG3 = fetVar6.g(function4);
                            Object objP6 = fetVar6.P();
                            if (zG3 || objP6 == obj6) {
                                objP6 = new pd10(function4, (byte) 4);
                                fetVar6.o0(objP6);
                            }
                            jcb.l(mm40VarB, mdmVar, false, (Function0) objP6, fetVar6, 0, 4);
                            fetVar6.r(true);
                            fetVar6.r(false);
                        } else {
                            if (!(sg10Var instanceof qg10)) {
                                throw b1j.f(-2042864133, fetVar6, false);
                            }
                            fetVar6.e0(1097763630);
                            mm40 mm40VarE0 = o2e.e0(o7k0.c, "LOYALTY_PROGRAM_LAZY_COLUMN_BASIC");
                            zcl zclVar3 = qmk.f28987a;
                            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                            lh80 lh80Var = new lh80(qmk.a(fetVar6).c, 8.0f, qmk.a(fetVar6).c, 96.0f);
                            boolean zG4 = fetVar6.g(sg10Var) | fetVar6.g(function4) | ((iIntValue8 & 112) == 32);
                            Object objP7 = fetVar6.P();
                            if (zG4 || objP7 == obj6) {
                                objP7 = new g18(sg10Var, function4, iIntValue7, (byte) 5);
                                fetVar6.o0(objP7);
                            }
                            b8k0.e(mm40VarE0, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP7, fetVar6, 6, 490);
                            fetVar6.r(false);
                        }
                        fetVar6.r(false);
                    }
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 4:
                fpk0 fpk0Var = (fpk0) obj10;
                ArrayList arrayList2 = (ArrayList) obj9;
                qno0 qno0Var2 = (qno0) obj8;
                int iIntValue9 = ((Integer) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                zie0 zie0Var = fpk0.V1;
                ((rk80) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar7.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar7.U(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    vrk0 vrk0Var2 = fpk0Var.L1;
                    if (vrk0Var2 == null) {
                        Intrinsics.h("specialEventTabContentFactory");
                        throw null;
                    }
                    n0q n0qVar4 = o7k0.c;
                    SpecialEventTabScreenParams specialEventTabScreenParams2 = (SpecialEventTabScreenParams) arrayList2.get(iIntValue9);
                    ebo0 ebo0VarA2 = qno0Var2.a(iIntValue9);
                    boolean zI4 = fetVar7.i(fpk0Var);
                    Object objP8 = fetVar7.P();
                    if (zI4 || objP8 == obj6) {
                        objP8 = new dpk0(fpk0Var, (byte) 1);
                        fetVar7.o0(objP8);
                    }
                    Function1 function5 = (Function1) objP8;
                    boolean zI5 = fetVar7.i(fpk0Var);
                    Object objP9 = fetVar7.P();
                    if (zI5 || objP9 == obj6) {
                        objP9 = new cpk0(fpk0Var, b2);
                        fetVar7.o0(objP9);
                    }
                    Function0 function6 = (Function0) objP9;
                    boolean zI6 = fetVar7.i(fpk0Var);
                    Object objP10 = fetVar7.P();
                    if (zI6 || objP10 == obj6) {
                        objP10 = new rqc0(fpk0Var, (byte) 13);
                        fetVar7.o0(objP10);
                    }
                    vrk0Var2.a(n0qVar4, fpk0Var, specialEventTabScreenParams2, ebo0VarA2, function5, function6, (xdr) objP10, fetVar7, 6);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 5:
                xhv xhvVar = (xhv) obj10;
                ccv0 ccv0Var = (ccv0) obj9;
                y3k0 y3k0Var = (y3k0) obj8;
                Object obj12 = (i3m0) obj2;
                fet fetVar8 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                uxs0 uxs0Var = ccv0.Q1;
                ((b53) obj).getClass();
                obj12.getClass();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= (iIntValue11 & 64) == 0 ? fetVar8.g(obj12) : fetVar8.i(obj12) ? 32 : 16;
                }
                if (!fetVar8.U(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                    fetVar8.X();
                } else if (obj12.equals(e3m0.f7145a)) {
                    fetVar8.e0(1710897713);
                    n0q n0qVar5 = o7k0.c;
                    int i2 = ccv0Var.G0().f46980a;
                    long j = ccv0Var.G0().b;
                    int i3 = ccv0Var.G0().c;
                    String str3 = ccv0Var.G0().d;
                    String str4 = ccv0.S1;
                    str4.getClass();
                    whv whvVar = new whv(i2, i3, j, str3, str4);
                    xhvVar.getClass();
                    n0qVar5.getClass();
                    Object objP11 = fetVar8.P();
                    if (objP11 == obj6) {
                        ComponentCallbacks2 application = ccv0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(vhv.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof vhv)) {
                                ze3Var = null;
                            }
                            vhv vhvVar = (vhv) ze3Var;
                            if (vhvVar != null) {
                                LinkedHashMap linkedHashMap = xbv0.f40619a;
                                String strB = xbv0.b(i2, efx.v(ccv0Var).f4046a);
                                Application application2 = ccv0Var.n0().getApplication();
                                application2.getClass();
                                ozi oziVarC = xbv0.c(application2, strB);
                                cad cadVar = vhvVar.f37449a;
                                ctf0 ctf0Var = vhvVar.b;
                                ctf0Var.getClass();
                                Object liiVar = new lii(cadVar, oziVarC, ctf0Var, whvVar);
                                fetVar8.o0(liiVar);
                                objP11 = liiVar;
                            }
                        }
                        jf4.n(b1j.i(vhv.class, "Cannot create dependency "));
                        return null;
                    }
                    lii liiVar2 = (lii) objP11;
                    Object objP12 = fetVar8.P();
                    if (objP12 == obj6) {
                        liiVar2.getClass();
                        objP12 = new x480();
                        fetVar8.o0(objP12);
                    }
                    x480 x480Var = (x480) objP12;
                    q0h0 q0h0Var = new q0h0((kii) liiVar2.e.get());
                    sgy sgyVarB = sre0.f32672a.b(eiv.class);
                    int i4 = eiv.r;
                    k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar8, 14);
                    boolean zI7 = fetVar8.i(k3t0VarX);
                    Object objP13 = fetVar8.P();
                    byte b3 = 6;
                    if (zI7 || objP13 == obj6) {
                        objP13 = new dbh(k3t0VarX, (byte) 6);
                        fetVar8.o0(objP13);
                    }
                    Function0 function7 = (Function0) objP13;
                    boolean zI8 = fetVar8.i(k3t0VarX);
                    Object objP14 = fetVar8.P();
                    if (zI8 || objP14 == obj6) {
                        objP14 = new dbh(k3t0VarX, (byte) 7);
                        fetVar8.o0(objP14);
                    }
                    v3c.A(function7, (Function0) objP14, null, fetVar8, 0, 4);
                    i3t0 i3t0Var = (i3t0) k3t0VarX;
                    aiv aivVar = (aiv) i3t0Var.y(fetVar8).getValue();
                    boolean zI9 = fetVar8.i(i3t0Var);
                    Object objP15 = fetVar8.P();
                    if (zI9 || objP15 == obj6) {
                        objP15 = new vi6(i3t0Var, (byte) 8);
                        fetVar8.o0(objP15);
                    }
                    plc.q(n0qVar5, aivVar, (Function1) objP15, u1c.M(1465698573, new qb(whvVar, x480Var, ccv0Var, b3), fetVar8), fetVar8, 3078);
                    fetVar8.r(false);
                } else {
                    if (!(obj12 instanceof h3m0)) {
                        throw b1j.f(332283643, fetVar8, false);
                    }
                    fetVar8.e0(1711831619);
                    n0q n0qVar6 = o7k0.c;
                    int i5 = ccv0Var.G0().f46980a;
                    h3m0 h3m0Var = (h3m0) obj12;
                    long j2 = ccv0Var.G0().b;
                    int i6 = ccv0Var.G0().c;
                    String str5 = ccv0.S1;
                    str5.getClass();
                    x3k0 x3k0Var = new x3k0(i5, h3m0Var, j2, i6, str5);
                    y3k0Var.getClass();
                    n0qVar6.getClass();
                    Object objP16 = fetVar8.P();
                    if (objP16 == obj6) {
                        ComponentCallbacks2 application3 = ccv0Var.n0().getApplication();
                        application3.getClass();
                        af3 af3Var2 = application3 instanceof af3 ? (af3) application3 : null;
                        if (af3Var2 != null) {
                            o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(w3k0.class);
                            ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                            if (!(ze3Var2 instanceof w3k0)) {
                                ze3Var2 = null;
                            }
                            w3k0 w3k0Var = (w3k0) ze3Var2;
                            if (w3k0Var != null) {
                                LinkedHashMap linkedHashMap2 = xbv0.f40619a;
                                String strB2 = xbv0.b(i5, efx.v(ccv0Var).f4046a);
                                Application application4 = ccv0Var.n0().getApplication();
                                application4.getClass();
                                ozi oziVarC2 = xbv0.c(application4, strB2);
                                cad cadVar2 = w3k0Var.f38506a;
                                ctf0 ctf0Var2 = w3k0Var.b;
                                ctf0Var2.getClass();
                                Object auiVar = new aui(cadVar2, oziVarC2, x3k0Var, ctf0Var2);
                                fetVar8.o0(auiVar);
                                objP16 = auiVar;
                            }
                        }
                        jf4.n(b1j.i(w3k0.class, "Cannot create dependency "));
                        return null;
                    }
                    aui auiVar2 = (aui) objP16;
                    Object objP17 = fetVar8.P();
                    if (objP17 == obj6) {
                        auiVar2.getClass();
                        objP17 = new x480();
                        fetVar8.o0(objP17);
                    }
                    x480 x480Var2 = (x480) objP17;
                    q0h0 q0h0Var2 = new q0h0((zti) auiVar2.e.get());
                    sgy sgyVarB2 = sre0.f32672a.b(b4k0.class);
                    int i7 = b4k0.s;
                    k3t0 k3t0VarX2 = n4c.X(sgyVarB2, null, q0h0Var2, fetVar8, 14);
                    boolean zI10 = fetVar8.i(k3t0VarX2);
                    Object objP18 = fetVar8.P();
                    if (zI10 || objP18 == obj6) {
                        objP18 = new dbh(k3t0VarX2, (byte) 23);
                        fetVar8.o0(objP18);
                    }
                    Function0 function8 = (Function0) objP18;
                    boolean zI11 = fetVar8.i(k3t0VarX2);
                    Object objP19 = fetVar8.P();
                    if (zI11 || objP19 == obj6) {
                        objP19 = new dbh(k3t0VarX2, (byte) 24);
                        fetVar8.o0(objP19);
                    }
                    v3c.A(function8, (Function0) objP19, null, fetVar8, 0, 4);
                    pz40 pz40VarY = ((i3t0) k3t0VarX2).y(fetVar8);
                    boolean zG5 = fetVar8.g(x3k0Var);
                    Object objP20 = fetVar8.P();
                    if (zG5 || objP20 == obj6) {
                        objP20 = new v480(i5, "", j2, i6, h3m0Var);
                        fetVar8.o0(objP20);
                    }
                    d7x.o(n0qVar6, (a4k0) pz40VarY.getValue(), u1c.M(1400351805, new sqc0((Object) x480Var2, (Object) ccv0Var, objP20, (byte) 12), fetVar8), fetVar8, 390);
                    fetVar8.r(false);
                }
                return Unit.f46060a;
            case 6:
                l49 l49Var = (l49) obj10;
                nek nekVar = (nek) obj9;
                xak xakVar = (xak) obj8;
                int iIntValue12 = ((Integer) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= fetVar9.e(iIntValue12) ? 32 : 16;
                }
                if (fetVar9.U(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    j49 j49Var = (j49) l49Var;
                    a4x a4xVar = j49Var.d;
                    GameBroadcastingParams gameBroadcastingParams = j49Var.f15872a;
                    i49 i49Var = (i49) a4xVar.get(iIntValue12);
                    if (i49Var != null) {
                        boolean z = i49Var instanceof g49;
                        jm40 jm40Var2 = jm40.b;
                        if (z) {
                            fetVar9.e0(-313050742);
                            jxs[] jxsVarArr = jxs.f17324a;
                            nekVar.e(jm40Var2, gameBroadcastingParams, new GameVideoUiConfig("16:9", R.dimen.corner_radius_16, -1, -1, GameVideoPlayerColorScheme.Theme.f46688a), fetVar9, 70);
                            fetVar9.r(false);
                        } else if (i49Var instanceof h49) {
                            fetVar9.e0(-312246571);
                            xakVar.o(jm40Var2, gameBroadcastingParams, fetVar9, 70);
                            fetVar9.r(false);
                        }
                    }
                    throw b1j.f(-979932975, fetVar9, false);
                }
                fetVar9.X();
                return Unit.f46060a;
            case 7:
                zja zjaVar = (zja) obj10;
                Function1 function9 = (Function1) obj9;
                Function1 function10 = (Function1) obj8;
                y5d y5dVar = (y5d) obj;
                mm40 mm40Var = (mm40) obj2;
                fet fetVar10 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, y5dVar, mm40Var);
                int i8 = (iD & 6) == 0 ? iD | (fetVar10.g(y5dVar) ? 4 : 2) : iD;
                if ((iD & 48) == 0) {
                    i8 |= fetVar10.g(mm40Var) ? 32 : 16;
                }
                if (fetVar10.U(i8 & 1, (i8 & 147) != 146)) {
                    q0x.l(y5dVar.b(mm40Var, true), zjaVar.f44473a, function9, function10, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 8:
                aka akaVar = (aka) obj10;
                Function1 function11 = (Function1) obj9;
                Function1 function12 = (Function1) obj8;
                y5d y5dVar2 = (y5d) obj;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar11 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, y5dVar2, mm40Var2);
                int i9 = (iD2 & 6) == 0 ? iD2 | (fetVar11.g(y5dVar2) ? 4 : 2) : iD2;
                if ((iD2 & 48) == 0) {
                    i9 |= fetVar11.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar11.U(i9 & 1, (i9 & 147) != 146)) {
                    s0x.l(y5dVar2.b(mm40Var2, true), akaVar.f1012a, function11, function12, fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 9:
                Function2 function13 = (Function2) obj10;
                vka vkaVar = (vka) obj9;
                d9z d9zVar = (d9z) obj8;
                udp0 udp0Var = (udp0) obj2;
                fet fetVar12 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((y5d) obj).getClass();
                udp0Var.getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= fetVar12.g(udp0Var) ? 32 : 16;
                }
                if (fetVar12.U(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    kcp0.a(null, udp0Var, function13, fetVar12, iIntValue14 & 112, 1);
                    kc5.F0(vkaVar.g, d9zVar, fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 10:
                pz40 pz40Var = (pz40) obj10;
                imo imoVar = ((ina) obj9).b;
                Function1 function14 = (Function1) obj8;
                y5d y5dVar3 = (y5d) obj;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar13 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, y5dVar3, mm40Var3);
                int i10 = (iD3 & 6) == 0 ? iD3 | (fetVar13.g(y5dVar3) ? 4 : 2) : iD3;
                if ((iD3 & 48) == 0) {
                    i10 |= fetVar13.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar13.U(i10 & 1, (i10 & 147) != 146)) {
                    zcl zclVar4 = qmk.f28987a;
                    qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN = s5x0.N(y5dVar3.b(mm40Var3, true), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    x5d x5dVarA = w5d.a(qw3Var2, gqw0.m, fetVar13, 0);
                    int iHashCode5 = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM5 = fetVar13.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar13, mm40VarN);
                    mkd.c0.getClass();
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(pcyVar);
                    } else {
                        fetVar13.r0();
                    }
                    jpm0.o(fetVar13, x5dVarA, gqw0.x);
                    jpm0.o(fetVar13, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar13, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar13);
                    jpm0.o(fetVar13, mm40VarC4, gqw0.v);
                    l7x.A(dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), pz40Var, fetVar13, 0);
                    if (imoVar == null) {
                        fetVar13.e0(-1502531252);
                        fetVar13.r(false);
                        fetVar2 = fetVar13;
                    } else {
                        fetVar13.e0(-1502531251);
                        jcb.s(new wkw(gqw0.n), (imo) androidx.compose.runtime.e.f(imoVar, fetVar13).getValue(), function14, fetVar13, 0, 0);
                        fetVar2 = fetVar13;
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 11:
                return a(obj, obj2, obj3, obj4);
            case 12:
                return b(obj, obj2, obj3, obj4);
            case 13:
                return g(obj, obj2, obj3, obj4);
            case 14:
                return c(obj, obj2, obj3, obj4);
            case 15:
                return h(obj, obj2, obj3, obj4);
            case 16:
                return i(obj, obj2, obj3, obj4);
            case 17:
                return l(obj, obj2, obj3, obj4);
            case 18:
                return m(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return o(obj, obj2, obj3, obj4);
            case 20:
                return p(obj, obj2, obj3, obj4);
            case 21:
                return r(obj, obj2, obj3, obj4);
            case 22:
                return s(obj, obj2, obj3, obj4);
            case 23:
                return t(obj, obj2, obj3, obj4);
            case 24:
                return u(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return v(obj, obj2, obj3, obj4);
            default:
                mm40 mm40Var4 = (mm40) obj10;
                q4t0 q4t0Var = (q4t0) obj9;
                Function1 function15 = (Function1) obj8;
                grh grhVar = (grh) obj;
                ycl yclVar = (ycl) obj2;
                fet fetVar14 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                grhVar.getClass();
                int i11 = (iIntValue15 & 6) == 0 ? iIntValue15 | (fetVar14.g(grhVar) ? 4 : 2) : iIntValue15;
                if ((iIntValue15 & 48) == 0) {
                    i11 |= fetVar14.d(yclVar.f42389a) ? 32 : 16;
                }
                if (fetVar14.U(i11 & 1, (i11 & 147) != 146)) {
                    feb.h(o7k0.s(mm40Var4, yclVar.f42389a), grhVar, q4t0Var.d, function15, fetVar14, (i11 << 3) & 112);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
        }
    }
}
