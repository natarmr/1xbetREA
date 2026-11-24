package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.ErasableView;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetChartView;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetView;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.EnteringPinCode;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCricket;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ryl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31318a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ryl(Context context, byte b) {
        this.f31318a = b;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31318a;
        int i = 6;
        AttributeSet attributeSet = null;
        int i2 = 0;
        Context context = this.b;
        switch (b) {
            case 0:
                return new m900(context);
            case 1:
                int i3 = DsCounter.i;
                return epv0.U(R.drawable.ic_glyph_chevron_up_small_16_secondary, context);
            case 2:
                int i4 = DsCounter.i;
                return epv0.U(R.drawable.ic_glyph_chevron_down_small_16_secondary, context);
            case 3:
                int i5 = DsCounter.i;
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                appCompatTextView.setId(jmu0.d());
                appCompatTextView.setTextDirection(3);
                appCompatTextView.setTextAlignment(4);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                cem0.n(R.style.TextStyle_Text_Regular_Secondary, appCompatTextView);
                return appCompatTextView;
            case 4:
                int i6 = DsLottieEmpty.t;
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                lottieAnimationView.setId(jmu0.d());
                lottieAnimationView.setTag("DsLottieEmpty.LottieAnimationViewTag");
                lottieAnimationView.setRepeatCount(-1);
                int i7 = Build.VERSION.SDK_INT;
                lottieAnimationView.setRenderMode((i7 == 26 || i7 == 27) ? ijf0.c : ijf0.f14871a);
                return lottieAnimationView;
            case 5:
                int i8 = DsLottieEmpty.t;
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setId(jmu0.d());
                appCompatImageView.setTag("DsLottieEmpty.IconViewTag");
                appCompatImageView.setVisibility(8);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary60, context)));
                appCompatImageView.setImageResource(R.drawable.ic_glyph_circle_favourite);
                return appCompatImageView;
            case 6:
                int i9 = DsLottieEmpty.t;
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                appCompatTextView2.setId(jmu0.d());
                appCompatTextView2.setTag("DsLottieEmpty.TitleViewTag");
                appCompatTextView2.setVisibility(8);
                appCompatTextView2.setTextAlignment(4);
                cem0.n(R.style.TextStyle_Title_Medium_S_TextPrimary, appCompatTextView2);
                return appCompatTextView2;
            case 7:
                int i10 = DsLottieEmpty.t;
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
                appCompatTextView3.setId(jmu0.d());
                appCompatTextView3.setTag("DsLottieEmpty.SubtitleViewTag");
                appCompatTextView3.setVisibility(8);
                appCompatTextView3.setTextAlignment(4);
                cem0.n(R.style.TextStyle_Headline_Regular_Secondary, appCompatTextView3);
                return appCompatTextView3;
            case 8:
                int i11 = DsLottieEmpty.t;
                DsButton dsButton = new DsButton(context, attributeSet, i, i2);
                dsButton.setId(jmu0.d());
                dsButton.setTag("DsLottieEmpty.DsButtonTag");
                dsButton.setVisibility(8);
                return dsButton;
            case 9:
                int i12 = DsLottieEmpty.t;
                AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
                appCompatTextView4.setId(jmu0.d());
                appCompatTextView4.setTag("DsLottieEmpty.DsButtonTag");
                appCompatTextView4.setVisibility(8);
                appCompatTextView4.setTextAlignment(4);
                cem0.n(R.style.TextStyle_Text_Regular_Secondary, appCompatTextView4);
                return appCompatTextView4;
            case 10:
                int i13 = DsMenuCell.g1;
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.ic_glyph_sand_clock);
                imageView.setColorFilter(m5d.b(R.attr.uikitSecondary20, context));
                return imageView;
            case 11:
                int i14 = DsSportCell.l;
                DsSeparator dsSeparator = new DsSeparator(new ContextThemeWrapper(context, R.style.Widget_DSSeparator_Separator60), null, 6, 0);
                dsSeparator.setVisibility(8);
                return dsSeparator;
            case 12:
                int i15 = EnteringPinCode.u;
                return Integer.valueOf(m5d.b(R.attr.uikitSecondary40, context));
            case 13:
                int i16 = EnteringPinCode.u;
                return Integer.valueOf(m5d.b(R.attr.uikitPrimary, context));
            case 14:
                Bitmap bitmap = ErasableView.y;
                return Integer.valueOf((int) context.getResources().getDimension(R.dimen.space_4));
            case 15:
                int i17 = EventCardHeader.A;
                TextView textView = new TextView(new tje(context, R.style.TextStyle_Caption_Bold_S));
                textView.setTextColor(context.getColor(R.color.static_white));
                textView.setGravity(17);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                textView.setId(View.generateViewId());
                textView.setTextSize(8.0f);
                textView.setBackground(context.getDrawable(R.drawable.event_card_header_soon_bg));
                return textView;
            case 16:
                int i18 = EventCardMiddleCricket.s;
                return AnimationUtils.loadAnimation(context, R.anim.game_indicator_rotate_animation);
            case 17:
                int i19 = EventCardMiddleFighting.w;
                return wvb.R(R.drawable.ic_glyph_cyber_fighting_b, context);
            case 18:
                int i20 = EventCardMiddleFighting.w;
                return wvb.R(R.drawable.ic_glyph_cyber_fighting_f, context);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i21 = EventCardMiddleFighting.w;
                return wvb.R(R.drawable.ic_glyph_cyber_fighting_fs, context);
            case 20:
                int i22 = EventCardMiddleFighting.w;
                return wvb.R(R.drawable.ic_glyph_cyber_fighting_ko, context);
            case 21:
                int i23 = EventCardMiddleFighting.w;
                return wvb.R(R.drawable.ic_glyph_cyber_fighting_r, context);
            case 22:
                int i24 = FinBetChartView.Y1;
                Paint paint = new Paint(1);
                TypedValue typedValue = j5d.f15927a;
                paint.setColor(j5d.a(context, R.attr.uikitSeparator, false));
                return paint;
            case 23:
                int i25 = FinBetChartView.Y1;
                Paint paint2 = new Paint(1);
                paint2.setColor(sj3.P(R.color.static_black_20, context));
                return paint2;
            case 24:
                int i26 = FinBetChartView.Y1;
                TextPaint textPaint = new TextPaint(1);
                TypedValue typedValue2 = j5d.f15927a;
                textPaint.setColor(j5d.a(context, R.attr.uikitSecondary, false));
                textPaint.setTextSize((int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * 10.0f));
                return textPaint;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i27 = FinBetChartView.Y1;
                context.getClass();
                return Float.valueOf((int) Math.ceil(context.getResources().getDisplayMetrics().density * 16.0f));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i28 = FinBetView.m1;
                String string = context.getString(R.string.finance_bet_stop_bets);
                string.getClass();
                String upperCase = string.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i29 = FinBetView.m1;
                Paint paint3 = new Paint(1);
                TypedValue typedValue3 = j5d.f15927a;
                paint3.setColor(j5d.a(context, R.attr.uikitPrimary, false));
                paint3.setStyle(Paint.Style.FILL);
                paint3.setStrokeWidth(5.0f);
                return paint3;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i30 = FinBetView.m1;
                TextPaint textPaint2 = new TextPaint(1);
                TypedValue typedValue4 = j5d.f15927a;
                textPaint2.setColor(j5d.a(context, R.attr.uikitTextPrimary, false));
                float f = context.getResources().getBoolean(R.bool.isTablet) ? 16.0f : 12.0f;
                textPaint2.setTextSize(f != 0.0f ? (int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * f) : 0);
                return textPaint2;
            default:
                int i31 = FinBetView.m1;
                TextPaint textPaint3 = new TextPaint(1);
                textPaint3.setColor(-1);
                context.getClass();
                textPaint3.setTextSize((int) Math.ceil(context.getResources().getDisplayMetrics().scaledDensity * 10.0f));
                return textPaint3;
        }
    }
}
