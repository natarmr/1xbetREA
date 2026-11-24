package a;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ur6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur6(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f36149a = b;
    }

    private final Object Q(Object obj) {
        mc7 mc7Var = (mc7) obj;
        mc7Var.getClass();
        wa7 wa7Var = (wa7) this.receiver;
        kj5 kj5Var = wa7.U1;
        wa7Var.getClass();
        if (mc7Var instanceof jc7) {
            gl5 gl5Var = tj7.t2;
            androidx.fragment.app.e eVarC = wa7Var.C();
            eVarC.getClass();
            jc7 jc7Var = (jc7) mc7Var;
            gl5.o(gl5Var, eVarC, jc7Var.f16261a, jc7Var.b, jc7Var.c, 104);
        } else if (mc7Var instanceof kc7) {
            wdk0 wdk0Var = wa7Var.O1;
            if (wdk0Var == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            wdk0.k(wdk0Var, ((kc7) mc7Var).f18045a, wa7Var, null, null, false, null, 1020);
        } else if (mc7Var instanceof lc7) {
            vcc.f0(i120.V(new Pair("BUNDLE_BET_ID", ((lc7) mc7Var).f19786a)), wa7Var, "REQUEST_BET_UPDATE_BY_ID");
        } else if (mc7Var.equals(ec7.f7550a)) {
            ii iiVarG0 = wa7Var.G0();
            String strH = wa7Var.H(R.string.error);
            String strH2 = wa7Var.H(R.string.request_error);
            String strH3 = wa7Var.H(R.string.ok_new);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
            androidx.fragment.app.e eVarC2 = wa7Var.C();
            eVarC2.getClass();
            iiVarG0.d(dialogFields, eVarC2);
        } else if (mc7Var.equals(fc7.f9296a)) {
            ii iiVarG1 = wa7Var.G0();
            String strH4 = wa7Var.H(R.string.coupon_has_items);
            String strH5 = wa7Var.H(R.string.duplicate_coupon_not_empty_error);
            String strH6 = wa7Var.H(R.string.ok_new);
            strH6.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, wa7Var.H(R.string.cancel), (String) null, "REQUEST_COUPON_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC3 = wa7Var.C();
            eVarC3.getClass();
            iiVarG1.d(dialogFields2, eVarC3);
        } else if (mc7Var.equals(dc7.f5837a)) {
            ii iiVarG2 = wa7Var.G0();
            String strH7 = wa7Var.H(R.string.attention);
            String strH8 = wa7Var.H(R.string.self_exclusion_changes_prohibited);
            String strH9 = wa7Var.H(R.string.ok_new);
            strH9.getClass();
            DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
            androidx.fragment.app.e eVarC4 = wa7Var.C();
            eVarC4.getClass();
            iiVarG2.d(dialogFields3, eVarC4);
        } else if (mc7Var.equals(bc7.f2340a)) {
            ii iiVarG3 = wa7Var.G0();
            String strH10 = wa7Var.H(R.string.confirmation);
            String strH11 = wa7Var.H(R.string.system_push_notification_setting);
            String strH12 = wa7Var.H(R.string.open_settings);
            strH12.getClass();
            DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, wa7Var.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC5 = wa7Var.C();
            eVarC5.getClass();
            iiVarG3.d(dialogFields4, eVarC5);
        } else if (mc7Var instanceof gc7) {
            ii iiVarG4 = wa7Var.G0();
            String strH13 = wa7Var.H(R.string.confirmation);
            String strH14 = wa7Var.H(R.string.push_tracking_alert_message);
            String strH15 = wa7Var.H(R.string.activate);
            strH15.getClass();
            DialogFields dialogFields5 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, wa7Var.H(R.string.cancel), (String) null, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC6 = wa7Var.C();
            eVarC6.getClass();
            iiVarG4.d(dialogFields5, eVarC6);
        } else if (mc7Var instanceof ic7) {
            tqt tqtVar = c4w.n2;
            androidx.fragment.app.e eVarC7 = wa7Var.C();
            eVarC7.getClass();
            ArrayList arrayList = ((ic7) mc7Var).f14522a;
            String strH0 = wa7Var.H0();
            tqtVar.getClass();
            tqt.i(eVarC7, arrayList, strH0, "REQUEST_MENU_ITEM_KEY");
        } else if (mc7Var instanceof yb7) {
            wdk0 wdk0Var2 = wa7Var.O1;
            if (wdk0Var2 == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            String strH1 = wa7Var.H0();
            String str = ((yb7) mc7Var).f42327a;
            String strH16 = wa7Var.H(R.string.copy_history_bet_number_copy);
            strH16.getClass();
            j120.M(wa7Var, wdk0Var2, "Bet Number", strH1, strH16, str, Integer.valueOf(R.drawable.data_copy_icon), null, 64);
            wa7Var = wa7Var;
        } else if (mc7Var.equals(zb7.f44100a)) {
            ii iiVarG5 = wa7Var.G0();
            String strH17 = wa7Var.H(R.string.attention);
            String strH18 = wa7Var.H(R.string.order_already_auto_bet_exist_message);
            String strH19 = wa7Var.H(R.string.ok);
            strH19.getClass();
            DialogFields dialogFields6 = new DialogFields((CharSequence) strH17, (CharSequence) strH18, (CharSequence) strH19, wa7Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC8 = wa7Var.C();
            eVarC8.getClass();
            iiVarG5.d(dialogFields6, eVarC8);
        } else if (mc7Var instanceof cc7) {
            byte[] bArr = ((cc7) mc7Var).f4095a;
            kxq kxqVarB = wa7Var.B();
            if (kxqVarB != null && !kxqVarB.isFinishing()) {
                try {
                    Object systemService = kxqVarB.getSystemService("print");
                    PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                    if (printManager != null) {
                        String strH20 = wa7Var.H0();
                        int i = qb90.e;
                        printManager.print(strH20, xvw.D(wa7Var.o0(), wa7Var.H0(), bArr), new PrintAttributes.Builder().build());
                    }
                } catch (ActivityNotFoundException unused) {
                    wdk0 wdk0Var3 = wa7Var.O1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String string = kxqVarB.getString(R.string.error_not_installed_v2, "PDFReader");
                    string.getClass();
                    wdk0.k(wdk0Var3, new xdk0(rek0Var, string, null, null, null, null, 124), wa7Var, null, null, false, null, 1020);
                }
            }
        } else if (mc7Var.equals(xb7.f40587a)) {
            ii iiVarG6 = wa7Var.G0();
            String strH21 = wa7Var.H(R.string.support_cancel_request);
            String strH22 = wa7Var.H(R.string.auto_bet_cancel);
            String strH23 = wa7Var.H(R.string.ok);
            strH23.getClass();
            DialogFields dialogFields7 = new DialogFields((CharSequence) strH21, (CharSequence) strH22, (CharSequence) strH23, wa7Var.H(R.string.cancel), (String) null, "REQUEST_AUTO_BET_CANCEL_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC9 = wa7Var.C();
            eVarC9.getClass();
            iiVarG6.d(dialogFields7, eVarC9);
        } else if (mc7Var instanceof hc7) {
            ii iiVarG7 = wa7Var.G0();
            hc7 hc7Var = (hc7) mc7Var;
            String str2 = hc7Var.f12806a;
            String str3 = hc7Var.b;
            String strH24 = wa7Var.H(R.string.ok);
            strH24.getClass();
            DialogFields dialogFields8 = new DialogFields((CharSequence) str2, (CharSequence) str3, (CharSequence) strH24, wa7Var.H(R.string.cancel), (String) null, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC10 = wa7Var.C();
            eVarC10.getClass();
            iiVarG7.d(dialogFields8, eVarC10);
        } else {
            if (!(mc7Var instanceof ac7)) {
                t9f.b();
                return null;
            }
            wdk0 wdk0Var4 = wa7Var.O1;
            if (wdk0Var4 == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            qek0 qek0Var = qek0.f28589a;
            String strH25 = wa7Var.H(R.string.selected_bid_was_successfully_hidden);
            strH25.getClass();
            wdk0.k(wdk0Var4, new xdk0(qek0Var, strH25, ((ac7) mc7Var).f615a, null, null, Integer.valueOf(R.drawable.ic_snack_hide), 88), wa7Var, null, null, false, null, 1020);
            wa7Var.n0().r().t0(i120.V(new Pair("BET_INFO_FRAGMENT_REQUEST_KEY", wa7Var.H0())), "BET_INFO_FRAGMENT_REQUEST_KEY");
            wa7Var.I0().x(q97.f28334a);
        }
        wa7Var.I0().x(w97.f38765a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x0af2  */
    /* JADX WARN: Code duplicated, block: B:242:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:245:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0b32  */
    /* JADX WARN: Code duplicated, block: B:250:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:254:0x0b9e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0ba3  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        String strH;
        String str;
        String strH2;
        lgn0 lgn0Var;
        lc00 lc00VarB;
        Object value;
        StepInputConfigModel stepInputConfigModel;
        Double dI;
        Object value2;
        Object value3;
        ArrayList arrayList;
        byte b = this.f36149a;
        nb20 nb20Var = nb20.f23220a;
        final byte b2 = 3;
        final byte b3 = 2;
        final byte b4 = 1;
        final byte b5 = 0;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((wr6) this.receiver).E.b(th, new yr0(th, (byte) 7));
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                wr6 wr6Var = (wr6) this.receiver;
                wr6Var.E.b(th2, new fa2((Object) wr6Var, (byte) 26));
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                as6 as6Var = (as6) this.receiver;
                as6Var.s.b(th3, new xr6(as6Var, (byte) 0));
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                as6 as6Var2 = (as6) this.receiver;
                as6Var2.s.b(th4, new xr6(as6Var2, (byte) 0));
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                as6 as6Var3 = (as6) this.receiver;
                as6Var3.s.b(th5, new xr6(as6Var3, (byte) 0));
                return Unit.f46060a;
            case 5:
                ad20 ad20Var = (ad20) obj;
                ad20Var.getClass();
                is6 is6Var = (is6) this.receiver;
                int i = is6.r2;
                is6Var.getClass();
                if (ad20Var.equals(nb20Var)) {
                    gnm0.i(is6Var.C());
                } else if (ad20Var.equals(gc20.f11039a)) {
                    gnm0.s(is6Var.C());
                } else if (ad20Var instanceof jc20) {
                    jc20 jc20Var = (jc20) ad20Var;
                    hg7 hg7Var = jc20Var.j;
                    int iOrdinal = hg7Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            str = null;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return null;
                            }
                            strH = is6Var.H(R.string.autobet_sum);
                        }
                        if (hg7Var == hg7.b) {
                            strH2 = w6x.q(is6Var.H(R.string.promo), ": ", is6Var.H(R.string.alternative_sport));
                        } else {
                            strH2 = is6Var.H(R.string.alternative_sport);
                            strH2.getClass();
                        }
                        lgn0Var = is6Var.m2;
                        if (lgn0Var != null) {
                            Intrinsics.h("successBetAlertManager");
                            throw null;
                        }
                        SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(jc20Var.h, null, null, null);
                        String str2 = jc20Var.e;
                        lc00VarB = kotlin.collections.a.b();
                        String strH3 = is6Var.H(R.string.coefficient);
                        strH3.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.Simple(strH3, jc20Var.b));
                        if (str != null) {
                            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, is6Var.o0()), str, jc20Var.f16256a, jc20Var.d, true));
                        }
                        if (!jc20Var.g) {
                            String strH4 = is6Var.H(R.string.bet_possible_win);
                            strH4.getClass();
                            lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, is6Var.o0()), strH4, jc20Var.i, jc20Var.d, false));
                        }
                        lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH2, str2, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(jc20Var.c), hg7Var.name(), kotlin.collections.a.a(lc00VarB)), is6Var.p0());
                        if (!is6Var.R()) {
                            is6Var.y0();
                        }
                    } else {
                        strH = is6Var.H(R.string.bet_sum);
                    }
                    str = strH;
                    if (hg7Var == hg7.b) {
                        strH2 = w6x.q(is6Var.H(R.string.promo), ": ", is6Var.H(R.string.alternative_sport));
                    } else {
                        strH2 = is6Var.H(R.string.alternative_sport);
                        strH2.getClass();
                    }
                    lgn0Var = is6Var.m2;
                    if (lgn0Var != null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    SuccessBetStringModel successBetStringModel2 = new SuccessBetStringModel(jc20Var.h, null, null, null);
                    String str3 = jc20Var.e;
                    lc00VarB = kotlin.collections.a.b();
                    String strH5 = is6Var.H(R.string.coefficient);
                    strH5.getClass();
                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH5, jc20Var.b));
                    if (str != null) {
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, is6Var.o0()), str, jc20Var.f16256a, jc20Var.d, true));
                    }
                    if (!jc20Var.g) {
                        String strH6 = is6Var.H(R.string.bet_possible_win);
                        strH6.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, is6Var.o0()), strH6, jc20Var.i, jc20Var.d, false));
                    }
                    lgn0Var.c(successBetStringModel2, new SuccessBetAlertModel(strH2, str3, "REQUEST_SUCCESS_BET_KEY", Long.valueOf(jc20Var.c), hg7Var.name(), kotlin.collections.a.a(lc00VarB)), is6Var.p0());
                    if (!is6Var.R()) {
                        is6Var.y0();
                    }
                } else if (ad20Var instanceof rc20) {
                    xdk0 xdk0Var = ((rc20) ad20Var).f30219a;
                    Dialog dialog = is6Var.S1;
                    ViewGroup viewGroup = (dialog == null || (window = dialog.getWindow()) == null) ? null : (ViewGroup) window.findViewById(android.R.id.content);
                    wdk0 wdk0Var = is6Var.o2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, xdk0Var, is6Var, null, viewGroup, false, null, 1012);
                } else if (ad20Var.equals(yb20.f42322a)) {
                    ynb ynbVar = is6Var.n2;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.k;
                    androidx.fragment.app.e eVarC = is6Var.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                } else if (ad20Var instanceof dc20) {
                    String str4 = ((dc20) ad20Var).f5831a;
                    String strH7 = is6Var.H(R.string.top_up);
                    strH7.getClass();
                    is6Var.Q0(str4, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", strH7);
                } else if (ad20Var instanceof ub20) {
                    String str5 = ((ub20) ad20Var).f35359a;
                    String strH8 = is6Var.H(R.string.ok);
                    strH8.getClass();
                    is6Var.Q0(str5, "REQUEST_BET_EXISTS_DIALOG_KEY", strH8);
                } else if (ad20Var.equals(kb20.f17992a)) {
                    j120.Y(is6Var);
                    View view = is6Var.l1;
                    if (view != null) {
                        view.clearFocus();
                    }
                } else {
                    if (!ad20Var.equals(db20.f5781a)) {
                        t9f.b();
                        return null;
                    }
                    View view2 = is6Var.l1;
                    if (view2 != null) {
                        view2.clearFocus();
                    }
                }
                is6Var.P0().x(k320.f17598a);
                return Unit.f46060a;
            case 6:
                l520 l520Var = (l520) obj;
                l520Var.getClass();
                ((k3t0) this.receiver).x(l520Var);
                return Unit.f46060a;
            case 7:
                l520 l520Var2 = (l520) obj;
                l520Var2.getClass();
                ((k3t0) this.receiver).x(l520Var2);
                return Unit.f46060a;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                dt6 dt6Var = (dt6) this.receiver;
                dt6Var.U.b(th6, new ls6(dt6Var, (byte) 2));
                dt6Var.G(nb20Var);
                return Unit.f46060a;
            case 9:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                dt6 dt6Var2 = (dt6) this.receiver;
                dt6Var2.U.b(th7, new ls6(dt6Var2, (byte) 4));
                return Unit.f46060a;
            case 10:
                String str6 = (String) obj;
                str6.getClass();
                rg20 rg20Var = (rg20) this.receiver;
                rg20Var.getClass();
                p7m0 p7m0Var = rg20Var.O;
                do {
                    value = p7m0Var.getValue();
                    stepInputConfigModel = (StepInputConfigModel) value;
                    dI = kotlin.text.b.i(str6);
                } while (!p7m0Var.m(value, StepInputConfigModel.a(stepInputConfigModel, dI != null ? dI.doubleValue() : -1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0L, null, false, false, false, 4094)));
                return Unit.f46060a;
            case 11:
                g6s g6sVar = (g6s) obj;
                g6sVar.getClass();
                b07 b07Var = (b07) this.receiver;
                b07Var.getClass();
                int i2 = g6sVar.f10783a;
                b07Var.t = i2;
                b07Var.A();
                pn40 pn40Var = pn40.f27267a;
                b07Var.z(new nz6(pn40.d(((double) i2) * b07Var.s, b07Var.r, p3u0.c)));
                return Unit.f46060a;
            case 12:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((b07) this.receiver).x(th8);
                return Unit.f46060a;
            case 13:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((b07) this.receiver).x(th9);
                return Unit.f46060a;
            case 14:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((b07) this.receiver).x(th10);
                return Unit.f46060a;
            case 15:
                h77 h77Var = (h77) obj;
                h77Var.getClass();
                final q47 q47Var = (q47) this.receiver;
                gl5 gl5Var = q47.U1;
                Integer numValueOf = Integer.valueOf(R.drawable.ic_snack_hide);
                qek0 qek0Var = qek0.f28589a;
                rek0 rek0Var = rek0.b;
                if (h77Var instanceof n67) {
                    ynb ynbVar2 = q47Var.M1;
                    if (ynbVar2 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var2 = bm5.c;
                    androidx.fragment.app.e eVarC2 = q47Var.C();
                    eVarC2.getClass();
                    ynb.b(ynbVar2, bm5Var2, null, eVarC2, ((n67) h77Var).f22982a, "REQUEST_CHANGE_BALANCE_DIALOG_KEY", 462);
                } else if (h77Var instanceof g77) {
                    wdk0.k(q47Var.H0(), new xdk0(rek0Var, ((g77) h77Var).f10802a, null, null, null, null, 124), q47Var, null, null, false, null, 1020);
                } else {
                    q47Var.getClass();
                    if (h77Var instanceof o67) {
                        bst bstVar = r7w.q2;
                        androidx.fragment.app.e eVarC3 = q47Var.C();
                        eVarC3.getClass();
                        o67 o67Var = (o67) h77Var;
                        ql5 ql5Var = o67Var.f24719a;
                        f8w f8wVar = o67Var.b;
                        HistoryTypeModel historyTypeModel = o67Var.c;
                        bstVar.getClass();
                        ql5Var.getClass();
                        if (eVarC3.J("HISTORY_TYPE_DIALOG_TAG") == null) {
                            r7w r7wVar = new r7w();
                            iiy[] iiyVarArr = r7w.r2;
                            r7wVar.l2.u(r7wVar, iiyVarArr[0], ql5Var);
                            r7wVar.m2.u(r7wVar, iiyVarArr[1], f8wVar);
                            r7wVar.n2.u(r7wVar, iiyVarArr[2], historyTypeModel);
                            r7wVar.o2.x(r7wVar, iiyVarArr[3], "REQUEST_BET_HISTORY_TYPE_KEY");
                            r7wVar.H0(eVarC3, "HISTORY_TYPE_DIALOG_TAG");
                        }
                    } else if (h77Var instanceof m67) {
                        kl5 kl5Var = jv7.l2;
                        androidx.fragment.app.e eVarC4 = q47Var.C();
                        eVarC4.getClass();
                        BetsSummaryInfoUiModel betsSummaryInfoUiModel = ((m67) h77Var).f21254a;
                        kl5Var.getClass();
                        if (eVarC4.J("HISTORY_BET_SUMMARY_INFO_DIALOG_TAG") == null) {
                            jv7 jv7Var = new jv7();
                            jv7Var.k2.J(jv7Var, jv7.m2[0], betsSummaryInfoUiModel);
                            jv7Var.H0(eVarC4, "HISTORY_BET_SUMMARY_INFO_DIALOG_TAG");
                        }
                    } else if (h77Var instanceof u67) {
                        sqt sqtVar = vzv.p2;
                        androidx.fragment.app.e eVarC5 = q47Var.C();
                        eVarC5.getClass();
                        u67 u67Var = (u67) h77Var;
                        f8w f8wVar2 = u67Var.f35124a;
                        HistoryTypeModel historyTypeModel2 = u67Var.b;
                        sqtVar.getClass();
                        if (eVarC5.J("HISTORY_COUPON_STATUS_DIALOG_TAG") == null) {
                            vzv vzvVar = new vzv();
                            iiy[] iiyVarArr2 = vzv.q2;
                            vzvVar.m2.u(vzvVar, iiyVarArr2[0], f8wVar2);
                            vzvVar.n2.u(vzvVar, iiyVarArr2[1], historyTypeModel2);
                            vzvVar.o2.x(vzvVar, iiyVarArr2[2], "REQUEST_BET_HISTORY_STATUS_FILTER_KEY");
                            vzvVar.H0(eVarC5, "HISTORY_COUPON_STATUS_DIALOG_TAG");
                        }
                    } else if (h77Var instanceof t67) {
                        art artVar = axv.n2;
                        androidx.fragment.app.e eVarC6 = q47Var.C();
                        eVarC6.getClass();
                        int i3 = ((t67) h77Var).f33401a;
                        artVar.getClass();
                        if (eVarC6.J("HIDE_HISTORY_DIALOG_TAG") == null) {
                            axv axvVar = new axv();
                            iiy[] iiyVarArr3 = axv.o2;
                            axvVar.k2.I(axvVar, iiyVarArr3[0], i3);
                            axvVar.l2.x(axvVar, iiyVarArr3[1], "REQUEST_BET_HISTORY_HIDE_TYME_KEY");
                            axvVar.H0(eVarC6, "HIDE_HISTORY_DIALOG_TAG");
                        }
                    } else if (h77Var.equals(c77.f3848a)) {
                        wdk0 wdk0VarH0 = q47Var.H0();
                        String strH9 = q47Var.H(R.string.bet_history_successfully_hidden);
                        strH9.getClass();
                        wdk0.k(wdk0VarH0, new xdk0(qek0Var, strH9, null, null, null, numValueOf, 92), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof v67) {
                        tqt tqtVar = c4w.n2;
                        androidx.fragment.app.e eVarC7 = q47Var.C();
                        eVarC7.getClass();
                        v67 v67Var = (v67) h77Var;
                        ArrayList arrayList2 = v67Var.f36860a;
                        String str7 = v67Var.b;
                        tqtVar.getClass();
                        tqt.i(eVarC7, arrayList2, str7, "REQUEST_BET_HISTORY_MENU_KEY");
                    } else if (h77Var instanceof w57) {
                        tqt tqtVar2 = q0w.m2;
                        androidx.fragment.app.e eVarC8 = q47Var.C();
                        eVarC8.getClass();
                        ArrayList arrayList3 = ((w57) h77Var).f38570a;
                        tqtVar2.getClass();
                        if (eVarC8.J("HISTORY_DATE_FILTER_DIALOG_TAG") == null) {
                            q0w q0wVar = new q0w();
                            iiy[] iiyVarArr4 = q0w.n2;
                            q0wVar.l2.I(q0wVar, iiyVarArr4[1], arrayList3);
                            q0wVar.k2.x(q0wVar, iiyVarArr4[0], "HISTORY_DATE_FILTER_REQUEST_KEY");
                            q0wVar.H0(eVarC8, "HISTORY_DATE_FILTER_DIALOG_TAG");
                        }
                    } else if (h77Var instanceof d67) {
                        kwd kwdVar = dej.l2;
                        DateRangeCalendarBottomSheetParams dateRangeCalendarBottomSheetParams = ((d67) h77Var).f5539a;
                        androidx.fragment.app.e eVarC9 = q47Var.C();
                        eVarC9.getClass();
                        kwdVar.getClass();
                        kwd.h(dateRangeCalendarBottomSheetParams, eVarC9);
                    } else if (h77Var.equals(b77.f2090a)) {
                        ii iiVarG0 = q47Var.G0();
                        String strH10 = q47Var.H(R.string.error);
                        String strH11 = q47Var.H(R.string.request_error);
                        String strH12 = q47Var.H(R.string.ok_new);
                        strH12.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC10 = q47Var.C();
                        eVarC10.getClass();
                        iiVarG0.d(dialogFields, eVarC10);
                    } else if (h77Var.equals(b67.f2038a)) {
                        ii iiVarG1 = q47Var.G0();
                        String strH13 = q47Var.H(R.string.caution);
                        String strH14 = q47Var.H(R.string.bind_email_warning_description);
                        String strH15 = q47Var.H(R.string.bind);
                        strH15.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, q47Var.H(R.string.cancel), (String) null, "REQUEST_BIND_EMAIL_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC11 = q47Var.C();
                        eVarC11.getClass();
                        iiVarG1.d(dialogFields2, eVarC11);
                    } else if (h77Var instanceof x57) {
                        xi70 xi70Var = de90.k2;
                        androidx.fragment.app.e eVarC12 = q47Var.C();
                        eVarC12.getClass();
                        x57 x57Var = (x57) h77Var;
                        long j = x57Var.f40300a;
                        int i4 = x57Var.b;
                        xi70Var.getClass();
                        xi70.f(eVarC12, j, 0L, i4, "HISTORY_DATE_PICKER_KEY");
                    } else if (h77Var instanceof z57) {
                        kud kudVar = vcj.m2;
                        DateCalendarBottomSheetParams dateCalendarBottomSheetParams = ((z57) h77Var).f43802a;
                        androidx.fragment.app.e eVarC13 = q47Var.C();
                        eVarC13.getClass();
                        kudVar.getClass();
                        kud.g(dateCalendarBottomSheetParams, eVarC13, "HISTORY_DAY_PICKER_KEY");
                    } else if (h77Var instanceof a67) {
                        nwd nwdVar = xej.l2;
                        DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams = ((a67) h77Var).f304a;
                        androidx.fragment.app.e eVarC14 = q47Var.C();
                        eVarC14.getClass();
                        nwdVar.getClass();
                        nwd.f(dateRangeWithTimeCalendarBottomSheetParams, eVarC14);
                    } else if (h77Var instanceof y57) {
                        xi70 xi70Var2 = de90.k2;
                        androidx.fragment.app.e eVarC15 = q47Var.C();
                        eVarC15.getClass();
                        long j2 = ((y57) h77Var).f42033a;
                        xi70Var2.getClass();
                        xi70.f(eVarC15, j2, 0L, 90, "HISTORY_DATE_PICKER_MAIL_KEY");
                    } else if (h77Var.equals(c67.f3804a)) {
                        wdk0 wdk0VarH1 = q47Var.H0();
                        pek0 pek0Var = pek0.f26859a;
                        String strH16 = q47Var.H(R.string.history_sent_to_mail_message);
                        strH16.getClass();
                        wdk0.k(wdk0VarH1, new xdk0(pek0Var, strH16, null, null, null, Integer.valueOf(R.drawable.ic_reg_email), 92), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof e67) {
                        wdk0 wdk0VarH2 = q47Var.H0();
                        e67 e67Var = (e67) h77Var;
                        String str8 = e67Var.b;
                        String str9 = e67Var.f7267a;
                        String strH17 = q47Var.H(R.string.copy_history_bet_number_copy);
                        strH17.getClass();
                        j120.M(q47Var, wdk0VarH2, "Bet Number", str8, strH17, str9, Integer.valueOf(R.drawable.data_copy_icon), null, 64);
                        q47Var = q47Var;
                    } else if (h77Var instanceof g67) {
                        g67 g67Var = (g67) h77Var;
                        String str10 = g67Var.b;
                        byte[] bArr = g67Var.f10748a;
                        kxq kxqVarB = q47Var.B();
                        if (kxqVarB != null && !kxqVarB.isFinishing()) {
                            try {
                                Object systemService = kxqVarB.getSystemService("print");
                                PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                                if (printManager != null) {
                                    int i5 = qb90.e;
                                    printManager.print(str10, xvw.D(q47Var.o0(), str10, bArr), new PrintAttributes.Builder().build());
                                }
                            } catch (ActivityNotFoundException unused) {
                                wdk0 wdk0VarH3 = q47Var.H0();
                                String string = kxqVarB.getString(R.string.error_not_installed_v2, "PDFReader");
                                string.getClass();
                                wdk0.k(wdk0VarH3, new xdk0(rek0Var, string, null, null, null, null, 124), q47Var, null, null, false, null, 1020);
                            }
                        }
                        break;
                    } else if (h77Var instanceof f67) {
                        ii iiVarG2 = q47Var.G0();
                        String strH18 = q47Var.H(R.string.attention);
                        String strH19 = q47Var.H(R.string.order_already_auto_bet_exist_message);
                        String strH20 = q47Var.H(R.string.ok);
                        strH20.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH18, (CharSequence) strH19, (CharSequence) strH20, q47Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC16 = q47Var.C();
                        eVarC16.getClass();
                        iiVarG2.d(dialogFields3, eVarC16);
                        final String str11 = ((f67) h77Var).f8996a;
                        ccq0.V(q47Var, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", new Function0() { // from class: a.m47
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b6 = b4;
                                String str12 = str11;
                                q47 q47Var2 = q47Var;
                                switch (b6) {
                                    case 0:
                                        gl5 gl5Var2 = q47.U1;
                                        k3t0 k3t0VarI0 = q47Var2.I0();
                                        str12.getClass();
                                        k3t0VarI0.x(new s27(str12));
                                        break;
                                    case 1:
                                        gl5 gl5Var3 = q47.U1;
                                        k3t0 k3t0VarI1 = q47Var2.I0();
                                        str12.getClass();
                                        k3t0VarI1.x(new c27(str12));
                                        break;
                                    case 2:
                                        gl5 gl5Var4 = q47.U1;
                                        k3t0 k3t0VarI2 = q47Var2.I0();
                                        str12.getClass();
                                        k3t0VarI2.x(new b37(str12));
                                        break;
                                    default:
                                        gl5 gl5Var5 = q47.U1;
                                        k3t0 k3t0VarI3 = q47Var2.I0();
                                        str12.getClass();
                                        k3t0VarI3.x(new n27(str12));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (h77Var instanceof p67) {
                        ii iiVarG3 = q47Var.G0();
                        String strH21 = q47Var.H(R.string.coupon_has_items);
                        String strH22 = q47Var.H(R.string.duplicate_coupon_not_empty_error);
                        String strH23 = q47Var.H(R.string.ok_new);
                        strH23.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH21, (CharSequence) strH22, (CharSequence) strH23, q47Var.H(R.string.cancel), (String) null, "REQUEST_COUPON_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC17 = q47Var.C();
                        eVarC17.getClass();
                        iiVarG3.d(dialogFields4, eVarC17);
                        final String str12 = ((p67) h77Var).f26440a;
                        ccq0.V(q47Var, "REQUEST_COUPON_DIALOG_KEY", new Function0() { // from class: a.m47
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b6 = b3;
                                String str13 = str12;
                                q47 q47Var2 = q47Var;
                                switch (b6) {
                                    case 0:
                                        gl5 gl5Var2 = q47.U1;
                                        k3t0 k3t0VarI0 = q47Var2.I0();
                                        str13.getClass();
                                        k3t0VarI0.x(new s27(str13));
                                        break;
                                    case 1:
                                        gl5 gl5Var3 = q47.U1;
                                        k3t0 k3t0VarI1 = q47Var2.I0();
                                        str13.getClass();
                                        k3t0VarI1.x(new c27(str13));
                                        break;
                                    case 2:
                                        gl5 gl5Var4 = q47.U1;
                                        k3t0 k3t0VarI2 = q47Var2.I0();
                                        str13.getClass();
                                        k3t0VarI2.x(new b37(str13));
                                        break;
                                    default:
                                        gl5 gl5Var5 = q47.U1;
                                        k3t0 k3t0VarI3 = q47Var2.I0();
                                        str13.getClass();
                                        k3t0VarI3.x(new n27(str13));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (h77Var instanceof s67) {
                        ii iiVarG4 = q47Var.G0();
                        s67 s67Var = (s67) h77Var;
                        String str13 = s67Var.f31689a;
                        String str14 = s67Var.b;
                        String strH24 = q47Var.H(R.string.ok);
                        strH24.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) str13, (CharSequence) str14, (CharSequence) strH24, q47Var.H(R.string.cancel), (String) null, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC18 = q47Var.C();
                        eVarC18.getClass();
                        iiVarG4.d(dialogFields5, eVarC18);
                        final String str15 = s67Var.c;
                        ccq0.V(q47Var, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", new Function0() { // from class: a.m47
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b6 = b5;
                                String str16 = str15;
                                q47 q47Var2 = q47Var;
                                switch (b6) {
                                    case 0:
                                        gl5 gl5Var2 = q47.U1;
                                        k3t0 k3t0VarI0 = q47Var2.I0();
                                        str16.getClass();
                                        k3t0VarI0.x(new s27(str16));
                                        break;
                                    case 1:
                                        gl5 gl5Var3 = q47.U1;
                                        k3t0 k3t0VarI1 = q47Var2.I0();
                                        str16.getClass();
                                        k3t0VarI1.x(new c27(str16));
                                        break;
                                    case 2:
                                        gl5 gl5Var4 = q47.U1;
                                        k3t0 k3t0VarI2 = q47Var2.I0();
                                        str16.getClass();
                                        k3t0VarI2.x(new b37(str16));
                                        break;
                                    default:
                                        gl5 gl5Var5 = q47.U1;
                                        k3t0 k3t0VarI3 = q47Var2.I0();
                                        str16.getClass();
                                        k3t0VarI3.x(new n27(str16));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (h77Var.equals(j67.f15970a)) {
                        ii iiVarG5 = q47Var.G0();
                        String strH25 = q47Var.H(R.string.attention);
                        String strH26 = q47Var.H(R.string.self_exclusion_changes_prohibited);
                        String strH27 = q47Var.H(R.string.ok_new);
                        strH27.getClass();
                        DialogFields dialogFields6 = new DialogFields((CharSequence) strH25, (CharSequence) strH26, (CharSequence) strH27, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC19 = q47Var.C();
                        eVarC19.getClass();
                        iiVarG5.d(dialogFields6, eVarC19);
                    } else if (h77Var instanceof z67) {
                        wdk0 wdk0VarH4 = q47Var.H0();
                        String strH28 = q47Var.H(R.string.cancel_autobet_request);
                        strH28.getClass();
                        String strI = q47Var.I(R.string.history_coupon_number, ((z67) h77Var).f43852a);
                        strI.getClass();
                        wdk0.k(wdk0VarH4, new xdk0(qek0Var, strH28, strI, null, null, null, 120), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof e77) {
                        wdk0.k(q47Var.H0(), new xdk0(rek0Var, ((e77) h77Var).f7318a, null, null, null, null, 124), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof f77) {
                        wdk0 wdk0VarH5 = q47Var.H0();
                        String strH29 = q47Var.H(R.string.selected_bid_was_successfully_hidden);
                        strH29.getClass();
                        wdk0.k(wdk0VarH5, new xdk0(qek0Var, strH29, ((f77) h77Var).f9045a, null, null, numValueOf, 88), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof i67) {
                        ii iiVarG6 = q47Var.G0();
                        String strH30 = q47Var.H(R.string.confirmation);
                        String strH31 = q47Var.H(R.string.system_push_notification_setting);
                        String strH32 = q47Var.H(R.string.open_settings);
                        strH32.getClass();
                        DialogFields dialogFields7 = new DialogFields((CharSequence) strH30, (CharSequence) strH31, (CharSequence) strH32, q47Var.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC20 = q47Var.C();
                        eVarC20.getClass();
                        iiVarG6.d(dialogFields7, eVarC20);
                    } else if (h77Var instanceof r67) {
                        ii iiVarG7 = q47Var.G0();
                        String strH33 = q47Var.H(R.string.confirmation);
                        String strH34 = q47Var.H(R.string.push_tracking_alert_message);
                        String strH35 = q47Var.H(R.string.activate);
                        strH35.getClass();
                        DialogFields dialogFields8 = new DialogFields((CharSequence) strH33, (CharSequence) strH34, (CharSequence) strH35, q47Var.H(R.string.cancel), (String) null, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC21 = q47Var.C();
                        eVarC21.getClass();
                        iiVarG7.d(dialogFields8, eVarC21);
                    } else if (h77Var instanceof d77) {
                        d77 d77Var = (d77) h77Var;
                        wdk0.k(q47Var.H0(), new xdk0(qek0Var, d77Var.f5581a, d77Var.b, null, null, Integer.valueOf(d77Var.c), 88), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof a77) {
                        a77 a77Var = (a77) h77Var;
                        wdk0.k(q47Var.H0(), new xdk0(rek0Var, a77Var.f351a, a77Var.b, null, null, null, 120), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof h67) {
                        h67 h67Var = (h67) h77Var;
                        j120.e0(q47Var.o0(), h67Var.f12516a, h67Var.b);
                    } else if (h77Var instanceof l67) {
                        if (q47Var.C().J(t42.class.getSimpleName()) == null) {
                            jdk0 jdk0Var = t42.p2;
                            l67 l67Var = (l67) h77Var;
                            f8w f8wVar3 = l67Var.f19492a;
                            HistoryTypeModel historyTypeModel3 = l67Var.b;
                            jdk0Var.getClass();
                            t42 t42Var = new t42();
                            iiy[] iiyVarArr5 = t42.q2;
                            t42Var.m2.x(t42Var, iiyVarArr5[2], "REQUEST_ALL_FILTERS_DIALOG_KEY");
                            t42Var.l2.u(t42Var, iiyVarArr5[1], historyTypeModel3);
                            t42Var.k2.u(t42Var, iiyVarArr5[0], f8wVar3);
                            androidx.fragment.app.e eVarC22 = q47Var.C();
                            eVarC22.getClass();
                            sj3.D0(t42Var, eVarC22);
                        }
                    } else if (h77Var instanceof v57) {
                        ii iiVarG8 = q47Var.G0();
                        String strH36 = q47Var.H(R.string.support_cancel_request);
                        String strH37 = q47Var.H(R.string.auto_bet_cancel);
                        String strH38 = q47Var.H(R.string.ok);
                        strH38.getClass();
                        DialogFields dialogFields9 = new DialogFields((CharSequence) strH36, (CharSequence) strH37, (CharSequence) strH38, q47Var.H(R.string.cancel), (String) null, "REQUEST_AUTO_BET_CANCEL_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC23 = q47Var.C();
                        eVarC23.getClass();
                        iiVarG8.d(dialogFields9, eVarC23);
                        final String str16 = ((v57) h77Var).f36815a;
                        ccq0.V(q47Var, "REQUEST_AUTO_BET_CANCEL_DIALOG_KEY", new Function0() { // from class: a.m47
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b6 = b2;
                                String str17 = str16;
                                q47 q47Var2 = q47Var;
                                switch (b6) {
                                    case 0:
                                        gl5 gl5Var2 = q47.U1;
                                        k3t0 k3t0VarI0 = q47Var2.I0();
                                        str17.getClass();
                                        k3t0VarI0.x(new s27(str17));
                                        break;
                                    case 1:
                                        gl5 gl5Var3 = q47.U1;
                                        k3t0 k3t0VarI1 = q47Var2.I0();
                                        str17.getClass();
                                        k3t0VarI1.x(new c27(str17));
                                        break;
                                    case 2:
                                        gl5 gl5Var4 = q47.U1;
                                        k3t0 k3t0VarI2 = q47Var2.I0();
                                        str17.getClass();
                                        k3t0VarI2.x(new b37(str17));
                                        break;
                                    default:
                                        gl5 gl5Var5 = q47.U1;
                                        k3t0 k3t0VarI3 = q47Var2.I0();
                                        str17.getClass();
                                        k3t0VarI3.x(new n27(str17));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (h77Var instanceof k67) {
                        wdk0 wdk0VarH6 = q47Var.H0();
                        String strH39 = q47Var.H(R.string.access_denied_with_bonus_currency_message);
                        strH39.getClass();
                        wdk0.k(wdk0VarH6, new xdk0(rek0Var, strH39, null, null, null, null, 124), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof w67) {
                        gl5 gl5Var2 = tj7.t2;
                        androidx.fragment.app.e eVarC24 = q47Var.C();
                        eVarC24.getClass();
                        w67 w67Var = (w67) h77Var;
                        gl5.o(gl5Var2, eVarC24, w67Var.f38613a, w67Var.b, 0.0d, 120);
                    } else if (h77Var instanceof q67) {
                        q67 q67Var = (q67) h77Var;
                        wdk0.k(q47Var.H0(), new xdk0(qek0Var, q67Var.f28187a, q67Var.b, null, null, null, 120), q47Var, null, null, false, null, 1020);
                    } else if (h77Var instanceof y67) {
                        wdk0 wdk0VarH7 = q47Var.H0();
                        String str17 = ((y67) h77Var).f42083a;
                        wdk0.k(wdk0VarH7, new xdk0(rek0Var, str17, str17, null, null, null, 120), q47Var, null, null, false, null, 1020);
                    } else {
                        if (!(h77Var instanceof x67)) {
                            t9f.b();
                            return null;
                        }
                        wdk0 wdk0VarH8 = q47Var.H0();
                        String strH40 = q47Var.H(R.string.sale_error);
                        strH40.getClass();
                        wdk0.k(wdk0VarH8, new xdk0(rek0Var, strH40, ((x67) h77Var).f40347a, null, null, null, 120), q47Var, null, null, false, null, 1020);
                    }
                }
                q47Var.I0().x(r27.f29717a);
                return Unit.f46060a;
            case 16:
                o37 o37Var = (o37) obj;
                o37Var.getClass();
                ((k3t0) this.receiver).x(o37Var);
                return Unit.f46060a;
            case 17:
                o37 o37Var2 = (o37) obj;
                o37Var2.getClass();
                ((k3t0) this.receiver).x(o37Var2);
                return Unit.f46060a;
            case 18:
                o37 o37Var3 = (o37) obj;
                o37Var3.getClass();
                ((k3t0) this.receiver).x(o37Var3);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                o37 o37Var4 = (o37) obj;
                o37Var4.getClass();
                ((k3t0) this.receiver).x(o37Var4);
                return Unit.f46060a;
            case 20:
                o37 o37Var5 = (o37) obj;
                o37Var5.getClass();
                ((k3t0) this.receiver).x(o37Var5);
                return Unit.f46060a;
            case 21:
                o37 o37Var6 = (o37) obj;
                o37Var6.getClass();
                ((k3t0) this.receiver).x(o37Var6);
                return Unit.f46060a;
            case 22:
                m77 m77Var = (m77) obj;
                m77Var.getClass();
                o77 o77Var = (o77) this.receiver;
                kl5 kl5Var2 = o77.k2;
                phf0 phf0Var = o77Var.h2;
                iiy[] iiyVarArr6 = o77.l2;
                if (phf0Var.n(o77Var, iiyVarArr6[3]).length() > 0) {
                    vcc.f0(i120.V(new Pair("RESULT_BET_HISTORY_ITEM_CLICK", m77Var.f21305a)), o77Var, o77Var.h2.n(o77Var, iiyVarArr6[3]));
                }
                o77Var.y0();
                return Unit.f46060a;
            case 23:
                return Q(obj);
            case 24:
                la7 la7Var = (la7) obj;
                la7Var.getClass();
                ((k3t0) this.receiver).x(la7Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((kd7) this.receiver).N(th11);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((kd7) this.receiver).N(th12);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((kd7) this.receiver).N(th13);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((kd7) this.receiver).N(th14);
                return Unit.f46060a;
            default:
                gsz gszVar = (gsz) obj;
                gszVar.getClass();
                uf7 uf7Var = (uf7) this.receiver;
                uf7Var.getClass();
                csz cszVar = gszVar.f11855a;
                p7m0 p7m0Var2 = uf7Var.k;
                do {
                    value2 = p7m0Var2.getValue();
                    List<gsz> list = (List) value2;
                    int value4 = cszVar.getValue();
                    uf7Var.b.e("CURRENT_SELECTED_LIMIT_BUNDLE_KEY", Integer.valueOf(value4));
                    p7m0 p7m0Var3 = uf7Var.l;
                    do {
                        value3 = p7m0Var3.getValue();
                        ((Boolean) value3).getClass();
                    } while (!p7m0Var3.m(value3, Boolean.valueOf(value4 != uf7Var.n)));
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (gsz gszVar2 : list) {
                        arrayList.add(new gsz(gszVar2.f11855a, gszVar2.f11855a.equals(cszVar)));
                    }
                } while (!p7m0Var2.m(value2, arrayList));
                return Unit.f46060a;
        }
    }
}
