package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f588a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abn0(Object obj, byte b) {
        this.f588a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object value;
        byte b = this.f588a;
        byte b2 = 4;
        jm40 jm40Var = jm40.b;
        Object obj4 = ukd.f35823a;
        boolean z = false;
        byte b3 = 2;
        byte b4 = 3;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                dbn0 dbn0Var = (dbn0) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                j6m0 j6m0Var = dbn0.S1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0VarG0 = dbn0Var.G0();
                    boolean zI = fetVar.i(dbn0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == obj4) {
                        Object kcl0Var = new kcl0(1, dbn0Var, dbn0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/subscriptions/presentation/models/SubscriptionsSideEffect;)V", 0, (byte) 22);
                        fetVar.o0(kcl0Var);
                        objP = kcl0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(dbn0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == obj4) {
                        Object tmj0Var = new tmj0(k3t0VarG0, dbn0Var, pz40VarF, null, (byte) 3);
                        fetVar.o0(tmj0Var);
                        objP2 = tmj0Var;
                    }
                    m0x0.t(fetVar, dbn0Var, (Function2) objP2);
                    pz40 pz40VarY = ((i3t0) dbn0Var.G0()).y(fetVar);
                    boolean zI3 = fetVar.i(dbn0Var);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == obj4) {
                        objP3 = new bbn0(dbn0Var, b2);
                        fetVar.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zI4 = fetVar.i(dbn0Var);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == obj4) {
                        objP4 = new bbn0(dbn0Var, (byte) 5);
                        fetVar.o0(objP4);
                    }
                    v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
                    k3t0 k3t0VarG1 = dbn0Var.G0();
                    boolean zI5 = fetVar.i(k3t0VarG1);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == obj4) {
                        Object kcl0Var2 = new kcl0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar.o0(kcl0Var2);
                        objP5 = kcl0Var2;
                    }
                    jiq0.b0(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP5));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                icn0 icn0Var = (icn0) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g9m0 g9m0Var = icn0.W1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3t0 k3t0VarG2 = icn0Var.G0();
                    boolean zI6 = fetVar2.i(icn0Var);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == obj4) {
                        Object kcl0Var3 = new kcl0(1, icn0Var, icn0.class, "handleContainerSideEffect", "handleContainerSideEffect(Lorg/xplatform/feed/subscriptions/presentation/teambet/models/container/SubscriptionsTeamBetContainerSideEffect;)V", 0, (byte) 24);
                        fetVar2.o0(kcl0Var3);
                        objP6 = kcl0Var3;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar2);
                    boolean zI7 = fetVar2.i(k3t0VarG2) | fetVar2.i(icn0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF2);
                    Object objP7 = fetVar2.P();
                    if (zI7 || objP7 == obj4) {
                        Object tmj0Var2 = new tmj0(k3t0VarG2, icn0Var, pz40VarF2, null, (byte) 4);
                        fetVar2.o0(tmj0Var2);
                        objP7 = tmj0Var2;
                    }
                    m0x0.t(fetVar2, icn0Var, (Function2) objP7);
                    k3t0 k3t0VarH0 = icn0Var.H0();
                    boolean zI8 = fetVar2.i(icn0Var);
                    Object objP8 = fetVar2.P();
                    if (zI8 || objP8 == obj4) {
                        Object kcl0Var4 = new kcl0(1, icn0Var, icn0.class, "handleEventsSideEffect", "handleEventsSideEffect(Lorg/xplatform/feed/subscriptions/presentation/teambet/models/events/SubscriptionsTeamBetEventsSideEffect;)V", 0, (byte) 25);
                        fetVar2.o0(kcl0Var4);
                        objP8 = kcl0Var4;
                    }
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP8), fetVar2);
                    boolean zI9 = fetVar2.i(k3t0VarH0) | fetVar2.i(icn0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF3);
                    Object objP9 = fetVar2.P();
                    if (zI9 || objP9 == obj4) {
                        Object tmj0Var3 = new tmj0(k3t0VarH0, icn0Var, pz40VarF3, null, (byte) 5);
                        fetVar2.o0(tmj0Var3);
                        objP9 = tmj0Var3;
                    }
                    m0x0.t(fetVar2, icn0Var, (Function2) objP9);
                    k3t0 k3t0Var = (k3t0) icn0Var.S1.getValue();
                    boolean zI10 = fetVar2.i(icn0Var);
                    Object objP10 = fetVar2.P();
                    if (zI10 || objP10 == obj4) {
                        Object kcl0Var5 = new kcl0(1, icn0Var, icn0.class, "handleTeamsSideEffect", "handleTeamsSideEffect(Lorg/xplatform/feed/subscriptions/presentation/teambet/models/teams/SubscriptionsTeamBetTeamsSideEffect;)V", 0, (byte) 26);
                        fetVar2.o0(kcl0Var5);
                        objP10 = kcl0Var5;
                    }
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP10), fetVar2);
                    boolean zI11 = fetVar2.i(k3t0Var) | fetVar2.i(icn0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF4);
                    Object objP11 = fetVar2.P();
                    if (zI11 || objP11 == obj4) {
                        Object tmj0Var4 = new tmj0(k3t0Var, icn0Var, pz40VarF4, null, (byte) 6);
                        icn0Var = icn0Var;
                        fetVar2.o0(tmj0Var4);
                        objP11 = tmj0Var4;
                    }
                    m0x0.t(fetVar2, icn0Var, (Function2) objP11);
                    pz40 pz40VarY2 = ((i3t0) icn0Var.G0()).y(fetVar2);
                    k3t0 k3t0VarG3 = icn0Var.G0();
                    boolean zI12 = fetVar2.i(k3t0VarG3);
                    Object objP12 = fetVar2.P();
                    if (zI12 || objP12 == obj4) {
                        Object kcl0Var6 = new kcl0(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar2.o0(kcl0Var6);
                        objP12 = kcl0Var6;
                    }
                    jar0.J(null, pz40VarY2, (Function1) ((jhy) objP12), u1c.M(1979933186, new gcn0(icn0Var, z ? (byte) 1 : (byte) 0), fetVar2), fetVar2, 3072);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                fen0.a((len0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                wfn0 wfn0Var = (wfn0) obj5;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s2m0 s2m0Var = wfn0.e2;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    khf0 khf0Var = wfn0Var.Y1;
                    iiy[] iiyVarArr = wfn0.f2;
                    qgn0 qgn0VarO = k9x.O((SuccessBetStringModel) khf0Var.n(wfn0Var, iiyVarArr[0]), (SuccessBetAlertModel) wfn0Var.Z1.n(wfn0Var, iiyVarArr[1]), (bu6) wfn0Var.b2.n(wfn0Var, iiyVarArr[3]), fetVar3);
                    k3t0 k3t0Var2 = (k3t0) wfn0Var.d2.getValue();
                    boolean zI13 = fetVar3.i(wfn0Var);
                    Object objP13 = fetVar3.P();
                    Object obj6 = objP13;
                    if (zI13 || objP13 == obj4) {
                        Object j1l0Var = new j1l0(wfn0Var, (byte) 23);
                        fetVar3.o0(j1l0Var);
                        obj6 = j1l0Var;
                    }
                    clz clzVar = (clz) fetVar3.k(or00.f25714a);
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) obj6, fetVar3);
                    boolean zI14 = fetVar3.i(k3t0Var2) | fetVar3.i(clzVar) | fetVar3.e(3) | fetVar3.g(pz40VarF5);
                    Object objP14 = fetVar3.P();
                    if (zI14 || objP14 == obj4) {
                        Object kc70Var = new kc70(k3t0Var2, clzVar, pz40VarF5, null, (byte) 18);
                        fetVar3.o0(kc70Var);
                        objP14 = kc70Var;
                    }
                    m0x0.t(fetVar3, clzVar, (Function2) objP14);
                    au6 au6Var = (au6) wfn0Var.a2.n(wfn0Var, iiyVarArr[2]);
                    boolean zI15 = fetVar3.i(wfn0Var);
                    Object objP15 = fetVar3.P();
                    Object obj7 = objP15;
                    if (zI15 || objP15 == obj4) {
                        Object vfn0Var = new vfn0(wfn0Var, b3);
                        fetVar3.o0(vfn0Var);
                        obj7 = vfn0Var;
                    }
                    Function0 function1 = (Function0) obj7;
                    boolean zI16 = fetVar3.i(wfn0Var);
                    Object objP16 = fetVar3.P();
                    Object obj8 = objP16;
                    if (zI16 || objP16 == obj4) {
                        Object vfn0Var2 = new vfn0(wfn0Var, b4);
                        fetVar3.o0(vfn0Var2);
                        obj8 = vfn0Var2;
                    }
                    Function0 function2 = (Function0) obj8;
                    boolean zI17 = fetVar3.i(wfn0Var);
                    Object objP17 = fetVar3.P();
                    Object obj9 = objP17;
                    if (zI17 || objP17 == obj4) {
                        Object vfn0Var3 = new vfn0(wfn0Var, b2);
                        fetVar3.o0(vfn0Var3);
                        obj9 = vfn0Var3;
                    }
                    ycm0.a(qgn0VarO, au6Var, function1, function2, (Function0) obj9, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                xcm0.a((au6) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                ((sgn0) obj5).G(new ogn0(str));
                return Unit.f46060a;
            case 6:
                xgn0 xgn0Var = (xgn0) obj5;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarU = yyw.U(jm40Var, 0.6f);
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar4, 48);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarU);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    mm40 mm40VarE0 = o2e.e0(ohs0.i(fetVar4, mm40VarC0, gqw0.v, 1.0f, false), "SUCCESS_BET_INFO_ROW_VALUE");
                    String str2 = xgn0Var.b;
                    zfn zfnVar = j1t0.e;
                    ((g1t0) fetVar4.k(zfnVar)).getClass();
                    v8q0.a(str2, mm40VarE0, xgn0Var.d, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.l(), fetVar4, 0, 24960, 110584);
                    if (xgn0Var.c.length() > 0) {
                        fetVar4.e0(236175722);
                        mm40 mm40VarE1 = o2e.e0(jm40Var, "SUCCESS_BET_INFO_ROW_CURRENCY");
                        String str3 = xgn0Var.c;
                        ((g1t0) fetVar4.k(zfnVar)).getClass();
                        v8q0.a(str3, mm40VarE1, xgn0Var.d, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.l(), fetVar4, 48, 24576, 114680);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(236486683);
                        fetVar4.r(false);
                    }
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                aem0.e((ugn0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                fin0 fin0Var = (fin0) obj5;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                fin0Var.x(new bu(fin0Var, null, (byte) 21));
                return Unit.f46060a;
            case 9:
                String str4 = (String) obj2;
                b1j.z(str4, (Throwable) obj);
                ((mkn0) obj5).z.f(new ekn0(str4));
                return Unit.f46060a;
            case 10:
                String str5 = (String) obj2;
                b1j.z(str5, (Throwable) obj);
                ((arn0) obj5).v.f(new jqn0(str5));
                return Unit.f46060a;
            case 11:
                tun0 tun0Var = (tun0) obj5;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                y2m0 y2m0Var = tun0.P1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    q0h0 q0h0Var = new q0h0((uvi) ((vvi) tun0Var.L1.getValue()).o.get());
                    sgy sgyVarB = sre0.f32672a.b(bvn0.class);
                    int i = bvn0.E;
                    k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar5, 14);
                    boolean zI18 = fetVar5.i(k3t0VarX);
                    Object objP18 = fetVar5.P();
                    Object obj10 = objP18;
                    if (zI18 || objP18 == obj4) {
                        Object dbhVar = new dbh(k3t0VarX, (byte) 25);
                        fetVar5.o0(dbhVar);
                        obj10 = dbhVar;
                    }
                    qcc.X(tun0Var, (Function0) obj10);
                    i3t0 i3t0Var = (i3t0) k3t0VarX;
                    pz40 pz40VarY3 = i3t0Var.y(fetVar5);
                    boolean zI19 = fetVar5.i(tun0Var);
                    Object objP19 = fetVar5.P();
                    if (zI19 || objP19 == obj4) {
                        Object ndn0Var = new ndn0(1, tun0Var, tun0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/swipex/impl/presentation/filter/models/UiSideEffects;)V", 0, (byte) 21);
                        fetVar5.o0(ndn0Var);
                        objP19 = ndn0Var;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP19), fetVar5);
                    boolean zI20 = fetVar5.i(i3t0Var) | fetVar5.i(tun0Var) | fetVar5.e(3) | fetVar5.g(pz40VarF6);
                    Object objP20 = fetVar5.P();
                    if (zI20 || objP20 == obj4) {
                        Object ta4Var = new ta4(i3t0Var, tun0Var, pz40VarF6, null, (byte) 5);
                        obj3 = i3t0Var;
                        tun0Var = tun0Var;
                        fetVar5.o0(ta4Var);
                        objP20 = ta4Var;
                    } else {
                        obj3 = i3t0Var;
                    }
                    m0x0.t(fetVar5, tun0Var, (Function2) objP20);
                    boolean zI21 = fetVar5.i(obj3);
                    Object objP21 = fetVar5.P();
                    if (zI21 || objP21 == obj4) {
                        Object ndn0Var2 = new ndn0(1, obj3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar5.o0(ndn0Var2);
                        objP21 = ndn0Var2;
                    }
                    f1t0.I(pz40VarY3, (Function1) ((jhy) objP21), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 12:
                d7o0 d7o0Var = (d7o0) obj5;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s9m0 s9m0Var = d7o0.R1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI22 = fetVar6.i(d7o0Var);
                    Object objP22 = fetVar6.P();
                    if (zI22 || objP22 == obj4) {
                        objP22 = new c7o0(d7o0Var, (byte) 1);
                        fetVar6.o0(objP22);
                    }
                    Function0 function3 = (Function0) objP22;
                    boolean zI23 = fetVar6.i(d7o0Var);
                    Object objP23 = fetVar6.P();
                    if (zI23 || objP23 == obj4) {
                        objP23 = new c7o0(d7o0Var, (byte) 2);
                        fetVar6.o0(objP23);
                    }
                    v3c.z(function3, (Function0) objP23, null, fetVar6, 0, 4);
                    k3t0 k3t0VarG4 = d7o0Var.G0();
                    boolean zI24 = fetVar6.i(d7o0Var);
                    Object objP24 = fetVar6.P();
                    if (zI24 || objP24 == obj4) {
                        Object ndn0Var3 = new ndn0(1, d7o0Var, d7o0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/regular/presentation/synthetic_results/model/SyntheticResultsSideEffect;)V", 0, (byte) 25);
                        fetVar6.o0(ndn0Var3);
                        objP24 = ndn0Var3;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF7 = androidx.compose.runtime.e.f((Function1) ((jhy) objP24), fetVar6);
                    boolean zI25 = fetVar6.i(k3t0VarG4) | fetVar6.i(d7o0Var) | fetVar6.e(3) | fetVar6.g(pz40VarF7);
                    Object objP25 = fetVar6.P();
                    if (zI25 || objP25 == obj4) {
                        Object tmj0Var5 = new tmj0(k3t0VarG4, d7o0Var, pz40VarF7, null, (byte) 7);
                        fetVar6.o0(tmj0Var5);
                        objP25 = tmj0Var5;
                    }
                    m0x0.t(fetVar6, d7o0Var, (Function2) objP25);
                    pz40 pz40VarY4 = ((i3t0) d7o0Var.G0()).y(fetVar6);
                    qdz qdzVar = d7o0Var.Q1;
                    boolean zI26 = fetVar6.i(d7o0Var);
                    Object objP26 = fetVar6.P();
                    if (zI26 || objP26 == obj4) {
                        objP26 = new ttn0(d7o0Var, b4);
                        fetVar6.o0(objP26);
                    }
                    phu0.z(pz40VarY4, qdzVar, (Function1) objP26, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                kj60 kj60Var = (kj60) obj5;
                glb0 glb0Var = (glb0) obj2;
                ((oyg0) obj).getClass();
                glb0Var.getClass();
                iun iunVar = iun.f15405a;
                return glb0.a(glb0Var, false, false, null, null, null, null, null, new jn00(kj60Var.f18372a), new jn00(iunVar), new jn00(kj60Var.b), new jn00(kj60Var.c), new jn00(kj60Var.d), new jn00(iunVar), new jn00(kj60Var.e), new jn00(kj60Var.f), new jn00(iunVar), null, null, false, 29368319);
            case 14:
                String str6 = (String) obj2;
                ((Throwable) obj).getClass();
                str6.getClass();
                ((zco0) obj5).G(new dlb0(str6));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                s7n0.c((nlo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                s7n0.a((llo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                s7n0.b((mlo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                w7n0.h((ylo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                w7n0.i((wlo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                w7n0.j((xlo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                z77 z77Var = (z77) obj5;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(z77Var.f().f38471a, s5x0.L(mm40VarD, 16.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar7), fetVar7, 0, 0, 131068);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                ewm0.e((ayo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                ewm0.g((zxo0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                b0p0 b0p0Var = (b0p0) obj5;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = b0p0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    b0p0Var.f.getClass();
                } while (!p7m0Var.m(value, szo0.a((szo0) value, null, null, izo0.b, null, false, 43)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i0p0 i0p0Var = (i0p0) obj5;
                a8z a8zVar = i0p0Var.W1;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                j6m0 j6m0Var2 = i0p0.Z1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k3t0 k3t0Var3 = (k3t0) a8zVar.getValue();
                    boolean zI27 = fetVar8.i(i0p0Var);
                    Object objP27 = fetVar8.P();
                    if (zI27 || objP27 == obj4) {
                        Object opc0Var = new opc0(1, i0p0Var, i0p0.class, "handleContainerSideEffect", "handleContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/teambet/presentation/container/models/TeamBetContainerSideEffect;)V", 0, (byte) 3);
                        fetVar8.o0(opc0Var);
                        objP27 = opc0Var;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF8 = androidx.compose.runtime.e.f((Function1) ((jhy) objP27), fetVar8);
                    boolean zI28 = fetVar8.i(k3t0Var3) | fetVar8.i(i0p0Var) | fetVar8.e(3) | fetVar8.g(pz40VarF8);
                    Object objP28 = fetVar8.P();
                    if (zI28 || objP28 == obj4) {
                        Object tmj0Var6 = new tmj0(k3t0Var3, i0p0Var, pz40VarF8, null, (byte) 8);
                        fetVar8.o0(tmj0Var6);
                        objP28 = tmj0Var6;
                    }
                    m0x0.t(fetVar8, i0p0Var, (Function2) objP28);
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar8);
                    mm40 mm40VarH = phu0.H(jm40Var, null, 1);
                    lyo0 lyo0Var = (lyo0) pz40VarY5.getValue();
                    e2d e2dVarD = nip.d(null, null, fetVar8, 7);
                    k3t0 k3t0Var4 = (k3t0) a8zVar.getValue();
                    boolean zI29 = fetVar8.i(k3t0Var4);
                    Object objP29 = fetVar8.P();
                    if (zI29 || objP29 == obj4) {
                        objP29 = new g0p0(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar8.o0(objP29);
                    }
                    wb.A(mm40VarH, lyo0Var, e2dVarD, (Function1) ((jhy) objP29), u1c.M(-959477817, new ze2(i0p0Var, b2), fetVar8), fetVar8, 24576);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((i3p0) obj5).H(new ofo0((byte) 17));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                e4p0 e4p0Var = (e4p0) obj5;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m6m0 m6m0Var = e4p0.O1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zI30 = fetVar9.i(e4p0Var);
                    Object objP30 = fetVar9.P();
                    if (zI30 || objP30 == obj4) {
                        objP30 = new c4p0(e4p0Var, b3);
                        fetVar9.o0(objP30);
                    }
                    Function0 function4 = (Function0) objP30;
                    boolean zI31 = fetVar9.i(e4p0Var);
                    Object objP31 = fetVar9.P();
                    if (zI31 || objP31 == obj4) {
                        objP31 = new c4p0(e4p0Var, b4);
                        fetVar9.o0(objP31);
                    }
                    v3c.z(function4, (Function0) objP31, null, fetVar9, 0, 4);
                    k3t0 k3t0VarG5 = e4p0Var.G0();
                    boolean zI32 = fetVar9.i(e4p0Var);
                    Object objP32 = fetVar9.P();
                    if (zI32 || objP32 == obj4) {
                        Object g0p0Var = new g0p0(1, e4p0Var, e4p0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/favorites/impl/presentation/teambet/presentation/teams/models/TeamBetTeamsSideEffect;)V", 0, (byte) 3);
                        fetVar9.o0(g0p0Var);
                        objP32 = g0p0Var;
                    }
                    lkz lkzVar7 = lkz.f20223a;
                    pz40 pz40VarF9 = androidx.compose.runtime.e.f((Function1) ((jhy) objP32), fetVar9);
                    boolean zI33 = fetVar9.i(k3t0VarG5) | fetVar9.i(e4p0Var) | fetVar9.e(3) | fetVar9.g(pz40VarF9);
                    Object objP33 = fetVar9.P();
                    if (zI33 || objP33 == obj4) {
                        Object tmj0Var7 = new tmj0(k3t0VarG5, e4p0Var, pz40VarF9, null, (byte) 9);
                        fetVar9.o0(tmj0Var7);
                        objP33 = tmj0Var7;
                    }
                    m0x0.t(fetVar9, e4p0Var, (Function2) objP33);
                    l4p0 l4p0Var = (l4p0) ((i3t0) e4p0Var.G0()).y(fetVar9).getValue();
                    k3t0 k3t0VarG6 = e4p0Var.G0();
                    boolean zI34 = fetVar9.i(k3t0VarG6);
                    Object objP34 = fetVar9.P();
                    if (zI34 || objP34 == obj4) {
                        Object g0p0Var2 = new g0p0(1, k3t0VarG6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar9.o0(g0p0Var2);
                        objP34 = g0p0Var2;
                    }
                    xf0.C(null, l4p0Var, (Function1) ((jhy) objP34), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                o5n0.e((k4m0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                kiu0 kiu0Var = ((t5p0) obj5).O1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                g9m0 g9m0Var2 = t5p0.Q1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    o6p0 o6p0Var = (o6p0) kiu0Var.getValue();
                    int i2 = o6p0.E;
                    pz40 pz40VarY6 = o6p0Var.y(fetVar10);
                    o6p0 o6p0Var2 = (o6p0) kiu0Var.getValue();
                    boolean zI35 = fetVar10.i(o6p0Var2);
                    Object objP35 = fetVar10.P();
                    if (zI35 || objP35 == obj4) {
                        Object g0p0Var3 = new g0p0(1, o6p0Var2, o6p0.class, "onAction", "onAction(Lorg/xplatform/statistic/team/impl/team_characterstic_statistic/presentation/models/TeamCharacteristicsAction;)V", 0, (byte) 7);
                        fetVar10.o0(g0p0Var3);
                        objP35 = g0p0Var3;
                    }
                    w7n0.k(pz40VarY6, (Function1) ((jhy) objP35), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ abn0(Object obj, int i, byte b) {
        this.f588a = b;
        this.b = obj;
    }
}
