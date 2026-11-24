package a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.victory_indicator_compact.DsVictoryIndicatorCompact;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hrf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13528a;
    public final /* synthetic */ Context b;

    public /* synthetic */ hrf0(Context context, byte b) {
        this.f13528a = b;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Window window;
        Window window2;
        byte b = this.f13528a;
        Context context = this.b;
        switch (b) {
            case 0:
                int i = ResidentSafeLineView.m;
                context.getClass();
                int i2 = context.getResources().getDisplayMetrics().widthPixels;
                return new lrf0(i2, (i2 * 20) / 100);
            case 1:
                return new DsVictoryIndicatorCompact(new ContextThemeWrapper(context, R.style.Widget_VictoryIndicatorCompact_Theme), null, 6);
            case 2:
                return new DsVictoryIndicatorCompact(new ContextThemeWrapper(context, R.style.Widget_VictoryIndicatorCompact_Theme), null, 6);
            case 3:
                int i3 = SportCellLeftView.n;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(jmu0.d());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            case 4:
                int i4 = SportCellMiddleView.i;
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                appCompatTextView.setId(jmu0.d());
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                appCompatTextView.setGravity(16);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setTextDirection(5);
                appCompatTextView.setTextAlignment(2);
                return appCompatTextView;
            case 5:
                int i5 = SportCellRightView.o;
                context.getClass();
                u0m u0mVar = new u0m(context, null, 4, 0);
                int dimensionPixelSize = u0mVar.getResources().getDimensionPixelSize(R.dimen.size_24);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.gravity = 16;
                u0mVar.setLayoutParams(layoutParams);
                return u0mVar;
            case 6:
                TextView textView = new TextView(context);
                textView.setId(jmu0.d());
                textView.setTag("betType");
                cem0.n(R.style.TextStyle_Caption_Bold_Caps_M_TextSecondary, textView);
                textView.setSingleLine(true);
                textView.setAllCaps(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                return textView;
            case 7:
                ImageView imageView = new ImageView(context);
                imageView.setId(jmu0.d());
                imageView.setTag("betTypeCouponImage");
                imageView.setImageResource(R.drawable.ic_glyph_coupon_16);
                jmu0.j(imageView, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundContent, context)));
                return imageView;
            case 8:
                TextView textView2 = new TextView(context);
                textView2.setId(jmu0.d());
                textView2.setTag("betNumber");
                textView2.setAllCaps(true);
                cem0.n(R.style.TextStyle_Caption_Bold_Caps_M_TextSecondary, textView2);
                textView2.setTextAlignment(3);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                return textView2;
            case 9:
                TextView textView3 = new TextView(context);
                textView3.setId(jmu0.d());
                textView3.setTag("betType");
                cem0.n(R.style.TextStyle_Caption_Bold_Caps_M_TextSecondary, textView3);
                textView3.setSingleLine(true);
                textView3.setAllCaps(true);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                return textView3;
            case 10:
                ImageView imageView2 = new ImageView(context);
                imageView2.setId(jmu0.d());
                imageView2.setTag("betTypeCouponImage");
                imageView2.setImageResource(R.drawable.ic_glyph_coupon_16);
                jmu0.j(imageView2, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundContent, context)));
                return imageView2;
            case 11:
                TextView textView4 = new TextView(context);
                textView4.setId(jmu0.d());
                textView4.setTag("betNumber");
                textView4.setAllCaps(true);
                cem0.n(R.style.TextStyle_Caption_Bold_Caps_M_TextSecondary, textView4);
                textView4.setTextAlignment(3);
                textView4.setSingleLine(true);
                textView4.setEllipsize(TextUtils.TruncateAt.END);
                return textView4;
            case 12:
                DsSeparator dsSeparator = new DsSeparator(context, null, 6, 0);
                dsSeparator.setId(jmu0.d());
                dsSeparator.setTag("separator");
                dsSeparator.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return dsSeparator;
            case 13:
                TextView textView5 = new TextView(context);
                textView5.setId(jmu0.d());
                textView5.setTag("betType");
                cem0.n(R.style.TextStyle_Caption_Bold_Caps_M_TextSecondary, textView5);
                textView5.setSingleLine(true);
                textView5.setAllCaps(true);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                return textView5;
            case 14:
                ImageView imageView3 = new ImageView(context);
                imageView3.setId(jmu0.d());
                imageView3.setTag("betTypeCouponImage");
                imageView3.setImageResource(R.drawable.ic_glyph_coupon);
                imageView3.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context)));
                jmu0.j(imageView3, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundContent, context)));
                return imageView3;
            case 15:
                TextView textView6 = new TextView(context);
                textView6.setId(jmu0.d());
                textView6.setTag("betNumber");
                textView6.setAllCaps(true);
                cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, textView6);
                textView6.setSingleLine(true);
                textView6.setEllipsize(TextUtils.TruncateAt.END);
                return textView6;
            case 16:
                DsButton dsButton = new DsButton(context, null, 6, 0);
                dsButton.setId(jmu0.d());
                dsButton.setTag("shareButton");
                dsButton.setButtonSize(eul.SMALL);
                dsButton.setButtonStyle(ful.f);
                dsButton.setButtonType(gul.f);
                dsButton.setIconRes(R.drawable.ic_glyph_share);
                dsButton.h();
                return dsButton;
            case 17:
                DsSeparator dsSeparator2 = new DsSeparator(context, null, 6, 0);
                dsSeparator2.setId(jmu0.d());
                dsSeparator2.setTag("separator");
                dsSeparator2.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return dsSeparator2;
            case 18:
                ImageView imageView4 = new ImageView(context);
                imageView4.setId(jmu0.d());
                imageView4.setTag("betTypeCouponImage");
                imageView4.setImageResource(R.drawable.ic_glyph_coupon);
                imageView4.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context)));
                jmu0.j(imageView4, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundContent, context)));
                return imageView4;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                TextView textView7 = new TextView(context);
                textView7.setId(jmu0.d());
                textView7.setTag("betType");
                cem0.n(R.style.TextStyle_Caption_Bold_Caps_M_TextSecondary, textView7);
                textView7.setSingleLine(true);
                textView7.setAllCaps(true);
                textView7.setEllipsize(TextUtils.TruncateAt.END);
                return textView7;
            case 20:
                TextView textView8 = new TextView(context);
                textView8.setId(jmu0.d());
                textView8.setTag("betNumber");
                textView8.setAllCaps(true);
                cem0.n(R.style.TextStyle_Caption_Regular_L_Secondary, textView8);
                textView8.setSingleLine(true);
                textView8.setEllipsize(TextUtils.TruncateAt.END);
                return textView8;
            case 21:
                DsButton dsButton2 = new DsButton(context, null, 6, 0);
                dsButton2.setId(jmu0.d());
                dsButton2.setTag("shareButton");
                dsButton2.setButtonSize(eul.SMALL);
                dsButton2.setButtonStyle(ful.f);
                dsButton2.setButtonType(gul.f);
                dsButton2.setIconRes(R.drawable.ic_glyph_share);
                dsButton2.h();
                return dsButton2;
            case 22:
                int i6 = SwipeBackLayout.q;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.onBackPressed();
                }
                return Unit.f46060a;
            case 23:
                int i7 = TeamStatisticView.x;
                ArrayList arrayList = new ArrayList(5);
                for (int i8 = 0; i8 < 5; i8++) {
                    ImageView imageView5 = new ImageView(context);
                    imageView5.setScaleX(-1.0f);
                    arrayList.add(imageView5);
                }
                return arrayList;
            case 24:
                return AnimationUtils.loadAnimation(context, R.anim.coupon_card_game_indicator_rotate_animation);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                j6m0 j6m0Var = v9r0.O1;
                Activity activityS = j120.S(context);
                if (activityS != null && (window = activityS.getWindow()) != null) {
                    window.setSoftInputMode(a8k0.A() ? 16 : 48);
                }
                return Unit.f46060a;
            default:
                j6m0 j6m0Var2 = v9r0.O1;
                Activity activityS2 = j120.S(context);
                if (activityS2 != null && (window2 = activityS2.getWindow()) != null) {
                    window2.setSoftInputMode(32);
                }
                return Unit.f46060a;
        }
    }
}
