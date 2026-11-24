package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lud extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lud f20669a = new lud(1, fzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentConfirmByAuthenticatorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.clActivationContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.clActivationContainer);
            if (constraintLayout != null) {
                i = R.id.clPushEnableMessage;
                if (((ConstraintLayout) yum0.f(view, R.id.clPushEnableMessage)) != null) {
                    i = R.id.errorView;
                    DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.errorView);
                    if (dSLottieEmptyContainer != null) {
                        i = R.id.ivInfo;
                        if (((ImageView) yum0.f(view, R.id.ivInfo)) != null) {
                            i = R.id.navigationBar;
                            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                            if (dsNavigationBarBasic != null) {
                                i = R.id.progress;
                                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) yum0.f(view, R.id.progress);
                                if (contentLoadingProgressBar != null) {
                                    i = R.id.tagAutofill;
                                    DsTag dsTag = (DsTag) yum0.f(view, R.id.tagAutofill);
                                    if (dsTag != null) {
                                        i = R.id.tfSmsCode;
                                        DsTextField dsTextField = (DsTextField) yum0.f(view, R.id.tfSmsCode);
                                        if (dsTextField != null) {
                                            i = R.id.tvMessage;
                                            if (((MaterialTextView) yum0.f(view, R.id.tvMessage)) != null) {
                                                i = R.id.tvResendSms;
                                                MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.tvResendSms);
                                                if (materialTextView != null) {
                                                    i = R.id.tvTitle;
                                                    if (((TextView) yum0.f(view, R.id.tvTitle)) != null) {
                                                        return new fzq((ConstraintLayout) view, dsBottomBar, constraintLayout, dSLottieEmptyContainer, dsNavigationBarBasic, contentLoadingProgressBar, dsTag, dsTextField, materialTextView);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
