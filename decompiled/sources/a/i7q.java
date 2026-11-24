package a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetView;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.ui_core.viewcomponents.views.RadialProgressView;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i7q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14304a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i7q(Context context, byte b) {
        this.f14304a = b;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        Window window;
        Window window2;
        byte b = this.f14304a;
        Context context = this.b;
        switch (b) {
            case 0:
                int i = FinBetView.m1;
                return Integer.valueOf(ViewConfiguration.get(context).getScaledTouchSlop());
            case 1:
                File fileP = slb.P(context, "firebaseSessions/sessionConfigsDataStore.data");
                m2a.u(fileP);
                return fileP;
            case 2:
                File fileP2 = slb.P(context, "firebaseSessions/sessionDataStore.data");
                m2a.u(fileP2);
                return fileP2;
            case 3:
                int i2 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_pause, context);
            case 4:
                int i3 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_play, context);
            case 5:
                int i4 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_to_window, context);
            case 6:
                int i5 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_from_window, context);
            case 7:
                int i6 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_to_fullscreen, context);
            case 8:
                int i7 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_from_fullscreen, context);
            case 9:
                int i8 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_stop, context);
            case 10:
                int i9 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_zone_2d, context);
            case 11:
                int i10 = GameBroadcastingControlPanelView.A;
                return epv0.U(R.drawable.ic_broadcasting_zone_3d, context);
            case 12:
                bek bekVar = kit.Q1;
                Activity activityS = j120.S(context);
                if (activityS != null && (window = activityS.getWindow()) != null) {
                    window.setSoftInputMode(32);
                }
                return Unit.f46060a;
            case 13:
                bek bekVar2 = kit.Q1;
                Activity activityS2 = j120.S(context);
                if (activityS2 != null && (window2 = activityS2.getWindow()) != null) {
                    window2.setSoftInputMode(a8k0.A() ? 16 : 48);
                }
                return Unit.f46060a;
            case 14:
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L_TextPrimary);
                return textPaint;
            case 15:
                Paint paint = new Paint();
                TypedValue typedValue = j5d.f15927a;
                paint.setColor(context.getColor(R.color.static_black));
                paint.setStyle(Paint.Style.STROKE);
                paint.setAntiAlias(true);
                paint.setStrokeWidth(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
                return paint;
            case 16:
                int i11 = LineChartView.k1;
                return new nwb(context);
            case 17:
                int i12 = LineChartView.k1;
                Paint paint2 = new Paint();
                TypedValue typedValue2 = j5d.f15927a;
                paint2.setColor(j5d.a(context, R.attr.uikitPrimary, false));
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setAntiAlias(true);
                paint2.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
                return paint2;
            case 18:
                Paint paint3 = new Paint();
                TypedValue typedValue3 = j5d.f15927a;
                paint3.setColor(context.getColor(R.color.static_white));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setAntiAlias(true);
                paint3.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
                return paint3;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                TextView textView = new TextView(context);
                textView.setId(jmu0.d());
                textView.setTag("alertTitle");
                cem0.n(R.style.TextStyle_Title_Medium_M_Primary, textView);
                textView.setTextAlignment(4);
                return textView;
            case 20:
                TextView textView2 = new TextView(context);
                textView2.setId(jmu0.d());
                textView2.setTag("alertMessage");
                textView2.setTextAlignment(4);
                cem0.n(R.style.TextStyle_Headline_Regular_TextPrimary, textView2);
                return textView2;
            case 21:
                DsCheckbox dsCheckbox = new DsCheckbox(context, null, 6);
                dsCheckbox.setId(jmu0.d());
                dsCheckbox.setTag(Integer.valueOf(R.id.checker));
                return dsCheckbox;
            case 22:
                TextView textView3 = new TextView(context);
                textView3.setId(jmu0.d());
                textView3.setTag("alertCheckboxMessage");
                cem0.n(R.style.TextStyle_Headline_Regular_TextPrimary, textView3);
                return textView3;
            case 23:
                TextView textView4 = new TextView(context);
                textView4.setId(jmu0.d());
                textView4.setTag("middleButton");
                cem0.n(R.style.TextStyle_Headline_Medium_Primary, textView4);
                textView4.setTextAlignment(4);
                textView4.setMaxLines(2);
                textView4.setEllipsize(TextUtils.TruncateAt.END);
                return textView4;
            case 24:
                TextView textView5 = new TextView(context);
                textView5.setId(jmu0.d());
                textView5.setTag("bottomButton");
                cem0.n(R.style.TextStyle_Headline_Medium_Primary, textView5);
                textView5.setTextAlignment(4);
                textView5.setMaxLines(2);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                return textView5;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                View view = new View(context);
                view.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return view;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                View view2 = new View(context);
                view2.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return view2;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                View view3 = new View(context);
                view3.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context));
                return view3;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i13 = RadialProgressView.m;
                Paint paint4 = new Paint(1);
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setStrokeCap(Paint.Cap.ROUND);
                paint4.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.space_4));
                paint4.setColor(-1);
                return paint4;
            default:
                int i14 = RadialProgressView.m;
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.fifty));
        }
    }
}
