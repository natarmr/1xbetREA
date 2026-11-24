package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ggn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ggn0 f11259a = new ggn0(1, cgn0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/uikit/databinding/SuccessBetAlertBottomSheetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.success_bet_alert_bottom_sheet, (ViewGroup) null, false);
        int i = R.id.continueB;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.continueB);
        if (dsButton != null) {
            i = R.id.historyB;
            DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.historyB);
            if (dsButton2 != null) {
                i = R.id.iconIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.iconIv);
                if (appCompatImageView != null) {
                    i = R.id.iconStyleContainer;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.iconStyleContainer);
                    if (frameLayout != null) {
                        i = R.id.lottieAv;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) yum0.f(viewInflate, R.id.lottieAv);
                        if (lottieAnimationView != null) {
                            i = R.id.successBetInfoView;
                            FrameLayout frameLayout2 = (FrameLayout) yum0.f(viewInflate, R.id.successBetInfoView);
                            if (frameLayout2 != null) {
                                i = R.id.titleTv;
                                DsPresetTitle dsPresetTitle = (DsPresetTitle) yum0.f(viewInflate, R.id.titleTv);
                                if (dsPresetTitle != null) {
                                    i = R.id.topSpace;
                                    if (((Space) yum0.f(viewInflate, R.id.topSpace)) != null) {
                                        i = R.id.tvSubTitle;
                                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvSubTitle);
                                        if (textView != null) {
                                            return new cgn0((ConstraintLayout) viewInflate, dsButton, dsButton2, appCompatImageView, frameLayout, lottieAnimationView, frameLayout2, dsPresetTitle, textView);
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
