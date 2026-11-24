package a;

import a.gyy;
import a.m1r;
import a.ufx;
import android.gov.nist.core.Separators;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzad;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.core.presentation.bonuses.views.GamesBonusButtonView1;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.feed.navigation.OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.ufc.api.last_fights.LastFightsParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g7p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10828a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7p(l0s l0sVar, nia niaVar) {
        this.f10828a = (byte) 20;
        this.b = niaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        wui0 wui0Var;
        Object value;
        Object value2;
        byte b = this.f10828a;
        byte b2 = 22;
        byte b3 = 16;
        byte b4 = 8;
        byte b5 = 5;
        boolean z = false;
        final byte b6 = 0;
        final byte b7 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qk1 qk1Var = (qk1) obj2;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                List list = (List) feeVar.c();
                Set set = (Set) ((fee) qk1Var.d.getValue()).c();
                if (list.isEmpty()) {
                    return lak0.c;
                }
                boolean z2 = list.size() > 1;
                ArrayList arrayList = new ArrayList();
                if (z2) {
                    String strA = qk1Var.b.b.a(R.string.select_all, Arrays.copyOf(new Object[0], 0));
                    Iterator it = list.iterator();
                    int iB = 0;
                    while (it.hasNext()) {
                        iB += ((s9p) it.next()).b();
                    }
                    l9p l9pVar = new l9p(strA, iB);
                    i = 0;
                    arrayList.add(new e7p(l9pVar, qk1.a(l9pVar, set.size() == list.size(), wui0.b), false));
                } else {
                    i = 0;
                }
                int i2 = i;
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    s9p s9pVar = (s9p) obj3;
                    boolean z3 = i2 == list.size() - 1 ? 1 : i;
                    boolean zContains = set.contains(s9pVar);
                    if (!z2 && list.size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (z3 != 0) {
                        wui0Var = wui0.d;
                    } else {
                        wui0Var = (z2 || i2 != 0) ? wui0.c : wui0.b;
                    }
                    arrayList.add(new e7p(s9pVar, qk1.a(s9pVar, zContains, wui0Var), z3));
                    i2 = i3;
                }
                return dyb.o0(arrayList);
            case 1:
                String str = (String) obj;
                sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
                str.getClass();
                org.xplatform.favorites.impl.presentation.category.f fVarH0 = ((org.xplatform.favorites.impl.presentation.category.e) obj2).H0();
                String str2 = org.xplatform.favorites.impl.presentation.category.e.X1;
                str2.getClass();
                e3c.n(fVarH0.t);
                fVarH0.t = sac.V(jiu0.a(fVarH0), vep.f37297a, null, fVarH0.m.f22085a, new ofl((diu0) fVarH0, (Serializable) str, (Object) str2, (yje) null, (byte) 26), 10);
                return Unit.f46060a;
            case 2:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(oct.f(((gfp) obj2).u, 0L, null, 0, t270.f33203a, null, 23));
                return Unit.f46060a;
            case 3:
                wgp wgpVar = (wgp) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                wgpVar.o.b(th, new f5o(wgpVar, (byte) 18));
                return Unit.f46060a;
            case 4:
                uid uidVar = (uid) obj;
                ddk ddkVar = svp.S1;
                uidVar.getClass();
                ((svp) obj2).G0().x(new dvp(uidVar));
                return Unit.f46060a;
            case 5:
                typ typVar = (typ) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                uxs0 uxs0Var = typVar.w;
                final LastFightsParams lastFightsParams = new LastFightsParams(typVar.o.f47169a);
                uxs0Var.getClass();
                k0w0Var2.h(new FragmentScreen() { // from class: org.xplatform.ufc.impl.navigation.UfcInternalScreensFactory$getUfcLastFightsScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        gyy.P1.getClass();
                        gyy gyyVar = new gyy();
                        gyyVar.O1.J(gyyVar, gyy.Q1[0], lastFightsParams);
                        return gyyVar;
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
            case 6:
                n9q n9qVar = (n9q) obj2;
                naq naqVar = (naq) obj;
                iiy[] iiyVarArr = n9q.S1;
                naqVar.getClass();
                if (naqVar instanceof daq) {
                    q9q q9qVar = new q9q();
                    androidx.fragment.app.e eVarC = n9qVar.C();
                    eVarC.getClass();
                    sj3.D0(q9qVar, eVarC);
                } else if (naqVar.equals(kaq.f17976a)) {
                    if (n9qVar.M1 == null) {
                        Intrinsics.h("quickBetDialogProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC2 = n9qVar.C();
                    eVarC2.getClass();
                    xi70.h(eVarC2);
                } else if (naqVar.equals(jaq.f16203a)) {
                    wdk0 wdk0Var = n9qVar.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH = n9qVar.H(R.string.one_click_bet_disabled_message);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), n9qVar, null, null, false, null, 1020);
                } else if (naqVar.equals(eaq.f7480a)) {
                    ii iiVar = n9qVar.Q1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH2 = n9qVar.H(R.string.attention);
                    String strH3 = n9qVar.H(R.string.unacceptable_account_for_section);
                    String strH4 = n9qVar.H(R.string.ok);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC3 = n9qVar.C();
                    eVarC3.getClass();
                    iiVar.d(dialogFields, eVarC3);
                } else if (naqVar instanceof haq) {
                    haq haqVar = (haq) naqVar;
                    String str3 = haqVar.f12736a;
                    long j = haqVar.b;
                    String str4 = haqVar.c;
                    double d = haqVar.d;
                    String str5 = haqVar.e;
                    String str6 = haqVar.f;
                    String str7 = haqVar.g;
                    boolean z4 = haqVar.h;
                    lgn0 lgn0Var = n9qVar.P1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH5 = n9qVar.H(R.string.bet_processed_successfully);
                    strH5.getClass();
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH5, null, null, null);
                    String strH6 = n9qVar.H(R.string.finance_bet);
                    lc00 lc00VarB = kotlin.collections.a.b();
                    String strH7 = n9qVar.H(R.string.coefficient);
                    strH7.getClass();
                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH7, str5));
                    String strH8 = n9qVar.H(R.string.bet_sum);
                    strH8.getClass();
                    pn40 pn40Var = pn40.f27267a;
                    lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, n9qVar.o0()), strH8, pn40.c(d, p3u0.c), str4, true));
                    if (!z4) {
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, n9qVar.o0()), StringsKt.v0(kotlin.text.c.r(str7, Separators.COLON, "", false)).toString(), StringsKt.v0(kotlin.text.c.r(str6, str4, "", false)).toString(), str4, false));
                    }
                    lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH6, str3, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j), "SIMPLE", kotlin.collections.a.a(lc00VarB)), n9qVar);
                } else if (naqVar instanceof faq) {
                    FinBetInfoModel finBetInfoModel = ((faq) naqVar).f9222a;
                    d720 d720Var = n9qVar.O1;
                    if (d720Var == null) {
                        Intrinsics.h("makeBetBottomSheetProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC4 = n9qVar.C();
                    eVarC4.getClass();
                    d720Var.a(eVarC4, finBetInfoModel);
                } else if (naqVar instanceof gaq) {
                    String str8 = ((gaq) naqVar).f10981a;
                    ii iiVar2 = n9qVar.Q1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH9 = n9qVar.H(R.string.error);
                    String strH10 = n9qVar.H(R.string.yes);
                    strH10.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH9, (CharSequence) str8, (CharSequence) strH10, n9qVar.H(R.string.no), (String) null, "BET_ALREADY_DONE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC5 = n9qVar.C();
                    eVarC5.getClass();
                    iiVar2.d(dialogFields2, eVarC5);
                } else if (naqVar instanceof iaq) {
                    String str9 = ((iaq) naqVar).f14451a;
                    ii iiVar3 = n9qVar.Q1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH11 = n9qVar.H(R.string.error);
                    String strH12 = n9qVar.H(R.string.replenish);
                    strH12.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH11, (CharSequence) str9, (CharSequence) strH12, n9qVar.H(R.string.cancel), (String) null, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC6 = n9qVar.C();
                    eVarC6.getClass();
                    iiVar3.d(dialogFields3, eVarC6);
                } else if (naqVar instanceof caq) {
                    d720 d720Var2 = n9qVar.O1;
                    if (d720Var2 == null) {
                        Intrinsics.h("makeBetBottomSheetProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC7 = n9qVar.C();
                    eVarC7.getClass();
                    Fragment fragmentJ = eVarC7.J(d720Var2.d);
                    sik sikVar = fragmentJ instanceof sik ? (sik) fragmentJ : null;
                    if (sikVar != null) {
                        sikVar.x0();
                    }
                } else if (naqVar instanceof maq) {
                    wdk0 wdk0Var2 = n9qVar.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, ((maq) naqVar).f21470a, null, null, null, null, 124), n9qVar, null, null, false, null, 1020);
                } else {
                    if (!(naqVar instanceof laq)) {
                        t9f.b();
                        return null;
                    }
                    laq laqVar = (laq) naqVar;
                    String str10 = laqVar.f19717a;
                    long j2 = laqVar.b;
                    String str11 = laqVar.c;
                    lgn0 lgn0Var2 = n9qVar.P1;
                    if (lgn0Var2 == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH13 = n9qVar.H(R.string.bet_processed_successfully);
                    strH13.getClass();
                    SuccessBetStringModel successBetStringModel2 = new SuccessBetStringModel(strH13, null, null, null);
                    String strQ = w6x.q(n9qVar.H(R.string.promo), ": ", n9qVar.H(R.string.finance_bet));
                    String strH14 = n9qVar.H(R.string.coefficient);
                    strH14.getClass();
                    lgn0Var2.c(successBetStringModel2, new SuccessBetAlertModel(strQ, str10, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(j2), "PROMO", kotlin.collections.a.c(new SuccessBetInfoItem.Simple(strH14, str11))), n9qVar);
                }
                n9qVar.G0().x(t8q.f33523a);
                return Unit.f46060a;
            case 7:
                hgq hgqVar = (hgq) obj2;
                AuthResult authResult = (AuthResult) obj;
                nek nekVar = hgq.g2;
                authResult.getClass();
                zzad zzadVar = ((com.google.firebase.auth.internal.zzx) authResult).f45658a;
                if (zzadVar != null) {
                    FirebaseAuth.getInstance(nfq.e(zzadVar.c)).d(zzadVar, false).addOnSuccessListener(new z9f(new f8m(hgqVar, authResult, zzadVar, b2), (byte) 29));
                }
                return Unit.f46060a;
            case 8:
                soe soeVar = (soe) obj;
                soeVar.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", soeVar);
                return new gji0(((kji0) obj2).f18387a.a(null), null, null);
            case 9:
                xz40 xz40Var = (xz40) obj2;
                Object[] objArr = xz40Var.f41739a;
                int i4 = xz40Var.c;
                while (b6 < i4) {
                    ((uj30) objArr[b6]).b();
                    b6++;
                }
                return Unit.f46060a;
            case 10:
                y0t0 y0t0Var = (y0t0) obj;
                return ((orq) obj2).a(new y0t0(null, y0t0Var.b, y0t0Var.c, y0t0Var.d, y0t0Var.e)).getValue();
            case 11:
                ivq ivqVar = (ivq) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ivqVar.r.b(th2, new f5o(ivqVar, (byte) 27));
                return Unit.f46060a;
            case 12:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                List list2 = ((tar) obj2).f33627a.f31897a;
                hczVar.f(list2.size(), null, new far(list2, (byte) 0), new ugd(802480018, true, new xy1(list2, b3)));
                return Unit.f46060a;
            case 13:
                iiy[] iiyVarArr2 = ljr.Q1;
                ((View) obj).getClass();
                vkr vkrVarH0 = ((ljr) obj2).H0();
                p7m0 p7m0Var = vkrVarH0.g;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.TRUE));
                sac.V(jiu0.a(vkrVarH0), new g7p(vkrVarH0, b3), new yip(vkrVarH0, b2), null, new cbq((Object) vkrVarH0, (yje) (z ? 1 : 0), b4), 12);
                return Unit.f46060a;
            case 14:
                hkr hkrVar = (hkr) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                duj dujVar = hkrVar.t;
                Throwable cause = th3.getCause();
                if (cause != null) {
                    th3 = cause;
                }
                dujVar.b(th3, new jar(hkrVar, (byte) 4));
                return Unit.f46060a;
            case 15:
                final brk brkVar = (brk) obj2;
                final cp cpVar = (cp) obj;
                cpVar.getClass();
                qux quxVar = (qux) cpVar.u;
                dyb.O(quxVar.c, new Function1() { // from class: a.qkr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b8 = b6;
                        cp cpVar2 = cpVar;
                        brk brkVar2 = brkVar;
                        View view = (View) obj4;
                        switch (b8) {
                            case 0:
                                view.getClass();
                                brkVar2.invoke(cpVar2.u(), ejr.c);
                                break;
                            default:
                                view.getClass();
                                brkVar2.invoke(cpVar2.u(), ejr.b);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                dyb.O(quxVar.b, new Function1() { // from class: a.qkr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b8 = b7;
                        cp cpVar2 = cpVar;
                        brk brkVar2 = brkVar;
                        View view = (View) obj4;
                        switch (b8) {
                            case 0:
                                view.getClass();
                                brkVar2.invoke(cpVar2.u(), ejr.c);
                                break;
                            default:
                                view.getClass();
                                brkVar2.invoke(cpVar2.u(), ejr.b);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                cpVar.t(new k2l(cpVar, cpVar, b4));
                return Unit.f46060a;
            case 16:
                vkr vkrVar = (vkr) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                vkrVar.f.b(th4, new jar(vkrVar, b5));
                return Unit.f46060a;
            case 17:
                ypr yprVar = (ypr) obj2;
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.b(String.valueOf(yprVar.f43044a));
                long j3 = yprVar.b;
                if (j3 == 40) {
                    j3 = yprVar.c;
                }
                n1gVar.c = j3;
                n1gVar.b = yprVar.d;
                n1gVar.e = new lq2();
                n1gVar.d = j3 == 40 ? j1g.REAL : j1g.SYNTHETIC;
                n1gVar.f = l1g.OPEN_SCREEN;
                k1g k1gVar = yprVar.e;
                k1gVar.getClass();
                n1gVar.g = k1gVar;
                return Unit.f46060a;
            case 18:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((mi70) ((ali) obj2).c).getClass();
                k0w0Var3.m(new BindPhoneNumberScreen(k38.f17605a));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wbs0 wbs0Var = (wbs0) obj2;
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                wbs0Var.getClass();
                abi0Var.b(fur.f10178a, wbs0Var);
                return Unit.f46060a;
            case 20:
                nia niaVar = (nia) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                long j4 = niaVar.f23574a;
                long j5 = niaVar.d;
                long j6 = niaVar.e;
                long j7 = niaVar.c;
                String string = niaVar.f.toString();
                boolean z5 = niaVar.g;
                string.getClass();
                c8d c8dVar = (c8d) k0w0Var4.h(new OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1(j4, j7, j5, j6, string, z5)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 21:
                py20 py20Var = (py20) obj;
                nek nekVar2 = i7s.a2;
                py20Var.getClass();
                ((i7s) obj2).I0().x(new o6s(py20Var));
                return Unit.f46060a;
            case 22:
                uhs uhsVar = (uhs) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                uhsVar.x.b(th5, new jar(uhsVar, (byte) 15));
                return Unit.f46060a;
            case 23:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                i4 i4Var = ((pls) obj2).c;
                hczVar2.f(i4Var.size(), null, new far(i4Var, (byte) 5), new ugd(802480018, true, new xy1(i4Var, (byte) 17)));
                return Unit.f46060a;
            case 24:
                ((g3j) obj2).g(new wa30(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ui9 ui9Var = (ui9) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                int i5 = ui9Var.c;
                int i6 = ui9Var.d;
                String strValueOf = String.valueOf(i5);
                int i7 = ui9Var.c;
                Integer num = ui9Var.e;
                pzw.E(bnk0Var, strValueOf, 0, (i7 <= (num != null ? num.intValue() : 0) || num == null) ? R.color.static_white : R.color.static_green, 0, 0, 54);
                pzw.E(bnk0Var, " : ", 0, R.color.static_white, 0, 0, 54);
                String strValueOf2 = String.valueOf(i6);
                Integer num2 = ui9Var.f;
                pzw.E(bnk0Var, strValueOf2, 0, (i6 <= (num2 != null ? num2.intValue() : 0) || num2 == null) ? R.color.static_white : R.color.static_green, 0, 0, 54);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                c8d c8dVar2 = (c8d) k0w0Var5.b(new a1w0(new jcs((f3j) obj2, (byte) 6))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                p7m0 p7m0Var2 = ((yys) obj2).B;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, ixs.a((ixs) value2, 0L, null, false, false, false, false, null, false, false, th6, false, null, false, false, 518143)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                c0t c0tVar = (c0t) obj2;
                xus xusVar = (xus) obj;
                xusVar.getClass();
                p7m0 p7m0Var3 = c0tVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    c0tVar.f.getClass();
                    c0t c0tVar2 = c0tVar;
                    if (p7m0Var3.m(value3, wrs.a((wrs) value3, null, null, null, null, xusVar, null, null, null, null, null, null, false, false, false, null, false, 0L, 0L, 67108831))) {
                        return Unit.f46060a;
                    }
                    c0tVar = c0tVar2;
                }
                break;
            default:
                GamesBonusButtonView1 gamesBonusButtonView1 = (GamesBonusButtonView1) obj2;
                int i8 = GamesBonusButtonView1.g;
                ((View) obj).getClass();
                boolean z6 = !gamesBonusButtonView1.f;
                gamesBonusButtonView1.f = z6;
                gamesBonusButtonView1.e.invoke(Boolean.valueOf(z6), gamesBonusButtonView1.d);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g7p(Object obj, byte b) {
        this.f10828a = b;
        this.b = obj;
    }
}
