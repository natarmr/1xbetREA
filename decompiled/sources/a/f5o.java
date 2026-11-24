package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;
import org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield.RouletteView;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardBottomView;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f5o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8972a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5o(Object obj, byte b) {
        this.f8972a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        Object value;
        i6q i6qVar = (i6q) this.b;
        int iIntValue = ((Integer) obj).intValue();
        qic qicVar = (qic) obj2;
        iiy[] iiyVarArr = i6q.V1;
        qicVar.getClass();
        r8q r8qVarH0 = i6qVar.H0();
        v6q v6qVar = r8qVarH0.n;
        p7m0 p7m0Var = r8qVarH0.R;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new s7q(new p0d(((s7q) value).f31762a.f26144a, qicVar))));
        FinInstrumentUIModel finInstrumentUIModelZ = r8qVarH0.z();
        if (r8qVarH0.v.g() || finInstrumentUIModelZ == null) {
            qjj.W(r8qVarH0.X, r8qVarH0.i.b, null, new q8q(r8qVarH0, null, (byte) 0), 2);
        } else {
            qic qicVar2 = qic.f28784a;
            double dA = v6qVar.a(iIntValue, qicVar == qicVar2 ? wbq.f38891a : wbq.b);
            r8qVarH0.T.f(new x7q(new FinBetInfoModel(finInstrumentUIModelZ.f46648a, String.valueOf(dA), dA, finInstrumentUIModelZ.b, finInstrumentUIModelZ.d, ((Number) r8qVarH0.l.b().get(iIntValue)).doubleValue(), finInstrumentUIModelZ.c, ((Number) r8qVarH0.m.b().get(iIntValue)).longValue(), v6qVar.a(iIntValue, wbq.f38891a), v6qVar.a(iIntValue, wbq.b), qicVar == qicVar2, iIntValue, r8qVarH0.u.a())));
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        n9q n9qVar = (n9q) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        iiy[] iiyVarArr = n9q.S1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = n9qVar.G0();
            boolean zI = fetVar.i(n9qVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new g7p((Object) n9qVar, (byte) 6);
                fetVar.o0(objP);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                pc pcVar = new pc(k3t0VarG0, clzVar, pz40VarF, null, (byte) 18);
                fetVar.o0(pcVar);
                objP2 = pcVar;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) n9qVar.G0()).y(fetVar);
            k3t0 k3t0VarG1 = n9qVar.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                pop popVar = new pop(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                fetVar.o0(popVar);
                objP3 = popVar;
            }
            mrv.D(pz40VarY, (Function1) ((jhy) objP3), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        mrv.E((paq) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        Object value;
        Object value2;
        ivq ivqVar = (ivq) this.b;
        oyg0 oyg0Var = ivqVar.f;
        ocj ocjVar = ivqVar.i;
        Throwable th = (Throwable) obj;
        th.getClass();
        ((String) obj2).getClass();
        if (th instanceof ff5) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, suq.a((suq) value2, false, true, false, false, null, null, null, null, false, 496)));
        } else {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, suq.a((suq) value, true, false, false, false, null, null, null, null, false, 496)));
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        vuq vuqVar = (vuq) this.b;
        return suq.a((suq) obj2, false, false, false, true, new kpm(opm.f25648a, new hpm(0L, 3), d5c.O(String.valueOf(vuqVar.f38061a), String.valueOf(vuqVar.b), false, false, new hpm(0L, 3))), vuqVar.c, null, null, false, 448);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byo byoVar;
        Object value;
        Set setE;
        Object value2;
        Object value3;
        byte b = this.f8972a;
        jm40 jm40Var = jm40.b;
        byte b2 = 4;
        boolean z = false;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 3;
        byte b4 = 2;
        byte b5 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                i5o i5oVar = (i5o) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                pek pekVar = i5o.Z1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t6o t6oVar = (t6o) ((i3t0) i5oVar.H0()).y(fetVar).getValue();
                    sek sekVar = i5oVar.M1;
                    if (sekVar == null) {
                        Intrinsics.h("gameVideoFragmentFactory");
                        throw null;
                    }
                    bek bekVar = i5oVar.P1;
                    if (bekVar == null) {
                        Intrinsics.h("gameZoneFragmentFactory");
                        throw null;
                    }
                    z5s z5sVar = new z5s(i5oVar.G0().f46523a, i5oVar.G0().c, i5oVar.G0().d, i5oVar.G0().e, i5oVar.G0().b);
                    xex xexVar = i5oVar.R1;
                    if (xexVar == null) {
                        Intrinsics.h("cyberBottomSheetFactory");
                        throw null;
                    }
                    CyberBottomSheetParams cyberBottomSheetParams = new CyberBottomSheetParams(i5oVar.G0().f46523a, i5oVar.G0().c, i5oVar.G0().b, i5oVar.G0().d, i5oVar.G0().e, i5oVar.G0().j, new lq2(), i5oVar.G0().f, i5o.class.getSimpleName());
                    k3t0 k3t0VarH0 = i5oVar.H0();
                    boolean zI = fetVar.i(k3t0VarH0);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new hin(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar.o0(objP);
                    }
                    aac.r(t6oVar, sekVar, z5sVar, bekVar, xexVar, cyberBottomSheetParams, (Function1) ((jhy) objP), fetVar, 0);
                    k3t0 k3t0VarH1 = i5oVar.H0();
                    boolean zI2 = fetVar.i(i5oVar);
                    Object objP2 = fetVar.P();
                    Object obj4 = objP2;
                    if (zI2 || objP2 == cl5Var) {
                        g5o g5oVar = new g5o(i5oVar, (byte) 0);
                        fetVar.o0(g5oVar);
                        obj4 = g5oVar;
                    }
                    clz clzVar = (clz) fetVar.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) obj4, fetVar);
                    boolean zI3 = fetVar.i(k3t0VarH1) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        pc pcVar = new pc(k3t0VarH1, clzVar, pz40VarF, null, (byte) 16);
                        fetVar.o0(pcVar);
                        objP3 = pcVar;
                    }
                    m0x0.t(fetVar, clzVar, (Function2) objP3);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                y5x y5xVar = (y5x) obj3;
                z5o0 z5o0Var = (z5o0) obj;
                x5x x5xVar = (x5x) obj2;
                z5o0Var.getClass();
                SyntheticIndianPokerView syntheticIndianPokerView = z5o0Var.b;
                x5xVar.getClass();
                if (x5xVar instanceof r5x) {
                    syntheticIndianPokerView.setFirstPlayerCards(y5xVar.f42068a);
                } else if (x5xVar instanceof u5x) {
                    syntheticIndianPokerView.setSecondPlayerCards(y5xVar.b);
                } else if (x5xVar instanceof t5x) {
                    syntheticIndianPokerView.setMatchStatus(y5xVar.c);
                } else if (x5xVar instanceof s5x) {
                    syntheticIndianPokerView.setFirstPlayerCombination(y5xVar.d);
                } else if (x5xVar instanceof v5x) {
                    syntheticIndianPokerView.setSecondPlayerCombination(y5xVar.e);
                } else {
                    if (!(x5xVar instanceof w5x)) {
                        t9f.b();
                        return null;
                    }
                    syntheticIndianPokerView.v(y5xVar.g);
                }
                return Unit.f46060a;
            case 2:
                n7o0 n7o0Var = (n7o0) obj;
                rfg0 rfg0Var = (rfg0) obj2;
                n7o0Var.getClass();
                rfg0Var.getClass();
                RouletteView rouletteView = n7o0Var.b;
                rouletteView.setType(((sfg0) obj3).d);
                if (rfg0Var instanceof qfg0) {
                    rouletteView.setRouletteImage(((qfg0) rfg0Var).f28632a);
                } else if (rfg0Var instanceof ofg0) {
                    rouletteView.setCurrentValue(((ofg0) rfg0Var).f25168a);
                } else {
                    if (!(rfg0Var instanceof pfg0)) {
                        t9f.b();
                        return null;
                    }
                    rouletteView.setNewValue(((pfg0) rfg0Var).f26904a);
                }
                return Unit.f46060a;
            case 3:
                k8o k8oVar = (k8o) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI4 = fetVar2.i(k8oVar);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new j8o(k8oVar, b5);
                        fetVar2.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zI5 = fetVar2.i(k8oVar);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new j8o(k8oVar, b4);
                        fetVar2.o0(objP5);
                    }
                    v3c.z(function0, (Function0) objP5, null, fetVar2, 0, 4);
                    k3t0 k3t0VarG0 = k8oVar.G0();
                    boolean zI6 = fetVar2.i(k8oVar);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        hin hinVar = new hin(1, k8oVar, k8o.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/model/EsportsWorldCupSideEffect;)V", 0, (byte) 12);
                        fetVar2.o0(hinVar);
                        objP6 = hinVar;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP6), fetVar2);
                    boolean zI7 = fetVar2.i(k3t0VarG0) | fetVar2.i(k8oVar) | fetVar2.e(3) | fetVar2.g(pz40VarF2);
                    Object objP7 = fetVar2.P();
                    if (zI7 || objP7 == cl5Var) {
                        ua7 ua7Var = new ua7(k3t0VarG0, k8oVar, pz40VarF2, null, (byte) 29);
                        fetVar2.o0(ua7Var);
                        objP7 = ua7Var;
                    }
                    m0x0.t(fetVar2, k8oVar, (Function2) objP7);
                    pz40 pz40VarY = ((i3t0) k8oVar.G0()).y(fetVar2);
                    qdz qdzVar = k8oVar.Q1;
                    boolean zI8 = fetVar2.i(k8oVar);
                    Object objP8 = fetVar2.P();
                    if (zI8 || objP8 == cl5Var) {
                        objP8 = new i8o(k8oVar, (byte) 1);
                        fetVar2.o0(objP8);
                    }
                    Function1 function1 = (Function1) objP8;
                    boolean zI9 = fetVar2.i(k8oVar);
                    Object objP9 = fetVar2.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new i8o(k8oVar, (byte) 2);
                        fetVar2.o0(objP9);
                    }
                    nkb.m(pz40VarY, qdzVar, function1, (Function1) objP9, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 4:
                chl0 chl0Var = (chl0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i = ExpressCardBottomView.r;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vfc.q(null, androidx.compose.runtime.e.f(chl0Var, fetVar3), vqo.e, null, null, fetVar3, 0, 25);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                kqo kqoVar = (kqo) obj3;
                a8z a8zVar = kqoVar.N1;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                pek pekVar2 = kqo.P1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI10 = fetVar4.i(kqoVar);
                    Object objP10 = fetVar4.P();
                    if (zI10 || objP10 == cl5Var) {
                        hin hinVar2 = new hin(1, kqoVar, kqo.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feature/dayexpress/impl/presentation/fragment/compose/models/ExpressEventsSideEffect;)V", 0, (byte) 16);
                        fetVar4.o0(hinVar2);
                        objP10 = hinVar2;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP10), fetVar4);
                    boolean zI11 = fetVar4.i(k3t0Var) | fetVar4.i(kqoVar) | fetVar4.e(3) | fetVar4.g(pz40VarF3);
                    Object objP11 = fetVar4.P();
                    if (zI11 || objP11 == cl5Var) {
                        bio bioVar = new bio(k3t0Var, kqoVar, pz40VarF3, null, (byte) 1);
                        fetVar4.o0(bioVar);
                        objP11 = bioVar;
                    }
                    m0x0.t(fetVar4, kqoVar, (Function2) objP11);
                    qqo qqoVar = (qqo) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar4).getValue();
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI12 = fetVar4.i(k3t0Var2);
                    Object objP12 = fetVar4.P();
                    if (zI12 || objP12 == cl5Var) {
                        hin hinVar3 = new hin(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                        fetVar4.o0(hinVar3);
                        objP12 = hinVar3;
                    }
                    jd8.B(qqoVar, (Function1) ((jhy) objP12), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                kbc.J((wm7) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                a8z a8zVar2 = ((ivo) obj3).N1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                xak xakVar = ivo.P1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar5);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI13 = fetVar5.i(k3t0Var3);
                    Object objP13 = fetVar5.P();
                    if (zI13 || objP13 == cl5Var) {
                        hin hinVar4 = new hin(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar5.o0(hinVar4);
                        objP13 = hinVar4;
                    }
                    xbc.v(pz40VarY2, (Function1) ((jhy) objP13), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                xbc.C((vvo) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 9:
                byo byoVar2 = (byo) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                bek bekVar2 = byo.P1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI14 = fetVar6.i(byoVar2);
                    Object objP14 = fetVar6.P();
                    if (zI14 || objP14 == cl5Var) {
                        objP14 = new zxo(byoVar2, b3);
                        fetVar6.o0(objP14);
                    }
                    Function0 function2 = (Function0) objP14;
                    boolean zI15 = fetVar6.i(byoVar2);
                    Object objP15 = fetVar6.P();
                    if (zI15 || objP15 == cl5Var) {
                        objP15 = new zxo(byoVar2, b2);
                        fetVar6.o0(objP15);
                    }
                    v3c.z(function2, (Function0) objP15, null, fetVar6, 0, 4);
                    k3t0 k3t0VarH2 = byoVar2.H0();
                    boolean zI16 = fetVar6.i(byoVar2);
                    Object objP16 = fetVar6.P();
                    if (zI16 || objP16 == cl5Var) {
                        byoVar = byoVar2;
                        hin hinVar5 = new hin(1, byoVar, byo.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/security/impl/presentation/password/change/fast_change_password/models/FastChangePasswordSideEffect;)V", 0, (byte) 20);
                        fetVar6.o0(hinVar5);
                        objP16 = hinVar5;
                    } else {
                        byoVar = byoVar2;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP16), fetVar6);
                    boolean zI17 = fetVar6.i(k3t0VarH2) | fetVar6.i(byoVar) | fetVar6.e(3) | fetVar6.g(pz40VarF4);
                    Object objP17 = fetVar6.P();
                    if (zI17 || objP17 == cl5Var) {
                        byo byoVar3 = byoVar;
                        bio bioVar2 = new bio(k3t0VarH2, byoVar3, pz40VarF4, null, (byte) 2);
                        byoVar = byoVar3;
                        fetVar6.o0(bioVar2);
                        objP17 = bioVar2;
                    }
                    m0x0.t(fetVar6, byoVar, (Function2) objP17);
                    yyo yyoVar = (yyo) ((i3t0) byoVar.H0()).y(fetVar6).getValue();
                    k3t0 k3t0VarH3 = byoVar.H0();
                    boolean zI18 = fetVar6.i(k3t0VarH3);
                    Object objP18 = fetVar6.P();
                    if (zI18 || objP18 == cl5Var) {
                        hin hinVar6 = new hin(1, k3t0VarH3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar6.o0(hinVar6);
                        objP18 = hinVar6;
                    }
                    dj8.v(yyoVar, (Function1) ((jhy) objP18), fetVar6, 6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 10:
                gzo gzoVar = (gzo) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                gzoVar.G(new uyo(rek0.b, str));
                gzoVar.y.a(th);
                return Unit.f46060a;
            case 11:
                t2p t2pVar = (t2p) obj3;
                a8z a8zVar3 = t2pVar.M1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ddk ddkVar = t2p.O1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    k3t0 k3t0Var4 = (k3t0) a8zVar3.getValue();
                    boolean zI19 = fetVar7.i(t2pVar);
                    Object objP19 = fetVar7.P();
                    if (zI19 || objP19 == cl5Var) {
                        hin hinVar7 = new hin(1, t2pVar, t2p.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/all_champs/compose/models/FavoriteAltChampsSideEffect;)V", 0, (byte) 24);
                        fetVar7.o0(hinVar7);
                        objP19 = hinVar7;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP19), fetVar7);
                    boolean zI20 = fetVar7.i(k3t0Var4) | fetVar7.i(t2pVar) | fetVar7.e(3) | fetVar7.g(pz40VarF5);
                    Object objP20 = fetVar7.P();
                    if (zI20 || objP20 == cl5Var) {
                        bio bioVar3 = new bio(k3t0Var4, t2pVar, pz40VarF5, null, (byte) 3);
                        fetVar7.o0(bioVar3);
                        objP20 = bioVar3;
                    }
                    m0x0.t(fetVar7, t2pVar, (Function2) objP20);
                    mm40 mm40VarH = phu0.H(jm40Var, null, 1);
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar7);
                    bdz bdzVar = (bdz) t2pVar.N1.getValue();
                    k3t0 k3t0Var5 = (k3t0) a8zVar3.getValue();
                    boolean zI21 = fetVar7.i(k3t0Var5);
                    Object objP21 = fetVar7.P();
                    if (zI21 || objP21 == cl5Var) {
                        objP21 = new hin(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar7.o0(objP21);
                    }
                    ny9.q(mm40VarH, pz40VarY3, bdzVar, (Function1) ((jhy) objP21), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 12:
                i3p i3pVar = (i3p) obj3;
                b1j.z((String) obj2, (Throwable) obj);
                p7m0 p7m0Var = i3pVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    i3pVar.f.getClass();
                } while (!p7m0Var.m(value, w2p.a((w2p) value, false, false, true, null, null, 122)));
                return Unit.f46060a;
            case 13:
                m4p m4pVar = (m4p) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                bek bekVar3 = m4p.S1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k3t0 k3t0VarG1 = m4pVar.G0();
                    boolean zI22 = fetVar8.i(m4pVar);
                    Object objP22 = fetVar8.P();
                    if (zI22 || objP22 == cl5Var) {
                        hin hinVar8 = new hin(1, m4pVar, m4p.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/category/models/FavoriteCategorySideEffect;)V", 0, (byte) 29);
                        fetVar8.o0(hinVar8);
                        objP22 = hinVar8;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP22), fetVar8);
                    boolean zI23 = fetVar8.i(k3t0VarG1) | fetVar8.i(m4pVar) | fetVar8.e(3) | fetVar8.g(pz40VarF6);
                    Object objP23 = fetVar8.P();
                    if (zI23 || objP23 == cl5Var) {
                        bio bioVar4 = new bio(k3t0VarG1, m4pVar, pz40VarF6, null, (byte) 4);
                        fetVar8.o0(bioVar4);
                        objP23 = bioVar4;
                    }
                    m0x0.t(fetVar8, m4pVar, (Function2) objP23);
                    pz40 pz40VarY4 = ((i3t0) m4pVar.G0()).y(fetVar8);
                    boolean zI24 = fetVar8.i(m4pVar);
                    Object objP24 = fetVar8.P();
                    if (zI24 || objP24 == cl5Var) {
                        objP24 = new i4p(m4pVar, b3);
                        fetVar8.o0(objP24);
                    }
                    Function0 function3 = (Function0) objP24;
                    boolean zI25 = fetVar8.i(m4pVar);
                    Object objP25 = fetVar8.P();
                    if (zI25 || objP25 == cl5Var) {
                        objP25 = new i4p(m4pVar, b2);
                        fetVar8.o0(objP25);
                    }
                    v3c.A(function3, (Function0) objP25, null, fetVar8, 0, 4);
                    mm40 mm40VarH2 = phu0.H(yyw.X(jm40Var, r14, fetVar8, 1), 0, 1);
                    k3t0 k3t0VarG2 = m4pVar.G0();
                    boolean zI26 = fetVar8.i(k3t0VarG2);
                    Object objP26 = fetVar8.P();
                    if (zI26 || objP26 == cl5Var) {
                        k4p k4pVar = new k4p(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 0);
                        fetVar8.o0(k4pVar);
                        objP26 = k4pVar;
                    }
                    p8a.u(0, fetVar8, mm40VarH2, pz40VarY4, (Function1) ((jhy) objP26));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 14:
                k6p k6pVar = (k6p) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                th2.printStackTrace();
                sac.V(jiu0.a(k6pVar), h6p.f12541a, null, k6pVar.g.f22085a, new g6p(k6pVar, z ? 1 : 0, b5), 10);
                return Unit.f46060a;
            case 15:
                s9p s9pVar = (s9p) obj3;
                d7p d7pVar = (d7p) obj2;
                ((oyg0) obj).getClass();
                d7pVar.getClass();
                boolean z2 = s9pVar instanceof l9p;
                Set set = d7pVar.b;
                if (z2) {
                    List list = d7pVar.f5604a;
                    setE = set.size() == list.size() ? xun.f41520a : CollectionsKt.P0(list);
                } else {
                    setE = set.contains(s9pVar) ? eui0.e(set, s9pVar) : eui0.h(set, s9pVar);
                }
                return d7p.a(d7pVar, null, setE, 1);
            case 16:
                org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = fVar.x;
                oep oepVar = new oep((jkm) fVar.w.getValue());
                p7m0Var2.getClass();
                p7m0Var2.o(null, oepVar);
                return Unit.f46060a;
            case 17:
                a8z a8zVar4 = ((pgp) obj3).M1;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ddk ddkVar2 = pgp.P1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar9);
                    k3t0 k3t0Var6 = (k3t0) a8zVar4.getValue();
                    boolean zI27 = fetVar9.i(k3t0Var6);
                    Object objP27 = fetVar9.P();
                    if (zI27 || objP27 == cl5Var) {
                        k4p k4pVar2 = new k4p(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                        fetVar9.o0(k4pVar2);
                        objP27 = k4pVar2;
                    }
                    y9a.w(pz40VarY5, (Function1) ((jhy) objP27), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 18:
                wgp wgpVar = (wgp) obj3;
                oyg0 oyg0Var = wgpVar.f;
                ocj ocjVar = wgpVar.i;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if (th3 instanceof ff5) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value3, rgp.a((rgp) value3, false, false, true)));
                } else {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var4.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value2, rgp.a((rgp) value2, false, true, false)));
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a8z a8zVar5 = ((ehp) obj3).L1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar5.getValue())).y(fetVar10);
                    k3t0 k3t0Var7 = (k3t0) a8zVar5.getValue();
                    boolean zI28 = fetVar10.i(k3t0Var7);
                    Object objP28 = fetVar10.P();
                    if (zI28 || objP28 == cl5Var) {
                        k4p k4pVar3 = new k4p(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar10.o0(k4pVar3);
                        objP28 = k4pVar3;
                    }
                    zgc.t(pz40VarY6, (Function1) ((jhy) objP28), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 20:
                rop ropVar = (rop) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                nek nekVar = rop.a2;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    k3t0 k3t0VarN0 = ropVar.N0();
                    Object objP29 = fetVar11.P();
                    if (objP29 == cl5Var) {
                        objP29 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar11);
                        fetVar11.o0(objP29);
                    }
                    vne vneVar = (vne) objP29;
                    boolean zI29 = fetVar11.i(ropVar);
                    Object objP30 = fetVar11.P();
                    if (zI29 || objP30 == cl5Var) {
                        objP30 = new pop(1, ropVar, rop.class, "handleContainerSideEffect", "handleContainerSideEffect(Lorg/xplatform/feed/linelive/presentation/feeds/models/FeedScreenSideEffect;)V", 0, (byte) 2);
                        fetVar11.o0(objP30);
                    }
                    Function1 function4 = (Function1) ((jhy) objP30);
                    Unit unit = Unit.f46060a;
                    boolean zI30 = fetVar11.i(vneVar) | fetVar11.i(k3t0VarN0) | fetVar11.g(function4) | fetVar11.g(null);
                    Object objP31 = fetVar11.P();
                    if (zI30 || objP31 == cl5Var) {
                        objP31 = new et(vneVar, k3t0VarN0, function4, (byte) 27);
                        fetVar11.o0(objP31);
                    }
                    m0x0.o(unit, (Function1) objP31, fetVar11);
                    pz40 pz40VarY7 = ((i3t0) ropVar.N0()).y(fetVar11);
                    Object[] objArr = new Object[0];
                    boolean zG = fetVar11.g(pz40VarY7);
                    Object objP32 = fetVar11.P();
                    if (zG || objP32 == cl5Var) {
                        objP32 = new plh(pz40VarY7, (byte) 28);
                        fetVar11.o0(objP32);
                    }
                    boolean zBooleanValue = ((Boolean) v3c.Y(objArr, (Function0) objP32, fetVar11).getValue()).booleanValue();
                    hgk0 hgk0Var = (hgk0) ropVar.Z1;
                    e2d e2dVarD = (e2d) hgk0Var.getValue();
                    if (e2dVarD == null) {
                        fetVar11.e0(1393479534);
                        e2dVarD = nip.d(ob3.d(0, 7, fetVar11), wzk0.a(fetVar11), fetVar11, 4);
                        hgk0Var.setValue(zBooleanValue ? e2dVarD : null);
                        fetVar11.r(false);
                    } else {
                        fetVar11.e0(1393474078);
                        fetVar11.r(false);
                    }
                    e2d e2dVar = e2dVarD;
                    boolean zI31 = fetVar11.i(ropVar);
                    Object objP33 = fetVar11.P();
                    if (zI31 || objP33 == cl5Var) {
                        wej wejVar = new wej(0, ropVar, rop.class, "dispatchOnBackPressed", "dispatchOnBackPressed()V", 0, (byte) 14);
                        fetVar11.o0(wejVar);
                        objP33 = wejVar;
                    }
                    jhy jhyVar = (jhy) objP33;
                    k3t0 k3t0VarN1 = ropVar.N0();
                    boolean zI32 = fetVar11.i(k3t0VarN1);
                    Object objP34 = fetVar11.P();
                    if (zI32 || objP34 == cl5Var) {
                        pop popVar = new pop(1, k3t0VarN1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar11.o0(popVar);
                        objP34 = popVar;
                    }
                    o2e.x(e2dVar, pz40VarY7, (Function0) jhyVar, (Function1) ((jhy) objP34), u1c.M(111261010, new ze2(ropVar, b4), fetVar11), fetVar11, 24576);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 21:
                a8z a8zVar6 = ((wtp) obj3).Q1;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                sek sekVar2 = wtp.R1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pz40 pz40VarY8 = ((i3t0) ((k3t0) a8zVar6.getValue())).y(fetVar12);
                    k3t0 k3t0Var8 = (k3t0) a8zVar6.getValue();
                    boolean zI33 = fetVar12.i(k3t0Var8);
                    Object objP35 = fetVar12.P();
                    if (zI33 || objP35 == cl5Var) {
                        pop popVar2 = new pop(1, k3t0Var8, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                        fetVar12.o0(popVar2);
                        objP35 = popVar2;
                    }
                    wvb.x(pz40VarY8, (Function1) ((jhy) objP35), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 22:
                svp svpVar = (svp) obj3;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ddk ddkVar3 = svp.S1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zI34 = fetVar13.i(svpVar);
                    Object objP36 = fetVar13.P();
                    if (zI34 || objP36 == cl5Var) {
                        objP36 = new rvp(svpVar, b5);
                        fetVar13.o0(objP36);
                    }
                    Function0 function5 = (Function0) objP36;
                    boolean zI35 = fetVar13.i(svpVar);
                    Object objP37 = fetVar13.P();
                    if (zI35 || objP37 == cl5Var) {
                        objP37 = new rvp(svpVar, b4);
                        fetVar13.o0(objP37);
                    }
                    v3c.z(function5, (Function0) objP37, null, fetVar13, 0, 4);
                    k3t0 k3t0VarG3 = svpVar.G0();
                    boolean zI36 = fetVar13.i(svpVar);
                    Object objP38 = fetVar13.P();
                    if (zI36 || objP38 == cl5Var) {
                        pop popVar3 = new pop(1, svpVar, svp.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/ufc/impl/fighter/presentation/model/FighterSideEffect;)V", 0, (byte) 7);
                        fetVar13.o0(popVar3);
                        objP38 = popVar3;
                    }
                    lkz lkzVar7 = lkz.f20223a;
                    pz40 pz40VarF7 = androidx.compose.runtime.e.f((Function1) ((jhy) objP38), fetVar13);
                    boolean zI37 = fetVar13.i(k3t0VarG3) | fetVar13.i(svpVar) | fetVar13.e(3) | fetVar13.g(pz40VarF7);
                    Object objP39 = fetVar13.P();
                    if (zI37 || objP39 == cl5Var) {
                        bio bioVar5 = new bio(k3t0VarG3, svpVar, pz40VarF7, null, (byte) 5);
                        fetVar13.o0(bioVar5);
                        objP39 = bioVar5;
                    }
                    m0x0.t(fetVar13, svpVar, (Function2) objP39);
                    pz40 pz40VarY9 = ((i3t0) svpVar.G0()).y(fetVar13);
                    qdz qdzVar2 = svpVar.Q1;
                    k3t0 k3t0VarG4 = svpVar.G0();
                    boolean zI38 = fetVar13.i(k3t0VarG4);
                    Object objP40 = fetVar13.P();
                    if (zI38 || objP40 == cl5Var) {
                        pop popVar4 = new pop(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar13.o0(popVar4);
                        objP40 = popVar4;
                    }
                    x8f.B(pz40VarY9, qdzVar2, (Function1) ((jhy) objP40), fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 23:
                return a(obj, obj2);
            case 24:
                r8q r8qVar = (r8q) obj3;
                Throwable th4 = (Throwable) obj;
                String str2 = (String) obj2;
                th4.getClass();
                str2.getClass();
                if (th4 instanceof zhi0) {
                    r8qVar.B((zhi0) th4, new gmo(r8qVar, str2, (byte) 12));
                } else {
                    r8qVar.T.f(new c8q(str2));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return b(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return c(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return g(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return h(obj, obj2);
            default:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                ((v62) obj3).e();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ f5o(Object obj, int i, byte b) {
        this.f8972a = b;
        this.b = obj;
    }
}
