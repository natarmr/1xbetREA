package a;

import a.iiy;
import a.m1r;
import a.ppc0;
import a.ufx;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;
import org.xplatform.promo.impl.promocodes.navigation.PromoCodesScreenFactory$getPromoShopDetailScreen$1;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.DocumentStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.SocialStateModel;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;
import org.xplatform.ufc.impl.navigation.UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oac0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24923a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oac0(Object obj, Object obj2, byte b) {
        this.f24923a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        List listC;
        byte b = 17;
        byte b2 = 20;
        boolean z = false;
        z = false;
        z = false;
        final byte b3 = 1;
        switch (this.f24923a) {
            case 0:
                pac0 pac0Var = (pac0) this.b;
                oyg0 oyg0Var = pac0Var.f;
                String str = (String) this.c;
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                b4j b4jVar = pac0Var.q;
                b4jVar.getClass();
                str.getClass();
                b4jVar.f1961a.a("promo_code_check_call", xp20.f(new Pair("promocode", str), new Pair("option", "error")));
                x20 x20Var = pac0Var.t;
                x20Var.getClass();
                s1p s1pVar = x20Var.f40143a;
                s1pVar.a(tx3.l0(new k1p[]{new j1p(str, (byte) 0), new j1p("", (byte) 1)}), 3086L);
                ocj ocjVar = pac0Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, jac0.a((jac0) value, false, false, false, null, null, 30)));
                if (th instanceof bfc0) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, jac0.a((jac0) value2, false, false, true, null, null, 27)));
                } else {
                    boolean z2 = th instanceof zhi0;
                    zhi0 zhi0Var = z2 ? (zhi0) th : null;
                    if ((zhi0Var != null ? zhi0Var.c : null) == i2o.y2) {
                        s1pVar.a(cui0.b(new j1p(str, (byte) 0)), 3088L);
                        b4jVar.getClass();
                        b4jVar.f1961a.a("promo_code_check_block", wp20.b(new Pair("promocode", str)));
                        pac0Var.G(new fac0(String.valueOf(th.getMessage())));
                    } else {
                        zhi0 zhi0Var2 = z2 ? (zhi0) th : null;
                        if ((zhi0Var2 != null ? zhi0Var2.c : null) == i2o.Ok) {
                            s1pVar.a(cui0.b(new j1p(str, (byte) 0)), 3088L);
                            String message = th.getMessage();
                            if (message != null) {
                                pac0Var.G(new fac0(message));
                            }
                        } else {
                            duj dujVar = pac0Var.p;
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                th = cause;
                            }
                            dujVar.b(th, new lma0(pac0Var, b2));
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                kec0 kec0Var = (kec0) this.b;
                Function1 function1 = (Function1) this.c;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = kec0Var.c;
                hczVar.f(a4xVar.size(), new zu90(b, new t4c0((byte) 15), a4xVar), new d1c0(a4xVar, (byte) 1), new ugd(2039820996, true, new a100(a4xVar, function1, (byte) 24)));
                return Unit.f46060a;
            case 2:
                sec0 sec0Var = (sec0) this.b;
                vrc0 vrc0Var = (vrc0) this.c;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rl70 rl70Var = sec0Var.r;
                vrc0 vrc0VarG0 = vrc0Var.g0("codes_check");
                rl70Var.getClass();
                k0w0Var.h(new PromoCodesScreenFactory$getPromoShopDetailScreen$1(vrc0VarG0));
                return Unit.f46060a;
            case 3:
                l8c0 l8c0Var = (l8c0) this.b;
                cp cpVar = (cp) this.c;
                ((View) obj).getClass();
                l8c0Var.invoke(((sfc0) cpVar.u()).f32113a);
                return Unit.f46060a;
            case 4:
                clc0 clc0Var = (clc0) this.b;
                String str2 = (String) this.c;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                uf3 uf3Var = clc0Var.d;
                Map map = clc0Var.r;
                if (map == null) {
                    map = lun.f20680a;
                    map.getClass();
                }
                k0w0Var2.h(tf3.a(uf3Var, str2, map, 48));
                return Unit.f46060a;
            case 5:
                lmc0 lmc0Var = (lmc0) this.b;
                a8z a8zVar = (a8z) this.c;
                smc0 smc0Var = (smc0) obj;
                mi70 mi70Var = lmc0.Q1;
                smc0Var.getClass();
                rek0 rek0Var = rek0.b;
                if (smc0Var instanceof qmc0) {
                    ii iiVar = lmc0Var.P1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String str3 = ((qmc0) smc0Var).f28977a;
                    String strH = lmc0Var.H(R.string.ok);
                    strH.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) str3, (CharSequence) null, (CharSequence) strH, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC = lmc0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (smc0Var.equals(rmc0.f30737a)) {
                    wdk0 wdk0Var = lmc0Var.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    String strH2 = lmc0Var.H(R.string.access_denied_with_bonus_currency_message);
                    strH2.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH2, null, null, null, null, 124), lmc0Var, null, null, false, null, 1020);
                } else {
                    if (!smc0Var.equals(pmc0.f27225a)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var2 = lmc0Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    String strH3 = lmc0Var.H(R.string.access_denied_with_bonus_currency_message);
                    strH3.getClass();
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, strH3, null, null, null, null, 124), lmc0Var, null, null, false, null, 1020);
                }
                ((k3t0) a8zVar.getValue()).x(ulc0.f35866a);
                return Unit.f46060a;
            case 6:
                final wmc0 wmc0Var = (wmc0) this.b;
                final Function1 function2 = (Function1) this.c;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, jiq0.k, 3);
                hcz.e(hczVar2, null, null, new ugd(1276706873, true, new xdr() { // from class: a.nmc0
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b4 = b3;
                        cl5 cl5Var = ukd.f35823a;
                        Function1 function3 = function2;
                        wmc0 wmc0Var2 = wmc0Var;
                        g9z g9zVar = (g9z) obj2;
                        fet fetVar = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (b4) {
                            case 0:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zmc0 zmc0Var = wmc0Var2.c;
                                    boolean zG = fetVar.g(function3);
                                    Object objP = fetVar.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new ru80(function3, (byte) 6);
                                        fetVar.o0(objP);
                                    }
                                    Function2 function4 = (Function2) objP;
                                    boolean zG2 = fetVar.g(function3);
                                    Object objP2 = fetVar.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new bac0(function3, (byte) 12);
                                        fetVar.o0(objP2);
                                    }
                                    i4w0.v(zmc0Var, function4, (Function0) objP2, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    vmc0 vmc0Var = wmc0Var2.b;
                                    boolean zG3 = fetVar.g(function3);
                                    Object objP3 = fetVar.P();
                                    if (zG3 || objP3 == cl5Var) {
                                        objP3 = new bac0(function3, (byte) 13);
                                        fetVar.o0(objP3);
                                    }
                                    i4w0.e(vmc0Var, (Function0) objP3, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                final byte b4 = z ? (byte) 1 : (byte) 0;
                hcz.e(hczVar2, null, null, new ugd(-1847051752, true, new xdr() { // from class: a.nmc0
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        byte b5 = b4;
                        cl5 cl5Var = ukd.f35823a;
                        Function1 function3 = function2;
                        wmc0 wmc0Var2 = wmc0Var;
                        g9z g9zVar = (g9z) obj2;
                        fet fetVar = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (b5) {
                            case 0:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zmc0 zmc0Var = wmc0Var2.c;
                                    boolean zG = fetVar.g(function3);
                                    Object objP = fetVar.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new ru80(function3, (byte) 6);
                                        fetVar.o0(objP);
                                    }
                                    Function2 function4 = (Function2) objP;
                                    boolean zG2 = fetVar.g(function3);
                                    Object objP2 = fetVar.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new bac0(function3, (byte) 12);
                                        fetVar.o0(objP2);
                                    }
                                    i4w0.v(zmc0Var, function4, (Function0) objP2, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                            default:
                                g9zVar.getClass();
                                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    vmc0 vmc0Var = wmc0Var2.b;
                                    boolean zG3 = fetVar.g(function3);
                                    Object objP3 = fetVar.P();
                                    if (zG3 || objP3 == cl5Var) {
                                        objP3 = new bac0(function3, (byte) 13);
                                        fetVar.o0(objP3);
                                    }
                                    i4w0.e(vmc0Var, (Function0) objP3, fetVar, 0);
                                } else {
                                    fetVar.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                hcz.e(hczVar2, null, null, new ugd(-675843081, true, new p0z((Object) wmc0Var, (byte) 29)), 3);
                a4x a4xVar2 = wmc0Var.d.b;
                hczVar2.f(a4xVar2.size(), new zu90((byte) 19, new ljc0((byte) 5), a4xVar2), new d1c0(a4xVar2, (byte) 3), new ugd(802480018, true, new a100(a4xVar2, function2, (byte) 25)));
                return Unit.f46060a;
            case 7:
                qrc0 qrc0Var = (qrc0) this.b;
                vrc0 vrc0Var2 = (vrc0) this.c;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                rl70 rl70Var2 = qrc0Var.p;
                vrc0 vrc0VarG1 = vrc0Var2.g0("");
                rl70Var2.getClass();
                k0w0Var3.h(new PromoCodesScreenFactory$getPromoShopDetailScreen$1(vrc0VarG1));
                return Unit.f46060a;
            case 8:
                tsc0 tsc0Var = (tsc0) this.b;
                Function1 function3 = (Function1) this.c;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                if (tsc0Var.d) {
                    hcz.e(hczVar3, null, null, new ugd(22219952, true, new in80(tsc0Var, function3, (byte) 9)), 3);
                }
                a4x a4xVar3 = tsc0Var.f34455a;
                hczVar3.f(a4xVar3.size(), new zu90(b2, new ksc0(b3), a4xVar3), new d1c0(a4xVar3, (byte) 4), new ugd(2039820996, true, new h8w((List) a4xVar3, (Object) tsc0Var, function3, b)));
                return Unit.f46060a;
            case 9:
                dtc0 dtc0Var = (dtc0) this.b;
                ssc0 ssc0Var = (ssc0) this.c;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                rl70 rl70Var3 = dtc0Var.o;
                final long j = ssc0Var.f32719a;
                final String str4 = ssc0Var.b;
                rl70Var3.getClass();
                k0w0Var4.h(new FragmentScreen() { // from class: org.xplatform.promo.impl.promocodes.navigation.PromoCodesScreenFactory$getPromoCategoryScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        ppc0.R1.getClass();
                        ppc0 ppc0Var = new ppc0();
                        iiy[] iiyVarArr = ppc0.S1;
                        ppc0Var.P1.j(ppc0Var, iiyVarArr[1], j);
                        ppc0Var.Q1.x(ppc0Var, iiyVarArr[2], str4);
                        return ppc0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case 10:
                dtc0 dtc0Var2 = (dtc0) this.b;
                vrc0 vrc0Var3 = (vrc0) this.c;
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                rl70 rl70Var4 = dtc0Var2.o;
                vrc0 vrc0VarG2 = vrc0Var3.g0("codes_check");
                rl70Var4.getClass();
                k0w0Var5.h(new PromoCodesScreenFactory$getPromoShopDetailScreen$1(vrc0VarG2));
                return Unit.f46060a;
            case 11:
                Function1 function4 = (Function1) this.b;
                String str5 = (String) this.c;
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                x2k x2kVar = (x2k) cpVar2.u;
                dyb.c0(x2kVar.e, new o7x(function4, cpVar2, (byte) 7));
                x2kVar.c.setTitleMaxLines(2);
                cpVar2.t(new if6(cpVar2, str5, cpVar2, str5, (byte) 8));
                return Unit.f46060a;
            case 12:
                Function1 function5 = (Function1) this.b;
                qwc0 qwc0Var = (qwc0) this.c;
                wwc0 wwc0Var = (wwc0) obj;
                rl70 rl70Var5 = qwc0.Z1;
                wwc0Var.getClass();
                function5.invoke(wwc0Var);
                qwc0Var.J0().x(awc0.f1567a);
                return Unit.f46060a;
            case 13:
                Function1 function6 = (Function1) this.b;
                kxc0 kxc0Var = (kxc0) this.c;
                pxc0 pxc0Var = (pxc0) obj;
                jh70 jh70Var = kxc0.Y1;
                pxc0Var.getClass();
                function6.invoke(pxc0Var);
                kxc0Var.J0().x(mvc0.f22452a);
                return Unit.f46060a;
            case 14:
                qzd0 qzd0Var = (qzd0) this.b;
                g0e0 g0e0Var = (g0e0) this.c;
                long jLongValue = ((Long) obj).longValue();
                u0e0[] u0e0VarArr = u0e0.f34850a;
                if (jLongValue != 5 ? !(jLongValue != 6 || g0e0Var.h.isEmpty()) : !qzd0Var.e.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                Configuration configuration = (Configuration) this.b;
                Function1 function7 = (Function1) this.c;
                ox oxVar = (ox) obj;
                oxVar.getClass();
                function7.invoke(new wtd0(oxVar, sj3.X(configuration.screenWidthDp)));
                return Unit.f46060a;
            case 16:
                hxd0 hxd0Var = (hxd0) this.b;
                String str6 = (String) this.c;
                k0w0 k0w0Var6 = (k0w0) obj;
                qgh qghVar = hxd0Var.s;
                sip.f32274a.getClass();
                sip sipVar = sip.b;
                ArrayList arrayList = hxd0Var.G;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((t9m0) it.next()).f33572a));
                }
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(sipVar, dam0.b, 40L, 15L, str6, arrayList2, hxd0Var.M);
                qghVar.getClass();
                k0w0Var6.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                return Unit.f46060a;
            case 17:
                d1e0 d1e0Var = (d1e0) this.b;
                String str7 = (String) this.c;
                k0w0 k0w0Var7 = (k0w0) obj;
                qgh qghVar2 = d1e0Var.N;
                bek bekVar = sip.f32274a;
                RainbowGameScreenParams rainbowGameScreenParams = d1e0Var.r;
                boolean z3 = rainbowGameScreenParams.b;
                bekVar.getClass();
                sip sipVarF = bek.f(z3);
                long j2 = rainbowGameScreenParams.d;
                c0o c0oVar = ryd0.c;
                ArrayList arrayList3 = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it2 = c0oVar.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((ryd0) it2.next()).f31310a.f33572a));
                }
                vvd0 vvd0Var = ((qyd0) d1e0Var.D()).d;
                if (vvd0Var == null || (listC = azw.C(((qyd0) d1e0Var.D()).n, vvd0Var, d5c.C(((qyd0) d1e0Var.D()).c))) == null) {
                    listC = iun.f15405a;
                }
                StatisticBlocksParams statisticBlocksParams2 = new StatisticBlocksParams(sipVarF, dam0.f5756a, 40L, j2, str7, arrayList3, listC);
                qghVar2.getClass();
                k0w0Var7.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams2));
                return Unit.f46060a;
            case 18:
                Context context = (Context) this.b;
                k3t0 k3t0Var = (k3t0) this.c;
                s2e0 s2e0Var = (s2e0) obj;
                s2e0Var.getClass();
                try {
                    context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(s2e0Var.f31497a)));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                k3t0Var.x(h2e0.f12328a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                y5e0 y5e0Var = (y5e0) this.b;
                pz40 pz40Var = (pz40) this.c;
                ((TableViewImpl) obj).getClass();
                q5e0 q5e0Var = (q5e0) pz40Var.getValue();
                if (q5e0Var != null) {
                    b6e0 b6e0Var = y5e0Var.b;
                    q5e0Var.q(b6e0Var.f2050a, b6e0Var.b, b6e0Var.c, b6e0Var.d);
                }
                return Unit.f46060a;
            case 20:
                p8e0 p8e0Var = (p8e0) this.b;
                pz40 pz40Var2 = (pz40) this.c;
                ((TableViewImpl) obj).getClass();
                v8e0 v8e0Var = (v8e0) pz40Var2.getValue();
                if (v8e0Var != null) {
                    v8e0Var.q(p8e0Var.d, p8e0Var.c, p8e0Var.b, p8e0Var.f26549a);
                }
                return Unit.f46060a;
            case 21:
                l8d0 l8d0Var = (l8d0) this.b;
                l8e0 l8e0Var = (l8e0) this.c;
                zdm0 wdm0Var = (zdm0) obj;
                j9m0 j9m0VarC0 = ydx.c0((nc5) ((fee) l8d0Var.e.getValue()).c());
                if (wdm0Var == null) {
                    wdm0Var = new wdm0(l8e0Var.e);
                }
                return new g8e0(j9m0VarC0, wdm0Var);
            case 22:
                u9e0 u9e0Var = (u9e0) this.b;
                e3e0 e3e0Var = (e3e0) this.c;
                k0w0 k0w0Var8 = (k0w0) obj;
                k0w0Var8.getClass();
                uxs0 uxs0Var = u9e0Var.r;
                UfcWeightClassRatingParams ufcWeightClassRatingParams = new UfcWeightClassRatingParams(((o7e0) u9e0Var.D()).c, e3e0Var.f7130a);
                uxs0Var.getClass();
                k0w0Var8.h(new UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1(ufcWeightClassRatingParams));
                return Unit.f46060a;
            case 23:
                tld tldVar = (tld) this.b;
                iz40 iz40Var = (iz40) this.c;
                tldVar.C(obj);
                if (iz40Var != null) {
                    iz40Var.a(obj);
                }
                return Unit.f46060a;
            case 24:
                fge0 fge0Var = (fge0) this.b;
                Throwable th2 = (Throwable) this.c;
                Throwable th3 = (Throwable) obj;
                synchronized (fge0Var.c) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th3 != null) {
                        try {
                            if (th3 instanceof CancellationException) {
                                th3 = null;
                            }
                            if (th3 != null) {
                                tjo.a(th2, th3);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    fge0Var.e = th2;
                    p7m0 p7m0Var3 = fge0Var.u;
                    dge0 dge0Var = dge0.f6038a;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, dge0Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                v70 v70Var = (v70) this.b;
                ykg0 ykg0Var = (ykg0) this.c;
                ((View) obj).getClass();
                dke0 dke0Var = (dke0) v70Var.v;
                ysw yswVar = ykg0Var.c;
                String str8 = yswVar.b;
                if (str8.length() == 0) {
                    str8 = yswVar.f43189a;
                }
                dke0Var.invoke(str8, Boolean.valueOf(yswVar.b.length() > 0));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                tme0 tme0Var = (tme0) this.b;
                Function1 function8 = (Function1) this.c;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar4 = ((rme0) tme0Var).b;
                hczVar4.f(a4xVar4.size(), null, new ubn(a4xVar4, (byte) 22), new ugd(802480018, true, new ws1(a4xVar4, function8, (byte) 21)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                nq90 nq90Var = (nq90) this.b;
                dq00 dq00Var = (dq00) this.c;
                vzg0 vzg0Var = (vzg0) dq00Var.b;
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0Var = aye0Var.h;
                if (nq90Var instanceof eq90) {
                    eq90 eq90Var = (eq90) nq90Var;
                    q1f0 q1f0VarA = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, new CitizenshipStateModel(eq90Var.b, eq90Var.f8227a, false), null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -16897, 127);
                    Map mapD = dq00.d(aye0Var, kotlin.collections.a.c(u0f0.o));
                    vzg0Var.e("CITIZENSHIP", q1f0VarA.o);
                    return new Pair(q1f0VarA, mapD);
                }
                if (nq90Var instanceof fq90) {
                    fq90 fq90Var = (fq90) nq90Var;
                    q1f0 q1f0VarA2 = q1f0.a(q1f0Var, null, false, null, new CityStateModel(fq90Var.f9963a, fq90Var.c), false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -9, 127);
                    Map mapD2 = dq00.d(aye0Var, kotlin.collections.a.c(u0f0.f));
                    vzg0Var.e("CITY", q1f0VarA2.d);
                    return new Pair(q1f0VarA2, mapD2);
                }
                if (nq90Var instanceof gq90) {
                    gq90 gq90Var = (gq90) nq90Var;
                    CountryStateModel countryStateModel = new CountryStateModel(gq90Var.f11722a, gq90Var.d, gq90Var.c, gq90Var.e, gq90Var.h);
                    String str9 = gq90Var.f;
                    cm90 cm90Var = gq90Var.g;
                    return dq00Var.c(aye0Var, countryStateModel, str9, cm90Var.d, Integer.valueOf(cm90Var.c), q3d.j(u0f0.d, u0f0.h));
                }
                if (nq90Var instanceof hq90) {
                    hq90 hq90Var = (hq90) nq90Var;
                    q1f0 q1f0VarA3 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, new CurrencyStateModel(hq90Var.f13474a, hq90Var.c, hq90Var.d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -129, 127);
                    Map mapD3 = dq00.d(aye0Var, kotlin.collections.a.c(u0f0.i));
                    vzg0Var.e("CURRENCY", q1f0VarA3.h);
                    return new Pair(q1f0VarA3, mapD3);
                }
                if (nq90Var instanceof iq90) {
                    iq90 iq90Var = (iq90) nq90Var;
                    q1f0 q1f0VarA4 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, new DocumentStateModel(iq90Var.f15199a, iq90Var.b), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -513, 127);
                    Map mapD4 = dq00.d(aye0Var, kotlin.collections.a.c(u0f0.p));
                    vzg0Var.e("DOCUMENT_TYPE", q1f0VarA4.j);
                    return new Pair(q1f0VarA4, mapD4);
                }
                if (nq90Var instanceof kq90) {
                    kq90 kq90Var = (kq90) nq90Var;
                    CountryStateModel countryStateModel2 = new CountryStateModel(kq90Var.f18711a, kq90Var.e, kq90Var.d, kq90Var.f, kq90Var.i);
                    String str10 = kq90Var.g;
                    cm90 cm90Var2 = kq90Var.h;
                    return dq00Var.c(aye0Var, countryStateModel2, str10, cm90Var2.d, Integer.valueOf(cm90Var2.c), q3d.j(u0f0.h, u0f0.d));
                }
                if (!(nq90Var instanceof lq90)) {
                    return new Pair(q1f0Var, aye0Var.f);
                }
                lq90 lq90Var = (lq90) nq90Var;
                q1f0 q1f0VarA5 = q1f0.a(q1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RegionStateModel(lq90Var.f20476a, lq90Var.c), null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2097161, 127);
                Map mapD5 = dq00.d(aye0Var, kotlin.collections.a.c(u0f0.e));
                vzg0Var.e("REGION", q1f0VarA5.v);
                vzg0Var.e("CITY", null);
                return new Pair(q1f0VarA5, mapD5);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                SocialStateModel socialStateModel = (SocialStateModel) this.b;
                dq00 dq00Var2 = (dq00) this.c;
                aye0 aye0Var2 = (aye0) obj;
                aye0Var2.getClass();
                q1f0 q1f0VarA6 = q1f0.a(aye0Var2.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, socialStateModel, null, false, false, null, null, false, false, null, -1073741825, 127);
                List listC2 = kotlin.collections.a.c(u0f0.j);
                dq00Var2.getClass();
                Map mapD6 = dq00.d(aye0Var2, listC2);
                ((vzg0) dq00Var2.b).e("SOCIAL", q1f0VarA6.E);
                return new Pair(q1f0VarA6, mapD6);
            default:
                jkc jkcVar = (jkc) this.b;
                dq00 dq00Var3 = (dq00) this.c;
                aye0 aye0Var3 = (aye0) obj;
                aye0Var3.getClass();
                q1f0 q1f0VarA7 = q1f0.a(aye0Var3.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, new CitizenshipStateModel(jkcVar.b, jkcVar.f16661a, true), null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -16385, 127);
                List listC3 = kotlin.collections.a.c(u0f0.o);
                dq00Var3.getClass();
                Map mapD7 = dq00.d(aye0Var3, listC3);
                ((vzg0) dq00Var3.b).e("CITIZENSHIP", q1f0VarA7.o);
                return new Pair(q1f0VarA7, mapD7);
        }
    }
}
