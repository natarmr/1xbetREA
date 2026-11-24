package a;

import android.javax.sip.message.Response;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nhl0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23538a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nhl0(Object obj, Object obj2, byte b) {
        this.f23538a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        qvp0 qvp0Var = (qvp0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = qvp0.m2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vul vulVar = vul.b;
            wul wulVar = ((awp0) l7m0Var.getValue()).c;
            wul wulVar2 = ((awp0) l7m0Var.getValue()).d;
            boolean zI = fetVar.i(qvp0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new pvp0(qvp0Var, (byte) 2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(qvp0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new pvp0(qvp0Var, (byte) 3);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        rdk0 rdk0Var = (rdk0) this.b;
        gy40 gy40Var = (gy40) this.c;
        fet fetVar = (fet) obj2;
        ((Integer) obj3).getClass();
        fetVar.e0(-102778667);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP);
        }
        vne vneVar = (vne) objP;
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = androidx.compose.runtime.e.e(null);
            fetVar.o0(objP2);
        }
        pz40 pz40Var = (pz40) objP2;
        pz40 pz40VarF = androidx.compose.runtime.e.f(rdk0Var, fetVar);
        boolean zG = fetVar.g(gy40Var);
        Object objP3 = fetVar.P();
        if (zG || objP3 == cl5Var) {
            objP3 = new itn0(pz40Var, gy40Var, (byte) 29);
            fetVar.o0(objP3);
        }
        m0x0.o(gy40Var, (Function1) objP3, fetVar);
        boolean zI = fetVar.i(vneVar) | fetVar.g(gy40Var) | fetVar.g(pz40VarF);
        Object objP4 = fetVar.P();
        if (zI || objP4 == cl5Var) {
            objP4 = new a7q0(vneVar, pz40Var, gy40Var, pz40VarF);
            fetVar.o0(objP4);
        }
        mm40 mm40VarA = fnn0.a(jm40.b, gy40Var, (PointerInputEventHandler) objP4);
        fetVar.r(false);
        return mm40VarA;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        Function0 function0 = (Function0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            float f = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            qzb.n(o7k0.d(jm40Var, 1.0f), new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.exit_dialog_title, fetVar)), ((iiq0) l7m0Var.getValue()).b, false, false), function0, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        b5r0 b5r0Var = (b5r0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        j6m0 j6m0Var = b5r0.t2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarA0 = wha0.a0(cjx.V(jm40.b, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            i5r0 i5r0Var = (i5r0) l7m0Var.getValue();
            k3t0 k3t0VarQ0 = b5r0Var.Q0();
            boolean zI = fetVar.i(k3t0VarQ0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                w6q0 w6q0Var = new w6q0(1, k3t0VarQ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                fetVar.o0(w6q0Var);
                objP = w6q0Var;
            }
            qem0.h(mm40VarA0, i5r0Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        gpe gpeVar = (gpe) this.c;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            tdc.e((tpe) l7m0Var.getValue(), gpeVar, mm40Var, fetVar, (iIntValue << 6) & 896, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.b;
        olw olwVar = (olw) this.c;
        List list = (List) obj;
        j6z j6zVar = (j6z) obj2;
        j6z j6zVar2 = (j6z) obj3;
        ArrayList arrayListU = twn.u(list);
        Iterator it = list.iterator();
        while (true) {
            egd egdVarE0 = null;
            if (!it.hasNext()) {
                if (!arrayListU.isEmpty()) {
                    function1.invoke(new ekb0(new vkb0(arrayListU, j6zVar != null ? uzb.E0(j6zVar, 0.0f, (15 & 2) != 0 ? 0.0f : sj3.X(-4), 0.0f, (15 & 8) != 0 ? 0.0f : sj3.X(-4), 10) : null, j6zVar2 != null ? uzb.E0(j6zVar2, 0.0f, (15 & 2) != 0 ? 0.0f : sj3.X(-4), 0.0f, (15 & 8) != 0 ? 0.0f : sj3.X(-4), 10) : null)));
                }
                return Unit.f46060a;
            }
            j6z j6zVar3 = (j6z) it.next();
            tsm tsmVar = olwVar.f25477a;
            if (tsmVar instanceof esm) {
                egdVarE0 = uzb.E0(j6zVar3, 0.0f, (15 & 2) != 0 ? 0.0f : 0.0f, 0.0f, (15 & 8) != 0 ? 0.0f : 0.0f, 8);
            } else if ((tsmVar instanceof hsm) || (tsmVar instanceof nsm) || (tsmVar instanceof qsm) || (tsmVar instanceof ksm)) {
                egdVarE0 = uzb.E0(j6zVar3, 0.0f, (15 & 2) != 0 ? 0.0f : 0.0f, 0.0f, (15 & 8) != 0 ? 0.0f : 0.0f, 12);
            } else if (!tsmVar.equals(fsm.f10071a) && !tsmVar.equals(lsm.f20587a) && !tsmVar.equals(ism.f15311a) && !tsmVar.equals(osm.f25788a) && !tsmVar.equals(rsm.f31038a)) {
                t9f.b();
                return null;
            }
            if (egdVarE0 != null) {
                arrayListU.add(egdVarE0);
            }
        }
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        ylr0 ylr0Var = (ylr0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = ylr0.m2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarV = cjx.V(s5x0.L(jm40.b, 4.0f, 0.0f, 2), a8k0.G(xczVarA, fetVar), null);
            boolean zG = fetVar.g(l7m0Var) | fetVar.i(ylr0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new b8q0((Object) l7m0Var, (Object) ylr0Var, (byte) 18);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        amr0 amr0Var = (amr0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = amr0.m2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarV = cjx.V(s5x0.L(jm40.b, 4.0f, 0.0f, 2), a8k0.G(xczVarA, fetVar), null);
            boolean zG = fetVar.g(l7m0Var) | fetVar.i(amr0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new b8q0((Object) l7m0Var, (Object) amr0Var, (byte) 19);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        zbr zbrVar = (zbr) this.b;
        usr0 usr0Var = (usr0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = usr0.r2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0VarQ0 = usr0Var.Q0();
            boolean zI = fetVar.i(k3t0VarQ0);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                mjr0 mjr0Var = new mjr0(1, k3t0VarQ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                fetVar.o0(mjr0Var);
                objP = mjr0Var;
            }
            oja0.i(null, zbrVar, (Function1) ((jhy) objP), fetVar, 0, 1);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:267:0x07bb  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f23538a;
        byte b2 = 26;
        jm40 jm40Var = jm40.b;
        byte b3 = 4;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 14;
        Object obj4 = this.c;
        Object obj5 = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                bhl0 bhl0Var = (bhl0) obj5;
                r0q r0qVar = (r0q) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                    v8q0.a(bhl0Var.f2614a, yhg0Var.a(1.0f, o7k0.A(jm40Var, null, 3), false), r0qVar.b, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110584);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                bhl0 bhl0Var2 = (bhl0) obj5;
                v0q v0qVar = (v0q) obj4;
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    v8q0.a(bhl0Var2.f2614a, o2e.e0(yhg0Var2.a(1.0f, o7k0.A(jm40Var, null, 3), false), "LARGE_CARD_LARGE_TEAM_ALL_MARKETS_TEXT"), v0qVar.b, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 110584);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                bhl0 bhl0Var3 = (bhl0) obj5;
                k2q k2qVar = (k2q) obj4;
                yhg0 yhg0Var3 = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    v8q0.a(bhl0Var3.f2614a, yhg0Var3.a(1.0f, o7k0.A(jm40Var, null, 3), false), k2qVar.b, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar3, 0, 24960, 110584);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                bhl0 bhl0Var4 = (bhl0) obj5;
                n2q n2qVar = (n2q) obj4;
                yhg0 yhg0Var4 = (yhg0) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yhg0Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(yhg0Var4) ? (byte) 4 : (byte) 2;
                }
                if (fetVar4.U(1 & iIntValue4, (iIntValue4 & 19) != 18)) {
                    v8q0.a(bhl0Var4.f2614a, o2e.e0(yhg0Var4.a(1.0f, o7k0.A(jm40Var, null, 3), false), "MEDIUM_CARD_SMALL_TEAM_LOGO_ALL_MARKETS_TEXT"), n2qVar.b, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar4, 0, 24960, 110584);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                bhl0 bhl0Var5 = (bhl0) obj5;
                qe80 qe80Var = (qe80) obj4;
                yhg0 yhg0Var5 = (yhg0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                yhg0Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(yhg0Var5) ? (byte) 4 : (byte) 2;
                }
                if (fetVar5.U(1 & iIntValue5, (iIntValue5 & 19) != 18)) {
                    v8q0.a(bhl0Var5.f2614a, o2e.e0(yhg0Var5.a(1.0f, o7k0.A(jm40Var, null, 3), false), "ALL_MARKETS_SMALL_CARD_NO_TEAM_LOGO_TEXT"), qe80Var.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar5, 0, 24960, 110584);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                nsl0 nsl0Var = (nsl0) obj5;
                Function1 function1 = (Function1) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(hh80Var) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    fetVar6.X();
                } else if (nsl0Var.d) {
                    fetVar6.e0(-936890445);
                    o050.t(null, nsl0Var.e, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.e0(-936765887);
                    o050.k(nsl0Var, hh80Var, function1, fetVar6, (iIntValue6 << 3) & 112);
                    fetVar6.r(false);
                }
                return Unit.f46060a;
            case 6:
                rwl0 rwl0Var = (rwl0) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    a4x a4xVar = rwl0Var.f31222a;
                    boolean z2 = !rwl0Var.c.isEmpty();
                    boolean zG = fetVar7.g(function2);
                    Object objP = fetVar7.P();
                    if (zG || objP == cl5Var) {
                        objP = new elk0(function2, (byte) 19);
                        fetVar7.o0(objP);
                    }
                    g7x.q(0, fetVar7, a4xVar, null, (Function1) objP, z2);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                m1v0 m1v0Var = ((iax) obj5).f14459a;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (!fetVar8.U(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    fetVar8.X();
                } else if (m1v0Var == null) {
                    fetVar8.e0(1533306095);
                    fetVar8.r(false);
                } else {
                    fetVar8.e0(1533306096);
                    yqm0.g(mm40Var, m1v0Var, fetVar8, 0);
                    fetVar8.r(false);
                }
                return Unit.f46060a;
            case 8:
                l7m0 l7m0Var = (l7m0) obj5;
                xyl0 xyl0Var = (xyl0) obj4;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                gle0 gle0Var = xyl0.n2;
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    czl0 czl0Var = (czl0) l7m0Var.getValue();
                    if (czl0Var == null) {
                        fetVar9.e0(-121555617);
                        fetVar9.r(false);
                    } else if (czl0Var instanceof zyl0) {
                        fetVar9.e0(-125246694);
                        mdm mdmVar = ((zyl0) czl0Var).f45212a;
                        boolean zI = fetVar9.i(xyl0Var);
                        Object objP2 = fetVar9.P();
                        Object obj6 = objP2;
                        if (zI || objP2 == cl5Var) {
                            vyl0 vyl0Var = new vyl0(xyl0Var, z ? 1 : 0);
                            fetVar9.o0(vyl0Var);
                            obj6 = vyl0Var;
                        }
                        jcb.l(null, mdmVar, false, (Function0) obj6, fetVar9, 0, 5);
                        fetVar9.r(false);
                    } else if (czl0Var instanceof bzl0) {
                        fetVar9.e0(-124866293);
                        ArrayList arrayList = ((bzl0) czl0Var).f3475a;
                        xcz xczVarA = ddz.a(0, 0, fetVar9, 0, 3);
                        mm40 mm40VarD = o7k0.d(cjx.V(jm40Var, a8k0.G(xczVarA, fetVar9), null), 1.0f);
                        zcl zclVar = qmk.f28987a;
                        lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                        boolean zI2 = fetVar9.i(arrayList);
                        Object objP3 = fetVar9.P();
                        Object obj7 = objP3;
                        if (zI2 || objP3 == cl5Var) {
                            uy2 uy2Var = new uy2(arrayList, (byte) 17);
                            fetVar9.o0(uy2Var);
                            obj7 = uy2Var;
                        }
                        b8k0.e(mm40VarD, xczVarA, lh80VarT, null, null, null, false, null, (Function1) obj7, fetVar9, 0, Response.SERVER_TIMEOUT);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(-121555617);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                ugd ugdVar = (ugd) obj5;
                kz20 kz20Var = (kz20) obj4;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar10.g(mm40Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    ugdVar.j(mm40Var2, kz20Var.b, fetVar10, Integer.valueOf((iIntValue10 & 14) | 64));
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                l7m0 l7m0Var2 = (l7m0) obj5;
                kxm0 kxm0Var = (kxm0) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                m6m0 m6m0Var = kxm0.n2;
                ((y5d) obj).getClass();
                if (fetVar11.U(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    k3t0 k3t0VarQ0 = kxm0Var.Q0();
                    boolean zI3 = fetVar11.i(k3t0VarQ0);
                    Object objP4 = fetVar11.P();
                    if (zI3 || objP4 == cl5Var) {
                        objP4 = new kcl0(1, k3t0VarQ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar11.o0(objP4);
                    }
                    hxm0.f(l7m0Var2, (Function1) ((jhy) objP4), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                oen0 oen0Var = (oen0) obj5;
                Function1 function3 = (Function1) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    qw3 qw3Var = new qw3(6.0f, true, new jf4(b4));
                    ch80 ch80VarF = h97.f(qmk.a(fetVar12).d, 8.0f, qmk.a(fetVar12).d, 32.0f, fetVar12);
                    boolean zG2 = fetVar12.g(oen0Var) | fetVar12.g(function3);
                    Object objP5 = fetVar12.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = new u5l0(b2, oen0Var, function3);
                        fetVar12.o0(objP5);
                    }
                    b8k0.e(null, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP5, fetVar12, 0, Response.REQUEST_PENDING);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                bgn0 bgn0Var = (bgn0) obj5;
                yzn0 yzn0Var = bgn0Var.m2;
                qgn0 qgn0Var = (qgn0) obj4;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                j6m0 j6m0Var = bgn0.q2;
                ((y5d) obj).getClass();
                if (fetVar13.U(1 & iIntValue13, (iIntValue13 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    wvb.o(null, 24.0f, 0L, fetVar13, 0, 5);
                    iiy[] iiyVarArr = bgn0.r2;
                    if (((au6) yzn0Var.n(bgn0Var, iiyVarArr[2])) != au6.NONE) {
                        fetVar13.e0(1809798215);
                        xcm0.a((au6) yzn0Var.n(bgn0Var, iiyVarArr[2]), fetVar13, 0);
                        wvb.o(null, 16.0f, 0L, fetVar13, 0, 5);
                        fetVar13.r(false);
                    } else {
                        fetVar13.e0(1809948131);
                        fetVar13.r(false);
                    }
                    String str = qgn0Var.f28695a;
                    dhn0 dhn0Var = qgn0Var.c;
                    String str2 = qgn0Var.b;
                    wwb.i(null, str, 0L, 0, 0L, fetVar13, 0, 29);
                    if (str2.length() > 0) {
                        fetVar13.e0(1810068256);
                        wvb.o(null, 4.0f, 0L, fetVar13, 0, 5);
                        kkb.m(null, str2, null, 0, 0L, 0L, fetVar13, 0, 61);
                        fetVar13.r(false);
                    } else {
                        fetVar13.e0(1810224899);
                        fetVar13.r(false);
                    }
                    wvb.o(null, 24.0f, 0L, fetVar13, 0, 5);
                    if (dhn0Var.f6100a == null && dhn0Var.b.isEmpty()) {
                        fetVar13.e0(1810617731);
                        fetVar13.r(false);
                    } else {
                        fetVar13.e0(1810349612);
                        boolean zI4 = fetVar13.i(bgn0Var);
                        Object objP6 = fetVar13.P();
                        if (zI4 || objP6 == cl5Var) {
                            objP6 = new zfn0(bgn0Var, (byte) 2);
                            fetVar13.o0(objP6);
                        }
                        aem0.b(null, dhn0Var, (Function0) objP6, fetVar13, 0, 1);
                        wvb.o(null, 16.0f, 0L, fetVar13, 0, 5);
                        fetVar13.r(false);
                    }
                    vul vulVar = vul.f38053a;
                    wul wulVar = qgn0Var.d;
                    wul wulVar2 = qgn0Var.e;
                    boolean zI5 = fetVar13.i(bgn0Var);
                    Object objP7 = fetVar13.P();
                    if (zI5 || objP7 == cl5Var) {
                        objP7 = new zfn0(bgn0Var, (byte) 3);
                        fetVar13.o0(objP7);
                    }
                    Function0 function0 = (Function0) objP7;
                    boolean zI6 = fetVar13.i(bgn0Var);
                    Object objP8 = fetVar13.P();
                    if (zI6 || objP8 == cl5Var) {
                        objP8 = new zfn0(bgn0Var, b3);
                        fetVar13.o0(objP8);
                    }
                    gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP8, fetVar13, 48, 17);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                l7m0 l7m0Var3 = (l7m0) obj5;
                snn0 snn0Var = (snn0) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                j6m0 j6m0Var2 = snn0.n2;
                ((y5d) obj).getClass();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    xcz xczVarA2 = ddz.a(0, 0, fetVar14, 0, 3);
                    mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA2, fetVar14), null);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarV, 4.0f, 0.0f, 2);
                    lh80 lh80VarT2 = s5x0.t(0.0f, 16.0f, 1);
                    boolean zG3 = fetVar14.g(l7m0Var3) | fetVar14.i(snn0Var);
                    Object objP9 = fetVar14.P();
                    if (zG3 || objP9 == cl5Var) {
                        objP9 = new u5l0((Object) l7m0Var3, (Object) snn0Var, (byte) 28);
                        fetVar14.o0(objP9);
                    }
                    b8k0.e(mm40VarL, xczVarA2, lh80VarT2, null, null, null, false, null, (Function1) objP9, fetVar14, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                ueo0 ueo0Var = (ueo0) obj5;
                Function1 function4 = (Function1) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar15.U(1 & iIntValue15, (iIntValue15 & 17) != 16)) {
                    p9r0 p9r0Var = ueo0Var.d;
                    if (p9r0Var == null) {
                        fetVar15.e0(340887655);
                        fetVar15.r(false);
                    } else {
                        fetVar15.e0(340887656);
                        boolean zG4 = fetVar15.g(function4);
                        Object objP10 = fetVar15.P();
                        if (zG4 || objP10 == cl5Var) {
                            objP10 = new opm0(function4, b2);
                            fetVar15.o0(objP10);
                        }
                        Function0 function5 = (Function0) objP10;
                        boolean zG5 = fetVar15.g(function4);
                        Object objP11 = fetVar15.P();
                        if (zG5 || objP11 == cl5Var) {
                            objP11 = new opm0(function4, (byte) 27);
                            fetVar15.o0(objP11);
                        }
                        i120.m(null, p9r0Var, function5, (Function0) objP11, fetVar15, 0);
                        fetVar15.r(false);
                    }
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                x77 x77Var = (x77) obj5;
                Function1 function6 = (Function1) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(1 & iIntValue16, (iIntValue16 & 17) != 16)) {
                    dn7 dn7Var = ((pv7) x77Var.h).f27650a;
                    boolean zG6 = fetVar16.g(function6);
                    Object objP12 = fetVar16.P();
                    if (zG6 || objP12 == cl5Var) {
                        objP12 = new opm0(function6, (byte) 29);
                        fetVar16.o0(objP12);
                    }
                    cjx.h(null, dn7Var, (Function0) objP12, fetVar16, 0);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                vxo0 vxo0Var = (vxo0) obj5;
                oxo0 oxo0Var = (oxo0) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                s2m0 s2m0Var = oxo0.q2;
                ((y5d) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar17, 0);
                    int iHashCode = Long.hashCode(fetVar17.T);
                    bh90 bh90VarM = fetVar17.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar17, mm40VarN);
                    mkd.c0.getClass();
                    fetVar17.i0();
                    if (fetVar17.S) {
                        fetVar17.l(e7z.u1);
                    } else {
                        fetVar17.r0();
                    }
                    jpm0.o(fetVar17, x5dVarA, gqw0.x);
                    jpm0.o(fetVar17, bh90VarM, gqw0.w);
                    jpm0.o(fetVar17, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar17);
                    jpm0.o(fetVar17, mm40VarC0, gqw0.v);
                    fetVar17.e0(-1300784723);
                    int i = 0;
                    for (Object obj8 : vxo0Var.f38210a) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        pxo0 pxo0Var = (pxo0) obj8;
                        rqm rqmVar = pxo0Var.b;
                        boolean zI7 = fetVar17.i(oxo0Var) | fetVar17.g(pxo0Var);
                        Object objP13 = fetVar17.P();
                        Object obj9 = objP13;
                        if (zI7 || objP13 == cl5Var) {
                            o0k0 o0k0Var = new o0k0(oxo0Var, pxo0Var, b2);
                            fetVar17.o0(o0k0Var);
                            obj9 = o0k0Var;
                        }
                        obc.q(null, rqmVar, false, null, (Function0) obj9, null, null, null, fetVar17, 384, 233);
                        if (i < q3d.i(vxo0Var.f38210a)) {
                            fetVar17.e0(-111840749);
                            zcl zclVar6 = qmk.f28987a;
                            mbc.o(agi0.f827a, s5x0.L(jm40Var, 16.0f, 0.0f, 2), false, fetVar17, 6, 4);
                            fetVar17.r(false);
                        } else {
                            fetVar17.e0(-111616030);
                            fetVar17.r(false);
                        }
                        i = i2;
                    }
                    fetVar17.r(false);
                    fetVar17.r(true);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                eie eieVar = (eie) obj5;
                Function1 function7 = (Function1) obj4;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar18.U(1 & iIntValue18, (iIntValue18 & 17) != 16)) {
                    xf0.D(null, (mhe) eieVar, function7, fetVar18, 0);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 18:
                gjp0 gjp0Var = (gjp0) obj5;
                ajp0 ajp0Var = (ajp0) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                s9m0 s9m0Var = ajp0.r2;
                ((y5d) obj).getClass();
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    boolean zG7 = fetVar19.g(gjp0Var) | fetVar19.i(ajp0Var);
                    Object objP14 = fetVar19.P();
                    if (zG7 || objP14 == cl5Var) {
                        objP14 = new itn0(gjp0Var, ajp0Var, (byte) 25);
                        fetVar19.o0(objP14);
                    }
                    b8k0.e(null, null, null, null, null, null, false, null, (Function1) objP14, fetVar19, 0, 511);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l7m0 l7m0Var4 = (l7m0) obj5;
                gup0 gup0Var = (gup0) obj4;
                fet fetVar20 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                m6m0 m6m0Var2 = gup0.n2;
                ((ir8) obj).getClass();
                if (fetVar20.U(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    vul vulVar2 = vul.b;
                    wul wulVar3 = ((uup0) l7m0Var4.getValue()).e;
                    wul wulVar4 = ((uup0) l7m0Var4.getValue()).f;
                    boolean zI8 = fetVar20.i(gup0Var);
                    Object objP15 = fetVar20.P();
                    if (zI8 || objP15 == cl5Var) {
                        objP15 = new eup0(gup0Var, b3);
                        fetVar20.o0(objP15);
                    }
                    Function0 function8 = (Function0) objP15;
                    boolean zI9 = fetVar20.i(gup0Var);
                    Object objP16 = fetVar20.P();
                    if (zI9 || objP16 == cl5Var) {
                        objP16 = new eup0(gup0Var, (byte) 5);
                        fetVar20.o0(objP16);
                    }
                    gkb.i(null, vulVar2, wulVar3, wulVar4, 0L, function8, (Function0) objP16, fetVar20, 48, 17);
                } else {
                    fetVar20.X();
                }
                return Unit.f46060a;
            case 20:
                return a(obj, obj2, obj3);
            case 21:
                return b(obj, obj2, obj3);
            case 22:
                return c(obj, obj2, obj3);
            case 23:
                return g(obj, obj2, obj3);
            case 24:
                return h(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return i(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return l(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return o(obj, obj2, obj3);
            default:
                l7m0 l7m0Var5 = (l7m0) obj5;
                k3t0 k3t0Var = (k3t0) obj4;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar21 = (fet) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= fetVar21.g(mm40Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar21.U(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    boolean zI10 = fetVar21.i(k3t0Var);
                    Object objP17 = fetVar21.P();
                    if (zI10 || objP17 == cl5Var) {
                        objP17 = new s9r0(k3t0Var, (byte) 6);
                        fetVar21.o0(objP17);
                    }
                    Function0 function9 = (Function0) objP17;
                    boolean zI11 = fetVar21.i(k3t0Var);
                    Object objP18 = fetVar21.P();
                    if (zI11 || objP18 == cl5Var) {
                        objP18 = new s9r0(k3t0Var, (byte) 7);
                        fetVar21.o0(objP18);
                    }
                    dem0.g((iIntValue21 & 14) | 48, fetVar21, mm40Var3, l7m0Var5, function9, (Function0) objP18);
                } else {
                    fetVar21.X();
                }
                return Unit.f46060a;
        }
    }
}
