package a;

import android.javax.sip.message.Response;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.flexbox.FlexboxLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gh5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11283a;

    public /* synthetic */ gh5(byte b) {
        this.f11283a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11283a;
        int i = R.id.middle;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.item_balance_management_accordion_divided_line_item, viewGroup, false);
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF, R.id.left);
                if (dsCellLeftIcon != null) {
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF, R.id.middle);
                    if (dsCellMiddleTitle != null) {
                        return new csx((DsMenuCell) viewF, dsCellLeftIcon, dsCellMiddleTitle);
                    }
                } else {
                    i = R.id.left;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_balance_management_small_icon_item, viewGroup2, false);
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF2, R.id.left);
                if (dsCellLeftIcon2 != null) {
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF2, R.id.middle);
                    if (dsCellMiddleTitle2 != null) {
                        return new fsx((DsMenuCell) viewF2, dsCellLeftIcon2, dsCellMiddleTitle2);
                    }
                } else {
                    i = R.id.left;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_balance_management_item, viewGroup3, false);
                DsCellLeftIcon dsCellLeftIcon3 = (DsCellLeftIcon) yum0.f(viewF3, R.id.left);
                if (dsCellLeftIcon3 != null) {
                    DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF3, R.id.middle);
                    if (dsCellMiddleTitle3 != null) {
                        return new esx((DsMenuCell) viewF3, dsCellLeftIcon3, dsCellMiddleTitle3);
                    }
                } else {
                    i = R.id.left;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 3:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_bet_game_shop_account, viewGroup4, false);
                int i2 = R.id.accountNameTv;
                TextView textView = (TextView) yum0.f(viewF4, R.id.accountNameTv);
                if (textView != null) {
                    i2 = R.id.amountTv;
                    TextView textView2 = (TextView) yum0.f(viewF4, R.id.amountTv);
                    if (textView2 != null) {
                        return new gsx((LinearLayout) viewF4, textView, textView2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i2)));
                return null;
            case 4:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.app_start_ball_item, viewGroup5, false);
                if (viewF5 != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) viewF5;
                    return new cg3(appCompatImageView, appCompatImageView);
                }
                hny.u("rootView");
                return null;
            case 5:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar.e0(1689467384);
                d9z d9zVarA = f9z.a(fetVar);
                fetVar.r(false);
                return d9zVarA;
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).getClass();
                kl5 kl5Var = l46.O1;
                fetVar2.e0(1102302593);
                WeakHashMap weakHashMap = djv0.w;
                q33 q33Var = zcm0.i(fetVar2).g;
                fetVar2.r(false);
                return q33Var;
            case 8:
                ((Integer) obj2).getClass();
                hp4.e(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 9:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup6.getClass();
                return vjd.a(layoutInflater, viewGroup6);
            case 10:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.game_accuracy_compact_item, viewGroup7, false);
                LinearLayout linearLayout = (LinearLayout) viewF6;
                int i3 = R.id.flButtons;
                FlexboxLayout flexboxLayout = (FlexboxLayout) yum0.f(viewF6, R.id.flButtons);
                if (flexboxLayout != null) {
                    i3 = R.id.tvCoef;
                    TextView textView3 = (TextView) yum0.f(viewF6, R.id.tvCoef);
                    if (textView3 != null) {
                        i3 = R.id.tvTitle;
                        TextView textView4 = (TextView) yum0.f(viewF6, R.id.tvTitle);
                        if (textView4 != null) {
                            return new nlr(linearLayout, linearLayout, flexboxLayout, textView3, textView4);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i3)));
                return null;
            case 11:
                ((Integer) obj2).getClass();
                y860.j(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.vh_bet_builder_item, viewGroup8, false);
                if (viewF7 != null) {
                    ComposeView composeView = (ComposeView) viewF7;
                    return new pcu0(composeView, composeView);
                }
                hny.u("rootView");
                return null;
            case 15:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 16:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 22:
                jp6 jp6Var = (jp6) obj2;
                ((oyg0) obj).getClass();
                jp6Var.getClass();
                return jp6.a(jp6Var, false, false, true, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2097144);
            case 23:
                jp6 jp6Var2 = (jp6) obj2;
                ((oyg0) obj).getClass();
                jp6Var2.getClass();
                return jp6.a(jp6Var2, false, true, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2097148);
            case 24:
                or6 or6Var = (or6) obj2;
                ((oyg0) obj).getClass();
                or6Var.getClass();
                return or6.a(or6Var, null, iun.f15405a, 0, false, false, false, null, Response.REQUEST_ENTITY_TOO_LARGE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                or6 or6Var2 = (or6) obj2;
                ((oyg0) obj).getClass();
                or6Var2.getClass();
                return or6.a(or6Var2, null, null, 0, false, false, true, null, Response.UNSUPPORTED_MEDIA_TYPE);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ql5 ql5Var = (ql5) obj;
                ql5 ql5Var2 = (ql5) obj2;
                ql5Var.getClass();
                ql5Var2.getClass();
                return Boolean.valueOf(ql5Var.f28916a == ql5Var2.f28916a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                c820 c820Var = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var.getClass();
                go7 go7Var = c820Var.b;
                if (go7Var.equals(do7.f6402a)) {
                    svj0 svj0Var = c820Var.d;
                    return c820.a(c820Var, null, null, null, svj0.a(svj0Var, null, null, lwo0.a(svj0Var.c, false, false, 0.0d, iun.f15405a, 28), 11), null, null, false, false, false, false, null, 8183);
                }
                if (go7Var.equals(ao7.f1188a)) {
                    return c820Var;
                }
                t9f.b();
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            default:
                c820 c820Var2 = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var2.getClass();
                svj0 svj0Var2 = c820Var2.d;
                return c820.a(c820Var2, null, null, null, svj0.a(svj0Var2, null, null, lwo0.a(svj0Var2.c, false, false, 0.0d, iun.f15405a, 28), 11), null, null, false, false, false, false, null, 8183);
        }
    }

    public /* synthetic */ gh5(int i, byte b) {
        this.f11283a = b;
    }
}
