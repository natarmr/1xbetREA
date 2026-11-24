package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.presentation.bet_settings.ChipView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y2t extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2t f41921a = new y2t(1, yjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/core/databinding/DialogXgamesBetSettingsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_xgames_bet_settings, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.max_bet_value;
        AppCompatEditText appCompatEditText = (AppCompatEditText) yum0.f(viewInflate, R.id.max_bet_value);
        if (appCompatEditText != null) {
            i = R.id.mid_bet_value;
            AppCompatEditText appCompatEditText2 = (AppCompatEditText) yum0.f(viewInflate, R.id.mid_bet_value);
            if (appCompatEditText2 != null) {
                i = R.id.small_bet_value;
                AppCompatEditText appCompatEditText3 = (AppCompatEditText) yum0.f(viewInflate, R.id.small_bet_value);
                if (appCompatEditText3 != null) {
                    i = R.id.spin_10;
                    ChipView chipView = (ChipView) yum0.f(viewInflate, R.id.spin_10);
                    if (chipView != null) {
                        i = R.id.spin_25;
                        ChipView chipView2 = (ChipView) yum0.f(viewInflate, R.id.spin_25);
                        if (chipView2 != null) {
                            i = R.id.spin_5;
                            ChipView chipView3 = (ChipView) yum0.f(viewInflate, R.id.spin_5);
                            if (chipView3 != null) {
                                i = R.id.spin_50;
                                ChipView chipView4 = (ChipView) yum0.f(viewInflate, R.id.spin_50);
                                if (chipView4 != null) {
                                    i = R.id.spin_endless;
                                    ChipView chipView5 = (ChipView) yum0.f(viewInflate, R.id.spin_endless);
                                    if (chipView5 != null) {
                                        i = R.id.xgames_auto_spin_comment;
                                        if (((TextView) yum0.f(viewInflate, R.id.xgames_auto_spin_comment)) != null) {
                                            i = R.id.xgames_auto_spin_settings_layout;
                                            LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewInflate, R.id.xgames_auto_spin_settings_layout);
                                            if (linearLayout2 != null) {
                                                i = R.id.xgames_auto_spin_subtitle;
                                                if (((TextView) yum0.f(viewInflate, R.id.xgames_auto_spin_subtitle)) != null) {
                                                    i = R.id.xgames_current_limits;
                                                    TextView textView = (TextView) yum0.f(viewInflate, R.id.xgames_current_limits);
                                                    if (textView != null) {
                                                        i = R.id.xgames_quick_bet_subtitle;
                                                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.xgames_quick_bet_subtitle);
                                                        if (textView2 != null) {
                                                            return new yjk(linearLayout, appCompatEditText, appCompatEditText2, appCompatEditText3, chipView, chipView2, chipView3, chipView4, chipView5, linearLayout2, textView, textView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
