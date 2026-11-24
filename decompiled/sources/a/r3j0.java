package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.footer.DsFooter;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r3j0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29792a;

    public /* synthetic */ r3j0(byte b) {
        this.f29792a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29792a;
        int i = R.id.description;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.settings_make_bet_events, viewGroup, false);
                LinearLayout linearLayout = (LinearLayout) viewF;
                int i2 = R.id.toggleAutoClearCouponEnd;
                View viewF2 = yum0.f(viewF, R.id.toggleAutoClearCouponEnd);
                if (viewF2 != null) {
                    dc3 dc3VarD = dc3.d(viewF2);
                    View viewF3 = yum0.f(viewF, R.id.toggleClearCoupon);
                    if (viewF3 != null) {
                        dc3 dc3VarD2 = dc3.d(viewF3);
                        View viewF4 = yum0.f(viewF, R.id.toggleSubscribeBetUpdates);
                        if (viewF4 != null) {
                            return new k3j0(linearLayout, dc3VarD, dc3VarD2, dc3.d(viewF4));
                        }
                        i2 = R.id.toggleSubscribeBetUpdates;
                    } else {
                        i2 = R.id.toggleClearCoupon;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.settings_make_bet_exact_coef, viewGroup2, false);
                LinearLayout linearLayout2 = (LinearLayout) viewF5;
                int i3 = R.id.toggleConfirmTransactionFromLineToLive;
                View viewF6 = yum0.f(viewF5, R.id.toggleConfirmTransactionFromLineToLive);
                if (viewF6 != null) {
                    dc3 dc3VarD3 = dc3.d(viewF6);
                    View viewF7 = yum0.f(viewF5, R.id.toggleResetCoefOnScoreChange);
                    if (viewF7 != null) {
                        return new s3j0(linearLayout2, dc3VarD3, dc3.d(viewF7));
                    }
                    i3 = R.id.toggleResetCoefOnScoreChange;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i3)));
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.settings_make_bet_quick_bets, viewGroup3, false);
                DsFooter dsFooter = (DsFooter) yum0.f(viewF8, R.id.description);
                if (dsFooter != null) {
                    i = R.id.firstSumCell;
                    View viewF9 = yum0.f(viewF8, R.id.firstSumCell);
                    if (viewF9 != null) {
                        dc3 dc3VarC = dc3.c(viewF9);
                        i = R.id.secondSumCell;
                        View viewF10 = yum0.f(viewF8, R.id.secondSumCell);
                        if (viewF10 != null) {
                            dc3 dc3VarC2 = dc3.c(viewF10);
                            i = R.id.thirdSumCell;
                            View viewF11 = yum0.f(viewF8, R.id.thirdSumCell);
                            if (viewF11 != null) {
                                dc3 dc3VarC3 = dc3.c(viewF11);
                                i = R.id.toggleQuickBet;
                                View viewF12 = yum0.f(viewF8, R.id.toggleQuickBet);
                                if (viewF12 != null) {
                                    return new g4j0((LinearLayout) viewF8, dsFooter, dc3VarC, dc3VarC2, dc3VarC3, dc3.d(viewF12));
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i)));
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF13 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.settings_make_bet_vip, viewGroup4, false);
                DsFooter dsFooter2 = (DsFooter) yum0.f(viewF13, R.id.description);
                if (dsFooter2 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) viewF13;
                    View viewF14 = yum0.f(viewF13, R.id.toggleVipBet);
                    if (viewF14 != null) {
                        return new c6j0(linearLayout3, dsFooter2, dc3.d(viewF14));
                    }
                    i = R.id.toggleVipBet;
                }
                hny.u("Missing required view with ID: ".concat(viewF13.getResources().getResourceName(i)));
                return null;
            case 4:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup5.getClass();
                return kxx.a(layoutInflater, viewGroup5, false);
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 8:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 10:
                tcj0 tcj0Var = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var.getClass();
                return tcj0.a(tcj0Var, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -3, 2097151);
            case 11:
                tcj0 tcj0Var2 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var2.getClass();
                return tcj0.a(tcj0Var2, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, tcj0Var2.U + 1, -1, 1835007);
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                tcj0 tcj0Var3 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var3.getClass();
                return tcj0.a(tcj0Var3, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 1, -1, 1835007);
            case 15:
                tcj0 tcj0Var4 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var4.getClass();
                return tcj0.a(tcj0Var4, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -1, 1966079);
            case 16:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 17:
                tcj0 tcj0Var5 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var5.getClass();
                return tcj0.a(tcj0Var5, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, tcj0Var5.U + 1, -1, 1835007);
            case 18:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 20:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                tcj0 tcj0Var6 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var6.getClass();
                return tcj0.a(tcj0Var6, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -2, 2097151);
            case 23:
                tcj0 tcj0Var7 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var7.getClass();
                return tcj0.a(tcj0Var7, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, tcj0Var7.U + 1, -1, 1835007);
            case 24:
                tcj0 tcj0Var8 = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var8.getClass();
                return tcj0.a(tcj0Var8, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, true, 0, -1, 1966079);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tcj0 tcj0Var9 = (tcj0) obj2;
                return tcj0.a(tcj0Var9, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, tcj0Var9.U + 1, -1, 1835007);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup6.getClass();
                return nxx.a(layoutInflater2, viewGroup6, false);
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
        }
    }
}
