package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.chips.Chip;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bna implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2873a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bna(Object obj, byte b) {
        this.f2873a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        androidx.recyclerview.widget.b layoutManager;
        View viewD;
        Object value;
        String message;
        byte b = this.f2873a;
        jm40 jm40Var = jm40.b;
        byte b2 = 6;
        yje yjeVar = null;
        Object obj3 = ukd.f35823a;
        byte b3 = 3;
        byte b4 = 7;
        byte b5 = 2;
        Object[] objArr = 0;
        byte b6 = 1;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                rq8.t((t5a0) obj4, (fet) obj, x8x.L(1));
                break;
            case 1:
                xra xraVar = (xra) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                cl5 cl5Var = xra.X1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0VarO0 = xraVar.O0();
                    Object objP = fetVar.P();
                    if (objP == obj3) {
                        objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                        fetVar.o0(objP);
                    }
                    vne vneVar = (vne) objP;
                    boolean zI = fetVar.i(xraVar);
                    Object objP2 = fetVar.P();
                    if (zI || objP2 == obj3) {
                        Object vraVar = new vra(1, xraVar, xra.class, "handleCardsInHeaderContainerSideEffect", "handleCardsInHeaderContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/screen/cards_in_header/models/CardsInHeaderContainerSideEffect;)V", 0, (byte) 5);
                        fetVar.o0(vraVar);
                        objP2 = vraVar;
                    }
                    Function1 function1 = (Function1) ((jhy) objP2);
                    Unit unit = Unit.f46060a;
                    boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarO0) | fetVar.g(function1) | fetVar.g(null);
                    Object objP3 = fetVar.P();
                    if (zI2 || objP3 == obj3) {
                        objP3 = new et(vneVar, k3t0VarO0, function1, (byte) 8);
                        fetVar.o0(objP3);
                    }
                    m0x0.o(unit, (Function1) objP3, fetVar);
                    mm40 mm40VarH = phu0.H(jm40Var, null, 1);
                    bra braVar = (bra) ((i3t0) xraVar.O0()).y(fetVar).getValue();
                    k3t0 k3t0VarO1 = xraVar.O0();
                    boolean zI3 = fetVar.i(k3t0VarO1);
                    Object objP4 = fetVar.P();
                    if (zI3 || objP4 == obj3) {
                        objP4 = new vra(1, k3t0VarO1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                        fetVar.o0(objP4);
                    }
                    p8a.l(mm40VarH, braVar, (Function1) ((jhy) objP4), u1c.M(480852606, new awh(xraVar, (byte) 16), fetVar), fetVar, 3072);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                bua buaVar = (bua) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                gl5 gl5Var = bua.Q1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3t0 k3t0VarG0 = buaVar.G0();
                    boolean zI4 = fetVar2.i(buaVar);
                    Object objP5 = fetVar2.P();
                    if (zI4 || objP5 == obj3) {
                        Object vraVar2 = new vra(1, buaVar, bua.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/cards_info_settings/impl/presentation/model/CardsInfoSettingsSideEffect;)V", 0, (byte) 7);
                        fetVar2.o0(vraVar2);
                        objP5 = vraVar2;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP5), fetVar2);
                    boolean zI5 = fetVar2.i(k3t0VarG0) | fetVar2.i(buaVar) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP6 = fetVar2.P();
                    if (zI5 || objP6 == obj3) {
                        Object ua7Var = new ua7(k3t0VarG0, buaVar, pz40VarF, null, (byte) 12);
                        fetVar2.o0(ua7Var);
                        objP6 = ua7Var;
                    }
                    m0x0.t(fetVar2, buaVar, (Function2) objP6);
                    mua muaVar = (mua) ((i3t0) buaVar.G0()).y(fetVar2).getValue();
                    k3t0 k3t0VarG1 = buaVar.G0();
                    boolean zI6 = fetVar2.i(k3t0VarG1);
                    Object objP7 = fetVar2.P();
                    if (zI6 || objP7 == obj3) {
                        Object vraVar3 = new vra(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar2.o0(vraVar3);
                        objP7 = vraVar3;
                    }
                    q8a.d(null, muaVar, (Function1) ((jhy) objP7), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 3:
                wxa wxaVar = (wxa) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                kl5 kl5Var = wxa.U1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI7 = fetVar3.i(wxaVar);
                    Object objP8 = fetVar3.P();
                    if (zI7 || objP8 == obj3) {
                        objP8 = new uxa(wxaVar, b2);
                        fetVar3.o0(objP8);
                    }
                    Function0 function0 = (Function0) objP8;
                    boolean zI8 = fetVar3.i(wxaVar);
                    Object objP9 = fetVar3.P();
                    if (zI8 || objP9 == obj3) {
                        objP9 = new uxa(wxaVar, b4);
                        fetVar3.o0(objP9);
                    }
                    v3c.A(function0, (Function0) objP9, null, fetVar3, 0, 4);
                    k3t0 k3t0VarG2 = wxaVar.G0();
                    boolean zI9 = fetVar3.i(wxaVar);
                    Object objP10 = fetVar3.P();
                    if (zI9 || objP10 == obj3) {
                        objP10 = new d38(wxaVar, (byte) 29);
                        fetVar3.o0(objP10);
                    }
                    clz clzVar = (clz) fetVar3.k(or00.f25714a);
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) objP10, fetVar3);
                    boolean zI10 = fetVar3.i(k3t0VarG2) | fetVar3.i(clzVar) | fetVar3.e(3) | fetVar3.g(pz40VarF2);
                    Object objP11 = fetVar3.P();
                    if (zI10 || objP11 == obj3) {
                        Object pcVar = new pc(k3t0VarG2, clzVar, pz40VarF2, null, (byte) 6);
                        fetVar3.o0(pcVar);
                        objP11 = pcVar;
                    }
                    m0x0.t(fetVar3, clzVar, (Function2) objP11);
                    pz40 pz40VarY = ((i3t0) wxaVar.G0()).y(fetVar3);
                    k3t0 k3t0VarG3 = wxaVar.G0();
                    boolean zI11 = fetVar3.i(k3t0VarG3);
                    Object objP12 = fetVar3.P();
                    if (zI11 || objP12 == obj3) {
                        Object vraVar4 = new vra(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                        fetVar3.o0(vraVar4);
                        objP12 = vraVar4;
                    }
                    zgc.j(pz40VarY, (Function1) ((jhy) objP12), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 4:
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                bj5 bj5Var = aya.S1;
                yya yyaVarI0 = ((aya) obj4).I0();
                if (yyaVarI0.r) {
                    if (iIntValue4 == iIntValue5) {
                        ArrayList arrayList = yyaVarI0.n;
                        arrayList.getClass();
                        bby bbyVar = yyaVarI0.p;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            yyaVarI0.p = sac.V(jiu0.a(yyaVarI0), new vya(yyaVarI0, b6), null, yyaVarI0.l.b, new d09((Object) yyaVarI0, (Object) arrayList, yjeVar, (byte) 19), 10);
                        }
                    } else {
                        yyaVarI0.x.f(yyaVarI0.m.b.a(R.string.add_games_error, Arrays.copyOf(new Object[0], 0)));
                    }
                }
                break;
            case 5:
                yya yyaVar = (yya) obj4;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = yyaVar.v;
                ra10 ra10VarB = sa10.b(yyaVar.h, pb10.g, R.string.data_retrieval_error, 0, null, 28);
                p7m0Var.getClass();
                p7m0Var.o(null, ra10VarB);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ro4.p((iza) obj4, (fet) obj, x8x.L(7));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ro4.q((gza) obj4, (fet) obj, x8x.L(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                fre0.o((qza) obj4, (fet) obj, x8x.L(7));
                break;
            case 9:
                ((Integer) obj2).getClass();
                fre0.p((nza) obj4, (fet) obj, x8x.L(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                fre0.q((oza) obj4, (fet) obj, x8x.L(7));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ccq0.h((r0b) obj4, (fet) obj, x8x.L(7));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ccq0.i((p0b) obj4, (fet) obj, x8x.L(7));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ohq0.p((x0b) obj4, (fet) obj, x8x.L(7));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ohq0.q((v0b) obj4, (fet) obj, x8x.L(7));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ohq0.r((u0b) obj4, (fet) obj, x8x.L(7));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ohq0.t((t0b) obj4, (fet) obj, x8x.L(7));
                break;
            case 17:
                g5b g5bVar = (g5b) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gl5 gl5Var2 = g5b.c2;
                if (fetVar4.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Unit unit2 = Unit.f46060a;
                    boolean zI12 = fetVar4.i(g5bVar);
                    Object objP13 = fetVar4.P();
                    if (zI12 || objP13 == obj3) {
                        objP13 = new b5b(g5bVar, objArr == true ? 1 : 0);
                        fetVar4.o0(objP13);
                    }
                    m0x0.o(unit2, (Function1) objP13, fetVar4);
                    k3t0 k3t0VarQ0 = g5bVar.Q0();
                    boolean zI13 = fetVar4.i(g5bVar);
                    Object objP14 = fetVar4.P();
                    if (zI13 || objP14 == obj3) {
                        Object vraVar5 = new vra(1, g5bVar, g5b.class, "handleCategoryImageHeaderSideEffect", "handleCategoryImageHeaderSideEffect(Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderSideEffect;)V", 0, (byte) 26);
                        fetVar4.o0(vraVar5);
                        objP14 = vraVar5;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP14), fetVar4);
                    boolean zI14 = fetVar4.i(k3t0VarQ0) | fetVar4.i(g5bVar) | fetVar4.e(3) | fetVar4.g(pz40VarF3);
                    Object objP15 = fetVar4.P();
                    if (zI14 || objP15 == obj3) {
                        Object ua7Var2 = new ua7(k3t0VarQ0, g5bVar, pz40VarF3, null, (byte) 13);
                        fetVar4.o0(ua7Var2);
                        objP15 = ua7Var2;
                    }
                    m0x0.t(fetVar4, g5bVar, (Function2) objP15);
                    mm40 mm40VarH2 = phu0.H(jm40Var, null, 1);
                    q5b q5bVar = (q5b) ((i3t0) g5bVar.Q0()).y(fetVar4).getValue();
                    k3t0 k3t0VarQ1 = g5bVar.Q0();
                    boolean zI15 = fetVar4.i(k3t0VarQ1);
                    Object objP16 = fetVar4.P();
                    if (zI15 || objP16 == obj3) {
                        objP16 = new vra(1, k3t0VarQ1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar4.o0(objP16);
                    }
                    o2e.m(mm40VarH2, q5bVar, (Function1) ((jhy) objP16), u1c.M(-931645574, new ze2(g5bVar, b6), fetVar4), fetVar4, 3072);
                } else {
                    fetVar4.X();
                }
                break;
            case 18:
                bib bibVar = (bib) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                bj5 bj5Var2 = bib.X1;
                if (fetVar5.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) bibVar.J0()).y(fetVar5);
                    boolean zI16 = fetVar5.i(bibVar);
                    Object objP17 = fetVar5.P();
                    if (zI16 || objP17 == obj3) {
                        Object zhbVar = new zhb(1, bibVar, bib.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/loyalty/impl/presentation/models/ChampionsClubSideEffect;)V", 0, (byte) 0);
                        fetVar5.o0(zhbVar);
                        objP17 = zhbVar;
                    }
                    bibVar.G0((Function1) ((jhy) objP17), fetVar5, 0);
                    FixedWebView fixedWebView = bibVar.O1;
                    if (fixedWebView == null) {
                        fetVar5.e0(1546344152);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(1546344153);
                        pib pibVar = (pib) pz40VarY2.getValue();
                        k3t0 k3t0VarJ0 = bibVar.J0();
                        boolean zI17 = fetVar5.i(k3t0VarJ0);
                        Object objP18 = fetVar5.P();
                        if (zI17 || objP18 == obj3) {
                            Object zhbVar2 = new zhb(1, k3t0VarJ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                            fetVar5.o0(zhbVar2);
                            objP18 = zhbVar2;
                        }
                        int i = FixedWebView.e;
                        qjj.i(pibVar, fixedWebView, (Function1) ((jhy) objP18), fetVar5, 64);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xjb xjbVar = (xjb) obj4;
                a8z a8zVar = xjbVar.P1;
                fet fetVar6 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                kj5 kj5Var = xjb.U1;
                if (fetVar6.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI18 = fetVar6.i(xjbVar);
                    Object objP19 = fetVar6.P();
                    if (zI18 || objP19 == obj3) {
                        Object zhbVar3 = new zhb(1, xjbVar, xjb.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/ufc/impl/championship/presentation/model/ChampionshipSideEffect;)V", 0, (byte) 2);
                        fetVar6.o0(zhbVar3);
                        objP19 = zhbVar3;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP19), fetVar6);
                    boolean zI19 = fetVar6.i(k3t0Var) | fetVar6.i(xjbVar) | fetVar6.e(3) | fetVar6.g(pz40VarF4);
                    Object objP20 = fetVar6.P();
                    if (zI19 || objP20 == obj3) {
                        Object ua7Var3 = new ua7(k3t0Var, xjbVar, pz40VarF4, null, (byte) 14);
                        fetVar6.o0(ua7Var3);
                        objP20 = ua7Var3;
                    }
                    m0x0.t(fetVar6, xjbVar, (Function2) objP20);
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar6);
                    qdz qdzVar = xjbVar.Q1;
                    boolean zI20 = fetVar6.i(xjbVar);
                    Object objP21 = fetVar6.P();
                    if (zI20 || objP21 == obj3) {
                        objP21 = new vjb(xjbVar, (byte) 1);
                        fetVar6.o0(objP21);
                    }
                    nkb.b(pz40VarY3, qdzVar, (Function1) objP21, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                break;
            case 20:
                hrb hrbVar = (hrb) obj4;
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                sac.R(jiu0.a(hrbVar), new lya(hrbVar, (byte) 13), null, hrbVar.c.f22085a, new fob(hrbVar, str, yjeVar, b2));
                break;
            case 21:
                srb srbVar = (srb) obj4;
                a8z a8zVar2 = srbVar.M1;
                fet fetVar7 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                kj5 kj5Var2 = srb.N1;
                if (fetVar7.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    Object objP22 = fetVar7.P();
                    if (objP22 == obj3) {
                        objP22 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar7);
                        fetVar7.o0(objP22);
                    }
                    vne vneVar2 = (vne) objP22;
                    boolean zI21 = fetVar7.i(srbVar);
                    Object objP23 = fetVar7.P();
                    if (zI21 || objP23 == obj3) {
                        Object zhbVar4 = new zhb(1, srbVar, srb.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/pin_code/impl/presentation/change/compose/models/ChangePinCodeSideEffect;)V", 0, (byte) 9);
                        fetVar7.o0(zhbVar4);
                        objP23 = zhbVar4;
                    }
                    Function1 function2 = (Function1) ((jhy) objP23);
                    Unit unit3 = Unit.f46060a;
                    boolean zI22 = fetVar7.i(vneVar2) | fetVar7.i(k3t0Var2) | fetVar7.g(function2) | fetVar7.g(null);
                    Object objP24 = fetVar7.P();
                    if (zI22 || objP24 == obj3) {
                        objP24 = new et(vneVar2, k3t0Var2, function2, (byte) 17);
                        fetVar7.o0(objP24);
                    }
                    m0x0.o(unit3, (Function1) objP24, fetVar7);
                    wrb wrbVar = (wrb) ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar7).getValue();
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI23 = fetVar7.i(k3t0Var3);
                    Object objP25 = fetVar7.P();
                    if (zI23 || objP25 == obj3) {
                        Object zhbVar5 = new zhb(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                        fetVar7.o0(zhbVar5);
                        objP25 = zhbVar5;
                    }
                    mrv.u(null, wrbVar, (Function1) ((jhy) objP25), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 22:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                ((s1c) obj4).v.f(new z0c(str2));
                break;
            case 23:
                rac racVar = (rac) obj4;
                String str3 = (String) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                str3.getClass();
                racVar.h = iIntValue10;
                RecyclerView recyclerView = racVar.i;
                if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (viewD = layoutManager.D(racVar.h)) != null) {
                    recyclerView.A0((viewD.getWidth() / 2) + (viewD.getLeft() - (recyclerView.getWidth() / 2)), 0, null, Integer.MIN_VALUE, false);
                }
                racVar.g();
                racVar.g.invoke(str3);
                break;
            case 24:
                zac zacVar = (zac) obj4;
                Chip chip = (Chip) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                chip.getClass();
                if (zacVar.h.f21402a) {
                    b5q b5qVar = new b5q(pgi0.h(new ihu0(zacVar), i13.t));
                    while (b5qVar.hasNext()) {
                        Chip chip2 = (Chip) b5qVar.next();
                        chip2.setSelectedInternal(zBooleanValue && Intrinsics.d(chip2, chip));
                    }
                }
                Function1 function3 = zacVar.l;
                if (function3 != null) {
                    function3.invoke(zacVar.getSelectedChips());
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jdc jdcVar = (jdc) obj4;
                fet fetVar8 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                cl5 cl5Var2 = jdc.Q1;
                if (fetVar8.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) jdcVar.G0()).y(fetVar8);
                    k3t0 k3t0VarG4 = jdcVar.G0();
                    boolean zI24 = fetVar8.i(jdcVar);
                    Object objP26 = fetVar8.P();
                    if (zI24 || objP26 == obj3) {
                        Object zhbVar6 = new zhb(1, jdcVar, jdc.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits_ne/impl/presentation/choice_new_limit/models/ChoiceNewLimitNeSideEffect;)V", 0, (byte) 17);
                        fetVar8.o0(zhbVar6);
                        objP26 = zhbVar6;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP26), fetVar8);
                    boolean zI25 = fetVar8.i(k3t0VarG4) | fetVar8.i(jdcVar) | fetVar8.e(3) | fetVar8.g(pz40VarF5);
                    Object objP27 = fetVar8.P();
                    if (zI25 || objP27 == obj3) {
                        Object ua7Var4 = new ua7(k3t0VarG4, jdcVar, pz40VarF5, null, (byte) 16);
                        fetVar8.o0(ua7Var4);
                        objP27 = ua7Var4;
                    }
                    m0x0.t(fetVar8, jdcVar, (Function2) objP27);
                    Object objG0 = jdcVar.G0();
                    boolean zI26 = fetVar8.i(objG0);
                    Object objP28 = fetVar8.P();
                    if (zI26 || objP28 == obj3) {
                        Object zhbVar7 = new zhb(1, objG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 18);
                        fetVar8.o0(zhbVar7);
                        objP28 = zhbVar7;
                    }
                    cjx.m(pz40VarY4, (Function1) ((jhy) objP28), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                ((wdc) obj4).G(new pdc(str4));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dfc dfcVar = (dfc) obj4;
                a8z a8zVar3 = dfcVar.M1;
                fet fetVar9 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                gl5 gl5Var3 = dfc.N1;
                if (fetVar9.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI27 = fetVar9.i(dfcVar);
                    Object objP29 = fetVar9.P();
                    if (zI27 || objP29 == obj3) {
                        objP29 = new bfc(dfcVar, b5);
                        fetVar9.o0(objP29);
                    }
                    Function0 function4 = (Function0) objP29;
                    boolean zI28 = fetVar9.i(dfcVar);
                    Object objP30 = fetVar9.P();
                    if (zI28 || objP30 == obj3) {
                        objP30 = new bfc(dfcVar, b3);
                        fetVar9.o0(objP30);
                    }
                    v3c.z(function4, (Function0) objP30, null, fetVar9, 0, 4);
                    gfc gfcVar = (gfc) ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar9).getValue();
                    k3t0 k3t0Var4 = (k3t0) a8zVar3.getValue();
                    boolean zI29 = fetVar9.i(k3t0Var4);
                    Object objP31 = fetVar9.P();
                    if (zI29 || objP31 == obj3) {
                        Object zhbVar8 = new zhb(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar9.o0(zhbVar8);
                        objP31 = zhbVar8;
                    }
                    knx.n(null, gfcVar, (Function1) ((jhy) objP31), fetVar9, 0);
                } else {
                    fetVar9.X();
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                nhc nhcVar = (nhc) obj4;
                fet fetVar10 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                bj5 bj5Var3 = nhc.P1;
                if (fetVar10.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) nhcVar.G0()).y(fetVar10);
                    k3t0 k3t0VarG5 = nhcVar.G0();
                    boolean zI30 = fetVar10.i(nhcVar);
                    Object objP32 = fetVar10.P();
                    if (zI30 || objP32 == obj3) {
                        Object zhbVar9 = new zhb(1, nhcVar, nhc.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/limits_ee/impl/presentation/choose_loss_limit/models/ChooseLossLimitEeSideEffect;)V", 0, (byte) 25);
                        fetVar10.o0(zhbVar9);
                        objP32 = zhbVar9;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP32), fetVar10);
                    boolean zI31 = fetVar10.i(k3t0VarG5) | fetVar10.i(nhcVar) | fetVar10.e(3) | fetVar10.g(pz40VarF6);
                    Object objP33 = fetVar10.P();
                    if (zI31 || objP33 == obj3) {
                        Object ua7Var5 = new ua7(k3t0VarG5, nhcVar, pz40VarF6, null, (byte) 17);
                        fetVar10.o0(ua7Var5);
                        objP33 = ua7Var5;
                    }
                    m0x0.t(fetVar10, nhcVar, (Function2) objP33);
                    Object objG1 = nhcVar.G0();
                    boolean zI32 = fetVar10.i(objG1);
                    Object objP34 = fetVar10.P();
                    if (zI32 || objP34 == obj3) {
                        Object zhbVar10 = new zhb(1, objG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                        fetVar10.o0(zhbVar10);
                        objP34 = zhbVar10;
                    }
                    i120.o(pz40VarY5, (Function1) ((jhy) objP34), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                break;
            default:
                yhc yhcVar = (yhc) obj4;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = yhcVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    yhcVar.f.getClass();
                } while (!p7m0Var2.m(value, whc.a((whc) value, 0L, null, null, false, 223)));
                String str5 = "";
                if ((th instanceof zhi0) && (message = th.getMessage()) != null) {
                    str5 = message;
                }
                yhcVar.G(new uhc(str5));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bna(Object obj, int i, byte b) {
        this.f2873a = b;
        this.b = obj;
    }
}
