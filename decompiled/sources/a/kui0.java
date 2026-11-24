package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.footer.DsFooter;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kui0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18912a;

    public /* synthetic */ kui0(byte b) {
        this.f18912a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18912a;
        int i = R.id.description;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_setting_block, viewGroup, false);
                DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewF, R.id.blockSwitcher);
                if (dsCellRightSwitch != null) {
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.description);
                    if (dsCellMiddleTitle != null) {
                        i = R.id.separator;
                        DsSeparator dsSeparator = (DsSeparator) yum0.f(viewF, R.id.separator);
                        if (dsSeparator != null) {
                            DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF;
                            return new exx(dsSettingsCell, dsCellRightSwitch, dsCellMiddleTitle, dsSeparator, dsSettingsCell);
                        }
                    }
                } else {
                    i = R.id.blockSwitcher;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_filter_market_header, viewGroup2, false);
                TextView textView = (TextView) yum0.f(viewF2, R.id.tvTitle);
                if (textView != null) {
                    return new lux((ConstraintLayout) viewF2, textView);
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.tvTitle)));
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_filter_market_header, viewGroup3, false);
                TextView textView2 = (TextView) yum0.f(viewF3, R.id.tvTitle);
                if (textView2 != null) {
                    return new mux((ConstraintLayout) viewF3, textView2);
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(R.id.tvTitle)));
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_setting_header_top, viewGroup4, false);
                if (viewF4 != null) {
                    return new gxx((DsHeader) viewF4);
                }
                hny.u("rootView");
                return null;
            case 4:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_setting_header, viewGroup5, false);
                if (viewF5 != null) {
                    DsHeader dsHeader = (DsHeader) viewF5;
                    return new fxx(dsHeader, dsHeader);
                }
                hny.u("rootView");
                return null;
            case 5:
                twi0 twi0Var = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var.getClass();
                return twi0.a(twi0Var, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, twi0Var.S + 1, -1, 1835007);
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                twi0 twi0Var2 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var2.getClass();
                return twi0.a(twi0Var2, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -3, 2097151);
            case 8:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 9:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 10:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                twi0 twi0Var3 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var3.getClass();
                return twi0.a(twi0Var3, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, twi0Var3.S + 1, -1, 1835007);
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                twi0 twi0Var4 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var4.getClass();
                return twi0.a(twi0Var4, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 1, -1, 1703935);
            case 16:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 17:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 18:
                twi0 twi0Var5 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var5.getClass();
                return twi0.a(twi0Var5, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -2, 2097151);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                twi0 twi0Var6 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var6.getClass();
                return twi0.a(twi0Var6, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, twi0Var6.S + 1, -1, 1835007);
            case 20:
                twi0 twi0Var7 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var7.getClass();
                return twi0.a(twi0Var7, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, true, 0, -1, 1966079);
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                twi0 twi0Var8 = (twi0) obj2;
                return twi0.a(twi0Var8, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, twi0Var8.S + 1, -1, 1835007);
            case 23:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup6.getClass();
                return hxx.a(layoutInflater, viewGroup6, false);
            case 24:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup7.getClass();
                return kxx.a(layoutInflater2, viewGroup7, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup8.getClass();
                return cux.a(layoutInflater3, viewGroup8, false);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup9.getClass();
                return fwx.a(layoutInflater4, viewGroup9, false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.settings_make_bet_automax, viewGroup10, false);
                DsFooter dsFooter = (DsFooter) yum0.f(viewF6, R.id.description);
                if (dsFooter != null) {
                    LinearLayout linearLayout = (LinearLayout) viewF6;
                    i = R.id.toggleAutoMax;
                    View viewF7 = yum0.f(viewF6, R.id.toggleAutoMax);
                    if (viewF7 != null) {
                        return new g2j0(linearLayout, dsFooter, dc3.d(viewF7));
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.settings_make_bet_coef_change, viewGroup11, false);
                int i2 = R.id.acceptAnyCoefChange;
                View viewF9 = yum0.f(viewF8, R.id.acceptAnyCoefChange);
                if (viewF9 != null) {
                    dc3 dc3VarB = dc3.b(viewF9);
                    View viewF10 = yum0.f(viewF8, R.id.acceptIncreasedCoef);
                    if (viewF10 != null) {
                        dc3 dc3VarB2 = dc3.b(viewF10);
                        View viewF11 = yum0.f(viewF8, R.id.confirmCoefChange);
                        if (viewF11 != null) {
                            return new h2j0((LinearLayout) viewF8, dc3VarB, dc3VarB2, dc3.b(viewF11));
                        }
                        i2 = R.id.confirmCoefChange;
                    } else {
                        i2 = R.id.acceptIncreasedCoef;
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF8.getResources().getResourceName(i2)));
                return null;
            default:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF12 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.settings_make_bet_default_bet_sum_item, viewGroup12, false);
                int i3 = R.id.defaultSumCell;
                View viewF13 = yum0.f(viewF12, R.id.defaultSumCell);
                if (viewF13 != null) {
                    dc3 dc3VarC = dc3.c(viewF13);
                    View viewF14 = yum0.f(viewF12, R.id.toggleDefaultBetSum);
                    if (viewF14 != null) {
                        return new b3j0((LinearLayout) viewF12, dc3VarC, dc3.d(viewF14));
                    }
                    i3 = R.id.toggleDefaultBetSum;
                }
                hny.u("Missing required view with ID: ".concat(viewF12.getResources().getResourceName(i3)));
                return null;
        }
    }
}
