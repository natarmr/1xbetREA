package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ba30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2239a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ba30(Object obj, Object obj2, byte b) {
        this.f2239a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x06f7  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        String str;
        Object value;
        Object value2;
        Object value3;
        kuw kuwVar;
        String message;
        Object obj3;
        byte b = this.f2239a;
        cl5 cl5Var = ukd.f35823a;
        boolean z = false;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) obj5;
                ea30 ea30Var = (ea30) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = MatchInfoContainerView.t1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d0k0 d0k0Var = (d0k0) ((hgk0) matchInfoContainerView.p1).getValue();
                    boolean zI = fetVar.i(ea30Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        du20 du20Var = new du20(1, ea30Var, ea30.class, "onSimulationClick", "onSimulationClick(Lorg/xplatform/sportgame/classic/impl/presentation/models/SimulationNavigateUiModel;)V", 0, (byte) 23);
                        fetVar.o0(du20Var);
                        objP = du20Var;
                    }
                    bww.u(jm40.b, d0k0Var, (Function1) ((jhy) objP), fetVar, 6);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                b5x.f((mm40) obj5, (mg30) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                m8x.m((mm40) obj5, (al30) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ucx.n((mm40) obj5, (db30) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                efx.d((mm40) obj5, (nt30) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                wim wimVar = (wim) obj;
                wimVar.getClass();
                ((Function1) obj5).invoke(new vy30(((ly30) obj4).f20847a, wimVar.f39221a, (String) obj2));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                q8a.u((w740) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                x2x.c((String) obj5, (ja40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                b5x.k((mm40) obj5, (pa40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                x9x.i((mm40) obj5, (li40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                bdx.a((s2m) obj5, (p2m) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                String str2 = (String) obj4;
                dl40 dl40Var = (dl40) obj2;
                ((oyg0) obj).getClass();
                dl40Var.getClass();
                boolean zEquals = ((rh40) obj5).f30472a.equals("MLBB_FIRST_TEAM_LINEUP_ID");
                o4i0 o4i0Var = dl40Var.s;
                return dl40.a(dl40Var, null, null, null, null, null, false, null, false, false, null, null, zEquals ? o4i0.a(str2, o4i0Var.b) : o4i0.a(o4i0Var.f24637a, str2), false, null, 0L, 16515071);
            case 12:
                Integer num = (Integer) obj5;
                pcq pcqVar = (pcq) obj4;
                oyg0 oyg0Var = (oyg0) obj;
                gp40 gp40Var = (gp40) obj2;
                oyg0Var.getClass();
                gp40Var.getClass();
                long jLongValue = ((Number) q7x.D(oyg0Var, 0L, "INPUT_VALUE_KEY")).longValue();
                int iIntValue2 = -1;
                int iIntValue3 = ((Number) q7x.D(oyg0Var, -1, "SELECTED_VALUE_INDEX_KEY")).intValue();
                String str3 = (String) q7x.D(oyg0Var, "", "TEXT_FIELD_ERROR");
                int iIntValue4 = num != null ? num.intValue() : -1;
                if (jLongValue > 0) {
                    i = iIntValue2;
                } else if (iIntValue3 >= 0) {
                    i = iIntValue3;
                } else {
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    }
                    i = iIntValue2;
                }
                return gp40.a(gp40Var, pcqVar, false, str3, iIntValue4, i, jLongValue, false, 273);
            case 13:
                ip40 ip40Var = (ip40) obj5;
                oyg0 oyg0Var2 = ip40Var.f;
                ocj ocjVar = ip40Var.i;
                pcq pcqVar2 = (pcq) obj4;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                String strA = ip40Var.p.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                boolean z2 = th instanceof zhi0;
                zhi0 zhi0Var = z2 ? (zhi0) th : null;
                if (zhi0Var == null || (message = zhi0Var.getMessage()) == null) {
                    str = strA;
                } else {
                    String str4 = StringsKt.W(message) ? null : message;
                    if (str4 != null) {
                        str = str4;
                    } else {
                        str = strA;
                    }
                }
                boolean z3 = z2 && ((zhi0) th).f44396a == i2o.Forbidden.getErrorCode();
                if (z3 && ((kuwVar = ((zhi0) th).c) == i2o.DayDepositLimitInvalidRange || kuwVar == i2o.WeekDepositLimitInvalidRange || kuwVar == i2o.MonthDepositLimitInvalidRange || kuwVar == i2o.DayMonthLimitHierarchyViolationWarning || kuwVar == i2o.DayYearLimitHierarchyViolationWarning || kuwVar == i2o.MonthDayDepositLimitsInvalidRange || kuwVar == i2o.CurrentDepositLimitsInvalidValue || kuwVar == i2o.CurrentDepositLimitsExpensesInvalid || kuwVar == i2o.MonthDayWeekLimitsInvalidRange || kuwVar == i2o.WeekDayLimitsInvalidRange)) {
                    z = true;
                }
                if (z && pcqVar2.q.isEmpty()) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        oyg0Var2.getClass();
                        q7x.F(oyg0Var2, str, "TEXT_FIELD_ERROR");
                    } while (!p7m0Var.m(value3, gp40.a((gp40) value3, null, false, str, 0, 0, 0L, false, Response.SERVICE_UNAVAILABLE)));
                } else if (z3) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var2.m(value2, gp40.a((gp40) value2, null, false, null, 0, 0, 0L, !z, 255)));
                    ip40Var.G(new ep40(str));
                } else {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var2.getClass();
                    } while (!p7m0Var3.m(value, gp40.a((gp40) value, null, false, null, 0, 0, 0L, false, 255)));
                    ip40Var.G(new ep40(strA));
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                q8x.l((mm40) obj5, (dx40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                r8x.q((mm40) obj5, (ex40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                e9x.l((mm40) obj5, (q5m) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                d650 d650Var = (d650) obj5;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                sac.V(jiu0.a(d650Var), m550.f21205a, null, d650Var.L.b, new xr10(d650Var, (Throwable) obj4, false ? 1 : 0, (byte) 17), 10);
                return Unit.f46060a;
            case 18:
                p850 p850Var = (p850) obj5;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                sac.V(jiu0.a(p850Var), p750.f26491a, null, p850Var.p.b, new xr10(p850Var, (Throwable) obj4, false ? 1 : 0, (byte) 20), 10);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                po50 po50Var = (po50) obj5;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                htz htzVar = po50.S1;
                if (fetVar2.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) po50Var.G0()).y(fetVar2);
                    w2d w2dVarW0 = uzb.w0(1, fetVar2);
                    k3t0 k3t0VarG0 = po50Var.G0();
                    boolean zI2 = fetVar2.i(po50Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        wzu0 wzu0Var = new wzu0(1, po50Var, po50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_catalog/alt_desings/big_banner/models/NewsCatalogBigBannerSideEffect;)V", 0, (byte) 23);
                        fetVar2.o0(wzu0Var);
                        objP2 = wzu0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar2);
                    boolean zE = fetVar2.e(3) | fetVar2.i(k3t0VarG0) | fetVar2.i(po50Var) | fetVar2.g(pz40VarF);
                    Object objP3 = fetVar2.P();
                    boolean z4 = false;
                    if (zE || objP3 == cl5Var) {
                        p000 p000Var = new p000(k3t0VarG0, po50Var, pz40VarF, null, (byte) 14);
                        fetVar2.o0(p000Var);
                        obj3 = p000Var;
                    } else {
                        obj3 = objP3;
                    }
                    m0x0.t(fetVar2, po50Var, (Function2) obj3);
                    boolean zI3 = fetVar2.i(po50Var);
                    Object objP4 = fetVar2.P();
                    Object obj6 = objP4;
                    if (zI3 || objP4 == cl5Var) {
                        no50 no50Var = new no50(po50Var, (byte) 1);
                        fetVar2.o0(no50Var);
                        obj6 = no50Var;
                    }
                    Function0 function0 = (Function0) obj6;
                    boolean zI4 = fetVar2.i(po50Var);
                    Object objP5 = fetVar2.P();
                    Object obj7 = objP5;
                    if (zI4 || objP5 == cl5Var) {
                        no50 no50Var2 = new no50(po50Var, (byte) 2);
                        fetVar2.o0(no50Var2);
                        obj7 = no50Var2;
                    }
                    v3c.z(function0, (Function0) obj7, null, fetVar2, 0, 4);
                    Boolean boolValueOf = Boolean.valueOf(w2dVarW0.f38442a.a() == 0.0f);
                    boolean zI5 = fetVar2.i(po50Var) | fetVar2.i(w2dVarW0);
                    Object objP6 = fetVar2.P();
                    Object obj8 = objP6;
                    if (zI5 || objP6 == cl5Var) {
                        xr10 xr10Var = new xr10(po50Var, w2dVarW0, z4, (byte) 23);
                        fetVar2.o0(xr10Var);
                        obj8 = xr10Var;
                    }
                    m0x0.t(fetVar2, boolValueOf, (Function2) obj8);
                    Object value4 = pz40VarY.getValue();
                    boolean zG = fetVar2.g(pz40VarY) | fetVar2.i(w2dVarW0);
                    Object objP7 = fetVar2.P();
                    Object obj9 = objP7;
                    if (zG || objP7 == cl5Var) {
                        xr10 xr10Var2 = new xr10(pz40VarY, w2dVarW0, (yje) z4);
                        fetVar2.o0(xr10Var2);
                        obj9 = xr10Var2;
                    }
                    m0x0.t(fetVar2, value4, (Function2) obj9);
                    cp50 cp50Var = (cp50) pz40VarY.getValue();
                    k3t0 k3t0VarG1 = po50Var.G0();
                    boolean zI6 = fetVar2.i(k3t0VarG1);
                    Object objP8 = fetVar2.P();
                    if (zI6 || objP8 == cl5Var) {
                        objP8 = new r750(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                        fetVar2.o0(objP8);
                    }
                    lv00.I(mm40Var, w2dVarW0, cp50Var, (Function1) ((jhy) objP8), fetVar2, 70);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 20:
                Integer num2 = (Integer) obj;
                num2.intValue();
                ((xdr) obj5).F(num2, Integer.valueOf(((yo5) obj4).f42967a), (String) obj2);
                return Unit.f46060a;
            case 21:
                lp50 lp50Var = (lp50) obj5;
                a8z a8zVar = lp50Var.L1;
                mm40 mm40Var2 = (mm40) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                uuz uuzVar = lp50.R1;
                if (fetVar3.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar3);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI7 = fetVar3.i(lp50Var);
                    Object objP9 = fetVar3.P();
                    Object obj10 = objP9;
                    if (zI7 || objP9 == cl5Var) {
                        wzu0 wzu0Var2 = new wzu0(1, lp50Var, lp50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_catalog/alt_desings/cards/models/NewsCatalogCardSideEffect;)V", 0, (byte) 24);
                        fetVar3.o0(wzu0Var2);
                        obj10 = wzu0Var2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) obj10), fetVar3);
                    boolean zE2 = fetVar3.e(3) | fetVar3.i(k3t0Var) | fetVar3.i(lp50Var) | fetVar3.g(pz40VarF2);
                    Object objP10 = fetVar3.P();
                    if (zE2 || objP10 == cl5Var) {
                        p000 p000Var2 = new p000(k3t0Var, lp50Var, pz40VarF2, null, (byte) 15);
                        fetVar3.o0(p000Var2);
                        objP10 = p000Var2;
                    }
                    m0x0.t(fetVar3, lp50Var, (Function2) objP10);
                    boolean zI8 = fetVar3.i(lp50Var);
                    Object objP11 = fetVar3.P();
                    Object obj11 = objP11;
                    if (zI8 || objP11 == cl5Var) {
                        jp50 jp50Var = new jp50(lp50Var, (byte) 1);
                        fetVar3.o0(jp50Var);
                        obj11 = jp50Var;
                    }
                    v3c.z((Function0) obj11, null, null, fetVar3, 0, 6);
                    rp50 rp50Var = (rp50) pz40VarY2.getValue();
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI9 = fetVar3.i(k3t0Var2);
                    Object objP12 = fetVar3.P();
                    if (zI9 || objP12 == cl5Var) {
                        r750 r750Var = new r750(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar3.o0(r750Var);
                        objP12 = r750Var;
                    }
                    i120.D(mm40Var2, rp50Var, (Function1) ((jhy) objP12), fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 22:
                Integer num3 = (Integer) obj;
                num3.intValue();
                ((xdr) obj5).F(num3, Integer.valueOf(((vo5) obj4).f37748a), (String) obj2);
                return Unit.f46060a;
            case 23:
                hq50 hq50Var = (hq50) obj5;
                a8z a8zVar2 = hq50Var.L1;
                mm40 mm40Var3 = (mm40) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                xuz xuzVar = hq50.R1;
                if (fetVar4.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar4);
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI10 = fetVar4.i(hq50Var);
                    Object objP13 = fetVar4.P();
                    if (zI10 || objP13 == cl5Var) {
                        wzu0 wzu0Var3 = new wzu0(1, hq50Var, hq50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_catalog_type/alt/models/NewsCatalogCategorySideEffect;)V", 0, (byte) 25);
                        fetVar4.o0(wzu0Var3);
                        objP13 = wzu0Var3;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP13), fetVar4);
                    boolean zE3 = fetVar4.e(3) | fetVar4.i(k3t0Var3) | fetVar4.i(hq50Var) | fetVar4.g(pz40VarF3);
                    Object objP14 = fetVar4.P();
                    if (zE3 || objP14 == cl5Var) {
                        p000 p000Var3 = new p000(k3t0Var3, hq50Var, pz40VarF3, null, (byte) 16);
                        fetVar4.o0(p000Var3);
                        objP14 = p000Var3;
                    }
                    m0x0.t(fetVar4, hq50Var, (Function2) objP14);
                    boolean zI11 = fetVar4.i(hq50Var);
                    Object objP15 = fetVar4.P();
                    Object obj12 = objP15;
                    if (zI11 || objP15 == cl5Var) {
                        eq50 eq50Var = new eq50(hq50Var, (byte) 1);
                        fetVar4.o0(eq50Var);
                        obj12 = eq50Var;
                    }
                    v3c.z((Function0) obj12, null, null, fetVar4, 0, 6);
                    String strN = hq50Var.N1.n(hq50Var, hq50.S1[1]);
                    mq50 mq50Var = (mq50) pz40VarY3.getValue();
                    k3t0 k3t0Var4 = (k3t0) a8zVar2.getValue();
                    boolean zI12 = fetVar4.i(k3t0Var4);
                    Object objP16 = fetVar4.P();
                    if (zI12 || objP16 == cl5Var) {
                        objP16 = new r750(1, k3t0Var4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 11);
                        fetVar4.o0(objP16);
                    }
                    j120.q(mm40Var3, strN, mq50Var, (Function1) ((jhy) objP16), fetVar4, 6);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 24:
                cr50 cr50Var = (cr50) obj5;
                a8z a8zVar3 = cr50Var.L1;
                mm40 mm40Var4 = (mm40) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                evz evzVar = cr50.R1;
                if (fetVar5.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar5);
                    k3t0 k3t0Var5 = (k3t0) a8zVar3.getValue();
                    boolean zI13 = fetVar5.i(cr50Var);
                    Object objP17 = fetVar5.P();
                    Object obj13 = objP17;
                    if (zI13 || objP17 == cl5Var) {
                        wzu0 wzu0Var4 = new wzu0(1, cr50Var, cr50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_catalog/alt_desings/chips_categories/models/NewsCatalogChipsCategoriesSideEffect;)V", 0, (byte) 26);
                        fetVar5.o0(wzu0Var4);
                        obj13 = wzu0Var4;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) obj13), fetVar5);
                    boolean zE4 = fetVar5.e(3) | fetVar5.i(k3t0Var5) | fetVar5.i(cr50Var) | fetVar5.g(pz40VarF4);
                    Object objP18 = fetVar5.P();
                    boolean z5 = false;
                    if (zE4 || objP18 == cl5Var) {
                        p000 p000Var4 = new p000(k3t0Var5, cr50Var, pz40VarF4, null, (byte) 17);
                        fetVar5.o0(p000Var4);
                        objP18 = p000Var4;
                    }
                    m0x0.t(fetVar5, cr50Var, (Function2) objP18);
                    w2d w2dVarW1 = uzb.w0(0, fetVar5);
                    boolean zI14 = fetVar5.i(cr50Var);
                    Object objP19 = fetVar5.P();
                    Object obj14 = objP19;
                    if (zI14 || objP19 == cl5Var) {
                        ar50 ar50Var = new ar50(cr50Var, (byte) 1);
                        fetVar5.o0(ar50Var);
                        obj14 = ar50Var;
                    }
                    v3c.z((Function0) obj14, null, null, fetVar5, 0, 6);
                    boolean zG2 = fetVar5.g(pz40VarY4) | fetVar5.i(w2dVarW1);
                    Object objP20 = fetVar5.P();
                    Object obj15 = objP20;
                    if (zG2 || objP20 == cl5Var) {
                        xr10 xr10Var3 = new xr10(pz40VarY4, w2dVarW1, z5, (byte) 25);
                        fetVar5.o0(xr10Var3);
                        obj15 = xr10Var3;
                    }
                    m0x0.t(fetVar5, pz40VarY4, (Function2) obj15);
                    kr50 kr50Var = (kr50) pz40VarY4.getValue();
                    String simpleName = cr50.class.getSimpleName();
                    k3t0 k3t0Var6 = (k3t0) a8zVar3.getValue();
                    boolean zI15 = fetVar5.i(k3t0Var6);
                    Object objP21 = fetVar5.P();
                    if (zI15 || objP21 == cl5Var) {
                        r750 r750Var2 = new r750(1, k3t0Var6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                        fetVar5.o0(r750Var2);
                        objP21 = r750Var2;
                    }
                    o050.z(mm40Var4, w2dVarW1, kr50Var, simpleName, (Function1) ((jhy) objP21), fetVar5, 70);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Integer num4 = (Integer) obj;
                num4.getClass();
                ((xdr) obj5).F(num4, Integer.valueOf(((wo5) obj4).f39476a), (String) obj2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Integer num5 = (Integer) obj;
                num5.intValue();
                ((xdr) obj5).F(num5, Integer.valueOf(((hr50) ((kr50) obj4)).b), (String) obj2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ct5 ct5Var = (ct5) obj;
                ct5Var.getClass();
                ((xdr) ((zr50) obj5).v).F((uo5) obj4, ct5Var, (String) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                rs50 rs50Var = (rs50) obj5;
                mm40 mm40Var5 = (mm40) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                atz atzVar = rs50.R1;
                if (fetVar6.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) rs50Var.G0()).y(fetVar6);
                    k3t0 k3t0VarG2 = rs50Var.G0();
                    boolean zI16 = fetVar6.i(rs50Var);
                    Object objP22 = fetVar6.P();
                    Object obj16 = objP22;
                    if (zI16 || objP22 == cl5Var) {
                        wzu0 wzu0Var5 = new wzu0(1, rs50Var, rs50.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/news/impl/presentation/news_catalog/alt_desings/rows/models/NewsCatalogRowsSideEffect;)V", 0, (byte) 27);
                        fetVar6.o0(wzu0Var5);
                        obj16 = wzu0Var5;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) obj16), fetVar6);
                    boolean zE5 = fetVar6.e(3) | fetVar6.i(k3t0VarG2) | fetVar6.i(rs50Var) | fetVar6.g(pz40VarF5);
                    Object objP23 = fetVar6.P();
                    if (zE5 || objP23 == cl5Var) {
                        p000 p000Var5 = new p000(k3t0VarG2, rs50Var, pz40VarF5, null, (byte) 18);
                        fetVar6.o0(p000Var5);
                        objP23 = p000Var5;
                    }
                    m0x0.t(fetVar6, rs50Var, (Function2) objP23);
                    boolean zI17 = fetVar6.i(rs50Var);
                    Object objP24 = fetVar6.P();
                    Object obj17 = objP24;
                    if (zI17 || objP24 == cl5Var) {
                        ps50 ps50Var = new ps50(rs50Var, (byte) 1);
                        fetVar6.o0(ps50Var);
                        obj17 = ps50Var;
                    }
                    Function0 function1 = (Function0) obj17;
                    boolean zI18 = fetVar6.i(rs50Var);
                    Object objP25 = fetVar6.P();
                    Object obj18 = objP25;
                    if (zI18 || objP25 == cl5Var) {
                        ps50 ps50Var2 = new ps50(rs50Var, (byte) 2);
                        fetVar6.o0(ps50Var2);
                        obj18 = ps50Var2;
                    }
                    v3c.z(function1, (Function0) obj18, null, fetVar6, 0, 4);
                    at50 at50Var = (at50) pz40VarY5.getValue();
                    k3t0 k3t0VarG3 = rs50Var.G0();
                    boolean zI19 = fetVar6.i(k3t0VarG3);
                    Object objP26 = fetVar6.P();
                    if (zI19 || objP26 == cl5Var) {
                        r750 r750Var3 = new r750(1, k3t0VarG3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                        fetVar6.o0(r750Var3);
                        objP26 = r750Var3;
                    }
                    y860.G(mm40Var5, at50Var, (Function1) ((jhy) objP26), fetVar6, 6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            default:
                Integer num6 = (Integer) obj;
                num6.getClass();
                ((xdr) obj5).F(num6, Integer.valueOf(((xo5) obj4).f41199a), (String) obj2);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ba30(Object obj, Object obj2, int i, byte b) {
        this.f2239a = b;
        this.b = obj;
        this.c = obj2;
    }
}
