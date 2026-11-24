package a;

import android.util.TypedValue;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yfg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42541a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yfg(nqh nqhVar) {
        this.f42541a = (byte) 8;
        this.b = nqhVar;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0420  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        tbh tbhVar;
        Object value;
        sso0 sso0Var;
        kuw kuwVar;
        Object value2;
        byte b = this.f42541a;
        pcy pcyVar = e7z.u1;
        byte b2 = 19;
        byte b3 = 5;
        jm40 jm40Var = jm40.b;
        yje yjeVar = null;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 3;
        byte b5 = 2;
        byte b6 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zfg zfgVar = (zfg) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kud kudVar = zfg.S1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = fetVar.i(zfgVar);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new xfg(zfgVar, b5);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zI2 = fetVar.i(zfgVar);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new xfg(zfgVar, b4);
                        fetVar.o0(objP2);
                    }
                    v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
                    pz40 pz40VarY = ((i3t0) zfgVar.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = zfgVar.G0();
                    boolean zI3 = fetVar.i(zfgVar);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        x6f x6fVar = new x6f(1, zfgVar, zfg.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/regular/presentation/results/model/CyberChampionshipResultsSideEffect;)V", 0, (byte) 14);
                        fetVar.o0(x6fVar);
                        objP3 = x6fVar;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar);
                    boolean zI4 = fetVar.i(k3t0VarG0) | fetVar.i(zfgVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        ua7 ua7Var = new ua7(k3t0VarG0, zfgVar, pz40VarF, null, (byte) 20);
                        fetVar.o0(ua7Var);
                        objP4 = ua7Var;
                    }
                    m0x0.t(fetVar, zfgVar, (Function2) objP4);
                    qdz qdzVar = zfgVar.R1;
                    boolean zI5 = fetVar.i(zfgVar);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new hfg(zfgVar, b6);
                        fetVar.o0(objP5);
                    }
                    saj.p(pz40VarY, qdzVar, (Function1) objP5, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                kbh kbhVar = (kbh) obj3;
                ubh ubhVar = (ubh) obj2;
                ((oyg0) obj).getClass();
                ubhVar.getClass();
                List list = ubhVar.d;
                boolean z = kbhVar.f18014a;
                if (z) {
                    tbhVar = list.isEmpty() ? tbh.b : ubhVar.c;
                } else {
                    tbhVar = tbh.f33663a;
                }
                tbh tbhVar2 = tbhVar;
                if (!kbhVar.f18014a) {
                    list = iun.f15405a;
                }
                return ubh.a(ubhVar, null, z, tbhVar2, list, false, false, null, null, null, 497);
            case 2:
                ((clz) obj).getClass();
                ((blz) obj2).getClass();
                kxq kxqVarN0 = ((Fragment) obj3).n0();
                Window window = kxqVarN0.getWindow();
                window.getClass();
                TypedValue typedValue = j5d.f15927a;
                ofm0.A(window, kxqVarN0, R.color.static_transparent, j5d.a(kxqVarN0, R.attr.uikitBackgroundContent, true), false, !qem0.r(kxqVarN0));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                feb.u((dhh) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                mjh mjhVar = (mjh) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                std stdVar = mjh.Q1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) mjhVar.M1.getValue())).y(fetVar2);
                    boolean zI6 = fetVar2.i(mjhVar);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new hfg(mjhVar, b2);
                        fetVar2.o0(objP6);
                    }
                    j120.m(pz40VarY2, (Function1) objP6, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                dub.c((jnh) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                xbc.d((jph) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                mqh mqhVar = (mqh) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarV = vic.v(jm40Var);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarV, 8.0f);
                    thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar3, 54);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    a4x a4xVar = mqhVar.f22224a;
                    a4x a4xVar2 = mqhVar.b;
                    obb.h(5, 0, fetVar3, dyb.o0(CollectionsKt.D0(a4xVar, 3)), x7zVar);
                    v3c.e(null, dyb.o0(CollectionsKt.D0(mqhVar.f22224a, 3)), dyb.o0(CollectionsKt.D0(a4xVar2, 3)), fetVar3, 0);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    obb.h(6, 0, fetVar3, dyb.o0(CollectionsKt.D0(a4xVar2, 3)), new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 8:
                nqh nqhVar = (nqh) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarV2 = vic.v(jm40Var);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ2 = s5x0.J(mm40VarV2, 8.0f);
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar4, 0);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarJ2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    fetVar4.e0(-1806815225);
                    Iterator it = CollectionsKt.D0(nqhVar.f23959a, 3).iterator();
                    while (it.hasNext()) {
                        acb.i(null, (jph) it.next(), fetVar4, 0);
                    }
                    fetVar4.r(false);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 9:
                a8z a8zVar = ((muh) obj3).Q1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                kud kudVar2 = muh.R1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar5);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI7 = fetVar5.i(k3t0Var);
                    Object objP7 = fetVar5.P();
                    if (zI7 || objP7 == cl5Var) {
                        y6h y6hVar = new y6h(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 2);
                        fetVar5.o0(y6hVar);
                        objP7 = y6hVar;
                    }
                    hkb.e(pz40VarY3, (Function1) ((jhy) objP7), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 10:
                dvh dvhVar = (dvh) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = dvhVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dvhVar.f.getClass();
                } while (!p7m0Var.m(value, ruh.a((ruh) value, null, false, true, false, null, null, null, null, null, iun.f15405a, 4039)));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                xkb.k((euh) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                a8z a8zVar2 = ((yvh) obj3).P1;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                qud qudVar = yvh.Q1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar6);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI8 = fetVar6.i(k3t0Var2);
                    Object objP8 = fetVar6.P();
                    if (zI8 || objP8 == cl5Var) {
                        y6h y6hVar2 = new y6h(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar6.o0(y6hVar2);
                        objP8 = y6hVar2;
                    }
                    y860.v(pz40VarY4, (Function1) ((jhy) objP8), fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 13:
                a8z a8zVar3 = ((nxh) obj3).N1;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                kwd kwdVar = nxh.P1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar7);
                    k3t0 k3t0Var3 = (k3t0) a8zVar3.getValue();
                    boolean zI9 = fetVar7.i(k3t0Var3);
                    Object objP9 = fetVar7.P();
                    if (zI9 || objP9 == cl5Var) {
                        y6h y6hVar3 = new y6h(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                        fetVar7.o0(y6hVar3);
                        objP9 = y6hVar3;
                    }
                    ju70.o(pz40VarY5, (Function1) ((jhy) objP9), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                cql cqlVar = (cql) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    if (cqlVar.e.length() > 0) {
                        fetVar8.e0(-274709205);
                        String str = cqlVar.e;
                        int iOrdinal = cqlVar.d.ordinal();
                        if (iOrdinal == 0) {
                            sso0Var = nso0.f24059a;
                        } else if (iOrdinal == 1) {
                            sso0Var = bqo0.f3042a;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            sso0Var = xpo0.f41280a;
                        }
                        j6n.h(str, sso0Var, null, 0, 0, fetVar8, 0, 28);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-274507395);
                        fetVar8.r(false);
                    }
                    if (cqlVar.h == null) {
                        fetVar8.e0(-274451720);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-274451719);
                        j6n.h(cqlVar.h, qro0.f29220a, null, 0, 0, fetVar8, 48, 28);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                jiq0.R((yx30) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                jiq0.W((dy30) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                boolean z2 = ((g9n) obj3).b;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zH = fetVar9.h(z2);
                    Object objP10 = fetVar9.P();
                    if (zH || objP10 == cl5Var) {
                        objP10 = Integer.valueOf(z2 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive);
                        fetVar9.o0(objP10);
                    }
                    int iIntValue10 = ((Number) objP10).intValue();
                    zcl zclVar3 = qmk.f28987a;
                    dww.c(a8k0.F(iIntValue10, 0, fetVar9), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar9.k(zaq0.b)).getPrimary(), fetVar9, 56, 0);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 18:
                btj btjVar = (btj) obj3;
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                sac.V(jiu0.a(btjVar), new x2i((byte) 22), null, null, new e9g(btjVar, str2, yjeVar, b2), 14);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar10 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar10.e0(666084174);
                String str3 = ((b5q0) obj3).b;
                fetVar10.r(false);
                return str3;
            case 20:
                c8k c8kVar = (c8k) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                kud kudVar3 = c8k.Q1;
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l8k l8kVar = (l8k) ((i3t0) c8kVar.G0()).y(fetVar11).getValue();
                    k3t0 k3t0VarG1 = c8kVar.G0();
                    boolean zI10 = fetVar11.i(k3t0VarG1);
                    Object objP11 = fetVar11.P();
                    if (zI10 || objP11 == cl5Var) {
                        y6h y6hVar4 = new y6h(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                        fetVar11.o0(y6hVar4);
                        objP11 = y6hVar4;
                    }
                    hmw0.s(l8kVar, (Function1) ((jhy) objP11), fetVar11, 0);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 21:
                m8k m8kVar = (m8k) obj3;
                Throwable th = (Throwable) obj;
                String str4 = (String) obj2;
                th.getClass();
                str4.getClass();
                String strA = m8kVar.r.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                if (th instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th;
                    if (zhi0Var.f44396a == i2o.Forbidden.getErrorCode() && ((kuwVar = zhi0Var.c) == i2o.DayDepositLimitInvalidRange || kuwVar == i2o.WeekDepositLimitInvalidRange || kuwVar == i2o.MonthDepositLimitInvalidRange || kuwVar == i2o.DayMonthLimitHierarchyViolationWarning || kuwVar == i2o.DayYearLimitHierarchyViolationWarning || kuwVar == i2o.MonthDayDepositLimitsInvalidRange || kuwVar == i2o.CurrentDepositLimitsInvalidValue || kuwVar == i2o.CurrentDepositLimitsExpensesInvalid)) {
                        String str5 = StringsKt.W(str4) ? strA : str4;
                        p7m0 p7m0Var2 = m8kVar.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            m8kVar.f.getClass();
                        } while (!p7m0Var2.m(value2, k8k.a((k8k) value2, null, null, false, str5, 23)));
                        m8kVar.o.e("TEXT_FIELD_ERROR", str5);
                    } else {
                        m8kVar.G(new i8k(strA));
                    }
                } else {
                    m8kVar.G(new i8k(strA));
                }
                return Unit.f46060a;
            case 22:
                pak pakVar = (pak) obj3;
                Throwable th2 = (Throwable) obj;
                String str6 = (String) obj2;
                b1j.z(str6, th2);
                if (th2 instanceof zhi0) {
                    kuw kuwVar2 = ((zhi0) th2).c;
                    if (kuwVar2 == i2o.DepositLimitInvalidRange || kuwVar2 == i2o.DayDepositLimitInvalidRange || kuwVar2 == i2o.WeekDepositLimitInvalidRange || kuwVar2 == i2o.MonthDepositLimitInvalidRange) {
                        pakVar.w(new kak(str6));
                    } else if (kuwVar2 == i2o.LimitChangeFailed || kuwVar2 == i2o.GamblingExamFailed || kuwVar2 == i2o.SecondRequesetDenied) {
                        pakVar.w(new jak(str6));
                    } else {
                        pakVar.w(new mak(str6));
                    }
                } else {
                    pakVar.w(lak.f19709a);
                }
                return Unit.f46060a;
            case 23:
                cbk cbkVar = (cbk) obj3;
                a8z a8zVar4 = cbkVar.N1;
                fet fetVar12 = (fet) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                xak xakVar = cbk.O1;
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar12);
                    k3t0 k3t0Var4 = (k3t0) a8zVar4.getValue();
                    boolean zI11 = fetVar12.i(cbkVar);
                    Object objP12 = fetVar12.P();
                    if (zI11 || objP12 == cl5Var) {
                        y6h y6hVar5 = new y6h(1, cbkVar, cbk.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/limits/ie/impl/presentation/lock_screens/deposit/models/DepositLockScreenSideEffect;)V", 0, (byte) 20);
                        fetVar12.o0(y6hVar5);
                        objP12 = y6hVar5;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP12), fetVar12);
                    boolean zI12 = fetVar12.i(k3t0Var4) | fetVar12.i(cbkVar) | fetVar12.e(3) | fetVar12.g(pz40VarF2);
                    Object objP13 = fetVar12.P();
                    if (zI12 || objP13 == cl5Var) {
                        ua7 ua7Var2 = new ua7(k3t0Var4, cbkVar, pz40VarF2, null, (byte) 24);
                        fetVar12.o0(ua7Var2);
                        objP13 = ua7Var2;
                    }
                    m0x0.t(fetVar12, cbkVar, (Function2) objP13);
                    k3t0 k3t0Var5 = (k3t0) a8zVar4.getValue();
                    boolean zI13 = fetVar12.i(k3t0Var5);
                    Object objP14 = fetVar12.P();
                    if (zI13 || objP14 == cl5Var) {
                        objP14 = new y6h(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar12.o0(objP14);
                    }
                    nnw0.n(pz40VarY6, (Function1) ((jhy) objP14), fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 24:
                jbk jbkVar = (jbk) obj3;
                Throwable th3 = (Throwable) obj;
                String str7 = (String) obj2;
                b1j.z(str7, th3);
                byte b7 = 26;
                byte b8 = 29;
                if (th3 instanceof zhi0) {
                    sac.V(jiu0.a(jbkVar), new x2i(b8), null, null, new e9g(jbkVar, str7, yjeVar, b7), 14);
                } else {
                    sac.V(jiu0.a(jbkVar), new x2i(b8), null, null, new e9g(jbkVar, jbkVar.c.f(R.string.something_went_wrong, new Object[0]), yjeVar, b7), 14);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((kbk) obj3).G(gbk.f11018a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ((xik) obj3).a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                crk crkVar = (crk) obj3;
                fet fetVar13 = (fet) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                xak xakVar2 = crk.W1;
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zI14 = fetVar13.i(crkVar);
                    Object objP15 = fetVar13.P();
                    if (zI14 || objP15 == cl5Var) {
                        objP15 = new yqk(crkVar, (byte) 4);
                        fetVar13.o0(objP15);
                    }
                    Function0 function1 = (Function0) objP15;
                    boolean zI15 = fetVar13.i(crkVar);
                    Object objP16 = fetVar13.P();
                    if (zI15 || objP16 == cl5Var) {
                        objP16 = new yqk(crkVar, b3);
                        fetVar13.o0(objP16);
                    }
                    v3c.z(function1, (Function0) objP16, null, fetVar13, 0, 4);
                    pz40 pz40VarY7 = ((i3t0) crkVar.G0()).y(fetVar13);
                    k3t0 k3t0VarG2 = crkVar.G0();
                    boolean zI16 = fetVar13.i(crkVar);
                    Object objP17 = fetVar13.P();
                    if (zI16 || objP17 == cl5Var) {
                        y6h y6hVar6 = new y6h(1, crkVar, crk.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/discipline/presentation/details/common/model/DisciplineDetailsSideEffect;)V", 0, (byte) 25);
                        fetVar13.o0(y6hVar6);
                        objP17 = y6hVar6;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP17), fetVar13);
                    boolean zI17 = fetVar13.i(k3t0VarG2) | fetVar13.i(crkVar) | fetVar13.e(3) | fetVar13.g(pz40VarF3);
                    Object objP18 = fetVar13.P();
                    if (zI17 || objP18 == cl5Var) {
                        ua7 ua7Var3 = new ua7(k3t0VarG2, crkVar, pz40VarF3, null, (byte) 25);
                        fetVar13.o0(ua7Var3);
                        objP18 = ua7Var3;
                    }
                    m0x0.t(fetVar13, crkVar, (Function2) objP18);
                    qdz qdzVar2 = crkVar.V1;
                    boolean zI18 = fetVar13.i(crkVar);
                    Object objP19 = fetVar13.P();
                    if (zI18 || objP19 == cl5Var) {
                        objP19 = new zqk(crkVar, b6);
                        fetVar13.o0(objP19);
                    }
                    Function1 function2 = (Function1) objP19;
                    boolean zI19 = fetVar13.i(crkVar);
                    Object objP20 = fetVar13.P();
                    if (zI19 || objP20 == cl5Var) {
                        objP20 = new zqk(crkVar, b5);
                        fetVar13.o0(objP20);
                    }
                    vbc.r(pz40VarY7, qdzVar2, function2, (Function1) objP20, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                osk oskVar = (osk) obj3;
                fet fetVar14 = (fet) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    v8q0.a(oskVar.c, o2e.e0(jm40Var, "DISCIPLINE_DETAILS_HEADER_FOCUS_TOOLBAR_TITLE"), ((ThemeColors) fetVar14.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar14, 48, 0, 131064);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            default:
                cuk cukVar = (cuk) obj3;
                String str8 = (String) obj;
                String str9 = (String) obj2;
                bek bekVar = cuk.l2;
                str8.getClass();
                str9.getClass();
                vcc.f0(i120.V(new Pair("KEY_PICKER_SELECTED_DISCIPLINE_REQUEST", str8)), cukVar, "KEY_PICKER_SELECTED_DISCIPLINE_REQUEST");
                guk gukVar = (guk) cukVar.g2.getValue();
                dq00 dq00Var = gukVar.f;
                int i = gukVar.b;
                dq00Var.getClass();
                ((yo4) dq00Var.b).f42966a.a("bet_statistic_medal_table_sport_choose", xp20.f(new Pair("championship_id", Integer.valueOf(i)), new Pair("sport_id", str9)));
                ((zr1) dq00Var.c).f44833a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str9, (byte) 0)}), 3118L);
                cukVar.x0();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ yfg(mqh mqhVar) {
        this.f42541a = (byte) 7;
        this.b = mqhVar;
    }

    public /* synthetic */ yfg(Object obj, byte b) {
        this.f42541a = b;
        this.b = obj;
    }

    public /* synthetic */ yfg(Object obj, int i, byte b) {
        this.f42541a = b;
        this.b = obj;
    }
}
