package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gn implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11564a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ gn(Function1 function1, byte b) {
        this.f11564a = b;
        this.b = function1;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        p6t0 p6t0Var = (p6t0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        p6t0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
        }
        byte b = 18;
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else if (p6t0Var instanceof psv) {
            fetVar.e0(1480003751);
            ozb.z((psv) p6t0Var, null, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof w1g) {
            fetVar.e0(1480096193);
            o2e.s((w1g) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof amg) {
            fetVar.e0(1480191580);
            u1c.l((amg) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof j1h) {
            fetVar.e0(1480300979);
            o5o.a((j1h) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof kq20) {
            fetVar.e0(1480417787);
            kbc.p((kq20) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof qq20) {
            fetVar.e0(1480524861);
            mbc.t((qq20) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof rr40) {
            fetVar.e0(1480626603);
            x2x.d((rr40) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof sah) {
            fetVar.e0(1480713403);
            vbc.A((sah) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof y7o0) {
            fetVar.e0(1480826491);
            vic.k((y7o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof b8o0) {
            fetVar.e0(1480933441);
            plc.o((b8o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof fus0) {
            fetVar.e0(1481032672);
            hew0.F((fus0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof aus0) {
            fetVar.e0(1481135623);
            iym0.i((aus0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof s8o0) {
            fetVar.e0(1481227972);
            jeb.v((s8o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof npg0) {
            fetVar.e0(1481323700);
            vfc.t((npg0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof jeh0) {
            fetVar.e0(1481431518);
            agc.u((jeh0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof xdu0) {
            fetVar.e0(1481538809);
            lgb.o((xdu0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof h9j) {
            fetVar.e0(1481641822);
            wzb.v((h9j) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof wng) {
            fetVar.e0(1481741115);
            v3c.s((wng) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof eia) {
            fetVar.e0(1481845492);
            qzb.t((eia) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof xkk) {
            fetVar.e0(1481953310);
            e3c.k((xkk) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof iyh0) {
            fetVar.e0(1482046620);
            hic.p((iyh0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof y5x) {
            fetVar.e0(1482149013);
            fbc.z((y5x) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof g8o0) {
            fetVar.e0(1482267867);
            rcb.E((g8o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof j8o0) {
            fetVar.e0(1482374817);
            vdb.C((j8o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof poy) {
            fetVar.e0(1482472188);
            ibc.r((poy) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof lav) {
            fetVar.e0(1482571078);
            vbc.G((lav) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof oba) {
            fetVar.e0(1482666217);
            eeq.l((oba) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof vqb0) {
            fetVar.e0(1482762038);
            qcc.n((vqb0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof pqb0) {
            fetVar.e0(1482875126);
            xbc.r((pqb0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof xrp) {
            fetVar.e0(1482990942);
            x0x.j((xrp) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof r0o0) {
            fetVar.e0(1483107285);
            ozb.x((r0o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof t0o0) {
            fetVar.e0(1483226139);
            v4o.a((t0o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof v5o0) {
            fetVar.e0(1483350201);
            n4c.p((v5o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof w5o0) {
            fetVar.e0(1483470047);
            d5c.p((w5o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof v0o0) {
            fetVar.e0(1483581337);
            sac.s((v0o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof x0o0) {
            fetVar.e0(1483692255);
            pzb.r((x0o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof l6o0) {
            fetVar.e0(1483813496);
            obc.t((l6o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof m6o0) {
            fetVar.e0(1483935326);
            qbc.o((m6o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof m8o0) {
            fetVar.e0(1484045531);
            ebc.v((m8o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof p8o0) {
            fetVar.e0(1484152481);
            feb.s((p8o0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof fvu0) {
            fetVar.e0(1484263895);
            ahb.l((fvu0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof gvu0) {
            fetVar.e0(1484378781);
            thb.k((gvu0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof m2o) {
            fetVar.e0(1484492830);
            ieb.u((m2o) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof fjv) {
            fetVar.e0(1484591565);
            acb.w((fjv) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof w0p) {
            fetVar.e0(1484684937);
            agc.v((w0p) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof kuf) {
            fetVar.e0(1484770032);
            gkb.d((kuf) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof m960) {
            fetVar.e0(1484848400);
            oja0.J((m960) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof cjj0) {
            fetVar.e0(1484931356);
            acb.u((cjj0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof kij0) {
            fetVar.e0(1485044692);
            lmc.s((kij0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else if (p6t0Var instanceof iij0) {
            fetVar.e0(1485172753);
            obb.w((iij0) p6t0Var, fetVar, iIntValue & 14);
            fetVar.r(false);
        } else {
            boolean z = p6t0Var instanceof boo0;
            Function1 function1 = this.b;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1485283578);
                boo0 boo0Var = (boo0) p6t0Var;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new btm(function1, (byte) 17);
                    fetVar.o0(objP);
                }
                cem0.g(null, boo0Var, (Function1) objP, fetVar, (iIntValue << 3) & 112, 1);
                fetVar.r(false);
            } else if (p6t0Var instanceof zhf) {
                fetVar.e0(1485537344);
                uzb.A((zhf) p6t0Var, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof mgf) {
                fetVar.e0(1485635676);
                vzb.l((mgf) p6t0Var, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof sfg0) {
                fetVar.e0(1485734783);
                vcc.l((sfg0) p6t0Var, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof ifg0) {
                fetVar.e0(1485840214);
                tdc.o((ifg0) p6t0Var, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof ifa) {
                fetVar.e0(1485953488);
                ifa ifaVar = (ifa) p6t0Var;
                boolean zG2 = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new btm(function1, b);
                    fetVar.o0(objP2);
                }
                ccq0.g(ifaVar, (Function1) objP2, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof p18) {
                fetVar.e0(1486221359);
                p18 p18Var = (p18) p6t0Var;
                boolean zG3 = fetVar.g(function1);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new btm(function1, (byte) 19);
                    fetVar.o0(objP3);
                }
                epv0.e(p18Var, (Function1) objP3, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof m52) {
                fetVar.e0(1486502281);
                m52 m52Var = (m52) p6t0Var;
                boolean zG4 = fetVar.g(function1);
                Object objP4 = fetVar.P();
                if (zG4 || objP4 == cl5Var) {
                    objP4 = new btm(function1, (byte) 20);
                    fetVar.o0(objP4);
                }
                f1t0.b(null, m52Var, (Function1) objP4, fetVar, (iIntValue << 3) & 112);
                fetVar.r(false);
            } else if (p6t0Var instanceof ajg0) {
                fetVar.e0(1486771888);
                tfx.l((ajg0) p6t0Var, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (p6t0Var instanceof cmk0) {
                fetVar.e0(1486854844);
                jcb.r((cmk0) p6t0Var, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else {
                fetVar.e0(1486939443);
                fetVar.r(false);
            }
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(xsm0.s(R.string.limits_try_again, fetVar)), true, false, false);
            Function1 function1 = this.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new xwy(function1, (byte) 28);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(xsm0.s(R.string.exit_dialog_title, fetVar)), true, false, false);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new xwy(function1, (byte) 29);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD, wulVar2, (Function0) objP2, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(xsm0.s(R.string.limits_try_again, fetVar)), true, false, false);
            Function1 function1 = this.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new yqz(function1, (byte) 4);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(xsm0.s(R.string.exit_dialog_title, fetVar)), true, false, false);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new yqz(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD, wulVar2, (Function0) objP2, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(xsm0.s(R.string.limits_try_again, fetVar)), true, false, false);
            Function1 function1 = this.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new yqz(function1, (byte) 6);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(xsm0.s(R.string.exit_dialog_title, fetVar)), true, false, false);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new yqz(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD, wulVar2, (Function0) objP2, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(xsm0.s(R.string.limits_try_again, fetVar)), true, false, false);
            Function1 function1 = this.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new yqz(function1, (byte) 14);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(xsm0.s(R.string.exit_dialog_title, fetVar)), true, false, false);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new yqz(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD, wulVar2, (Function0) objP2, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            float f = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, f, 12.0f);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(xsm0.s(R.string.confirm, fetVar)), true, false, false);
            Function1 function1 = this.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new yqz(function1, (byte) 18);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarK, wulVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarK2 = s5x0.K(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 12.0f);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(xsm0.s(R.string.cancel, fetVar)), true, false, false);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new yqz(function1, (byte) 19);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarK2, wulVar2, (Function0) objP2, fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(jm40Var, 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(xsm0.s(R.string.limits_try_again, fetVar)), true, false, false);
            Function1 function1 = this.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new yqz(function1, (byte) 23);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(xsm0.s(R.string.exit_dialog_title, fetVar)), true, false, false);
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new yqz(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarD, wulVar2, (Function0) objP2, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f11564a;
        byte b2 = 10;
        byte b3 = 9;
        byte b4 = 13;
        jm40 jm40Var = jm40.b;
        byte b5 = 3;
        cl5 cl5Var = ukd.f35823a;
        byte b6 = 18;
        byte b7 = 6;
        byte b8 = 4;
        boolean z = false;
        boolean z2 = true;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int i = 4;
                p6t0 p6t0Var = (p6t0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                p6t0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    if (!fetVar2.g(p6t0Var)) {
                        i = 2;
                    }
                    iIntValue |= i;
                }
                if (!fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar2.X();
                } else if (p6t0Var instanceof hm) {
                    fetVar2.e0(917289787);
                    hm hmVar = (hm) p6t0Var;
                    int i2 = iIntValue << 3;
                    function1.getClass();
                    boolean z3 = hmVar instanceof fm;
                    jm40 jm40Var2 = jm40.b;
                    if (z3) {
                        fetVar2.e0(460211735);
                        zrm zrmVar = ((fm) hmVar).b;
                        boolean zG = fetVar2.g(function1);
                        if ((((i2 & 112) ^ 48) <= 32 || !fetVar2.g(hmVar)) && (i2 & 48) != 32) {
                            z2 = false;
                        }
                        boolean z4 = zG | z2;
                        Object objP = fetVar2.P();
                        if (z4 || objP == cl5Var) {
                            objP = new mc((Object) function1, (Object) hmVar, (byte) 2);
                            fetVar2.o0(objP);
                        }
                        agc.r(jm40Var2, zrmVar, (Function0) objP, null, null, null, null, fetVar2, 0, 120);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        if (!(hmVar instanceof gm)) {
                            throw b1j.f(-816439886, fetVar, false);
                        }
                        fetVar.e0(460534228);
                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                        zcl zclVar = qmk.f28987a;
                        h97.s(lgb.J(o7k0.e(mm40VarD, 48.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar2.e0(917442896);
                    fetVar2.r(false);
                }
                return Unit.f46060a;
            case 1:
                function1.invoke(new ki6(((Double) obj3).doubleValue(), ((Long) obj).longValue(), ((Long) obj2).longValue()));
                return Unit.f46060a;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                String str = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                str.getClass();
                function1.invoke(new pi6(new iv20(str, jLongValue, zBooleanValue)));
                return Unit.f46060a;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                String str2 = (String) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                str2.getClass();
                function1.invoke(new pi6(new jv20(str2, jLongValue2, zBooleanValue2)));
                return Unit.f46060a;
            case 4:
                int i3 = 4;
                i3b i3bVar = (i3b) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i3bVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (!fetVar3.g(i3bVar)) {
                        i3 = 2;
                    }
                    iIntValue2 |= i3;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    eao eaoVar = i3bVar.f14090a;
                    a4x a4xVar = i3bVar.b;
                    boolean zG2 = fetVar3.g(function1);
                    Object objP2 = fetVar3.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new gn(function1, b7);
                        fetVar3.o0(objP2);
                    }
                    xdr xdrVar = (xdr) objP2;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new xz8(function1, b6);
                        fetVar3.o0(objP3);
                    }
                    Function1 function2 = (Function1) objP3;
                    boolean zG4 = fetVar3.g(function1);
                    Object objP4 = fetVar3.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new xz8(function1, (byte) 19);
                        fetVar3.o0(objP4);
                    }
                    bww.f(null, eaoVar, a4xVar, xdrVar, function2, (Function1) objP4, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                i8b i8bVar = (i8b) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                i8bVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar4.g(i8bVar) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 1.0f);
                    boolean zG5 = fetVar4.g(function1);
                    Object objP5 = fetVar4.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new ag0(function1, b6);
                        fetVar4.o0(objP5);
                    }
                    lvm0.b(mm40VarD2, i8bVar, (Function2) objP5, eeq.d, eeq.e, fetVar4, ((iIntValue3 << 3) & 112) | 27648);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 6:
                function1.invoke(new a6b(new f130(((Double) obj3).doubleValue(), ((Long) obj).longValue(), ((Long) obj2).longValue())));
                return Unit.f46060a;
            case 7:
                i3b i3bVar2 = (i3b) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                i3bVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(i3bVar2) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar5.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarQ, 0.0f, 12.0f, 0.0f, 0.0f, 5);
                    eao eaoVar2 = i3bVar2.f14090a;
                    a4x a4xVar2 = i3bVar2.b;
                    boolean zG6 = fetVar5.g(function1);
                    Object objP6 = fetVar5.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new gn(function1, (byte) 8);
                        fetVar5.o0(objP6);
                    }
                    xdr xdrVar2 = (xdr) objP6;
                    boolean zG7 = fetVar5.g(function1);
                    Object objP7 = fetVar5.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new xz8(function1, (byte) 20);
                        fetVar5.o0(objP7);
                    }
                    Function1 function3 = (Function1) objP7;
                    boolean zG8 = fetVar5.g(function1);
                    Object objP8 = fetVar5.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new xz8(function1, (byte) 21);
                        fetVar5.o0(objP8);
                    }
                    cww.d(mm40VarN, eaoVar2, a4xVar2, xdrVar2, function3, (Function1) objP8, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 8:
                function1.invoke(new a6b(new f130(((Double) obj3).doubleValue(), ((Long) obj).longValue(), ((Long) obj2).longValue())));
                return Unit.f46060a;
            case 9:
                i3b i3bVar3 = (i3b) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                i3bVar3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(i3bVar3) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    eao eaoVar3 = i3bVar3.f14090a;
                    a4x a4xVar3 = i3bVar3.b;
                    boolean zG9 = fetVar6.g(function1);
                    Object objP9 = fetVar6.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new gn(function1, b2);
                        fetVar6.o0(objP9);
                    }
                    xdr xdrVar3 = (xdr) objP9;
                    boolean zG10 = fetVar6.g(function1);
                    Object objP10 = fetVar6.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new xz8(function1, (byte) 23);
                        fetVar6.o0(objP10);
                    }
                    Function1 function4 = (Function1) objP10;
                    boolean zG11 = fetVar6.g(function1);
                    Object objP11 = fetVar6.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new xz8(function1, (byte) 22);
                        fetVar6.o0(objP11);
                    }
                    xww.h(null, eaoVar3, a4xVar3, xdrVar3, function4, (Function1) objP11, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 10:
                function1.invoke(new a6b(new f130(((Double) obj3).doubleValue(), ((Long) obj).longValue(), ((Long) obj2).longValue())));
                return Unit.f46060a;
            case 11:
                i3b i3bVar4 = (i3b) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                i3bVar4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar7.g(i3bVar4) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    eao eaoVar4 = i3bVar4.f14090a;
                    a4x a4xVar4 = i3bVar4.b;
                    boolean zG12 = fetVar7.g(function1);
                    Object objP12 = fetVar7.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new gn(function1, b4);
                        fetVar7.o0(objP12);
                    }
                    xdr xdrVar4 = (xdr) objP12;
                    boolean zG13 = fetVar7.g(function1);
                    Object objP13 = fetVar7.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new xz8(function1, (byte) 24);
                        fetVar7.o0(objP13);
                    }
                    Function1 function5 = (Function1) objP13;
                    boolean zG14 = fetVar7.g(function1);
                    Object objP14 = fetVar7.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new xz8(function1, (byte) 25);
                        fetVar7.o0(objP14);
                    }
                    qxw.g(null, eaoVar4, a4xVar4, xdrVar4, function5, (Function1) objP14, fetVar7, 0, 1);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 12:
                i8b i8bVar2 = (i8b) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                i8bVar2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar8.g(i8bVar2) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarD3 = o7k0.d(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 1.0f);
                    boolean zG15 = fetVar8.g(function1);
                    Object objP15 = fetVar8.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new ag0(function1, (byte) 21);
                        fetVar8.o0(objP15);
                    }
                    lvm0.b(mm40VarD3, i8bVar2, (Function2) objP15, cjx.f, cjx.g, fetVar8, ((iIntValue7 << 3) & 112) | 27648);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 13:
                function1.invoke(new a6b(new f130(((Double) obj3).doubleValue(), ((Long) obj).longValue(), ((Long) obj2).longValue())));
                return Unit.f46060a;
            case 14:
                p6t0 p6t0Var2 = (p6t0) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                p6t0Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.g(p6t0Var2) ? 4 : 2;
                }
                if (!fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    fetVar9.X();
                } else if (p6t0Var2 instanceof psv) {
                    fetVar9.e0(1554200389);
                    ozb.z((psv) p6t0Var2, null, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof boo0) {
                    fetVar9.e0(1554289793);
                    boo0 boo0Var = (boo0) p6t0Var2;
                    boolean zG16 = fetVar9.g(function1);
                    Object objP16 = fetVar9.P();
                    Object obj4 = objP16;
                    if (zG16 || objP16 == cl5Var) {
                        trb trbVar = new trb(function1, (byte) 29);
                        fetVar9.o0(trbVar);
                        obj4 = trbVar;
                    }
                    cem0.g(null, boo0Var, (Function1) obj4, fetVar9, (iIntValue8 << 3) & 112, 1);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof lmf) {
                    fetVar9.e0(1554550007);
                    ebc.e((lmf) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof cof) {
                    fetVar9.e0(1554657143);
                    qbc.d((cof) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof hnf) {
                    fetVar9.e0(1554773207);
                    obc.f((hnf) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof drf) {
                    fetVar9.e0(1554885272);
                    fbc.j((drf) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof chv0) {
                    fetVar9.e0(1554985247);
                    vbc.l((chv0) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof xkf) {
                    fetVar9.e0(1555085439);
                    e3c.a((xkf) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof hga0) {
                    fetVar9.e0(1555182624);
                    piz.q((hga0) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof amf) {
                    fetVar9.e0(1555277763);
                    aac.e((amf) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof ddh) {
                    fetVar9.e0(1555375041);
                    qcc.b((ddh) p6t0Var2, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof ifa0) {
                    fetVar9.e0(1555484192);
                    ifa0 ifa0Var = (ifa0) p6t0Var2;
                    boolean zG17 = fetVar9.g(function1);
                    Object objP17 = fetVar9.P();
                    Object obj5 = objP17;
                    if (zG17 || objP17 == cl5Var) {
                        nmf nmfVar = new nmf(function1, (byte) 0);
                        fetVar9.o0(nmfVar);
                        obj5 = nmfVar;
                    }
                    cww.i(null, ifa0Var, (x0a0) obj5, false, fetVar9, (iIntValue8 << 3) & 112);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof m2z) {
                    fetVar9.e0(1555808390);
                    m2z m2zVar = (m2z) p6t0Var2;
                    boolean zG18 = fetVar9.g(function1);
                    Object objP18 = fetVar9.P();
                    Object obj6 = objP18;
                    if (zG18 || objP18 == cl5Var) {
                        omf omfVar = new omf(function1, z ? (byte) 1 : (byte) 0);
                        fetVar9.o0(omfVar);
                        obj6 = omfVar;
                    }
                    Function1 function6 = (Function1) obj6;
                    boolean zG19 = fetVar9.g(function1);
                    Object objP19 = fetVar9.P();
                    Object obj7 = objP19;
                    if (zG19 || objP19 == cl5Var) {
                        afd afdVar = new afd(function1, (byte) 8);
                        fetVar9.o0(afdVar);
                        obj7 = afdVar;
                    }
                    c3x.c(m2zVar, function6, (Function0) obj7, fetVar9, iIntValue8 & 14);
                    fetVar9.r(false);
                } else if (p6t0Var2 instanceof wy) {
                    fetVar9.e0(1556317720);
                    rhv0 rhv0Var = (rhv0) fetVar9.k(bmd.u);
                    a4x a4xVar5 = ((wy) p6t0Var2).b;
                    boolean zG20 = fetVar9.g(rhv0Var) | fetVar9.g(function1);
                    Object objP20 = fetVar9.P();
                    Object obj8 = objP20;
                    if (zG20 || objP20 == cl5Var) {
                        pmf pmfVar = new pmf(rhv0Var, function1, (byte) 0);
                        fetVar9.o0(pmfVar);
                        obj8 = pmfVar;
                    }
                    ay3.c(a4xVar5, (Function1) obj8, fetVar9, 8);
                    fetVar9.r(false);
                } else {
                    fetVar9.e0(1556884059);
                    fetVar9.r(false);
                }
                return Unit.f46060a;
            case 15:
                p6t0 p6t0Var3 = (p6t0) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                p6t0Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar10.g(p6t0Var3) ? 4 : 2;
                }
                if (!fetVar10.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    fetVar10.X();
                } else if (p6t0Var3 instanceof agg) {
                    fetVar10.e0(556520389);
                    agg aggVar = (agg) p6t0Var3;
                    boolean zG21 = fetVar10.g(function1);
                    Object objP21 = fetVar10.P();
                    Object obj9 = objP21;
                    if (zG21 || objP21 == cl5Var) {
                        omf omfVar2 = new omf(function1, (byte) 5);
                        fetVar10.o0(omfVar2);
                        obj9 = omfVar2;
                    }
                    Function1 function7 = (Function1) obj9;
                    function7.getClass();
                    x0g0 x0g0Var = aggVar.b;
                    boolean z5 = aggVar.c;
                    boolean zG22 = fetVar10.g(function7);
                    Object objP22 = fetVar10.P();
                    Object obj10 = objP22;
                    if (zG22 || objP22 == cl5Var) {
                        omf omfVar3 = new omf(function7, b8);
                        fetVar10.o0(omfVar3);
                        obj10 = omfVar3;
                    }
                    plc.m(null, x0g0Var, z5, (Function1) obj10, fetVar10, 0, 1);
                    fetVar10.r(false);
                } else {
                    fetVar10.e0(556861854);
                    fetVar10.r(false);
                }
                return Unit.f46060a;
            case 16:
                hwe hweVar = (hwe) obj;
                zxj0 zxj0Var = (zxj0) obj2;
                m0k0 m0k0Var = (m0k0) obj3;
                hweVar.getClass();
                zxj0Var.getClass();
                m0k0Var.getClass();
                int iOrdinal = hweVar.ordinal();
                if (iOrdinal == 0) {
                    function1.invoke(new b6h(zxj0Var, m0k0Var));
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    function1.invoke(new x5h(zxj0Var, m0k0Var));
                }
                return Unit.f46060a;
            case 17:
                function1.invoke(new ne60(((dpa0) obj2).c));
                return Unit.f46060a;
            case 18:
                return a(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p6t0 p6t0Var4 = (p6t0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                p6t0Var4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar11.g(p6t0Var4) ? 4 : 2;
                }
                if (!fetVar11.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    fetVar11.X();
                } else if (p6t0Var4 instanceof l6t0) {
                    fetVar11.e0(1124188110);
                    l6t0 l6t0Var = (l6t0) p6t0Var4;
                    boolean zG23 = fetVar11.g(function1);
                    Object objP23 = fetVar11.P();
                    if (zG23 || objP23 == cl5Var) {
                        objP23 = new x6s(function1, b5);
                        fetVar11.o0(objP23);
                    }
                    s7n0.g(l6t0Var, (Function2) objP23, fetVar11, (iIntValue10 << 3) & 112);
                    fetVar11.r(false);
                } else if (p6t0Var4 instanceof vpv) {
                    fetVar11.e0(1124520368);
                    vpv vpvVar = (vpv) p6t0Var4;
                    boolean zG24 = fetVar11.g(function1);
                    Object objP24 = fetVar11.P();
                    if (zG24 || objP24 == cl5Var) {
                        objP24 = new x6s(function1, b8);
                        fetVar11.o0(objP24);
                    }
                    Function2 function8 = (Function2) objP24;
                    boolean zG25 = fetVar11.g(function1);
                    Object objP25 = fetVar11.P();
                    if (zG25 || objP25 == cl5Var) {
                        objP25 = new baq(function1, (byte) 23);
                        fetVar11.o0(objP25);
                    }
                    slb.y(vpvVar, function8, (Function1) objP25, fetVar11, (iIntValue10 << 3) & 112);
                    fetVar11.r(false);
                } else {
                    fetVar11.e0(1124955050);
                    fetVar11.r(false);
                }
                return Unit.f46060a;
            case 20:
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40.b, 16.0f, 8.0f, 16.0f, 0.0f, 8);
                    tui0 tui0Var = new tui0(rsm0.w(R.string.history_hide, 0, fetVar12), null);
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_hide);
                    m0x m0xVar = new m0x(R.drawable.ic_snack_hide, null, 6);
                    zfn zfnVar = zaq0.b;
                    rqm rqmVar = new rqm((vui0) tui0Var, (pui0) new oui0(numValueOf, (y3d) null, m0xVar, new y3d(((ThemeColors) fetVar12.k(zfnVar)).getSecondary()), 18), (pvi0) new fvi0(new y3d(((ThemeColors) fetVar12.k(zfnVar)).getSecondary())), d4d.BACKGROUND, (tvi0) qvi0.f29388a, (wui0) null, false, (e900) null, 456);
                    boolean zG26 = fetVar12.g(function1);
                    Object objP26 = fetVar12.P();
                    if (zG26 || objP26 == cl5Var) {
                        objP26 = new i8v(function1, (byte) 9);
                        fetVar12.o0(objP26);
                    }
                    Function0 function0 = (Function0) objP26;
                    boolean zG27 = fetVar12.g(function1);
                    Object objP27 = fetVar12.P();
                    if (zG27 || objP27 == cl5Var) {
                        objP27 = new i8v(function1, (byte) 10);
                        fetVar12.o0(objP27);
                    }
                    obc.q(mm40VarN2, rqmVar, false, null, function0, null, (Function0) objP27, null, fetVar12, 0, 172);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 21:
                p6t0 p6t0Var5 = (p6t0) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                p6t0Var5.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar13.g(p6t0Var5) ? 4 : 2;
                }
                if (!fetVar13.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    fetVar13.X();
                } else if (p6t0Var5 instanceof jyy) {
                    fetVar13.e0(1788271786);
                    bww.e(null, (jyy) p6t0Var5, function1, fetVar13, (iIntValue12 << 3) & 112);
                    fetVar13.r(false);
                } else {
                    fetVar13.e0(1788423934);
                    fetVar13.r(false);
                }
                return Unit.f46060a;
            case 22:
                p6t0 p6t0Var6 = (p6t0) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                p6t0Var6.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar14.g(p6t0Var6) ? 4 : 2;
                }
                if (!fetVar14.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    fetVar14.X();
                } else if (p6t0Var6 instanceof ufz) {
                    fetVar14.e0(-764064294);
                    o2h o2hVar = ((ufz) p6t0Var6).b;
                    boolean zG28 = fetVar14.g(function1);
                    Object objP28 = fetVar14.P();
                    if (zG28 || objP28 == cl5Var) {
                        objP28 = new xwy(function1, b4);
                        fetVar14.o0(objP28);
                    }
                    Function0 function9 = (Function0) objP28;
                    function9.getClass();
                    if (o2hVar instanceof m2h) {
                        fetVar14.e0(-1080118463);
                        ufx.a(o2e.e0(jm40Var, "CYBER_LEADERBOARD_ANALYTICS_CARD_CONTENT"), (m2h) o2hVar, function9, fetVar14, 0);
                        fetVar14.r(false);
                    } else {
                        if (!(o2hVar instanceof n2h)) {
                            throw b1j.f(103702766, fetVar14, false);
                        }
                        fetVar14.e0(-1079831930);
                        mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar6 = qmk.f28987a;
                        bww.b(0, fetVar14, o7k0.e(mm40VarD4, 110.0f));
                        fetVar14.r(false);
                    }
                    fetVar14.r(false);
                } else if (p6t0Var6 instanceof mgz) {
                    fetVar14.e0(-763804793);
                    o8m o8mVar = ((mgz) p6t0Var6).b;
                    Object objP29 = fetVar14.P();
                    if (objP29 == cl5Var) {
                        objP29 = new z8z(b3);
                        fetVar14.o0(objP29);
                    }
                    u1c.h(null, o8mVar, null, (Function1) objP29, fetVar14, 3072, 5);
                    fetVar14.r(false);
                } else if (p6t0Var6 instanceof jhz) {
                    fetVar14.e0(-763550376);
                    q8m q8mVar = ((jhz) p6t0Var6).e;
                    boolean zG29 = ((iIntValue13 & 14) == 4) | fetVar14.g(function1);
                    Object objP30 = fetVar14.P();
                    if (zG29 || objP30 == cl5Var) {
                        objP30 = new v8o(function1, p6t0Var6, (byte) 1);
                        fetVar14.o0(objP30);
                    }
                    u1c.h(null, q8mVar, null, (Function1) objP30, fetVar14, 0, 5);
                    fetVar14.r(false);
                } else {
                    fetVar14.e0(-763052268);
                    fetVar14.r(false);
                }
                return Unit.f46060a;
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                return c(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return g(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return h(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return i(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj, obj2, obj3);
            default:
                hwe hweVar2 = (hwe) obj;
                zxj0 zxj0Var2 = (zxj0) obj2;
                m0k0 m0k0Var2 = (m0k0) obj3;
                hweVar2.getClass();
                zxj0Var2.getClass();
                m0k0Var2.getClass();
                int iOrdinal2 = hweVar2.ordinal();
                if (iOrdinal2 == 0) {
                    function1.invoke(new e130(zxj0Var2, m0k0Var2));
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    function1.invoke(new w030(zxj0Var2, m0k0Var2));
                }
                return Unit.f46060a;
        }
    }
}
