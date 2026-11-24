package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class c8 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3887a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c8(List list, Object obj, Object obj2, byte b) {
        this.f3887a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }

    private final Object A(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        ztv ztvVar = (ztv) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            z3a0 z3a0Var = (z3a0) this.b.get(iIntValue);
            fetVar.e0(-762732139);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            yvl yvlVar = new yvl(z3a0Var.i ? evq0.f8484a : evq0.b, false, 6);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean zG = fetVar.g(function1) | fetVar.i(z3a0Var) | fetVar.g(ztvVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new fuv(function1, z3a0Var, ztvVar, (byte) 0);
                fetVar.o0(objP);
            }
            nia0.v(mm40VarN, yvlVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarE = new x7z(1.0f, true).e(new ecu0(yx7Var));
            boolean zG2 = fetVar.g(function1) | fetVar.i(z3a0Var) | fetVar.g(ztvVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new fuv(function1, z3a0Var, ztvVar, (byte) 1);
                fetVar.o0(objP2);
            }
            mm40 mm40VarY = y860.Y(mm40VarE, false, null, null, (Function0) objP2, 15);
            String str = z3a0Var.j;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            aad.e(str, mm40VarY, y9q0.a(g1t0.k(), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, null, null, fetVar, 1597440, 936);
            fetVar.r(true);
            if (iIntValue == q3d.i(ztvVar.f44982a.b)) {
                fetVar.e0(-760909123);
                qxw.o(fetVar, o7k0.e(jm40Var, 10.0f));
                z = false;
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(-760830321);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object B(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        axv axvVar = (axv) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            wlq0 wlq0Var = (wlq0) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(-369372665);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            rqm rqmVar = new rqm((vui0) new tui0(rsm0.w(wlq0Var.f39369a, 0, fetVar), null), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, iIntValue == ((ArrayList) this.c).size() - 1 ? wui0.d : wui0.c, false, (e900) null, 446);
            boolean zI = fetVar.i(axvVar) | fetVar.i(wlq0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new nsr(axvVar, wlq0Var, (byte) 6);
                fetVar.o0(objP);
            }
            obc.q(mm40VarN, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            hq6 hq6Var = (hq6) this.b.get(iIntValue);
            fetVar.e0(1736371432);
            pba pbaVar = hq6Var.c;
            boolean z = ((sr6) this.d).d;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = i13.e;
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean zG = fetVar.g(function1) | fetVar.g(hq6Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new hr6(function1, hq6Var, (byte) 0);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG2 = fetVar.g(function1) | fetVar.g(hq6Var);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new hr6(function1, hq6Var, (byte) 1);
                fetVar.o0(objP3);
            }
            zjb.j(pbaVar, z, function2, function0, (Function0) objP3, fetVar, 3072, 1);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        od8 od8Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        id8 id8Var = (id8) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            rd8 rd8Var = (rd8) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(-1224845008);
            boolean z = (((i & 112) ^ 48) > 32 && fetVar.e(iIntValue)) || (i & 48) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                int size = id8Var.g.size();
                if (size == 1) {
                    od8Var = od8.d;
                } else if (iIntValue == 0) {
                    od8Var = od8.f25064a;
                } else {
                    od8Var = iIntValue == size - 1 ? od8.c : od8.b;
                }
                objP = od8Var;
                fetVar.o0(objP);
            }
            od8 od8Var2 = (od8) objP;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
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
            boolean zG = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new qr0(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            q8a.b(rd8Var, od8Var2, (Function1) objP2, fetVar, 6);
            if (iIntValue != id8Var.g.size() - 1) {
                fetVar.e0(1135102003);
                mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.h);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.N(mm40VarB, 64.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(1135396069);
                fetVar.r(false);
            }
            fetVar.r(true);
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
            sl8 sl8Var = (sl8) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(1649384388);
            p8a.h(null, sl8Var, (Function1) this.c, (Function1) this.d, fetVar, 64);
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
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            la9 la9Var = (la9) this.b.get(iIntValue);
            fetVar.e0(-1221680714);
            rqm rqmVar = la9Var.b;
            boolean z = iIntValue != q3d.i(((sa9) this.d).d);
            boolean zG = fetVar.g(function1) | fetVar.g(la9Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new qa9(function1, la9Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.g(la9Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new qa9(function1, la9Var, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(null, rqmVar, z, null, function0, null, (Function0) objP2, null, fetVar, 0, 169);
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
        Function1 function1 = (Function1) this.c;
        wpq wpqVar = (wpq) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            x95 x95Var = (x95) this.b.get(iIntValue);
            fetVar.e0(1230828774);
            rqm rqmVar = new rqm((vui0) new tui0(x95Var.c, null), (pui0) null, (pvi0) new nvi0(x95Var.e), (d4d) null, (tvi0) null, x95Var.d, false, (e900) null, 442);
            boolean zI = fetVar.i(wpqVar) | fetVar.g(function1) | fetVar.g(x95Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new mdc(wpqVar, function1, x95Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(wpqVar) | fetVar.g(function1) | fetVar.g(x95Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new mdc(wpqVar, function1, x95Var, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(null, rqmVar, true, null, function0, null, (Function0) objP2, null, fetVar, 384, 169);
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
        esc escVar = (esc) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            csc cscVar = (csc) ((a4x) this.b).get(iIntValue);
            fetVar.e0(981492798);
            rqm rqmVar = cscVar.b;
            boolean zI = fetVar.i(escVar) | fetVar.g(cscVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new h5((Object) escVar, (Object) cscVar, (byte) 19);
                fetVar.o0(objP);
            }
            obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 233);
            if (iIntValue != q3d.i(((jsc) ((l7m0) this.d).getValue()).f17045a)) {
                fetVar.e0(981836990);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(jm40.b, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(982063631);
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
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        l7m0 l7m0Var = (l7m0) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            beo0 beo0Var = (beo0) this.b.get(iIntValue);
            fetVar.e0(1279137186);
            int i2 = (i & 112) ^ 48;
            boolean z2 = (i2 > 32 && fetVar.e(iIntValue)) || (i & 48) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new tfe(iIntValue, (cgk0) this.d);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(jm40.b, null, null, false, null, (Function0) objP, 28);
            boolean zI = fetVar.i(beo0Var);
            if ((i2 <= 32 || !fetVar.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean zG = zI | z | fetVar.g(l7m0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ufe(beo0Var, iIntValue, l7m0Var);
                fetVar.o0(objP2);
            }
            fbc.b(R.style.Widget_Chips_Primary, 0, fetVar, mm40VarW, (Function1) objP2);
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
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            shh shhVar = (shh) this.b.get(iIntValue);
            fetVar.e0(491656401);
            ieb.k(((thh) this.d).f33962a, shhVar, (Function1) this.c, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wui0 wui0Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        vuh vuhVar = (vuh) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            j240 j240Var = (j240) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-1948608873);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).d, iIntValue == 0 ? 12.0f : 0.0f, xfn.a(fetVar).d, 0.0f, 8);
            nui0 nui0Var = new nui0(Integer.valueOf(j240Var.f15765a.getF47018a()), null, new m0x(j240Var.f15765a.getF47018a(), null, 6), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), null, null, 0.0f, 242);
            tui0 tui0Var = new tui0(j240Var.b, null);
            if (iIntValue == 0 && ((suh) vuhVar).e.size() == 1) {
                wui0Var = wui0.f39793a;
            } else if (iIntValue == 0) {
                wui0Var = wui0.b;
            } else {
                wui0Var = iIntValue == q3d.i(((suh) vuhVar).e) ? wui0.d : wui0.c;
            }
            rqm rqmVar = new rqm((vui0) tui0Var, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 444);
            boolean zG = fetVar.g(function1) | fetVar.g(j240Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new puh(function1, j240Var, (byte) 0);
                fetVar.o0(objP);
            }
            obc.q(mm40VarN, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
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
            etk etkVar = (etk) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-602611193);
            vfc.k(etkVar, ((ftk) ((htk) this.c)).f10115a, (Function2) this.d, fetVar, 0);
            fetVar.r(false);
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
            cql cqlVar = (cql) this.b.get(iIntValue);
            fetVar.e0(1532253702);
            ffb0.o(null, cqlVar, (Function2) this.c, (Function0) this.d, fetVar, 0);
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
            e8m e8mVar = (e8m) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-875845059);
            ozb.s((uzb) this.d, e8mVar, (Function1) this.c, fetVar, 8);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        jbm jbmVar = (jbm) this.d;
        Function2 function2 = (Function2) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            t2m t2mVar = (t2m) this.b.get(iIntValue);
            fetVar.e0(-1377927618);
            boolean zG = fetVar.g(function2) | fetVar.g(jbmVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new dbm(function2, jbmVar, (byte) 0);
                fetVar.o0(objP);
            }
            vdb.w(null, t2mVar, (Function1) objP, fetVar, 0, 1);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        r3n r3nVar = (r3n) this.d;
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
            vim vimVar = (vim) this.b.get(iIntValue);
            fetVar.e0(-1020657052);
            if (vimVar != null) {
                boolean z = vimVar instanceof uim;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-1020604508);
                    zcl zclVar = qmk.f28987a;
                    ewm0.h(0, r3nVar, fetVar, s5x0.L(o7k0.u(jm40Var, 0.0f, 200.0f, 1), 12.0f, 0.0f, 2), ((uim) vimVar).f35738a);
                    fetVar.r(false);
                } else if (vimVar instanceof tim) {
                    fetVar.e0(-1020169857);
                    zcl zclVar2 = qmk.f28987a;
                    ebc.D(o7k0.s(jm40Var, 128.0f), (tim) vimVar, r3nVar, (Function1) this.c, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(105622911, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            m9n m9nVar = (m9n) ((a4x) this.b).get(iIntValue);
            fetVar.e0(1327240297);
            zcl zclVar = qmk.f28987a;
            jcb.e(o7k0.s(jm40.b, 160.0f), m9nVar, (Function2) this.d, (Function1) this.c, null, fetVar, 0, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        vbn vbnVar = (vbn) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            wbn wbnVar = (wbn) ((a4x) this.b).get(iIntValue);
            fetVar.e0(583164460);
            rqm rqmVar = wbnVar.b;
            boolean zI = fetVar.i(vbnVar) | fetVar.g(wbnVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new tbn(vbnVar, wbnVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(vbnVar) | fetVar.g(wbnVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new tbn(vbnVar, wbnVar, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(null, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 169);
            if (iIntValue != q3d.i(((zbn) ((l7m0) this.d).getValue()).b)) {
                fetVar.e0(583620128);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(jm40.b, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(583846769);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            qln qlnVar = (qln) this.b.get(iIntValue);
            fetVar.e0(1316617651);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = g9z.b(g9zVar, jm40Var, null, 7);
            fue fueVar = qlnVar.d;
            String str = qlnVar.b.f41462a;
            boolean z2 = qlnVar.e;
            boolean zG = fetVar.g(function1) | fetVar.i(qlnVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new bnn(function1, qlnVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.i(qlnVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new bnn(function1, qlnVar, (byte) 1);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean zG3 = fetVar.g(function1);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = new cnn(function1, (byte) 0);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean zG4 = fetVar.g(function1) | fetVar.i(qlnVar);
            Object objP4 = fetVar.P();
            if (zG4 || objP4 == cl5Var) {
                objP4 = new bnn(function1, qlnVar, (byte) 2);
                fetVar.o0(objP4);
            }
            Function0 function4 = (Function0) objP4;
            boolean zG5 = fetVar.g(function1) | fetVar.i(qlnVar);
            Object objP5 = fetVar.P();
            if (zG5 || objP5 == cl5Var) {
                objP5 = new bnn(function1, qlnVar, (byte) 3);
                fetVar.o0(objP5);
            }
            acb.r(mm40VarB, fueVar, str, z2, function0, function2, function3, function4, (Function0) objP5, fetVar, 0);
            if (iIntValue != q3d.i(((bmn) this.d).f2843a)) {
                fetVar.e0(1318235974);
                z = false;
                tdc.n(g9z.b(g9zVar, jm40Var, null, 7), qlnVar.c, fetVar, 0);
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(1318439706);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
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
            y39 y39Var = (y39) this.b.get(iIntValue);
            fetVar.e0(1577422990);
            mm40 mm40VarC = g9z.c(g9zVar);
            if (y39Var != null) {
                if (y39Var instanceof w39) {
                    fetVar.e0(605077760);
                    nek nekVar = (nek) this.c;
                    nekVar.getClass();
                    z = false;
                    gmn0.a(mm40VarC, null, ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), 0L, 0.0f, 0.0f, null, u1c.M(2095276546, new htr0(nekVar, (w39) y39Var, (byte) 29), fetVar), fetVar, 12582912, 122);
                    fetVar.r(false);
                } else {
                    z = false;
                    if (y39Var instanceof x39) {
                        fetVar.e0(605085149);
                        xak xakVar = (xak) this.d;
                        xakVar.getClass();
                        gmn0.a(mm40VarC, null, ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), 0L, 0.0f, 0.0f, null, u1c.M(-1587608172, new onu0(xakVar, (x39) y39Var, (byte) 12), fetVar), fetVar, 12582912, 122);
                        fetVar.r(false);
                    }
                }
                fetVar.r(z);
            } else {
                z = false;
            }
            throw b1j.f(605075677, fetVar, z);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object z(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        jfo0 jfo0Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        xcz xczVar = (xcz) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            jfo0 jfo0Var2 = (jfo0) this.b.get(iIntValue);
            fetVar.e0(1495410517);
            Boolean boolValueOf = Boolean.valueOf(jfo0Var2.c);
            boolean zI = fetVar.i(jfo0Var2) | fetVar.g(xczVar);
            if ((((i & 112) ^ 48) <= 32 || !fetVar.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = zI | z;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                jfo0Var = jfo0Var2;
                j8v j8vVar = new j8v(jfo0Var, xczVar, iIntValue, null, (byte) 1);
                fetVar.o0(j8vVar);
                objP = j8vVar;
            } else {
                jfo0Var = jfo0Var2;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            wxl wxlVar = wxl.SECONDARY;
            boolean zI2 = fetVar.i(jfo0Var) | fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new d2p(jfo0Var, function1, (byte) 14);
                fetVar.o0(objP2);
            }
            v3c.n(null, wxlVar, (Function1) objP2, fetVar, 48, 1);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:230:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:348:0x080d  */
    /* JADX WARN: Code duplicated, block: B:383:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:456:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a3c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:467:0x0a3e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:469:0x0a43 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:470:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:537:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b8f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:543:0x0b91 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:545:0x0b96 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:546:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:547:0x0b9b  */
    /* JADX WARN: Code duplicated, block: B:549:0x0bb3  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        m8 m8Var;
        int i3;
        int i4;
        boolean z3;
        sdx sdxVar;
        int i5;
        fet fetVar;
        int i6;
        fet fetVar2;
        int i7;
        fet fetVar3;
        int i8;
        fet fetVar4;
        int i9;
        fet fetVar5;
        int i10;
        int i11;
        fet fetVar6;
        byte b = this.f3887a;
        Function0 function0 = e7z.u1;
        Object obj5 = ukd.f35823a;
        Object obj6 = this.d;
        List list = this.b;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                k8z k8zVar = (k8z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj7;
                rno0 rno0Var = (rno0) obj6;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar7.g(k8zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar7.e(iIntValue) ? 32 : 16;
                }
                if (fetVar7.U(i & 1, (i & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue);
                    fetVar7.e0(-25314062);
                    if (p6t0Var == null) {
                        fetVar7.e0(-23472787);
                        fetVar7.r(false);
                    } else if (p6t0Var instanceof pqv) {
                        fetVar7.e0(-25304794);
                        pqv pqvVar = (pqv) p6t0Var;
                        boolean zF0 = pqvVar.f0();
                        mm40 mm40VarN = jm40.b;
                        if (!zF0) {
                            zcl zclVar = qmk.f28987a;
                            mm40VarN = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        }
                        mm40 mm40Var = mm40VarN;
                        boolean zG = fetVar7.g(function1) | fetVar7.g(p6t0Var);
                        Object objP = fetVar7.P();
                        if (zG || objP == obj5) {
                            objP = new z7(function1, p6t0Var, (byte) 0);
                            fetVar7.o0(objP);
                        }
                        zvw.c(mm40Var, pqvVar, (Function0) objP, fetVar7, 0, 0);
                        fetVar7.r(false);
                    } else if (p6t0Var instanceof my30) {
                        fetVar7.e0(-24728287);
                        boolean zG2 = fetVar7.g(rno0Var);
                        Object objP2 = fetVar7.P();
                        if (zG2 || objP2 == obj5) {
                            objP2 = new w0(rno0Var, (byte) 5);
                            fetVar7.o0(objP2);
                        }
                        Function1 function2 = (Function1) objP2;
                        int i12 = iIntValue;
                        while (i12 > 0 && !((Boolean) function2.invoke(Integer.valueOf(i12 - 1))).booleanValue()) {
                            i12--;
                        }
                        int i13 = iIntValue;
                        while (i13 < rno0Var.b.size() - 1) {
                            int i14 = i13 + 1;
                            if (((Boolean) function2.invoke(Integer.valueOf(i14))).booleanValue()) {
                                i2 = iIntValue - i12;
                                int i15 = i13 - i12;
                                if (i2 % 2 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 = i2 / 2 == i15 / 2;
                                if (!z && z2) {
                                    m8Var = m8.c;
                                } else if (z && z2) {
                                    m8Var = m8.d;
                                } else if (z) {
                                    m8Var = m8.f21344a;
                                } else {
                                    m8Var = m8.b;
                                }
                                hp4.o(null, (my30) p6t0Var, m8Var, (Function1) obj7, fetVar7, 0);
                                fetVar7.r(false);
                            } else {
                                i13 = i14;
                            }
                        }
                        i2 = iIntValue - i12;
                        int i16 = i13 - i12;
                        if (i2 % 2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i2 / 2 == i16 / 2) {
                        }
                        if (!z) {
                            if (z) {
                                if (z) {
                                    m8Var = m8.f21344a;
                                } else {
                                    m8Var = m8.b;
                                }
                            } else if (z) {
                                m8Var = m8.f21344a;
                            } else {
                                m8Var = m8.b;
                            }
                        } else if (z) {
                            if (z) {
                                m8Var = m8.f21344a;
                            } else {
                                m8Var = m8.b;
                            }
                        } else if (z) {
                            m8Var = m8.f21344a;
                        } else {
                            m8Var = m8.b;
                        }
                        hp4.o(null, (my30) p6t0Var, m8Var, (Function1) obj7, fetVar7, 0);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-23472787);
                        fetVar7.r(false);
                    }
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 1:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                Function1 function3 = (Function1) obj7;
                sno0 sno0Var = (sno0) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | (fetVar8.g(k8zVar2) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= fetVar8.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar8.U(i3 & 1, (i3 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue3);
                    fetVar8.e0(1726341629);
                    if (p6t0Var2 == null) {
                        fetVar8.e0(1728148308);
                        fetVar8.r(false);
                    } else if (p6t0Var2 instanceof pqv) {
                        fetVar8.e0(1726352013);
                        pqv pqvVar2 = (pqv) p6t0Var2;
                        boolean zF1 = pqvVar2.f0();
                        mm40 mm40VarN2 = jm40.b;
                        if (!zF1) {
                            zcl zclVar2 = qmk.f28987a;
                            mm40VarN2 = s5x0.N(mm40VarN2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        }
                        mm40 mm40Var2 = mm40VarN2;
                        boolean zG3 = fetVar8.g(function3) | fetVar8.g(p6t0Var2);
                        Object objP3 = fetVar8.P();
                        if (zG3 || objP3 == obj5) {
                            objP3 = new z7(function3, p6t0Var2, (byte) 1);
                            fetVar8.o0(objP3);
                        }
                        zvw.c(mm40Var2, pqvVar2, (Function0) objP3, fetVar8, 0, 0);
                        fetVar8.r(false);
                    } else if (p6t0Var2 instanceof my30) {
                        fetVar8.e0(1726927404);
                        boolean zG4 = fetVar8.g(sno0Var);
                        Object objP4 = fetVar8.P();
                        if (zG4 || objP4 == obj5) {
                            objP4 = new w0(sno0Var, (byte) 6);
                            fetVar8.o0(objP4);
                        }
                        Function1 function4 = (Function1) objP4;
                        int i17 = iIntValue3;
                        while (i17 > 0 && !((Boolean) function4.invoke(Integer.valueOf(i17 - 1))).booleanValue()) {
                            i17--;
                        }
                        int i18 = iIntValue3;
                        while (i18 < sno0Var.b.size() - 1) {
                            int i19 = i18 + 1;
                            if (((Boolean) function4.invoke(Integer.valueOf(i19))).booleanValue()) {
                                i4 = iIntValue3 - i17;
                                int i20 = i18 - i17;
                                if (i4 % 2 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z2 = i4 / 2 == i20 / 2;
                                if (!z3 && z2) {
                                    sdxVar = sdx.c;
                                } else if (z3 && z2) {
                                    sdxVar = sdx.d;
                                } else if (z3) {
                                    sdxVar = sdx.f32052a;
                                } else {
                                    sdxVar = sdx.b;
                                }
                                kc5.k0(null, (my30) p6t0Var2, sdxVar, (Function1) obj7, fetVar8, 0);
                                fetVar8.r(false);
                            } else {
                                i18 = i19;
                            }
                        }
                        i4 = iIntValue3 - i17;
                        int i21 = i18 - i17;
                        if (i4 % 2 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i4 / 2 == i21 / 2) {
                        }
                        if (!z3) {
                            if (z3) {
                                if (z3) {
                                    sdxVar = sdx.f32052a;
                                } else {
                                    sdxVar = sdx.b;
                                }
                            } else if (z3) {
                                sdxVar = sdx.f32052a;
                            } else {
                                sdxVar = sdx.b;
                            }
                        } else if (z3) {
                            if (z3) {
                                sdxVar = sdx.f32052a;
                            } else {
                                sdxVar = sdx.b;
                            }
                        } else if (z3) {
                            sdxVar = sdx.f32052a;
                        } else {
                            sdxVar = sdx.b;
                        }
                        kc5.k0(null, (my30) p6t0Var2, sdxVar, (Function1) obj7, fetVar8, 0);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(1728148308);
                        fetVar8.r(false);
                    }
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i5 = iIntValue6 | (fetVar9.g(g9zVar) ? 4 : 2);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= fetVar9.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar9.U(i5 & 1, (i5 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) list.get(iIntValue5);
                    fetVar9.e0(-914033565);
                    if (p6t0Var3 == null) {
                        fetVar = fetVar9;
                        fetVar.e0(-913432941);
                        fetVar.r(false);
                    } else if (p6t0Var3 instanceof pqv) {
                        fetVar9.e0(-913995498);
                        j47.G(null, (pqv) p6t0Var3, (Function1) obj7, fetVar9, 0);
                        fetVar9.r(false);
                        fetVar = fetVar9;
                    } else if (p6t0Var3 instanceof my30) {
                        fetVar9.e0(-913795672);
                        p6t0 p6t0Var4 = (p6t0) CollectionsKt.W(iIntValue5 + 1, ((tno0) obj6).b);
                        j47.b0(null, (my30) p6t0Var3, p6t0Var4 == null || (p6t0Var4 instanceof pqv), (Function1) obj7, fetVar9, 0);
                        fetVar = fetVar9;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar9;
                        fetVar.e0(-913432941);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i6 = iIntValue8 | (fetVar10.g(g9zVar2) ? 4 : 2);
                } else {
                    i6 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i6 |= fetVar10.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar10.U(i6 & 1, (i6 & 147) != 146)) {
                    p6t0 p6t0Var5 = (p6t0) list.get(iIntValue7);
                    fetVar10.e0(-744594115);
                    if (p6t0Var5 == null) {
                        fetVar2 = fetVar10;
                        fetVar2.e0(-744127070);
                        fetVar2.r(false);
                    } else if (p6t0Var5 instanceof pqv) {
                        fetVar10.e0(-744551739);
                        jd8.b(null, (pqv) p6t0Var5, (Function1) obj7, fetVar10, 0);
                        fetVar10.r(false);
                        fetVar2 = fetVar10;
                    } else if (p6t0Var5 instanceof my30) {
                        fetVar10.e0(-744355261);
                        jd8.J(null, (my30) p6t0Var5, (p6t0) CollectionsKt.W(iIntValue7 + 1, ((uno0) obj6).b), (Function1) obj7, fetVar10, 0);
                        fetVar2 = fetVar10;
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar10;
                        fetVar2.e0(-744127070);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i7 = iIntValue10 | (fetVar11.g(g9zVar3) ? 4 : 2);
                } else {
                    i7 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i7 |= fetVar11.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar11.U(i7 & 1, (i7 & 147) != 146)) {
                    am0 am0Var = (am0) ((a4x) list).get(iIntValue9);
                    fetVar11.e0(1360244272);
                    if (am0Var != null) {
                        if (am0Var instanceof zl0) {
                            fetVar11.e0(1360335690);
                            y9a.G(((zl0) am0Var).f44557a, fetVar11, 0);
                            fetVar11.r(false);
                            fetVar3 = fetVar11;
                        } else if (am0Var instanceof xl0) {
                            fetVar11.e0(1360522031);
                            y9a.n(null, (xl0) am0Var, (d9z) obj6, (Function1) obj7, fetVar11, 0);
                            fetVar3 = fetVar11;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar11;
                            if (am0Var instanceof yl0) {
                                fetVar3.e0(-371742742);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    } else {
                        fetVar3 = fetVar11;
                    }
                    throw b1j.f(-371763149, fetVar3, false);
                }
                fetVar11.X();
                return Unit.f46060a;
            case 5:
                Object obj8 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                t42 t42Var = (t42) obj6;
                if ((iIntValue12 & 6) == 0) {
                    i8 = iIntValue12 | (fetVar12.g(obj8) ? 4 : 2);
                } else {
                    i8 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i8 |= fetVar12.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar12.U(i8 & 1, (i8 & 147) != 146)) {
                    inh0 inh0Var = (inh0) ((a4x) list).get(iIntValue11);
                    fetVar12.e0(1871508619);
                    if (inh0Var.c != s3q.f31571a || ((wul) obj7) == null) {
                        fet fetVar13 = fetVar12;
                        fetVar13.e0(1872717556);
                        boolean zI = fetVar13.i(t42Var);
                        Object objP5 = fetVar13.P();
                        if (zI || objP5 == obj5) {
                            objP5 = new s42(t42Var, (byte) 1);
                            fetVar13.o0(objP5);
                        }
                        jdk0 jdk0Var = t42.p2;
                        t42Var.P0(inh0Var, (Function2) objP5, fetVar13, 0);
                        fetVar13.r(false);
                        fetVar4 = fetVar13;
                    } else {
                        fetVar12.e0(1871573191);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar12, 0);
                        int iHashCode = Long.hashCode(fetVar12.T);
                        bh90 bh90VarM = fetVar12.m();
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarC0 = kbc.c0(fetVar12, jm40Var);
                        mkd.c0.getClass();
                        fetVar12.i0();
                        if (fetVar12.S) {
                            fetVar12.l(function0);
                        } else {
                            fetVar12.r0();
                        }
                        jpm0.o(fetVar12, x5dVarA, gqw0.x);
                        jpm0.o(fetVar12, bh90VarM, gqw0.w);
                        jpm0.o(fetVar12, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar12);
                        jpm0.o(fetVar12, mm40VarC0, gqw0.v);
                        boolean zI2 = fetVar12.i(t42Var);
                        Object objP6 = fetVar12.P();
                        if (zI2 || objP6 == obj5) {
                            objP6 = new s42(t42Var, (byte) 0);
                            fetVar12.o0(objP6);
                        }
                        jdk0 jdk0Var2 = t42.p2;
                        t42Var.P0(inh0Var, (Function2) objP6, fetVar12, 0);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                        wul wulVar = (wul) obj7;
                        boolean zI3 = fetVar12.i(t42Var);
                        Object objP7 = fetVar12.P();
                        if (zI3 || objP7 == obj5) {
                            objP7 = new f80(t42Var, (byte) 10);
                            fetVar12.o0(objP7);
                        }
                        qzb.n(mm40VarD, wulVar, (Function0) objP7, fetVar12, 0, 0);
                        fet fetVar14 = fetVar12;
                        fetVar14.r(true);
                        fetVar14.r(false);
                        fetVar4 = fetVar14;
                    }
                    fetVar4.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 6:
                k8z k8zVar3 = (k8z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                nhe nheVar = (nhe) obj6;
                Function1 function5 = (Function1) obj7;
                if ((iIntValue14 & 6) == 0) {
                    i9 = iIntValue14 | (fetVar15.g(k8zVar3) ? 4 : 2);
                } else {
                    i9 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i9 |= fetVar15.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar15.U(i9 & 1, (i9 & 147) != 146)) {
                    on2 on2Var = (on2) list.get(iIntValue13);
                    fetVar15.e0(107070216);
                    if (on2Var != null) {
                        boolean z4 = on2Var instanceof ln2;
                        jm40 jm40Var2 = jm40.b;
                        if (z4) {
                            fetVar15.e0(107058621);
                            nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar15).e - xfn.a(fetVar15).d, 0.0f, 2), ((ln2) on2Var).f20324a, kjm.f18392a, null, null, null, fetVar15, 384, 56);
                            fetVar5 = fetVar15;
                            fetVar5.r(false);
                        } else {
                            fetVar5 = fetVar15;
                            if (on2Var instanceof nn2) {
                                fetVar5.e0(107514910);
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                tdp tdpVar = ((nn2) on2Var).f23799a;
                                boolean zG5 = fetVar5.g(on2Var) | fetVar5.g(function5);
                                Object objP8 = fetVar5.P();
                                if (zG5 || objP8 == obj5) {
                                    objP8 = new ci2(on2Var, function5, (byte) 9);
                                    fetVar5.o0(objP8);
                                }
                                ckb.x(mm40VarN3, tdpVar, (Function1) objP8, fetVar5, 0);
                                fetVar5.r(false);
                            } else if (on2Var instanceof kn2) {
                                fetVar5.e0(1250413057);
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                mdm mdmVar = ((kn2) on2Var).f18564a;
                                boolean zG6 = fetVar5.g(function5);
                                Object objP9 = fetVar5.P();
                                if (zG6 || objP9 == obj5) {
                                    objP9 = new rr0(function5, (byte) 12);
                                    fetVar5.o0(objP9);
                                }
                                jcb.l(mm40VarN4, mdmVar, true, (Function0) objP9, fetVar5, 384, 0);
                                fetVar5.r(false);
                            } else if (on2Var instanceof mn2) {
                                fetVar5.e0(108538592);
                                a2n a2nVar = ((mn2) on2Var).f22069a;
                                if (a2nVar == null) {
                                    fetVar5.e0(109611068);
                                    fetVar5.r(false);
                                } else if (a2nVar instanceof y56) {
                                    fetVar5.e0(108582612);
                                    zcl zclVar6 = qmk.f28987a;
                                    mm40 mm40VarN5 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                    y56 y56Var = (y56) a2nVar;
                                    boolean z5 = nheVar.d;
                                    boolean zG7 = fetVar5.g(function5);
                                    Object objP10 = fetVar5.P();
                                    if (zG7 || objP10 == obj5) {
                                        objP10 = new qr0(function5, (byte) 12);
                                        fetVar5.o0(objP10);
                                    }
                                    vcc.i(mm40VarN5, y56Var, z5, (Function1) objP10, null, fetVar5, 0, 16);
                                    fetVar5.r(false);
                                } else if (a2nVar instanceof c2o0) {
                                    fetVar5.e0(109116432);
                                    zcl zclVar7 = qmk.f28987a;
                                    mm40 mm40VarN6 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                    c2o0 c2o0Var = (c2o0) a2nVar;
                                    boolean z6 = nheVar.d;
                                    boolean zG8 = fetVar5.g(function5);
                                    Object objP11 = fetVar5.P();
                                    if (zG8 || objP11 == obj5) {
                                        objP11 = new qr0(function5, (byte) 13);
                                        fetVar5.o0(objP11);
                                    }
                                    hkb.n(mm40VarN6, c2o0Var, z6, (Function1) objP11, null, fetVar5, 0, 16);
                                    fetVar5.r(false);
                                } else {
                                    fetVar5.e0(109611068);
                                    fetVar5.r(false);
                                }
                                fetVar5.r(false);
                            }
                        }
                        fetVar5.r(false);
                    } else {
                        fetVar5 = fetVar15;
                    }
                    throw b1j.f(1250379867, fetVar5, false);
                }
                fetVar15.X();
                return Unit.f46060a;
            case 7:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                g9zVar4.getClass();
                if ((iIntValue16 & 6) == 0) {
                    i10 = iIntValue16 | (fetVar16.g(g9zVar4) ? 4 : 2);
                } else {
                    i10 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i10 |= fetVar16.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar16.U(i10 & 1, (i10 & 147) != 146)) {
                    q84 q84Var = (q84) ((a4x) list).get(iIntValue15);
                    fetVar16.e0(185788661);
                    m0x0.e(null, q84Var, !Intrinsics.d(q84Var, CollectionsKt.f0((a4x) obj6)), (Function1) obj7, fetVar16, 0);
                    fetVar16.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 8:
                return a(obj, obj2, obj3, obj4);
            case 9:
                return b(obj, obj2, obj3, obj4);
            case 10:
                return c(obj, obj2, obj3, obj4);
            case 11:
                return g(obj, obj2, obj3, obj4);
            case 12:
                return h(obj, obj2, obj3, obj4);
            case 13:
                return i(obj, obj2, obj3, obj4);
            case 14:
                return l(obj, obj2, obj3, obj4);
            case 15:
                return m(obj, obj2, obj3, obj4);
            case 16:
                return o(obj, obj2, obj3, obj4);
            case 17:
                return p(obj, obj2, obj3, obj4);
            case 18:
                return r(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return s(obj, obj2, obj3, obj4);
            case 20:
                return t(obj, obj2, obj3, obj4);
            case 21:
                return u(obj, obj2, obj3, obj4);
            case 22:
                return v(obj, obj2, obj3, obj4);
            case 23:
                return w(obj, obj2, obj3, obj4);
            case 24:
                return x(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return y(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return z(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return A(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return B(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar17 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                vzv vzvVar = (vzv) obj7;
                if ((iIntValue18 & 6) == 0) {
                    i11 = iIntValue18 | (fetVar17.g(g9zVar5) ? 4 : 2);
                } else {
                    i11 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i11 |= fetVar17.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar17.U(i11 & 1, (i11 & 147) != 146)) {
                    i1w i1wVar = (i1w) ((i4) list).get(iIntValue17);
                    fetVar17.e0(987675257);
                    if (i1wVar instanceof g1w) {
                        fetVar17.e0(987593199);
                        g1w g1wVar = (g1w) i1wVar;
                        boolean z7 = g1wVar.b;
                        boolean zG9 = fetVar17.g(i1wVar) | fetVar17.i(vzvVar);
                        Object objP12 = fetVar17.P();
                        if (zG9 || objP12 == obj5) {
                            objP12 = new nsr(vzvVar, g1wVar, (byte) 7);
                            fetVar17.o0(objP12);
                        }
                        ihm0.b(0, fetVar17, null, (Function0) objP12, z7);
                        fetVar17.r(false);
                        fetVar6 = fetVar17;
                    } else {
                        boolean z8 = i1wVar instanceof e1w;
                        jm40 jm40Var3 = jm40.b;
                        zfi0 zfi0Var = zfi0.f44303a;
                        if (z8) {
                            fetVar17.e0(988379328);
                            wui0 wui0Var = iIntValue17 == q3d.i(((f0w) obj6).f8735a) ? wui0.d : wui0.c;
                            e1w e1wVar = (e1w) i1wVar;
                            sqt sqtVar = vzv.p2;
                            k3t0 k3t0VarP0 = vzvVar.P0();
                            boolean zI4 = fetVar17.i(k3t0VarP0);
                            Object objP13 = fetVar17.P();
                            if (zI4 || objP13 == obj5) {
                                objP13 = new vft(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                                fetVar17.o0(objP13);
                            }
                            vbc.C(null, wui0Var, e1wVar, (Function1) ((jhy) objP13), fetVar17, 0);
                            if (e1wVar.d) {
                                fetVar17.e0(989046665);
                                mm40 mm40VarD2 = o7k0.d(jm40Var3, 1.0f);
                                zcl zclVar8 = qmk.f28987a;
                                mbc.o(zfi0Var, s5x0.L(mm40VarD2, 16.0f, 0.0f, 2), false, fetVar17, 6, 4);
                                fetVar6 = fetVar17;
                                fetVar6.r(false);
                            } else {
                                fetVar6 = fetVar17;
                                fetVar6.e0(989443899);
                                fetVar6.r(false);
                            }
                            fetVar6.r(false);
                        } else {
                            fetVar6 = fetVar17;
                            if (Intrinsics.d(i1wVar, f1w.f8786a)) {
                                fetVar6.e0(989608509);
                                mm40 mm40VarD3 = o7k0.d(jm40Var3, 1.0f);
                                zcl zclVar9 = qmk.f28987a;
                                mbc.o(zfi0Var, s5x0.L(mm40VarD3, 16.0f, 0.0f, 2), false, fetVar6, 6, 4);
                                fetVar6.r(false);
                            } else if (i1wVar instanceof h1w) {
                                fetVar6.e0(990071153);
                                zcl zclVar10 = qmk.f28987a;
                                iym0.f(0, fetVar6, s5x0.L(jm40Var3, 16.0f, 0.0f, 2), ((h1w) i1wVar).f12303a);
                                fetVar6.r(false);
                            } else {
                                if (!(i1wVar instanceof d1w)) {
                                    throw b1j.f(2110070474, fetVar6, false);
                                }
                                fetVar6.e0(990543748);
                                mm40 mm40VarD4 = o7k0.d(jm40Var3, 1.0f);
                                zcl zclVar11 = qmk.f28987a;
                                mm40 mm40VarJ = s5x0.J(mm40VarD4, 16.0f);
                                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar6, 0);
                                int iHashCode2 = Long.hashCode(fetVar6.T);
                                bh90 bh90VarM2 = fetVar6.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarJ);
                                mkd.c0.getClass();
                                fetVar6.i0();
                                if (fetVar6.S) {
                                    fetVar6.l(function0);
                                } else {
                                    fetVar6.r0();
                                }
                                jpm0.o(fetVar6, thg0VarA, gqw0.x);
                                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                                jpm0.n(fetVar6);
                                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                                fetVar6.e0(2077425033);
                                ListIterator listIterator = ((d1w) i1wVar).f5331a.listIterator(0);
                                while (listIterator.hasNext()) {
                                    mn8 mn8Var = (mn8) listIterator.next();
                                    if (mn8Var != null) {
                                        if (mn8Var instanceof kn8) {
                                            fetVar6.e0(-1949965958);
                                            if (1.0f <= 0.0d) {
                                                vcx.a("invalid weight; must be greater than zero");
                                            }
                                            x7z x7zVar = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                            kn8 kn8Var = (kn8) mn8Var;
                                            wul wulVar2 = new wul(lul.e, oe9.f25112a, new ue9(kn8Var.f18571a), kn8Var.b, false, true);
                                            boolean zI5 = fetVar6.i(vzvVar);
                                            Object objP14 = fetVar6.P();
                                            if (zI5 || objP14 == obj5) {
                                                objP14 = new uzv(vzvVar, (byte) 0);
                                                fetVar6.o0(objP14);
                                            }
                                            qzb.n(x7zVar, wulVar2, (Function0) objP14, fetVar6, 0, 0);
                                            fetVar6.r(false);
                                        } else if (mn8Var instanceof ln8) {
                                            fetVar6.e0(-1948578150);
                                            if (1.0f <= 0.0d) {
                                                vcx.a("invalid weight; must be greater than zero");
                                            }
                                            x7z x7zVar2 = new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                                            ln8 ln8Var = (ln8) mn8Var;
                                            wul wulVar3 = new wul(nul.e, oe9.f25112a, new ue9(ln8Var.f20332a), ln8Var.b, false, true);
                                            boolean zI6 = fetVar6.i(vzvVar);
                                            Object objP15 = fetVar6.P();
                                            if (zI6 || objP15 == obj5) {
                                                objP15 = new uzv(vzvVar, (byte) 1);
                                                fetVar6.o0(objP15);
                                            }
                                            qzb.n(x7zVar2, wulVar3, (Function0) objP15, fetVar6, 0, 0);
                                            fetVar6.r(false);
                                        }
                                    }
                                    throw b1j.f(-339998381, fetVar6, false);
                                }
                                ohs0.x(fetVar6, false, true, false);
                            }
                        }
                    }
                    fetVar6.r(false);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ c8(List list, Object obj, Function1 function1, byte b) {
        this.f3887a = b;
        this.b = list;
        this.d = obj;
        this.c = function1;
    }
}
