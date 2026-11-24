package a;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.app_start.impl.presentation.view.AppStartScreenLayout;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickHeroItemView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.right.DsCellRightDragAndDrop;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yg3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42567a;
    public final /* synthetic */ Context b;

    public /* synthetic */ yg3(Context context, byte b) {
        this.f42567a = b;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Window window;
        Window window2;
        byte b = this.f42567a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        int i = 6;
        AttributeSet attributeSet = null;
        Context context = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.space_16));
            case 1:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.space_12));
            case 2:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.space_8));
            case 3:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.space_6));
            case 4:
                int i2 = AppStartScreenLayout.B;
                return Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", 0) == 2);
            case 5:
                return new veg0(context);
            case 6:
                Activity activityS = j120.S(context);
                if (activityS != null && (window = activityS.getWindow()) != null) {
                    window.setSoftInputMode(16);
                }
                return Unit.f46060a;
            case 7:
                Activity activityS2 = j120.S(context);
                if (activityS2 != null && (window2 = activityS2.getWindow()) != null) {
                    window2.setSoftInputMode(32);
                }
                return Unit.f46060a;
            case 8:
                TextView textView = new TextView(context);
                textView.setId(jmu0.d());
                textView.setTag("alertTitleCustom");
                cem0.n(R.style.TextStyle_Title_Medium_S_TextPrimary, textView);
                textView.setTextAlignment(4);
                return textView;
            case 9:
                TextView textView2 = new TextView(context);
                textView2.setId(jmu0.d());
                textView2.setTag("alertMessageCustom");
                textView2.setTextAlignment(4);
                cem0.n(R.style.TextStyle_Headline_Regular_Secondary, textView2);
                return textView2;
            case 10:
                DsCheckbox dsCheckbox = new DsCheckbox(context, null, 6);
                dsCheckbox.setId(jmu0.d());
                dsCheckbox.setTag("alertCheckboxCustom");
                return dsCheckbox;
            case 11:
                TextView textView3 = new TextView(context);
                textView3.setId(jmu0.d());
                textView3.setTag("alertCheckboxMessageCustom");
                cem0.n(R.style.TextStyle_Headline_Regular_Secondary, textView3);
                return textView3;
            case 12:
                DsButton dsButton = new DsButton(context, attributeSet, i, objArr == true ? 1 : 0);
                dsButton.setId(jmu0.d());
                dsButton.setTag("middleButtonCustom");
                dsButton.setButtonStyle(ful.f);
                dsButton.setButtonSize(eul.MEDIUM);
                return dsButton;
            case 13:
                DsButton dsButton2 = new DsButton(context, attributeSet, i, objArr2 == true ? 1 : 0);
                dsButton2.setId(jmu0.d());
                dsButton2.setTag("bottomButtonCustom");
                dsButton2.setButtonStyle(ful.f);
                dsButton2.setButtonSize(eul.MEDIUM);
                return dsButton2;
            case 14:
                View view = new View(context);
                view.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return view;
            case 15:
                TextView textView4 = new TextView(context);
                textView4.setId(jmu0.d());
                textView4.setTag("alertTitleCustomLottie");
                cem0.n(R.style.TextStyle_Title_Medium_S_TextPrimary, textView4);
                textView4.setTextAlignment(4);
                return textView4;
            case 16:
                TextView textView5 = new TextView(context);
                textView5.setId(jmu0.d());
                textView5.setTag("alertMessageCustomLottie");
                textView5.setTextAlignment(4);
                cem0.n(R.style.TextStyle_Headline_Regular_Secondary, textView5);
                return textView5;
            case 17:
                DsCheckbox dsCheckbox2 = new DsCheckbox(context, null, 6);
                dsCheckbox2.setId(jmu0.d());
                dsCheckbox2.setTag("alertCheckboxCustomLottie");
                return dsCheckbox2;
            case 18:
                TextView textView6 = new TextView(context);
                textView6.setId(jmu0.d());
                textView6.setTag("alertCheckboxMessageCustomLottie");
                cem0.n(R.style.TextStyle_Headline_Regular_Secondary, textView6);
                return textView6;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                DsButton dsButton3 = new DsButton(context, attributeSet, i, objArr3 == true ? 1 : 0);
                dsButton3.setId(jmu0.d());
                dsButton3.setTag("middleButtonCustomLottie");
                dsButton3.setButtonStyle(ful.f);
                dsButton3.setButtonSize(eul.MEDIUM);
                return dsButton3;
            case 20:
                DsButton dsButton4 = new DsButton(context, attributeSet, i, objArr4 == true ? 1 : 0);
                dsButton4.setId(jmu0.d());
                dsButton4.setTag("bottomButtonCustomLottie");
                dsButton4.setButtonStyle(ful.f);
                dsButton4.setButtonSize(eul.MEDIUM);
                return dsButton4;
            case 21:
                View view2 = new View(context);
                view2.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return view2;
            case 22:
                return Float.valueOf(context.getResources().getDisplayMetrics().density * 160.0f);
            case 23:
                int i3 = DotaBanPickHeroItemView.l;
                ImageView imageView = new ImageView(context);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                imageView.setTag("PickLabelImageView");
                return imageView;
            case 24:
                TypedValue typedValue = j5d.f15927a;
                return Integer.valueOf(j5d.a(context, R.attr.uikitStaticWhite, false));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i4 = DsAccountSelection.z;
                return AnimationUtils.loadAnimation(context, R.anim.rotation_animation);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i5 = DsAccountSelection.z;
                return AnimationUtils.loadAnimation(context, R.anim.rotation_animation_rtl);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i6 = DsCellLeftIcon.s;
                return context.getDrawable(R.drawable.circle_background);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i7 = DsCellLeftIcon.s;
                return Integer.valueOf(m5d.b(R.attr.uikitBackground, context));
            default:
                int i8 = DsCellRightDragAndDrop.i;
                DsButton dsButton5 = new DsButton(context, attributeSet, i, objArr5 == true ? 1 : 0);
                dsButton5.setButtonSize(eul.LARGE);
                dsButton5.setButtonStyle(ful.g);
                dsButton5.setButtonType(gul.i);
                return dsButton5;
        }
    }
}
